package com.example.demo;

import com.example.demo.dao.db1.Book1Dao;
//import com.example.demo.dao.db2.Book2Dao;
import com.example.demo.dao.db2.Book2Dao;
import com.example.demo.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    Book1Dao book1Dao;

    @Test
    public void test1() {
        List<Book> all = book1Dao.getAll(50D);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(i + "======" + all.get(i).toString());
        }
    }

    @Autowired
    Book2Dao book2Dao;

    @Test
    public void test2() {
        List<Book> all = book2Dao.getAll(50D);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(i + "======" + all.get(i).toString());
        }
    }

}

