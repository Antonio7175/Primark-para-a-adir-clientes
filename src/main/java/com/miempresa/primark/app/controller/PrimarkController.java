package com.miempresa.primark.app.controller;

import com.miempresa.primark.app.entity.Articulo;
import com.miempresa.primark.app.service.PrimarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/articulo")
public class PrimarkController {

    @Autowired
    private PrimarkService primarkService;

    @GetMapping("/all")
    public String listArticulos(Model model) {
        model.addAttribute("articulos", primarkService.findAll());
        return "articulo/lista";
    }

    @GetMapping("/form")
    public String createForm(Model model) {
        model.addAttribute("articulo", new Articulo());
        return "articulo/form";
    }

    @PostMapping("/form")
    public String saveForm(Articulo articulo) {
        primarkService.save(articulo);
        return "redirect:/articulo/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteArticulo(@PathVariable Long id) {
        primarkService.deleteById(id);
        return "redirect:/articulo/all";
    }

    @GetMapping("/form/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        Articulo articulo = primarkService.findById(id);
        if (articulo != null) {
            model.addAttribute("articulo", articulo);
            return "articulo/form";
        }
        return "redirect:/articulo/all";
    }
    
}
