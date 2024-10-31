package EjercicioPractico.demo.service.impl;

import EjercicioPractico.demo.dao.MedicamentoDao;
import EjercicioPractico.demo.domain.Medicamento;
import EjercicioPractico.service.MedicamentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoDao medicamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamento> getMedicamentos() {
        var lista = medicamentoDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamento getMedicamento(Medicamento medicamento) {
        return medicamentoDao.findById(medicamento.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Medicamento medicamento) {
        medicamentoDao.save(medicamento);
    }

    @Override
    @Transactional
    public void delete(Medicamento medicamento) {
        medicamentoDao.delete(medicamento);
    }
}
