package com.eter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eter.entites.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Integer>{

}
