package T1;

import XH.C16807N;
import XH.C16814e;
import d0.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"LT1/S;", "", "LT1/K;", "platformTextInputService", "<init>", "(LT1/K;)V", "LT1/P;", "value", "LT1/s;", "imeOptions", "Lkotlin/Function1;", "", "LT1/i;", "LXH/N;", "onEditCommand", "LT1/r;", "onImeActionPerformed", "LT1/Y;", "d", "(LT1/P;LT1/s;LnI/l;LnI/l;)LT1/Y;", "e", "()V", "session", "g", "(LT1/Y;)V", "f", "c", "b", "a", "LT1/K;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()LT1/Y;", "currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public class S {

    /* renamed from: a  reason: collision with root package name */
    private final K f13544a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Y> f13545b = new AtomicReference<>((Object) null);

    public S(K k10) {
        this.f13544a = k10;
    }

    public final Y a() {
        return this.f13545b.get();
    }

    @C16814e
    public final void b() {
        this.f13544a.e();
    }

    @C16814e
    public final void c() {
        if (a() != null) {
            this.f13544a.g();
        }
    }

    public Y d(P p10, C4849s sVar, C17642l<? super List<? extends C4840i>, C16807N> lVar, C17642l<? super r, C16807N> lVar2) {
        this.f13544a.d(p10, sVar, lVar, lVar2);
        Y y10 = new Y(this, this.f13544a);
        this.f13545b.set(y10);
        return y10;
    }

    public final void e() {
        this.f13544a.b();
        this.f13545b.set(new Y(this, this.f13544a));
    }

    public final void f() {
        this.f13544a.c();
    }

    public void g(Y y10) {
        if (i.a(this.f13545b, y10, (Object) null)) {
            this.f13544a.c();
        }
    }
}
