package gr.aueb.cf.cf9.ch12;

public class Main {
    public static void main(String[] args) {
       PointXYZ point = new PointXYZ(3, 4 ,12);
        System.out.printf("Distance XY = %.2f\n", point.getXYDistance());
        System.out.printf("Distance YZ = %.2f\n", point.getYZDistance());
        System.out.printf("Distance XZ = %.2f\n", point.getXZDistance());
        System.out.printf("Distance XYZ = %.2f\n", point.getXYZDistance());
    }
}
