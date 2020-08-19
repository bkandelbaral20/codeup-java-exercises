package movies;

public class Movie {
    private String name;
    private String category;

    //default constructor
    public Movie() {
    }

    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for category
    public String getCategory() {
        return category;
    }
    public void  setCategory(String category) {
       this.category = category;
    }

    //constructor including name and category
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }


}
