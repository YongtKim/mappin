package com.finalProject.mappin.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.member.model.dao.MemberDao;
import com.finalProject.mappin.member.model.vo.Member;


@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;
	
	@Override
	public Member loginCheck(Member vo) {
		return memberDao.selectMember(vo);
	}
	
}
