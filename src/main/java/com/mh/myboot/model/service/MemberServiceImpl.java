package com.mh.myboot.model.service;


import com.mh.myboot.model.dao.MemberDao;
import com.mh.myboot.model.dto.Member;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDao memberdao;
    private final SqlSession session;

//
//    @Override
//    public Member selectMemberById(String id) {
//  //      return repository.findMemberById(entityManager,id).toMember();
//        return memberdao.findMemberById(session,id);
//    }
//
//    @Override
//    public int saveMember(Member member) {
//
//        return memberdao.saveMember(session,member);
//    }

    @Override
    public List<Member> selectMember() {
        return memberdao.findMemberAll(session);
    }
}

