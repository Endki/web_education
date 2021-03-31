package com.edu.book.springboot.Controller;


import static org.hamcrest.Matchers.is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//테스트를 진행할때 SpringRunner라는 스프링 실행자를 사용 - JUnit과 Test사이의 연결자 역할
@RunWith(SpringRunner.class)

// 스프링 테스트 어노테이션 중 Web에 집중할수있는 어노테이션 - 선언할 경우 @Controller 사용 가능 but @Service @Conponet등 사용 불가
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    //Bean 주입
    @Autowired
    //Web Api 를 테스트할때 사용 Sprign MVC Test의 시작점
    private MockMvc mvc;


    @Test
    public  void hello가_리턴된다() throws Exception{
        String hello="hello";
        //MockMvc를 통해 /hello로 get요청
        mvc.perform(get("/hello"))
                //mvc.perform 의 결과를 검증 200인지 아닌지
                .andExpect(status().isOk())
                //return 값이 hello가 아닌지
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name="hello";
        int amount= 1000;
        mvc.perform(get("/hello/dto")
                .param("name",name)
                .param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));
    }

}
