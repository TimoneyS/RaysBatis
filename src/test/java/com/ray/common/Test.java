package com.ray.common;

import org.apache.ibatis.jdbc.SQL;

public class Test {

    public static String deletePersonSql() {
        return new SQL() {
            {
                DELETE_FROM("PERSON");
                WHERE("ID = #{id}");
            }
        }.toString();
    }

    public static void main(String[] args) {

        System.out.println(deletePersonSql());
        
    }

}
