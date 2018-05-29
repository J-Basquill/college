
/**
 * Program to test Square class
 * 
 * @author James Basquill
 * @author 17186285
 * @version 12/9/17
 */
public class TestSquares
{
    public static void main(String[] args)
    {
        Square mySquare = new Square(6);
        System.out.println(mySquare.getLength());
        mySquare.setLength(5);
        System.out.println(mySquare.getLength());
        double area = mySquare.getArea();
        double perimeter = mySquare.getPerimeter();
        System.out.println("Area : "+area+"\nPerimeter : "+perimeter);
        
        Square[] myBoxes = new Square[4];
        for(int i=0; i<myBoxes.length;i++)
        {
            myBoxes[i] = new Square(1+(int)(Math.random()*20));
            System.out.println("Square "+(i+1)+" : Length = "+myBoxes[i].getLength()+"\tArea = "+myBoxes[i].getArea()+" squared\tPerimeter = "+myBoxes[i].getPerimeter());
        }
    }
}
