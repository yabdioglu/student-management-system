package com.yabdioglu.sms.repository;

import com.yabdioglu.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
