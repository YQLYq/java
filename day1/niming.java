package day1;

    public class niming {
        public static void main(String[] args) {
            //匿名使用方法
            new Phone ().sendEmail();
            new Phone().playGame();
            //匿名对象只能使用一次，下次再用为另一个对象
            new Phone().price = 1000;
            new Phone().showPrice(); // 结果0.0
            //匿名对象使用技巧
            PhoneMall mall = new PhoneMall();
            mall.show(new Phone());
        }
    }

    class PhoneMall {
        public void show (Phone phone){
            phone.sendEmail();
            phone.playGame();
        }
    }

    class Phone{
        double price;
        public void sendEmail (){
            System.out.println("发送邮箱");
        }
        public void playGame (){
            System.out.println("打游戏");
        }
        public void showPrice (){
            System.out.println("该手机的价格："+price);
        }
    }
