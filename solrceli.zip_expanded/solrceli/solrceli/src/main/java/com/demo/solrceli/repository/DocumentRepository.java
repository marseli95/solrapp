package com.demo.solrceli.repository;

import com.demo.solrceli.entity.Document;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends SolrCrudRepository<Document, String> {


}
