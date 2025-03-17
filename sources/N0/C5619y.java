package n0;

import QJ.C16315k0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import r0.C5812d;
import r0.C5813e;
import r0.j;
import r0.m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ln0/y;", "Landroidx/compose/ui/d$c;", "Lr0/m;", "interactionSource", "<init>", "(Lr0/m;)V", "LXH/N;", "C2", "()V", "Lr0/j;", "interaction", "D2", "(Lr0/m;Lr0/j;)V", "", "isFocused", "E2", "(Z)V", "F2", "n", "Lr0/m;", "Lr0/d;", "o", "Lr0/d;", "focusedInteraction", "p", "Z", "h2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.y  reason: case insensitive filesystem */
final class C5619y extends d.c {

    /* renamed from: n  reason: collision with root package name */
    private m f26485n;

    /* renamed from: o  reason: collision with root package name */
    private C5812d f26486o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f26487p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {309}, m = "invokeSuspend")
    /* renamed from: n0.y$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f26489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f26490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16315k0 f26491f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, j jVar, C16315k0 k0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f26489d = mVar;
            this.f26490e = jVar;
            this.f26491f = k0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f26489d, this.f26490e, this.f26491f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26488c;
            if (i10 == 0) {
                y.b(obj);
                m mVar = this.f26489d;
                j jVar = this.f26490e;
                this.f26488c = 1;
                if (mVar.b(jVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16315k0 k0Var = this.f26491f;
            if (k0Var != null) {
                k0Var.b();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.y$b */
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f26492c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f26493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, j jVar) {
            super(1);
            this.f26492c = mVar;
            this.f26493d = jVar;
        }

        public final void a(Throwable th2) {
            this.f26492c.a(this.f26493d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public C5619y(m mVar) {
        this.f26485n = mVar;
    }

    private final void C2() {
        C5812d dVar;
        m mVar = this.f26485n;
        if (!(mVar == null || (dVar = this.f26486o) == null)) {
            mVar.a(new C5813e(dVar));
        }
        this.f26486o = null;
    }

    private final void D2(m mVar, j jVar) {
        if (j2()) {
            F0 f02 = (F0) c2().getCoroutineContext().get(F0.f137562d0);
            F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new a(mVar, jVar, f02 != null ? f02.s(new b(mVar, jVar)) : null, (C17164e<? super a>) null), 3, (Object) null);
            return;
        }
        mVar.a(jVar);
    }

    public final void E2(boolean z10) {
        m mVar = this.f26485n;
        if (mVar == null) {
            return;
        }
        if (z10) {
            C5812d dVar = this.f26486o;
            if (dVar != null) {
                D2(mVar, new C5813e(dVar));
                this.f26486o = null;
            }
            C5812d dVar2 = new C5812d();
            D2(mVar, dVar2);
            this.f26486o = dVar2;
            return;
        }
        C5812d dVar3 = this.f26486o;
        if (dVar3 != null) {
            D2(mVar, new C5813e(dVar3));
            this.f26486o = null;
        }
    }

    public final void F2(m mVar) {
        if (!C17542s.e(this.f26485n, mVar)) {
            C2();
            this.f26485n = mVar;
        }
    }

    public boolean h2() {
        return this.f26487p;
    }
}
