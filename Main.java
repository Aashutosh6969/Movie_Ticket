import model.Movies;
import model.Seats;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movies movie1 = new Movies(50,true,"Thriller","Megan",12,"Gerard Johnstone",200);
        Movies movie2 = new Movies(50,true,"Adventure","Black Panther",6,"Ryan Coogler",200);
        Movies movie3 = new Movies(50,true,"Action","John Wick",2,"Chad Stahelski",200);
        Movies movie4 = new Movies(50,true,"Horror","Lulluby",8,"John R. Leonetti",200);

        ArrayList<Movies> movies = new ArrayList<Movies>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        ArrayList<User> userlist = new ArrayList<User>();
        User user1 = new User("Ram","ram@123.com");
        User user2 = new User("Shyam","Shyam@123.com");
        User user3 = new User("Hari","Hari@123.com");
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);


        Seats seats1 = new Seats("Good",1);
        Seats seats2 = new Seats("Good",2);
        Seats seats3 = new Seats("Good",3);
        Seats seats4 = new Seats("Good",4);
        Seats seats5 = new Seats("Good",5);
        Seats seats6 = new Seats("Good",6);
        Seats seats7 = new Seats("Good",7);
        Seats seats8 = new Seats("Good",8);
        Seats seats9 = new Seats("Good",9);

        ArrayList<Seats> seatlist = new ArrayList<>();
        seatlist.add(seats1);
        seatlist.add(seats2);
        seatlist.add(seats3);
        seatlist.add(seats4);
        seatlist.add(seats5);
        seatlist.add(seats6);
        seatlist.add(seats7);
        seatlist.add(seats8);
        seatlist.add(seats9);

        Ticket t1 = new Ticket(userlist,seatlist,movies);

        movie1.getInfo();
        t1.getTickets();
        movie3.getMovies(2);

    }
}