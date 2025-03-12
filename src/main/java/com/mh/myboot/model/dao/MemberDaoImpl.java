package com.mh.myboot.model.dao;

import com.mh.myboot.model.dto.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository(value = "memberdao")
@Repository
public class MemberDaoImpl implements MemberDao {
//
//    @Override
//    public Member findMemberById(SqlSession session, String id) {
//        Member member = session.selectOne("member.findMemberById", id);
//        return member;
//    }
//
//
//
//    @Override
//    public int saveMember(SqlSession session, Member member) {
//
//        return session.insert("member.saveMember", member);
//    }

    @Override
    public List<Member> findMemberAll(SqlSession session) {
        return session.selectList("member.findMemberAll");
    }
}
