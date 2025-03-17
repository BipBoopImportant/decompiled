package jz;

import am.h;
import iz.C14605s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.G;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Ljz/i;", "", "Lam/h;", "timeProvider", "<init>", "(Lam/h;)V", "Ljz/i$a$b;", "payLoad", "Lrz/G;", "scanAndGoOrder", "LXH/N;", "a", "(Ljz/i$a$b;Lrz/G;)V", "b", "(Ljz/i$a$b;)Lrz/G;", "Lam/h;", "Ljz/i$a$a;", "Ljz/i$a$a;", "cachedOrder", "c", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f128297c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f128298a;

    /* renamed from: b  reason: collision with root package name */
    private a.C3167a f128299b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ljz/i$a;", "", "<init>", "()V", "b", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljz/i$a$a;", "", "Ljz/i$a$b;", "payLoad", "Lrz/G;", "order", "", "timeStamp", "<init>", "(Ljz/i$a$b;Lrz/G;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljz/i$a$b;", "b", "()Ljz/i$a$b;", "Lrz/G;", "()Lrz/G;", "c", "J", "()J", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jz.i$a$a  reason: collision with other inner class name */
        public static final class C3167a {

            /* renamed from: a  reason: collision with root package name */
            private final b f128300a;

            /* renamed from: b  reason: collision with root package name */
            private final G f128301b;

            /* renamed from: c  reason: collision with root package name */
            private final long f128302c;

            public C3167a(b bVar, G g10, long j10) {
                C17542s.j(bVar, "payLoad");
                C17542s.j(g10, "order");
                this.f128300a = bVar;
                this.f128301b = g10;
                this.f128302c = j10;
            }

            public final G a() {
                return this.f128301b;
            }

            public final b b() {
                return this.f128300a;
            }

            public final long c() {
                return this.f128302c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3167a)) {
                    return false;
                }
                C3167a aVar = (C3167a) obj;
                return C17542s.e(this.f128300a, aVar.f128300a) && C17542s.e(this.f128301b, aVar.f128301b) && this.f128302c == aVar.f128302c;
            }

            public int hashCode() {
                return (((this.f128300a.hashCode() * 31) + this.f128301b.hashCode()) * 31) + Long.hashCode(this.f128302c);
            }

            public String toString() {
                b bVar = this.f128300a;
                G g10 = this.f128301b;
                long j10 = this.f128302c;
                return "CachedOrder(payLoad=" + bVar + ", order=" + g10 + ", timeStamp=" + j10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Ljz/i$a$b;", "", "", "storeId", "familyCardId", "Liz/s;", "products", "", "nonSkippedCouponCodes", "", "isCoworkerDiscountApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liz/s;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Liz/s;", "()Liz/s;", "Ljava/util/List;", "()Ljava/util/List;", "e", "Z", "()Z", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f128303a;

            /* renamed from: b  reason: collision with root package name */
            private final String f128304b;

            /* renamed from: c  reason: collision with root package name */
            private final C14605s f128305c;

            /* renamed from: d  reason: collision with root package name */
            private final List<String> f128306d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f128307e;

            public b(String str, String str2, C14605s sVar, List<String> list, boolean z10) {
                C17542s.j(str, "storeId");
                C17542s.j(str2, "familyCardId");
                C17542s.j(sVar, "products");
                this.f128303a = str;
                this.f128304b = str2;
                this.f128305c = sVar;
                this.f128306d = list;
                this.f128307e = z10;
            }

            public final String a() {
                return this.f128304b;
            }

            public final List<String> b() {
                return this.f128306d;
            }

            public final C14605s c() {
                return this.f128305c;
            }

            public final String d() {
                return this.f128303a;
            }

            public final boolean e() {
                return this.f128307e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f128303a, bVar.f128303a) && C17542s.e(this.f128304b, bVar.f128304b) && C17542s.e(this.f128305c, bVar.f128305c) && C17542s.e(this.f128306d, bVar.f128306d) && this.f128307e == bVar.f128307e;
            }

            public int hashCode() {
                int hashCode = ((((this.f128303a.hashCode() * 31) + this.f128304b.hashCode()) * 31) + this.f128305c.hashCode()) * 31;
                List<String> list = this.f128306d;
                return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f128307e);
            }

            public String toString() {
                String str = this.f128303a;
                String str2 = this.f128304b;
                C14605s sVar = this.f128305c;
                List<String> list = this.f128306d;
                boolean z10 = this.f128307e;
                return "PayLoad(storeId=" + str + ", familyCardId=" + str2 + ", products=" + sVar + ", nonSkippedCouponCodes=" + list + ", isCoworkerDiscountApplied=" + z10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(h hVar) {
        C17542s.j(hVar, "timeProvider");
        this.f128298a = hVar;
    }

    public final void a(a.b bVar, G g10) {
        C17542s.j(bVar, "payLoad");
        C17542s.j(g10, "scanAndGoOrder");
        this.f128299b = new a.C3167a(bVar, g10, this.f128298a.c());
    }

    public final G b(a.b bVar) {
        C17542s.j(bVar, "payLoad");
        a.C3167a aVar = this.f128299b;
        if (aVar == null) {
            return null;
        }
        if (!C17542s.e(aVar.b(), bVar) || this.f128298a.c() - aVar.c() >= j.a()) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }
}
