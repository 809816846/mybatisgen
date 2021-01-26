package com.kgc.dao;

import com.kgc.entity.BookUser;
import com.kgc.entity.BookUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookUserMapper {
    long countByExample(BookUserExample example);

    int deleteByExample(BookUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookUser record);

    int insertSelective(BookUser record);

    List<BookUser> selectByExample(BookUserExample example);

    BookUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookUser record, @Param("example") BookUserExample example);

    int updateByExample(@Param("record") BookUser record, @Param("example") BookUserExample example);

    int updateByPrimaryKeySelective(BookUser record);

    int updateByPrimaryKey(BookUser record);
}