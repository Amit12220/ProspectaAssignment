package com.pros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pros.DTO.EntryDTO;
import com.pros.Exception.EntryDataException;
import com.pros.model.EntryData;
import com.pros.service.EntryDataService;

@RestController
public class EntryDataController {
	
	@Autowired
	private EntryDataService eserv;
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<EntryDTO>> getByCategory(@PathVariable("category") String category) throws EntryDataException
	{
		List<EntryDTO> list=eserv.getTitle_Desc(category);
		return new ResponseEntity<List<EntryDTO>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/entries/{add}")
	public ResponseEntity<String> Register(@RequestBody EntryData data) throws EntryDataException
	{
		String s=eserv.SaveEntryData(data);
		
		return new ResponseEntity<String>(s,HttpStatus.OK);
		
	}

}
