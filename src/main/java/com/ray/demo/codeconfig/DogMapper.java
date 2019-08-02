package com.ray.demo.codeconfig;

import org.apache.ibatis.annotations.Select;

import com.ray.demo.Dog;

public interface DogMapper {

    @Select("select * from dog where id = #{id}")
    public Dog selectDog(int i);

}
