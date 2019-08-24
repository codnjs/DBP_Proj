package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.domain.GetBoardVO;
import aca.mirim.mapper.GetBoardMapper;

@Service
public class GetBoardServiceImpl implements GetBoardService {
	
	@Autowired
	GetBoardMapper brdMapper;

	@Override
	public List<GetBoardVO> getList() {
		return brdMapper.getList();
	}

	@Override
	public void reigster(GetBoardVO board) {
		brdMapper.insert(board);
	}

	@Override
	public void modify(GetBoardVO board) {
		brdMapper.update(board);
	}

	@Override
	public void remove(int bno) {
		brdMapper.delete(bno);
	}

	@Override
	public GetBoardVO get(int bno) {
		return brdMapper.read(bno);
	}

	@Override
	public List<GetBoardVO> getSearch(Criteria cri) {
		// TODO Auto-generated method stub
		return brdMapper.getSearch(cri);
	}

}
