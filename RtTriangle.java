import java.util.Scanner;

public class RtTriangle extends AbstractShape{
    private double base;
    private double height;
    //Constructs a default right triangle
    public RtTriangle(){
        super("RtTriangle");
    }
    //Constructs a triangle of the specified size
    public RtTriangle(double base, double height){
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }
    //Gets the base
    public double getBase(){
        return base;
    }
    //Gets the height
    public double getHeight(){
        return height;
    }
    //Sets the height
    public void setHeight(){
        this.height = height;
    }
    //Sets the base
    public void setBase(){
        this.base = base;
    }
    
    //Computes the area
    //Override
    public double computeArea(){
        double area = (base * height) / 2;

        return area;
    }
    //Computes the perimeter
    //Override
    public double computePerimeter(){
        double sum = base + height;
        double perimeter = height + (Math.sqrt((base*base)+(height*height)));

        return perimeter;
    }
    //Gets the width
    //@Override
    public double getWidth(){
        return base;
    }
    //Reads the attributes of the triangle
    //@Override
    public void readShapeData(){
        Scanner in = null;

        try{
            in = new Scanner(System.in);

            System.out.println("Enter the base of a Right Triangle: ");
            base = in.nextDouble();
            System.out.println("Enter the height of a Right Triangle: ");
            height = in.nextDouble();
        }
        finally{
            if(in != null){
                in.close();
            }
        }
    }
    //Creates a string representation of the triangle
    //@Override
    public String toString(){
        return super.toString() + ": base is" + base
                + ", height is " + height;
    }
    
    }

    
