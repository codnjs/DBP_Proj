package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;

public interface GetBoardMapper {
	// ��ü ���, ���� ���, ������ ī�� ���
	@Select("select * from tbl_get_board")
	public List<BoardVO> getList();
	
	/*@Select("select * from tbl_get_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri);*/
	
	@Select("select * from tbl_get_board where bno = #{bno}")
	public BoardVO read(int bno); 
	
	
	// �� �ۼ�(��,��)
	@Insert("insert into tbl_get_board (bno, who, how, why) values (seq_board.nextval, #{who}, #{how}, #{why})")
	public void insert(BoardVO board);
	// insert into TBL_GIVE_BOARD (bno, username, who, when_, until_, why, how, memo) values (seq_give.nextval, 'username1', '��ä��', '01/12/06', '02/12/06', '8�� �뵷�� �� �������...', '40000', '�̾��մϴ� ��ä�� ����մϴ� ��ä��'); 
	
	// �� ����
	@Update("update tbl_get_board set title =#{title}, content=#{content}, writer=#{writer}, updatedate =sysdate where bno = #{bno}")
	public void update(BoardVO board); 
		
	
	// �� ����
	@Delete("delete tbl_get_board where bno = #{bno}")
	public void delete(int bno);
	
	@Select("select * from tbl_get_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri); 
		
		
	
}
