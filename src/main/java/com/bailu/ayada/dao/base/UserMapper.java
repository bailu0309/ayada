package com.bailu.ayada.dao.base;

import com.bailu.ayada.dao.repository.base.UserEty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author mabailu
 * @Date 2018/8/6 17:28
 * @Description
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM M_USER WHERE name = 'admin'")
    UserEty findUser();


    @Select("SELECT * FROM M_USER")
    List<UserEty> findAll();
}