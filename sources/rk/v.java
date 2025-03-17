package rK;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.b1;
import U0.T0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"LrK/v;", "LU0/T0;", "<init>", "()V", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "w0", "o1", "c1", "LQJ/Q;", "LQJ/Q;", "scope", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class v implements T0 {

    /* renamed from: a  reason: collision with root package name */
    private Q f146812a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.RememberWorker$onRemembered$1", f = "RememberWorker.kt", l = {17}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f146814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f146814d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f146814d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f146813c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = this.f146814d;
                this.f146813c = 1;
                if (vVar.a(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public abstract Object a(C17164e<? super C16807N> eVar);

    public void c1() {
        if (this.f146812a != null) {
            throw new IllegalStateException("onRemembered() shouldn't have been called as per RememberObserver's documentation");
        }
    }

    public void o1() {
        Q q10 = this.f146812a;
        if (q10 != null) {
            S.e(q10, (CancellationException) null, 1, (Object) null);
        }
    }

    public void w0() {
        Q a10 = S.a(b1.b((F0) null, 1, (Object) null).plus(C16311i0.c().P0()));
        this.f146812a = a10;
        C17542s.g(a10);
        F0 unused = C16314k.d(a10, (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }
}
