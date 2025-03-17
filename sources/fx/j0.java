package fx;

import KJ.C15985a;
import KJ.C15987c;
import YH.C16877v;
import YH.U;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rI.C17853c;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001c\u0010\u000f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0015¨\u0006\""}, d2 = {"Lfx/j0;", "", "<init>", "()V", "Ljava/time/format/DateTimeFormatter;", "b", "Ljava/time/format/DateTimeFormatter;", "c", "()Ljava/time/format/DateTimeFormatter;", "formatter", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "Ljava/time/LocalDateTime;", "now", "d", "xAxisStartTime", "LKJ/c;", "Lfx/m;", "e", "LKJ/c;", "getBarDataEmpty", "()LKJ/c;", "barDataEmpty", "Lfx/a;", "f", "Lfx/a;", "getXAxisData", "()Lfx/a;", "xAxisData", "", "", "()Ljava/util/List;", "randomPercentList", "barData", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f127106a;

    /* renamed from: b  reason: collision with root package name */
    private static final DateTimeFormatter f127107b;

    /* renamed from: c  reason: collision with root package name */
    private static final LocalDateTime f127108c;

    /* renamed from: d  reason: collision with root package name */
    private static final LocalDateTime f127109d;

    /* renamed from: e  reason: collision with root package name */
    private static final C15987c<C14470m> f127110e;

    /* renamed from: f  reason: collision with root package name */
    private static final C14458a f127111f = new C14458a(new i0(), 0.0f, 0.0f, 0, 14, (DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f127112g = 8;

    static {
        j0 j0Var = new j0();
        f127106a = j0Var;
        DateTimeFormatter withLocale = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        C17542s.i(withLocale, "withLocale(...)");
        f127107b = withLocale;
        LocalDateTime now = LocalDateTime.now();
        f127108c = now;
        f127109d = now.withHour(9).truncatedTo(ChronoUnit.HOURS);
        C15987c<C14470m> b10 = j0Var.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (C14470m b11 : b10) {
            arrayList.add(C14470m.b(b11, 5.0f, (Float) null, (String) null, 4, (Object) null));
        }
        f127110e = C15985a.h(arrayList);
    }

    private j0() {
    }

    /* access modifiers changed from: private */
    public static final String e(int i10) {
        String format = f127109d.plusHours((long) i10).format(f127107b);
        C17542s.i(format, "format(...)");
        return format;
    }

    public final C15987c<C14470m> b() {
        Iterable d10 = d();
        ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
        int i10 = 0;
        for (Object next : d10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            float floatValue = ((Number) next).floatValue();
            arrayList.add(new C14470m(floatValue, i10 == 5 ? Float.valueOf(floatValue / ((float) 2)) : null, "accessibility description"));
            i10 = i11;
        }
        return C15985a.h(arrayList);
    }

    public final DateTimeFormatter c() {
        return f127107b;
    }

    public final List<Float> d() {
        C17974j jVar = new C17974j(0, C17978n.t(new C17974j(0, 4), C17853c.f146670a) + 7);
        ArrayList arrayList = new ArrayList(C16877v.y(jVar, 10));
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            ((U) it).c();
            arrayList.add(Float.valueOf((float) C17978n.t(new C17974j(0, 100), C17853c.f146670a)));
        }
        return arrayList;
    }
}
