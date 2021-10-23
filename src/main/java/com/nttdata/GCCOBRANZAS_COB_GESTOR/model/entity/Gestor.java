package com.nttdata.GCCOBRANZAS_COB_GESTOR.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(schema = "GCCOBRANZAS",name = "COB_GESTOR")
public class Gestor implements Serializable{

    @Id
    @Column(name = "USUARIO_ID")
    private String usuarioid;

    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private  String segundoNombre;

    @Column(name = "PRIMER_APELLIDO")
    private  String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "TARJETA_PROFESIONAL")
    private String tarjetaProfesional;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "APROBADOR_ID")
    private String aprobadorId;

    @Column(name = "DIRECTOR_ID")
    private String directorId;

    @Column(name = "ACTIVO")
    private String activo;

    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;

    @Column(name = "FECHA_CREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "USUARIO_ULTIMA_MODIFICACION")
    private String usuarioUltimaModificacion;

    @Column(name = "FECHA_ULTIMA_MODIFICACION")
    private LocalDateTime fechaUltimaModificacion;

    @Column(name = "ROL_CAT")
    private String rolCat;

    @Column(name = "NIVEL_JERARQUIA_CAT")
    private String nivelJerarquiaCat;

    @Column(name = "LUGAR_EXPEDICION_ID")
    private Integer lugarExpedicionId;

    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;

    @Column(name = "CIUDAD_ID")
    private Integer ciudadId;

    @Column(name = "DEPARTAMENTO_ID")
    private Integer departamentoId;

}
