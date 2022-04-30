/*
 * @Description: ��ʾ
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-01-27 19:27:16
 * @LastEditors: ������
 * @LastEditTime: 2022-01-29 12:20:51
 */
package project2Text.ui;

import project2Text.bean.Customer;
import project2Text.service.CustomerList;
import project2Text.uti.CMUtility;

public class CustomerView {

    /**
     * @description: ����CustomerViewʵ���������� enterMainMenu()������ִ�г���
     * @param {String[]} args
     * @return {*}
     * @author: ������
     */
    public static void main(String[] args) {
        CustomerView stu1 = new CustomerView();
        stu1.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("name", 'Ů', 1, "1233555", "111111");
        customerList.addCustomer(customer);
    }

    /**
     * @description: ��ʾ���˵�����Ӧ�û����룬 �����û������ֱ����������Ӧ�ĳ�Ա��������addNewCustomer���� ����ɿͻ���Ϣ����
     * @param {*}
     * @return {*}
     * @author: ������
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        do {
            System.out.println("\n--------------�ͻ���Ϣ����ϵͳ--------------");
            System.out.println("              1.��ӿͻ�");
            System.out.println("              2.�޸Ŀͻ�");
            System.out.println("              3.ɾ���ͻ�");
            System.out.println("              4.�ͻ��б�");
            System.out.println("              5.�˳�ϵͳ");
            System.out.print("              ��ѡ��(1-5):");
            char menu = CMUtility.readMenuSelection();
            System.out.println("--------------�ͻ���Ϣ����ϵͳ--------------");
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("ȷ���Ƿ��˳�(Y/N):");
                    char a = CMUtility.readConfirmSelection();
                    if (a == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        } while (isFlag);

    }

    /**
     * @description: ��ӿͻ�
     * @param {*}
     * @return {*}
     * @author: ������
     */
    private void addNewCustomer() {
        System.out.println("---------------��ӿͻ�---------------");
        Customer customer = new Customer();
        System.out.print("\n����:");
        customer.setName(CMUtility.readString(10));
        System.out.print("\n�Ա�:");
        customer.setGender(CMUtility.readChar());
        System.out.print("\n����:");
        customer.setAge(CMUtility.readInt());
        System.out.print("\n�绰:");
        customer.setPhone(CMUtility.readString(11));
        System.out.print("\n����:");
        customer.setEmail(CMUtility.readString(15));
        boolean isFlag = customerList.addCustomer(customer);
        if (isFlag) {
            System.out.println("---------------������---------------");
        } else {
            System.out.println("------------�ͻ����������ʧ��---------");
        }

    }

    /**
     * @description: �޸Ŀͻ�
     * @param {*}
     * @return {*}
     * @author: ������
     */
    private void modifyCustomer() {
        System.out.println("\n---------------�޸Ŀͻ�---------------");
        for (;;) {
            System.out.print("\n��ѡ����޸Ŀͻ����(-1�˳�)��");
            int number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("�޷��ҵ�ָ���Ŀͻ�");
            } else {
                System.out.print("\n����(" + customer.getName() + "):");
                customer.setName(CMUtility.readString(10, customer.getName()));
                System.out.print("\n�Ա�(" + customer.getGender() + "):");
                customer.setGender(CMUtility.readChar(customer.getGender()));
                System.out.print("\n����(" + customer.getAge() + "):");
                customer.setAge(CMUtility.readInt(customer.getAge()));
                System.out.print("\n�绰(" + customer.getPhone() + "):");
                customer.setPhone(CMUtility.readString(11, customer.getPhone()));
                System.out.print("\n����(" + customer.getEmail() + "):");
                customer.setEmail(CMUtility.readString(15, customer.getEmail()));
                customerList.replaceCustomer(number - 1, customer);
                System.out.println("---------------�޸����---------------");
                break;
            }
        }

    }

    /**
     * @description: ɾ���ͻ�
     * @param {*}
     * @return {*}
     * @author: ������
     */
    private void deleteCustomer() {
        System.out.println("\n---------------ɾ���ͻ�---------------");
        for(;;){
            System.out.print("������Ҫɾ���Ŀͻ�(-1�˳�):");
            int number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            else{
                Customer customer = customerList.getCustomer(number-1);
                if (customer == null){
                    System.out.println("�ͻ������ڣ�ɾ��ʧ��");
                }
                else {
                    System.out.print("ȷ��ɾ��(Y/N):");
                    char a = CMUtility.readConfirmSelection();
                    if (a == 'Y'){
                        customerList.deleteCustomer(number-1);
                        break;
                    }
                }
            }
        }
    }

    /**
     * @description: �ͻ��б�
     * @param {*}
     * @return {*}
     * @author: ������
     */
    private void listAllCustomers() {
        System.out.println(
                "\n-------------------------------------------�ͻ��б�-------------------------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("\t\t\t\t\t\t\t\t\t\tû�пͻ���Ϣ");
        } else {
            System.out.println("���\t����\t\t�Ա�\t\t����\t\t\t�绰\t\t\t����");
            Customer[] cust = customerList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                System.out.println(i + 1 + "\t" + cust[i].getName() + "\t\t" + cust[i].getGender() + "\t\t"
                        + cust[i].getAge() + "\t\t\t" + cust[i].getPhone() + "\t\t\t" + cust[i].getEmail());
            }
        }
        System.out.println("-------------------------------------------�ͻ��б����----------------------------------------");
    }

}