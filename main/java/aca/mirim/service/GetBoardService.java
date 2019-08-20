package aca.mirim.service;

import java.util.List;

import org.springframework.stereotype.Service;
import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;

@Service
public interface GetBoardService {
	public List<BoardVO> getList();
	public void reigster(BoardVO board);
	public void modify (BoardVO board);
	public void remove (int bno);
	public BoardVO get(int bno);
	public List<BoardVO> getSearch(Criteria cri);
}
