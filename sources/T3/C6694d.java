package T3;

import N3.C6675m;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t3.B;

/* renamed from: T3.d  reason: case insensitive filesystem */
final class C6694d extends C6695e {

    /* renamed from: b  reason: collision with root package name */
    private long f40000b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f40001c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f40002d = new long[0];

    public C6694d() {
        super(new C6675m());
    }

    private static Boolean g(B b10) {
        boolean z10 = true;
        if (b10.H() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Object h(B b10, int i10) {
        if (i10 == 0) {
            return j(b10);
        }
        if (i10 == 1) {
            return g(b10);
        }
        if (i10 == 2) {
            return n(b10);
        }
        if (i10 == 3) {
            return l(b10);
        }
        if (i10 == 8) {
            return k(b10);
        }
        if (i10 == 10) {
            return m(b10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(b10);
    }

    private static Date i(B b10) {
        Date date = new Date((long) j(b10).doubleValue());
        b10.X(2);
        return date;
    }

    private static Double j(B b10) {
        return Double.valueOf(Double.longBitsToDouble(b10.A()));
    }

    private static HashMap<String, Object> k(B b10) {
        int L10 = b10.L();
        HashMap<String, Object> hashMap = new HashMap<>(L10);
        for (int i10 = 0; i10 < L10; i10++) {
            String n10 = n(b10);
            Object h10 = h(b10, o(b10));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(B b10) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(b10);
            int o10 = o(b10);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(b10, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList<Object> m(B b10) {
        int L10 = b10.L();
        ArrayList<Object> arrayList = new ArrayList<>(L10);
        for (int i10 = 0; i10 < L10; i10++) {
            Object h10 = h(b10, o(b10));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(B b10) {
        int P10 = b10.P();
        int f10 = b10.f();
        b10.X(P10);
        return new String(b10.e(), f10, P10);
    }

    private static int o(B b10) {
        return b10.H();
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        if (o(b10) != 2 || !"onMetaData".equals(n(b10)) || b10.a() == 0 || o(b10) != 8) {
            return false;
        }
        HashMap<String, Object> k10 = k(b10);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f40000b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f40001c = new long[size];
                this.f40002d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f40001c = new long[0];
                        this.f40002d = new long[0];
                    } else {
                        this.f40001c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f40002d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f40001c = new long[0];
                this.f40002d = new long[0];
            }
        }
        return false;
    }

    public long d() {
        return this.f40000b;
    }

    public long[] e() {
        return this.f40002d;
    }

    public long[] f() {
        return this.f40001c;
    }
}
