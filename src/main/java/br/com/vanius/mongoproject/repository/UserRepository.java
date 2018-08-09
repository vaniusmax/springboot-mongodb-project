package br.com.vanius.mongoproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vanius.mongoproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
