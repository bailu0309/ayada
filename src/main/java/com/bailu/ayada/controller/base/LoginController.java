package com.bailu.ayada.controller.base;

import com.bailu.ayada.dao.base.UserMapper;
import com.bailu.ayada.dao.repository.base.UserEty;
import com.bailu.ayada.service.base.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 单点登录控制
 *
 * @author User
 */
@Controller
@RequestMapping("/basic/LoginController/")
public class LoginController {


    @Autowired
    private LoginService loginService;


    @Autowired
    private UserMapper userMapper;


    @RequestMapping("login.sdo")
    public
    @ResponseBody
    String login(HttpServletRequest request, HttpServletResponse response, UserEty user) throws Exception {
//        JSONObject obj = loginService.login(request);
//        return obj.toString();
        UserEty userEty = userMapper.findUser();

        List<UserEty> all = userMapper.findAll();
        return "";
    }


}
