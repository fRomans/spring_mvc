package web.model;

import javax.persistence.*;

@Entity
@Table(name = "carsMVC")
public class CarMy {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "number")
    String number;

    @Column(name = "series")
    int series;


    public CarMy() {
    }

    public CarMy(String name, int series, String number) {
        this.name = name;
        this.series = series;
        this.number = number;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
            return  name ;
    }
}
