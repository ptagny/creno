/**
 * 
 */
package io.creno.api.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.creno.api.model.Vehicle;

/**
 * @author ptagny
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="io.creno.api.model.Vehicle")
@RepositoryRestResource(collectionResourceRel = "Vehicle", path = "vehicles")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Integer> {
	Vehicle findById(@Param("id") Integer id);
	List<Vehicle> findByUserId(@Param("id") Integer id);
}