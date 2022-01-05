package pl.jakusz.offertable.staty;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.jakusz.offertable.model.AdminUser;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.repo.AdminUserRepo;
import pl.jakusz.offertable.repo.OfferTableRepo;

@Component
public class Staty {

    private PasswordEncoder passwordEncoder;
    private AdminUserRepo adminUserRepo;
    private OfferTableRepo offerTableRepo;

    public Staty(PasswordEncoder passwordEncoder, AdminUserRepo adminUserRepo, OfferTableRepo offerTableRepo) {
        this.passwordEncoder = passwordEncoder;
        this.adminUserRepo = adminUserRepo;
        this.offerTableRepo = offerTableRepo;

        AdminUser user = new AdminUser();
        user.setUsername("Admin");
        user.setPassword(passwordEncoder.encode("Admin123"));
        user.getAuthorities();
        adminUserRepo.save(user);

        OfferTable lpp = new OfferTable();
        lpp.setPlaceOfWork("Gdańsk");
        lpp.setWorkplace("PHP DEVELOPER");
        lpp.setActive(false);
        offerTableRepo.save(lpp);

        OfferTable lpp2 = new OfferTable();
        lpp2.setPlaceOfWork("Gdańsk");
        lpp2.setWorkplace("JAVA DEVELOPER");
        lpp2.setActive(false);
        offerTableRepo.save(lpp2);

        OfferTable lpp3 = new OfferTable();
        lpp3.setPlaceOfWork("Gdańsk");
        lpp3.setWorkplace("SYSTEM ARCHITEKT - APLIKACJE MOBILNE");
        offerTableRepo.save(lpp3);

        OfferTable lpp4 = new OfferTable();
        lpp4.setPlaceOfWork("Gdańsk");
        lpp4.setWorkplace("ANALITYCZKA SYSTEMOWA/ ANALITYK SYSTEMOWY");
        offerTableRepo.save(lpp4);

        OfferTable lpp5 = new OfferTable();
        lpp5.setPlaceOfWork("Gdańsk");
        lpp5.setWorkplace("JUNIOR PHP DEVELOPER");
        offerTableRepo.save(lpp5);

        OfferTable lpp6 = new OfferTable();
        lpp6.setPlaceOfWork("Gdańsk");
        lpp6.setWorkplace("SOFTWARE TESTER");
        offerTableRepo.save(lpp6);

        OfferTable lpp7 = new OfferTable();
        lpp7.setPlaceOfWork("Gdańsk");
        lpp7.setWorkplace("SCRUM MASTER");
        offerTableRepo.save(lpp7);

        OfferTable lpp8 = new OfferTable();
        lpp8.setPlaceOfWork("Gdańsk");
        lpp8.setWorkplace("ANDROID DEVELOPER");
        offerTableRepo.save(lpp8);

    }
}
