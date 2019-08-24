package aca.mirim.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import aca.mirim.domain.UserVO;

public interface UserMapper {
	
	@Select("select * from tbl_user "
			+ "where userid = #{userid} and userpw = #{userpw}")
	public UserVO login(UserVO vo);
	
	@Select("select * from tbl_user")
	public List<UserVO> getList(); 
	
	@Insert("insert into tbl_user (uno, userid, userpw) values (seq_user.nextval, #{userid}, #{userpw})")
	public void signup(UserVO vo);
	
}
