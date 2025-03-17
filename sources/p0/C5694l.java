package p0;

import QJ.Q;
import QJ.S;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n0.C5589L;
import n0.C5591N;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010'\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010&¨\u0006("}, d2 = {"Lp0/l;", "Lp0/D;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(LnI/l;)V", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "LXH/N;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "delta", "e", "(F)F", "a", "LnI/l;", "l", "()LnI/l;", "b", "Lp0/A;", "scrollScope", "Ln0/N;", "c", "Ln0/N;", "scrollMutex", "LU0/r0;", "", "d", "LU0/r0;", "isScrollingState", "isLastScrollForwardState", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.l  reason: case insensitive filesystem */
final class C5694l implements C5681D {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, Float> f27062a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5678A f27063b = new b(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5591N f27064c = new C5591N();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C4899r0<Boolean> f27065d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C4899r0<Boolean> f27066e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4899r0<Boolean> f27067f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
    /* renamed from: p0.l$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27068c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5694l f27069d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5589L f27070e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C5678A, C17164e<? super C16807N>, Object> f27071f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {204}, m = "invokeSuspend")
        /* renamed from: p0.l$a$a  reason: collision with other inner class name */
        static final class C0441a extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f27072c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f27073d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5694l f27074e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C5678A, C17164e<? super C16807N>, Object> f27075f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0441a(C5694l lVar, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C0441a> eVar) {
                super(2, eVar);
                this.f27074e = lVar;
                this.f27075f = pVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0441a aVar = new C0441a(this.f27074e, this.f27075f, eVar);
                aVar.f27073d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
                return ((C0441a) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f27072c;
                if (i10 == 0) {
                    y.b(obj);
                    C5678A a10 = (C5678A) this.f27073d;
                    this.f27074e.f27065d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    p<C5678A, C17164e<? super C16807N>, Object> pVar = this.f27075f;
                    this.f27072c = 1;
                    if (pVar.invoke(a10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    try {
                        y.b(obj);
                    } catch (Throwable th2) {
                        this.f27074e.f27065d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f27074e.f27065d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5694l lVar, C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f27069d = lVar;
            this.f27070e = l10;
            this.f27071f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f27069d, this.f27070e, this.f27071f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f27068c;
            if (i10 == 0) {
                y.b(obj);
                C5591N g10 = this.f27069d.f27064c;
                C5678A h10 = this.f27069d.f27063b;
                C5589L l10 = this.f27070e;
                C0441a aVar = new C0441a(this.f27069d, this.f27071f, (C17164e<? super C0441a>) null);
                this.f27068c = 1;
                if (g10.f(h10, l10, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"p0/l$b", "Lp0/A;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.l$b */
    public static final class b implements C5678A {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694l f27076a;

        b(C5694l lVar) {
            this.f27076a = lVar;
        }

        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float floatValue = this.f27076a.l().invoke(Float.valueOf(f10)).floatValue();
            boolean z10 = false;
            this.f27076a.f27066e.setValue(Boolean.valueOf(floatValue > 0.0f));
            C4899r0 i10 = this.f27076a.f27067f;
            if (floatValue < 0.0f) {
                z10 = true;
            }
            i10.setValue(Boolean.valueOf(z10));
            return floatValue;
        }
    }

    public C5694l(C17642l<? super Float, Float> lVar) {
        this.f27062a = lVar;
        Boolean bool = Boolean.FALSE;
        this.f27065d = u1.e(bool, (o1) null, 2, (Object) null);
        this.f27066e = u1.e(bool, (o1) null, 2, (Object) null);
        this.f27067f = u1.e(bool, (o1) null, 2, (Object) null);
    }

    public boolean b() {
        return this.f27065d.getValue().booleanValue();
    }

    public float e(float f10) {
        return this.f27062a.invoke(Float.valueOf(f10)).floatValue();
    }

    public Object f(C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new a(this, l10, pVar, (C17164e<? super a>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public final C17642l<Float, Float> l() {
        return this.f27062a;
    }
}
