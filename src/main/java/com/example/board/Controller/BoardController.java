package com.example.board.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borad/")
public class BoardController {

    @GetMapping("/test")
    public String hello(){
        return "/board/";
    }
}
