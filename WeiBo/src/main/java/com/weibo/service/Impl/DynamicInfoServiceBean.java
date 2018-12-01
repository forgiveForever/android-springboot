package com.weibo.service.Impl;

import com.weibo.dao.DynamicInfoDao;
import com.weibo.entity.DynamicInfo;
import com.weibo.service.DynamicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DynamicInfoServiceBean implements DynamicInfoService {
    @Autowired private DynamicInfoDao dynamicInfoDao;
    @Override
    public DynamicInfo findDynamicInfo(Long id) {

        return dynamicInfoDao.findDynamicInfo(id);
    }

    @Override
    public List<DynamicInfo> findDynamicInfoAll() {
        return dynamicInfoDao.findDynamicInfoAll();
    }

    @Override
    public DynamicInfo findDynamicByUserId(Long user_id) {
        return dynamicInfoDao.findDynamicByUserId(user_id);
    }

    @Override
    public DynamicInfo save(DynamicInfo dynamicInfo) {
        return dynamicInfoDao.save(dynamicInfo);
    }

    @Override
    public Long deleteDynamicInfo(Long id, Long user_id) {
        return null;
    }

    @Override
    public DynamicInfo editDynamicInfo(DynamicInfo dynamicInfo) {
        return null;
    }
}
