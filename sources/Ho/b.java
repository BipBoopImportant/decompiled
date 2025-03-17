package ho;

import Nn.C10808k;
import Nn.C10811n;
import Nn.C10812o;
import XH.t;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u001b\u0017BS\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b\u0017\u0010%\u0001\u0002&'¨\u0006("}, d2 = {"Lho/b;", "", "", "deliveryDescription", "deliveryDate", "deliveryDescriptionExpanded", "LNn/o$c;", "pricing", "LNn/n;", "deliveryPrice", "", "selected", "hasMultiplePrices", "", "collapsedRating", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/o$c;LNn/n;ZZLjava/lang/Integer;)V", "h", "()Z", "isInclTax", "", "e", "(Ljava/lang/Boolean;)Ljava/lang/Double;", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "LNn/o$c;", "getPricing", "()LNn/o$c;", "LNn/n;", "f", "Z", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lho/b$a;", "Lho/b$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f98097a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98098b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98099c;

    /* renamed from: d  reason: collision with root package name */
    private final C10812o.c f98100d;

    /* renamed from: e  reason: collision with root package name */
    private final C10811n f98101e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f98102f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f98103g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f98104h;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\n\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lho/b$a;", "Lho/b;", "LNn/k;", "deliveryService", "LNn/o;", "selectedOrClosest", "", "deliveryDate", "", "selected", "hasMultiplePrices", "<init>", "(LNn/k;LNn/o;Ljava/lang/String;ZZ)V", "h", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "LNn/k;", "()LNn/k;", "j", "LNn/o;", "getSelectedOrClosest", "()LNn/o;", "k", "Ljava/lang/String;", "b", "l", "Z", "g", "m", "f", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: i  reason: collision with root package name */
        private final C10808k f98105i;

        /* renamed from: j  reason: collision with root package name */
        private final C10812o f98106j;

        /* renamed from: k  reason: collision with root package name */
        private final String f98107k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f98108l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f98109m;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Nn.C10808k r21, Nn.C10812o r22, java.lang.String r23, boolean r24, boolean r25) {
            /*
                r20 = this;
                r10 = r20
                r11 = r21
                r12 = r22
                java.lang.String r0 = "deliveryService"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                java.lang.String r0 = "selectedOrClosest"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                java.lang.String r1 = r22.e()
                java.lang.String r3 = r22.f()
                java.util.List r0 = r21.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r2 = r0 instanceof java.util.Collection
                r4 = 0
                if (r2 == 0) goto L_0x002d
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x002d
                goto L_0x0048
            L_0x002d:
                java.util.Iterator r0 = r0.iterator()
            L_0x0031:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0048
                java.lang.Object r2 = r0.next()
                Nn.o r2 = (Nn.C10812o) r2
                Nn.o$c r2 = r2.l()
                boolean r2 = r2.c()
                if (r2 == 0) goto L_0x0031
                r4 = 1
            L_0x0048:
                java.util.List r0 = r21.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                r7 = 0
                if (r2 != 0) goto L_0x005b
                r2 = r7
                goto L_0x00a6
            L_0x005b:
                java.lang.Object r2 = r0.next()
                boolean r8 = r0.hasNext()
                if (r8 != 0) goto L_0x0066
                goto L_0x00a6
            L_0x0066:
                r8 = r2
                Nn.o r8 = (Nn.C10812o) r8
                Nn.o$c r8 = r8.l()
                java.lang.Double r8 = r8.b()
                if (r8 == 0) goto L_0x0078
                double r8 = r8.doubleValue()
                goto L_0x007d
            L_0x0078:
                r8 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            L_0x007d:
                java.lang.Object r13 = r0.next()
                r14 = r13
                Nn.o r14 = (Nn.C10812o) r14
                Nn.o$c r14 = r14.l()
                java.lang.Double r14 = r14.b()
                if (r14 == 0) goto L_0x0093
                double r14 = r14.doubleValue()
                goto L_0x0098
            L_0x0093:
                r14 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            L_0x0098:
                int r16 = java.lang.Double.compare(r8, r14)
                if (r16 <= 0) goto L_0x00a0
                r2 = r13
                r8 = r14
            L_0x00a0:
                boolean r13 = r0.hasNext()
                if (r13 != 0) goto L_0x007d
            L_0x00a6:
                Nn.o r2 = (Nn.C10812o) r2
                if (r2 == 0) goto L_0x00b6
                Nn.o$c r0 = r2.l()
                if (r0 == 0) goto L_0x00b6
                java.lang.Double r0 = r0.b()
                r13 = r0
                goto L_0x00b7
            L_0x00b6:
                r13 = r7
            L_0x00b7:
                java.util.List r0 = r21.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r14 = r0.iterator()
                boolean r0 = r14.hasNext()
                if (r0 != 0) goto L_0x00c9
                r0 = r7
                goto L_0x0111
            L_0x00c9:
                java.lang.Object r0 = r14.next()
                boolean r2 = r14.hasNext()
                if (r2 != 0) goto L_0x00d4
                goto L_0x0111
            L_0x00d4:
                r2 = r0
                Nn.o r2 = (Nn.C10812o) r2
                Nn.o$c r2 = r2.l()
                java.lang.Double r2 = r2.a()
                r15 = 1
                if (r2 == 0) goto L_0x00e8
                double r8 = r2.doubleValue()
                goto L_0x00e9
            L_0x00e8:
                r8 = r15
            L_0x00e9:
                java.lang.Object r2 = r14.next()
                r17 = r2
                Nn.o r17 = (Nn.C10812o) r17
                Nn.o$c r17 = r17.l()
                java.lang.Double r17 = r17.a()
                if (r17 == 0) goto L_0x0102
                double r17 = r17.doubleValue()
                r5 = r17
                goto L_0x0103
            L_0x0102:
                r5 = r15
            L_0x0103:
                int r19 = java.lang.Double.compare(r8, r5)
                if (r19 >= 0) goto L_0x010b
                r0 = r2
                r8 = r5
            L_0x010b:
                boolean r2 = r14.hasNext()
                if (r2 != 0) goto L_0x00e9
            L_0x0111:
                Nn.o r0 = (Nn.C10812o) r0
                if (r0 == 0) goto L_0x0120
                Nn.o$c r0 = r0.l()
                if (r0 == 0) goto L_0x0120
                java.lang.Double r0 = r0.a()
                goto L_0x0121
            L_0x0120:
                r0 = r7
            L_0x0121:
                Nn.o$c r5 = new Nn.o$c
                r5.<init>(r4, r13, r0)
                java.util.List r0 = r21.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r2 = r0.iterator()
                boolean r0 = r2.hasNext()
                if (r0 != 0) goto L_0x0139
                r0 = r7
                goto L_0x01af
            L_0x0139:
                java.lang.Object r0 = r2.next()
                boolean r4 = r2.hasNext()
                if (r4 != 0) goto L_0x0145
                goto L_0x01af
            L_0x0145:
                r4 = r0
                Nn.o r4 = (Nn.C10812o) r4
                Nn.n r6 = r4.g()
                if (r6 == 0) goto L_0x0159
                java.lang.Double r6 = r6.a()
                if (r6 == 0) goto L_0x0159
                double r8 = r6.doubleValue()
                goto L_0x0171
            L_0x0159:
                Nn.n r4 = r4.g()
                if (r4 == 0) goto L_0x0164
                java.lang.Double r4 = r4.b()
                goto L_0x0165
            L_0x0164:
                r4 = r7
            L_0x0165:
                if (r4 == 0) goto L_0x016c
                double r8 = r4.doubleValue()
                goto L_0x0171
            L_0x016c:
                r8 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            L_0x0171:
                java.lang.Object r4 = r2.next()
                r6 = r4
                Nn.o r6 = (Nn.C10812o) r6
                Nn.n r13 = r6.g()
                if (r13 == 0) goto L_0x0189
                java.lang.Double r13 = r13.a()
                if (r13 == 0) goto L_0x0189
                double r13 = r13.doubleValue()
                goto L_0x01a1
            L_0x0189:
                Nn.n r6 = r6.g()
                if (r6 == 0) goto L_0x0194
                java.lang.Double r6 = r6.b()
                goto L_0x0195
            L_0x0194:
                r6 = r7
            L_0x0195:
                if (r6 == 0) goto L_0x019c
                double r13 = r6.doubleValue()
                goto L_0x01a1
            L_0x019c:
                r13 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            L_0x01a1:
                int r6 = java.lang.Double.compare(r8, r13)
                if (r6 <= 0) goto L_0x01a9
                r0 = r4
                r8 = r13
            L_0x01a9:
                boolean r4 = r2.hasNext()
                if (r4 != 0) goto L_0x0256
            L_0x01af:
                Nn.o r0 = (Nn.C10812o) r0
                if (r0 == 0) goto L_0x01b9
                Nn.n r0 = r0.g()
                r6 = r0
                goto L_0x01ba
            L_0x01b9:
                r6 = r7
            L_0x01ba:
                java.util.List r0 = r21.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x01c9:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x01e0
                java.lang.Object r4 = r0.next()
                r8 = r4
                Nn.o r8 = (Nn.C10812o) r8
                java.lang.Integer r8 = r8.a()
                if (r8 == 0) goto L_0x01c9
                r2.add(r4)
                goto L_0x01c9
            L_0x01e0:
                java.util.Iterator r4 = r2.iterator()
                boolean r0 = r4.hasNext()
                if (r0 != 0) goto L_0x01ec
                r0 = r7
                goto L_0x0225
            L_0x01ec:
                java.lang.Object r0 = r4.next()
                boolean r2 = r4.hasNext()
                if (r2 != 0) goto L_0x01f7
                goto L_0x0225
            L_0x01f7:
                r2 = r0
                Nn.o r2 = (Nn.C10812o) r2
                java.lang.Integer r2 = r2.a()
                r13 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 == 0) goto L_0x0207
                int r2 = r2.intValue()
                goto L_0x0208
            L_0x0207:
                r2 = r13
            L_0x0208:
                java.lang.Object r8 = r4.next()
                r9 = r8
                Nn.o r9 = (Nn.C10812o) r9
                java.lang.Integer r9 = r9.a()
                if (r9 == 0) goto L_0x021a
                int r9 = r9.intValue()
                goto L_0x021b
            L_0x021a:
                r9 = r13
            L_0x021b:
                if (r2 >= r9) goto L_0x021f
                r0 = r8
                r2 = r9
            L_0x021f:
                boolean r8 = r4.hasNext()
                if (r8 != 0) goto L_0x024f
            L_0x0225:
                Nn.o r0 = (Nn.C10812o) r0
                if (r0 == 0) goto L_0x022f
                java.lang.Integer r0 = r0.a()
                r8 = r0
                goto L_0x0230
            L_0x022f:
                r8 = r7
            L_0x0230:
                r9 = 0
                r0 = r20
                r2 = r23
                r4 = r5
                r5 = r6
                r6 = r24
                r7 = r25
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r10.f98105i = r11
                r10.f98106j = r12
                r14 = r23
                r10.f98107k = r14
                r15 = r24
                r10.f98108l = r15
                r8 = r25
                r10.f98109m = r8
                return
            L_0x024f:
                r14 = r23
                r15 = r24
                r8 = r25
                goto L_0x0208
            L_0x0256:
                r14 = r23
                r15 = r24
                goto L_0x0171
            */
            throw new UnsupportedOperationException("Method not decompiled: ho.b.a.<init>(Nn.k, Nn.o, java.lang.String, boolean, boolean):void");
        }

        public String b() {
            return this.f98107k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f98105i, aVar.f98105i) && C17542s.e(this.f98106j, aVar.f98106j) && C17542s.e(this.f98107k, aVar.f98107k) && this.f98108l == aVar.f98108l && this.f98109m == aVar.f98109m;
        }

        public boolean f() {
            return this.f98109m;
        }

        public boolean g() {
            return this.f98108l;
        }

        public boolean h() {
            Iterable<C10812o> a10 = this.f98105i.a();
            if ((a10 instanceof Collection) && ((Collection) a10).isEmpty()) {
                return true;
            }
            for (C10812o oVar : a10) {
                if (oVar instanceof C10812o.a) {
                    return false;
                }
                if (!(oVar instanceof C10812o.d)) {
                    throw new t();
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = ((this.f98105i.hashCode() * 31) + this.f98106j.hashCode()) * 31;
            String str = this.f98107k;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f98108l)) * 31) + Boolean.hashCode(this.f98109m);
        }

        public final C10808k i() {
            return this.f98105i;
        }

        public String toString() {
            C10808k kVar = this.f98105i;
            C10812o oVar = this.f98106j;
            String str = this.f98107k;
            boolean z10 = this.f98108l;
            boolean z11 = this.f98109m;
            return "CollectDeliveryOption(deliveryService=" + kVar + ", selectedOrClosest=" + oVar + ", deliveryDate=" + str + ", selected=" + z10 + ", hasMultiplePrices=" + z11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lho/b$b;", "Lho/b;", "LNn/o;", "deliveryService", "", "selected", "<init>", "(LNn/o;Z)V", "h", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "LNn/o;", "()LNn/o;", "j", "Z", "g", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ho.b$b  reason: collision with other inner class name */
    public static final class C2205b extends b {

        /* renamed from: i  reason: collision with root package name */
        private final C10812o f98110i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f98111j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2205b(C10812o oVar, boolean z10) {
            super(oVar.e(), oVar.c(), oVar.f(), oVar.l(), oVar.g(), z10, false, oVar.a(), (DefaultConstructorMarker) null);
            C17542s.j(oVar, "deliveryService");
            this.f98110i = oVar;
            this.f98111j = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2205b)) {
                return false;
            }
            C2205b bVar = (C2205b) obj;
            return C17542s.e(this.f98110i, bVar.f98110i) && this.f98111j == bVar.f98111j;
        }

        public boolean g() {
            return this.f98111j;
        }

        public boolean h() {
            C10812o oVar = this.f98110i;
            if (oVar instanceof C10812o.a) {
                return false;
            }
            if (oVar instanceof C10812o.d) {
                return true;
            }
            throw new t();
        }

        public int hashCode() {
            return (this.f98110i.hashCode() * 31) + Boolean.hashCode(this.f98111j);
        }

        public final C10812o i() {
            return this.f98110i;
        }

        public String toString() {
            C10812o oVar = this.f98110i;
            boolean z10 = this.f98111j;
            return "HomeDeliveryOption(deliveryService=" + oVar + ", selected=" + z10 + ")";
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, C10812o.c cVar, C10811n nVar, boolean z10, boolean z11, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, cVar, nVar, z10, z11, num);
    }

    public final Integer a() {
        return this.f98104h;
    }

    public String b() {
        return this.f98098b;
    }

    public final String c() {
        return this.f98097a;
    }

    public final String d() {
        return this.f98099c;
    }

    public final Double e(Boolean bool) {
        Double b10 = this.f98100d.b();
        if (b10 != null) {
            return b10;
        }
        C10811n nVar = this.f98101e;
        if (nVar != null) {
            return nVar.c(bool);
        }
        return null;
    }

    public boolean f() {
        return this.f98103g;
    }

    public boolean g() {
        return this.f98102f;
    }

    public abstract boolean h();

    private b(String str, String str2, String str3, C10812o.c cVar, C10811n nVar, boolean z10, boolean z11, Integer num) {
        this.f98097a = str;
        this.f98098b = str2;
        this.f98099c = str3;
        this.f98100d = cVar;
        this.f98101e = nVar;
        this.f98102f = z10;
        this.f98103g = z11;
        this.f98104h = num;
    }
}
