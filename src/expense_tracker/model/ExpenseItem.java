package expense_tracker.model;

import java.util.Date;

/**
 * Created by serhii on 27.12.15.
 */
public class ExpenseItem implements Comparable<ExpenseItem> {

    private int id;
    private Date date;
    private double amount;
    private String desc;
    private Category category;

    public ExpenseItem(int id, Date date, double amount, String desc, Category category) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.desc = desc;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpenseItem that = (ExpenseItem) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(ExpenseItem o) {
        return this.date.compareTo(o.date);
    }
}
