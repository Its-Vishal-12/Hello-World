package com.ConsumerApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ConsumerApi.ConsumerImpl.ConsumerImplement;
import com.ConsumerApi.Entity.Consumer;
import com.ConsumerApi.Register.Register;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
//@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	private ConsumerImplement  impl; // for Temp. storage  Map<String , Register> map=new HashMap<>();
	
	
	@GetMapping("/registerdone")
	
	public String registerDone(HttpServletRequest  request, HttpSession  session) {
		
	String firstname= request.getParameter("firstname");
	String  lastname  =request.getParameter("lastname");
	String  dateofbirth  =request.getParameter("dateofbirth");
	String  phone  =request.getParameter("phone");
	String email=request.getParameter("email");
	Register reg=new Register();
	reg.setFirstnanme(firstname);
	reg.setLastname(lastname);
	reg.setDateofbirth(dateofbirth);
	reg.setPhone(phone);
	reg.setEmail(email);
	session.setAttribute("Register", reg);
	Consumer con=new Consumer();
	con.setFirstname(firstname);
	con.setLastname(lastname);
	con.setDateofbirth(dateofbirth);
	con.setPhone(phone);
	con.setEmail(email);
	
	impl.registerConsumer(con); //Registeration done at database permanent storage 
	return "Sucess";  // for temp . storage map.put(phone,reg);
	}
	
	
	@GetMapping("/generate")
	public String generateCredential(HttpServletRequest  request) {
		 
     String phone=request.getParameter("phone");
     String username=request.getParameter("username");
     String password=request.getParameter("password");
     Consumer con=impl.getConsumerByPhone(phone);
     System.out.println(con);
       con.setUsername(username);
       con.setPassword(password);
       
      impl.updateConsumer(con);  // update done internally jpa use merge for save method to update 
     
		
		return "Generated";
		
	}
	
	
	@GetMapping("/showall")
	public String showList(Model model) {
		
	List<Consumer> list=impl.getAll();
		 model.addAttribute("consumerlist", list);
	return "List";
	}
	

	
	

}
