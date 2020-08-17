package movies;

public class Movie {
    private String name;
    private String category;

    //default constructor
    public Movie() {
        Movie m = new Movie();
    }
    //getter and setter for name
    public String getName() {
        return name;
    }

    //getter and setter for category
    public String getCategory() {
        return category;
    }

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }


}
