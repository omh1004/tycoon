package com.mh.myboot.model.service;


import com.mh.myboot.model.dto.Member;


import java.util.List;


public interface MemberService {
//    public Member selectMemberById(String id);
//    int saveMember(Member member);

    List<Member> selectMember();
}
