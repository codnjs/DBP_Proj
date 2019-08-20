package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.mapper.GiveBoardMapper;

@Service
public class GiveBoardServiceImpl implements GiveBoardService {
	
	@Autowired
	GiveBoardMapper brdMapper;

	@Override
	public List<BoardVO> getList() {
		return brdMapper.getList();
	}

	@Override
	public void reigster(BoardVO board) {
		brdMapper.insert(board);
	}

	@Override
	public void modify(BoardVO board) {
		brdMapper.update(board);
	}

	@Override
	public void remove(int bno) {
		brdMapper.delete(bno);
	}

	@Override
	public BoardVO get(int bno) {
		return brdMapper.read(bno);
	}

	@Override
	public List<BoardVO> getSearch(Criteria cri) {
		// TODO Auto-generated method stub
		return brdMapper.getSearch(cri);
	}

}
