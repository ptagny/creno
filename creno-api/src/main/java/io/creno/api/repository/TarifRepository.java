/**
 * 
 */
package io.creno.api.repository;



import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.creno.api.model.Tarif;

/**
 * @author ptagny
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="io.creno.api.model.Tarif")
@RepositoryRestResource(collectionResourceRel = "Tarif", path = "tarifs")
public interface TarifRepository extends PagingAndSortingRepository<Tarif, Integer> {
	Tarif findByTarifid(@Param("tarifid") Integer tarifid);
	List<Tarif> findByMeterId(@Param("meterid") Integer meterid);
}