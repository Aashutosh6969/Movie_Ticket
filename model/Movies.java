package model;

import java.sql.SQLOutput;

public class Movies extends Category {

    String movie_name;
    int Show_time;
    String Director;
    int price;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getShow_time() {
        return Show_time;
    }

    public void setShow_time(int show_time) {
        Show_time = show_time;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public Movies(int seats, Boolean sofa, String genre, String movie_name, int show_time, String director, int price) {
        super(seats, sofa, genre);
        this.movie_name = movie_name;
        Show_time = show_time;
        Director = director;
        this.price = price;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("----------------------");
        System.out.println("Movie :" + this.movie_name);
        System.out.println("Showtime :"+ this.getShow_time());
        System.out.println("Director :"+ this.getDirector());
        System.out.println("Price :" + this.price);
        System.out.println("----------------------");
    }




    public void getMovies(int showTime){
        if((this.Show_time) == (showTime)){
            System.out.println("----------------------");
            System.out.println("Movies :" + this.movie_name);


        }
        else{
            System.out.println("----------------------");
            System.out.println("Movies are not available in the given time");
        }
    }


}
