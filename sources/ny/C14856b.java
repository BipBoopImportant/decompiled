package ny;

import Rl.d;
import Rl.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lny/b;", "", "<init>", "()V", "c", "a", "b", "Lny/b$a;", "Lny/b$b;", "Lny/b$c;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ny.b  reason: case insensitive filesystem */
public abstract class C14856b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lny/b$a;", "Lny/b;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getE", "()Ljava/lang/Throwable;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.b$a */
    public static final class a extends C14856b {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f129840a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(th2, "e");
            this.f129840a = th2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f129840a, ((a) obj).f129840a);
        }

        public int hashCode() {
            return this.f129840a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f129840a;
            return "Error(e=" + th2 + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lny/b$b;", "Lny/b;", "LRl/d;", "market", "LRl/f;", "language", "<init>", "(LRl/d;LRl/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRl/d;", "b", "()LRl/d;", "LRl/f;", "()LRl/f;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.b$b  reason: collision with other inner class name */
    public static final class C3197b extends C14856b {

        /* renamed from: a  reason: collision with root package name */
        private final d f129841a;

        /* renamed from: b  reason: collision with root package name */
        private final f f129842b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3197b(d dVar, f fVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "market");
            C17542s.j(fVar, "language");
            this.f129841a = dVar;
            this.f129842b = fVar;
        }

        public final f a() {
            return this.f129842b;
        }

        public final d b() {
            return this.f129841a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3197b)) {
                return false;
            }
            C3197b bVar = (C3197b) obj;
            return C17542s.e(this.f129841a, bVar.f129841a) && C17542s.e(this.f129842b, bVar.f129842b);
        }

        public int hashCode() {
            return (this.f129841a.hashCode() * 31) + this.f129842b.hashCode();
        }

        public String toString() {
            d dVar = this.f129841a;
            f fVar = this.f129842b;
            return "Restart(market=" + dVar + ", language=" + fVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lny/b$c;", "Lny/b;", "LRl/d;", "market", "LRl/f;", "language", "<init>", "(LRl/d;LRl/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRl/d;", "getMarket", "()LRl/d;", "b", "LRl/f;", "getLanguage", "()LRl/f;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.b$c */
    public static final class c extends C14856b {

        /* renamed from: a  reason: collision with root package name */
        private final d f129843a;

        /* renamed from: b  reason: collision with root package name */
        private final f f129844b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar, f fVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "market");
            C17542s.j(fVar, "language");
            this.f129843a = dVar;
            this.f129844b = fVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f129843a, cVar.f129843a) && C17542s.e(this.f129844b, cVar.f129844b);
        }

        public int hashCode() {
            return (this.f129843a.hashCode() * 31) + this.f129844b.hashCode();
        }

        public String toString() {
            d dVar = this.f129843a;
            f fVar = this.f129844b;
            return "ShowDataConsent(market=" + dVar + ", language=" + fVar + ")";
        }
    }

    public /* synthetic */ C14856b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14856b() {
    }
}
