package br.com.srv.topic.srvtopic.repository;

import br.com.srv.topic.srvtopic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

