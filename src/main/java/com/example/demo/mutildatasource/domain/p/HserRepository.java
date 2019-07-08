package com.example.demo.mutildatasource.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HserRepository extends JpaRepository<User, Long>{

}
