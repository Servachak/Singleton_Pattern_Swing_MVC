import com.servachak.controller.Controller;
import com.servachak.model.Model;
import com.servachak.view.View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    private static void runApp() {

        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(view, model);
        view.setLoginListener(controller);
    }
}
