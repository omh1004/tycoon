package com.mh.myboot.model.dao;



import com.mh.myboot.model.dto.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MemberDao {
//    Member findMemberById(SqlSession session, String id);
//
//    int saveMember(SqlSession session, Member member);

    List<Member> findMemberAll(SqlSession session);
}
