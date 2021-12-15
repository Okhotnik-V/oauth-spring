package com.company.oauth2.repositorys;

import com.company.oauth2.dtos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, String> {
}
