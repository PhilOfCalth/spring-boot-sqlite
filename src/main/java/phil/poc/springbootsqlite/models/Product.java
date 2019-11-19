package phil.poc.springbootsqlite.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    private String description;

    private int rrp;

    @Column(nullable = false)
    private int wantedPrice;

    @Column(nullable = false)
    private int minPrice;

//    @ManyToOne
//    @JoinColumn(name = "library_id")
//    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)

    public Product() {
    }

    public Product(String name, int rrp, int wantedPrice, int minPrice) {
        this.name = name;
        this.rrp = rrp;
        this.wantedPrice = wantedPrice;
        this.minPrice = minPrice;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getRrp() { return rrp; }
    public void setRrp(int rrp) { this.rrp = rrp; }
    public int getWantedPrice() { return wantedPrice; }
    public void setWantedPrice(int wantedPrice) { this.wantedPrice = wantedPrice; }
    public int getMinPrice() { return minPrice; }
    public void setMinPrice(int minPrice) { this.minPrice = minPrice; }

}
