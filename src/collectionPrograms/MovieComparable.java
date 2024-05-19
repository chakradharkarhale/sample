package collectionPrograms;

import java.util.*;

public class MovieComparable implements Comparable<MovieComparable>{
    private double rating;
    private String name;
    private int year;

    public MovieComparable(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MovieComparable{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MovieComparable m) {
        return this.year - m.year;
        //return this.name.compareTo(m.name);
    }
}

class Show {
    public static void main(String[] args) {
        List<MovieComparable> list = new ArrayList<>();
//        list.add(new MovieComparable(8, "KGF", 2021));
//        list.add(new MovieComparable(8.5, "Pushpa", 2022));
//        list.add(new MovieComparable(8.3, "RRR", 2014));
//        list.add(new MovieComparable(9, "Bharat", 2010));
//        list.add(new MovieComparable(9.4, "Sholey", 1960));

        MovieComparable obj1 = new MovieComparable(8, "KGF", 2021);
        MovieComparable obj2 = new MovieComparable(8.5, "Pushpa", 2022);
        MovieComparable obj3 = new MovieComparable(8.3, "RRR", 2014);
        MovieComparable obj4 = new MovieComparable(9, "Bharat", 2010);
        MovieComparable obj5 = new MovieComparable(9.4, "Sholey", 1960);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list);
        for(MovieComparable m:list)
        System.out.println("movies after sorting  "+m);


    }
}