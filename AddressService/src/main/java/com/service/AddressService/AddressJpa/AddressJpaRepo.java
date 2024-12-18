package com.service.AddressService.AddressJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.AddressService.Entity.*;

public interface AddressJpaRepo   extends JpaRepository<Address,String>{

}
