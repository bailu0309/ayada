package com.bailu.ayada.dao.base;


import com.bailu.ayada.dao.repository.base.UserEty;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {


    List<UserEty> selectUserByName(String name);

}
