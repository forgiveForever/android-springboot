package com.weibo.dao;

import com.weibo.entity.MessageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "messageInfoDao")
public interface MessageInfoDao {

    public MessageInfo findMessageInfoById(@Param("id")Long id);
    public MessageInfo findMessageInfoBySendId(@Param("sendId")String sendId );
    public MessageInfo findMessageInfoByReceiveId(@Param("receiveId")String receiveId);
    public List<MessageInfo> findMessagaeInfoAll();

    public MessageInfo saveMessageInfo(MessageInfo messageInfo);

    public Boolean deleteMessageInfoById(@Param("id")Long id);
    public Boolean deleteMessageInfoBySendId(@Param("sendId")String sendId );
    public Boolean deleteMessageInfoByReceiveId(@Param("receiveId")String receiveId);
    public MessageInfo editMessageInfo(MessageInfo messageInfo);
}
