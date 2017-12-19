package com.my.blog.website.service.impl;

import com.my.blog.website.dao.RideSharingInfoMapper;
import com.my.blog.website.model.Vo.RideSharingInfo;
import com.my.blog.website.model.Vo.RideSharingInfoExample;
import com.my.blog.website.service.IContentService;
import com.my.blog.website.service.IRelationshipService;
import com.my.blog.website.service.IRideSharingInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangchenjia on 2017/12/19.
 */
@Service
public class RideSharingInfoImpl implements IRideSharingInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RideSharingInfoImpl.class);

    @Resource
    private RideSharingInfoMapper rideSharingInfoMapper;

    @Resource
    private IRelationshipService relationshipService;

    @Resource
    private IContentService contentService;

    @Override
    public void insertRideSharingInfo(RideSharingInfo rideSharingInfo) {
        rideSharingInfoMapper.insertSelective(rideSharingInfo);
    }

    @Override
    public List<RideSharingInfo> getRideSharingInfo(RideSharingInfo rideSharingInfo) {
        RideSharingInfoExample example = new RideSharingInfoExample();
        RideSharingInfoExample.Criteria criteria= example.createCriteria();

        if(rideSharingInfo.getType() != null)
            criteria.andTypeEqualTo(rideSharingInfo.getType());
        if(rideSharingInfo.getTittle() != null)
            criteria.andTittleEqualTo(rideSharingInfo.getTittle());
        if(rideSharingInfo.getPhoneNumber() != null)
            criteria.andPhoneNumberEqualTo(rideSharingInfo.getPhoneNumber());
        if(rideSharingInfo.getDesc() != null)
            criteria.andDescEqualTo(rideSharingInfo.getDesc());
        if(rideSharingInfo.getStatus() != null)
            criteria.andStatusEqualTo(rideSharingInfo.getStatus());
        return rideSharingInfoMapper.selectByExample(example);
    }

}
