package com.kor.java.ssg.dao;

import java.util.ArrayList;
import java.util.List;

import com.kor.java.ssg.dto.Article;
import com.kor.java.ssg.dto.Member;

public class MemberDao extends Dao {
	public List<Member> members;

	public MemberDao() {
		members = new ArrayList<>();
	}
	
	public void add(Member member) {
		members.add(member);
		lastId = member.id;
	}
}
