package thekiddos.j2mf.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thekiddos.j2mf.sfgpetclinic.services.VetService;

@Controller
@RequestMapping(value = "/vets")
public class VetController {
    private final VetService vetService;

    public VetController( VetService vetService ) {
        this.vetService = vetService;
    }

    @GetMapping
    public String listVets( Model model ) {
        model.addAttribute( "vets", vetService.findAll() );
        return "vets/index";
    }
}
