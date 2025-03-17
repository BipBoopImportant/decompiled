package Pv;

import IC.C13023e;
import Rv.c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020-8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b)\u0010/¨\u00061"}, d2 = {"LPv/r;", "LxB/a;", "LPv/s;", "variant", "LIC/e;", "title", "body", "", "imageUrl", "LRv/c$a;", "clickEvent", "", "isLoading", "<init>", "(LPv/s;LIC/e;LIC/e;Ljava/lang/String;LRv/c$a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LPv/s;", "j", "()LPv/s;", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "g", "d", "Ljava/lang/String;", "i", "e", "LRv/c$a;", "h", "()LRv/c$a;", "f", "Z", "n", "()Z", "", "J", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final s f39550a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f39551b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f39552c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39553d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a f39554e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39555f;

    /* renamed from: g  reason: collision with root package name */
    private final long f39556g;

    public r(s sVar, C13023e eVar, C13023e eVar2, String str, c.a aVar, boolean z10) {
        C17542s.j(sVar, "variant");
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "body");
        C17542s.j(str, "imageUrl");
        C17542s.j(aVar, "clickEvent");
        this.f39550a = sVar;
        this.f39551b = eVar;
        this.f39552c = eVar2;
        this.f39553d = str;
        this.f39554e = aVar;
        this.f39555f = z10;
        Object[] objArr = {eVar, eVar2, str, aVar};
        U u10 = new U(3);
        u10.a(P.b(r.class));
        u10.a(sVar);
        u10.b(objArr);
        this.f39556g = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f39550a, rVar.f39550a) && C17542s.e(this.f39551b, rVar.f39551b) && C17542s.e(this.f39552c, rVar.f39552c) && C17542s.e(this.f39553d, rVar.f39553d) && C17542s.e(this.f39554e, rVar.f39554e) && this.f39555f == rVar.f39555f;
    }

    public long f() {
        return this.f39556g;
    }

    public final C13023e g() {
        return this.f39552c;
    }

    public final C13023e getTitle() {
        return this.f39551b;
    }

    public final c.a h() {
        return this.f39554e;
    }

    public int hashCode() {
        return (((((((((this.f39550a.hashCode() * 31) + this.f39551b.hashCode()) * 31) + this.f39552c.hashCode()) * 31) + this.f39553d.hashCode()) * 31) + this.f39554e.hashCode()) * 31) + Boolean.hashCode(this.f39555f);
    }

    public final String i() {
        return this.f39553d;
    }

    public final s j() {
        return this.f39550a;
    }

    public final boolean n() {
        return this.f39555f;
    }

    public String toString() {
        s sVar = this.f39550a;
        C13023e eVar = this.f39551b;
        C13023e eVar2 = this.f39552c;
        String str = this.f39553d;
        c.a aVar = this.f39554e;
        boolean z10 = this.f39555f;
        return "ContextualCardModel(variant=" + sVar + ", title=" + eVar + ", body=" + eVar2 + ", imageUrl=" + str + ", clickEvent=" + aVar + ", isLoading=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, C13023e eVar, C13023e eVar2, String str, c.a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, eVar, eVar2, str, aVar, (i10 & 32) != 0 ? false : z10);
    }
}
