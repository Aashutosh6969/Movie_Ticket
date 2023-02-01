package model;

import java.util.ArrayList;

public class Ticket {
    ArrayList<User> user;
    ArrayList<Seats> seat;
    ArrayList<Movies> movie;

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Seats> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seats> seat) {
        this.seat = seat;
    }

    public ArrayList<Movies> getMovie() {
        return movie;
    }

    public void setMovie(ArrayList<Movies> movie) {
        this.movie = movie;
    }



    public Ticket(ArrayList<User> user, ArrayList<Seats> seat, ArrayList<Movies> movie) {
        this.user = user;
        this.seat = seat;
        this.movie = movie;
    }
    public void getTickets() {

        ArrayList<Seats> seatArrayList = this.getSeat();

        for(Seats singleSeat: seatArrayList) {
            System.out.println("----------------------");
            System.out.println("Occupied seat: " + singleSeat.getSeat_number());


        }

    }

}
