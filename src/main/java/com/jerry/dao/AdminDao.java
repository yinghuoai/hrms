package com.jerry.dao;

import java.util.List;
import java.util.Map;



import com.jerry.domain.Admin;



public interface AdminDao {

    //登录

    public Admin login(Admin admin);

    //根据条件查询管理员

    public List<Admin> findAdmins(Map<String,Object> map);


    //添加管理员

    public Integer getCount(Map<String,Object> map);


    //修改管理员

    public Integer updateAdmin(Admin admin);

    //删除管理员

    public Integer deleteAdmin(Integer id);













}
