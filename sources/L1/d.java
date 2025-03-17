package L1;

import G1.w0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"LL1/d;", "Landroidx/compose/ui/d$c;", "LG1/w0;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "LL1/x;", "LXH/N;", "properties", "<init>", "(ZZLnI/l;)V", "m0", "(LL1/x;)V", "n", "Z", "getMergeDescendants", "()Z", "C2", "(Z)V", "o", "setClearingSemantics", "p", "LnI/l;", "getProperties", "()LnI/l;", "D2", "(LnI/l;)V", "k0", "shouldClearDescendantSemantics", "U1", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends d.c implements w0 {

    /* renamed from: n  reason: collision with root package name */
    private boolean f8922n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8923o;

    /* renamed from: p  reason: collision with root package name */
    private C17642l<? super x, C16807N> f8924p;

    public d(boolean z10, boolean z11, C17642l<? super x, C16807N> lVar) {
        this.f8922n = z10;
        this.f8923o = z11;
        this.f8924p = lVar;
    }

    public final void C2(boolean z10) {
        this.f8922n = z10;
    }

    public final void D2(C17642l<? super x, C16807N> lVar) {
        this.f8924p = lVar;
    }

    public boolean U1() {
        return this.f8922n;
    }

    public boolean k0() {
        return this.f8923o;
    }

    public void m0(x xVar) {
        this.f8924p.invoke(xVar);
    }
}
