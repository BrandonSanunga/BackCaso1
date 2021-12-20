package com.grupo3.Caso1.Dao.Postgres;


import java.util.Optional;

import com.grupo3.Caso1.Model.ImagenCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenCatalogoReposiory extends JpaRepository<ImagenCatalogo, Long> {
        Optional<ImagenCatalogo>findByName(String name);
}
