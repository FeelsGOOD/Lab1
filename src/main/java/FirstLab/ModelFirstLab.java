package FirstLab;

import javax.swing.text.View;

/**
 * Created by zandr on 28.03.2017.
 */
public class ModelFirstLab {
    private String Greetings;



//    public ModelFirstLab(){
//
//       Greetings = "Hello world";
//
//    }

    public ModelFirstLab(String Greetings){
        this.Greetings = Greetings;
    }


    public String getGreetings() {
        return Greetings;
    }

    public void setGreetings(String greetings) {
        this.Greetings = greetings;
    }


}
