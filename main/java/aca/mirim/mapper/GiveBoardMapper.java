package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;

public interface GiveBoardMapper {
	// 전체 출력, 내용 출력, 보관된 카드 출력
	@Select("select * from tbl_give_board")
	public List<BoardVO> getList();
	
	/*@Select("select * from tbl_give_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri);*/
	
	@Select("select * from tbl_give_board where bno = #{bno}")
	public BoardVO read(int bno); 
	
	
	// 글 작성(갑,을)
	@Insert("insert into tbl_give_board (bno, who, how, why) values (seq_board.nextval, #{who}, #{how}, #{why})")
	public void insert (BoardVO board);
	
	
	// 글 수정
	@Update("update tbl_give_board set title =#{title}, content=#{content}, writer=#{writer}, updatedate =sysdate where bno = #{bno}")
	public void update(BoardVO board); 
		
	
	// 글 삭제
	@Delete("delete tbl_give_board where bno = #{bno}")
	public void delete(int bno);

	
	@Select("select * from tbl_give_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri); 
		
		
	
}
