package p0;

import QJ.C16310i;
import QJ.Q;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.g;
import dI.C17164e;
import eI.C17187b;
import i1.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import m0.C5544h;
import m0.C5550k;
import m0.C5552l;
import m0.C5554m;
import m0.C5570z;
import m0.t0;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lp0/k;", "Lp0/s;", "Lm0/z;", "", "flingDecay", "Li1/h;", "motionDurationScale", "<init>", "(Lm0/z;Li1/h;)V", "Lp0/A;", "initialVelocity", "a", "(Lp0/A;FLdI/e;)Ljava/lang/Object;", "Lm0/z;", "d", "()Lm0/z;", "f", "(Lm0/z;)V", "b", "Li1/h;", "", "c", "I", "e", "()I", "g", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.k  reason: case insensitive filesystem */
public final class C5693k implements s {

    /* renamed from: a  reason: collision with root package name */
    private C5570z<Float> f27049a;

    /* renamed from: b  reason: collision with root package name */
    private final h f27050b;

    /* renamed from: c  reason: collision with root package name */
    private int f27051c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)F"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {893}, m = "invokeSuspend")
    /* renamed from: p0.k$a */
    static final class a extends l implements p<Q, C17164e<? super Float>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f27052c;

        /* renamed from: d  reason: collision with root package name */
        Object f27053d;

        /* renamed from: e  reason: collision with root package name */
        int f27054e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f27055f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5693k f27056g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5678A f27057h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.k$a$a  reason: collision with other inner class name */
        static final class C0440a extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f27058c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5678A f27059d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L f27060e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5693k f27061f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0440a(L l10, C5678A a10, L l11, C5693k kVar) {
                super(1);
                this.f27058c = l10;
                this.f27059d = a10;
                this.f27060e = l11;
                this.f27061f = kVar;
            }

            public final void a(C5544h<Float, C5554m> hVar) {
                float floatValue = hVar.e().floatValue() - this.f27058c.f144345a;
                float a10 = this.f27059d.a(floatValue);
                this.f27058c.f144345a = hVar.e().floatValue();
                this.f27060e.f144345a = hVar.f().floatValue();
                if (Math.abs(floatValue - a10) > 0.5f) {
                    hVar.a();
                }
                C5693k kVar = this.f27061f;
                kVar.g(kVar.e() + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, C5693k kVar, C5678A a10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f27055f = f10;
            this.f27056g = kVar;
            this.f27057h = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f27055f, this.f27056g, this.f27057h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Float> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            float f10;
            L l10;
            C5550k kVar;
            Object f11 = C17187b.f();
            int i10 = this.f27054e;
            if (i10 == 0) {
                y.b(obj);
                if (Math.abs(this.f27055f) > 1.0f) {
                    L l11 = new L();
                    l11.f144345a = this.f27055f;
                    L l12 = new L();
                    C5550k c10 = C5552l.c(0.0f, this.f27055f, 0, 0, false, 28, (Object) null);
                    try {
                        C5570z<Float> d10 = this.f27056g.d();
                        C0440a aVar = new C0440a(l12, this.f27057h, l11, this.f27056g);
                        this.f27052c = l11;
                        this.f27053d = c10;
                        this.f27054e = 1;
                        if (t0.h(c10, d10, false, aVar, this, 2, (Object) null) == f11) {
                            return f11;
                        }
                        l10 = l11;
                    } catch (CancellationException unused) {
                        l10 = l11;
                        kVar = c10;
                        l10.f144345a = ((Number) kVar.p()).floatValue();
                        f10 = l10.f144345a;
                        return b.d(f10);
                    }
                } else {
                    f10 = this.f27055f;
                    return b.d(f10);
                }
            } else if (i10 == 1) {
                kVar = (C5550k) this.f27053d;
                l10 = (L) this.f27052c;
                try {
                    y.b(obj);
                } catch (CancellationException unused2) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = l10.f144345a;
            return b.d(f10);
        }
    }

    public C5693k(C5570z<Float> zVar, h hVar) {
        this.f27049a = zVar;
        this.f27050b = hVar;
    }

    public Object a(C5678A a10, float f10, C17164e<? super Float> eVar) {
        this.f27051c = 0;
        return C16310i.g(this.f27050b, new a(f10, this, a10, (C17164e<? super a>) null), eVar);
    }

    public final C5570z<Float> d() {
        return this.f27049a;
    }

    public final int e() {
        return this.f27051c;
    }

    public final void f(C5570z<Float> zVar) {
        this.f27049a = zVar;
    }

    public final void g(int i10) {
        this.f27051c = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5693k(C5570z zVar, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, (i10 & 2) != 0 ? g.e() : hVar);
    }
}
