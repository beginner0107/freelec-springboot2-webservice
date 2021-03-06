package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// 컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어 줍니다.
// 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다
@RestController
public class HelloController {
    @GetMapping(value="/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value="/hello/dto")
    // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
