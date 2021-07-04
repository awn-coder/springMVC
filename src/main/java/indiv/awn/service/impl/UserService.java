package indiv.awn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indiv.awn.mapper.UserMapper;
import indiv.awn.po.User;
import indiv.awn.service.inf.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findById(int id) {
		return userMapper.findByUseId(id);
	}

}
