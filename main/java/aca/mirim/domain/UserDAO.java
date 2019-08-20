package aca.mirim.domain;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserDAO {
	public UserVO login(UserVO vo) throws Exception;
	public List<UserVO> getList() throws Exception;
	public int signup(UserVO vo) throws Exception;
	public UserVO viewUser(UserVO vo) throws Exception;
	public void logout(HttpSession session) throws Exception;
}
