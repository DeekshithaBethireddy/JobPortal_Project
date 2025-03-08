package com.JobApplication.joblisting.Controller;

import com.JobApplication.joblisting.PostRepository;
import com.JobApplication.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController
{
    PostRepository repo;
    @Autowired
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");

    }
    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

}
