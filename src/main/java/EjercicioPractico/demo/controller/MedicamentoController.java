package EjercicioPractico.demo.controller;

import org.springframework.ui.Model;
import EjercicioPractico.demo.domain.Medicamento;
import EjercicioPractico.service.MedicamentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/medicamento")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var medicamentos = medicamentoService.getMedicamentos();
        model.addAttribute("medicamentos", medicamentos);
        model.addAttribute("totalMedicamentos", medicamentos.size());
        return "/medicamento/listado";
    }

    @GetMapping("/nuevo")
    public String medicamentoNuevo(Medicamento medicamentos) {
        return "/medicamento/modifica";
    }

    @PostMapping("/guardar")
    public String medicamentoGuardar(Medicamento medicamento) {
        medicamentoService.save(medicamento);
        return "redirect:/medicamento/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String medicamentoEliminar(Medicamento medicamento) {
        medicamentoService.delete(medicamento);
        return "redirect:/medicamento/listado";
    }

    @GetMapping("/modificar/{id}")
    public String medicamentoModificar(Medicamento medicamento, Model model) {
        medicamento = medicamentoService.getMedicamento(medicamento);
        model.addAttribute("medicamento", medicamento);
        return "/medicamento/modifica";
    }
}
