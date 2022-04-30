/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-02-06 16:05:20
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-02-06 16:49:21
 */
package day11.Text1;

public class ManKind {
    public int sex;
    public int salary;

    /**
     * @description: 判断是否男人或女人
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */    
    public void manOrWoman (){
        // if (sex == 0){
        //     System.out.println("woman");
        // }
        // else if (sex == 1) {
        //     System.out.println("man");
        // }
        // else {
        //     return;
        // }
        String a = (sex == 0) ? "Woman":"man";
        System.out.println(a);
    }
    
    /**
     * @description: 判断有无工作
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */    
    public void employeed (){
        // if (salary == 0){
        //     System.out.println("no job");
        // }
        // else if (salary == 1){
        //     System.out.println("job");
        // }
        // else {
        //     return;
        // }
        String a = (sex == 0) ? "no job":"job";
        System.out.println(a);
    }
}/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-02-06 16:05:20
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-02-06 16:05:21
 */
