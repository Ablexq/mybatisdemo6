package com.example.demo.dao.db1;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Book1Dao {
    @Select("select * from book where price = #{price}")
    @Results({
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "price", column = "price", javaType = Double.class)
    })
    List<Book> getAll(double price);
}
