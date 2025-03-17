package RB;

import TJ.C16532g;
import XH.t;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRB/b;", "", "", "itemNo", "LTJ/g;", "", "LRB/b$a;", "a", "(Ljava/lang/String;)LTJ/g;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.b  reason: case insensitive filesystem */
public interface C13505b {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LRB/b$a;", "", "", "storeId", "LRB/b$a$a;", "stockStatus", "stockLabel", "", "availabilityClickCollect", "<init>", "(Ljava/lang/String;LRB/b$a$a;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "LRB/b$a$a;", "c", "()LRB/b$a$a;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "()Z", "isInStoreStockDifferentFromClickCollect", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f115124a;

        /* renamed from: b  reason: collision with root package name */
        private final C2826a f115125b;

        /* renamed from: c  reason: collision with root package name */
        private final String f115126c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f115127d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LRB/b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "IN_STOCK", "LOW_STOCK", "OUT_OF_STOCK", "INDETERMINATE", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.b$a$a  reason: collision with other inner class name */
        public enum C2826a {
            IN_STOCK,
            LOW_STOCK,
            OUT_OF_STOCK,
            INDETERMINATE;

            static {
                C2826a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.b$a$b  reason: collision with other inner class name */
        public /* synthetic */ class C2827b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f115128a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    RB.b$a$a[] r0 = RB.C13505b.a.C2826a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    RB.b$a$a r1 = RB.C13505b.a.C2826a.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    RB.b$a$a r1 = RB.C13505b.a.C2826a.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    RB.b$a$a r1 = RB.C13505b.a.C2826a.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    RB.b$a$a r1 = RB.C13505b.a.C2826a.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f115128a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: RB.C13505b.a.C2827b.<clinit>():void");
            }
        }

        public a(String str, C2826a aVar, String str2, Boolean bool) {
            C17542s.j(str, "storeId");
            C17542s.j(aVar, "stockStatus");
            C17542s.j(str2, "stockLabel");
            this.f115124a = str;
            this.f115125b = aVar;
            this.f115126c = str2;
            this.f115127d = bool;
        }

        public final Boolean a() {
            return this.f115127d;
        }

        public final String b() {
            return this.f115126c;
        }

        public final C2826a c() {
            return this.f115125b;
        }

        public final String d() {
            return this.f115124a;
        }

        public final boolean e() {
            int i10 = C2827b.f115128a[this.f115125b.ordinal()];
            if (i10 == 1) {
                return C17542s.e(this.f115127d, Boolean.TRUE);
            }
            if (i10 == 2) {
                return C17542s.e(this.f115127d, Boolean.FALSE);
            }
            if (i10 == 3) {
                return C17542s.e(this.f115127d, Boolean.FALSE);
            }
            if (i10 == 4) {
                return false;
            }
            throw new t();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f115124a, aVar.f115124a) && this.f115125b == aVar.f115125b && C17542s.e(this.f115126c, aVar.f115126c) && C17542s.e(this.f115127d, aVar.f115127d);
        }

        public int hashCode() {
            int hashCode = ((((this.f115124a.hashCode() * 31) + this.f115125b.hashCode()) * 31) + this.f115126c.hashCode()) * 31;
            Boolean bool = this.f115127d;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.f115124a;
            C2826a aVar = this.f115125b;
            String str2 = this.f115126c;
            Boolean bool = this.f115127d;
            return "StockDataResponse(storeId=" + str + ", stockStatus=" + aVar + ", stockLabel=" + str2 + ", availabilityClickCollect=" + bool + ")";
        }
    }

    C16532g<List<a>> a(String str);
}
