package com.example.SpringBoot_Job_WebApp.controller;

import com.example.SpringBoot_Job_WebApp.model.JobPost;
import com.example.SpringBoot_Job_WebApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service ;

    @GetMapping({ "/" , "/home" })
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(JobPost jobPost){
        return "addjob";
    }

    @GetMapping("/viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts" , jobs);
        return "viewalljobs";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }
}
