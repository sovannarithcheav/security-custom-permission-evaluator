package com.sovannarith.controller;

import com.sovannarith.dao.ConfidentialDocumentsRepository;
import com.sovannarith.model.ConfidentialDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ConfidentialDocumentsRepository repository;

    @PreAuthorize("hasPermission(#id, 'ConfidentialDocument', 'resad')")
    @GetMapping("/document/{id}")
    String findById(@PathVariable Integer id, final Model model) {
        final ConfidentialDocument document =
                this.repository.findOne(id);
        model.addAttribute("document", document);
        return "document";
    }

}
