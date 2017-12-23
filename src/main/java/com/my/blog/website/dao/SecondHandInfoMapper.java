package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.SecondHandInfo;
import com.my.blog.website.model.Vo.SecondHandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondHandInfoMapper {
    int countByExample(SecondHandInfoExample example);

    int deleteByExample(SecondHandInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecondHandInfo record);

    int insertSelective(SecondHandInfo record);

    List<SecondHandInfo> selectByExample(SecondHandInfoExample example);

    SecondHandInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecondHandInfo record, @Param("example") SecondHandInfoExample example);

    int updateByExample(@Param("record") SecondHandInfo record, @Param("example") SecondHandInfoExample example);

    int updateByPrimaryKeySelective(SecondHandInfo record);

    int updateByPrimaryKey(SecondHandInfo record);
}