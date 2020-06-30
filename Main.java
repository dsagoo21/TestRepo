
import javax.swing.JOptionPane;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        String[] DevOpsClass = new String[31];
        DevOpsClass[0] ="Abby Truong";
        DevOpsClass[1] ="Ahmed Mujtaba";
        DevOpsClass[2] ="Azeez Temitope Olanrewaju";
        DevOpsClass[3] ="Deep";
        DevOpsClass[4] ="Diming Chu";
        DevOpsClass[5] ="Dongshuo Li";
        DevOpsClass[6] ="Honorinicy";
        DevOpsClass[7] ="Jason";
        DevOpsClass[8] ="Junyu Liu";
        DevOpsClass[9] ="Kelly Liu";
        DevOpsClass[10] ="Kinjan";
        DevOpsClass[11] ="Kun Li";
        DevOpsClass[12] ="Muhammed Umar";
        DevOpsClass[13] ="Oaz";
        DevOpsClass[14] ="PQ";
        DevOpsClass[15] ="Prithviatani";
        DevOpsClass[16] ="Richard";
        DevOpsClass[17] ="Sahil Slngh Sandhu";
        DevOpsClass[18] ="Samuel Yang";
        DevOpsClass[19] ="Scott(Shi-Kai) Jhou";
        DevOpsClass[20] ="Shahbaz Mansahia";
        DevOpsClass[21] ="Shahriar Kabir";
        DevOpsClass[22] ="Shakur";
        DevOpsClass[23] ="Shrina Patel";
        DevOpsClass[24] ="Siyu Qiu";
        DevOpsClass[25] ="Siyu Lei";
        DevOpsClass[26] ="Sumid";
        DevOpsClass[27] ="Tao";
        DevOpsClass[28] ="Trivediakshay";
        DevOpsClass[29] ="Yan Huang";
        DevOpsClass[30] ="Zhaosaitong";



        Random r=new Random();
        int randomNumber=r.nextInt(DevOpsClass.length);
        System.out.println(DevOpsClass[randomNumber]);

        JOptionPane.showMessageDialog(null , "The random student selected is :"+  (DevOpsClass[randomNumber]));


    }
}
