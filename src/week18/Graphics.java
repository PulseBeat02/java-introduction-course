package week18;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Graphics {

  public static void main(String[] args) throws Exception {

    // Today is going to be a bit different. For your main header, add the "throws Exception"

    // WARMUP

    // What are two types of sets in Java?

    // How do we define a HashSet with the elements 2 and 5 in it?
    Set<Integer> set = new HashSet<>();
    set.add(2);
    set.add(5);

    // How is a HashSet different from a TreeSet?

    // How do we define a HashMap with a key -> value of 5, "hi"?
    Map<Integer, String> map = new HashMap<>();
    map.put(5, "hi");

    // SWING

    // Java is known for having a GUI framework. There are mainly two built in GUI frameworks
    // in Java. There is Swing and there is JavaFX. Swing is older than JavaFX and has very
    // different features compared to JavaFX, however, we will be learning Swing today as it
    // is important that every Java programmer knows about it.


    // JFRAME

    // In Swing, we have many elements of a GUI each called a component. A component could
    // be a button, a label, a panel, etc. There is also what is called a JFrame. The JFrame is
    // a window where you can place your components in. For example, if I wanted to create a
    // JFrame named frame, it would look like such:

    JFrame frame = new JFrame();

    // Just like most objects in Java, you can customize your JFrame. You can set the dimensions
    // of your frame.
    frame.setSize(500, 500);

    // You can set the close operation. The close operation basically means what will happen when
    // you click the X on the window. Normally, clicking the X will not exit the application, but
    // if you want to, you use EXIT_ON_CLOSE.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // JFrame.EXIT_ON_CLOSE is a constant. When we refer to a constant, it usually a class and then
    // the constant which is usually named in all caps. In this case, we pass in JFrame.EXIT_ON_CLOSE
    // as a constant to the method.

    // You can also set the layout of the JFrame. Layouts are a very organized way to place your
    // components. Think of layouts like in web development. In web development, you want to make
    // a website that can fit multiple screens. For example, the people visiting your website may be
    // visiting from an IPhone, whereas someone may visit from a computer, and you need to find a way
    // so that your website is dynamic and flexible with all of these different resolutions. Layouts
    // move your components accordingly based on the size of the window, which makes them very nice
    // and convenient to use.
    frame.setLayout(new FlowLayout());


    // JPanel

    // In Java, JPanel's are basically panels. Panels can also have components. You can also put
    // panels within panels. Panels are basically a way to organize all your components that you
    // add to it.
    JPanel panel = new JPanel();

    // Setting the panel to be visible
    panel.setVisible(true);


    // JLabel

    // JLabel's are a way to display text inside our window. They are basically labels that you
    // can use to display certain labels.

    // We can add JLabel into our JFrame. We define a new JLabel as so:
    JLabel label = new JLabel();

    // We can set the text of our label
    label.setText("Example Text");

    // We can even set the font of our text
    label.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

    // ALWAYS remember to call the setVisible method and pass in true, so you can see
    // your component!
    label.setVisible(true);

    // To add any component to your JFrame, use the add method from the JFrame
    frame.add(label);


    // JButton

    // JButton's are clickable buttons that can be added into your window.
    JButton button = new JButton();

    // You can set the text, font, etc
    button.setText("Button Text");
    button.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

    // Remember to set it to be visible!
    button.setVisible(true);

    // Add it to the JFrame
    frame.add(button);


    // Adding Images

    // Adding images are a bit more complex. When you add an image, you have to either get it
    // from a URL or from a file. For the sake of simplicity, let's use a URL. In Java, images
    // are stored in the memory as what are called "BufferedImage". You can load BufferedImage's
    // from a URL or a file.

    // We must first define a new URL for the image.
    URL url = new URL(
        "https://i.insider.com/5fd90d3c5c7c7c0018545a04?width=600&format=jpeg&auto=webp");

    // To read our URL into an image, we use ImageIO.read method to turn it into a BufferedImage
    BufferedImage bufferedImage = ImageIO.read(url);

    // Images are different in the sense that you load them in using JLabel's. One of the features
    // of JLabel is that you can use it to set an image. So if you want an image, define a JLabel
    // for it and set the icon to be an image.

    // Define a new JLabel
    JLabel image = new JLabel();

    // Create an icon from the BufferedImage as so
    ImageIcon icon = new ImageIcon(bufferedImage);

    // Set the icon to the JLabel
    image.setIcon(icon);

    // Set the label to be visible
    image.setVisible(true);

    // Add it to the JFrame
    frame.add(image);


    // JTextField

    // JTextField allows the user to enter some information into the field. For example, we can
    // define a JTextField as so
    JTextField field = new JTextField();

    // Customization
    field.setText("Type Here");
    field.setFont(new Font("Arial", Font.PLAIN, 20));

    // Setting visibility
    field.setVisible(true);

    // Adding to the frame
    frame.add(field);


    // JCheckBox

    // Adds a checkbox

    JCheckBox box = new JCheckBox();
    box.setText("Java Class");
    box.setVisible(true);
    frame.add(box);


    // JComboBox, JList, JMenu, it goes on. You can even create your own Java components if you
    // wanted to. Since Java is object-oriented programming, you could create a custom component
    // if you wanted to in order to add more complex features.

    // Did you know that Intellij IDEA uses Swing? The IDE you currently use right now is powered
    // by this GUI library that you are currently using. It just goes to show the possibilities
    // that you can do with this library.


    // PROBLEMS

    // (1) Create a JLabel that has the text "Hello". Set it to be visible and add it to the
    // JFrame.
    JLabel hello = new JLabel();
    hello.setText("Hello");
    hello.setVisible(true);

    frame.add(hello);

    // (2) Create a JLabel that adds an image of your choice from a URL. Set it to be visible
    // and add it to the JFrame.

    URL imageUrl = new URL("");
    BufferedImage buffered = ImageIO.read(imageUrl);
    ImageIcon imageIcon = new ImageIcon(bufferedImage);

    JLabel imageLabel = new JLabel();
    imageLabel.setIcon(imageIcon);
    imageLabel.setVisible(true);

    frame.add(imageLabel);


    frame.setVisible(true);
  }


}
