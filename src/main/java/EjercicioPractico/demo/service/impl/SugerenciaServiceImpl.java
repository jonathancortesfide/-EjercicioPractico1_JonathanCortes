package EjercicioPractico.demo.service.impl;

import EjercicioPractico.demo.dao.SugerenciaDao;
import EjercicioPractico.demo.domain.Sugerencia;
import EjercicioPractico.service.SugerenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SugerenciaServiceImpl implements SugerenciaService {

    @Autowired
    private SugerenciaDao sugerenciaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Sugerencia> getSugerencias() {
        var lista = sugerenciaDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Sugerencia getSugerencia(Sugerencia sugerencia) {
        return sugerenciaDao.findById(sugerencia.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Sugerencia sugerencia) {
        sugerenciaDao.save(sugerencia);
    }

    @Override
    @Transactional
    public void delete(Sugerencia sugerencia) {
        sugerenciaDao.delete(sugerencia);
    }
}
