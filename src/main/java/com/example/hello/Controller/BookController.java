package com.example.hello.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.hello.service.BookService;
import com.example.hello.vo.BookInfoVO;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/addForm")
	public ModelAndView ItemCreate() throws Exception {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("/item/addForm");

		return mav;
	}
	
	@PostMapping("/addForm_OK")
	public String list(@ModelAttribute BookInfoVO bi) throws Exception {
		
		bookService.add(bi);
		
		return "redirect:/bookList";
	}
	
	@GetMapping("/bookList")
	public ModelAndView BookList(BookInfoVO bi) {
		ModelAndView mav = new ModelAndView();
		
		List<BookInfoVO> bookList = this.bookService.getBookList(bi);
		mav.addObject("bookList",bookList);
		mav.setViewName("item/bookList");
		return mav;
	}
	
	@RequestMapping("bookDetail")
	public String bookDetail(Model model, @RequestParam("bno") int bno) {
		
		List<BookInfoVO> detailList = this.bookService.getDetailList(bno);

		model.addAttribute("detailList", detailList);
		model.addAttribute("bno", bno);
		
		return "/item/bookDetail";
	}
	
	@RequestMapping("detailListEdit")
	public String DetailListEdit(Model model, @RequestParam("bno") int bno) {
		
		List<BookInfoVO> detailList = this.bookService.getDetailList(bno);

		model.addAttribute("detailList", detailList);
		
		return "/item/detailListEdit";
	}
	
	@RequestMapping("detailListEdit_OK")
	public String detailListEdit_OK(Model model, BookInfoVO bi, @RequestParam("bno") int bno) {
		
		this.bookService.editList(bi);
		model.addAttribute("bno", bno);
		
		return "redirect:/bookDetail?bno="+bno;
	}
	
	@RequestMapping("detailListDel")
	public String DetailListDel(Model model, BookInfoVO bi, @RequestParam("bno") int bno) {
				
		this.bookService.delList(bno);
		System.out.println("gg");
		return "redirect:/bookList";
	}
}

















