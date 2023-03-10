package com.bryan.api.rest.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bryan.api.rest.mongo.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
