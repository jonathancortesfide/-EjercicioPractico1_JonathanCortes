package EjercicioPractico.service;

import EjercicioPractico.demo.domain.Sugerencia;
import java.util.List;

public interface SugerenciaService {
    
    // Se obtiene un listado de sugerencias en un List
    public List<Sugerencia> getSugerencias();
    
    // Get a Category, based on the ID of a category
    public Sugerencia getSugerencia(Sugerencia sugerencia);

    // Insert a new category if the category ID is empty
    // Update a category if the category ID is NOT empty
    public void save(Sugerencia sugerencia);

    // Delete the category that has the ID passed as a parameter
    public void delete(Sugerencia sugerencia);
 
}