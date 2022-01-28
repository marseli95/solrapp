package com.demo.solrceli.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@SolrDocument(collection = "docs")
public class Document {

    @Id
    @Field
    private String docId;
    @Field
    private List<String> docToken;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public List<String> getDocToken() {
        return docToken;
    }

    public void setDocToken(List<String> docToken) {
        this.docToken = docToken;
    }
}
