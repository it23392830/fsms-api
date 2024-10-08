package com.fsms.api.repositary;

import com.fsms.api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositary extends JpaRepository<Customer,Integer> {

}
