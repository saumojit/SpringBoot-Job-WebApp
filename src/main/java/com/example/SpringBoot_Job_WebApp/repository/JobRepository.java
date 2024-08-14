package com.example.SpringBoot_Job_WebApp.repository;

import com.example.SpringBoot_Job_WebApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {
    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","SpringBoot",4,Arrays.asList("Spring","Java")) ,
            new JobPost(2,"SpringBoot Developer","4+ of Experince",3,Arrays.asList("SpringBoot","Hibernate")) ,
            new JobPost(3,"Kafka Developer","4+ of Experince",2,Arrays.asList("SpringBoot","Hibernate")) ,
            new JobPost(4,"CoreJava Developer","4+ of Experince",1,Arrays.asList("SpringBoot","Hibernate"))
            ));

    public void addJobToDB(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public List<JobPost> findAllJobs(){
        System.out.println(jobs);
        return jobs;
    }
}
