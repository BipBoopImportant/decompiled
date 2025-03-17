package gi;

import Wk.a;
import Wk.e;
import XH.t;
import XH.v;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import gi.C9749d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0016\r\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u0005*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lgi/M;", "", "<init>", "()V", "LWk/a$a;", "Lgi/d$d;", "f", "(LWk/a$a;)Lgi/d$d;", "LWk/e$b$a$c;", "g", "(LWk/e$b$a$c;)Lgi/d$d;", "b", "()Lgi/d$d;", "a", "LXH/v;", "", "", "d", "()LXH/v;", "LWk/e$b$a$b;", "e", "()LWk/e$b$a$b;", "c", "()Ljava/lang/Double;", "Lgi/M$a;", "Lgi/M$b;", "Lgi/M$c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class M {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgi/M$a;", "Lgi/M;", "LWk/e$b;", "home", "clickCollect", "", "longTermSupplyIssue", "<init>", "(LWk/e$b;LWk/e$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/e$b;", "i", "()LWk/e$b;", "b", "h", "c", "Z", "j", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends M {

        /* renamed from: a  reason: collision with root package name */
        private final e.b f73324a;

        /* renamed from: b  reason: collision with root package name */
        private final e.b f73325b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f73326c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.b bVar, e.b bVar2, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "home");
            this.f73324a = bVar;
            this.f73325b = bVar2;
            this.f73326c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f73324a, aVar.f73324a) && C17542s.e(this.f73325b, aVar.f73325b) && this.f73326c == aVar.f73326c;
        }

        public final e.b h() {
            return this.f73325b;
        }

        public int hashCode() {
            int hashCode = this.f73324a.hashCode() * 31;
            e.b bVar = this.f73325b;
            return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f73326c);
        }

        public final e.b i() {
            return this.f73324a;
        }

        public final boolean j() {
            return this.f73326c;
        }

        public String toString() {
            e.b bVar = this.f73324a;
            e.b bVar2 = this.f73325b;
            boolean z10 = this.f73326c;
            return "Availability(home=" + bVar + ", clickCollect=" + bVar2 + ", longTermSupplyIssue=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgi/M$b;", "Lgi/M;", "LWk/a;", "error", "<init>", "(LWk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/a;", "h", "()LWk/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends M {

        /* renamed from: a  reason: collision with root package name */
        private final Wk.a f73327a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Wk.a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
            this.f73327a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f73327a, ((b) obj).f73327a);
        }

        public final Wk.a h() {
            return this.f73327a;
        }

        public int hashCode() {
            return this.f73327a.hashCode();
        }

        public String toString() {
            Wk.a aVar = this.f73327a;
            return "Error(error=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgi/M$c;", "Lgi/M;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends M {

        /* renamed from: a  reason: collision with root package name */
        public static final c f73328a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -347574703;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73329a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                Wk.a$a[] r0 = Wk.a.C1886a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Wk.a$a r1 = Wk.a.C1886a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Wk.a$a r1 = Wk.a.C1886a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Wk.a$a r1 = Wk.a.C1886a.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Wk.a$a r1 = Wk.a.C1886a.FEATURE_TURNED_OFF     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f73329a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi.M.d.<clinit>():void");
        }
    }

    public /* synthetic */ M(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final C9749d.C1283d f(a.C1886a aVar) {
        int i10 = d.f73329a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return C9749d.C1283d.UNAVAILABLE;
        }
        if (i10 == 3) {
            return C9749d.C1283d.NOT_SUPPORTED;
        }
        if (i10 == 4) {
            return C9749d.C1283d.FEATURE_TURNED_OFF;
        }
        throw new t();
    }

    private final C9749d.C1283d g(e.b.a.c cVar) {
        return (cVar == null || !cVar.a()) ? C9749d.C1283d.UNAVAILABLE : cVar.d() ? C9749d.C1283d.LIMITED : C9749d.C1283d.AVAILABLE;
    }

    public final C9749d.C1283d a() {
        if (this instanceof a) {
            a aVar = (a) this;
            e.b h10 = aVar.h();
            if (h10 instanceof e.b.a) {
                e.b.a.C1888a a10 = ((e.b.a) aVar.h()).a();
                Boolean valueOf = a10 != null ? Boolean.valueOf(a10.a()) : null;
                if (C17542s.e(valueOf, Boolean.TRUE)) {
                    return C9749d.C1283d.AVAILABLE;
                }
                if (C17542s.e(valueOf, Boolean.FALSE)) {
                    return C9749d.C1283d.UNAVAILABLE;
                }
                if (valueOf == null) {
                    return C9749d.C1283d.FEATURE_TURNED_OFF;
                }
                throw new t();
            } else if (h10 instanceof e.b.C1890b) {
                return f(((e.b.C1890b) aVar.h()).a().a());
            } else {
                if (h10 == null) {
                    return C9749d.C1283d.NOT_SUPPORTED;
                }
                throw new t();
            }
        } else if (this instanceof b) {
            return f(((b) this).h().a());
        } else {
            if (C17542s.e(this, c.f73328a)) {
                return C9749d.C1283d.NOT_SUPPORTED;
            }
            throw new t();
        }
    }

    public final C9749d.C1283d b() {
        if (this instanceof a) {
            a aVar = (a) this;
            e.b i10 = aVar.i();
            if (i10 instanceof e.b.a) {
                return g(((e.b.a) aVar.i()).b());
            }
            if (i10 instanceof e.b.C1890b) {
                return f(((e.b.C1890b) aVar.i()).a().a());
            }
            throw new t();
        } else if (this instanceof b) {
            return f(((b) this).h().a());
        } else {
            if (C17542s.e(this, c.f73328a)) {
                return C9749d.C1283d.NOT_SUPPORTED;
            }
            throw new t();
        }
    }

    public final Double c() {
        if (this instanceof a) {
            a aVar = (a) this;
            e.b h10 = aVar.h();
            if (h10 instanceof e.b.a) {
                e.b.a.C1888a a10 = ((e.b.a) aVar.h()).a();
                if (a10 != null) {
                    return a10.b();
                }
                return null;
            } else if ((h10 instanceof e.b.C1890b) || h10 == null) {
                return null;
            } else {
                throw new t();
            }
        } else if ((this instanceof b) || C17542s.e(this, c.f73328a)) {
            return null;
        } else {
            throw new t();
        }
    }

    public final v<Double, Boolean> d() {
        Double d10 = null;
        if (this instanceof a) {
            a aVar = (a) this;
            e.b i10 = aVar.i();
            if (i10 instanceof e.b.a) {
                e.b.a.c b10 = ((e.b.a) aVar.i()).b();
                if (b10 != null) {
                    d10 = b10.b();
                }
                e.b.a.c b11 = ((e.b.a) aVar.i()).b();
                return new v<>(d10, Boolean.valueOf(b11 != null ? b11.f() : false));
            } else if (i10 instanceof e.b.C1890b) {
                return new v<>(null, Boolean.FALSE);
            } else {
                throw new t();
            }
        } else if ((this instanceof b) || C17542s.e(this, c.f73328a)) {
            return new v<>(null, Boolean.FALSE);
        } else {
            throw new t();
        }
    }

    public final e.b.a.C1889b e() {
        e.b.a.c b10;
        if (this instanceof a) {
            a aVar = (a) this;
            if (!(aVar.i() instanceof e.b.a) || (b10 = ((e.b.a) aVar.i()).b()) == null) {
                return null;
            }
            return b10.c();
        } else if ((this instanceof b) || C17542s.e(this, c.f73328a)) {
            return null;
        } else {
            throw new t();
        }
    }

    private M() {
    }
}
