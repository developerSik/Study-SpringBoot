package com.example.controller.controller;

import com.example.controller.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {
    @GetMapping("ex01")
    public void ex01(){
        log.info("ex01.................");
    }

    @GetMapping("ex02")
    public void ex02(@ModelAttribute("name") String name){
        log.info("ex02................. name: {}", name);
    }

    @GetMapping("ex03")
    public void ex03(@RequestParam("name") String data){
        log.info("ex03................. data: {}", data);
    }

    @GetMapping("ex04")
    public void ex04(String name, int age, Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        log.info("ex04................. name: {}, age: {}", name, age);
    }

    @GetMapping("ex05")
    public void ex05(MemberVO memberVO){
        log.info("ex05.................");
        log.info(memberVO.toString());
    }

    @GetMapping("ex06")
    public void ex06(MemberVO memberVO, String gender){
        log.info("ex06.................");
        log.info(memberVO.toString());
        log.info(gender);
    }

    @GetMapping("ex07")
    public void ex07(@RequestParam("data") List<String> datas){
        log.info("ex07.................");
        log.info(datas.toString());
    }

//    [실습 1]
//    외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
//    화면에서 4개 정보 입력 후 form태그로 전송한다.

//    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math 선언
//    총점과 평균 점수 화면에 출력

//    [실습 3]
//    아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동
//    아이디가 user일 경우 user.html로 이동

//    - login.html : 아이디와 비밀번호 입력 페이지 출력
//    - admin.html : 관리자 페이지 출력
//    - user.html : 일반 회원 페이지 출력

//    [실습 4]
//    이름을 입력하고 출근 또는 퇴근 버튼을 클릭한다.
//    출근 시간은 09:00이며, 퇴근 시간은 17:00이다.
//    출근 버튼 클릭 시 9시가 넘으면 지각으로 처리하고,
//    퇴근 버튼 클릭 시 17시 전이라면 퇴근 아닌 업무시간으로 처리한다.
//    - getToWork.html
//    - leaveWork.html
//    - late.html
//    - work.html

}












