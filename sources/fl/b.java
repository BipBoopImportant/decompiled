package Fl;

import Il.a;
import ep.C11255a;
import ep.C11256b;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"LFl/b;", "Lep/b;", "LIl/a;", "appConfigApi", "Lep/a;", "dateFormatPattern", "<init>", "(LIl/a;Lep/a;)V", "", "pattern", "Ljava/time/format/DateTimeFormatter;", "g", "(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;", "h", "()Ljava/time/format/DateTimeFormatter;", "d", "c", "Ljava/time/DayOfWeek;", "day", "f", "(Ljava/time/DayOfWeek;)Ljava/lang/String;", "Ljava/time/LocalDateTime;", "date", "b", "(Ljava/time/LocalDateTime;Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/LocalDate;", "e", "(Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "dateTime", "a", "(Ljava/time/LocalDateTime;)Ljava/lang/String;", "LIl/a;", "Lep/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11256b {

    /* renamed from: a  reason: collision with root package name */
    private final a f80896a;

    /* renamed from: b  reason: collision with root package name */
    private final C11255a f80897b;

    public b(a aVar, C11255a aVar2) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "dateFormatPattern");
        this.f80896a = aVar;
        this.f80897b = aVar2;
    }

    private final DateTimeFormatter g(String str) {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(this.f80897b.c(this.f80896a.A(), str), this.f80896a.A());
        C17542s.i(ofPattern, "ofPattern(...)");
        return ofPattern;
    }

    private final DateTimeFormatter h() {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(this.f80897b.a(this.f80896a.A()));
        C17542s.i(ofPattern, "ofPattern(...)");
        return ofPattern;
    }

    public String a(LocalDateTime localDateTime) {
        C17542s.j(localDateTime, "dateTime");
        String format = localDateTime.format(h());
        C17542s.i(format, "format(...)");
        return format;
    }

    public String b(LocalDateTime localDateTime, String str) {
        C17542s.j(localDateTime, "date");
        C17542s.j(str, "pattern");
        String format = localDateTime.format(g(str));
        C17542s.i(format, "format(...)");
        return format;
    }

    public DateTimeFormatter c() {
        Locale A10 = this.f80896a.A();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, (FormatStyle) null, IsoChronology.INSTANCE, A10), A10);
        C17542s.i(ofPattern, "ofPattern(...)");
        return ofPattern;
    }

    public DateTimeFormatter d() {
        Locale A10 = this.f80896a.A();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(DateTimeFormatterBuilder.getLocalizedDateTimePattern((FormatStyle) null, FormatStyle.SHORT, IsoChronology.INSTANCE, A10), A10);
        C17542s.i(ofPattern, "ofPattern(...)");
        return ofPattern;
    }

    public String e(LocalDate localDate, String str) {
        C17542s.j(localDate, "date");
        C17542s.j(str, "pattern");
        String format = localDate.format(g(str));
        C17542s.i(format, "format(...)");
        return format;
    }

    public String f(DayOfWeek dayOfWeek) {
        C17542s.j(dayOfWeek, "day");
        String displayName = dayOfWeek.getDisplayName(TextStyle.FULL, this.f80896a.A());
        C17542s.i(displayName, "getDisplayName(...)");
        return displayName;
    }
}
