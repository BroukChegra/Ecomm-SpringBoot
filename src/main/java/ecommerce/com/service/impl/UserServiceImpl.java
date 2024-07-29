package ecommerce.com.service.impl;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import ecommerce.com.services.UserService;
import ecommerce.com.shared.dto.UserDto;



@Service
public class UserServiceImpl implements UserService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto userUpdate(String userId, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserDto> getUsers(int page, int limit, String search, int status) {
		// TODO Auto-generated method stub
		return null;
	}
	


}


