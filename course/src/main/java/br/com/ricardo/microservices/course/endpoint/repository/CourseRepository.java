package br.com.ricardo.microservices.course.endpoint.repository;

import br.com.ricardo.microservices.course.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
