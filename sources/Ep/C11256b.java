package ep;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lep/b;", "", "Ljava/time/format/DateTimeFormatter;", "d", "()Ljava/time/format/DateTimeFormatter;", "c", "Ljava/time/DayOfWeek;", "day", "", "f", "(Ljava/time/DayOfWeek;)Ljava/lang/String;", "Ljava/time/LocalDateTime;", "date", "pattern", "b", "(Ljava/time/LocalDateTime;Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/LocalDate;", "e", "(Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "dateTime", "a", "(Ljava/time/LocalDateTime;)Ljava/lang/String;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ep.b  reason: case insensitive filesystem */
public interface C11256b {
    String a(LocalDateTime localDateTime);

    String b(LocalDateTime localDateTime, String str);

    DateTimeFormatter c();

    DateTimeFormatter d();

    String e(LocalDate localDate, String str);

    String f(DayOfWeek dayOfWeek);
}
