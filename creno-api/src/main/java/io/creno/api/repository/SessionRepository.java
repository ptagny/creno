package io.creno.api.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.creno.api.model.Session;

/**
 * @author ptagny
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="io.creno.api.model.Session")
@RepositoryRestResource(collectionResourceRel = "Session", path = "sessions")
public interface SessionRepository extends PagingAndSortingRepository<Session, Integer> {
}