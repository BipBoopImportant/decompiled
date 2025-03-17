package p7;

import a7.C6750e;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\b\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lp7/l;", "La7/e;", "<init>", "()V", "Ljava/time/ZonedDateTime;", "start", "expiry", "Lp7/l$b;", "b", "(Ljava/time/ZonedDateTime;Ljava/time/ZonedDateTime;)Lp7/l$b;", "Ljava/security/cert/X509Certificate;", "leafCertificate", "", "", "La7/l;", "sctResults", "La7/m;", "a", "(Ljava/security/cert/X509Certificate;Ljava/util/Map;)La7/m;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements C6750e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55428a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Instant f55429b = Instant.ofEpochMilli(1649980800000L);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp7/l$a;", "", "<init>", "()V", "Ljava/time/Instant;", "kotlin.jvm.PlatformType", "policyUpdateDate", "Ljava/time/Instant;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lp7/l$b;", "", "", "roundedMonthDifference", "", "hasPartialMonth", "<init>", "(IZ)V", "a", "()I", "b", "()Z", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRoundedMonthDifference", "Z", "getHasPartialMonth", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f55430a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f55431b;

        public b(int i10, boolean z10) {
            this.f55430a = i10;
            this.f55431b = z10;
        }

        public final int a() {
            return this.f55430a;
        }

        public final boolean b() {
            return this.f55431b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55430a == bVar.f55430a && this.f55431b == bVar.f55431b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f55430a) * 31) + Boolean.hashCode(this.f55431b);
        }

        public String toString() {
            return "MonthDifference(roundedMonthDifference=" + this.f55430a + ", hasPartialMonth=" + this.f55431b + ')';
        }
    }

    private final b b(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        boolean z10 = false;
        if (zonedDateTime2.compareTo(zonedDateTime) < 0) {
            return new b(0, false);
        }
        int between = (int) ChronoUnit.MONTHS.between(zonedDateTime, zonedDateTime2);
        if (zonedDateTime2.getDayOfMonth() != zonedDateTime.getDayOfMonth()) {
            z10 = true;
        }
        return new b(between, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (java.time.temporal.ChronoUnit.DAYS.between(r2, r10) > 180) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r0 >= 15) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a7.m a(java.security.cert.X509Certificate r10, java.util.Map<java.lang.String, ? extends a7.l> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "leafCertificate"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "sctResults"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.util.Collection r0 = r11.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof a7.l.a
            if (r3 == 0) goto L_0x0019
            r1.add(r2)
            goto L_0x0019
        L_0x002b:
            java.util.Iterator r0 = r1.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x0037
            r0 = 0
            goto L_0x0062
        L_0x0037:
            java.lang.Object r2 = r0.next()
            a7.l$a r2 = (a7.l.a) r2
            q7.e r2 = r2.b()
            java.time.Instant r2 = r2.e()
        L_0x0045:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r0.next()
            a7.l$a r3 = (a7.l.a) r3
            q7.e r3 = r3.b()
            java.time.Instant r3 = r3.e()
            int r4 = r2.compareTo(r3)
            if (r4 <= 0) goto L_0x0045
            r2 = r3
            goto L_0x0045
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r0 != 0) goto L_0x0066
            java.time.Instant r0 = java.time.Instant.MAX
        L_0x0066:
            java.time.Instant r2 = f55429b
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            java.util.Date r2 = r10.getNotBefore()
            java.time.Instant r2 = r2.toInstant()
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r2 = r2.atZone(r3)
            java.util.Date r10 = r10.getNotAfter()
            java.time.Instant r10 = r10.toInstant()
            java.time.ZonedDateTime r10 = r10.atZone(r3)
            r3 = 3
            r4 = 2
            if (r0 == 0) goto L_0x009e
            java.time.temporal.ChronoUnit r0 = java.time.temporal.ChronoUnit.DAYS
            long r5 = r0.between(r2, r10)
            r7 = 180(0xb4, double:8.9E-322)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x009c
            goto L_0x00ca
        L_0x009c:
            r3 = r4
            goto L_0x00ca
        L_0x009e:
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r10)
            p7.l$b r10 = r9.b(r2, r10)
            int r0 = r10.a()
            boolean r10 = r10.b()
            r2 = 39
            if (r0 > r2) goto L_0x00c9
            if (r0 != r2) goto L_0x00b9
            if (r10 == 0) goto L_0x00b9
            goto L_0x00c9
        L_0x00b9:
            r2 = 27
            if (r0 > r2) goto L_0x00c7
            if (r0 != r2) goto L_0x00c2
            if (r10 == 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            r10 = 15
            if (r0 < r10) goto L_0x009c
            goto L_0x00ca
        L_0x00c7:
            r3 = 4
            goto L_0x00ca
        L_0x00c9:
            r3 = 5
        L_0x00ca:
            int r10 = r1.size()
            if (r10 >= r3) goto L_0x00d6
            a7.m$b$e r10 = new a7.m$b$e
            r10.<init>(r11, r3)
            goto L_0x0110
        L_0x00d6:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ff
            java.lang.Object r2 = r1.next()
            r3 = r2
            a7.l$a r3 = (a7.l.a) r3
            java.lang.String r3 = r3.a()
            boolean r3 = r10.add(r3)
            if (r3 == 0) goto L_0x00e4
            r0.add(r2)
            goto L_0x00e4
        L_0x00ff:
            int r10 = r0.size()
            if (r10 >= r4) goto L_0x010b
            a7.m$b$d r10 = new a7.m$b$d
            r10.<init>(r11, r4)
            goto L_0x0110
        L_0x010b:
            a7.m$c$e r10 = new a7.m$c$e
            r10.<init>(r11)
        L_0x0110:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l.a(java.security.cert.X509Certificate, java.util.Map):a7.m");
    }
}
