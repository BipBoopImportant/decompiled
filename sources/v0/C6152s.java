package v0;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import f1.C5303e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lv0/t;", "itemProvider", "Lv0/S;", "Lf1/e;", "saveableStateHolder", "", "index", "", "key", "LXH/N;", "a", "(Lv0/t;Ljava/lang/Object;ILjava/lang/Object;LU0/m;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.s  reason: case insensitive filesystem */
public final class C6152s {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0.s$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f30929c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30930d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f30931e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, int i10, Object obj) {
            super(2);
            this.f30929c = tVar;
            this.f30930d = i10;
            this.f30931e = obj;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
                }
                this.f30929c.i(this.f30930d, this.f30931e, mVar, 0);
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
    /* renamed from: v0.s$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f30932c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f30933d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f30934e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f30935f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f30936g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f30932c = tVar;
            this.f30933d = obj;
            this.f30934e = i10;
            this.f30935f = obj2;
            this.f30936g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C6152s.a(this.f30932c, this.f30933d, this.f30934e, this.f30935f, mVar, M0.a(this.f30936g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void a(t tVar, Object obj, int i10, Object obj2, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (k10.V(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.V(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= k10.V(obj2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((C5303e) obj).f(obj2, c.e(980966366, true, new a(tVar, i10, obj2), k10, 54), k10, 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(tVar, obj, i10, obj2, i11));
        }
    }
}
