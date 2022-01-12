package pl.jakusz.offertable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.jakusz.offertable.service.OfferTableService;

@Controller
public class DetailedOfferPage {

    @Autowired
    private OfferTableService offerTableService;

    @GetMapping("/offer/{id}")
    public String offerID(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("offerTable", offerTableService.getOfferTableByID(id));
        return "detailedOfferPage";
    }
}
