package Ex7;

import Ex6.MyPoint;

public class main {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(2, 2);
        MyPoint end = new MyPoint(3, 4);
        MyLine line = new MyLine(begin, end);
        MyLine line2 = new MyLine(4, 3, 7, 5);

        line.setBegin(end);
        System.out.println(line.getBegin());
        line.setBeginX(8);
        System.out.println(line.getEnd());
        line.setBeginXY(5, 8);
        System.out.println(line.getBeginXY()[1]);
        System.out.println(line2.getLength());
        System.out.println(line2.getGradient());
        System.out.println(line);
    }
}
