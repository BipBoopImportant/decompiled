package fx;

import GB.e;
import GB.f;
import YH.C16877v;
import bx.d;
import fI.C17220a;
import fI.C17221b;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfx/h0;", "", "<init>", "()V", "Ljava/time/LocalDateTime;", "b", "Ljava/time/LocalDateTime;", "getNow", "()Ljava/time/LocalDateTime;", "now", "LGB/f;", "c", "LGB/f;", "getPopularTimesTrend", "()LGB/f;", "popularTimesTrend", "LGB/e;", "d", "LGB/e;", "getPopularTimesLive", "()LGB/e;", "popularTimesLive", "Lfx/f0;", "e", "Lfx/f0;", "()Lfx/f0;", "popularTimesUiModel", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f127090a = new h0();

    /* renamed from: b  reason: collision with root package name */
    private static final LocalDateTime f127091b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f127092c;

    /* renamed from: d  reason: collision with root package name */
    private static final e f127093d;

    /* renamed from: e  reason: collision with root package name */
    private static final f0 f127094e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f127095f = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C17220a<DayOfWeek> f127096a = C17221b.a(DayOfWeek.values());
    }

    static {
        f.a aVar;
        LocalDateTime parse = LocalDateTime.parse("2023-12-01T14:00:00");
        C17542s.i(parse, "parse(...)");
        f127091b = parse;
        C17220a<DayOfWeek> aVar2 = a.f127096a;
        ArrayList arrayList = new ArrayList();
        for (DayOfWeek dayOfWeek : aVar2) {
            if (dayOfWeek == DayOfWeek.SUNDAY) {
                aVar = null;
            } else {
                Iterable d10 = j0.f127106a.d();
                ArrayList arrayList2 = new ArrayList(C16877v.y(d10, 10));
                int i10 = 0;
                for (Object next : d10) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C16877v.x();
                    }
                    arrayList2.add(new f.a.C2643a(i10 + 9, (int) ((Number) next).floatValue(), 93));
                    i10 = i11;
                }
                aVar = new f.a(dayOfWeek, arrayList2);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        f fVar = new f(arrayList);
        f127092c = fVar;
        e.b bVar = e.b.Open;
        LocalDateTime localDateTime = f127091b;
        DayOfWeek dayOfWeek2 = localDateTime.getDayOfWeek();
        C17542s.i(dayOfWeek2, "getDayOfWeek(...)");
        e eVar = new e(bVar, new e.a(dayOfWeek2, localDateTime.getHour(), 93, 35, 100));
        f127093d = eVar;
        f127094e = d.f118988a.k(fVar, localDateTime, j0.f127106a.c(), eVar, new g0());
    }

    private h0() {
    }

    /* access modifiers changed from: private */
    public static final String c(String str, float f10, Float f11) {
        C17542s.j(str, "<unused var>");
        return "accessibility description";
    }

    public final f0 b() {
        return f127094e;
    }
}
