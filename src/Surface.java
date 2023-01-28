import javax.swing.*;
import java.awt.*;

public class Surface extends JPanel
{
    public Surface()
    {

    }

    public Dimension getPreferredSize()
    {
        return new Dimension(Config.VIEW_WIDTH, Config.VIEW_HEIGHT);
    }
}
