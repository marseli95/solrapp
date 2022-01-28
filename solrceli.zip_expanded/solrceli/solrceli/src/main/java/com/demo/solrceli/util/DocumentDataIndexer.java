package com.demo.solrceli.util;

import com.demo.solrceli.entity.Document;
import com.demo.solrceli.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentDataIndexer {

    @Autowired
    private DocumentRepository docRepo;

    public void indexData(Document doc){
        docRepo.save(doc);
    }
 }
