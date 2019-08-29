package aca.mirim.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void signUp(UserVO vo) {
		userMapper.signup(vo);
	}
			
	@Override
	public UserVO login(UserVO vo){
		return userMapper.login(vo);
	}

	@Override
	public List<UserVO> getList() {
		return userMapper.getList();
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
