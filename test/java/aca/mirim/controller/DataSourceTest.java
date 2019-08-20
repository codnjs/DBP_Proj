package aca.mirim.controller;

import java.sql.Connection;
import java.util.List;
import javax.inject.Inject;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import aca.mirim.domain.BoardVO;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.GetBoardMapper;
import aca.mirim.mapper.UserMapper;
import aca.mirim.service.GiveBoardService;
import aca.mirim.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {	
	@Autowired
	private GiveBoardService brdService;
	
	@Autowired
	private GetBoardMapper brdMapper;

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
	
	@Test
	public void getListTest1() {
		List<BoardVO> brdlist = brdService.getList();
		for (BoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
	}
	
	/*@Test
	public void getListTest2() { // 왜 출력이 안될까나
		List<UserVO> uslist = usService.getList();
		for (UserVO userVO : uslist) {
			System.out.println(" 출력문입니다 " + userVO);
		}
	}*/
	
	@Test
	public void boardInsert() {
		BoardVO  board = new BoardVO();
		board.setWho("새로운 사용자");
		board.setWhy("새로운 이유");
		board.setHow("12000");
		brdMapper.insert(board);
		System.out.println("insert ok.. " + board);
		//bno, regdate,  updatedate는 자동으로 들어감. 
	}

}
