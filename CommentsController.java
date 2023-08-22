package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Comment;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.CommentService;


@RestController
@RequestMapping("/api/")
public class CommentsController {

	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private CommentService service;
	
	//comment/24?comment=ver good pers
		@PostMapping("/comment/{empId}")  
		//12/god person
		public ResponseEntity<Map<String,String>> addComment(
				@PathVariable("empId") long empId,
				@RequestBody Comment comment)
		{
			
			
			try
			{
				Comment obj=new Comment();
				Random rand = new Random(); 
				obj.setContent(comment.getContent());
				long commentId=rand.nextInt(11111);
				obj.setCommentId(commentId);
				obj.setEmp(this.empRepo.findById(empId).get());
				this.service.addComment(obj);
				
				Map<String,String> response=new HashMap<String,String>();
				response.put("status", "success");
				response.put("message", "Comment added!!");
				return new ResponseEntity<Map<String,String>>(response, HttpStatus.CREATED);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				Map<String,String> response=new HashMap<String,String>();
				response.put("status", "failed");
				response.put("message", "Comment not added!!");
				return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
			}
		}
		
		@GetMapping("/empComments/{empId}")
		public ResponseEntity<List<Comment>> getCommentsByEmpId(@PathVariable long empId)
		{
			List<Comment> cmtList = new ArrayList<Comment>();
			cmtList = this.service.findCommentsByEmpId(empId);
				return new ResponseEntity<List<Comment>>(HttpStatus.OK);
			
		}
}
