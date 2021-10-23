package com.nttdata.GCCOBRANZAS_COB_GESTOR.model.dao;

import com.nttdata.GCCOBRANZAS_COB_GESTOR.model.entity.Gestor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GestorRepository extends JpaRepository<Gestor, String> {
    //para preguntar...
    //@Query(value = "SELECT CONCAT(PRIMER_NOMBRE,SEGUNDO_NOMBRE) FROM GCCOBRANZAS.COB_GESTOR",nativeQuery = true)
    //List<Gestor> concatNames();
}
