package com.dana.menalingo.repositories;

import com.dana.menalingo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
