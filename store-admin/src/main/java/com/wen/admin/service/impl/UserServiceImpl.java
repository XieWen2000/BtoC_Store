package com.wen.admin.service.impl;

import com.wen.admin.service.UserService;
import com.wen.clients.UserClient;
import com.wen.param.CartListParam;
import com.wen.param.PageParam;
import com.wen.pojo.User;
import com.wen.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 用户业务实现类
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserClient userClient;

    /**
     * 用户的展示业务方法
     * @param pageParam
     * @return
     */
    @Cacheable(value = "list.user", key = "#pageParam.currentPage+'-'+#pageParam.pageSize")
    @Override
    public R userList(PageParam pageParam) {
        log.info("UserServiceImpl.userList业务开始，参数:{}",pageParam);
        R r = userClient.adminListPage(pageParam);
        log.info("UserServiceImpl.userList业务结束，结果:{}",r);
        return r;
    }


    /**
     * 删除用户数据
     *
     * @param param
     * @return
     */
    @CacheEvict(value = "list.user",allEntries = true)
    @Override
    public R userRemove(CartListParam param) {
        R r = userClient.adminRemove(param);
        log.info("UserServiceImpl.userRemove业务结束，结果:{}",r);
        return r;
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @CacheEvict(value = "list.user",allEntries = true)
    @Override
    public R userUpdate(User user) {

        R r = userClient.adminUpdate(user);
        log.info("UserServiceImpl.userUpdate业务结束，结果:{}",r);
        return r;
    }

    /**
     * 添加用户信息
     *
     * @param user
     * @return
     */
    @CacheEvict(value = "list.user",allEntries = true)
    @Override
    public R save(User user) {
        R r = userClient.adminSave(user);
        log.info("UserServiceImpl.save业务结束，结果:{}",r);
        return r;
    }
}
