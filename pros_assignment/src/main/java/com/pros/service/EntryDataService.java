package com.pros.service;

import java.util.List;

import com.pros.DTO.EntryDTO;
import com.pros.Exception.EntryDataException;
import com.pros.model.EntryData;

public interface EntryDataService {
	
	public List<EntryDTO>getTitle_Desc(String category) throws EntryDataException;
	
	public String SaveEntryData(EntryData entry) throws EntryDataException;

}
