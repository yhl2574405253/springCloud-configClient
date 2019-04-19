package cn.et.controller;

import cn.et.model.UserInfo;
import cn.et.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 添加
     * @param userInfo
     * @return
     */
    @RequestMapping("insert")
    public String insert(UserInfo userInfo){
        userInfoService.insert(userInfo);
        return "SUCCESS";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(String id){
        userInfoService.delete(id);
        return "SUCCESS";
    }

    /**
     * 修改
     * @param userInfo
     * @return
     */
    @RequestMapping("update")
    public String update(UserInfo userInfo){
        userInfoService.update(userInfo);
        return "SUCCESS";
    }

    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("getUserInfo")
    public List<UserInfo> getUserInfo(){
        return userInfoService.getUserInfo();
    }

    /**
     * 根据条件查询
     * @param userInfo
     * @return
     */
    @RequestMapping("getUserInfoQuery")
    public List<UserInfo> getUserInfoQuery(UserInfo userInfo){
        return userInfoService.getUserInfoQuery(userInfo);
    }

    /**
     * 根据id查询单个
     * @param id
     * @return
     */
    @RequestMapping("getUserInfoOne")
    public UserInfo getUserInfoOne(String id){
        return userInfoService.getUserInfoOne(id);
    }
}
