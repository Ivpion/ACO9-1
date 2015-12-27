package expense_tracker.service;

import expense_tracker.db.DB;
import expense_tracker.exception.InvalidSessionException;
import expense_tracker.exception.NoUserFoundException;
import expense_tracker.model.Category;
import expense_tracker.model.ExpenseItem;
import expense_tracker.model.MyTimeUnit;
import expense_tracker.model.User;

import java.util.*;

/**
 * Created by serhii on 27.12.15.
 */
public class MainServiceImpl implements MainService {

    private DB db;
    private Map<String,User> userMap = new HashMap<>();

    public MainServiceImpl(DB db) {
        this.db = db;
    }

    @Override
    public String login(String name, String pass) throws NoUserFoundException {

        User user = db.findByLogin(name);

        if(!user.getPass().equals(pass)){
            throw new NoUserFoundException("Wrong pass");
        }

        String accessKey = String.valueOf(System.currentTimeMillis() ^ 12 * user.getId());
        userMap.put(accessKey, user);

        return accessKey;
    }

    @Override
    public String logout(String accessKey) {
        return userMap.remove(accessKey).getLogin();
    }

    @Override
    public User getOwnInfo(String accessKey) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }

        return userMap.get(accessKey);
    }

    @Override
    public void setAmount(String accessKey, double amount) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }

        User user = userMap.get(accessKey);
        user.setAmount(amount);
    }

    @Override
    public void addCategory(String accessKey, String name, String desc) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }

        User user = userMap.get(accessKey);
        db.addCategory(user, new Category((int)System.currentTimeMillis(),name,desc));

    }

    @Override
    public Set<Category> getAllCategories(String accessKey) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }

        User user = userMap.get(accessKey);

        return db.getAllCategoryList(user);
    }

    @Override
    public List<ExpenseItem> getByCategory(String accessKey, int categoryId, MyTimeUnit unit) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }


        return null;
    }

    @Override
    public List<ExpenseItem> getByCategory(String accessKey, Date start, Date end) {
        return null;
    }

    @Override
    public ExpenseItem addExpenseItem(String accessKey, int categoryId, double amount, String desc) throws InvalidSessionException {
        if(!userMap.containsKey(accessKey)){
            throw new InvalidSessionException("Please login");
        }

        User user = userMap.get(accessKey);

        return db.addExpenseItem(user,categoryId,amount,desc);
    }
}
