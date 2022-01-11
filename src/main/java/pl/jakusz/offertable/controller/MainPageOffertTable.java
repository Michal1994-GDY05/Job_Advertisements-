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
public class MainPageOffertTable {

    @Autowired
    private OfferTableService getOfferTableService;

    @GetMapping("/")
    public String lppOffer(Model model) {
        model.addAttribute("offerTable", getOfferTableService.getAllLppOffer());
        return "silkyCodersOfferTable";
    }

    @GetMapping("/adminProfile")
    public String lppOffer_ADMIN(Model model) {
        model.addAttribute("offerTable_ADMIN", getOfferTableService.getAllLppOffer());
        return "adminProfile";
    }

    @GetMapping("/adminProfile/{id}")
    public String hide_or_disclose_a_job_offer_ADMIN(@PathVariable(value = "id") long id, Model model) {
        getOfferTableService.hide_or_disclose_a_job_offer_byID(id);
        return "redirect:/adminProfile";
    }

    @GetMapping("/search")
    public String search(Model model, @Param("keyword") String keyword) {
        List<OfferTable> offerTableList_USER = getOfferTableService.search_job_offers(keyword);
        model.addAttribute("offerTableList_USER", offerTableList_USER);
        model.addAttribute("keyword", keyword);
        return "silkyCodersOfferTable";
    }

    @GetMapping("/searchAdmin")
    public String searchAdmin(Model model, @Param("keywordAdmin") String keyword) {
        List<OfferTable> offerTableList_ADMIN = getOfferTableService.search_job_offers(keyword);
        model.addAttribute("offerTableList_ADMIN", offerTableList_ADMIN);
        model.addAttribute("keywordAdmin", keyword);
        return "adminProfile";
    }

    @GetMapping("/offer/{id}")
    public String offerID(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("offerTable", getOfferTableService.getOfferTableByID(id));
        return "detailedOffer";
    }

}
