package com.xingchen.springbootjpathymeleaf.controller;

import com.xingchen.springbootjpathymeleaf.model.User;
import com.xingchen.springbootjpathymeleaf.param.UserParam;
import com.xingchen.springbootjpathymeleaf.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/add")
    public String add(@Valid UserParam userParam, BindingResult result, Model model) {
        String errorMsg="";
        // 参数校验
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                errorMsg=errorMsg + error.getCode() + "-" + error.getDefaultMessage() +";";
            }
            model.addAttribute("errorMsg",errorMsg);
            return "user/userAdd";
        }
        //判断是否重复添加
        User u= userRepository.findByUserName(userParam.getUserName());
        if(u!=null){
            model.addAttribute("errorMsg","用户已存在!");
            return "user/userAdd";
        }
        User user=new User();
        BeanUtils.copyProperties(userParam,user);
        user.setRegTime(new Date());
        //保存
        userRepository.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page,
                       @RequestParam(value = "size", defaultValue = "6") Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<User> users=userRepository.findList(pageable);
        model.addAttribute("users", users);
        return "user/list";
    }
}
