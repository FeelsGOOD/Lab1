package FirstLab;

import java.util.Scanner;

/**
 * Created by zandr on 28.03.2017.
 */
public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ModelFirstLab model = new ModelFirstLab(scanner.nextLine());
        ViewFirstLab view = new ViewFirstLab();
        ControllerFirstLab controller = new ControllerFirstLab(model, view);

        controller.updateView();
    }



}
