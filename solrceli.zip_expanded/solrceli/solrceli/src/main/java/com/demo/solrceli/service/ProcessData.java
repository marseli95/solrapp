package com.demo.solrceli.service;

import com.demo.solrceli.entity.Document;
import com.demo.solrceli.util.DocumentDataIndexer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProcessData {
    @Autowired
    private DocumentDataIndexer docDataIndexer;

    public void docData() {
        List<String> token =  Arrays.asList("cake", "sugar", "eggs", "flour", "sugar");
        Document doc = new Document();
        doc.setDocId("2");
        doc.setDocToken(token);

        docDataIndexer.indexData(doc);
    }

}
