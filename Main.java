package studentmanager;

import view.StudentFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentFrame().setVisible(true));
    }
}
