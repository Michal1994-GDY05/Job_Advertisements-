package pl.jakusz.offertable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.service.OfferTableService;

import java.util.List;

@Controller
public class AdminPageOfferTable {

    @Autowired
    private OfferTableService offerTableService;

    @GetMapping("/adminProfile")
    public String lppOffer_ADMIN(Model model) {
        model.addAttribute("offerTable_ADMIN", offerTableService.getAllLppOffer());
        return "adminPage";
    }

    @GetMapping("/adminProfile/{id}")
    public String hide_or_disclose_a_job_offer_ADMIN (@PathVariable("id") Long id){
        offerTableService.hide_or_disclose_a_job_offer_byID(id);
        return "redirect:/adminProfile";
    }

    @GetMapping("/searchAdmin")
    public String searchAdmin(Model model, @Param("keywordAdmin") String keyword) {
        List<OfferTable> offerTableList_ADMIN = offerTableService.search_job_offers(keyword);
        model.addAttribute("offerTableList_ADMIN", offerTableList_ADMIN);
        model.addAttribute("keywordAdmin", keyword);
        return "adminPage";
    }

}
