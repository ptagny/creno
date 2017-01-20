/**
 * 
 */
package io.creno.api.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.creno.api.model.Users;

/**
 * @author ptagny
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="io.creno.api.model.Users")
@RepositoryRestResource(collectionResourceRel = "Users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<Users, Integer> {
	Users findById(@Param("id") Integer id);
}
