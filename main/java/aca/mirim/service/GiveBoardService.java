package aca.mirim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;

@Service
public interface GiveBoardService {
	public List<GiveBoardVO> getList();
	public void reigster(GiveBoardVO board);
	public void modify (GiveBoardVO board);
	public void remove (int bno);
	public void keep (int kno);
	public GiveBoardVO get(int bno);
	public List<GiveBoardVO> getSearch(Criteria cri);
}
