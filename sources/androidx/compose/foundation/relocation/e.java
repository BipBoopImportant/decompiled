package androidx.compose.foundation.relocation;

import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y0.C6248b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/relocation/e;", "Landroidx/compose/ui/d$c;", "Ly0/b;", "requester", "<init>", "(Ly0/b;)V", "LXH/N;", "C2", "()V", "m2", "D2", "n2", "n", "Ly0/b;", "", "o", "Z", "h2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d.c {

    /* renamed from: n  reason: collision with root package name */
    private C6248b f18431n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18432o;

    public e(C6248b bVar) {
        this.f18431n = bVar;
    }

    private final void C2() {
        C6248b bVar = this.f18431n;
        if (bVar instanceof a) {
            C17542s.h(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) bVar).c().y(this);
        }
    }

    public final void D2(C6248b bVar) {
        C2();
        if (bVar instanceof a) {
            ((a) bVar).c().b(this);
        }
        this.f18431n = bVar;
    }

    public boolean h2() {
        return this.f18432o;
    }

    public void m2() {
        D2(this.f18431n);
    }

    public void n2() {
        C2();
    }
}
