package pl.jakusz.offertable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jakusz.offertable.service.OfferTableService;

@Controller
public class MainPageOffertTable {

    @Autowired
    private OfferTableService getOfferTableService;

    @GetMapping("/")
    public String lppOffer(Model model) {
        model.addAttribute("offerTable", getOfferTableService.getAllLppOffert());
        return "silkyCodersOfferTable";
    }
}
