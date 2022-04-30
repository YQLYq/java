/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ÑôÇØÁÖ
 * @Date: 2022-01-30 10:09:13
 * @LastEditors: ÑôÇØÁÖ
 * @LastEditTime: 2022-01-30 12:08:27
 */
package project2Text2.serivice;

import project2Text.bean.Customer;

public class CustomerList {
    private Customer []customers;
    private int total;
    
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public CustomerList() {
    }
    
    public boolean addCustomer (Customer customer){
        if (total >= customers.length){
            
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean deleteCustomer (int index){
        if (index >= total || index < 0){
            return false;
        }
        for (int i = index; i < total-1; i++){
            customers[i] = customers[i+1];
        }
        return true;
    }
}
