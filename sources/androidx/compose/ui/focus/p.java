package androidx.compose.ui.focus;

import androidx.compose.ui.d;
import kotlin.Metadata;
import n1.C5634n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/p;", "Ln1/n;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/ui/focus/m;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/m;)V", "LXH/N;", "m2", "()V", "n2", "n", "Landroidx/compose/ui/focus/m;", "C2", "()Landroidx/compose/ui/focus/m;", "D2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class p extends d.c implements C5634n {

    /* renamed from: n  reason: collision with root package name */
    private m f18868n;

    public p(m mVar) {
        this.f18868n = mVar;
    }

    public final m C2() {
        return this.f18868n;
    }

    public final void D2(m mVar) {
        this.f18868n = mVar;
    }

    public void m2() {
        super.m2();
        this.f18868n.e().b(this);
    }

    public void n2() {
        this.f18868n.e().y(this);
        super.n2();
    }
}
