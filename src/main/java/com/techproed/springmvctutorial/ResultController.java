package com.techproed.springmvctutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultController {
	
//	//1.way
//	@RequestMapping("add")
//	public String addAndMultiplyNums(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("n1")); //convert from string to int
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a + b;
//		int product = a * b;
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfNumbers", sum);
//		session.setAttribute("productOfNumbers", product);
//		
//		return "result.jsp";
//	}
	
	
//	//2.Way
//		@RequestMapping("add")
//		public String addAndMultiplyNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
//			
//			int sum = a + b;
//			int product = a * b;
//			
//			session.setAttribute("sumOfNumbers", sum);
//			session.setAttribute("productOfNumbers", product);
//			
//			return "result.jsp";
//		}

//		//3.Way
	//First way of Using ModelAndView
//		@RequestMapping("add")
//		public ModelAndView addAndMultiplyNums3(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//			
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("result.jsp");
//			
//			int sum = a + b;
//			int product = a * b;
//			
//			mv.addObject("sumOfNumbers", sum);
//			mv.addObject("productOfNumbers", product);
//			
//			return mv;
//		}
		
		//4.Way
	//Second way of Using ModelAndView (Recomended)
//		@RequestMapping("add")
//		public ModelAndView addAndMultiplyNums4(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//			
//			ModelAndView mv = new ModelAndView("result.jsp");
//			
//			int sum = a + b;
//			int product = a * b;
//			
//			mv.addObject("sumOfNumbers", sum);
//			mv.addObject("productOfNumbers", product);
//			
//			return mv;
//		}
//		
		//5.Way
//		@RequestMapping("add")
//		public String addAndMultiplyNums5(@RequestParam("n1") int a, @RequestParam("n2") int b, Model m) {
//			
//			int sum = a + b;
//			int product = a * b;
//			
//			//First usage
////			m.addAttribute("sumOfNumbers", sum);
////			m.addAttribute("productOfNumbers", product);
//			
//			//Second usage
//			m.addAttribute("sumOfNumbers", sum)
//			  .addAttribute("productOfNumbers", product);
//			
//			return "result.jsp";
//		}
		
		//6.Way
//				@RequestMapping("add")
//				public String addAndMultiplyNums6(@RequestParam("n1") int a, @RequestParam("n2") int b, ModelMap mm) {
//					
//					int sum = a + b;
//					int product = a * b;
//					
////					//First usage
////					mm.addAttribute("sumOfNumbers", sum);
////					mm.addAttribute("productOfNumbers", product);
//					
//					//Second usage
//					mm.addAttribute("sumOfNumbers", sum)
//					  .addAttribute("productOfNumbers", product);
//				
//					return "result.jsp";
//				}
				
//**************************************************************
			//1.Way
//			@RequestMapping("addStudent")
//			public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m) {
//				
//				//First object creation way
////				Student student = new Student();
////				student.setId(id);
////				student.setName(name);
//				
//				//Second object creation way
//				Student student = new Student(id, name);
//				
//				m.addAttribute("studentobj", student);
//				
//				
//				return "result.jsp";
//			}
				
//		//2. Way
//		@RequestMapping("addStudent")
//		public String addStudent2(@ModelAttribute Student student, Model m) {
//			
//			m.addAttribute("studentobj",student);
//			
//			return "result.jsp";
//		}
				
//		
//		//3. Way
//		@RequestMapping("addStudent")
//		public String addStudent3(@ModelAttribute("studentobj") Student student) {
//			return "result";
//		}
//				
//		
//		//How to get a specific field from an object
//		@ModelAttribute
//		public void greetStudent(Model m, Student student) {
//			m.addAttribute("greetStudent", student.getName());
//		}
				
			
		//How to use POST Method
		//1.Way
//		@RequestMapping(value="addStudent", method = RequestMethod.POST)
//		public String addStudent3(@ModelAttribute("studentobj") Student student) {
//			return "result";
//		}
//				
//		
//		//How to get a specific field from an object
//		@ModelAttribute
//		public void greetStudent(Model m, Student student) {
//			m.addAttribute("greetStudent", student.getName());
//		}
		
		
//		//2.Way
//		@PostMapping("addStudent")
//		public String addStudent3(@ModelAttribute("studentobj") Student student) {
//			return "result";
//		}
//				
//		
//		//How to get a specific field from an object
//		@ModelAttribute
//		public void greetStudent(Model m, Student student) {
//			m.addAttribute("greetStudent", student.getName());
//		}
//		
		
		
		//How to use GET Method 
		//1.Way
//		@RequestMapping(value = "getStudent", method = RequestMethod.GET)
//		public String getStudent(Model m) {
//			
//			List<Student> students = new ArrayList<>();
//			students.add(new Student(101,"Ali Can"));
//			students.add(new Student(102,"Veli Han"));
//			students.add(new Student(103,"Mary Star"));
//			students.add(new Student(104,"Tom Hanks"));
//			students.add(new Student(105,"Angie Ocean"));
//			
//			m.addAttribute("studentList", students);
//			
//			return "result";
//		}
		
		
		//2.Way
		@GetMapping(value = "getStudent")
		public String getStudent(Model m) {
			
			List<Student> students = new ArrayList<>();
			students.add(new Student(101,"Ali Can"));
			students.add(new Student(102,"Veli Han"));
			students.add(new Student(103,"Mary Star"));
			students.add(new Student(104,"Tom Hanks"));
			students.add(new Student(105,"Angie Ocean"));
			
			m.addAttribute("studentList", students);
			
			return "result";
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
}
