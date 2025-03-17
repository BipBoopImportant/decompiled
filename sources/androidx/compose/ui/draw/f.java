package androidx.compose.ui.draw;

import D1.a;
import j0.L;
import j0.U;
import kotlin.Metadata;
import p1.H0;
import s1.C5905c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draw/f;", "Lp1/H0;", "<init>", "()V", "Ls1/c;", "a", "()Ls1/c;", "layer", "LXH/N;", "b", "(Ls1/c;)V", "d", "Lj0/L;", "Lj0/L;", "allocatedGraphicsLayers", "value", "Lp1/H0;", "c", "()Lp1/H0;", "e", "(Lp1/H0;)V", "graphicsContext", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f implements H0 {

    /* renamed from: a  reason: collision with root package name */
    private L<C5905c> f18794a;

    /* renamed from: b  reason: collision with root package name */
    private H0 f18795b;

    public C5905c a() {
        H0 h02 = this.f18795b;
        if (!(h02 != null)) {
            a.b("GraphicsContext not provided");
        }
        C5905c a10 = h02.a();
        L<C5905c> l10 = this.f18794a;
        if (l10 == null) {
            this.f18794a = U.b(a10);
        } else {
            l10.g(a10);
        }
        return a10;
    }

    public void b(C5905c cVar) {
        H0 h02 = this.f18795b;
        if (h02 != null) {
            h02.b(cVar);
        }
    }

    public final H0 c() {
        return this.f18795b;
    }

    public final void d() {
        L<C5905c> l10 = this.f18794a;
        if (l10 != null) {
            Object[] objArr = l10.f24557a;
            int i10 = l10.f24558b;
            for (int i11 = 0; i11 < i10; i11++) {
                b((C5905c) objArr[i11]);
            }
            l10.h();
        }
    }

    public final void e(H0 h02) {
        d();
        this.f18795b = h02;
    }
}
