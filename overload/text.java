package overload;

public class text {
    public static void main(String[] args) {
        text p1 = new text();
        System.out.println(p1.sendMax(1.5, 1.6)); 
        System.out.println (p1.sendMax(1.9, 2.0, 3.55));
        System.out.println (p1.sendMax(1, 2));
    }
        public int sendMax(int i,int j) {
            return (i > j)? i : j;
        }
        public double sendMax(double i,double j) {
            return (i > j)? i:j;
        }
        public double sendMax(double i,double j,double z) {
            return (i > ((j>z)? j : z))? i:(j>z)? j : z; 
        }
}