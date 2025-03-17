package Cs;

import android.content.Context;
import android.text.format.DateUtils;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LCs/c;", "LCs/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isoDateTime", "Ljava/time/Instant;", "b", "(Ljava/lang/String;)Ljava/time/Instant;", "instant", "a", "(Ljava/time/Instant;)Ljava/lang/String;", "Landroid/content/Context;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f79671a;

    public c(Context context) {
        C17542s.j(context, "context");
        this.f79671a = context;
    }

    public String a(Instant instant) {
        C17542s.j(instant, "instant");
        return DateUtils.getRelativeDateTimeString(this.f79671a, instant.toEpochMilli(), 60000, 604800000, 262144).toString();
    }

    public Instant b(String str) {
        C17542s.j(str, "isoDateTime");
        Instant instant = ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).toInstant();
        C17542s.i(instant, "toInstant(...)");
        return instant;
    }
}
