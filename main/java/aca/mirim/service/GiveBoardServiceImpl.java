package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.mapper.GiveBoardMapper;

@Service
public class GiveBoardServiceImpl implements GiveBoardService {
	
	@Autowired
	GiveBoardMapper brdMapper;

	@Override
	public List<GiveBoardVO> getList() {
		return brdMapper.getList();
	}

	@Override
	public void reigster(GiveBoardVO board) {
		brdMapper.insert(board);
	}

	@Override
	public void modify(GiveBoardVO board) {
		brdMapper.update(board);
	}

	@Override
	public void remove(int bno) {
		brdMapper.delete(bno);
	}

	@Override
	public GiveBoardVO get(int bno) {
		return brdMapper.read(bno);
	}

	@Override
	public List<GiveBoardVO> getSearch(Criteria cri) {
		// TODO Auto-generated method stub
		return brdMapper.getSearch(cri);
	}

	@Override
	public void keep(int kno) {
		brdMapper.keep(kno);	
	}

}
