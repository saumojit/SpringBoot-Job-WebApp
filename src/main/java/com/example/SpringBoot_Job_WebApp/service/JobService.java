package com.example.SpringBoot_Job_WebApp.service;

import com.example.SpringBoot_Job_WebApp.model.JobPost;
import com.example.SpringBoot_Job_WebApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repo;

    public void addJob(JobPost jobPost){
        System.out.println("service");
        repo.addJobToDB(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAllJobs();
    }




}
