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
	public int signUp(UserVO vo) {
		return userMapper.signup(vo);
	}
			
	@Override
	public UserVO login(UserVO vo) throws Exception{
		return userMapper.login(vo);
	}

	@Override
	public List<UserVO> getList()  throws Exception{
		return userMapper.getList();
	}

	@Override
	public UserVO logout(HttpSession session)  throws Exception{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void signup(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
