/*
 * @Description: 服务相关
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-01-27 19:27:01
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-01-28 19:52:51
 */
package project2Text.service;

import project2Text.bean.Customer;

public class CustomerList {
    private Customer[] customers; //保存客户对象的数组
    private int total = 0;//统计客户数量
    
    public CustomerList() {
    }

    /**
     * @description: 构造器，用来初始化customers数组
     * @param {int} totalCustomer:指定customers数组的最大空间
     * @return {*}
     * @author: 阳秦林
     */    
    public CustomerList(int totalCustomer) {
       customers = new Customer[totalCustomer];
    }

    /**
     * @description: 将参数customer添加到数组中最后一个客户对象记录之后
     * @param {Customer} customer :指定要添加的客户对象
     * @return {boolean}:添加成功返回true；false表示数组已满，无法添加
     * @author: 阳秦林
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
     * @description: 用参数customer替换数组中由index指定的对象
     * @param {int} index:指定替换的新客户对象
     * @param {Customer} cust:指定所替换对象在数组中的位置，从0开始
     * @return {boolean}替换成功返回true；false表示索引无效，无法替换
     * @author: 阳秦林
     */    
    public boolean replaceCustomer(int index,Customer cust){
        if (index >= total || index < 0){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @description: 从数组中删除参数index指定索引位置的客户对象记录
     * @param {int} index:指定所删除对象在数组中的索引位置，从0开始
     * @return {boolean}删除成功返回true；false表示索引无效，无法删除
     * @author: 阳秦林
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
     * @description: 返回数组中记录的所有客户对象
     * @param {*}
     * @return {Customer[]}数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     * @author: 阳秦林
     */    
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
         for (int i = 0; i < total; i++) {
             custs[i] = customers[i];
         }
         return custs;
    }

    /**
     * @description: 返回参数index指定索引位置的客户对象记录
     * @param {int} index:指定所要获取的客户在数组中的索引位置，从0开始
     * @return {Customer}封装了客户信息的Customer对象
     * @author: 阳秦林
     */    
    public Customer getCustomer(int index){
        if (index >= total || index < 0){
            return null;
        }
        return customers[index];
    }

    /**
     * @description: 返回客户数量
     * @param {*}
     * @return {int}返回客户数量
     * @author: 阳秦林
     */    
    public int getTotal(){
        return total;
    }

}