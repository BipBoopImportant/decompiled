package w0;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.lazy.layout.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;
import v0.C6130D;
import v0.C6138d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b\u001e\u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lw0/k;", "Lw0/j;", "Lw0/E;", "state", "Lw0/h;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "<init>", "(Lw0/E;Lw0/h;Landroidx/compose/foundation/lazy/layout/c;)V", "", "index", "", "d", "(I)Ljava/lang/Object;", "key", "c", "(Ljava/lang/Object;)I", "e", "LXH/N;", "i", "(ILjava/lang/Object;LU0/m;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lw0/E;", "b", "Lw0/h;", "Landroidx/compose/foundation/lazy/layout/c;", "()Landroidx/compose/foundation/lazy/layout/c;", "itemCount", "Lw0/D;", "g", "()Lw0/D;", "spanProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final C6192E f31200a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6201h f31201b;

    /* renamed from: c  reason: collision with root package name */
    private final c f31202c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f31203c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, int i10) {
            super(2);
            this.f31203c = kVar;
            this.f31204d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(608834466, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)");
                }
                C6201h k10 = this.f31203c.f31201b;
                int i11 = this.f31204d;
                C6138d.a aVar = k10.n().get(i11);
                ((C6200g) aVar.c()).a().l(n.f31212a, Integer.valueOf(i11 - aVar.b()), mVar, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f31205c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31206d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f31207e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31208f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, int i10, Object obj, int i11) {
            super(2);
            this.f31205c = kVar;
            this.f31206d = i10;
            this.f31207e = obj;
            this.f31208f = i11;
        }

        public final void a(C4889m mVar, int i10) {
            this.f31205c.i(this.f31206d, this.f31207e, mVar, M0.a(this.f31208f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public k(C6192E e10, C6201h hVar, c cVar) {
        this.f31200a = e10;
        this.f31201b = hVar;
        this.f31202c = cVar;
    }

    public int a() {
        return this.f31201b.o();
    }

    public c b() {
        return this.f31202c;
    }

    public int c(Object obj) {
        return b().c(obj);
    }

    public Object d(int i10) {
        Object d10 = b().d(i10);
        return d10 == null ? this.f31201b.p(i10) : d10;
    }

    public Object e(int i10) {
        return this.f31201b.m(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return C17542s.e(this.f31201b, ((k) obj).f31201b);
    }

    public C6191D g() {
        return this.f31201b.r();
    }

    public int hashCode() {
        return this.f31201b.hashCode();
    }

    public void i(int i10, Object obj, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(89098518);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.F(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.V(this) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(89098518, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
            }
            C6130D.a(obj, i10, this.f31200a.A(), c1.c.e(608834466, true, new a(this, i10), k10, 54), k10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(this, i10, obj, i11));
        }
    }
}
