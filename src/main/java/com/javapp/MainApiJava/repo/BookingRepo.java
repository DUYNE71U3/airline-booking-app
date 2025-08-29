package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepo extends JpaRepository<Booking, Long> {

    List<Booking> findByUserIdOrderByIdDesc(Long UserId);

}
