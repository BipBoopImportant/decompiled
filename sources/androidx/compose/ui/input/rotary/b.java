package androidx.compose.ui.input.rotary;

import C1.a;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/rotary/b;", "LC1/a;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "LC1/b;", "", "onEvent", "onPreEvent", "<init>", "(LnI/l;LnI/l;)V", "event", "d0", "(LC1/b;)Z", "X0", "n", "LnI/l;", "getOnEvent", "()LnI/l;", "C2", "(LnI/l;)V", "o", "getOnPreEvent", "D2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends d.c implements a {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super C1.b, Boolean> f18982n;

    /* renamed from: o  reason: collision with root package name */
    private C17642l<? super C1.b, Boolean> f18983o;

    public b(C17642l<? super C1.b, Boolean> lVar, C17642l<? super C1.b, Boolean> lVar2) {
        this.f18982n = lVar;
        this.f18983o = lVar2;
    }

    public final void C2(C17642l<? super C1.b, Boolean> lVar) {
        this.f18982n = lVar;
    }

    public final void D2(C17642l<? super C1.b, Boolean> lVar) {
        this.f18983o = lVar;
    }

    public boolean X0(C1.b bVar) {
        C17642l<? super C1.b, Boolean> lVar = this.f18983o;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }

    public boolean d0(C1.b bVar) {
        C17642l<? super C1.b, Boolean> lVar = this.f18982n;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }
}
