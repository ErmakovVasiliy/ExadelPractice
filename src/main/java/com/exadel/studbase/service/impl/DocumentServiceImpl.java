package com.exadel.studbase.service.impl;

import com.exadel.studbase.dao.IDocumentDAO;
import com.exadel.studbase.domain.impl.Document;
import com.exadel.studbase.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class DocumentServiceImpl implements IDocumentService {

    @Autowired
    private IDocumentDAO documentDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Document save(Document document) {
        return documentDAO.saveOrUpdate(document);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Document getById(Long id) {
        return documentDAO.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Document document) {
        documentDAO.delete(document);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Document> getActualForUser(Long id) {
        return documentDAO.getActualForUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Document> getNotActualForUser(Long id) {
        return documentDAO.getNotActualForUser(id);
    }

}
