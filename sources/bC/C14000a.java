package bC;

import GB.C12918c;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import SB.C13561a;
import TB.C13677a;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import am.h;
import bC.C14001b;
import bI.C17035a;
import ep.C11256b;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 12\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010%J3\u0010(\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\"0\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001cH\u0001¢\u0006\u0004\b(\u0010\u001fJ5\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140+0\"0\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001cH\u0000¢\u0006\u0004\b,\u0010\u001fJ\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u0002002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001cH\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106¨\u00069"}, d2 = {"LbC/a;", "", "Lep/b;", "localizedDateTimeFormatter", "Lam/h;", "timeProvider", "<init>", "(Lep/b;Lam/h;)V", "Ljava/time/DayOfWeek;", "day", "", "b", "(Ljava/time/DayOfWeek;)Ljava/lang/String;", "Ljava/time/LocalDate;", "date", "a", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Ljava/time/LocalTime;", "start", "end", "LIC/e;", "c", "(Ljava/time/LocalTime;Ljava/time/LocalTime;)LIC/e;", "LGB/c;", "openingHours", "LbC/b$d;", "j", "(LGB/c;)LbC/b$d;", "", "LbC/b$a;", "d", "(Ljava/util/List;)Ljava/util/List;", "LGB/c$c;", "type", "LXH/v;", "", "f", "(LGB/c$c;)LXH/v;", "LGB/c$a;", "extras", "i", "LGB/c$b;", "hours", "LKJ/c;", "g", "LbC/b$b;", "h", "(LGB/c;)Ljava/util/List;", "LbC/b$c;", "e", "(Ljava/util/List;)LbC/b$c;", "Lep/b;", "Lam/h;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "dateFormatter", "timeFormatter", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bC.a  reason: case insensitive filesystem */
public final class C14000a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2969a f118912e = new C2969a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f118913f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f118914a;

    /* renamed from: b  reason: collision with root package name */
    private final h f118915b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTimeFormatter f118916c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTimeFormatter f118917d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbC/a$a;", "", "<init>", "()V", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.a$a  reason: collision with other inner class name */
    public static final class C2969a {
        public /* synthetic */ C2969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2969a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                GB.c$c[] r0 = GB.C12918c.C2642c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                GB.c$c r1 = GB.C12918c.C2642c.STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                GB.c$c r1 = GB.C12918c.C2642c.RESTAURANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                GB.c$c r1 = GB.C12918c.C2642c.BISTRO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                GB.c$c r1 = GB.C12918c.C2642c.SMALAND     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                GB.c$c r1 = GB.C12918c.C2642c.CAFE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                GB.c$c r1 = GB.C12918c.C2642c.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f118918a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bC.C14000a.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.a$c */
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((C12918c.b) t10).a(), ((C12918c.b) t11).a());
        }
    }

    public C14000a(C11256b bVar, h hVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(hVar, "timeProvider");
        this.f118914a = bVar;
        this.f118915b = hVar;
        this.f118916c = bVar.c();
        this.f118917d = bVar.d();
    }

    private final String a(LocalDate localDate) {
        String format = localDate.format(this.f118916c);
        C17542s.i(format, "format(...)");
        return format;
    }

    private final String b(DayOfWeek dayOfWeek) {
        return this.f118914a.f(dayOfWeek);
    }

    private final C13023e c(LocalTime localTime, LocalTime localTime2) {
        String format = localTime.format(this.f118917d);
        String format2 = localTime2.format(this.f118917d);
        return C13026h.c(format + " - " + format2);
    }

    public final List<C14001b.a> d(List<C12918c> list) {
        C17542s.j(list, "openingHours");
        Iterable<C12918c> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C12918c cVar : iterable) {
            v<Integer, Integer> f10 = f(cVar.e());
            int intValue = f10.a().intValue();
            C13023e a10 = C13026h.a(f10.b().intValue());
            C15987c h10 = C15985a.h(g(cVar.d()));
            C14001b.c e10 = e(cVar.d());
            List<C12918c.a> c10 = cVar.c();
            if (c10 == null) {
                c10 = C16877v.n();
            }
            arrayList.add(new C14001b.a(intValue, a10, e10, h10, C15985a.l(i(c10))));
        }
        return arrayList;
    }

    public final C14001b.c e(List<C12918c.b> list) {
        Object obj;
        C17542s.j(list, "hours");
        LocalDateTime d10 = this.f118915b.d();
        LocalTime localTime = d10.toLocalTime();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C12918c.b) obj).b() == d10.getDayOfWeek()) {
                break;
            }
        }
        C12918c.b bVar = (C12918c.b) obj;
        if (bVar == null || bVar.c().isEmpty()) {
            return C14001b.c.a.f118931a;
        }
        LocalTime localTime2 = (LocalTime) ((v) C16877v.I0(bVar.c())).d();
        if (localTime.isAfter(localTime2) || C17542s.e(localTime, localTime2)) {
            return C14001b.c.a.f118931a;
        }
        Iterator<v<LocalTime, LocalTime>> it2 = bVar.c().iterator();
        int i10 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i10 = -1;
                break;
            } else if (((LocalTime) it2.next().d()).compareTo(localTime) > 0) {
                break;
            } else {
                i10++;
            }
        }
        v vVar = bVar.c().get(i10);
        LocalTime localTime3 = (LocalTime) vVar.c();
        return (localTime.isAfter(localTime3) || C17542s.e(localTime, localTime3)) ? new C14001b.c.C2972c(C13026h.b(C13561a.f115646i, this.f118917d.format((TemporalAccessor) vVar.d()))) : Duration.between(localTime, localTime3).toMinutes() <= 120 ? new C14001b.c.d(C13026h.b(C13561a.f115647j, this.f118917d.format(localTime3))) : i10 > 0 ? new C14001b.c.C2971b(C13026h.b(C13561a.f115647j, this.f118917d.format(localTime3))) : C14001b.c.a.f118931a;
    }

    public final v<Integer, Integer> f(C12918c.C2642c cVar) {
        int i10;
        int i11;
        C17542s.j(cVar, "type");
        switch (b.f118918a[cVar.ordinal()]) {
            case 1:
                throw new IllegalStateException("should be filtered out");
            case 2:
                i10 = C18146a.f148307X2;
                i11 = C13677a.f116665f;
                break;
            case 3:
                i10 = C18146a.f148055G5;
                i11 = C13677a.f116662c;
                break;
            case 4:
                i10 = C18146a.f148594p9;
                i11 = C13677a.f116666g;
                break;
            case 5:
                i10 = C18146a.f148262U2;
                i11 = C13677a.f116663d;
                break;
            case 6:
                i10 = C18146a.f148352a2;
                i11 = C13677a.f116664e;
                break;
            default:
                throw new t();
        }
        return C16796C.a(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final List<v<C13023e, C15987c<C13023e>>> g(List<C12918c.b> list) {
        v vVar;
        String b10;
        C17542s.j(list, "hours");
        ArrayList arrayList = new ArrayList();
        for (C12918c.b bVar : list) {
            DayOfWeek b11 = bVar.b();
            if (b11 == null || (b10 = b(b11)) == null) {
                vVar = null;
            } else {
                Iterable<v> c10 = bVar.c();
                List arrayList2 = new ArrayList(C16877v.y(c10, 10));
                for (v vVar2 : c10) {
                    arrayList2.add(c((LocalTime) vVar2.c(), (LocalTime) vVar2.d()));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = C16877v.e(C13026h.a(C13677a.f116667h));
                }
                vVar = C16796C.a(C13026h.c(b10), C15985a.l(arrayList2));
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    public final List<C14001b.C2970b> h(C12918c cVar) {
        C14001b.C2970b bVar;
        C17542s.j(cVar, "openingHours");
        List c10 = C16877v.c();
        List<C12918c.b> a10 = cVar.a();
        if (a10 != null) {
            c10.addAll(a10);
        }
        List<C12918c.b> b10 = cVar.b();
        if (b10 != null) {
            c10.addAll(b10);
        }
        ArrayList arrayList = new ArrayList();
        for (C12918c.b bVar2 : C16877v.g1(C16877v.a(c10), new c())) {
            LocalDate a11 = bVar2.a();
            if (a11 == null) {
                bVar = null;
            } else {
                C13023e c11 = C13026h.c(a(a11));
                Iterable<v> c12 = bVar2.c();
                ArrayList arrayList2 = new ArrayList(C16877v.y(c12, 10));
                for (v vVar : c12) {
                    arrayList2.add(c((LocalTime) vVar.c(), (LocalTime) vVar.d()));
                }
                bVar = new C14001b.C2970b(c11, C15985a.h(arrayList2), bVar2.d());
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final List<v<C13023e, C13023e>> i(List<C12918c.a> list) {
        C17542s.j(list, "extras");
        Iterable<C12918c.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C12918c.a aVar : iterable) {
            String b10 = aVar.b();
            C13023e eVar = null;
            C13023e c10 = b10 != null ? C13026h.c(b10) : null;
            String a10 = aVar.a();
            if (a10 != null) {
                eVar = C13026h.c(a10);
            }
            arrayList.add(C16796C.a(c10, eVar));
        }
        return arrayList;
    }

    public final C14001b.d j(C12918c cVar) {
        C17542s.j(cVar, "openingHours");
        C15987c h10 = C15985a.h(g(cVar.d()));
        C15987c h11 = C15985a.h(h(cVar));
        List<C12918c.a> c10 = cVar.c();
        if (c10 == null) {
            c10 = C16877v.n();
        }
        return new C14001b.d(h10, h11, C15985a.l(i(c10)));
    }
}
