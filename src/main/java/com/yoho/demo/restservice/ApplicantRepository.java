package com.yoho.demo.restservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "applicants", path = "applicants")
public interface ApplicantRepository extends MongoRepository<Applicant, String> {

	List<Applicant> findByLastName(@Param("name") String name);
	List<Applicant> findByFirstName(@Param("name") String name);
	
}
