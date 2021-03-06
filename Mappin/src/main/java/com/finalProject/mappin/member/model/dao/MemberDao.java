package com.finalProject.mappin.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.member.model.vo.Member;


@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberDao(){	}

	public Member selectMember(Member loginVo) {
		return (Member) sqlSession.selectOne("membermapper.logincheck", loginVo);
	}
}
