package bx;

import GB.d;
import GB.e;
import GB.f;
import IC.C13023e;
import IC.C13026h;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import fI.C17220a;
import fI.C17221b;
import fx.C14458a;
import fx.C14471n;
import fx.f0;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0007J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u001f\u001a\u00020\u001e*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u001c¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020#*\u00020\u00112\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0001¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&*\b\u0012\u0004\u0012\u00020#0&H\u0001¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020#*\u00020#2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0001¢\u0006\u0004\b)\u0010*JU\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020#2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cH\u0001¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lbx/d;", "", "<init>", "()V", "LGB/d;", "LIC/e;", "h", "(LGB/d;)LIC/e;", "g", "", "time", "", "trendPercent", "livePercent", "c", "(Ljava/lang/String;FLjava/lang/Float;)LIC/e;", "b", "Ljava/time/DayOfWeek;", "", "j", "(Ljava/time/DayOfWeek;)I", "LGB/f;", "Ljava/time/LocalDateTime;", "now", "Ljava/time/format/DateTimeFormatter;", "formatter", "LGB/e;", "todayLiveData", "Lkotlin/Function3;", "barA11yDescription", "Lfx/f0;", "k", "(LGB/f;Ljava/time/LocalDateTime;Ljava/time/format/DateTimeFormatter;LGB/e;LnI/q;)Lfx/f0;", "earliestOpenHour", "numberOfOpenHours", "LGB/f$a;", "d", "(Ljava/time/DayOfWeek;II)LGB/f$a;", "", "f", "(Ljava/util/List;)Ljava/util/List;", "e", "(LGB/f$a;II)LGB/f$a;", "LKJ/c;", "Lfx/m;", "i", "(LGB/f$a;Ljava/time/LocalDateTime;Ljava/time/format/DateTimeFormatter;LGB/e;LnI/q;)LKJ/c;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f118988a = new d();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C17220a<DayOfWeek> f118989a = C17221b.a(DayOfWeek.values());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118990a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f118991b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        static {
            /*
                GB.d[] r0 = GB.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                GB.d r2 = GB.d.NotBusy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                GB.d r3 = GB.d.LittleBusy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                GB.d r4 = GB.d.Busy     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f118990a = r0
                java.time.DayOfWeek[] r0 = java.time.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.time.DayOfWeek r4 = java.time.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                java.time.DayOfWeek r1 = java.time.DayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                f118991b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bx.d.b.<clinit>():void");
        }
    }

    private d() {
    }

    /* access modifiers changed from: private */
    public static final String l(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter, int i10) {
        String format = localDateTime.plusHours((long) i10).format(dateTimeFormatter);
        C17542s.i(format, "format(...)");
        return format;
    }

    public final C13023e b(GB.d dVar) {
        C17542s.j(dVar, "<this>");
        int i10 = b.f118990a[dVar.ordinal()];
        if (i10 == 1) {
            return C13026h.a(e.f119008q);
        }
        if (i10 == 2) {
            return C13026h.a(e.f119006o);
        }
        if (i10 == 3) {
            return C13026h.a(e.f119003l);
        }
        throw new t();
    }

    public final C13023e c(String str, float f10, Float f11) {
        C17542s.j(str, "time");
        int i10 = e.f118992a;
        List c10 = C16877v.c();
        c10.add(C13026h.c(str));
        d dVar = f118988a;
        d.a aVar = GB.d.Companion;
        c10.add(dVar.h(aVar.a(f10)));
        if (f11 != null) {
            c10.add(dVar.g(aVar.a(f11.floatValue())));
        } else {
            c10.add(C13026h.c(""));
        }
        C16807N n10 = C16807N.f139792a;
        return new C13023e.a(i10, C16877v.a(c10));
    }

    public final f.a d(DayOfWeek dayOfWeek, int i10, int i11) {
        C17542s.j(dayOfWeek, "<this>");
        List c10 = C16877v.c();
        for (int i12 = 0; i12 < i11; i12++) {
            c10.add(new f.a.C2643a(i10 + i12, 5, 0));
        }
        return new f.a(dayOfWeek, C16877v.a(c10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: GB.f$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: GB.f$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: GB.f$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: GB.f$a$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final GB.f.a e(GB.f.a r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.util.List r0 = YH.C16877v.c()
            r1 = 0
            r2 = r1
        L_0x000b:
            r3 = 0
            if (r2 >= r10) goto L_0x003d
            int r4 = r11 + r2
            java.util.List r5 = r9.d()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002e
            java.lang.Object r6 = r5.next()
            r7 = r6
            GB.f$a$a r7 = (GB.f.a.C2643a) r7
            int r7 = r7.a()
            if (r7 != r4) goto L_0x001a
            r3 = r6
        L_0x002e:
            GB.f$a$a r3 = (GB.f.a.C2643a) r3
            if (r3 != 0) goto L_0x0037
            GB.f$a$a r3 = new GB.f$a$a
            r3.<init>(r4, r1, r1)
        L_0x0037:
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x003d:
            java.util.List r10 = YH.C16877v.a(r0)
            r11 = 1
            GB.f$a r9 = GB.f.a.b(r9, r3, r10, r11, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.d.e(GB.f$a, int, int):GB.f$a");
    }

    public final List<f.a> f(List<f.a> list) {
        C17542s.j(list, "<this>");
        Iterable<f.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (f.a aVar : iterable) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : aVar.d()) {
                if (((f.a.C2643a) next).b() >= 0) {
                    arrayList2.add(next);
                }
            }
            arrayList.add(f.a.b(aVar, (DayOfWeek) null, arrayList2, 1, (Object) null));
        }
        return arrayList;
    }

    public final C13023e g(GB.d dVar) {
        C17542s.j(dVar, "<this>");
        int i10 = b.f118990a[dVar.ordinal()];
        if (i10 == 1) {
            return C13026h.a(e.f118997f);
        }
        if (i10 == 2) {
            return C13026h.a(e.f118996e);
        }
        if (i10 == 3) {
            return C13026h.a(e.f118995d);
        }
        throw new t();
    }

    public final C13023e h(GB.d dVar) {
        C17542s.j(dVar, "<this>");
        int i10 = b.f118990a[dVar.ordinal()];
        if (i10 == 1) {
            return C13026h.a(e.f119000i);
        }
        if (i10 == 2) {
            return C13026h.a(e.f118999h);
        }
        if (i10 == 3) {
            return C13026h.a(e.f118998g);
        }
        throw new t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final KJ.C15987c<fx.C14470m> i(GB.f.a r9, java.time.LocalDateTime r10, java.time.format.DateTimeFormatter r11, GB.e r12, nI.q<? super java.lang.String, ? super java.lang.Float, ? super java.lang.Float, java.lang.String> r13) {
        /*
            r8 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "now"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "formatter"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "todayLiveData"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.util.List r0 = r9.d()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r0.next()
            GB.f$a$a r2 = (GB.f.a.C2643a) r2
            int r3 = r2.a()
            java.time.LocalDateTime r3 = r10.withHour(r3)
            java.time.temporal.ChronoUnit r4 = java.time.temporal.ChronoUnit.HOURS
            java.time.LocalDateTime r3 = r3.truncatedTo(r4)
            java.lang.String r3 = r3.format(r11)
            GB.e$a r4 = r12.a()
            r5 = 0
            if (r4 == 0) goto L_0x0070
            java.time.DayOfWeek r6 = r4.a()
            java.time.DayOfWeek r7 = r9.c()
            if (r6 != r7) goto L_0x0063
            int r6 = r4.b()
            int r7 = r2.a()
            if (r6 != r7) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r4 = r5
        L_0x0064:
            if (r4 == 0) goto L_0x0070
            int r4 = r4.c()
            float r4 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0071
        L_0x0070:
            r4 = r5
        L_0x0071:
            fx.m r6 = new fx.m
            int r7 = r2.b()
            float r7 = (float) r7
            if (r13 == 0) goto L_0x008d
            kotlin.jvm.internal.C17542s.g(r3)
            int r2 = r2.b()
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r13.invoke(r3, r2, r4)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x008d:
            r6.<init>(r7, r4, r5)
            r1.add(r6)
            goto L_0x0029
        L_0x0094:
            KJ.c r9 = KJ.C15985a.h(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.d.i(GB.f$a, java.time.LocalDateTime, java.time.format.DateTimeFormatter, GB.e, nI.q):KJ.c");
    }

    public final int j(DayOfWeek dayOfWeek) {
        C17542s.j(dayOfWeek, "<this>");
        switch (b.f118991b[dayOfWeek.ordinal()]) {
            case 1:
                return Oo.b.f84479Q1;
            case 2:
                return Oo.b.f84559Y1;
            case 3:
                return Oo.b.f84580a2;
            case 4:
                return Oo.b.f84539W1;
            case 5:
                return Oo.b.f84459O1;
            case 6:
                return Oo.b.f84499S1;
            case 7:
                return Oo.b.f84519U1;
            default:
                throw new t();
        }
    }

    public final f0 k(f fVar, LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter, e eVar, q<? super String, ? super Float, ? super Float, String> qVar) {
        int i10;
        Object obj;
        boolean z10;
        LocalDateTime localDateTime2 = localDateTime;
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        C17542s.j(fVar, "<this>");
        C17542s.j(localDateTime2, "now");
        C17542s.j(dateTimeFormatter2, "formatter");
        C17542s.j(eVar, "todayLiveData");
        q<? super String, ? super Float, ? super Float, String> qVar2 = qVar;
        C17542s.j(qVar2, "barA11yDescription");
        Iterable<f.a> f10 = f(fVar.a());
        ArrayList arrayList = new ArrayList();
        for (f.a d10 : f10) {
            Iterable<f.a.C2643a> d11 = d10.d();
            ArrayList arrayList2 = new ArrayList(C16877v.y(d11, 10));
            for (f.a.C2643a a10 : d11) {
                arrayList2.add(Integer.valueOf(a10.a()));
            }
            C16877v.E(arrayList, arrayList2);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            loop2:
            while (true) {
                i10 = intValue;
                while (true) {
                    if (!it.hasNext()) {
                        break loop2;
                    }
                    intValue = ((Number) it.next()).intValue();
                    if (i10 > intValue) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                int intValue2 = ((Number) it2.next()).intValue();
                while (it2.hasNext()) {
                    int intValue3 = ((Number) it2.next()).intValue();
                    if (intValue2 < intValue3) {
                        intValue2 = intValue3;
                    }
                }
                boolean z11 = true;
                int i11 = (intValue2 - i10) + 1;
                LocalDateTime truncatedTo = localDateTime2.withHour(i10).truncatedTo(ChronoUnit.HOURS);
                C17220a<DayOfWeek> aVar = a.f118989a;
                ArrayList arrayList3 = new ArrayList(C16877v.y(aVar, 10));
                int i12 = 0;
                for (DayOfWeek dayOfWeek : aVar) {
                    Iterator it3 = f10.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        if (((f.a) obj).c() == dayOfWeek) {
                            break;
                        }
                    }
                    f.a aVar2 = (f.a) obj;
                    if (aVar2 == null) {
                        aVar2 = f118988a.d(dayOfWeek, i10, i11);
                        z10 = false;
                    } else {
                        z10 = z11;
                    }
                    if (aVar2.d().size() != i11) {
                        aVar2 = f118988a.e(aVar2, i11, i10);
                    }
                    f.a aVar3 = aVar2;
                    boolean z12 = aVar3.c() == localDateTime.getDayOfWeek() ? z11 : false;
                    if (z12) {
                        i12 = dayOfWeek.ordinal();
                    }
                    int i13 = i12;
                    e.a a11 = eVar.a();
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(new C14471n(f118988a.i(aVar3, localDateTime, dateTimeFormatter, eVar, z10 ? qVar2 : null), new C14458a(new c(truncatedTo, dateTimeFormatter2), 0.0f, 0.0f, 0, 14, (DefaultConstructorMarker) null), aVar3.c(), z12 ? a11 != null ? GB.d.Companion.a((float) a11.c()) : null : null, z10, z12));
                    arrayList3 = arrayList4;
                    i12 = i13;
                    z11 = true;
                }
                return new f0(i12, arrayList3);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
