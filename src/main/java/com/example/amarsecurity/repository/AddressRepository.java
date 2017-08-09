package com.example.amarsecurity.repository;

import com.example.amarsecurity.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by amarendra on 09/08/17.
 */
@RepositoryRestResource
public interface AddressRepository extends MongoRepository<Address, String> {
}
