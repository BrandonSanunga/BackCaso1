package com.grupo3.Caso1.Dao.Mongo;

import com.grupo3.Caso1.Model.Client;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {

}