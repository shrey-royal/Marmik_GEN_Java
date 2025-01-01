import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class IIB_T4 {
    private ZoneId src;
    private ZoneId tgt;

    {
        src = ZoneId.of("UTC");
        tgt = ZoneId.of("Asia/Kolkata");
    }

    public IIB_T4() { }

    public IIB_T4(String src, String tgt) {
        this.src = ZoneId.of(src);
        this.tgt = ZoneId.of(tgt);
    }

    public String convertTime(String time) {
        LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        ZonedDateTime srcDateTime = ZonedDateTime.of(localDateTime, src);
        ZonedDateTime tgtDateTime = srcDateTime.withZoneSameInstant(tgt);

        return tgtDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z"));
    }

    public static void main(String[] args) {
        IIB_T4 defaultConvertor = new IIB_T4();
        System.out.println("Default Convertor: " + defaultConvertor.convertTime("2025-01-01 12:00"));

        IIB_T4 customConvertor = new IIB_T4("UTC", "America/New_York");
        System.out.println("Custom Convertor: " + customConvertor.convertTime("2025-01-01 12:00"));
        
    }
}
