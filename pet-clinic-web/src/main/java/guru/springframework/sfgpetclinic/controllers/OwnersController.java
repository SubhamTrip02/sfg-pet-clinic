package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping("owners")
@Controller
public class OwnersController {

    @Autowired
    private OwnerService ownerService;

    @RequestMapping({"","/","/index","index.html"})
    public String listOwners(Model model){
        Set<Owner> ownerSet=ownerService.findAll();
        model.addAttribute("owners",ownerSet);
        return "owners/index";
    }
}
