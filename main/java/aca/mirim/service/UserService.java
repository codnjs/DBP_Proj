package aca.mirim.service;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.UserVO;

@Service
public interface UserService {
	
	public void signUp(UserVO vo);
	public UserVO login(UserVO vo);
	public void logout(HttpSession session);
	public List<UserVO> getList();

}
