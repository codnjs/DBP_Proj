package aca.mirim.domain;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	public UserVO login(UserVO vo);
	public List<UserVO> getList();
	public int signup(UserVO vo);
	public void logout(HttpSession session);
}
