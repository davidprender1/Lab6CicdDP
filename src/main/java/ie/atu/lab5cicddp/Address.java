package ie.atu.lab5cicddp;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String county;

    @NotBlank
    private String eircode;

    public Address(String eircode, String county) {
        this.eircode = eircode;
        this.county = county;
    }
}

