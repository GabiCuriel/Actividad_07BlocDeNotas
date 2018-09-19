
package main;

import view.ViewLyE;
import model.ModelLyE;
import controller.ControllerLyE;

public class Main {
    private static ViewLyE viewLyE;
    private static ModelLyE modelLyE;
    private static ControllerLyE controllerLyE;
    
    public static void main(String[] args)
    {
        viewLyE = new ViewLyE();
        modelLyE = new ModelLyE();
        controllerLyE = new ControllerLyE(viewLyE, modelLyE);
    }
}