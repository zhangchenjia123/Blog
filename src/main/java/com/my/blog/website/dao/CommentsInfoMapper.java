package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.CommentsInfo;
import com.my.blog.website.model.Vo.CommentsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsInfoMapper {
    int countByExample(CommentsInfoExample example);

    int deleteByExample(CommentsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentsInfo record);

    int insertSelective(CommentsInfo record);

    List<CommentsInfo> selectByExample(CommentsInfoExample example);

    CommentsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentsInfo record, @Param("example") CommentsInfoExample example);

    int updateByExample(@Param("record") CommentsInfo record, @Param("example") CommentsInfoExample example);

    int updateByPrimaryKeySelective(CommentsInfo record);

    int updateByPrimaryKey(CommentsInfo record);
}