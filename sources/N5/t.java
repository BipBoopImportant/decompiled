package N5;

import B5.h;
import P5.b;
import QJ.F0;
import S5.g;
import S5.j;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LN5/t;", "LN5/o;", "LB5/h;", "imageLoader", "LN5/h;", "initialRequest", "LP5/b;", "target", "Landroidx/lifecycle/r;", "lifecycle", "LQJ/F0;", "job", "<init>", "(LB5/h;LN5/h;LP5/b;Landroidx/lifecycle/r;LQJ/F0;)V", "LXH/N;", "b", "()V", "n", "start", "a", "Landroidx/lifecycle/y;", "owner", "onDestroy", "(Landroidx/lifecycle/y;)V", "LB5/h;", "LN5/h;", "c", "LP5/b;", "d", "Landroidx/lifecycle/r;", "e", "LQJ/F0;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements o {

    /* renamed from: a  reason: collision with root package name */
    private final h f39111a;

    /* renamed from: b  reason: collision with root package name */
    private final h f39112b;

    /* renamed from: c  reason: collision with root package name */
    private final b<?> f39113c;

    /* renamed from: d  reason: collision with root package name */
    private final r f39114d;

    /* renamed from: e  reason: collision with root package name */
    private final F0 f39115e;

    public t(h hVar, h hVar2, b<?> bVar, r rVar, F0 f02) {
        this.f39111a = hVar;
        this.f39112b = hVar2;
        this.f39113c = bVar;
        this.f39114d = rVar;
        this.f39115e = f02;
    }

    public void a() {
        F0.a.a(this.f39115e, (CancellationException) null, 1, (Object) null);
        b<?> bVar = this.f39113c;
        if (bVar instanceof C5220x) {
            this.f39114d.g((C5220x) bVar);
        }
        this.f39114d.g(this);
    }

    public final void b() {
        this.f39111a.d(this.f39112b);
    }

    public void n() {
        if (!this.f39113c.c().isAttachedToWindow()) {
            j.n(this.f39113c.c()).c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    public void onDestroy(C5221y yVar) {
        j.n(this.f39113c.c()).a();
    }

    public void start() {
        this.f39114d.c(this);
        b<?> bVar = this.f39113c;
        if (bVar instanceof C5220x) {
            g.b(this.f39114d, (C5220x) bVar);
        }
        j.n(this.f39113c.c()).c(this);
    }
}
