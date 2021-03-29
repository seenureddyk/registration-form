package com.example.registrationform;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Long> {

 User findByemail(String email);
 User findBypassword(String password);
}
