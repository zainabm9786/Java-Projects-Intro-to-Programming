public class Employee {
    private String name;
    private int id;
    private static int numberOfEmployees=0;

    Employee(){
        name="new employee";
        id= ++numberOfEmployees;
    }
    Employee(String n){
        id= ++numberOfEmployees;
        name=n;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }
    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
public static void decreaseNumberOfEmployees(){
        numberOfEmployees--;
}

}
