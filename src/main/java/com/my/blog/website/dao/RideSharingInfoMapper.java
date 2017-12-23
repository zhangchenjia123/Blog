package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.RideSharingInfo;
import com.my.blog.website.model.Vo.RideSharingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RideSharingInfoMapper {
    int countByExample(RideSharingInfoExample example);

    int deleteByExample(RideSharingInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RideSharingInfo record);

    int insertSelective(RideSharingInfo record);

    List<RideSharingInfo> selectByExample(RideSharingInfoExample example);

    RideSharingInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RideSharingInfo record, @Param("example") RideSharingInfoExample example);

    int updateByExample(@Param("record") RideSharingInfo record, @Param("example") RideSharingInfoExample example);

    int updateByPrimaryKeySelective(RideSharingInfo record);

    int updateByPrimaryKey(RideSharingInfo record);
}