package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.CommentsInfo;
import com.my.blog.website.model.Vo.CommentsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int countByExample(CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int deleteByExample(CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int insert(CommentsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int insertSelective(CommentsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    List<CommentsInfo> selectByExampleWithBLOBs(CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    List<CommentsInfo> selectByExample(CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    CommentsInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") CommentsInfo record, @Param("example") CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CommentsInfo record, @Param("example") CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByExample(@Param("record") CommentsInfo record, @Param("example") CommentsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByPrimaryKeySelective(CommentsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CommentsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    int updateByPrimaryKey(CommentsInfo record);
}