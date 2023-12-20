package com.wen.admin.service;

import com.wen.param.CartListParam;
import com.wen.param.PageParam;
import com.wen.pojo.User;
import com.wen.utils.R;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
public interface UserService {

    /**
     * 用户的展示业务方法
     * @param pageParam
     * @return
     */
    R userList(PageParam pageParam);

    /**
     * 删除用户数据
     * @param cartListParam
     * @return
     */
    R userRemove(CartListParam cartListParam);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    R userUpdate(User user);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    R save(User user);
}
