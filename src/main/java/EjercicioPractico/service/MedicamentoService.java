package EjercicioPractico.service;

import EjercicioPractico.demo.domain.Medicamento;
import java.util.List;

public interface MedicamentoService {
    
    // Se obtiene un listado de medicamentos en un List
    public List<Medicamento> getMedicamentos();
    
    // Get a Category, based on the ID of a category
    public Medicamento getMedicamento(Medicamento medicamento);

    // Insert a new category if the category ID is empty
    // Update a category if the category ID is NOT empty
    public void save(Medicamento medicamento);

    // Delete the category that has the ID passed as a parameter
    public void delete(Medicamento medicamento);
 
}