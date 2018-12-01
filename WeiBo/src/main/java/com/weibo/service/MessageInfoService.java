package com.weibo.service;

import com.weibo.entity.MessageInfo;

import java.util.List;

public interface MessageInfoService {
    public MessageInfo findMessageInfoById(Long id);
    public MessageInfo findMessageInfoBySendId(String sendId );
    public MessageInfo findMessageInfoByReceiveId(String receiveId);
    public List<MessageInfo> findMessageInfoAll();

    public MessageInfo saveMessageInfo(MessageInfo messageInfo);

    public Boolean deleteMessageInfoById(Long id);
    public Boolean deleteMessageInfoBySendId(String sendId );
    public Boolean deleteMessageInfoByReceiveId(String receiveId);
    public MessageInfo editMessageInfo(MessageInfo messageInfo);


}
