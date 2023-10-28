package com.eter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eter.dto.SaloonDto;
import com.eter.entites.Saloon;
@Repository
public interface SaloonRepository extends JpaRepository<Saloon, Integer>{

	@Query("select new com.eter.dto.SaloonDto(s.id,s.name) from Saloon s INNER JOIN s.partner p on s.partner.id=p.id where s.partner.id= :id")
//	@Query("select new com.scmg.model.Schools(c.id,c.name) from School c INNER JOIN c.partner p  on c.partner.id=p.id  where c.partner.id = :partnerid")
	List<SaloonDto> getSaloonsOfPartner(@Param("id") int id);
	
	List<Saloon> findByPartner(String partner);
}
