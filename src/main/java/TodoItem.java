import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodoItem extends TodoList{
    protected String Title;
    protected String Description;
    protected String DueDate;

    protected String getTitle(){
        return null;
    }
    protected String getDescription(){
        return null;
    }
    protected String getDueDate(){
        return null;
    }
    protected void setTitle(){}
    protected void setDescription(){}
    protected int setDueDate(){
        return 0;
    }
    protected int checkItemTitle(){
        return 0;
    }
    protected void checkComplete(){}
    protected void checkIncomplete(){}
}
