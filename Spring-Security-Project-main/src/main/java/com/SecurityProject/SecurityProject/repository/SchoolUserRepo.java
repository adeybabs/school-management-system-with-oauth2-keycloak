package com.SecurityProject.SecurityProject.repository;

import com.SecurityProject.SecurityProject.models.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

public interface SchoolUserRepo extends JpaRepository<SchoolUser, Long> {

    //adding pre authorize for finding user by username. Only admin can do that due to the method level security implemented
    @PreAuthorize("hasRole('ADMIN')")
    SchoolUser findByUsername(String username);
}
