import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);

        Surface surface = new Surface();
        win.add(surface);
        win.pack();
        win.setVisible(true);
    }
}