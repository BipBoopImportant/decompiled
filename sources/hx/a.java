package Hx;

import HJ.C15854t;
import Hx.c;
import Hx.h;
import XH.t;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"LHx/a;", "", "LHx/c$c$c;", "type", "", "deliveryNumber", "LHx/h$a;", "bookedSlot", "", "LHx/h;", "slots", "<init>", "(LHx/c$c$c;Ljava/lang/String;LHx/h$a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/c$c$c;", "c", "()LHx/c$c$c;", "b", "Ljava/lang/String;", "getDeliveryNumber", "LHx/h$a;", "()LHx/h$a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c.C2661c.C2663c f110735a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110736b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f110737c;

    /* renamed from: d  reason: collision with root package name */
    private final List<h> f110738d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"LHx/a$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "CLICK_AND_COLLECT", "PARCEL", "TRUCK", "PARCEL_EXPRESS", "TRUCK_EXPRESS", "PICKUP_POINT", "INTERNAL_LOCKER", "EXTERNAL_LOCKER", "PARCEL_RETURN", "TRUCK_RETURN", "PARCEL_EXCHANGE", "TRUCK_EXCHANGE", "CASH_AND_CARRY", "UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hx.a$a  reason: collision with other inner class name */
    public enum C2658a {
        CLICK_AND_COLLECT("CLICK_AND_COLLECT"),
        PARCEL("PARCEL"),
        TRUCK("TRUCK"),
        PARCEL_EXPRESS("PARCEL_EXPRESS"),
        TRUCK_EXPRESS("TRUCK_EXPRESS"),
        PICKUP_POINT("PICKUP_POINT"),
        INTERNAL_LOCKER("INTERNAL_LOCKER"),
        EXTERNAL_LOCKER("EXTERNAL_LOCKER"),
        PARCEL_RETURN("PARCEL_RETURN"),
        TRUCK_RETURN("TRUCK_RETURN"),
        PARCEL_EXCHANGE("PARCEL_EXCHANGE"),
        TRUCK_EXCHANGE("TRUCK_EXCHANGE"),
        CASH_AND_CARRY("CASH_AND_CARRY"),
        UNKNOWN("UNKNOWN");
        
        public static final C2659a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/a$a$a;", "", "<init>", "()V", "", "rawValue", "LHx/c$c$c;", "a", "(Ljava/lang/String;)LHx/c$c$c;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.a$a$a  reason: collision with other inner class name */
        public static final class C2659a {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.a$a$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C2660a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f110739a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
                /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
                /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        Hx.a$a[] r0 = Hx.a.C2658a.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        Hx.a$a r1 = Hx.a.C2658a.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        Hx.a$a r1 = Hx.a.C2658a.PARCEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        Hx.a$a r1 = Hx.a.C2658a.TRUCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        Hx.a$a r1 = Hx.a.C2658a.PARCEL_EXPRESS     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        Hx.a$a r1 = Hx.a.C2658a.TRUCK_EXPRESS     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        Hx.a$a r1 = Hx.a.C2658a.PICKUP_POINT     // Catch:{ NoSuchFieldError -> 0x003d }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                        r2 = 6
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                    L_0x003d:
                        Hx.a$a r1 = Hx.a.C2658a.INTERNAL_LOCKER     // Catch:{ NoSuchFieldError -> 0x0046 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                        r2 = 7
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                    L_0x0046:
                        Hx.a$a r1 = Hx.a.C2658a.EXTERNAL_LOCKER     // Catch:{ NoSuchFieldError -> 0x0050 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                        r2 = 8
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                    L_0x0050:
                        Hx.a$a r1 = Hx.a.C2658a.PARCEL_RETURN     // Catch:{ NoSuchFieldError -> 0x005a }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                        r2 = 9
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                    L_0x005a:
                        Hx.a$a r1 = Hx.a.C2658a.TRUCK_RETURN     // Catch:{ NoSuchFieldError -> 0x0064 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                        r2 = 10
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                    L_0x0064:
                        Hx.a$a r1 = Hx.a.C2658a.PARCEL_EXCHANGE     // Catch:{ NoSuchFieldError -> 0x006e }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                        r2 = 11
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                    L_0x006e:
                        Hx.a$a r1 = Hx.a.C2658a.TRUCK_EXCHANGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                        r2 = 12
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                    L_0x0078:
                        Hx.a$a r1 = Hx.a.C2658a.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0082 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                        r2 = 13
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                    L_0x0082:
                        Hx.a$a r1 = Hx.a.C2658a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x008c }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                        r2 = 14
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                    L_0x008c:
                        f110739a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Hx.a.C2658a.C2659a.C2660a.<clinit>():void");
                }
            }

            public /* synthetic */ C2659a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c.C2661c.C2663c a(String str) {
                T t10;
                Iterator<T> it = C2658a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((C2658a) t10).j(), str, true)) {
                        break;
                    }
                }
                C2658a aVar = (C2658a) t10;
                if (aVar == null) {
                    aVar = C2658a.UNKNOWN;
                }
                switch (C2660a.f110739a[aVar.ordinal()]) {
                    case 1:
                        return c.C2661c.C2663c.CLICK_AND_COLLECT;
                    case 2:
                        return c.C2661c.C2663c.PARCEL;
                    case 3:
                        return c.C2661c.C2663c.TRUCK_STANDARD;
                    case 4:
                        return c.C2661c.C2663c.PARCEL_EXPRESS;
                    case 5:
                        return c.C2661c.C2663c.TRUCK_EXPRESS;
                    case 6:
                        return c.C2661c.C2663c.PICKUP_POINT;
                    case 7:
                        return c.C2661c.C2663c.INTERNAL_LOCKER;
                    case 8:
                        return c.C2661c.C2663c.EXTERNAL_LOCKER;
                    case 9:
                        return c.C2661c.C2663c.PARCEL_RETURN;
                    case 10:
                        return c.C2661c.C2663c.TRUCK_RETURN;
                    case 11:
                        return c.C2661c.C2663c.PARCEL_EXCHANGE;
                    case 12:
                        return c.C2661c.C2663c.TRUCK_EXCHANGE;
                    case 13:
                        return c.C2661c.C2663c.CASH_AND_CARRY;
                    case 14:
                        return c.C2661c.C2663c.UNKNOWN;
                    default:
                        throw new t();
                }
            }

            private C2659a() {
            }
        }

        static {
            C2658a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2659a((DefaultConstructorMarker) null);
        }

        private C2658a(String str) {
            this.rawValue = str;
        }

        public static C17220a<C2658a> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.rawValue;
        }
    }

    public a(c.C2661c.C2663c cVar, String str, h.a aVar, List<h> list) {
        C17542s.j(cVar, "type");
        C17542s.j(str, "deliveryNumber");
        C17542s.j(aVar, "bookedSlot");
        C17542s.j(list, "slots");
        this.f110735a = cVar;
        this.f110736b = str;
        this.f110737c = aVar;
        this.f110738d = list;
    }

    public final h.a a() {
        return this.f110737c;
    }

    public final List<h> b() {
        return this.f110738d;
    }

    public final c.C2661c.C2663c c() {
        return this.f110735a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f110735a == aVar.f110735a && C17542s.e(this.f110736b, aVar.f110736b) && C17542s.e(this.f110737c, aVar.f110737c) && C17542s.e(this.f110738d, aVar.f110738d);
    }

    public int hashCode() {
        return (((((this.f110735a.hashCode() * 31) + this.f110736b.hashCode()) * 31) + this.f110737c.hashCode()) * 31) + this.f110738d.hashCode();
    }

    public String toString() {
        c.C2661c.C2663c cVar = this.f110735a;
        String str = this.f110736b;
        h.a aVar = this.f110737c;
        List<h> list = this.f110738d;
        return "DeliveryTimeWindows(type=" + cVar + ", deliveryNumber=" + str + ", bookedSlot=" + aVar + ", slots=" + list + ")";
    }
}
