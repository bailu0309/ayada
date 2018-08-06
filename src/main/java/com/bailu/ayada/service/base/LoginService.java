package com.bailu.ayada.service.base;

import com.bailu.ayada.constants.StringConstants;
import com.bailu.ayada.dao.base.UserDao;
import com.bailu.ayada.dao.repository.base.UserEty;
import com.bailu.ayada.utils.md.JavaMD5;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginService {

  /*  @Resource
    private UserDao userDao;


    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public JSONObject login(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        HttpSession session = request.getSession();

        String pwd = request.getParameter(StringConstants.PWD);
        String yzm = request.getParameter(StringConstants.YZM);
        String code = (String) session.getAttribute(StringConstants.CODE);
        session.setAttribute(StringConstants.SESSION_LOGIN_NAME, request.getParameter("userName"));
        Integer logincount = (Integer) session.getAttribute(StringConstants.SESSION_LOGIN_COUNT);
        if (null == logincount) {
            logincount = 1;
            session.setAttribute(StringConstants.SESSION_LOGIN_COUNT, logincount);
        } else {
            logincount = logincount + 1;
            session.setAttribute(StringConstants.SESSION_LOGIN_COUNT, logincount);
        }
        if (logincount > 2 && (StringUtils.isEmpty(yzm) || !code.toLowerCase().equals(yzm.toLowerCase()))) {
            obj.put(StringConstants.RESULT, StringConstants.FAIL);
            obj.put(StringConstants.INFO, "验证码错误！");
        } else {
            List<UserEty> list = userDao.selectUserByName(request.getParameter("userName"));
            if (list.size() == 1) {
                UserEty userEty = list.get(0);
                if (JavaMD5.getMD5ofStr(userEty.getPassword()).equals(pwd)) {
                    session.setAttribute(StringConstants.SESSION_LOGIN_NAME, userEty.getName());
                    session.setAttribute(StringConstants.USERID, userEty.getId());
                    session.setAttribute(StringConstants.SESSION_LOGIN_USERNAME, userEty.getUsername());
                    session.setAttribute(StringConstants.SESSION_LOGIN_DEPARTID, userEty.getDepid());
                    session.setAttribute(StringConstants.SESSION_LOGIN_DEPARTNAME, userEty.getDepname());
                    session.setAttribute(StringConstants.SESSION_LOGIN_STATUS, userEty.getStatus());
//                    String roleid = userDao.roleID(userEty.getId());
//                    session.setAttribute(StringConstants.SESSION_LOGIN_ROLE, roleid);
//                    session.setAttribute(StringConstants.SESSION_MAIN_USERID, userEty.getMuserid());
//                    session.setAttribute(StringConstants.SESSION_MAIN_USERNAME, userEty.getMusername());

                    if ("c4ca4238a0b923820dcc509a6f75849b".equals(pwd) && "1".equals(userEty.getStatus())) {
                        session.setAttribute("epwd", "1");
                    } else {
                        session.setAttribute("epwd", "0");
                    }

                    obj.put(StringConstants.SUCCESS, true);
                    obj.put(StringConstants.RESULT, StringConstants.SUCCESS);
                } else {
                    obj.put(StringConstants.RESULT, StringConstants.FAIL);
                    obj.put(StringConstants.INFO, "用户名或者密码错误！");
                }
            } else {
                obj.put(StringConstants.RESULT, StringConstants.FAIL);
                obj.put(StringConstants.INFO, "用户名或者密码错误！");
            }
        }
        return obj;
    }

    public JSONObject logout(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        obj.put("success", true);
        request.getSession().invalidate();
        obj.put("result", "success");
        return obj;
    }
*/

}
