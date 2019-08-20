package aca.mirim.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Generated;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aca.mirim.domain.BoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.service.GetBoardService;
import aca.mirim.service.GiveBoardService;

@Controller
/*@RequestMapping("/board/*")*/
public class BoardController {
	
	@Qualifier("giveBrdService")
	private GiveBoardService giveBrdService;
	@Qualifier("getBrdService")
	private GetBoardService getBrdService;
	
	
	
	@PostMapping("/give_money_list")
	public String giveListPost(Criteria cri, Model model) {
		System.out.println("give post... ");
		/*List<BoardVO> searchlist = giveBrdService.getSearch(cri);
		for (BoardVO boardVO : searchlist) {
			System.out.println("se.ok... " + boardVO);
		}
		model.addAttribute("give_money_list", giveBrdService.getSearch(cri));*/
		return "/give_money_list"; 
	}
	
	@GetMapping("/give_money_list")
	public String giveListGet(Model model) {
		System.out.println("give get...");
		/*List<BoardVO> brdlist = giveBrdService.getList();
		for (BoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
		model.addAttribute("sample", "3514 이채원");
		model.addAttribute("give_money_list", giveBrdService.getList());*/
		
		return "/give_money_list";
	}
	
	@PostMapping("/get_money_list")
	public String getListPost(Criteria cri, Model model) {
		System.out.println("get post... ");
		/*List<BoardVO> searchlist = getBrdService.getSearch(cri);
		for (BoardVO boardVO : searchlist) {
			System.out.println("se.ok... " + boardVO);
		}
		model.addAttribute("list", getBrdService.getSearch(cri));*/
		return "/get_money_list"; 
	}
	
	@GetMapping("/get_money_list")
	public String getListGet(Model model) {
		System.out.println("get get...");
		
		/*List<BoardVO> brdlist = getBrdService.getList();
		
		for (BoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
		model.addAttribute("sample", "3514 이채원");
		model.addAttribute("list", getBrdService.getList());*/
		
		return "/get_money_list";
	}
	
	@GetMapping("/register")
	public void registerGET(BoardVO board, Model model) throws Exception {
		System.out.println("register get....");
	}
	
	@PostMapping("/register")
	public String registerPOST(BoardVO board, Model model) throws Exception {
		System.out.println("register post...");
		
		model.addAttribute("result", "success");
		
		return "redirect:/list";
	}
	
	@GetMapping("/main")
	public void mainGET() {
		System.out.println("mainGET");
		
	}
	
	
}
