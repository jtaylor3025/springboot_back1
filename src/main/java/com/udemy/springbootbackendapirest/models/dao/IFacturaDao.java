package com.udemy.springbootbackendapirest.models.dao;

import com.udemy.springbootbackendapirest.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
