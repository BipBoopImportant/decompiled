package w0;

import c2.C5267b;
import c2.c;
import c2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lw0/B;", "Lw0/a;", "Lkotlin/Function2;", "Lc2/d;", "Lc2/b;", "Lw0/C;", "calculation", "<init>", "(LnI/p;)V", "density", "constraints", "a", "(Lc2/d;J)Lw0/C;", "LnI/p;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "Lw0/C;", "cachedSizes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.B  reason: case insensitive filesystem */
final class C6189B implements C6194a {

    /* renamed from: a  reason: collision with root package name */
    private final p<d, C5267b, C6190C> f31124a;

    /* renamed from: b  reason: collision with root package name */
    private long f31125b = c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private float f31126c;

    /* renamed from: d  reason: collision with root package name */
    private C6190C f31127d;

    public C6189B(p<? super d, ? super C5267b, C6190C> pVar) {
        this.f31124a = pVar;
    }

    public C6190C a(d dVar, long j10) {
        if (this.f31127d == null || !C5267b.f(this.f31125b, j10) || this.f31126c != dVar.getDensity()) {
            this.f31125b = j10;
            this.f31126c = dVar.getDensity();
            C6190C invoke = this.f31124a.invoke(dVar, C5267b.a(j10));
            this.f31127d = invoke;
            return invoke;
        }
        C6190C c10 = this.f31127d;
        C17542s.g(c10);
        return c10;
    }
}
