package day10.peopleText;

public class people {
    public static void main(String[] args) {
        //������ ��new + ������
        peopleText p1 = new peopleText("nn");
        p1.getname();
    }
}
class peopleText {
    String name;
    //������
    peopleText(){

    }
    peopleText(String name1){
        name = name1;
    }

    public void getname() {
        System.out.println(name);
    }
}