package com.sovannarith.dao;

import com.sovannarith.model.ConfidentialDocument;

import java.util.Collection;

public interface ConfidentialDocumentsRepository {
    ConfidentialDocument save(ConfidentialDocument document, String userLogin);

    Collection<ConfidentialDocument> findAll();

    ConfidentialDocument findOne(Integer documentId);
}