package day1;

    public class niming {
        public static void main(String[] args) {
            //����ʹ�÷���
            new Phone ().sendEmail();
            new Phone().playGame();
            //��������ֻ��ʹ��һ�Σ��´�����Ϊ��һ������
            new Phone().price = 1000;
            new Phone().showPrice(); // ���0.0
            //��������ʹ�ü���
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
            System.out.println("��������");
        }
        public void playGame (){
            System.out.println("����Ϸ");
        }
        public void showPrice (){
            System.out.println("���ֻ��ļ۸�"+price);
        }
    }
