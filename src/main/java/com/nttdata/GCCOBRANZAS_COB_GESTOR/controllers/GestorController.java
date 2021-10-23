package com.nttdata.GCCOBRANZAS_COB_GESTOR.controllers;

import com.nttdata.GCCOBRANZAS_COB_GESTOR.model.service.IGestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GestorController {

    @Autowired
    private  IGestorService gestorService;

    @GetMapping("/gestores")
    public List<String> getNamesGestores() {
        return gestorService.listNamesGestores();
    }
}
