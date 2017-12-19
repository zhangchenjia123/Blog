package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.NewsInfo;
import com.my.blog.website.model.Vo.NewsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int countByExample(NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int deleteByExample(NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int insert(NewsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int insertSelective(NewsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    List<NewsInfo> selectByExampleWithBLOBs(NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    List<NewsInfo> selectByExample(NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    NewsInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByExample(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByPrimaryKeySelective(NewsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(NewsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_info
     *
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
     */
    int updateByPrimaryKey(NewsInfo record);
}