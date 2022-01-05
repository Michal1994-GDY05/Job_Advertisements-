package pl.jakusz.offertable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.repo.OfferTableRepo;
import pl.jakusz.offertable.service.OfferTableService;

import java.util.List;

@Controller
public class MainPageOffertTable {

    @Autowired
    private OfferTableService getOfferTableService;
    private OfferTableRepo offerTableRepo;

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
    public String hidingTheOffer (@PathVariable(value = "id") long id, Model model){
        OfferTable offerTable = getOfferTableService.getOfferByID(id);
        offerTable.setActive(false);
        offerTableRepo.save(offerTable);
        return "redirect:/adminProfile";
    }

    @GetMapping("/search")
    public String search(Model model, @Param("keyword") String keyword) {
        List<OfferTable> offerTableList_USER = getOfferTableService.searchLppOffer(keyword);
        model.addAttribute("offerTableList_USER", offerTableList_USER);
        model.addAttribute("keyword", keyword);
        return "silkyCodersOfferTable";
    }

    @GetMapping("/searchAdmin")
    public String searchAdmin(Model model, @Param("keywordAdmin") String keyword) {
        List<OfferTable> offerTableList_ADMIN = getOfferTableService.searchLppOffer(keyword);
        model.addAttribute("offerTableList_ADMIN", offerTableList_ADMIN);
        model.addAttribute("keywordAdmin", keyword);
        return "adminProfile";
    }
}
