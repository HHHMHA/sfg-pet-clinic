package thekiddos.j2mf.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping(value = "/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController( OwnerService ownerService ) {
        this.ownerService = ownerService;
    }

    @GetMapping
    public String listOwners( Model model ) {
        model.addAttribute( "owners", ownerService.findAll() );
        return "owners/index";
    }

    @RequestMapping(value = "/find")
    public String findOwners() {
        return "notimplemented";
    }
}
