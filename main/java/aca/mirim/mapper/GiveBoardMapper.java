package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;

public interface GiveBoardMapper {
	// ��ü ���, ���� ���, ������ ī�� ���
	@Select("select * from tbl_give_board")
	public List<GiveBoardVO> getList();
	
	/*@Select("select * from tbl_give_board where ${type} like '%'||#{keyword}||'%'")
	public List<BoardVO> getSearch(Criteria cri);*/
	
	@Select("select * from tbl_give_board where bno = #{bno}")
	public GiveBoardVO read(int bno); 
	
	
	// �� �ۼ�(��,��)
	@Insert("insert into tbl_give_board (bno, who, when_, how, why, until_) values (seq_board.nextval, #{who}, #{when_}, #{how}, #{why}, #{until_})")
	public void insert (GiveBoardVO board);
	
	
	// �� ����
	@Update("update tbl_give_board set who=#{who}, when_=#{when_}, until_=#{until_}, how=#{how}, why=#{why}, memo=#{memo}, interest=#{interest} where bno = #{bno}")
	public void update(GiveBoardVO board); 
		
	
	// �� ����
	@Delete("delete tbl_give_board where bno = #{bno}")
	public void delete(int bno);
	
	@Insert("insert into tbl_give_board_keep (kno, bno) values (seq_give_keep.nextval, seq_board.nextval)")
	public void keep(int kno);

	
	@Select("select * from tbl_give_board where ${type} like '%'||#{keyword}||'%'")
	public List<GiveBoardVO> getSearch(Criteria cri); 
		
		
	
}
