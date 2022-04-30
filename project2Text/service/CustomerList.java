/*
 * @Description: �������
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-01-27 19:27:01
 * @LastEditors: ������
 * @LastEditTime: 2022-01-28 19:52:51
 */
package project2Text.service;

import project2Text.bean.Customer;

public class CustomerList {
    private Customer[] customers; //����ͻ����������
    private int total = 0;//ͳ�ƿͻ�����
    
    public CustomerList() {
    }

    /**
     * @description: ��������������ʼ��customers����
     * @param {int} totalCustomer:ָ��customers��������ռ�
     * @return {*}
     * @author: ������
     */    
    public CustomerList(int totalCustomer) {
       customers = new Customer[totalCustomer];
    }

    /**
     * @description: ������customer��ӵ����������һ���ͻ������¼֮��
     * @param {Customer} customer :ָ��Ҫ��ӵĿͻ�����
     * @return {boolean}:��ӳɹ�����true��false��ʾ�����������޷����
     * @author: ������
     */    
    public boolean addCustomer (Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers [total] = customer;
        total++;
        return true;
    }

    /**
     * @description: �ò���customer�滻��������indexָ���Ķ���
     * @param {int} index:ָ���滻���¿ͻ�����
     * @param {Customer} cust:ָ�����滻�����������е�λ�ã���0��ʼ
     * @return {boolean}�滻�ɹ�����true��false��ʾ������Ч���޷��滻
     * @author: ������
     */    
    public boolean replaceCustomer(int index,Customer cust){
        if (index >= total || index < 0){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @description: ��������ɾ������indexָ������λ�õĿͻ������¼
     * @param {int} index:ָ����ɾ�������������е�����λ�ã���0��ʼ
     * @return {boolean}ɾ���ɹ�����true��false��ʾ������Ч���޷�ɾ��
     * @author: ������
     */    
    public boolean deleteCustomer(int index){
        if (index >= total || index < 0) {
            return false;
        }
        for (int i = index;i < total - 1;i++){
            customers[i] = customers[i+1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    /**
     * @description: ���������м�¼�����пͻ�����
     * @param {*}
     * @return {Customer[]}�����а����˵�ǰ���пͻ����󣬸����鳤������������ͬ��
     * @author: ������
     */    
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
         for (int i = 0; i < total; i++) {
             custs[i] = customers[i];
         }
         return custs;
    }

    /**
     * @description: ���ز���indexָ������λ�õĿͻ������¼
     * @param {int} index:ָ����Ҫ��ȡ�Ŀͻ��������е�����λ�ã���0��ʼ
     * @return {Customer}��װ�˿ͻ���Ϣ��Customer����
     * @author: ������
     */    
    public Customer getCustomer(int index){
        if (index >= total || index < 0){
            return null;
        }
        return customers[index];
    }

    /**
     * @description: ���ؿͻ�����
     * @param {*}
     * @return {int}���ؿͻ�����
     * @author: ������
     */    
    public int getTotal(){
        return total;
    }

}