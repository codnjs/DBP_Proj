package aca.mirim.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.GetBoardMapper;
import aca.mirim.mapper.GiveBoardMapper;
import aca.mirim.mapper.UserMapper;
import aca.mirim.service.GiveBoardService;
import aca.mirim.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DataSourceTest {	
	@Autowired
	private GiveBoardService brdService;
	
	@Autowired
	private GiveBoardMapper brdMapper;
	
	@Autowired
	private UserMapper usMapper;

	@Autowired
	private UserService usService;
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception {
		try(Connection con = ds.getConnection()) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test //성공
	public void getUser() {
		List<UserVO> userList = usService.getList();
		for (UserVO userVO : userList) {
			System.out.println(" " +userVO);
		}
	}
	
	@Test //성공
	public void insertUser() {
		UserVO uservo = new UserVO();
		uservo.setUserid("ecw1110");
		uservo.setUserpw("1234");
		usMapper.signup(uservo);
		
		System.out.println("회원가입 성공 ... " + uservo);
	}
	
	@Test // 성공
	public void boardList() {
		System.out.println("test...");		
		List<GiveBoardVO> brdlist = brdMapper.getList(); 
		for (GiveBoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
	}
	@Test
	public void boardInsert() {
		GiveBoardVO  board = new GiveBoardVO();
		board.setWho("새로운 사용자");
		board.setWhy("새로운 이유");
		board.setHow("12000");
		
		brdMapper.insert(board);
		System.out.println("insert ok.. " + board);
		//bno, regdate,  updatedate는 자동으로 들어감. 
	}

}
