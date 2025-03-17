package N0;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5530a;
import m0.C5532b;
import m0.C5546i;
import m0.C5554m;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5673m;
import p1.C5745u0;
import p1.C5747v0;
import p1.C5749w0;
import r0.C5809a;
import r0.C5810b;
import r0.C5811c;
import r0.C5812d;
import r0.C5813e;
import r0.h;
import r0.j;
import r1.d;
import r1.g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"LN0/r;", "", "", "bounded", "Lkotlin/Function0;", "LN0/g;", "rippleAlpha", "<init>", "(ZLnI/a;)V", "Lr0/j;", "interaction", "LQJ/Q;", "scope", "LXH/N;", "c", "(Lr0/j;LQJ/Q;)V", "Lr1/f;", "", "radius", "Lp1/v0;", "color", "b", "(Lr1/f;FJ)V", "a", "Z", "LnI/a;", "Lm0/a;", "Lm0/m;", "Lm0/a;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Lr0/j;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9257a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<g> f9258b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5530a<Float, C5554m> f9259c = C5532b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final List<j> f9260d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private j f9261e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {497}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f9263d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f9264e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f9265f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, float f10, C5546i<Float> iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f9263d = rVar;
            this.f9264e = f10;
            this.f9265f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f9263d, this.f9264e, this.f9265f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9262c;
            if (i10 == 0) {
                y.b(obj);
                C5530a a10 = this.f9263d.f9259c;
                Float d10 = kotlin.coroutines.jvm.internal.b.d(this.f9264e);
                C5546i<Float> iVar = this.f9265f;
                this.f9262c = 1;
                if (C5530a.f(a10, d10, iVar, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {503}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9266c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f9267d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f9268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, C5546i<Float> iVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f9267d = rVar;
            this.f9268e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f9267d, this.f9268e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9266c;
            if (i10 == 0) {
                y.b(obj);
                C5530a a10 = this.f9267d.f9259c;
                Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                C5546i<Float> iVar = this.f9268e;
                this.f9266c = 1;
                if (C5530a.f(a10, d10, iVar, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

    public r(boolean z10, C17631a<g> aVar) {
        this.f9257a = z10;
        this.f9258b = aVar;
    }

    public final void b(r1.f fVar, float f10, long j10) {
        long j11;
        float floatValue = this.f9259c.m().floatValue();
        if (floatValue > 0.0f) {
            long o10 = C5747v0.o(j10, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.f9257a) {
                float l10 = C5673m.l(fVar.b());
                float i10 = C5673m.i(fVar.b());
                int b10 = C5745u0.f27347a.b();
                d I12 = fVar.I1();
                long b11 = I12.b();
                I12.e().t();
                try {
                    I12.c().c(0.0f, 0.0f, l10, i10, b10);
                    j11 = b11;
                    try {
                        r1.f.G1(fVar, o10, f10, 0, 0.0f, (g) null, (C5749w0) null, 0, 124, (Object) null);
                        I12.e().n();
                        I12.g(j11);
                    } catch (Throwable th2) {
                        th = th2;
                        I12.e().n();
                        I12.g(j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j11 = b11;
                    I12.e().n();
                    I12.g(j11);
                    throw th;
                }
            } else {
                r1.f.G1(fVar, o10, f10, 0, 0.0f, (g) null, (C5749w0) null, 0, 124, (Object) null);
            }
        }
    }

    public final void c(j jVar, Q q10) {
        boolean z10 = jVar instanceof r0.g;
        if (z10) {
            this.f9260d.add(jVar);
        } else if (jVar instanceof h) {
            this.f9260d.remove(((h) jVar).a());
        } else if (jVar instanceof C5812d) {
            this.f9260d.add(jVar);
        } else if (jVar instanceof C5813e) {
            this.f9260d.remove(((C5813e) jVar).a());
        } else if (jVar instanceof C5810b) {
            this.f9260d.add(jVar);
        } else if (jVar instanceof C5811c) {
            this.f9260d.remove(((C5811c) jVar).a());
        } else if (jVar instanceof C5809a) {
            this.f9260d.remove(((C5809a) jVar).a());
        } else {
            return;
        }
        j jVar2 = (j) C16877v.K0(this.f9260d);
        if (!C17542s.e(this.f9261e, jVar2)) {
            if (jVar2 != null) {
                g invoke = this.f9258b.invoke();
                F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(this, z10 ? invoke.c() : jVar instanceof C5812d ? invoke.b() : jVar instanceof C5810b ? invoke.a() : 0.0f, m.d(jVar2), (C17164e<? super a>) null), 3, (Object) null);
            } else {
                F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new b(this, m.e(this.f9261e), (C17164e<? super b>) null), 3, (Object) null);
            }
            this.f9261e = jVar2;
        }
    }
}
