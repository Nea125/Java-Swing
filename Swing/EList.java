
package Swing;
import java.util.ArrayList;
public class EList {
  int id;
  String name,gender,possition;
  float salary;
  String dob;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPossition() {
        return possition;
    }

    public float getSalary() {
        return salary;
    }

    public String getDob() {
        return dob;
    }
    public EList(int id, String name, String gender, String possition, float salary, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.possition = possition;
        this.salary = salary;
        this.dob = dob;
    }
   static ArrayList<EList> list = new ArrayList<>();
    
}
