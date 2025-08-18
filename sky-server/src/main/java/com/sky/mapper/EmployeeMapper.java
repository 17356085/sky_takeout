package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    @Insert("insert into employee (username, name, password, phone, sex, id_number, create_time, update_time, create_user, update_user, status) " +
            "values" +
            "(#{username}, #{name}, #{password}, #{phone}, #{sex}, #{idNumber}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser}, #{status})")
    void save(Employee employee);

    /**
     * 启用或禁用员工账号
     * @param status 状态
     * @param id 员工ID
     */
    void update(Employee employee);

    /**
     * 根据ID查询员工信息
     * @param id 员工ID
     * @return
     */
    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}
