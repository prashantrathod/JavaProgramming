public class ColouredPoint extends Point {

    public String colouredPoint;

    public ColouredPoint(int x, int y, String colouredPoint){
        super(x,y);
        this.colouredPoint = colouredPoint;
    }

    public String getColouredPoint() {
        return colouredPoint;
    }

    public void setColouredPoint(String colouredPoint) {
        this.colouredPoint = colouredPoint;
    }
}
