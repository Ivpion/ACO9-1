package expense_tracker.db;

import expense_tracker.exception.NoUserFoundException;
import expense_tracker.model.Category;
import expense_tracker.model.ExpenseItem;
import expense_tracker.model.History;
import expense_tracker.model.User;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class DB {

    private Map<String,User> userMap = new TreeMap<>();

    private Map<User, History> userHistoryMap = new TreeMap<>();

    public User findByLogin(String login) throws NoUserFoundException {
        User user = userMap.get(login);
        if(user == null){
            throw new NoUserFoundException("Inccorect user name");
        }

        return user;
    }

    public Category findCategory(User user,int categoryId){
        Set<Category> categories = userHistoryMap.get(user).getCategoryMap().keySet();
        for (Category category : categories) {
            if(category.getId() == categoryId){
                return category;
            }
        }
        return null;
    }

    public ExpenseItem addExpenseItem(User user, int categoryId, double amount, String desc){
        History userHistory = userHistoryMap.get(user);
        Category category = findCategory(user,categoryId);

        if(category != null){
            ExpenseItem item = new ExpenseItem((int) (System.currentTimeMillis() ^ user.getId()), new Date(), amount, desc, category);
            userHistory.addItem(item, category);
            return item;
        }

        return null;
    }

    public History getHistory(User user){
        return userHistoryMap.get(user);
    }

    public Category addCategory(User user,Category category){
        History history = userHistoryMap.get(user);
        history.addCategory(category);
        return category;
    }

    public Set<Category> getAllCategoryList(User user){
        return userHistoryMap.get(user).getCategoryMap().keySet();
    }
}
