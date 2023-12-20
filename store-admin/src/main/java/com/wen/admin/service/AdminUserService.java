package com.wen.admin.service;

import com.wen.admin.param.AdminUserParam;
import com.wen.admin.pojo.AdminUser;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
public interface AdminUserService {

    /**
     * 登录业务方法
     * @param adminUserParam
     * @return
     */
    AdminUser login(AdminUserParam adminUserParam);
}
