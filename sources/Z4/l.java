package z4;

import U0.C4889m;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.animation.d;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import java.util.List;
import kotlin.Metadata;
import l0.C5507b;
import l0.v;
import nI.C17642l;
import nI.r;
import x4.C8942f;
import x4.C8948l;
import x4.q;
import x4.y;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aó\u0001\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u001e\b\u0002\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx4/y;", "", "route", "", "Lx4/f;", "arguments", "Lx4/q;", "deepLinks", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lx4/l;", "Landroidx/compose/animation/i;", "enterTransition", "Landroidx/compose/animation/k;", "exitTransition", "popEnterTransition", "popExitTransition", "Ll0/v;", "sizeTransform", "Lkotlin/Function2;", "Ll0/b;", "LXH/N;", "content", "a", "(Lx4/y;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/r;)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final void a(y yVar, String str, List<C8942f> list, List<q> list2, C17642l<d<C8948l>, i> lVar, C17642l<d<C8948l>, k> lVar2, C17642l<d<C8948l>, i> lVar3, C17642l<d<C8948l>, k> lVar4, C17642l<d<C8948l>, v> lVar5, r<? super C5507b, ? super C8948l, ? super C4889m, ? super Integer, C16807N> rVar) {
        f fVar = new f((e) yVar.l().d(e.class), str, rVar);
        for (C8942f fVar2 : list) {
            fVar.b(fVar2.a(), fVar2.b());
        }
        for (q g10 : list2) {
            fVar.g(g10);
        }
        fVar.l(lVar);
        fVar.m(lVar2);
        fVar.n(lVar3);
        fVar.o(lVar4);
        fVar.p(lVar5);
        yVar.k(fVar);
    }

    public static /* synthetic */ void b(y yVar, String str, List list, List list2, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, r rVar, int i10, Object obj) {
        int i11 = i10;
        List n10 = (i11 & 2) != 0 ? C16877v.n() : list;
        List n11 = (i11 & 4) != 0 ? C16877v.n() : list2;
        C17642l lVar6 = (i11 & 8) != 0 ? null : lVar;
        C17642l lVar7 = (i11 & 16) != 0 ? null : lVar2;
        a(yVar, str, n10, n11, lVar6, lVar7, (i11 & 32) != 0 ? lVar6 : lVar3, (i11 & 64) != 0 ? lVar7 : lVar4, (i11 & 128) != 0 ? null : lVar5, rVar);
    }
}
