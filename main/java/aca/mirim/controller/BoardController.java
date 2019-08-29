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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aca.mirim.domain.GiveBoardVO;
import aca.mirim.domain.Criteria;
import aca.mirim.domain.GetBoardVO;
import aca.mirim.service.GetBoardService;
import aca.mirim.service.GiveBoardService;

@Controller
/*@RequestMapping("/board/*")*/
public class BoardController {
	
	@Autowired
	private GiveBoardService giveBrdService;
	
	@Autowired
	private GetBoardService getBrdService;
	
	@PostMapping("/give_money_list")
	public String giveListPost(Criteria cri, Model model) {
		System.out.println("give post... ");
		return "/give_money_list"; 
	}
	
	@GetMapping("/give_money_list")
	public String giveListGet(Model model) {
		System.out.println("give get...");
		List<GiveBoardVO> brdlist = giveBrdService.getList();
		for (GiveBoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
		model.addAttribute("give_money_list", giveBrdService.getList());
		
		return "/give_money_list";
	}
	
	@PostMapping("/get_money_list")
	public String getListPost(Criteria cri, Model model) {
		System.out.println("get post... ");
		return "/get_money_list"; 
	}
	
	@GetMapping("/get_money_list")
	public String getListGet(Model model) {
		System.out.println("get get...");
		List<GetBoardVO> brdlist = getBrdService.getList();
		
		for (GetBoardVO boardVO : brdlist) {
			System.out.println(" " + boardVO);
		}
		model.addAttribute("get_money_list", getBrdService.getList());
		
		return "/get_money_list";
	}
	
	@GetMapping("/regi_table_give")
	public void registerGet(GiveBoardVO board) {
		System.out.println("reg get.... ");
	}

	@PostMapping("/regi_table_give")
	public String registerPost(GiveBoardVO board) {
		System.out.println("reg post.....");
		giveBrdService.reigster(board);
		System.out.println("reg ¿Ï¼º");
		return "redirect:/give_money_list"; 
	}
	
	@GetMapping("/read_table_give")
	public void getget(@RequestParam("bno") int bno, Model model) {		 
		System.out.println("/read_table_give.... ");
		System.out.println(giveBrdService.get(bno));
		model.addAttribute("board", giveBrdService.get(bno));		
	}
	
	@PostMapping("/read_table_give")
	public void getpost(@RequestParam("bno") int bno, Model model) {		 
		System.out.println("/read_table_give.... ");
		System.out.println(giveBrdService.get(bno));
		model.addAttribute("board", giveBrdService.get(bno));		
	}
	
	@GetMapping("/modi_table_give")
	public void modiget(@RequestParam("bno") int bno, Model model, GiveBoardVO board) {		 
		System.out.println("/modi_table_give get.... ");
		System.out.println(giveBrdService.get(bno));
		model.addAttribute("board", giveBrdService.get(bno));	
		
	}
	
	@PostMapping("/modi_table_give")
	public String modipost(@RequestParam("bno") int bno, Model model, GiveBoardVO board) {		 
		System.out.println("/modi_table_give post.... ");
		System.out.println(giveBrdService.get(bno));
		System.out.println(board);
		giveBrdService.modify(board);
		
		return "redirect:/read_table_give?bno=" + bno;
	}
	
	@GetMapping("/del_table_give")
	public void remove(@RequestParam("bno") int bno) {
		System.out.println("del..." + bno);
		giveBrdService.remove(bno);
	}
	
	@GetMapping("/keep_table_give")
	public void keep(@RequestParam("kno") int kno, @RequestParam("bno") int bno) {
		System.out.println("keep...kno");
		giveBrdService.keep(kno);
		System.out.println("keep...bno");
		giveBrdService.remove(bno);
		
	}
	
	@GetMapping("/main")
	public void mainGET() {
		System.out.println("mainGET");
		
	}
	
	
}
