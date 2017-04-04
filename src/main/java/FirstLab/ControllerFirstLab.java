package FirstLab;

/**
 * Created by zandr on 28.03.2017.
 */
public class ControllerFirstLab {

    private ModelFirstLab model;
    private ViewFirstLab view;


    public ControllerFirstLab(ModelFirstLab model, ViewFirstLab view) {
        this.model = model;
        this.view = view;
    }

//   public void setGreetings(String Greetings){
//        model.setGreetings(Greetings);
//   }

//   public String getGreetings(){
//       return model.getGreetings();
//   }
//
   public void updateView(){
        view.printGreetings(model.getGreetings());
    }

}
