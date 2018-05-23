package com.web.action;


import com.opensymphony.xwork2.ActionSupport;
import com.service.implments.EmployeeService;

/**
 * Created by xiaowenyu on 2018/5/23.
 */
public class LoginAction extends ActionSupport{
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    
}
