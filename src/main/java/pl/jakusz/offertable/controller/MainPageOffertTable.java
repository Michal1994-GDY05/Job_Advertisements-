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
    private OfferTableService offerTableService;

    @GetMapping("/")
    public String lppOffer(Model model) {
        model.addAttribute("offerTable", offerTableService.getAllLppOffer());
        return "mainPageOfferTable";
    }

    @GetMapping("/search")
    public String search(Model model, @Param("keyword") String keyword) {
        List<OfferTable> offerTableList_USER = offerTableService.search_job_offers(keyword);
        model.addAttribute("offerTableList_USER", offerTableList_USER);
        model.addAttribute("keyword", keyword);
        return "mainPageOfferTable";
    }


}
