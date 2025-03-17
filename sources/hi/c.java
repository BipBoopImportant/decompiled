package hi;

import IC.C13023e;
import IC.C13026h;
import Lu.i;
import Ph.e;
import XH.t;
import dI.C17164e;
import gi.C9757l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhi/c;", "", "", "storeId", "productNumber", "Lhi/c$a;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0013¨\u0006%"}, d2 = {"Lhi/c$a;", "", "Lgi/l$a;", "type", "", "locationText", "", "departmentIconRes", "division", "<init>", "(Lgi/l$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "isInStock", "productName", "productImageUrl", "Lgi/l;", "a", "(ZLjava/lang/String;Ljava/lang/String;)Lgi/l;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgi/l$a;", "getType", "()Lgi/l$a;", "b", "Ljava/lang/String;", "getLocationText", "c", "Ljava/lang/Integer;", "getDepartmentIconRes", "()Ljava/lang/Integer;", "d", "getDivision", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C9757l.a f74145a;

        /* renamed from: b  reason: collision with root package name */
        private final String f74146b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f74147c;

        /* renamed from: d  reason: collision with root package name */
        private final String f74148d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hi.c$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1318a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f74149a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    gi.l$a[] r0 = gi.C9757l.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gi.l$a r1 = gi.C9757l.a.DISPLAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gi.l$a r1 = gi.C9757l.a.SALES     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f74149a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: hi.c.a.C1318a.<clinit>():void");
            }
        }

        public a(C9757l.a aVar, String str, Integer num, String str2) {
            C17542s.j(aVar, "type");
            C17542s.j(str, "locationText");
            C17542s.j(str2, "division");
            this.f74145a = aVar;
            this.f74146b = str;
            this.f74147c = num;
            this.f74148d = str2;
        }

        public final C9757l a(boolean z10, String str, String str2) {
            i.a aVar = null;
            if (!z10) {
                C13023e b10 = C13026h.b(e.f62844B, this.f74146b);
                String str3 = this.f74146b;
                Integer num = this.f74147c;
                if (num != null) {
                    aVar = new i.a.C1669a(num.intValue());
                }
                return new C9757l(b10, str3, aVar, this.f74145a, this.f74148d);
            }
            int i10 = C1318a.f74149a[this.f74145a.ordinal()];
            if (i10 == 1) {
                C13023e b11 = C13026h.b(e.f62873y, this.f74146b);
                String str4 = this.f74146b;
                Integer num2 = this.f74147c;
                if (num2 != null) {
                    aVar = new i.a.C1669a(num2.intValue());
                }
                return new C9757l(b11, str4, aVar, this.f74145a, this.f74148d);
            } else if (i10 != 2) {
                throw new t();
            } else if (str == null || str.length() == 0) {
                C13023e b12 = C13026h.b(e.f62874z, this.f74146b);
                String str5 = this.f74146b;
                Integer num3 = this.f74147c;
                if (num3 != null) {
                    aVar = new i.a.C1669a(num3.intValue());
                }
                return new C9757l(b12, str5, aVar, this.f74145a, this.f74148d);
            } else {
                C13023e b13 = C13026h.b(e.f62843A, str);
                if (str2 != null) {
                    aVar = new i.a.c(str2);
                }
                return new C9757l(b13, str, aVar, this.f74145a, this.f74148d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f74145a == aVar.f74145a && C17542s.e(this.f74146b, aVar.f74146b) && C17542s.e(this.f74147c, aVar.f74147c) && C17542s.e(this.f74148d, aVar.f74148d);
        }

        public int hashCode() {
            int hashCode = ((this.f74145a.hashCode() * 31) + this.f74146b.hashCode()) * 31;
            Integer num = this.f74147c;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f74148d.hashCode();
        }

        public String toString() {
            C9757l.a aVar = this.f74145a;
            String str = this.f74146b;
            Integer num = this.f74147c;
            String str2 = this.f74148d;
            return "InStoreNavigationData(type=" + aVar + ", locationText=" + str + ", departmentIconRes=" + num + ", division=" + str2 + ")";
        }
    }

    Object a(String str, String str2, C17164e<? super a> eVar);
}
