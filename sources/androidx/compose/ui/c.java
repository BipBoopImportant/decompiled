package androidx.compose.ui;

import U0.C4889m;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.W;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "factory", "b", "(Landroidx/compose/ui/d;LnI/l;LnI/q;)Landroidx/compose/ui/d;", "LU0/m;", "modifier", "e", "(LU0/m;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "d", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d$b;", "it", "", "a", "(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<d.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18747c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(d.b bVar) {
            return Boolean.valueOf(!(bVar instanceof b));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/d;", "acc", "Landroidx/compose/ui/d$b;", "element", "a", "(Landroidx/compose/ui/d;Landroidx/compose/ui/d$b;)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<d, d.b, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4889m f18748c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4889m mVar) {
            super(2);
            this.f18748c = mVar;
        }

        /* renamed from: a */
        public final d invoke(d dVar, d.b bVar) {
            boolean z10 = bVar instanceof b;
            d dVar2 = bVar;
            if (z10) {
                q<d, C4889m, Integer, d> a10 = ((b) bVar).a();
                C17542s.h(a10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                dVar2 = c.d(this.f18748c, (d) ((q) W.g(a10, 3)).invoke(d.f18749a, this.f18748c, 0));
            }
            return dVar.s(dVar2);
        }
    }

    public static final d b(d dVar, C17642l<? super C5137v0, C16807N> lVar, q<? super d, ? super C4889m, ? super Integer, ? extends d> qVar) {
        return dVar.s(new b(lVar, qVar));
    }

    public static /* synthetic */ d c(d dVar, C17642l<C5137v0, C16807N> lVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C5133t0.a();
        }
        return b(dVar, lVar, qVar);
    }

    /* access modifiers changed from: private */
    public static final d d(C4889m mVar, d dVar) {
        if (dVar.d(a.f18747c)) {
            return dVar;
        }
        mVar.C(1219399079);
        d dVar2 = (d) dVar.e(d.f18749a, new b(mVar));
        mVar.U();
        return dVar2;
    }

    public static final d e(C4889m mVar, d dVar) {
        mVar.W(439770924);
        d d10 = d(mVar, dVar);
        mVar.P();
        return d10;
    }
}
