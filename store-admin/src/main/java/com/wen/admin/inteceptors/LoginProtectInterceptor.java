package com.wen.admin.inteceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 登录保护拦截器
 */
@Component
public class LoginProtectInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object userInfo = request.getSession().getAttribute("userInfo");

        if (userInfo != null) {
            //放行, 他已经登录
            return true;
        }else{
            response.sendRedirect(request.getContextPath()+"/index.html");
            return false;
        }
        // false 拦截  | true 放行

    }
}
