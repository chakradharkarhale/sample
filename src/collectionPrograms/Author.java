package collectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class  Author implements Comparable<Author>{
        String firstName;
        String lastName;
        String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return 0;
    }
}

class Test {
    public static void main(String[] args) {
        List<Author> list = new ArrayList<>();
        list.add(new Author("Henry","Miller", "Tropic of Cancer"));
        list.add(new  Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
        list.add(new  Author("Frank","Miller", "300"));
        list.add(new Author("Deborah","Hopkinson", "Sky Boys"));
        list.add(new  Author("George R. R.","Martin", "Song of Ice and Fire"));

    }
    }




