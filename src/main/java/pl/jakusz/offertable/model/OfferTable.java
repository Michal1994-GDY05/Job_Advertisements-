package pl.jakusz.offertable.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OfferTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String workplace;
    private String placeOfWork;
    private LocalDate localDate = LocalDate.now();
    private boolean active = true;

    @OneToOne
    private OfferTable_TypeOffer offerTableTypeOffers;

    @OneToMany(mappedBy ="offerTable")
    private Set<OfferTable_YourTask> offer_Table_yourTasks;

    @OneToMany(mappedBy = "offerTable")
    private List<OfferTable_WeLookingFor> offerTable_weLookingFors;

    @ManyToMany
    @JoinTable(
            joinColumns = { @JoinColumn(name = "offerTable_id")},
            inverseJoinColumns = {@JoinColumn(name = "offerTable_WeOffer_id")}
    )
    private Set<OfferTable_WeOffer> offerTable_weOffer = new HashSet<>();
}
