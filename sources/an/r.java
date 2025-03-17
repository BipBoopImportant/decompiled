package An;

import KJ.C15987c;
import YH.C16877v;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import lp.C11559a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LAn/r;", "LAn/o;", "", "title", "LKJ/c;", "Llp/a;", "stories", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "LKJ/c;", "h", "()LKJ/c;", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79028a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<C11559a> f79029b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79030c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, C15987c<C11559a> cVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(cVar, "stories");
        this.f79028a = str;
        this.f79029b = cVar;
        String G02 = C16877v.G0(cVar, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new q(), 31, (Object) null);
        U u10 = new U(3);
        u10.a(P.b(r.class));
        u10.a(G02);
        u10.b(new Object[0]);
        this.f79030c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    /* access modifiers changed from: private */
    public static final CharSequence j(C11559a aVar) {
        C17542s.j(aVar, "it");
        return aVar.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f79028a, rVar.f79028a) && C17542s.e(this.f79029b, rVar.f79029b);
    }

    public long f() {
        return this.f79030c;
    }

    public final C15987c<C11559a> h() {
        return this.f79029b;
    }

    public int hashCode() {
        String str = this.f79028a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f79029b.hashCode();
    }

    public final String i() {
        return this.f79028a;
    }

    public String toString() {
        String str = this.f79028a;
        C15987c<C11559a> cVar = this.f79029b;
        return "StoriesCarouselUiModel(title=" + str + ", stories=" + cVar + ")";
    }
}
