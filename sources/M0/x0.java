package m0;

import U0.C4899r0;
import U0.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8@@@X\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lm0/x0;", "S", "", "<init>", "()V", "Lm0/v0;", "transition", "LXH/N;", "f", "(Lm0/v0;)V", "g", "", "<set-?>", "a", "LU0/r0;", "c", "()Z", "e", "(Z)V", "isRunning", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "currentState", "b", "setTargetState$animation_core_release", "targetState", "Lm0/d0;", "Lm0/j0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class x0<S> {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f26028a;

    public /* synthetic */ x0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S a();

    public abstract S b();

    public final boolean c() {
        return ((Boolean) this.f26028a.getValue()).booleanValue();
    }

    public abstract void d(S s10);

    public final void e(boolean z10) {
        this.f26028a.setValue(Boolean.valueOf(z10));
    }

    public abstract void f(v0<S> v0Var);

    public abstract void g();

    private x0() {
        this.f26028a = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }
}
