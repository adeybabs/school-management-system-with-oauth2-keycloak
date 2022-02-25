package com.SecurityProject.SecurityProject.repository;

import com.SecurityProject.SecurityProject.models.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

public interface SchoolUserRepo extends JpaRepository<SchoolUser, Long> {


    SchoolUser findByUsername(String username);
}
