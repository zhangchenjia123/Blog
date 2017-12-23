package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.SecondHandType;
import com.my.blog.website.model.Vo.SecondHandTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondHandTypeMapper {
    int countByExample(SecondHandTypeExample example);

    int deleteByExample(SecondHandTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecondHandType record);

    int insertSelective(SecondHandType record);

    List<SecondHandType> selectByExample(SecondHandTypeExample example);

    SecondHandType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecondHandType record, @Param("example") SecondHandTypeExample example);

    int updateByExample(@Param("record") SecondHandType record, @Param("example") SecondHandTypeExample example);

    int updateByPrimaryKeySelective(SecondHandType record);

    int updateByPrimaryKey(SecondHandType record);
}