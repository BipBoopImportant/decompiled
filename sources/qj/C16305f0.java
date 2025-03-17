package QJ;

import WJ.C16747h;
import WJ.K;
import XH.C16807N;
import XH.x;
import XH.y;
import YJ.C16892h;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LQJ/f0;", "T", "LYJ/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "i", "()Ljava/lang/Object;", "takenState", "", "cause", "LXH/N;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "g", "(Ljava/lang/Throwable;)V", "c", "I", "LdI/e;", "b", "()LdI/e;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.f0  reason: case insensitive filesystem */
public abstract class C16305f0<T> extends C16892h {

    /* renamed from: c  reason: collision with root package name */
    public int f137629c;

    public C16305f0(int i10) {
        this.f137629c = i10;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract C17164e<T> b();

    public Throwable e(Object obj) {
        C16285C c10 = obj instanceof C16285C ? (C16285C) obj : null;
        if (c10 != null) {
            return c10.f137555a;
        }
        return null;
    }

    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th2) {
        O.a(b().getContext(), new U("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    public final void run() {
        C17168i context;
        Object i10;
        o1<?> m10;
        try {
            C17164e b10 = b();
            C17542s.h(b10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C16747h hVar = (C16747h) b10;
            C17164e<T> eVar = hVar.f139552e;
            Object obj = hVar.f139554g;
            context = eVar.getContext();
            i10 = K.i(context, obj);
            F0 f02 = null;
            m10 = i10 != K.f139530a ? C16293K.m(eVar, context, i10) : null;
            C17168i context2 = eVar.getContext();
            Object i11 = i();
            Throwable e10 = e(i11);
            if (e10 == null && C16307g0.b(this.f137629c)) {
                f02 = (F0) context2.get(F0.f137562d0);
            }
            if (f02 != null && !f02.c()) {
                CancellationException x10 = f02.x();
                a(i11, x10);
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(y.a(x10)));
            } else if (e10 != null) {
                x.a aVar2 = x.f139812b;
                eVar.resumeWith(x.b(y.a(e10)));
            } else {
                x.a aVar3 = x.f139812b;
                eVar.resumeWith(x.b(f(i11)));
            }
            C16807N n10 = C16807N.f139792a;
            if (m10 != null) {
                if (!m10.g1()) {
                    return;
                }
            }
            K.f(context, i10);
        } catch (C16301d0 e11) {
            O.a(b().getContext(), e11.getCause());
        } catch (Throwable th2) {
            g(th2);
        }
    }
}
