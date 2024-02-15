
package Swing;
import java.util.ArrayList;
public class StaffList {
    int id;
    String name,gender,position,address;
    float salary;
    String phone;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }
    public String getAddress() {
        return address;
    }

    public float getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public static ArrayList<StaffList> getList() {
        return list;
    }
    public StaffList(int id, String name, String gender, String position, String address, float salary, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.salary = salary;
        this.phone = phone;
    }
    static ArrayList<StaffList> list = new ArrayList<>();
    
    
}
