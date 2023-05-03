package com.pros.model;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
public class EntryData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	private String Api;
	
	private String http;
	
	private String cors;
	
	private String auth;
	
	private String description;
	
	private String Category;
	
	private String Link;

	public EntryData() {
		super();
	}

	public EntryData(String api, String http, String cors, String auth, String description, String category,
			String link) {
		super();
		Api = api;
		this.http = http;
		this.cors = cors;
		this.auth = auth;
		this.description = description;
		Category = category;
		Link = link;
	}

	public String getApi() {
		return Api;
	}

	public void setApi(String api) {
		Api = api;
	}

	public String getHttp() {
		return http;
	}

	public void setHttp(String http) {
		this.http = http;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}
	
	
	

}
