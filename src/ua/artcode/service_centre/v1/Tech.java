package ua.artcode.service_centre.v1;

public class Tech extends IdEntity {


    private String name;

    private MyDate buyDate;

    private boolean fixed = true;

    public Tech(int id, MyDate buyDate, String name) {
        this.buyDate = buyDate;
        setId(id);
        this.name = name;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "buyDate=" + buyDate +
                ", id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
