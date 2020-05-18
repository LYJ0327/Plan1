package plan1;

import plan1.Person.Person;
import plan1.Transport.Airship;
import plan1.Transport.Hotbollon;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/4/8 10:33
 * @Version: 1.0
 * @Modified by:
 */
public class Main {
    public static void main(String[] args){
        Person lisa=new Person("0327");

        Airship lisaAirship = new Airship("1997");
        Hotbollon lisaHotbollon=new Hotbollon("0808");
        
        lisa.driveTranspot(lisaAirship);
        lisa.driveTranspot(lisaHotbollon);
    }
}
