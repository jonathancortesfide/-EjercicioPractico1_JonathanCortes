package EjercicioPractico.demo.dao;

import EjercicioPractico.demo.domain.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugerenciaDao extends JpaRepository <Sugerencia,Long> {
    
}