package expense_tracker.model;

import java.util.*;

/**
 * Created by serhii on 27.12.15.
 */
public class History {

    private int id;
    private Map<Category,List<ExpenseItem>> categoryMap = new HashMap<>();
    private Set<ExpenseItem> orderedSet = new TreeSet<>();

    public List<ExpenseItem> getList(Category category){
        return categoryMap.get(category);
    }

    public void addItem(ExpenseItem item, Category category){
        categoryMap.get(category).add(item);
        orderedSet.add(item);
    }

    public void addCategory(Category category){
        categoryMap.put(category, new LinkedList<>());
    }

    public Map<Category, List<ExpenseItem>> getCategoryMap() {
        return categoryMap;
    }

    public void setCategoryMap(Map<Category, List<ExpenseItem>> categoryMap) {
        this.categoryMap = categoryMap;
    }
}
