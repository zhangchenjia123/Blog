package com.my.blog.website.service;

import com.my.blog.website.model.Vo.RideSharingInfo;

import java.util.List;

/**
 * Created by zhangchenjia on 2017/12/19 013.
 */
public interface IRideSharingInfoService {

    /**
     * 发布顺风车信息
     */
    void insertRideSharingInfo(RideSharingInfo rideSharingInfo);

    /**
     * 查询顺风车信息
     */
    List<RideSharingInfo> getRideSharingInfo(RideSharingInfo rideSharingInfo);


}
