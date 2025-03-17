package jo;

import IC.C13023e;
import Nn.C10808k;
import Nn.C10810m;
import Nn.C10812o;
import Nn.C10813p;
import Nn.G;
import Nn.M;
import Nn.O;
import Nn.P;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 /2\u00020\u0001:\u0002\u0015\"B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jz\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b-\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b1\u00106¨\u00067"}, d2 = {"Ljo/a;", "", "", "deliveryArrangementId", "LNn/P;", "transportMethod", "", "LNn/m;", "items", "LNn/M;", "selectedTimeSlot", "LNn/O;", "timeWindowData", "deliveryDateDetails", "collapsedDeliveryInformation", "LNn/G;", "selectedPickupPointHolder", "LIC/e;", "primeTimeSlotText", "<init>", "(Ljava/lang/String;LNn/P;Ljava/util/List;LNn/M;LNn/O;Ljava/lang/String;Ljava/lang/String;LNn/G;LIC/e;)V", "a", "(Ljava/lang/String;LNn/P;Ljava/util/List;LNn/M;LNn/O;Ljava/lang/String;Ljava/lang/String;LNn/G;LIC/e;)Ljo/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "LNn/P;", "k", "()LNn/P;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "LNn/M;", "i", "()LNn/M;", "e", "LNn/O;", "j", "()LNn/O;", "g", "h", "LNn/G;", "()LNn/G;", "LIC/e;", "()LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jo.a  reason: case insensitive filesystem */
public final class C11435a {

    /* renamed from: j  reason: collision with root package name */
    public static final C2228a f98597j = new C2228a((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f98598k = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f98599a;

    /* renamed from: b  reason: collision with root package name */
    private final P f98600b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10810m> f98601c;

    /* renamed from: d  reason: collision with root package name */
    private final M f98602d;

    /* renamed from: e  reason: collision with root package name */
    private final O f98603e;

    /* renamed from: f  reason: collision with root package name */
    private final String f98604f;

    /* renamed from: g  reason: collision with root package name */
    private final String f98605g;

    /* renamed from: h  reason: collision with root package name */
    private final G f98606h;

    /* renamed from: i  reason: collision with root package name */
    private final C13023e f98607i;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001d\u001a\u00020\u001c*\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ljo/a$a;", "", "<init>", "()V", "LNn/p;", "deliveryServiceType", "", "LNn/o;", "homeDeliveryServices", "LNn/k;", "collectDeliveryServices", "", "selectedDeliveryId", "LNn/o$b;", "c", "(LNn/p;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)LNn/o$b;", "deliveryServices", "b", "(Ljava/util/List;Ljava/lang/String;)LNn/o$b;", "LNn/K$b;", "selectedDelivery", "LNn/q;", "deliveryTimeWindows", "LNn/c;", "d", "(LNn/K$b;LNn/o$b;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Ljo/a$b;", "primeTimeSlotConfig", "Ljo/a;", "a", "(LNn/K$b;LNn/p;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljo/a$b;)Ljo/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jo.a$a  reason: collision with other inner class name */
    public static final class C2228a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jo.a$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2229a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f98608a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Nn.p[] r0 = Nn.C10813p.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Nn.p r1 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Nn.p r1 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Nn.p r1 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Nn.p r1 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Nn.p r1 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Nn.p r1 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f98608a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: jo.C11435a.C2228a.C2229a.<clinit>():void");
            }
        }

        public /* synthetic */ C2228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C10812o.b b(List<? extends C10812o> list, String str) {
            if (list == null) {
                return null;
            }
            for (C10812o b10 : list) {
                Iterator it = b10.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C10812o.b bVar = (C10812o.b) it.next();
                        if (C17542s.e(bVar.c(), str)) {
                            return bVar;
                        }
                    }
                }
            }
            return null;
        }

        private final C10812o.b c(C10813p pVar, List<? extends C10812o> list, List<? extends C10808k> list2, String str) {
            ArrayList arrayList = null;
            switch (pVar == null ? -1 : C2229a.f98608a[pVar.ordinal()]) {
                case -1:
                    return null;
                case 1:
                    return b(list, str);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        for (C10808k a10 : list2) {
                            C16877v.E(arrayList, a10.a());
                        }
                    }
                    return b(arrayList, str);
                default:
                    throw new t();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r7.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<Nn.C10800c> d(Nn.K.b r6, Nn.C10812o.b r7, java.util.List<Nn.C10814q> r8, java.lang.String r9) {
            /*
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L_0x000e
                Nn.M r1 = r7.b()
                if (r1 == 0) goto L_0x000e
                java.lang.String r1 = r1.e()
                goto L_0x000f
            L_0x000e:
                r1 = r0
            L_0x000f:
                Nn.K$b$c r2 = r6.e()
                java.lang.String r2 = r2.b()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
                if (r1 == 0) goto L_0x0023
                Nn.M r7 = r7.b()
                goto L_0x0093
            L_0x0023:
                if (r8 == 0) goto L_0x0092
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r7 = r8.iterator()
            L_0x002b:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0043
                java.lang.Object r8 = r7.next()
                r1 = r8
                Nn.q r1 = (Nn.C10814q) r1
                java.lang.String r1 = r1.b()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r9)
                if (r1 == 0) goto L_0x002b
                goto L_0x0044
            L_0x0043:
                r8 = r0
            L_0x0044:
                Nn.q r8 = (Nn.C10814q) r8
                if (r8 == 0) goto L_0x0092
                Nn.M r7 = r8.c()
                java.lang.String r7 = r7.e()
                Nn.K$b$c r9 = r6.e()
                java.lang.String r9 = r9.b()
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
                if (r7 == 0) goto L_0x0063
                Nn.M r7 = r8.c()
                goto L_0x0093
            L_0x0063:
                java.util.List r7 = r8.d()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x006d:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x008d
                java.lang.Object r8 = r7.next()
                r9 = r8
                Nn.M r9 = (Nn.M) r9
                java.lang.String r9 = r9.e()
                Nn.K$b$c r1 = r6.e()
                java.lang.String r1 = r1.b()
                boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r1)
                if (r9 == 0) goto L_0x006d
                goto L_0x008e
            L_0x008d:
                r8 = r0
            L_0x008e:
                Nn.M r8 = (Nn.M) r8
                r7 = r8
                goto L_0x0093
            L_0x0092:
                r7 = r0
            L_0x0093:
                if (r7 == 0) goto L_0x00f3
                java.util.List r7 = r7.a()
                if (r7 == 0) goto L_0x00f3
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = YH.C16877v.y(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            L_0x00ac:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x00f7
                java.lang.Object r9 = r7.next()
                Nn.c r9 = (Nn.C10800c) r9
                Nn.K$b$c r1 = r6.e()
                java.util.List r1 = r1.c()
                if (r1 == 0) goto L_0x00e0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x00c8:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00dc
                java.lang.Object r2 = r1.next()
                r3 = r2
                Nn.N r3 = (Nn.N) r3
                Nn.N r4 = r9.b()
                if (r3 != r4) goto L_0x00c8
                goto L_0x00dd
            L_0x00dc:
                r2 = r0
            L_0x00dd:
                Nn.N r2 = (Nn.N) r2
                goto L_0x00e1
            L_0x00e0:
                r2 = r0
            L_0x00e1:
                Nn.c r1 = new Nn.c
                Nn.N r9 = r9.b()
                if (r2 == 0) goto L_0x00eb
                r2 = 1
                goto L_0x00ec
            L_0x00eb:
                r2 = 0
            L_0x00ec:
                r1.<init>(r9, r2)
                r8.add(r1)
                goto L_0x00ac
            L_0x00f3:
                java.util.List r8 = YH.C16877v.n()
            L_0x00f7:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jo.C11435a.C2228a.d(Nn.K$b, Nn.o$b, java.util.List, java.lang.String):java.util.List");
        }

        /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final jo.C11435a a(Nn.K.b r24, Nn.C10813p r25, java.util.List<? extends Nn.C10812o> r26, java.util.List<? extends Nn.C10808k> r27, java.util.List<Nn.C10814q> r28, jo.C11435a.b r29) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = r28
                java.lang.String r3 = "<this>"
                kotlin.jvm.internal.C17542s.j(r1, r3)
                java.lang.String r3 = r24.a()
                r4 = r25
                r5 = r26
                r6 = r27
                Nn.o$b r3 = r0.c(r4, r5, r6, r3)
                r4 = 0
                if (r2 == 0) goto L_0x0043
                r5 = r2
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x0023:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x003f
                java.lang.Object r6 = r5.next()
                r7 = r6
                Nn.q r7 = (Nn.C10814q) r7
                java.lang.String r7 = r7.b()
                java.lang.String r8 = r24.a()
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
                if (r7 == 0) goto L_0x0023
                goto L_0x0040
            L_0x003f:
                r6 = r4
            L_0x0040:
                Nn.q r6 = (Nn.C10814q) r6
                goto L_0x0044
            L_0x0043:
                r6 = r4
            L_0x0044:
                if (r6 == 0) goto L_0x0090
                Nn.M r5 = r6.c()
                java.lang.String r5 = r5.e()
                Nn.K$b$c r7 = r24.e()
                java.lang.String r7 = r7.b()
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
                if (r5 == 0) goto L_0x0061
                Nn.M r5 = r6.c()
                goto L_0x0091
            L_0x0061:
                java.util.List r5 = r6.d()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x006b:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x008b
                java.lang.Object r7 = r5.next()
                r8 = r7
                Nn.M r8 = (Nn.M) r8
                java.lang.String r8 = r8.e()
                Nn.K$b$c r9 = r24.e()
                java.lang.String r9 = r9.b()
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
                if (r8 == 0) goto L_0x006b
                goto L_0x008c
            L_0x008b:
                r7 = r4
            L_0x008c:
                r5 = r7
                Nn.M r5 = (Nn.M) r5
                goto L_0x0091
            L_0x0090:
                r5 = r4
            L_0x0091:
                java.lang.String r7 = r24.a()
                java.util.List r12 = r0.d(r1, r3, r2, r7)
                if (r2 == 0) goto L_0x00c1
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x00a1:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00bd
                java.lang.Object r3 = r2.next()
                r7 = r3
                Nn.q r7 = (Nn.C10814q) r7
                java.lang.String r7 = r7.b()
                java.lang.String r8 = r24.a()
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
                if (r7 == 0) goto L_0x00a1
                goto L_0x00be
            L_0x00bd:
                r3 = r4
            L_0x00be:
                Nn.q r3 = (Nn.C10814q) r3
                goto L_0x00c2
            L_0x00c1:
                r3 = r4
            L_0x00c2:
                Nn.M r17 = new Nn.M
                Nn.K$b$c r2 = r24.e()
                java.util.Date r9 = r2.a()
                Nn.K$b$c r2 = r24.e()
                java.util.Date r10 = r2.d()
                Nn.K$b$c r2 = r24.e()
                java.lang.String r11 = r2.b()
                if (r5 == 0) goto L_0x00e4
                Nn.n r2 = r5.b()
                r13 = r2
                goto L_0x00e5
            L_0x00e4:
                r13 = r4
            L_0x00e5:
                if (r5 == 0) goto L_0x00ed
                boolean r2 = r5.d()
            L_0x00eb:
                r14 = r2
                goto L_0x00ef
            L_0x00ed:
                r2 = 0
                goto L_0x00eb
            L_0x00ef:
                r8 = r17
                r8.<init>(r9, r10, r11, r12, r13, r14)
                if (r3 == 0) goto L_0x010b
                Nn.M r2 = r3.c()
                java.util.List r2 = YH.C16877v.e(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.List r3 = r3.d()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.List r2 = YH.C16877v.V0(r2, r3)
                goto L_0x010c
            L_0x010b:
                r2 = r4
            L_0x010c:
                if (r29 == 0) goto L_0x015a
                Nn.n r3 = r17.b()
                if (r6 == 0) goto L_0x011f
                Nn.M r5 = r6.a()
                if (r5 == 0) goto L_0x011f
                Nn.n r5 = r5.b()
                goto L_0x0120
            L_0x011f:
                r5 = r4
            L_0x0120:
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
                if (r3 != 0) goto L_0x0156
                boolean r3 = r29.b()
                if (r3 == 0) goto L_0x0135
                if (r5 == 0) goto L_0x0133
                java.lang.Double r3 = r5.a()
                goto L_0x013b
            L_0x0133:
                r3 = r4
                goto L_0x013b
            L_0x0135:
                if (r5 == 0) goto L_0x0133
                java.lang.Double r3 = r5.b()
            L_0x013b:
                if (r3 == 0) goto L_0x0156
                double r7 = r3.doubleValue()
                int r3 = rv.C11849b.f102179E0
                qx.a r5 = qx.C14956a.f130484a
                kp.d r9 = r29.a()
                java.lang.String r5 = r5.b(r7, r9)
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                IC.e r3 = IC.C13026h.b(r3, r5)
                goto L_0x0157
            L_0x0156:
                r3 = r4
            L_0x0157:
                r22 = r3
                goto L_0x015c
            L_0x015a:
                r22 = r4
            L_0x015c:
                jo.a r3 = new jo.a
                java.lang.String r14 = r24.a()
                Nn.P r15 = r24.f()
                java.util.List r16 = r24.b()
                if (r6 == 0) goto L_0x0170
                Nn.M r4 = r6.a()
            L_0x0170:
                Nn.K$b$b r5 = r24.c()
                java.lang.String r5 = r5.d()
                Nn.K$b$b r6 = r24.c()
                boolean r6 = r6.a()
                Nn.O r7 = new Nn.O
                r7.<init>(r5, r2, r4, r6)
                Nn.K$b$b r2 = r24.c()
                java.lang.String r19 = r2.c()
                Nn.K$b$b r2 = r24.c()
                java.lang.String r20 = r2.b()
                Nn.G r21 = r24.d()
                r13 = r3
                r18 = r7
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: jo.C11435a.C2228a.a(Nn.K$b, Nn.p, java.util.List, java.util.List, java.util.List, jo.a$b):jo.a");
        }

        private C2228a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljo/a$b;", "", "", "showTotalExclTaxInCartAndCheckout", "Lkp/d;", "currencyConfig", "<init>", "(ZLkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lkp/d;", "()Lkp/d;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jo.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f98609a;

        /* renamed from: b  reason: collision with root package name */
        private final C11522d f98610b;

        public b(boolean z10, C11522d dVar) {
            C17542s.j(dVar, "currencyConfig");
            this.f98609a = z10;
            this.f98610b = dVar;
        }

        public final C11522d a() {
            return this.f98610b;
        }

        public final boolean b() {
            return this.f98609a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f98609a == bVar.f98609a && C17542s.e(this.f98610b, bVar.f98610b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f98609a) * 31) + this.f98610b.hashCode();
        }

        public String toString() {
            boolean z10 = this.f98609a;
            C11522d dVar = this.f98610b;
            return "PrimeTimeSlotConfig(showTotalExclTaxInCartAndCheckout=" + z10 + ", currencyConfig=" + dVar + ")";
        }
    }

    public C11435a(String str, P p10, List<C10810m> list, M m10, O o10, String str2, String str3, G g10, C13023e eVar) {
        C17542s.j(str, "deliveryArrangementId");
        C17542s.j(p10, "transportMethod");
        C17542s.j(list, "items");
        C17542s.j(o10, "timeWindowData");
        this.f98599a = str;
        this.f98600b = p10;
        this.f98601c = list;
        this.f98602d = m10;
        this.f98603e = o10;
        this.f98604f = str2;
        this.f98605g = str3;
        this.f98606h = g10;
        this.f98607i = eVar;
    }

    public static /* synthetic */ C11435a b(C11435a aVar, String str, P p10, List list, M m10, O o10, String str2, String str3, G g10, C13023e eVar, int i10, Object obj) {
        C11435a aVar2 = aVar;
        int i11 = i10;
        return aVar.a((i11 & 1) != 0 ? aVar2.f98599a : str, (i11 & 2) != 0 ? aVar2.f98600b : p10, (i11 & 4) != 0 ? aVar2.f98601c : list, (i11 & 8) != 0 ? aVar2.f98602d : m10, (i11 & 16) != 0 ? aVar2.f98603e : o10, (i11 & 32) != 0 ? aVar2.f98604f : str2, (i11 & 64) != 0 ? aVar2.f98605g : str3, (i11 & 128) != 0 ? aVar2.f98606h : g10, (i11 & 256) != 0 ? aVar2.f98607i : eVar);
    }

    public final C11435a a(String str, P p10, List<C10810m> list, M m10, O o10, String str2, String str3, G g10, C13023e eVar) {
        C17542s.j(str, "deliveryArrangementId");
        C17542s.j(p10, "transportMethod");
        C17542s.j(list, "items");
        O o11 = o10;
        C17542s.j(o11, "timeWindowData");
        return new C11435a(str, p10, list, m10, o11, str2, str3, g10, eVar);
    }

    public final String c() {
        return this.f98605g;
    }

    public final String d() {
        return this.f98599a;
    }

    public final String e() {
        return this.f98604f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11435a)) {
            return false;
        }
        C11435a aVar = (C11435a) obj;
        return C17542s.e(this.f98599a, aVar.f98599a) && this.f98600b == aVar.f98600b && C17542s.e(this.f98601c, aVar.f98601c) && C17542s.e(this.f98602d, aVar.f98602d) && C17542s.e(this.f98603e, aVar.f98603e) && C17542s.e(this.f98604f, aVar.f98604f) && C17542s.e(this.f98605g, aVar.f98605g) && C17542s.e(this.f98606h, aVar.f98606h) && C17542s.e(this.f98607i, aVar.f98607i);
    }

    public final List<C10810m> f() {
        return this.f98601c;
    }

    public final C13023e g() {
        return this.f98607i;
    }

    public final G h() {
        return this.f98606h;
    }

    public int hashCode() {
        int hashCode = ((((this.f98599a.hashCode() * 31) + this.f98600b.hashCode()) * 31) + this.f98601c.hashCode()) * 31;
        M m10 = this.f98602d;
        int i10 = 0;
        int hashCode2 = (((hashCode + (m10 == null ? 0 : m10.hashCode())) * 31) + this.f98603e.hashCode()) * 31;
        String str = this.f98604f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98605g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        G g10 = this.f98606h;
        int hashCode5 = (hashCode4 + (g10 == null ? 0 : g10.hashCode())) * 31;
        C13023e eVar = this.f98607i;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return hashCode5 + i10;
    }

    public final M i() {
        return this.f98602d;
    }

    public final O j() {
        return this.f98603e;
    }

    public final P k() {
        return this.f98600b;
    }

    public String toString() {
        String str = this.f98599a;
        P p10 = this.f98600b;
        List<C10810m> list = this.f98601c;
        M m10 = this.f98602d;
        O o10 = this.f98603e;
        String str2 = this.f98604f;
        String str3 = this.f98605g;
        G g10 = this.f98606h;
        C13023e eVar = this.f98607i;
        return "DeliveryArrangementHolder(deliveryArrangementId=" + str + ", transportMethod=" + p10 + ", items=" + list + ", selectedTimeSlot=" + m10 + ", timeWindowData=" + o10 + ", deliveryDateDetails=" + str2 + ", collapsedDeliveryInformation=" + str3 + ", selectedPickupPointHolder=" + g10 + ", primeTimeSlotText=" + eVar + ")";
    }
}
