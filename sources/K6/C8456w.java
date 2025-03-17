package k6;

import QJ.F0;
import T5.r;
import XH.C16807N;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o6.b;
import r6.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lk6/w;", "Lk6/r;", "Landroidx/lifecycle/h;", "LT5/r;", "imageLoader", "Lk6/h;", "initialRequest", "Lo6/b;", "target", "Landroidx/lifecycle/r;", "lifecycle", "LQJ/F0;", "job", "<init>", "(LT5/r;Lk6/h;Lo6/b;Landroidx/lifecycle/r;LQJ/F0;)V", "LXH/N;", "f", "()V", "n", "start", "b", "(LdI/e;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/y;", "owner", "onDestroy", "(Landroidx/lifecycle/y;)V", "a", "LT5/r;", "Lk6/h;", "c", "Lo6/b;", "Landroidx/lifecycle/r;", "e", "LQJ/F0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.w  reason: case insensitive filesystem */
public final class C8456w implements C8451r, C5205h {

    /* renamed from: a  reason: collision with root package name */
    private final r f54272a;

    /* renamed from: b  reason: collision with root package name */
    private final C8441h f54273b;

    /* renamed from: c  reason: collision with root package name */
    private final b<?> f54274c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.r f54275d;

    /* renamed from: e  reason: collision with root package name */
    private final F0 f54276e;

    public C8456w(r rVar, C8441h hVar, b<?> bVar, androidx.lifecycle.r rVar2, F0 f02) {
        this.f54272a = rVar;
        this.f54273b = hVar;
        this.f54274c = bVar;
        this.f54275d = rVar2;
        this.f54276e = f02;
    }

    public Object b(C17164e<? super C16807N> eVar) {
        androidx.lifecycle.r rVar = this.f54275d;
        if (rVar == null) {
            return C16807N.f139792a;
        }
        Object a10 = q.a(rVar, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public void d() {
        androidx.lifecycle.r rVar;
        F0.a.a(this.f54276e, (CancellationException) null, 1, (Object) null);
        b<?> bVar = this.f54274c;
        if ((bVar instanceof C5220x) && (rVar = this.f54275d) != null) {
            rVar.g((C5220x) bVar);
        }
        androidx.lifecycle.r rVar2 = this.f54275d;
        if (rVar2 != null) {
            rVar2.g(this);
        }
    }

    public final void f() {
        this.f54272a.e(this.f54273b);
    }

    public void n() {
        if (!this.f54274c.c().isAttachedToWindow()) {
            C8458y.a(this.f54274c.c()).c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    public void onDestroy(C5221y yVar) {
        C8458y.a(this.f54274c.c()).a();
    }

    public void start() {
        androidx.lifecycle.r rVar;
        androidx.lifecycle.r rVar2 = this.f54275d;
        if (rVar2 != null) {
            rVar2.c(this);
        }
        b<?> bVar = this.f54274c;
        if ((bVar instanceof C5220x) && (rVar = this.f54275d) != null) {
            q.b(rVar, (C5220x) bVar);
        }
        C8458y.a(this.f54274c.c()).c(this);
    }
}
