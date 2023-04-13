package com.sn.socialEmulator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sn.socialEmulator.payload.PostData;
import com.sn.socialEmulator.service.PostService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/users")
@RestController
public class UserController {
	@Autowired
	private PostService postService;
	
	 @GetMapping(path="/GetlistOfPosts")
	    public ResponseEntity<?> getPosts(){
		 return postService.getAllData();		 
	 }
	 
	 @PostMapping(path="/SavePost")
	    public ResponseEntity<?> SavePosts(@Valid @RequestBody PostData request){
		  return postService.savePostData(request);
	 }

}
