package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Myuser;

@Mapper
public interface MyuserMapper {
	
	@Select("SELECT *FROM myuser")
	List<Myuser> findAll();
	
	@Insert("insert into myuser(id,username,password,sex,address) values(null,#{username},#{password},#{sex},#{address})")
	int register(@Param("username") String username 
			,@Param("password") String password ,@Param("sex") String sex,@Param("address") String address);
	
	@Select("Select *from myuser where username = #{username} and password = #{password}")
	Myuser login(@Param("username") String username,@Param("password") String password);
}
