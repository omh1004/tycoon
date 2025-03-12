package com.mh.myboot.controller;


import com.mh.myboot.model.dto.Member;
import com.mh.myboot.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

//@AllArgsConstructor
//final로 선언된 필드를 매개변수로 선언하는 생성자
@RequiredArgsConstructor
@Controller
@Slf4j//필드에 log변수를 추가
public class MemberController {

    //private final Logger logger= LoggerFactory.getLogger(MemberController.class);


    private final MemberService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("member/members")
    public String memberlist(Model model){
        List<Member> members=service.selectMember();

        model.addAttribute("members",members);
        return "member/memberlist";
    }
//
//    @RequestMapping("/logout.do")
//    public String logout(SessionStatus status){
//        if(!status.isComplete()){
//            status.setComplete();//session삭제하는 메소드
//        }
//        return "redirect:/";
//    }
//    // /member/enrollmember.do -> /WEB-INF/views/member/enrollmember.jsp
////    @GetMapping("/enrollmember.do")
////    public String enrollMemberPage(){
////        return "member/enrollMember";
////    }
//    @GetMapping("/enrollmember.do")
//    public void enrollmember(@ModelAttribute("member") Member m){
//        //logger.debug("회원가입화면 이동");
//        log.debug("회원가입화면 이동");
//        int age=190;
//        //logger.debug("회원 : {} 나이 : {}",m,age);
//        log.debug("회원 : {} 나이 : {}",m,age);
//    }
//
//    @PostMapping("/enrollmemberend.do")
//    public String enrollMemberEnd(Member inputMember,Model model){
//        //BCryptPasswordEncoder를 이용해서 비밀번호 암호화하기
//        String encPw=encoder.encode(inputMember.getPassword());
//        System.out.println(encPw);
//        inputMember.setPassword(encPw);
//        int result=service.saveMember(inputMember);
//        String msg,loc,viewName="common/msg";
//        if(result>0){
////            msg="회원가입성공";
////            loc="/";
//            viewName="redirect:/";
//        }else{
//            msg="회원가입실패";
//            loc="/member/enrollmember.do";
//            model.addAttribute("msg",msg);
//            model.addAttribute("loc",loc);
//        }
//        return viewName;
//    }



}
