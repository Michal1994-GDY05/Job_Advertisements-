package pl.jakusz.offertable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.service.OfferTableService;

import java.util.List;

@Controller
public class MainPageOffertTable {

    @Autowired
    private OfferTableService getOfferTableService;

    @GetMapping("/")
    public String lppOffer(Model model) {
        model.addAttribute("offerTable", getOfferTableService.getAllLppOffert());
        return "silkyCodersOfferTable";
    }

    @GetMapping("/search")
    public String search(Model model, @Param("keyword") String keyword) {
        List<OfferTable> listProducts = getOfferTableService.searchLppOffer(keyword);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("keyword", keyword);
        return "silkyCodersOfferTable";
    }
}
