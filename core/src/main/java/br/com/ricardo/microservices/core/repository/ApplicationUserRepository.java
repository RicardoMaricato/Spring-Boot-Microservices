package br.com.ricardo.microservices.core.repository;

import br.com.ricardo.microservices.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}
