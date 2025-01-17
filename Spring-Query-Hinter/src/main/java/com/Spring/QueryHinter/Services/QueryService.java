package com.Spring.QueryHinter.Services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.Spring.QueryHinter.Entity.Student;

@Service
public interface QueryService extends JpaRepository<Student , Long> {
	
	
	  @Query("Select * from student where marks=marrks")
	  public  List<Student> find50Marks(@Param("marrks") String marks);

}
