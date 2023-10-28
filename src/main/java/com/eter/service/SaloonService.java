package com.eter.service;

import java.util.List;

import com.eter.dto.SaloonDto;
import com.eter.entites.Saloon;

public interface SaloonService {

	Saloon addSaloon(Saloon saloon);
	
	List<SaloonDto> getSaloonsForPartners(int id);
}
