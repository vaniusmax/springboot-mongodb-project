package br.com.vanius.mongoproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vanius.mongoproject.domain.User;
import br.com.vanius.mongoproject.repository.UserRepository;

@Service
public class UserService{
	
  @Autowired
  private UserRepository repo;
	
  public List<User> findAll(){
	 return repo.findAll(); 
  }
}
