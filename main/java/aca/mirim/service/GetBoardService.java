package aca.mirim.service;

import java.util.List;

import org.springframework.stereotype.Service;
import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.domain.GetBoardVO;

@Service
public interface GetBoardService {
	public List<GetBoardVO> getList();
	public void reigster(GetBoardVO board);
	public void modify (GetBoardVO board);
	public void remove (int bno);
	public GetBoardVO get(int bno);
	public List<GetBoardVO> getSearch(Criteria cri);
}
