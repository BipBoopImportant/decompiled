package fo;

import IC.C13023e;
import KJ.C15987c;
import go.C11334s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lfo/q;", "", "", "isSelectable", "LIC/e;", "title", "subtitle", "Lfo/q$a;", "unavailableItems", "availableItems", "<init>", "(ZLIC/e;LIC/e;Lfo/q$a;Lfo/q$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "LIC/e;", "c", "()LIC/e;", "d", "Lfo/q$a;", "()Lfo/q$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final int f97479f = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f97480a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f97481b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f97482c;

    /* renamed from: d  reason: collision with root package name */
    private final a f97483d;

    /* renamed from: e  reason: collision with root package name */
    private final a f97484e;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfo/q$a;", "", "LIC/e;", "title", "LKJ/c;", "Lgo/s;", "items", "<init>", "(LIC/e;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "LKJ/c;", "()LKJ/c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f97485c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f97486a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C11334s> f97487b;

        public a(C13023e eVar, C15987c<C11334s> cVar) {
            C17542s.j(eVar, "title");
            C17542s.j(cVar, "items");
            this.f97486a = eVar;
            this.f97487b = cVar;
        }

        public final C15987c<C11334s> a() {
            return this.f97487b;
        }

        public final C13023e b() {
            return this.f97486a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f97486a, aVar.f97486a) && C17542s.e(this.f97487b, aVar.f97487b);
        }

        public int hashCode() {
            return (this.f97486a.hashCode() * 31) + this.f97487b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f97486a;
            C15987c<C11334s> cVar = this.f97487b;
            return "ItemsData(title=" + eVar + ", items=" + cVar + ")";
        }
    }

    public q(boolean z10, C13023e eVar, C13023e eVar2, a aVar, a aVar2) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "subtitle");
        this.f97480a = z10;
        this.f97481b = eVar;
        this.f97482c = eVar2;
        this.f97483d = aVar;
        this.f97484e = aVar2;
    }

    public final a a() {
        return this.f97484e;
    }

    public final C13023e b() {
        return this.f97482c;
    }

    public final C13023e c() {
        return this.f97481b;
    }

    public final a d() {
        return this.f97483d;
    }

    public final boolean e() {
        return this.f97480a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f97480a == qVar.f97480a && C17542s.e(this.f97481b, qVar.f97481b) && C17542s.e(this.f97482c, qVar.f97482c) && C17542s.e(this.f97483d, qVar.f97483d) && C17542s.e(this.f97484e, qVar.f97484e);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f97480a) * 31) + this.f97481b.hashCode()) * 31) + this.f97482c.hashCode()) * 31;
        a aVar = this.f97483d;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f97484e;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        boolean z10 = this.f97480a;
        C13023e eVar = this.f97481b;
        C13023e eVar2 = this.f97482c;
        a aVar = this.f97483d;
        a aVar2 = this.f97484e;
        return "UnavailableItemsUiState(isSelectable=" + z10 + ", title=" + eVar + ", subtitle=" + eVar2 + ", unavailableItems=" + aVar + ", availableItems=" + aVar2 + ")";
    }
}
