import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    private Sim sim;
    public void setSim(Sim sim){
        this.sim=sim;
    };

    public void calling(){
        sim.calling();
    }

}
