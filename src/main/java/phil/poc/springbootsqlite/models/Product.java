package phil.poc.springbootsqlite.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    private String description;

    private int rrp;

    @Column(name="wanted_price", nullable = false)
    private int wantedPrice;

    @Column(name="min_price", nullable = false)
    private int minPrice;


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
