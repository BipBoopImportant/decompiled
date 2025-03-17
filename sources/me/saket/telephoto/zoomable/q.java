package me.saket.telephoto.zoomable;

import XH.C16807N;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.g;
import c2.r;
import c2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m1.e;
import me.saket.telephoto.zoomable.c;
import me.saket.telephoto.zoomable.internal.HardwareShortcutsElement;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import pK.C17765j;
import pK.C17766k;
import pK.C17769n;
import r0.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "LpK/n;", "state", "", "enabled", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onClick", "onLongClick", "clipToBounds", "Lme/saket/telephoto/zoomable/c;", "onDoubleClick", "a", "(Landroidx/compose/ui/d;LpK/n;ZLnI/l;LnI/l;ZLme/saket/telephoto/zoomable/c;)Landroidx/compose/ui/d;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17769n f144775c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17769n nVar) {
            super(1);
            this.f144775c = nVar;
        }

        public final void a(long j10) {
            ((j) this.f144775c).b0(s.d(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpK/j;", "b", "()LpK/j;"}, k = 3, mv = {1, 9, 0})
    static final class b extends C17544u implements C17631a<C17765j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17769n f144776c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17769n nVar) {
            super(0);
            this.f144776c = nVar;
        }

        /* renamed from: b */
        public final C17765j invoke() {
            return this.f144776c.f();
        }
    }

    public static final d a(d dVar, C17769n nVar, boolean z10, C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, boolean z11, c cVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(nVar, "state");
        C17542s.j(cVar, "onDoubleClick");
        if (nVar instanceof j) {
            if (z11) {
                dVar = dVar.s(e.b(d.f18749a));
            }
            j jVar = (j) nVar;
            d s10 = g.a(dVar, new a(nVar)).s(new ZoomableElement(jVar, z10, lVar, lVar2, cVar));
            if (jVar.M().b()) {
                s10 = s10.s(FocusableKt.c(d.f18749a.s(new HardwareShortcutsElement(nVar, jVar.M())), false, (m) null, 3, (Object) null));
            }
            return nVar.m() ? s10.s(C17766k.a(d.f18749a, new b(nVar))) : s10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static /* synthetic */ d b(d dVar, C17769n nVar, boolean z10, C17642l lVar, C17642l lVar2, boolean z11, c cVar, int i10, Object obj) {
        return a(dVar, nVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : lVar2, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? c.a.b(c.f144590a, (Float) null, 1, (Object) null) : cVar);
    }
}
