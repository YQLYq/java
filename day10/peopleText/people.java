package day10.peopleText;

public class people {
    public static void main(String[] args) {
        //对象建立 ：new + 构造器
        peopleText p1 = new peopleText("nn");
        p1.getname();
    }
}
class peopleText {
    String name;
    //构造器
    peopleText(){

    }
    peopleText(String name1){
        name = name1;
    }

    public void getname() {
        System.out.println(name);
    }
}