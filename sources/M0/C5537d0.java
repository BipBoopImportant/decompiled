package m0;

import U0.C4899r0;
import U0.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@VX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm0/d0;", "S", "Lm0/x0;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lm0/v0;", "transition", "LXH/N;", "f", "(Lm0/v0;)V", "g", "()V", "<set-?>", "b", "LU0/r0;", "a", "()Ljava/lang/Object;", "d", "currentState", "c", "i", "targetState", "", "h", "()Z", "isIdle", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.d0  reason: case insensitive filesystem */
public final class C5537d0<S> extends x0<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f25738d = 0;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f25739b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f25740c;

    public C5537d0(S s10) {
        super((DefaultConstructorMarker) null);
        this.f25739b = u1.e(s10, (o1) null, 2, (Object) null);
        this.f25740c = u1.e(s10, (o1) null, 2, (Object) null);
    }

    public S a() {
        return this.f25739b.getValue();
    }

    public S b() {
        return this.f25740c.getValue();
    }

    public void d(S s10) {
        this.f25739b.setValue(s10);
    }

    public void f(v0<S> v0Var) {
    }

    public void g() {
    }

    public final boolean h() {
        return C17542s.e(a(), b()) && !c();
    }

    public void i(S s10) {
        this.f25740c.setValue(s10);
    }
}
