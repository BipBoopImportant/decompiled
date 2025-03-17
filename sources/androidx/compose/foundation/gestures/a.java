package androidx.compose.foundation.gestures;

import A1.B;
import QJ.F0;
import QJ.Q;
import QJ.S;
import TJ.C16532g;
import TJ.C16533h;
import U0.p1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import j0.J;
import j0.P;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.O;
import m0.C5523B;
import m0.C5544h;
import m0.C5550k;
import m0.C5552l;
import m0.C5554m;
import m0.C5570z;
import m0.t0;
import n0.C5589L;
import n0.T;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import p0.C5683a;
import p0.C5684b;
import p0.C5685c;
import p0.o;
import p0.v;
import r0.m;
import tI.C17978n;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\b\b\u0000\u0010\u0000*\u00020\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aF\u0010\u001d\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u001c\u001a\u00028\u0000H@¢\u0006\u0004\b\u001d\u0010\u001e\u001a(\u0010 \u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001f\u001a\u00028\u0000H@¢\u0006\u0004\b \u0010!\u001a0\u0010\"\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0017*\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&\u001aH\u0010-\u001a\u00020\u0012\"\u0004\b\u0000\u0010'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120+\u0012\u0006\u0012\u0004\u0018\u00010\u000f0*H@¢\u0006\u0004\b-\u0010.\u001a\u001b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b0\u00101\u001a\u001f\u00104\u001a\u00020\u0017\"\u0004\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000003H\u0002¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00020\u0017\"\u0004\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000003H\u0002¢\u0006\u0004\b6\u00105\" \u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108¨\u0006:"}, d2 = {"T", "Landroidx/compose/ui/d;", "Lp0/c;", "state", "Lp0/v;", "orientation", "", "enabled", "Lr0/m;", "interactionSource", "Ln0/T;", "overscrollEffect", "startDragImmediately", "i", "(Landroidx/compose/ui/d;Lp0/c;Lp0/v;ZLr0/m;Ln0/T;Z)Landroidx/compose/ui/d;", "", "Lkotlin/Function1;", "Lp0/p;", "LXH/N;", "builder", "Lp0/o;", "a", "(LnI/l;)Lp0/o;", "", "velocity", "Lp0/b;", "anchoredDragScope", "anchors", "latestTarget", "k", "(Lp0/c;FLp0/b;Lp0/o;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "targetValue", "l", "(Lp0/c;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "m", "(Lp0/c;Ljava/lang/Object;FLdI/e;)Ljava/lang/Object;", "target", "n", "(FF)F", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "LdI/e;", "block", "r", "(LnI/a;LnI/p;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/f;", "o", "()Landroidx/compose/foundation/gestures/f;", "K", "Lj0/P;", "q", "(Lj0/P;)F", "p", "LA1/B;", "LnI/l;", "AlwaysDrag", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C17642l<B, Boolean> f17667a = C0250a.f17668c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "", "a", "(LA1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.a$a  reason: collision with other inner class name */
    static final class C0250a extends C17544u implements C17642l<B, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0250a f17668c = new C0250a();

        C0250a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(B b10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<Float, Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5684b f17669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L f17670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5684b bVar, L l10) {
            super(2);
            this.f17669c = bVar;
            this.f17670d = l10;
        }

        public final void a(float f10, float f11) {
            this.f17669c.a(f10, f11);
            this.f17670d.f144345a = f10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, d2 = {"T", "Lp0/b;", "Lp0/o;", "anchors", "latestTarget", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1022}, m = "invokeSuspend")
    static final class c extends l implements r<C5684b, o<T>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17671c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17672d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17673e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f17674f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f17675g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5685c<T> cVar, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f17675g = cVar;
        }

        /* renamed from: i */
        public final Object l(C5684b bVar, o<T> oVar, T t10, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f17675g, eVar);
            cVar.f17672d = bVar;
            cVar.f17673e = oVar;
            cVar.f17674f = t10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17671c;
            if (i10 == 0) {
                y.b(obj);
                Object obj2 = this.f17674f;
                C5685c<T> cVar = this.f17675g;
                float s10 = cVar.s();
                this.f17672d = null;
                this.f17673e = null;
                this.f17671c = 1;
                if (a.k(cVar, s10, (C5684b) this.f17672d, (o) this.f17673e, obj2, this) == f10) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1049}, m = "animateToWithDecay")
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        float f17676c;

        /* renamed from: d  reason: collision with root package name */
        Object f17677d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17678e;

        /* renamed from: f  reason: collision with root package name */
        int f17679f;

        d(C17164e<? super d> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17678e = obj;
            this.f17679f |= Integer.MIN_VALUE;
            return a.m((C5685c) null, null, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, d2 = {"T", "Lp0/b;", "Lp0/o;", "anchors", "latestTarget", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1059, 1077, 1092}, m = "invokeSuspend")
    static final class e extends l implements r<C5684b, o<T>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17680c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17681d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17682e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f17683f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f17684g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f17685h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ L f17686i;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.a$e$a  reason: collision with other inner class name */
        static final class C0251a extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f17687c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5684b f17688d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L f17689e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ L f17690f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0251a(float f10, C5684b bVar, L l10, L l11) {
                super(1);
                this.f17687c = f10;
                this.f17688d = bVar;
                this.f17689e = l10;
                this.f17690f = l11;
            }

            public final void a(C5544h<Float, C5554m> hVar) {
                if (Math.abs(hVar.e().floatValue()) >= Math.abs(this.f17687c)) {
                    float c10 = a.n(hVar.e().floatValue(), this.f17687c);
                    this.f17688d.a(c10, hVar.f().floatValue());
                    this.f17689e.f144345a = Float.isNaN(hVar.f().floatValue()) ? 0.0f : hVar.f().floatValue();
                    this.f17690f.f144345a = c10;
                    hVar.a();
                    return;
                }
                this.f17688d.a(hVar.e().floatValue(), hVar.f().floatValue());
                this.f17689e.f144345a = hVar.f().floatValue();
                this.f17690f.f144345a = hVar.e().floatValue();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5685c<T> cVar, float f10, L l10, C17164e<? super e> eVar) {
            super(4, eVar);
            this.f17684g = cVar;
            this.f17685h = f10;
            this.f17686i = l10;
        }

        /* renamed from: i */
        public final Object l(C5684b bVar, o<T> oVar, T t10, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(this.f17684g, this.f17685h, this.f17686i, eVar);
            eVar2.f17681d = bVar;
            eVar2.f17682e = oVar;
            eVar2.f17683f = t10;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17680c;
            if (i10 == 0) {
                y.b(obj);
                C5684b bVar = (C5684b) this.f17681d;
                o oVar = (o) this.f17682e;
                Object obj2 = this.f17683f;
                float f11 = oVar.f(obj2);
                if (!Float.isNaN(f11)) {
                    L l10 = new L();
                    float t10 = Float.isNaN(this.f17684g.t()) ? 0.0f : this.f17684g.t();
                    l10.f144345a = t10;
                    if (t10 != f11) {
                        float f12 = this.f17685h;
                        if ((f11 - t10) * f12 < 0.0f || f12 == 0.0f) {
                            C5685c<T> cVar = this.f17684g;
                            this.f17681d = null;
                            this.f17682e = null;
                            this.f17680c = 1;
                            if (a.k(cVar, f12, bVar, oVar, obj2, this) == f10) {
                                return f10;
                            }
                            this.f17686i.f144345a = 0.0f;
                        } else {
                            float a10 = C5523B.a(this.f17684g.q(), l10.f144345a, this.f17685h);
                            float f13 = this.f17685h;
                            if (f13 <= 0.0f ? a10 > f11 : a10 < f11) {
                                C5685c<T> cVar2 = this.f17684g;
                                this.f17681d = null;
                                this.f17682e = null;
                                this.f17680c = 3;
                                if (a.k(cVar2, f13, bVar, oVar, obj2, this) == f10) {
                                    return f10;
                                }
                            } else {
                                C5550k c10 = C5552l.c(l10.f144345a, f13, 0, 0, false, 28, (Object) null);
                                C5570z<Float> q10 = this.f17684g.q();
                                C0251a aVar = new C0251a(f11, bVar, this.f17686i, l10);
                                this.f17681d = null;
                                this.f17682e = null;
                                this.f17680c = 2;
                                if (t0.h(c10, q10, false, aVar, this, 2, (Object) null) == f10) {
                                    return f10;
                                }
                            }
                        }
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                y.b(obj);
                this.f17686i.f144345a = 0.0f;
                return C16807N.f139792a;
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else if (i10 == 3) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f17686i.f144345a = 0.0f;
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1111}, m = "restartable")
    static final class f<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f17691c;

        /* renamed from: d  reason: collision with root package name */
        int f17692d;

        f(C17164e<? super f> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17691c = obj;
            this.f17692d |= Integer.MIN_VALUE;
            return a.r((C17631a) null, (p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1114}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17693c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17694d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<I> f17695e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f17696f;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.a$g$a  reason: collision with other inner class name */
        static final class C0252a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O<F0> f17697a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f17698b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f17699c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1120}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.a$g$a$a  reason: collision with other inner class name */
            static final class C0253a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f17700c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f17701d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ I f17702e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Q f17703f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0253a(p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, I i10, Q q10, C17164e<? super C0253a> eVar) {
                    super(2, eVar);
                    this.f17701d = pVar;
                    this.f17702e = i10;
                    this.f17703f = q10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0253a(this.f17701d, this.f17702e, this.f17703f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0253a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f17700c;
                    if (i10 == 0) {
                        y.b(obj);
                        p<I, C17164e<? super C16807N>, Object> pVar = this.f17701d;
                        I i11 = this.f17702e;
                        this.f17700c = 1;
                        if (pVar.invoke(i11, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S.d(this.f17703f, new C5683a());
                    return C16807N.f139792a;
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1117}, m = "emit")
            /* renamed from: androidx.compose.foundation.gestures.a$g$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f17704c;

                /* renamed from: d  reason: collision with root package name */
                Object f17705d;

                /* renamed from: e  reason: collision with root package name */
                Object f17706e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f17707f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C0252a<T> f17708g;

                /* renamed from: h  reason: collision with root package name */
                int f17709h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0252a<? super T> aVar, C17164e<? super b> eVar) {
                    super(eVar);
                    this.f17708g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f17707f = obj;
                    this.f17709h |= Integer.MIN_VALUE;
                    return this.f17708g.emit(null, this);
                }
            }

            C0252a(O<F0> o10, Q q10, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
                this.f17697a = o10;
                this.f17698b = q10;
                this.f17699c = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(I r8, dI.C17164e<? super XH.C16807N> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.foundation.gestures.a.g.C0252a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.compose.foundation.gestures.a$g$a$b r0 = (androidx.compose.foundation.gestures.a.g.C0252a.b) r0
                    int r1 = r0.f17709h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f17709h = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.foundation.gestures.a$g$a$b r0 = new androidx.compose.foundation.gestures.a$g$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f17707f
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f17709h
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f17706e
                    QJ.F0 r8 = (QJ.F0) r8
                    java.lang.Object r8 = r0.f17705d
                    java.lang.Object r0 = r0.f17704c
                    androidx.compose.foundation.gestures.a$g$a r0 = (androidx.compose.foundation.gestures.a.g.C0252a) r0
                    XH.y.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    XH.y.b(r9)
                    kotlin.jvm.internal.O<QJ.F0> r9 = r7.f17697a
                    T r9 = r9.f144348a
                    QJ.F0 r9 = (QJ.F0) r9
                    if (r9 == 0) goto L_0x005d
                    p0.a r2 = new p0.a
                    r2.<init>()
                    r9.i(r2)
                    r0.f17704c = r7
                    r0.f17705d = r8
                    r0.f17706e = r9
                    r0.f17709h = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.O<QJ.F0> r9 = r0.f17697a
                    QJ.Q r1 = r0.f17698b
                    QJ.T r3 = QJ.T.UNDISPATCHED
                    androidx.compose.foundation.gestures.a$g$a$a r4 = new androidx.compose.foundation.gestures.a$g$a$a
                    nI.p<I, dI.e<? super XH.N>, java.lang.Object> r0 = r0.f17699c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    QJ.F0 r8 = QJ.C16314k.d(r1, r2, r3, r4, r5, r6)
                    r9.f144348a = r8
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.g.C0252a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17631a<? extends I> aVar, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f17695e = aVar;
            this.f17696f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f17695e, this.f17696f, eVar);
            gVar.f17694d = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17693c;
            if (i10 == 0) {
                y.b(obj);
                O o10 = new O();
                C16532g<T> r10 = p1.r(this.f17695e);
                C0252a aVar = new C0252a(o10, (Q) this.f17694d, this.f17696f);
                this.f17693c = 1;
                if (r10.collect(aVar, this) == f10) {
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

    public static final <T> o<T> a(C17642l<? super p0.p<T>, C16807N> lVar) {
        p0.p pVar = new p0.p();
        lVar.invoke(pVar);
        return new f(pVar.b());
    }

    public static final <T> androidx.compose.ui.d i(androidx.compose.ui.d dVar, C5685c<T> cVar, v vVar, boolean z10, m mVar, T t10, boolean z11) {
        return dVar.s(new AnchoredDraggableElement(cVar, vVar, z10, (Boolean) null, mVar, z11, t10));
    }

    public static /* synthetic */ androidx.compose.ui.d j(androidx.compose.ui.d dVar, C5685c cVar, v vVar, boolean z10, m mVar, T t10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        m mVar2 = (i10 & 8) != 0 ? null : mVar;
        T t11 = (i10 & 16) != 0 ? null : t10;
        if ((i10 & 32) != 0) {
            z11 = cVar.x();
        }
        return i(dVar, cVar, vVar, z12, mVar2, t11, z11);
    }

    /* access modifiers changed from: private */
    public static final <T> Object k(C5685c<T> cVar, float f10, C5684b bVar, o<T> oVar, T t10, C17164e<? super C16807N> eVar) {
        Object b10;
        float f11 = oVar.f(t10);
        L l10 = new L();
        l10.f144345a = Float.isNaN(cVar.t()) ? 0.0f : cVar.t();
        if (!Float.isNaN(f11)) {
            float f12 = l10.f144345a;
            if (f12 != f11 && (b10 = t0.b(f12, f11, f10, cVar.v(), new b(bVar, l10), eVar)) == C17187b.f()) {
                return b10;
            }
        }
        return C16807N.f139792a;
    }

    public static final <T> Object l(C5685c<T> cVar, T t10, C17164e<? super C16807N> eVar) {
        Object j10 = C5685c.j(cVar, t10, (C5589L) null, new c(cVar, (C17164e<? super c>) null), eVar, 2, (Object) null);
        return j10 == C17187b.f() ? j10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m(p0.C5685c<T> r8, T r9, float r10, dI.C17164e<? super java.lang.Float> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.a.d
            if (r0 == 0) goto L_0x0014
            r0 = r11
            androidx.compose.foundation.gestures.a$d r0 = (androidx.compose.foundation.gestures.a.d) r0
            int r1 = r0.f17679f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f17679f = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.foundation.gestures.a$d r0 = new androidx.compose.foundation.gestures.a$d
            r0.<init>(r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r11 = r5.f17678e
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r5.f17679f
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            float r10 = r5.f17676c
            java.lang.Object r8 = r5.f17677d
            kotlin.jvm.internal.L r8 = (kotlin.jvm.internal.L) r8
            XH.y.b(r11)
            goto L_0x005c
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            XH.y.b(r11)
            kotlin.jvm.internal.L r11 = new kotlin.jvm.internal.L
            r11.<init>()
            r11.f144345a = r10
            androidx.compose.foundation.gestures.a$e r4 = new androidx.compose.foundation.gestures.a$e
            r1 = 0
            r4.<init>(r8, r10, r11, r1)
            r5.f17677d = r11
            r5.f17676c = r10
            r5.f17679f = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r8 = p0.C5685c.j(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r8 = r11
        L_0x005c:
            float r8 = r8.f144345a
            float r10 = r10 - r8
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.d(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.m(p0.c, java.lang.Object, float, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final float n(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? C17978n.h(f10, f11) : C17978n.d(f10, f11);
    }

    /* access modifiers changed from: private */
    public static final <T> f<T> o() {
        return new f<>(new J(0, 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final <K> float p(P<K> p10) {
        if (p10.g() == 1) {
            return Float.NaN;
        }
        float[] fArr = p10.f24548c;
        long[] jArr = p10.f24546a;
        int length = jArr.length - 2;
        float f10 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 >= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final <K> float q(P<K> p10) {
        if (p10.g() == 1) {
            return Float.NaN;
        }
        float[] fArr = p10.f24548c;
        long[] jArr = p10.f24546a;
        int length = jArr.length - 2;
        float f10 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 <= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <I> java.lang.Object r(nI.C17631a<? extends I> r4, nI.p<? super I, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.a.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.a$f r0 = (androidx.compose.foundation.gestures.a.f) r0
            int r1 = r0.f17692d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17692d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.a$f r0 = new androidx.compose.foundation.gestures.a$f
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f17691c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17692d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r6)     // Catch:{ a -> 0x0043 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            XH.y.b(r6)
            androidx.compose.foundation.gestures.a$g r6 = new androidx.compose.foundation.gestures.a$g     // Catch:{ a -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ a -> 0x0043 }
            r0.f17692d = r3     // Catch:{ a -> 0x0043 }
            java.lang.Object r4 = QJ.S.f(r6, r0)     // Catch:{ a -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.r(nI.a, nI.p, dI.e):java.lang.Object");
    }
}
