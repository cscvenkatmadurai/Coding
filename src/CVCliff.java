import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by HARISH on 8/8/2015.
 */
public class CVCliff {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double ab, ac, m, phi, min, max, thirdSideTriangle, p, areaTriangle, areaofsector, bc,height;
        ab = kb.nextDouble();
        ac = kb.nextDouble();
        m = kb.nextDouble();
        phi = kb.nextDouble();
        min = Math.min(ab, ac);
        max = Math.max(ab, ac);
        thirdSideTriangle = (min*min+min * min) - (2 * min * min * Math.cos(Math.toRadians(phi)));
        thirdSideTriangle = Math.sqrt(thirdSideTriangle);
        p = (min + min + thirdSideTriangle) / 2;
        areaTriangle = Math.sqrt(p * (p - min) * (p - min) * (p - thirdSideTriangle));
        areaofsector = (phi * 3.14 * m * m) / 360;
        bc = ((min * min) + (max * max)) - (2 * min * max * Math.cos(Math.toRadians(phi)));
        bc = Math.sqrt(bc);
        DecimalFormat df = new DecimalFormat("##############################################.00000");
        System.out.println(df.format(areaTriangle - areaofsector));
        System.out.println(df.format(bc));
    }
}
