package e;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16423B;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.activity.C4987b;
import androidx.activity.v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.K;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0010\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Le/j;", "", "LQJ/Q;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "LTJ/g;", "Landroidx/activity/b;", "LdI/e;", "LXH/N;", "onBack", "Landroidx/activity/v;", "callback", "<init>", "(LQJ/Q;ZLnI/p;Landroidx/activity/v;)V", "backEvent", "LSJ/n;", "e", "(Landroidx/activity/b;)Ljava/lang/Object;", "b", "()Z", "a", "()V", "Z", "d", "f", "(Z)V", "LSJ/j;", "LSJ/j;", "c", "()LSJ/j;", "channel", "LQJ/F0;", "LQJ/F0;", "getJob", "()LQJ/F0;", "job", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.j  reason: case insensitive filesystem */
final class C5287j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23174a;

    /* renamed from: b  reason: collision with root package name */
    private final C16434j<C4987b> f23175b = C16437m.b(-2, C16428d.SUSPEND, (C17642l) null, 4, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final F0 f23176c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: e.j$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f23177c;

        /* renamed from: d  reason: collision with root package name */
        int f23178d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f23179e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C16532g<C4987b>, C17164e<? super C16807N>, Object> f23180f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5287j f23181g;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Landroidx/activity/b;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
        /* renamed from: e.j$a$a  reason: collision with other inner class name */
        static final class C0368a extends l implements q<C16533h<? super C4987b>, Throwable, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f23182c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f23183d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0368a(K k10, C17164e<? super C0368a> eVar) {
                super(3, eVar);
                this.f23183d = k10;
            }

            public final Object invoke(C16533h<? super C4987b> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
                return new C0368a(this.f23183d, eVar).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f23182c == 0) {
                    y.b(obj);
                    this.f23183d.f144344a = true;
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar, p<? super C16532g<C4987b>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C5287j jVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f23179e = vVar;
            this.f23180f = pVar;
            this.f23181g = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f23179e, this.f23180f, this.f23181g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            K k10;
            Object f10 = C17187b.f();
            int i10 = this.f23178d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f23179e.isEnabled()) {
                    K k11 = new K();
                    p<C16532g<C4987b>, C17164e<? super C16807N>, Object> pVar = this.f23180f;
                    C16532g<T> Q10 = C16534i.Q(C16534i.p(this.f23181g.c()), new C0368a(k11, (C17164e<? super C0368a>) null));
                    this.f23177c = k11;
                    this.f23178d = 1;
                    if (pVar.invoke(Q10, this) == f10) {
                        return f10;
                    }
                    k10 = k11;
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                k10 = (K) this.f23177c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!k10.f144344a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return C16807N.f139792a;
        }
    }

    public C5287j(Q q10, boolean z10, p<? super C16532g<C4987b>, ? super C17164e<? super C16807N>, ? extends Object> pVar, v vVar) {
        this.f23174a = z10;
        this.f23176c = C16314k.d(q10, (C17168i) null, (T) null, new a(vVar, pVar, this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final void a() {
        this.f23175b.i(new CancellationException("onBack cancelled"));
        F0.a.a(this.f23176c, (CancellationException) null, 1, (Object) null);
    }

    public final boolean b() {
        return C16423B.a.a(this.f23175b, (Throwable) null, 1, (Object) null);
    }

    public final C16434j<C4987b> c() {
        return this.f23175b;
    }

    public final boolean d() {
        return this.f23174a;
    }

    public final Object e(C4987b bVar) {
        return this.f23175b.k(bVar);
    }

    public final void f(boolean z10) {
        this.f23174a = z10;
    }
}
