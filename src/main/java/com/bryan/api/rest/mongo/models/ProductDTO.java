package com.bryan.api.rest.mongo.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "productos")
public class ProductDTO {

	@Id
	private String _id;

	private String nombre;

	private Double precio;

	private LocalDate fecha_expiracion;

	public String get_id() {
		return _id;
	}
}
