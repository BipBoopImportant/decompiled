package k6;

import QJ.F0;
import XH.C16807N;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import r6.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lk6/m;", "Lk6/r;", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/r;", "lifecycle", "LQJ/F0;", "job", "<init>", "(Landroidx/lifecycle/r;LQJ/F0;)V", "LXH/N;", "start", "()V", "b", "(LdI/e;)Ljava/lang/Object;", "l", "d", "Landroidx/lifecycle/y;", "owner", "onDestroy", "(Landroidx/lifecycle/y;)V", "a", "Landroidx/lifecycle/r;", "LQJ/F0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.m  reason: case insensitive filesystem */
public final class C8446m implements C8451r, C5205h {

    /* renamed from: a  reason: collision with root package name */
    private final r f54249a;

    /* renamed from: b  reason: collision with root package name */
    private final F0 f54250b;

    public C8446m(r rVar, F0 f02) {
        this.f54249a = rVar;
        this.f54250b = f02;
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object a10 = q.a(this.f54249a, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public void d() {
        F0.a.a(this.f54250b, (CancellationException) null, 1, (Object) null);
    }

    public void l() {
        this.f54249a.g(this);
    }

    public void onDestroy(C5221y yVar) {
        d();
    }

    public void start() {
        this.f54249a.c(this);
    }
}
