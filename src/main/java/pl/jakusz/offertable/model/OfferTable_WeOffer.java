package pl.jakusz.offertable.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class OfferTable_WeOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String weOffer;


    @ManyToMany(mappedBy = "offerTable_weOffer")
    private Set<OfferTable> offerTableList = new HashSet<>();

}
