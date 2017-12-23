package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.NewsInfo;
import com.my.blog.website.model.Vo.NewsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsInfoMapper {
    int countByExample(NewsInfoExample example);

    int deleteByExample(NewsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NewsInfo record);

    int insertSelective(NewsInfo record);

    List<NewsInfo> selectByExample(NewsInfoExample example);

    NewsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    int updateByExample(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    int updateByPrimaryKeySelective(NewsInfo record);

    int updateByPrimaryKey(NewsInfo record);
}