package androidx.compose.ui.layout;

import G1.A;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.r;
import c2.s;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/h;", "Landroidx/compose/ui/d$c;", "LG1/A;", "Lkotlin/Function1;", "Lc2/r;", "LXH/N;", "onSizeChanged", "<init>", "(LnI/l;)V", "C2", "size", "p", "(J)V", "n", "LnI/l;", "", "o", "Z", "h2", "()Z", "shouldAutoInvalidate", "J", "previousSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h extends d.c implements A {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super r, C16807N> f18991n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18992o = true;

    /* renamed from: p  reason: collision with root package name */
    private long f18993p = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public h(C17642l<? super r, C16807N> lVar) {
        this.f18991n = lVar;
    }

    public final void C2(C17642l<? super r, C16807N> lVar) {
        this.f18991n = lVar;
        this.f18993p = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean h2() {
        return this.f18992o;
    }

    public void p(long j10) {
        if (!r.f(this.f18993p, j10)) {
            this.f18991n.invoke(r.b(j10));
            this.f18993p = j10;
        }
    }
}
