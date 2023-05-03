package com.pros.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pros.model.EntryData;
@Repository
public interface EntryDataRepo extends JpaRepository<EntryData, Integer>{

}
