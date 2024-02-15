
package Swing;
import java.util.ArrayList;
public class Student_List {
  int id;
  String name;
  String gender;
  String course;
  float price;
  String room;
  String time;
  String date;
  String image;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public float getPrice() {
        return price;
    }

    public String getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }

    public Student_List(int id, String name, String gender, String course, float price, String room, String time, String date, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.price = price;
        this.room = room;
        this.time = time;
        this.date = date;
        this.image = image;
    }
    static ArrayList<Student_List> list = new ArrayList<>();
    
  
  
}
