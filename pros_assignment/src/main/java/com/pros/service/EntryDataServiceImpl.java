package com.pros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pros.DTO.AllData;
import com.pros.DTO.EntryDTO;
import com.pros.Exception.EntryDataException;
import com.pros.Repo.EntryDataRepo;
import com.pros.model.EntryData;

@Service
public class EntryDataServiceImpl implements EntryDataService{
	
	@Autowired
	private EntryDataRepo erepo;
	
	private RestTemplate rtemp;
	
	String uri="https://api.publicapis.org/entries";

	@Override
	public List<EntryDTO> getTitle_Desc(String category) throws EntryDataException {
		// TODO Auto-generated method stub
		AllData adata=rtemp.getForObject(uri, AllData.class);
		
		List<EntryDTO> edto=new ArrayList<>();
		
		for(EntryData a:adata.getEd())
		{
			if(a.getCategory().equals(category))
			{
				EntryDTO ed=new EntryDTO();
				ed.setTitle(a.getApi());
				ed.setDescription(a.getDescription());
				edto.add(ed);
			}
		}
		
		if(edto.size()==0)
		{
			throw new EntryDataException("Details with such not found");
		}
		return edto;
	}

	@Override
	public String SaveEntryData(EntryData entry) throws EntryDataException {
		// TODO Auto-generated method stub
		if(entry==null)
		{
			throw new EntryDataException("Entry Details is wrong , please fill correct details");
		}
		
		erepo.save(entry);
		return "Data Saved";
	}

}
