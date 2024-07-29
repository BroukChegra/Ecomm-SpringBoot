package ecommerce.com.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ecommerce.com.entites.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository <User, Long> {
	User findByEmail (String Email);
	User findByUserId(String UserId);
	

}
