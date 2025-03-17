package androidx.compose.material;

import I0.C;
import I0.C4548b;
import I0.C4550c;
import I0.C4552d;
import I0.D;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import U0.p1;
import XH.C16807N;
import XH.y;
import YH.X;
import c2.C5267b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.O;
import m0.C5546i;
import m0.t0;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u0019\u0010\u001a\u001aH\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001eH@¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b$\u0010%\u001a[\u0010*\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2*\u0010)\u001a&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000(0\u001eH\u0001¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "T", "Lkotlin/Function1;", "LI0/D;", "LXH/N;", "builder", "LI0/C;", "a", "(LnI/l;)LI0/C;", "Landroidx/compose/ui/d;", "LI0/d;", "state", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "startDragImmediately", "d", "(Landroidx/compose/ui/d;LI0/d;Lp0/v;ZZLr0/m;Z)Landroidx/compose/ui/d;", "targetValue", "", "velocity", "f", "(LI0/d;Ljava/lang/Object;FLdI/e;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "LdI/e;", "block", "j", "(LnI/a;LnI/p;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/material/c;", "i", "()Landroidx/compose/material/c;", "Lc2/r;", "Lc2/b;", "LXH/v;", "anchors", "h", "(Landroidx/compose/ui/d;LI0/d;Lp0/v;LnI/p;)Landroidx/compose/ui/d;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.a$a  reason: collision with other inner class name */
    static final class C0274a extends l implements q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18578c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18579d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ float f18580e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f18581f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {186}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.a$a$a  reason: collision with other inner class name */
        static final class C0275a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f18582c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f18583d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f18584e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0275a(C4552d<T> dVar, float f10, C17164e<? super C0275a> eVar) {
                super(2, eVar);
                this.f18583d = dVar;
                this.f18584e = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0275a(this.f18583d, this.f18584e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0275a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f18582c;
                if (i10 == 0) {
                    y.b(obj);
                    C4552d<T> dVar = this.f18583d;
                    float f11 = this.f18584e;
                    this.f18582c = 1;
                    if (dVar.G(f11, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0274a(C4552d<T> dVar, C17164e<? super C0274a> eVar) {
            super(3, eVar);
            this.f18581f = dVar;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            C0274a aVar = new C0274a(this.f18581f, eVar);
            aVar.f18579d = q10;
            aVar.f18580e = f10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f18578c == 0) {
                y.b(obj);
                F0 unused = C16314k.d((Q) this.f18579d, (C17168i) null, (T) null, new C0275a(this.f18581f, this.f18580e, (C17164e<? super C0275a>) null), 3, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, d2 = {"T", "LI0/c;", "LI0/C;", "anchors", "latestTarget", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {706}, m = "invokeSuspend")
    static final class b extends l implements r<C4550c, C<T>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18585c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18586d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f18587e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f18588f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f18589g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f18590h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.a$b$a  reason: collision with other inner class name */
        static final class C0276a extends C17544u implements p<Float, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4550c f18591c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f18592d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0276a(C4550c cVar, L l10) {
                super(2);
                this.f18591c = cVar;
                this.f18592d = l10;
            }

            public final void a(float f10, float f11) {
                this.f18591c.a(f10, f11);
                this.f18592d.f144345a = f10;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4552d<T> dVar, float f10, C17164e<? super b> eVar) {
            super(4, eVar);
            this.f18589g = dVar;
            this.f18590h = f10;
        }

        /* renamed from: i */
        public final Object l(C4550c cVar, C<T> c10, T t10, C17164e<? super C16807N> eVar) {
            b bVar = new b(this.f18589g, this.f18590h, eVar);
            bVar.f18586d = cVar;
            bVar.f18587e = c10;
            bVar.f18588f = t10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18585c;
            if (i10 == 0) {
                y.b(obj);
                C4550c cVar = (C4550c) this.f18586d;
                float f11 = ((C) this.f18587e).f(this.f18588f);
                if (!Float.isNaN(f11)) {
                    L l10 = new L();
                    float w10 = Float.isNaN(this.f18589g.w()) ? 0.0f : this.f18589g.w();
                    l10.f144345a = w10;
                    float f12 = this.f18590h;
                    C5546i<Float> p10 = this.f18589g.p();
                    C0276a aVar = new C0276a(cVar, l10);
                    this.f18586d = null;
                    this.f18587e = null;
                    this.f18585c = 1;
                    if (t0.b(w10, f11, f12, p10, aVar, this) == f10) {
                        return f10;
                    }
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
    @f(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {737}, m = "restartable")
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f18593c;

        /* renamed from: d  reason: collision with root package name */
        int f18594d;

        c(C17164e<? super c> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f18593c = obj;
            this.f18594d |= Integer.MIN_VALUE;
            return a.j((C17631a) null, (p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {740}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18595c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18596d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<I> f18597e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18598f;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.a$d$a  reason: collision with other inner class name */
        static final class C0277a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O<F0> f18599a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f18600b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18601c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {746}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.a$d$a$a  reason: collision with other inner class name */
            static final class C0278a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f18602c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18603d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ I f18604e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Q f18605f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0278a(p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, I i10, Q q10, C17164e<? super C0278a> eVar) {
                    super(2, eVar);
                    this.f18603d = pVar;
                    this.f18604e = i10;
                    this.f18605f = q10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0278a(this.f18603d, this.f18604e, this.f18605f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0278a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f18602c;
                    if (i10 == 0) {
                        y.b(obj);
                        p<I, C17164e<? super C16807N>, Object> pVar = this.f18603d;
                        I i11 = this.f18604e;
                        this.f18602c = 1;
                        if (pVar.invoke(i11, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S.d(this.f18605f, new C4548b());
                    return C16807N.f139792a;
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {743}, m = "emit")
            /* renamed from: androidx.compose.material.a$d$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f18606c;

                /* renamed from: d  reason: collision with root package name */
                Object f18607d;

                /* renamed from: e  reason: collision with root package name */
                Object f18608e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f18609f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C0277a<T> f18610g;

                /* renamed from: h  reason: collision with root package name */
                int f18611h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0277a<? super T> aVar, C17164e<? super b> eVar) {
                    super(eVar);
                    this.f18610g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f18609f = obj;
                    this.f18611h |= Integer.MIN_VALUE;
                    return this.f18610g.emit(null, this);
                }
            }

            C0277a(O<F0> o10, Q q10, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
                this.f18599a = o10;
                this.f18600b = q10;
                this.f18601c = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(I r8, dI.C17164e<? super XH.C16807N> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material.a.d.C0277a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.compose.material.a$d$a$b r0 = (androidx.compose.material.a.d.C0277a.b) r0
                    int r1 = r0.f18611h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f18611h = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material.a$d$a$b r0 = new androidx.compose.material.a$d$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f18609f
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f18611h
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f18608e
                    QJ.F0 r8 = (QJ.F0) r8
                    java.lang.Object r8 = r0.f18607d
                    java.lang.Object r0 = r0.f18606c
                    androidx.compose.material.a$d$a r0 = (androidx.compose.material.a.d.C0277a) r0
                    XH.y.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    XH.y.b(r9)
                    kotlin.jvm.internal.O<QJ.F0> r9 = r7.f18599a
                    T r9 = r9.f144348a
                    QJ.F0 r9 = (QJ.F0) r9
                    if (r9 == 0) goto L_0x005d
                    I0.b r2 = new I0.b
                    r2.<init>()
                    r9.i(r2)
                    r0.f18606c = r7
                    r0.f18607d = r8
                    r0.f18608e = r9
                    r0.f18611h = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.O<QJ.F0> r9 = r0.f18599a
                    QJ.Q r1 = r0.f18600b
                    QJ.T r3 = QJ.T.UNDISPATCHED
                    androidx.compose.material.a$d$a$a r4 = new androidx.compose.material.a$d$a$a
                    nI.p<I, dI.e<? super XH.N>, java.lang.Object> r0 = r0.f18601c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    QJ.F0 r8 = QJ.C16314k.d(r1, r2, r3, r4, r5, r6)
                    r9.f144348a = r8
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.d.C0277a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17631a<? extends I> aVar, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f18597e = aVar;
            this.f18598f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f18597e, this.f18598f, eVar);
            dVar.f18596d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18595c;
            if (i10 == 0) {
                y.b(obj);
                O o10 = new O();
                C16532g<T> r10 = p1.r(this.f18597e);
                C0277a aVar = new C0277a(o10, (Q) this.f18596d, this.f18598f);
                this.f18595c = 1;
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

    public static final <T> C<T> a(C17642l<? super D<T>, C16807N> lVar) {
        D d10 = new D();
        lVar.invoke(d10);
        return new c(d10.b());
    }

    public static final <T> androidx.compose.ui.d d(androidx.compose.ui.d dVar, C4552d<T> dVar2, v vVar, boolean z10, boolean z11, m mVar, boolean z12) {
        C4552d<T> dVar3 = dVar2;
        return p0.q.h(dVar, dVar2.u(), vVar, z10, mVar, z12, (q) null, new C0274a(dVar2, (C17164e<? super C0274a>) null), z11, 32, (Object) null);
    }

    public static /* synthetic */ androidx.compose.ui.d e(androidx.compose.ui.d dVar, C4552d dVar2, v vVar, boolean z10, boolean z11, m mVar, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        m mVar2 = mVar;
        if ((i10 & 32) != 0) {
            z12 = dVar2.y();
        }
        return d(dVar, dVar2, vVar, z13, z14, mVar2, z12);
    }

    public static final <T> Object f(C4552d<T> dVar, T t10, float f10, C17164e<? super C16807N> eVar) {
        Object k10 = C4552d.k(dVar, t10, (C5589L) null, new b(dVar, f10, (C17164e<? super b>) null), eVar, 2, (Object) null);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object g(C4552d dVar, Object obj, float f10, C17164e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = dVar.v();
        }
        return f(dVar, obj, f10, eVar);
    }

    public static final <T> androidx.compose.ui.d h(androidx.compose.ui.d dVar, C4552d<T> dVar2, v vVar, p<? super c2.r, ? super C5267b, ? extends XH.v<? extends C<T>, ? extends T>> pVar) {
        return dVar.s(new DraggableAnchorsElement(dVar2, pVar, vVar));
    }

    /* access modifiers changed from: private */
    public static final <T> c<T> i() {
        return new c<>(X.j());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <I> java.lang.Object j(nI.C17631a<? extends I> r4, nI.p<? super I, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material.a$c r0 = (androidx.compose.material.a.c) r0
            int r1 = r0.f18594d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18594d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.a$c r0 = new androidx.compose.material.a$c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18593c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f18594d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r6)     // Catch:{ b -> 0x0043 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            XH.y.b(r6)
            androidx.compose.material.a$d r6 = new androidx.compose.material.a$d     // Catch:{ b -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ b -> 0x0043 }
            r0.f18594d = r3     // Catch:{ b -> 0x0043 }
            java.lang.Object r4 = QJ.S.f(r6, r0)     // Catch:{ b -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.j(nI.a, nI.p, dI.e):java.lang.Object");
    }
}
