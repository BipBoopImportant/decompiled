package androidx.compose.ui.draw;

import XH.C16807N;
import kotlin.Metadata;
import m1.c;
import m1.d;
import m1.i;
import nI.C17642l;
import r1.C5817c;
import r1.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "onDraw", "b", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "Lm1/d;", "Lm1/i;", "onBuildDrawCache", "c", "Lm1/c;", "a", "(LnI/l;)Lm1/c;", "Lr1/c;", "d", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final c a(C17642l<? super d, i> lVar) {
        return new a(new d(), lVar);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, C17642l<? super f, C16807N> lVar) {
        return dVar.s(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, C17642l<? super d, i> lVar) {
        return dVar.s(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, C17642l<? super C5817c, C16807N> lVar) {
        return dVar.s(new DrawWithContentElement(lVar));
    }
}
