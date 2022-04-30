package CirclePassObjectText;

public class PassObject {
    public static void main(String[] args) {
        PassObject text = new PassObject();
        Circle c = new Circle();
        text.printAreas(c, 5);
    }
    public void printAreas(Circle c,int time) {
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(i+"\t\t"+c.findArea()); 
        }
    }
}