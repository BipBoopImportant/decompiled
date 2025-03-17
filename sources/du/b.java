package Du;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0001\u0001\n¨\u0006\u000b"}, d2 = {"LDu/b;", "", "<init>", "()V", "LIC/e;", "b", "()LIC/e;", "title", "a", "description", "LDu/b$a;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LDu/b$a;", "LDu/b;", "LIC/e;", "title", "description", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f80327c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f80328a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f80329b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C13023e eVar, C13023e eVar2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "description");
            this.f80328a = eVar;
            this.f80329b = eVar2;
        }

        public C13023e a() {
            return this.f80329b;
        }

        public C13023e b() {
            return this.f80328a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80328a, aVar.f80328a) && C17542s.e(this.f80329b, aVar.f80329b);
        }

        public int hashCode() {
            return (this.f80328a.hashCode() * 31) + this.f80329b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f80328a;
            C13023e eVar2 = this.f80329b;
            return "KompassMapError(title=" + eVar + ", description=" + eVar2 + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C13023e a();

    public abstract C13023e b();

    private b() {
    }
}
