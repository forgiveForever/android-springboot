package com.weibo.service.Impl;

import com.weibo.entity.MessageInfo;
import com.weibo.service.MessageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageInfoServiceBean implements MessageInfoService {
    @Autowired private MessageInfoService messageInfoService;

    @Override
    public MessageInfo findMessageInfoById(Long id) {
        return messageInfoService.findMessageInfoById(id);
    }

    @Override
    public MessageInfo findMessageInfoBySendId(String sendId) {
        return messageInfoService.findMessageInfoBySendId(sendId);
    }

    @Override
    public MessageInfo findMessageInfoByReceiveId(String receiveId) {
        return messageInfoService.findMessageInfoByReceiveId(receiveId);
    }

    @Override
    public List<MessageInfo> findMessageInfoAll() {
        return messageInfoService.findMessageInfoAll();
    }

    @Override
    public MessageInfo saveMessageInfo(MessageInfo messageInfo) {
        return messageInfoService.saveMessageInfo(messageInfo);
    }

    @Override
    public Boolean deleteMessageInfoById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteMessageInfoBySendId(String sendId) {
        return null;
    }

    @Override
    public Boolean deleteMessageInfoByReceiveId(String receiveId) {
        return null;
    }

    @Override
    public MessageInfo editMessageInfo(MessageInfo messageInfo) {
        return null;
    }
}
