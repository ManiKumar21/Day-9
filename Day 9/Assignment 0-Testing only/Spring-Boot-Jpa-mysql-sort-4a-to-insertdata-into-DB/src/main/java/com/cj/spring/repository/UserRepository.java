package com.cj.spring.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cj.spring.bean.User;

interface UserCountryName{
	String getCountry();
	String getName();
}

//CrudRepository, PagingAndSortingRepository, JpaRepository
public interface UserRepository extends PagingAndSortingRepository<User, Long>
{	
}
