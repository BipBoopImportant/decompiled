package ko;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Nn.C10802e;
import Nn.C10811n;
import Nn.M;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import YH.X;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jo.C11437c;
import jo.C11438d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lo.C11556a;
import lo.y;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rv.C11849b;
import uK.C18146a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u001c*\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006("}, d2 = {"Lko/f;", "Lko/e;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LNn/M;", "selectedTimeSlot", "", "availableTimeSlots", "Llo/a$c;", "config", "Llo/y;", "d", "(LNn/M;Ljava/util/List;Llo/a$c;)Llo/y;", "", "selectedTimeSlotId", "Ljo/d;", "e", "(Ljava/util/List;Ljava/lang/String;Llo/a$c;)Ljava/util/List;", "", "timeSlotMap", "LXH/N;", "b", "(Ljava/util/Map;)V", "Llo/a$e;", "", "isRangeOfDays", "Llo/a$b$a;", "c", "(Llo/a$e;Llo/a$c;Z)Llo/a$b$a;", "LNn/u;", "fulfillmentServiceType", "Llo/a$b;", "a", "(LNn/u;Llo/a$e;Ljava/util/List;Llo/a$c;)Llo/a$b;", "LIl/a;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "uniqueDateFormat", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f98985c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f98986d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f98987a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDateFormat f98988b = new SimpleDateFormat("yyy-MM-dd", Locale.US);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lko/f$a;", "", "<init>", "()V", "", "UNIQUE_DATE", "Ljava/lang/String;", "", "MILLIS_PER_DAY", "J", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f98989a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f98990b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                Nn.u[] r0 = Nn.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Nn.u r2 = Nn.u.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Nn.u r3 = Nn.u.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.u r3 = Nn.u.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Nn.u r3 = Nn.u.LOCKER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Nn.u r3 = Nn.u.STANDARD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Nn.u r3 = Nn.u.STANDARD_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r4 = 6
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Nn.u r3 = Nn.u.CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r4 = 7
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Nn.u r3 = Nn.u.EXPRESS_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r4 = 8
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                Nn.u r3 = Nn.u.EXPRESS_CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r4 = 9
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f98989a = r0
                Nn.P[] r0 = Nn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.P r3 = Nn.P.PARCEL     // Catch:{ NoSuchFieldError -> 0x006b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006b }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x006b }
            L_0x006b:
                Nn.P r1 = Nn.P.TRUCK     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                f98990b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.f.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((M) t10).c(), ((M) t11).c());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((M) t10).c(), ((M) t11).c());
        }
    }

    public f(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f98987a = aVar;
    }

    private final void b(Map<String, List<M>> map) {
        Iterator it;
        Map<String, List<M>> map2 = map;
        Iterable keySet = map.keySet();
        ArrayList arrayList = new ArrayList(C16877v.y(keySet, 10));
        Iterator it2 = keySet.iterator();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MIN_VALUE;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                long time = this.f98988b.parse(str).getTime();
                if (j10 > time) {
                    j10 = time;
                }
                if (j11 < time) {
                    j11 = time;
                }
            } catch (ParseException e10) {
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList2) {
                    if (str3 == null) {
                        String a10 = C11818a.a("Could not parse date: " + str, e10);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = f.class.getName();
                        C17542s.g(name);
                        it = it2;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', str2, 2, str2), '.', str2, 2, str2);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it = it2;
                    }
                    String str6 = str4;
                    bVar.a(eVar, str6, false, e10, str5);
                    str4 = str6;
                    str2 = str2;
                    str3 = str5;
                    it2 = it;
                    eVar = eVar;
                }
            }
            Iterator it3 = it2;
            arrayList.add(C16807N.f139792a);
            it2 = it3;
        }
        long j12 = ((j11 - j10) / 86400000) + 1;
        for (long j13 = 0; j13 < j12; j13++) {
            String format = this.f98988b.format(new Date((j13 * 86400000) + j10));
            if (map2.get(format) == null) {
                map2.put(format, C16877v.n());
            }
        }
    }

    private final C11556a.b.C2266a c(C11556a.e eVar, C11556a.c cVar, boolean z10) {
        C13023e eVar2;
        int i10;
        C11556a.c.C2268a a10 = cVar.a();
        Locale A10 = this.f98987a.A();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(a10.e(), A10);
        SimpleDateFormat simpleDateFormat2 = z10 ? new SimpleDateFormat(a10.e(), A10) : new SimpleDateFormat(a10.d(), A10);
        String format = String.format("%s-%s", Arrays.copyOf(new Object[]{simpleDateFormat2.format(eVar.a().c()), simpleDateFormat2.format(eVar.a().f())}, 2));
        C17542s.i(format, "format(...)");
        if (z10) {
            eVar2 = C13026h.a(C11849b.f102262Z);
        } else {
            String format2 = simpleDateFormat.format(eVar.a().c());
            C17542s.i(format2, "format(...)");
            eVar2 = C13026h.c(format2);
        }
        String e10 = eVar.a().e();
        C13023e c10 = C13026h.c(format);
        int i11 = b.f98990b[eVar.b().ordinal()];
        if (i11 == 1) {
            i10 = C18146a.f148050G0;
        } else if (i11 == 2) {
            i10 = C18146a.f148385c3;
        } else {
            throw new t();
        }
        return new C11556a.b.C2266a(e10, eVar2, c10, i10);
    }

    private final y d(M m10, List<M> list, C11556a.c cVar) {
        ArrayList arrayList;
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat;
        ArrayList arrayList2;
        int i10;
        int i11;
        Map map;
        Iterator it;
        Date date;
        List g12;
        Iterator it2;
        String str;
        SimpleDateFormat simpleDateFormat2;
        Double d10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (M m11 : list) {
            String format = this.f98988b.format(m11.c());
            Object obj = linkedHashMap.get(format);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(format, obj);
            }
            ((List) obj).add(m11);
        }
        Map z10 = X.z(linkedHashMap);
        if (!z10.isEmpty()) {
            b(z10);
            C11556a.c.C2268a a10 = cVar.a();
            Locale A10 = this.f98987a.A();
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(a10.f(), A10);
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(a10.c(), A10);
            SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(a10.b(), A10);
            SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat(a10.a(), A10);
            DateFormat dateInstance = DateFormat.getDateInstance(2, A10);
            Iterable f12 = C16877v.f1(z10.keySet());
            ArrayList arrayList3 = new ArrayList(C16877v.y(f12, 10));
            Iterator it3 = f12.iterator();
            int i12 = 0;
            int i13 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C16877v.x();
                }
                String str2 = (String) next;
                try {
                    Date parse = this.f98988b.parse(str2);
                    List list2 = (List) z10.get(str2);
                    if (list2 == null || (g12 = C16877v.g1(list2, new c())) == null) {
                        map = z10;
                        dateFormat = dateInstance;
                        simpleDateFormat = simpleDateFormat6;
                        it = it3;
                        arrayList2 = arrayList3;
                        i10 = i12;
                        i11 = i14;
                        arrayList = null;
                    } else {
                        Iterable iterable = g12;
                        map = z10;
                        it = it3;
                        ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            M m12 = (M) it4.next();
                            if (m10 != null) {
                                it2 = it4;
                                str = m10.e();
                            } else {
                                it2 = it4;
                                str = null;
                            }
                            boolean e10 = C17542s.e(str, m12.e());
                            int i15 = i14;
                            int i16 = i12;
                            Date c10 = m12.c();
                            ArrayList arrayList5 = arrayList3;
                            Date f10 = m12.f();
                            DateFormat dateFormat2 = dateInstance;
                            String e11 = m12.e();
                            C10811n b10 = m12.b();
                            if (b10 != null) {
                                simpleDateFormat2 = simpleDateFormat6;
                                d10 = b10.c(Boolean.valueOf(!cVar.b()));
                            } else {
                                simpleDateFormat2 = simpleDateFormat6;
                                d10 = null;
                            }
                            arrayList4.add(new C11438d(new C11438d.a(c10, f10, e11, d10), e10, a10.d()));
                            it4 = it2;
                            i14 = i15;
                            i12 = i16;
                            arrayList3 = arrayList5;
                            dateInstance = dateFormat2;
                            simpleDateFormat6 = simpleDateFormat2;
                        }
                        dateFormat = dateInstance;
                        simpleDateFormat = simpleDateFormat6;
                        arrayList2 = arrayList3;
                        i10 = i12;
                        i11 = i14;
                        arrayList = arrayList4;
                    }
                    SimpleDateFormat simpleDateFormat7 = this.f98988b;
                    if (m10 == null || (date = m10.c()) == null) {
                        date = new Date();
                    }
                    boolean e12 = C17542s.e(simpleDateFormat7.format(date), this.f98988b.format(parse));
                    i12 = e12 ? i13 : i10;
                    String valueOf = String.valueOf(i13);
                    String format2 = simpleDateFormat3.format(parse);
                    C17542s.i(format2, "format(...)");
                    String format3 = simpleDateFormat4.format(parse);
                    C17542s.i(format3, "format(...)");
                    String format4 = simpleDateFormat5.format(parse);
                    C17542s.i(format4, "format(...)");
                    SimpleDateFormat simpleDateFormat8 = simpleDateFormat;
                    String format5 = simpleDateFormat8.format(parse);
                    C17542s.i(format5, "format(...)");
                    DateFormat dateFormat3 = dateFormat;
                    String format6 = dateFormat3.format(parse);
                    C17542s.i(format6, "format(...)");
                    ArrayList arrayList6 = arrayList2;
                    arrayList6.add(new C11437c(valueOf, format2, format3, format4, format5, format6, arrayList, e12));
                    arrayList3 = arrayList6;
                    simpleDateFormat6 = simpleDateFormat8;
                    dateInstance = dateFormat3;
                    it3 = it;
                    z10 = map;
                    i13 = i11;
                } catch (ParseException e13) {
                    String str3 = "Could not parse date " + str2;
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList7 = new ArrayList<>();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar, false)) {
                            arrayList7.add(next2);
                        }
                    }
                    String str4 = null;
                    String str5 = null;
                    for (C11819b bVar : arrayList7) {
                        if (str4 == null) {
                            String a11 = C11818a.a(str3, e13);
                            if (a11 == null) {
                                break;
                            }
                            str4 = C11820c.a(a11);
                        }
                        if (str5 == null) {
                            String name = f.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        bVar.a(eVar, str5, false, e13, str4);
                    }
                    throw new C10802e.c.b(str3);
                }
            }
            int i17 = i12;
            return new y(arrayList3, i12);
        }
        throw new C10802e.c.b("No time slots");
    }

    private final List<C11438d> e(List<M> list, String str, C11556a.c cVar) {
        Iterable<M> g12 = C16877v.g1(list, new d());
        ArrayList arrayList = new ArrayList(C16877v.y(g12, 10));
        for (M m10 : g12) {
            Date c10 = m10.c();
            Date f10 = m10.f();
            String e10 = m10.e();
            C10811n b10 = m10.b();
            arrayList.add(new C11438d(new C11438d.a(c10, f10, e10, b10 != null ? b10.c(Boolean.valueOf(!cVar.b())) : null), C17542s.e(str, m10.e()), cVar.a().e()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: Nn.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lo.C11556a.b a(Nn.u r2, lo.C11556a.e r3, java.util.List<Nn.M> r4, lo.C11556a.c r5) {
        /*
            r1 = this;
            java.lang.String r0 = "fulfillmentServiceType"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "availableTimeSlots"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            int[] r0 = ko.f.b.f98989a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x0040;
                case 3: goto L_0x0040;
                case 4: goto L_0x0040;
                case 5: goto L_0x0040;
                case 6: goto L_0x0021;
                case 7: goto L_0x0021;
                case 8: goto L_0x0021;
                case 9: goto L_0x0021;
                default: goto L_0x001b;
            }
        L_0x001b:
            XH.t r2 = new XH.t
            r2.<init>()
            throw r2
        L_0x0021:
            if (r3 == 0) goto L_0x0029
            r2 = 1
            lo.a$b$a r2 = r1.c(r3, r5, r2)
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r3 == 0) goto L_0x0036
            Nn.M r3 = r3.a()
            if (r3 == 0) goto L_0x0036
            java.lang.String r0 = r3.e()
        L_0x0036:
            java.util.List r3 = r1.e(r4, r0, r5)
            lo.a$b$c r4 = new lo.a$b$c
            r4.<init>(r2, r3)
            goto L_0x005c
        L_0x0040:
            if (r3 == 0) goto L_0x0048
            r2 = 0
            lo.a$b$a r2 = r1.c(r3, r5, r2)
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            if (r3 == 0) goto L_0x004f
            Nn.M r0 = r3.a()
        L_0x004f:
            lo.y r3 = r1.d(r0, r4, r5)
            java.util.List r3 = r3.a()
            lo.a$b$b r4 = new lo.a$b$b
            r4.<init>(r2, r3)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.f.a(Nn.u, lo.a$e, java.util.List, lo.a$c):lo.a$b");
    }
}
