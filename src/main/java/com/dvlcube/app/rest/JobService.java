package com.dvlcube.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvlcube.app.jpa.repo.JobRepository;
import com.dvlcube.app.manager.data.JobBean;

@RestController
@RequestMapping("${dvl.rest.prefix}/jobs")
public class JobService {

	@Autowired
	JobRepository jobRepository;

	@GetMapping
	public List<JobBean> listJob() {
		return jobRepository.findAll();
	}

	@GetMapping("/{id}")
	public JobBean listJobId(@PathVariable(value="id") long id) {
		return jobRepository.findById(id);
	}

	@PostMapping
	public JobBean saveJob(@RequestBody JobBean job) {
		return jobRepository.save(job);
	}

	@DeleteMapping
	public void deleteJob(@RequestBody JobBean job) {
		jobRepository.delete(job);
	}
}
