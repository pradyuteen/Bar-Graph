
package bargraph;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;




public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
        

        String input = "";
        System.out.println("Please enter the Data: ");
        input = br.readLine();

        System.out.println(input);

        int counter;
        String [] vals=input.split(" ");
        int [] data = new int[vals.length];
        int i;
        for (i=0;i<vals.length;i++){
            data[i] = Integer.parseInt(vals[i]);
        }
        counter=i;


        int maxH = -1;
        for (int j = 2; j < data.length; j++)
            if (maxH < data[j])
                maxH = data[j];

        
        
        int barW = (data[0] - (data.length - 1) * 5) / (data.length - 2);

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(data[0],data[1]);

        int x =  5;
        for (int k = 2; k < data.length; k++){
            double fraction = (double) (data[k] / maxH);
            int barH = (int) (fraction * (data[1] - 20));
            //int y = data[1];

            f.getContentPane().add(new Bar1(x, data[1], barW, data[1]-barH));
            x = (k-1)*(barW + 5);

        }

        f.setVisible(true);
        
    }
}

