package Ex8;

public class main {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle();
        MyCircle circle2 = new MyCircle(3, 4, 5);
        circle.setRadius(4);
        System.out.println(circle);
        System.out.println(circle2.getArea());
        System.out.println(circle.distance(circle2));
        circle.setCenterXY(6, 6);
        System.out.println(circle.getCenterXY()[0]);
        System.out.println(circle.getCircumference());
        System.out.println(circle2);
        
    }
}
