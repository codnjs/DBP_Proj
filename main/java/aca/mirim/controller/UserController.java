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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aca.mirim.domain.UserDAO;
import aca.mirim.domain.UserVO;
import aca.mirim.mapper.UserMapper;
import aca.mirim.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService  userService; 
	
	@GetMapping("/login")
	public void login(@ModelAttribute("vo") UserVO uservo) {
		System.out.println("login get..." );
	}
	
	@GetMapping("/loginProc")
	public void loginProc(){
		System.out.println("loginProc...");		
	}
	
	@PostMapping("/loginProc")
	public void loginPost(UserVO uservo, HttpSession session,  Model model) {
		System.out.println("loginProc.... " + uservo);
		UserVO vo = userService.login(uservo);
		if  (vo == null) {
			return ;
		} 
		model.addAttribute("userVO", vo); 		
	}
	
	@PostMapping("/loginPost")
	public void loginPost (UserVO uservo, Model model) {	
		System.out.println("loginPost...");
		System.out.println(uservo);
		userService.login(uservo);
		System.out.println("로그인됨");
	}
	
	@GetMapping("/signup")
	public void signup (UserVO uservo){
		System.out.println("signup get...");		
	}
	
	@PostMapping("/signupProc")
	public void signupProc (UserVO uservo, Model model) {
		System.out.println("signupProc..." + uservo);	
	}
		
	@PostMapping("/signupPost")
	public void signupPost (UserVO uservo, Model model) {	
		System.out.println("signupPost...");
		System.out.println(uservo);
		userService.signUp(uservo);
		System.out.println("값 집어넣음");
	}
}
