package expense_tracker.service;

import expense_tracker.exception.InvalidSessionException;
import expense_tracker.exception.NoUserFoundException;
import expense_tracker.model.Category;
import expense_tracker.model.ExpenseItem;
import expense_tracker.model.MyTimeUnit;
import expense_tracker.model.User;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by serhii on 27.12.15.
 */
public interface MainService {

    // Access Key
    String login(String name, String pass) throws NoUserFoundException;

    String logout(String accessKey);

    User getOwnInfo(String accessKey) throws InvalidSessionException;

    void setAmount(String accessKey, double amount) throws InvalidSessionException;

    void addCategory(String accessKey, String name, String desc) throws InvalidSessionException;

    Set<Category> getAllCategories(String accessKey) throws InvalidSessionException;

    List<ExpenseItem> getByCategory(String accessKey,int categoryId, MyTimeUnit unit) throws InvalidSessionException;

    List<ExpenseItem> getByCategory(String accessKey, Date start, Date end);

    ExpenseItem addExpenseItem(String accessKey, int categoryId, double amount, String desc) throws InvalidSessionException;


}
