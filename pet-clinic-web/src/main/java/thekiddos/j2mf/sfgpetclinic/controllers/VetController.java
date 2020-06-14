package thekiddos.j2mf.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/vets")
public class VetController {
    @GetMapping
    public String listVets() {
        return "vets/index";
    }
}
