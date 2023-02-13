
import java.util.*;
import javax.swing.*;

class Vector4 {
    public static void main(String[] args) {
        Vector<Integer> x = new Vector<Integer>();
        int val = 0, i = 0;tot = 0;
        while (true) {
            try

            {
                val = Integer.parseInt(JOptionPane.showInputDialog(null, "value"));

            } catch (Exception e) {
                continue;
            }
            if (val == 0)
                break;
            x.add(val);
        }

        JOptionPane.showMessageDialog(null, "data\n" + x);
        String str = "data\n";
        while (i < x.size()) {
            str = str + " " + x.get(i);
        }
        JOptionPane.showMessageDialog(null, str);
        ListIterator<Integer> xit = x.listIterator();
        str = "data:\n";
        while (xit.hasNext()) {
            str = str + " " + xit.next();
        }
        JOptionPane.showMessageDialog(null, str);
        str = "data\n";
        while (xit.hasPrevious()) {
            str = str + " " + xit.previous();
        }
        JOptionPane.showMessageDialog(null, str);

    }

}
