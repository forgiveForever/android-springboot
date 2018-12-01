package com.weibo.service;

import com.weibo.entity.DynamicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicInfoService {
    public DynamicInfo findDynamicInfo(@Param("id") Long id);
    public List<DynamicInfo> findDynamicInfoAll();
    public DynamicInfo findDynamicByUserId(@Param("user_id")Long user_id);
    public DynamicInfo save(DynamicInfo dynamicInfo);

    public Long deleteDynamicInfo(@Param("id") Long id, @Param("user_id") Long user_id);
    public DynamicInfo editDynamicInfo(DynamicInfo dynamicInfo);

}
