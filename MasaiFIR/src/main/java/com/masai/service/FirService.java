package com.masai.service;

import java.util.List;

import com.masai.exception.FirException;
import com.masai.model.Fir;
import com.masai.model.FirDTO;

public interface FirService {
	
	public Fir FileAnFire(FirDTO firDTO) throws FirException;
	
	public List<Fir> getAllFirByUser(String userName) throws FirException;

	public Fir deleteFirByUser(Integer firId) throws FirException;
	
	public Fir serchFirByUser(Integer firId)throws FirException;

}
