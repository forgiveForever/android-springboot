package com.weibo.dao;

import com.weibo.entity.DynamicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.servlet.Registration;
import java.util.List;

@Mapper
@Component(value = "dynamicInfoDao")
public interface DynamicInfoDao {
    public DynamicInfo findDynamicInfo(@Param("id") Long id);
    public List<DynamicInfo> findDynamicInfoAll();
    public DynamicInfo findDynamicByUserId(@Param("user_id")Long user_id);
    public DynamicInfo save(DynamicInfo dynamicInfo);

    public Long deleteDynamicInfo(@Param("id") Long id, @Param("user_id") Long user_id);
    public DynamicInfo editDynamicInfo(DynamicInfo dynamicInfo);


}
