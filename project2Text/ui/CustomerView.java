/*
 * @Description: 显示
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-01-27 19:27:16
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-01-29 12:20:51
 */
package project2Text.ui;

import project2Text.bean.Customer;
import project2Text.service.CustomerList;
import project2Text.uti.CMUtility;

public class CustomerView {

    /**
     * @description: 创建CustomerView实例，并调用 enterMainMenu()方法以执行程序。
     * @param {String[]} args
     * @return {*}
     * @author: 阳秦林
     */
    public static void main(String[] args) {
        CustomerView stu1 = new CustomerView();
        stu1.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("name", '女', 1, "1233555", "111111");
        customerList.addCustomer(customer);
    }

    /**
     * @description: 显示主菜单，响应用户输入， 根据用户操作分别调用其他相应的成员方法（如addNewCustomer）， 以完成客户信息处理。
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        do {
            System.out.println("\n--------------客户信息管理系统--------------");
            System.out.println("              1.添加客户");
            System.out.println("              2.修改客户");
            System.out.println("              3.删除客户");
            System.out.println("              4.客户列表");
            System.out.println("              5.退出系统");
            System.out.print("              请选择(1-5):");
            char menu = CMUtility.readMenuSelection();
            System.out.println("--------------客户信息管理系统--------------");
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
                    System.out.print("确定是否退出(Y/N):");
                    char a = CMUtility.readConfirmSelection();
                    if (a == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        } while (isFlag);

    }

    /**
     * @description: 添加客户
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */
    private void addNewCustomer() {
        System.out.println("---------------添加客户---------------");
        Customer customer = new Customer();
        System.out.print("\n名字:");
        customer.setName(CMUtility.readString(10));
        System.out.print("\n性别:");
        customer.setGender(CMUtility.readChar());
        System.out.print("\n年龄:");
        customer.setAge(CMUtility.readInt());
        System.out.print("\n电话:");
        customer.setPhone(CMUtility.readString(11));
        System.out.print("\n邮箱:");
        customer.setEmail(CMUtility.readString(15));
        boolean isFlag = customerList.addCustomer(customer);
        if (isFlag) {
            System.out.println("---------------添加完成---------------");
        } else {
            System.out.println("------------客户已满，添加失败---------");
        }

    }

    /**
     * @description: 修改客户
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */
    private void modifyCustomer() {
        System.out.println("\n---------------修改客户---------------");
        for (;;) {
            System.out.print("\n请选择待修改客户编号(-1退出)：");
            int number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定的客户");
            } else {
                System.out.print("\n名字(" + customer.getName() + "):");
                customer.setName(CMUtility.readString(10, customer.getName()));
                System.out.print("\n性别(" + customer.getGender() + "):");
                customer.setGender(CMUtility.readChar(customer.getGender()));
                System.out.print("\n年龄(" + customer.getAge() + "):");
                customer.setAge(CMUtility.readInt(customer.getAge()));
                System.out.print("\n电话(" + customer.getPhone() + "):");
                customer.setPhone(CMUtility.readString(11, customer.getPhone()));
                System.out.print("\n邮箱(" + customer.getEmail() + "):");
                customer.setEmail(CMUtility.readString(15, customer.getEmail()));
                customerList.replaceCustomer(number - 1, customer);
                System.out.println("---------------修改完成---------------");
                break;
            }
        }

    }

    /**
     * @description: 删除客户
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */
    private void deleteCustomer() {
        System.out.println("\n---------------删除客户---------------");
        for(;;){
            System.out.print("请输入要删除的客户(-1退出):");
            int number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            else{
                Customer customer = customerList.getCustomer(number-1);
                if (customer == null){
                    System.out.println("客户不存在，删除失败");
                }
                else {
                    System.out.print("确定删除(Y/N):");
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
     * @description: 客户列表
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */
    private void listAllCustomers() {
        System.out.println(
                "\n-------------------------------------------客户列表-------------------------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t没有客户信息");
        } else {
            System.out.println("编号\t姓名\t\t性别\t\t年龄\t\t\t电话\t\t\t邮箱");
            Customer[] cust = customerList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                System.out.println(i + 1 + "\t" + cust[i].getName() + "\t\t" + cust[i].getGender() + "\t\t"
                        + cust[i].getAge() + "\t\t\t" + cust[i].getPhone() + "\t\t\t" + cust[i].getEmail());
            }
        }
        System.out.println("-------------------------------------------客户列表完成----------------------------------------");
    }

}