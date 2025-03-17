package vk;

import A0.g;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17642l;
import nI.q;
import nk.z;
import p1.i1;
import pk.k;
import pk.l;
import pk.r;
import pk.s;
import u0.C5968C;
import u0.C5972G;
import u0.C5974I;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import uk.C12056w;
import uk.s1;
import vk.C12134F;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a»\u0001\u0010\u0018\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001e\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010\"\u001a\u00020\u000f*\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001aG\u0010$\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lu0/C;", "Lpk/s;", "state", "", "columns", "Lp1/v0;", "bgColor", "Lc2/h;", "availableWidth", "LT0/c;", "windowSize", "Lu0/I;", "lazyGridState", "Lkotlin/Function1;", "Luk/w;", "LXH/N;", "onScreenAction", "Lpk/l;", "onItemOptionsClick", "Lpk/r;", "onListModeToggled", "onRemoveItemClick", "onItemClick", "onOutOfStockItemSeen", "k", "(Lu0/C;Lpk/s;IJFLT0/c;Lu0/I;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;)V", "color", "height", "Landroidx/compose/ui/d;", "modifier", "l", "(Lu0/C;JFILandroidx/compose/ui/d;)V", "Lpk/k;", "listNameHeader", "e", "(Lu0/C;Lpk/k;I)V", "g", "(Lu0/C;Lpk/s;FLT0/c;ILnI/l;)V", "i", "(Lu0/C;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.x  reason: case insensitive filesystem */
public final class C12180x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.x$a */
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f105053a;

        a(k kVar) {
            this.f105053a = kVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-889282209, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addListNameHeader.<anonymous> (FrontLayerContent.kt:130)");
                }
                P.b(this.f105053a.a(), this.f105053a.b(), (d) null, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.x$b */
    static final class b implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f105054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T0.c f105055b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<r, C16807N> f105056c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f105057d;

        b(s sVar, T0.c cVar, C17642l<? super r, C16807N> lVar, float f10) {
            this.f105054a = sVar;
            this.f105055b = cVar;
            this.f105056c = lVar;
            this.f105057d = f10;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2104000449, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addListToInspirationToggle.<anonymous> (FrontLayerContent.kt:149)");
                }
                C12133E.b(this.f105054a.m(), this.f105056c, this.f105057d, T0.d.C(this.f105055b.b(), T0.d.f13504b.d()) > 0, (d) null, mVar, 0, 16);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.x$c */
    static final class c implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f105058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f105059b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f105060c;

        c(float f10, long j10, d dVar) {
            this.f105058a = f10;
            this.f105059b = j10;
            this.f105060c = dVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1216181562, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.peekItem.<anonymous> (FrontLayerContent.kt:104)");
                }
                float B10 = h.B((float) 20);
                C5077h.a(androidx.compose.foundation.b.d(e.a(J.i(J.h(d.f18749a, 0.0f, 1, (Object) null), this.f105058a), g.g(B10, B10, 0.0f, 0.0f, 12, (Object) null)), this.f105059b, (i1) null, 2, (Object) null).s(this.f105060c), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void e(C5968C c10, k kVar, int i10) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(new C12134F.g(kVar).f104493a, new C12172t(i10), "ListNameHeader", c1.c.c(-889282209, true, new a(kVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c f(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void g(C5968C c10, s sVar, float f10, T0.c cVar, int i10, C17642l<? super r, C16807N> lVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.k.f104504c.f104493a, new C12174u(i10), "ModeToggle", c1.c.c(-2104000449, true, new b(sVar, cVar, lVar, f10)));
    }

    /* access modifiers changed from: private */
    public static final C5979c h(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void i(C5968C c10, int i10) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.j.f104503c.f104493a, new C12178w(i10), "Loading", C12151i.f104805a.a());
    }

    /* access modifiers changed from: private */
    public static final C5979c j(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    public static final void k(C5968C c10, s sVar, int i10, long j10, float f10, T0.c cVar, C5974I i11, C17642l<? super C12056w, C16807N> lVar, C17642l<? super l, C16807N> lVar2, C17642l<? super r, C16807N> lVar3, C17642l<? super l, C16807N> lVar4, C17642l<? super l, C16807N> lVar5, C17642l<? super l, C16807N> lVar6) {
        C5968C c11 = c10;
        s sVar2 = sVar;
        int i12 = i10;
        C17642l<? super C12056w, C16807N> lVar7 = lVar;
        C17542s.j(c11, "$this$frontLayerContent");
        C17542s.j(sVar2, "state");
        C17542s.j(cVar, "windowSize");
        C17542s.j(i11, "lazyGridState");
        C17542s.j(lVar7, "onScreenAction");
        C17542s.j(lVar2, "onItemOptionsClick");
        C17542s.j(lVar3, "onListModeToggled");
        C17542s.j(lVar4, "onRemoveItemClick");
        C17542s.j(lVar5, "onItemClick");
        C17542s.j(lVar6, "onOutOfStockItemSeen");
        m(c10, j10, s1.g3(), i10, (d) null, 8, (Object) null);
        if (sVar.n() != null) {
            e(c11, sVar.n(), i12);
        }
        if (sVar.G()) {
            g(c10, sVar, f10, cVar, i10, lVar3);
        }
        r m10 = sVar.m();
        if (m10 instanceof r.a) {
            z.e(c11, sVar2, Xo.g.b(cVar.b()), i12, lVar7);
        } else if (m10 instanceof r.b) {
            v1.C(c10, sVar, cVar, i10, i11, lVar, lVar2, lVar4, lVar5, lVar6);
        } else {
            throw new t();
        }
        if (sVar.p()) {
            i(c11, i12);
        }
    }

    private static final void l(C5968C c10, long j10, float f10, int i10, d dVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.l.f104505c.f104493a, new C12176v(i10), "PeekItem", c1.c.c(-1216181562, true, new c(f10, j10, dVar)));
    }

    static /* synthetic */ void m(C5968C c10, long j10, float f10, int i10, d dVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            dVar = d.f18749a;
        }
        l(c10, j10, f10, i10, dVar);
    }

    /* access modifiers changed from: private */
    public static final C5979c n(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }
}
