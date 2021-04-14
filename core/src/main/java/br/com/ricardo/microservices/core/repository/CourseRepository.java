package br.com.ricardo.microservices.core.repository;

import br.com.ricardo.microservices.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
