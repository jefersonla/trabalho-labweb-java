package br.ufba.dcc.matc84.bicicletario.repository;

import br.ufba.dcc.matc84.bicicletario.models.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 *
 * @author jeferson
 */
public interface Bicicletas extends JpaRepository<Bicicleta, Integer>{
    List<Bicicleta> findById(Integer id);
    List<Bicicleta> findByProprietario(String proprietario);
}