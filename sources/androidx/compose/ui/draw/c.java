package androidx.compose.ui.draw;

import G1.r;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;
import r1.C5817c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/draw/c;", "Landroidx/compose/ui/d$c;", "LG1/r;", "Lkotlin/Function1;", "Lr1/c;", "LXH/N;", "onDraw", "<init>", "(LnI/l;)V", "z", "(Lr1/c;)V", "n", "LnI/l;", "getOnDraw", "()LnI/l;", "C2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends d.c implements r {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super C5817c, C16807N> f18786n;

    public c(C17642l<? super C5817c, C16807N> lVar) {
        this.f18786n = lVar;
    }

    public final void C2(C17642l<? super C5817c, C16807N> lVar) {
        this.f18786n = lVar;
    }

    public void z(C5817c cVar) {
        this.f18786n.invoke(cVar);
    }
}
