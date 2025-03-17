package androidx.lifecycle;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.annotation.SuppressLint;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/H;", "T", "Landroidx/lifecycle/G;", "Landroidx/lifecycle/f;", "target", "LdI/i;", "context", "<init>", "(Landroidx/lifecycle/f;LdI/i;)V", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Landroidx/lifecycle/f;", "()Landroidx/lifecycle/f;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/f;)V", "b", "LdI/i;", "coroutineContext", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H<T> implements G<T> {

    /* renamed from: a  reason: collision with root package name */
    private C5203f<T> f22149a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f22150b;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H<T> f22152d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f22153e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H<T> h10, T t10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22152d = h10;
            this.f22153e = t10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f22152d, this.f22153e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f22151c;
            if (i10 == 0) {
                y.b(obj);
                C5203f<T> a10 = this.f22152d.a();
                this.f22151c = 1;
                if (a10.e(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f22152d.a().setValue(this.f22153e);
            return C16807N.f139792a;
        }
    }

    public H(C5203f<T> fVar, C17168i iVar) {
        C17542s.j(fVar, "target");
        C17542s.j(iVar, "context");
        this.f22149a = fVar;
        this.f22150b = iVar.plus(C16311i0.c().P0());
    }

    public final C5203f<T> a() {
        return this.f22149a;
    }

    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f22150b, new a(this, t10, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
