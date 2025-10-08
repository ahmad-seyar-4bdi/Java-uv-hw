/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.TimeZone;
import java.util.Date;
        import java.text.SimpleDateFormat;
/**
 *
 * @author Seyar Abdi
 */
public class Timezone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            SimpleDateFormat ss = new SimpleDateFormat("HH:MM:SS");
    Date now = new Date();

        ss.setTimeZone(TimeZone.getTimeZone("Asia/Korea"));

        System.out.println("Korea : "+ss.format(now));
        ss.setTimeZone(TimeZone.getTimeZone("Asia/Saudi"));
        System.out.println("Saudi : "+ ss.format(now));
        ss.setTimeZone(TimeZone.getTimeZone("Asia/Kabul"));
        System.out.println("Kabul : "+ ss.format(now));
        ss.setTimeZone(TimeZone.getTimeZone("Asia/Iran"));
        System.out.println("Iran : "+ ss.format(now));
        ss.setTimeZone(TimeZone.getTimeZone("Asia/India"));
        System.out.println("India : "+ ss.format(now));
        ss.setTimeZone(TimeZone.getTimeZone("Asia/Pakistan"));
        System.out.println("Pakistan : "+ ss.format(now));
    }
    
}
