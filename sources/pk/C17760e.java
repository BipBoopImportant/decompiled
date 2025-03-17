package pK;

import E1.C4478k;
import E1.h0;
import E1.i0;
import XH.C16814e;
import c2.n;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.saket.telephoto.zoomable.m;
import o1.C5668h;
import o1.C5669i;
import o1.C5670j;
import o1.C5673m;
import rK.C17871f;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"LpK/e;", "Lme/saket/telephoto/zoomable/m;", "Lo1/m;", "size", "LE1/k;", "scale", "Li1/c;", "alignment", "<init>", "(JLE1/k;Li1/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "layoutSize", "b", "(J)J", "Lc2/t;", "direction", "Lo1/i;", "a", "(JLc2/t;)Lo1/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "c", "LE1/k;", "d", "Li1/c;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.e  reason: case insensitive filesystem */
public final class C17760e implements m {

    /* renamed from: b  reason: collision with root package name */
    private final long f146374b;

    /* renamed from: c  reason: collision with root package name */
    private final C4478k f146375c;

    /* renamed from: d  reason: collision with root package name */
    private final C5437c f146376d;

    public /* synthetic */ C17760e(long j10, C4478k kVar, C5437c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, kVar, cVar);
    }

    public C5669i a(long j10, t tVar) {
        C17542s.j(tVar, "direction");
        if (!C5673m.n(j10)) {
            long b10 = b(j10);
            long a10 = this.f146376d.a(C17871f.b(b10), C17871f.b(j10), tVar);
            return C5670j.c(C5668h.a((float) n.h(a10), (float) n.i(a10)), b10);
        }
        throw new IllegalStateException("Layout size is empty");
    }

    @C16814e
    public long b(long j10) {
        return i0.d(this.f146374b, C5673m.n(this.f146374b) ? C17871f.h(h0.f5906a) : this.f146375c.a(this.f146374b, j10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17760e)) {
            return false;
        }
        C17760e eVar = (C17760e) obj;
        return C5673m.h(this.f146374b, eVar.f146374b) && C17542s.e(this.f146375c, eVar.f146375c) && C17542s.e(this.f146376d, eVar.f146376d);
    }

    public int hashCode() {
        return (((C5673m.m(this.f146374b) * 31) + this.f146375c.hashCode()) * 31) + this.f146376d.hashCode();
    }

    public String toString() {
        String p10 = C5673m.p(this.f146374b);
        C4478k kVar = this.f146375c;
        C5437c cVar = this.f146376d;
        return "RelativeContentLocation(size=" + p10 + ", scale=" + kVar + ", alignment=" + cVar + ")";
    }

    private C17760e(long j10, C4478k kVar, C5437c cVar) {
        C17542s.j(kVar, "scale");
        C17542s.j(cVar, "alignment");
        this.f146374b = j10;
        this.f146375c = kVar;
        this.f146376d = cVar;
    }
}
