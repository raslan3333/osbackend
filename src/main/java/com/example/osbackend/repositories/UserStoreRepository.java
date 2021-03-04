package com.example.osbackend.repositories;

import com.example.osbackend.models.UserStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserStoreRepository extends JpaRepository<UserStore, String>, JpaSpecificationExecutor<UserStore> {

}