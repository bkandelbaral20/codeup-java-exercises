package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//default constructor
    public Quadrilateral() {
    }

    //method
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    //getter and setter method for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

        Quadrilateral qua = new Quadrilateral() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
}
