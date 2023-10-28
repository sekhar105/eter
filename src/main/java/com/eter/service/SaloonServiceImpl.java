package com.eter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eter.dto.SaloonDto;
import com.eter.entites.Saloon;
import com.eter.repository.SaloonRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class SaloonServiceImpl implements SaloonService{

	private SaloonRepository saloonRepository;
	
	@Override
	public Saloon addSaloon(Saloon saloon) {
		
		return saloonRepository.save(saloon);
	}

	@Override
	public List<SaloonDto> getSaloonsForPartners(int id) {
		// TODO Auto-generated method stub
		return saloonRepository.getSaloonsOfPartner(id);
	}

	
}
