package aca.mirim.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.activation.CommandMap;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aca.mirim.domain.UserDAO;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.UserMapper;
import aca.mirim.service.UserService;

@Controller
@Repository
/*@RequestMapping("/user/*")*/
public class UserController {
		
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	
	// ȸ������ ȭ��	
	@GetMapping("/signup")
	public String signupGET(UserVO user, Model model) {
		System.out.println("signup get...");
		return "/signup";
	}
	
	@PostMapping("/signup")
	public String signupPOST(UserVO user, RedirectAttributes redirectAttributes) throws Exception {
		System.out.println("signup post...");		
		userService.signUp(user);
		redirectAttributes.addFlashAttribute("msg", "SIGNUP");
		return "redirect:/login";
	}
	
	// �α��� ȭ��	
	@GetMapping("/login")
	public void loginGET(UserVO user, Model model) {
		System.out.println("login get...");
	}
	
	@PostMapping("/login")
	public String loginPOST(UserVO vo, Model model, HttpServletRequest req) throws Exception {
		System.out.println("login post...");
		
		model.addAttribute("login result", "success");
		HttpSession session = req.getSession();
		UserVO login = userService.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
		} else {
			session.setAttribute("member", login);
		}
		
		return "/login";
	}
	
	@RequestMapping(value="/login")
	public ModelAndView alreadyLogin(HttpServletRequest request, HttpServlet response, CommandMap commandMap) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		
		// ���������� null�� �ƴ� ��
		if (request.getSession().getAttribute("loginUser") != null) {
			String msg = "�̹� �α��� �� �����Դϴ�.";
			mav.addObject("msg", msg);
			mav.setViewName("/");
		} else {
			mav.setViewName("/login");
		}		
		return mav;
		
	}
	
	// �α��� ó��
	/*@PostMapping("/loginCheck.do")
	public ModelAndView loginPost(@ModelAttribute UserVO vo, HttpSession session) {
		boolean result = userService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		
		if(result == true) {
			mav.setViewName("/board/list"); // list �������� �̵�
			mav.addObject("msg", "�α��� ����!");
		} else {
			mav.setViewName("/user/login");
			mav.addObject("msg", "�α��� ���� �Ф�");
		}
		
		return mav;
	}*/
	
	// �α׾ƿ� ó��
	/*@RequestMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("msg", "�α׾ƿ� ����");
		return null;
	}*/
}
