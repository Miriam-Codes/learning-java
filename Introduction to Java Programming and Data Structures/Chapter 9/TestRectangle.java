public class TestRectangle{
    public static void main (String[] args){  
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        
       

        System.out.printf("Rectangle 1:\nWidth = %.2f\nHeight = %.2f\nArea = %.2f\nPerimeter = %.2f\n\n", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
        System.out.printf("Rectangle 2:\nWidth = %.2f\nHeight = %.2f\nArea = %.2f\nPerimeter = %.2f\n", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
    }
}