import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Point point = new ColouredPoint(2,3, "red");

        if (point instanceof ColouredPoint){
            ColouredPoint colouredPoint = (ColouredPoint)point;

            System.out.println("the point of the colour is : " + colouredPoint.colouredPoint);
            System.out.println("the coords are at: " + colouredPoint.x + " " + colouredPoint.y);
        }



    }
}
