package model;

public class MainCategory {
    int seats;
    Boolean sofa;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Boolean getSofa() {
        return sofa;
    }

    public void setSofa(Boolean sofa) {
        this.sofa = sofa;
    }

    public MainCategory(int seats, Boolean sofa) {
        this.seats = seats;
        this.sofa = sofa;
    }




    public void getInfo(){
        System.out.println("Total No. of seats ="+ this.getSeats());
        System.out.println("Total No. of sofas ="+ this.getSofa());
    }


}
