/**
 * 
 */
package io.creno.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.creno.api.model.Meter;


/**
 * @author ptagny
 *
 */
@RepositoryRestResource(collectionResourceRel = "Meter", path = "meters")
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="io.creno.api.model.Meter")
public interface MeterRepository extends PagingAndSortingRepository<Meter, Integer> {
	
	@Query("Select m from Meter m where (:streetNumber >= m.streetnumberfrom) AND (:streetNumber <= m.streetnumberto)")
	Meter findByStreetNumber(@Param("streetNumber") Integer streetNumber);
	
}
