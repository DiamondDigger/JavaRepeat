package alexei.anatsky.ITMO_konspect.AppletPackage;

import java.applet.Applet;
import java.awt.*;

public class AppletExample extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World from applet", 250, 225);
        g.drawOval(300, 300, 250, 50);
    }
}
