package com.ctgu.airticket.repository;


import com.ctgu.airticket.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TUser,Integer> {
}
