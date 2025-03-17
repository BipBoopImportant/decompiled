package Du;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDu/d;", "", "c", "d", "a", "b", "LDu/d$a;", "LDu/d$b;", "LDu/d$c;", "LDu/d$d;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LDu/d$a;", "LDu/d;", "LDu/c;", "kompassMapContent", "LEu/a;", "model", "<init>", "(LDu/c;LEu/a;)V", "a", "(LDu/c;LEu/a;)LDu/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LDu/c;", "c", "()LDu/c;", "b", "LEu/a;", "d", "()LEu/a;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: c  reason: collision with root package name */
        public static final int f80334c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final c f80335a;

        /* renamed from: b  reason: collision with root package name */
        private final Eu.a f80336b;

        public a(c cVar, Eu.a aVar) {
            C17542s.j(cVar, "kompassMapContent");
            this.f80335a = cVar;
            this.f80336b = aVar;
        }

        public static /* synthetic */ a b(a aVar, c cVar, Eu.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f80335a;
            }
            if ((i10 & 2) != 0) {
                aVar2 = aVar.f80336b;
            }
            return aVar.a(cVar, aVar2);
        }

        public final a a(c cVar, Eu.a aVar) {
            C17542s.j(cVar, "kompassMapContent");
            return new a(cVar, aVar);
        }

        public final c c() {
            return this.f80335a;
        }

        public final Eu.a d() {
            return this.f80336b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80335a, aVar.f80335a) && C17542s.e(this.f80336b, aVar.f80336b);
        }

        public int hashCode() {
            int hashCode = this.f80335a.hashCode() * 31;
            Eu.a aVar = this.f80336b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            c cVar = this.f80335a;
            Eu.a aVar = this.f80336b;
            return "Content(kompassMapContent=" + cVar + ", model=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDu/d$b;", "LDu/d;", "LDu/b;", "exception", "<init>", "(LDu/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDu/b;", "()LDu/b;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final b f80337a;

        public b(b bVar) {
            C17542s.j(bVar, "exception");
            this.f80337a = bVar;
        }

        public final b a() {
            return this.f80337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f80337a, ((b) obj).f80337a);
        }

        public int hashCode() {
            return this.f80337a.hashCode();
        }

        public String toString() {
            b bVar = this.f80337a;
            return "Error(exception=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDu/d$c;", "LDu/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80338a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1327417668;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDu/d$d;", "LDu/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Du.d$d  reason: collision with other inner class name */
    public static final class C1517d implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final C1517d f80339a = new C1517d();

        private C1517d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1517d);
        }

        public int hashCode() {
            return 485983259;
        }

        public String toString() {
            return "Onboarding";
        }
    }
}
