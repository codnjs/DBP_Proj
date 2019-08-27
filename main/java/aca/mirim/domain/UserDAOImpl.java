package aca.mirim.domain;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

public class UserDAOImpl implements UserDAO {

	private SqlSession sqlSession; 
	
	@Override
	public UserVO login(UserVO vo) {
		return null;
	}

	@Override
	public List<UserVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int signup(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		
	}
	
}
