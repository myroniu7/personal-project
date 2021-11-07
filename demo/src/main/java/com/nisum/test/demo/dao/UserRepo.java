package com.nisum.test.demo.dao;

import com.nisum.test.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Usuario, Integer> {
}
