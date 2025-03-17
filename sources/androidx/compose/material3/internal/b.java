package androidx.compose.material3.internal;

import Q0.C4794c;
import Q0.C4796e;
import Q0.g;
import Q0.h;
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

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0015\u001a\u00028\u0000H@¢\u0006\u0004\b\u0016\u0010\u0017\u001a2\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0015\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001fH@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001a[\u0010+\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2*\u0010*\u001a&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000)0\u001fH\u0000¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"", "T", "Lkotlin/Function1;", "LQ0/h;", "LXH/N;", "builder", "LQ0/g;", "a", "(LnI/l;)LQ0/g;", "Landroidx/compose/ui/d;", "LQ0/e;", "state", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "d", "(Landroidx/compose/ui/d;LQ0/e;Lp0/v;ZZLr0/m;)Landroidx/compose/ui/d;", "targetValue", "k", "(LQ0/e;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "velocity", "f", "(LQ0/e;Ljava/lang/Object;FLdI/e;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "LdI/e;", "block", "j", "(LnI/a;LnI/p;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/material3/internal/d;", "i", "()Landroidx/compose/material3/internal/d;", "Lc2/r;", "Lc2/b;", "LXH/v;", "anchors", "h", "(Landroidx/compose/ui/d;LQ0/e;Lp0/v;LnI/p;)Landroidx/compose/ui/d;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18692c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18693d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ float f18694e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f18695f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {177}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.b$a$a  reason: collision with other inner class name */
        static final class C0285a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f18696c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f18697d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f18698e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0285a(C4796e<T> eVar, float f10, C17164e<? super C0285a> eVar2) {
                super(2, eVar2);
                this.f18697d = eVar;
                this.f18698e = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0285a(this.f18697d, this.f18698e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0285a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f18696c;
                if (i10 == 0) {
                    y.b(obj);
                    C4796e<T> eVar = this.f18697d;
                    float f11 = this.f18698e;
                    this.f18696c = 1;
                    if (eVar.G(f11, this) == f10) {
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
        a(C4796e<T> eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f18695f = eVar;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f18695f, eVar);
            aVar.f18693d = q10;
            aVar.f18694e = f10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f18692c == 0) {
                y.b(obj);
                F0 unused = C16314k.d((Q) this.f18693d, (C17168i) null, (T) null, new C0285a(this.f18695f, this.f18694e, (C17164e<? super C0285a>) null), 3, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, d2 = {"T", "LQ0/c;", "LQ0/g;", "anchors", "latestTarget", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.b$b  reason: collision with other inner class name */
    static final class C0286b extends l implements r<C4794c, g<T>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18699c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18700d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f18701e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f18702f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f18703g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f18704h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.internal.b$b$a */
        static final class a extends C17544u implements p<Float, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4794c f18705c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f18706d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4794c cVar, L l10) {
                super(2);
                this.f18705c = cVar;
                this.f18706d = l10;
            }

            public final void a(float f10, float f11) {
                this.f18705c.a(f10, f11);
                this.f18706d.f144345a = f10;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0286b(C4796e<T> eVar, float f10, C17164e<? super C0286b> eVar2) {
            super(4, eVar2);
            this.f18703g = eVar;
            this.f18704h = f10;
        }

        /* renamed from: i */
        public final Object l(C4794c cVar, g<T> gVar, T t10, C17164e<? super C16807N> eVar) {
            C0286b bVar = new C0286b(this.f18703g, this.f18704h, eVar);
            bVar.f18700d = cVar;
            bVar.f18701e = gVar;
            bVar.f18702f = t10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18699c;
            if (i10 == 0) {
                y.b(obj);
                C4794c cVar = (C4794c) this.f18700d;
                float f11 = ((g) this.f18701e).f(this.f18702f);
                if (!Float.isNaN(f11)) {
                    L l10 = new L();
                    float w10 = Float.isNaN(this.f18703g.w()) ? 0.0f : this.f18703g.w();
                    l10.f144345a = w10;
                    float f12 = this.f18704h;
                    C5546i<Float> p10 = this.f18703g.p();
                    a aVar = new a(cVar, l10);
                    this.f18700d = null;
                    this.f18701e = null;
                    this.f18699c = 1;
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
    @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f18707c;

        /* renamed from: d  reason: collision with root package name */
        int f18708d;

        c(C17164e<? super c> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f18707c = obj;
            this.f18708d |= Integer.MIN_VALUE;
            return b.j((C17631a) null, (p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18709c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<I> f18711e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18712f;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O<F0> f18713a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f18714b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18715c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.b$d$a$a  reason: collision with other inner class name */
            static final class C0287a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f18716c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<I, C17164e<? super C16807N>, Object> f18717d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ I f18718e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Q f18719f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0287a(p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, I i10, Q q10, C17164e<? super C0287a> eVar) {
                    super(2, eVar);
                    this.f18717d = pVar;
                    this.f18718e = i10;
                    this.f18719f = q10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0287a(this.f18717d, this.f18718e, this.f18719f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0287a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f18716c;
                    if (i10 == 0) {
                        y.b(obj);
                        p<I, C17164e<? super C16807N>, Object> pVar = this.f18717d;
                        I i11 = this.f18718e;
                        this.f18716c = 1;
                        if (pVar.invoke(i11, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S.d(this.f18719f, new a());
                    return C16807N.f139792a;
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {718}, m = "emit")
            /* renamed from: androidx.compose.material3.internal.b$d$a$b  reason: collision with other inner class name */
            static final class C0288b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f18720c;

                /* renamed from: d  reason: collision with root package name */
                Object f18721d;

                /* renamed from: e  reason: collision with root package name */
                Object f18722e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f18723f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ a<T> f18724g;

                /* renamed from: h  reason: collision with root package name */
                int f18725h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0288b(a<? super T> aVar, C17164e<? super C0288b> eVar) {
                    super(eVar);
                    this.f18724g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f18723f = obj;
                    this.f18725h |= Integer.MIN_VALUE;
                    return this.f18724g.emit(null, this);
                }
            }

            a(O<F0> o10, Q q10, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
                this.f18713a = o10;
                this.f18714b = q10;
                this.f18715c = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(I r8, dI.C17164e<? super XH.C16807N> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material3.internal.b.d.a.C0288b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.compose.material3.internal.b$d$a$b r0 = (androidx.compose.material3.internal.b.d.a.C0288b) r0
                    int r1 = r0.f18725h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f18725h = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material3.internal.b$d$a$b r0 = new androidx.compose.material3.internal.b$d$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f18723f
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f18725h
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f18722e
                    QJ.F0 r8 = (QJ.F0) r8
                    java.lang.Object r8 = r0.f18721d
                    java.lang.Object r0 = r0.f18720c
                    androidx.compose.material3.internal.b$d$a r0 = (androidx.compose.material3.internal.b.d.a) r0
                    XH.y.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    XH.y.b(r9)
                    kotlin.jvm.internal.O<QJ.F0> r9 = r7.f18713a
                    T r9 = r9.f144348a
                    QJ.F0 r9 = (QJ.F0) r9
                    if (r9 == 0) goto L_0x005d
                    androidx.compose.material3.internal.a r2 = new androidx.compose.material3.internal.a
                    r2.<init>()
                    r9.i(r2)
                    r0.f18720c = r7
                    r0.f18721d = r8
                    r0.f18722e = r9
                    r0.f18725h = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.O<QJ.F0> r9 = r0.f18713a
                    QJ.Q r1 = r0.f18714b
                    QJ.T r3 = QJ.T.UNDISPATCHED
                    androidx.compose.material3.internal.b$d$a$a r4 = new androidx.compose.material3.internal.b$d$a$a
                    nI.p<I, dI.e<? super XH.N>, java.lang.Object> r0 = r0.f18715c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    QJ.F0 r8 = QJ.C16314k.d(r1, r2, r3, r4, r5, r6)
                    r9.f144348a = r8
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17631a<? extends I> aVar, p<? super I, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f18711e = aVar;
            this.f18712f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f18711e, this.f18712f, eVar);
            dVar.f18710d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f18709c;
            if (i10 == 0) {
                y.b(obj);
                O o10 = new O();
                C16532g<T> r10 = p1.r(this.f18711e);
                a aVar = new a(o10, (Q) this.f18710d, this.f18712f);
                this.f18709c = 1;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, d2 = {"T", "LQ0/c;", "LQ0/g;", "anchors", "latestTarget", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements r<C4794c, g<T>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18726c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18727d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f18728e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f18729f;

        e(C17164e<? super e> eVar) {
            super(4, eVar);
        }

        /* renamed from: i */
        public final Object l(C4794c cVar, g<T> gVar, T t10, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f18727d = cVar;
            eVar2.f18728e = gVar;
            eVar2.f18729f = t10;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f18726c == 0) {
                y.b(obj);
                C4794c cVar = (C4794c) this.f18727d;
                float f10 = ((g) this.f18728e).f(this.f18729f);
                if (!Float.isNaN(f10)) {
                    C4794c.b(cVar, f10, 0.0f, 2, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> g<T> a(C17642l<? super h<T>, C16807N> lVar) {
        h hVar = new h();
        lVar.invoke(hVar);
        return new d(hVar.b());
    }

    public static final <T> androidx.compose.ui.d d(androidx.compose.ui.d dVar, C4796e<T> eVar, v vVar, boolean z10, boolean z11, m mVar) {
        C4796e<T> eVar2 = eVar;
        return p0.q.h(dVar, eVar.u(), vVar, z10, mVar, eVar.y(), (q) null, new a(eVar, (C17164e<? super a>) null), z11, 32, (Object) null);
    }

    public static /* synthetic */ androidx.compose.ui.d e(androidx.compose.ui.d dVar, C4796e eVar, v vVar, boolean z10, boolean z11, m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        return d(dVar, eVar, vVar, z12, z13, mVar);
    }

    public static final <T> Object f(C4796e<T> eVar, T t10, float f10, C17164e<? super C16807N> eVar2) {
        Object k10 = C4796e.k(eVar, t10, (C5589L) null, new C0286b(eVar, f10, (C17164e<? super C0286b>) null), eVar2, 2, (Object) null);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object g(C4796e eVar, Object obj, float f10, C17164e eVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = eVar.v();
        }
        return f(eVar, obj, f10, eVar2);
    }

    public static final <T> androidx.compose.ui.d h(androidx.compose.ui.d dVar, C4796e<T> eVar, v vVar, p<? super c2.r, ? super C5267b, ? extends XH.v<? extends g<T>, ? extends T>> pVar) {
        return dVar.s(new DraggableAnchorsElement(eVar, pVar, vVar));
    }

    /* access modifiers changed from: private */
    public static final <T> d<T> i() {
        return new d<>(X.j());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <I> java.lang.Object j(nI.C17631a<? extends I> r4, nI.p<? super I, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material3.internal.b$c r0 = (androidx.compose.material3.internal.b.c) r0
            int r1 = r0.f18708d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18708d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.internal.b$c r0 = new androidx.compose.material3.internal.b$c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18707c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f18708d
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
            androidx.compose.material3.internal.b$d r6 = new androidx.compose.material3.internal.b$d     // Catch:{ a -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ a -> 0x0043 }
            r0.f18708d = r3     // Catch:{ a -> 0x0043 }
            java.lang.Object r4 = QJ.S.f(r6, r0)     // Catch:{ a -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.b.j(nI.a, nI.p, dI.e):java.lang.Object");
    }

    public static final <T> Object k(C4796e<T> eVar, T t10, C17164e<? super C16807N> eVar2) {
        Object k10 = C4796e.k(eVar, t10, (C5589L) null, new e((C17164e<? super e>) null), eVar2, 2, (Object) null);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }
}
