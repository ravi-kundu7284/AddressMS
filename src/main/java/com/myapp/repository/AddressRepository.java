package com.myapp.repository;


import com.myapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends JpaRepository<Address,Integer> {
   // @Query("Select * from Address where empId=:id")
    Address getByEmpId(int empId);
}
