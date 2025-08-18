package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 保存员工信息
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 启用或禁用员工账号
     * @param status 状态
     * @param id 员工ID
     */
    void startOrStop(int status, long id);

    /**
     * 根据ID查询员工信息
     * @param id 员工ID
     */
    Employee getById(Long id);

    /*
     * 修改员工信息
     */
    void update(EmployeeDTO employeeDTO);
}
