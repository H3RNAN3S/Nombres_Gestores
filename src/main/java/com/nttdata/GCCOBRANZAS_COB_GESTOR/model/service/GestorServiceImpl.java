package com.nttdata.GCCOBRANZAS_COB_GESTOR.model.service;

import com.nttdata.GCCOBRANZAS_COB_GESTOR.model.dao.GestorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class GestorServiceImpl implements IGestorService{

    private GestorRepository gestorRepository;

    public GestorServiceImpl(GestorRepository gestorRepository) {
        this.gestorRepository = gestorRepository;
    }

    @Override
    public List<String> listNamesGestores() {

        return StreamSupport.stream(gestorRepository.findAll().spliterator(),false)
                .map(gestor -> gestor.getPrimerNombre()+" "+ gestor.getSegundoNombre()+" "+gestor.getPrimerApellido()+" "+gestor.getSegundoApellido())
                .collect(Collectors.toList());
    }
}
