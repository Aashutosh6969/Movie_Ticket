package model;

public class Category extends MainCategory{
    String genre;
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Category(int seats, Boolean sofa, String genre) {
        super(seats, sofa);
        this.genre = genre;
    }



    @Override
public void getInfo(){
        super.getInfo();
    System.out.println("Genre :"+ this.genre);
}



}
