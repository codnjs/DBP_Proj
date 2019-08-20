package aca.mirim.service;

import java.util.List;
import javax.servlet.http.HttpSession;
import aca.mirim.domain.BoardVO;
import aca.mirim.domain.UserVO;

public interface UserService {
	
	public int signUp(UserVO vo);
	public void signup(UserVO vo) throws Exception;
	public UserVO login(UserVO vo) throws Exception;
	public UserVO logout(HttpSession session) throws Exception;
	public List<UserVO> getList() throws Exception;

}
