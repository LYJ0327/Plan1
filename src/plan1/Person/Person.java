package plan1.Person;

import plan1.Transport.*;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/17 23:44
 * @Version: 1.0
 * @Modified by:
 */
public class Person {
    private String id;
    private String P_Name;
    private int P_Age;
    private String P_Sex;

    public void driveTranspot(Airship airship){
        System.out.println("driving airship"+airship.getId());
    }
    public void driveTranspot(Bicycle bicycle){
        System.out.println("driving airship"+bicycle.getId());
    }
    public void driveTranspot(Car car){
        System.out.println("driving airship"+car.getId());
    }
    public void driveTranspot(Hotbollon hotbollon){
        System.out.println("driving airship"+hotbollon.getId());
    }
    public void driveTranspot(Hovercraft hovercraft){
        System.out.println("driving airship"+hovercraft.getId());
    }
    public void driveTranspot(Motorcycle motorcycle){
        System.out.println("driving airship"+motorcycle.getId());
    }
    public void driveTranspot(Plane plane){
        System.out.println("driving airship"+plane.getId());
    }
    public void driveTranspot(Ship ship){
        System.out.println("driving airship"+ship.getId());
    }
    public void driveTranspot(Submarine submarine){
        System.out.println("driving airship"+submarine.getId());
    }
    public Person(){

    }
    public Person(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setId (String id){
        this.id = id;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int p_Age) {
        P_Age = p_Age;
    }

    public String getP_Sex() {
        return P_Sex;
    }

    public void setP_Sex(String p_Sex) {
        P_Sex = p_Sex;
    }
}
