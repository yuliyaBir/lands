package be.vdab.landen;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "landen")
class Land {
    @Id
    private String code;
    private String naam;
}
