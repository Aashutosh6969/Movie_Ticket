package model;

public class Seats {
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    int seat_number;


    public Seats(String rating, int seat_number) {
        this.rating = rating;
        this.seat_number = seat_number;
    }




}
