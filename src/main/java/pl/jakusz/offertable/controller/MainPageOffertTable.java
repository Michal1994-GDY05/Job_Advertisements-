package pl.jakusz.offertable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jakusz.offertable.service.OfferTableService;

@Controller
public class MainPageOffertTable {

    private OfferTableService getOfferTableService;

    @GetMapping("/scaaaaa")
    public String lppOffert(Model model) {
        model.addAttribute("offerTable", getOfferTableService.getAllLppOffert());
        return "silkyCodersOfferTable";
    }
}
