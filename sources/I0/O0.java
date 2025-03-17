package I0;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import XH.C16807N;
import XH.y;
import YH.X;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\t\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0001\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0002¢\u0006\u0004\b\"\u0010#\u001aW\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a/\u0010(\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"", "T", "initialValue", "Lm0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "LI0/P0;", "g", "(Ljava/lang/Object;Lm0/i;LnI/l;LU0/m;II)LI0/P0;", "Landroidx/compose/ui/d;", "state", "", "anchors", "Lp0/v;", "orientation", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "Lkotlin/Function2;", "LI0/c1;", "thresholds", "LI0/s0;", "resistance", "Lc2/h;", "velocityThreshold", "h", "(Landroidx/compose/ui/d;LI0/P0;Ljava/util/Map;Lp0/v;ZZLr0/m;LnI/p;LI0/s0;F)Landroidx/compose/ui/d;", "offset", "", "", "e", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "d", "(FFLjava/util/Set;LnI/p;FF)F", "f", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements C17642l<T, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7403c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LI0/P0;", "b", "()LI0/P0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<P0<T>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f7404c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f7405d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, Boolean> f7406e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(T t10, C5546i<Float> iVar, C17642l<? super T, Boolean> lVar) {
            super(0);
            this.f7404c = t10;
            this.f7405d = iVar;
            this.f7406e = lVar;
        }

        /* renamed from: b */
        public final P0<T> invoke() {
            return new P0<>(this.f7404c, this.f7405d, this.f7406e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "<anonymous parameter 0>", "<anonymous parameter 1>", "LI0/S;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)LI0/S;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p {

        /* renamed from: c  reason: collision with root package name */
        public static final c f7407c = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final S invoke(Object obj, Object obj2) {
            return new S(h.B((float) 56), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<Float, T> f7408c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ P0<T> f7409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4582s0 f7410e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<T, T, c1> f7411f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7412g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7413h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f7414i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ m f7415j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f7416k;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {617}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7417c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ P0<T> f7418d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Map<Float, T> f7419e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4582s0 f7420f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c2.d f7421g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p<T, T, c1> f7422h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ float f7423i;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0004"}, d2 = {"T", "", "a", "b", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I0.O0$d$a$a  reason: collision with other inner class name */
            static final class C0096a extends C17544u implements p<Float, Float, Float> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Map<Float, T> f7424c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<T, T, c1> f7425d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ c2.d f7426e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0096a(Map<Float, ? extends T> map, p<? super T, ? super T, ? extends c1> pVar, c2.d dVar) {
                    super(2);
                    this.f7424c = map;
                    this.f7425d = pVar;
                    this.f7426e = dVar;
                }

                public final Float a(float f10, float f11) {
                    return Float.valueOf(this.f7425d.invoke(X.k(this.f7424c, Float.valueOf(f10)), X.k(this.f7424c, Float.valueOf(f11))).a(this.f7426e, f10, f11));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(P0<T> p02, Map<Float, ? extends T> map, C4582s0 s0Var, c2.d dVar, p<? super T, ? super T, ? extends c1> pVar, float f10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f7418d = p02;
                this.f7419e = map;
                this.f7420f = s0Var;
                this.f7421g = dVar;
                this.f7422h = pVar;
                this.f7423i = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f7418d, this.f7419e, this.f7420f, this.f7421g, this.f7422h, this.f7423i, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f7417c;
                if (i10 == 0) {
                    y.b(obj);
                    Map<Float, T> l10 = this.f7418d.l();
                    this.f7418d.B(this.f7419e);
                    this.f7418d.E(this.f7420f);
                    this.f7418d.F(new C0096a(this.f7419e, this.f7422h, this.f7421g));
                    this.f7418d.G(this.f7421g.H1(this.f7423i));
                    P0<T> p02 = this.f7418d;
                    Map<Float, T> map = this.f7419e;
                    this.f7417c = 1;
                    if (p02.A(l10, map, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
        static final class b extends l implements q<Q, Float, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7427c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f7428d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ float f7429e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ P0<T> f7430f;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", l = {626}, m = "invokeSuspend")
            static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f7431c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ P0<T> f7432d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ float f7433e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(P0<T> p02, float f10, C17164e<? super a> eVar) {
                    super(2, eVar);
                    this.f7432d = p02;
                    this.f7433e = f10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new a(this.f7432d, this.f7433e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f7431c;
                    if (i10 == 0) {
                        y.b(obj);
                        P0<T> p02 = this.f7432d;
                        float f11 = this.f7433e;
                        this.f7431c = 1;
                        if (p02.z(f11, this) == f10) {
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
            b(P0<T> p02, C17164e<? super b> eVar) {
                super(3, eVar);
                this.f7430f = p02;
            }

            public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
                b bVar = new b(this.f7430f, eVar);
                bVar.f7428d = q10;
                bVar.f7429e = f10;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f7427c == 0) {
                    y.b(obj);
                    F0 unused = C16314k.d((Q) this.f7428d, (C17168i) null, (T) null, new a(this.f7430f, this.f7429e, (C17164e<? super a>) null), 3, (Object) null);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Map<Float, ? extends T> map, P0<T> p02, C4582s0 s0Var, p<? super T, ? super T, ? extends c1> pVar, float f10, v vVar, boolean z10, m mVar, boolean z11) {
            super(3);
            this.f7408c = map;
            this.f7409d = p02;
            this.f7410e = s0Var;
            this.f7411f = pVar;
            this.f7412g = f10;
            this.f7413h = vVar;
            this.f7414i = z10;
            this.f7415j = mVar;
            this.f7416k = z11;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: nI.q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.compose.ui.d a(androidx.compose.ui.d r24, U0.C4889m r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                r2 = 43594985(0x29934e9, float:2.2511698E-37)
                r1.W(r2)
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0018
                r3 = -1
                java.lang.String r4 = "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:596)"
                r5 = r26
                U0.C4895p.S(r2, r5, r3, r4)
            L_0x0018:
                java.util.Map<java.lang.Float, T> r2 = r0.f7408c
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x00fc
                java.util.Map<java.lang.Float, T> r2 = r0.f7408c
                java.util.Collection r2 = r2.values()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.List r2 = YH.C16877v.m0(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                int r2 = r2.size()
                java.util.Map<java.lang.Float, T> r3 = r0.f7408c
                int r3 = r3.size()
                if (r2 != r3) goto L_0x00f4
                U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r2 = r1.Q(r2)
                r7 = r2
                c2.d r7 = (c2.d) r7
                I0.P0<T> r2 = r0.f7409d
                java.util.Map<java.lang.Float, T> r3 = r0.f7408c
                r2.k(r3)
                java.util.Map<java.lang.Float, T> r2 = r0.f7408c
                I0.P0<T> r11 = r0.f7409d
                I0.P0<T> r3 = r0.f7409d
                boolean r3 = r1.V(r3)
                java.util.Map<java.lang.Float, T> r4 = r0.f7408c
                boolean r4 = r1.F(r4)
                r3 = r3 | r4
                I0.s0 r4 = r0.f7410e
                boolean r4 = r1.V(r4)
                r3 = r3 | r4
                nI.p<T, T, I0.c1> r4 = r0.f7411f
                boolean r4 = r1.V(r4)
                r3 = r3 | r4
                boolean r4 = r1.V(r7)
                r3 = r3 | r4
                float r4 = r0.f7412g
                boolean r4 = r1.c(r4)
                r3 = r3 | r4
                I0.P0<T> r4 = r0.f7409d
                java.util.Map<java.lang.Float, T> r5 = r0.f7408c
                I0.s0 r6 = r0.f7410e
                nI.p<T, T, I0.c1> r8 = r0.f7411f
                float r9 = r0.f7412g
                java.lang.Object r10 = r25.D()
                if (r3 != 0) goto L_0x008f
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r10 != r3) goto L_0x009a
            L_0x008f:
                I0.O0$d$a r12 = new I0.O0$d$a
                r10 = 0
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r1.u(r12)
                r10 = r12
            L_0x009a:
                nI.p r10 = (nI.p) r10
                r3 = 0
                U0.P.f(r2, r11, r10, r1, r3)
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                I0.P0<T> r2 = r0.f7409d
                boolean r17 = r2.y()
                I0.P0<T> r2 = r0.f7409d
                p0.r r13 = r2.q()
                p0.v r14 = r0.f7413h
                boolean r15 = r0.f7414i
                r0.m r2 = r0.f7415j
                I0.P0<T> r3 = r0.f7409d
                boolean r3 = r1.V(r3)
                I0.P0<T> r4 = r0.f7409d
                java.lang.Object r5 = r25.D()
                if (r3 != 0) goto L_0x00ca
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x00d3
            L_0x00ca:
                I0.O0$d$b r5 = new I0.O0$d$b
                r3 = 0
                r5.<init>(r4, r3)
                r1.u(r5)
            L_0x00d3:
                r19 = r5
                nI.q r19 = (nI.q) r19
                boolean r3 = r0.f7416k
                r21 = 32
                r22 = 0
                r18 = 0
                r16 = r2
                r20 = r3
                androidx.compose.ui.d r2 = p0.q.h(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x00f0
                U0.C4895p.R()
            L_0x00f0:
                r25.P()
                return r2
            L_0x00f4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "You cannot have two anchors mapped to the same state."
                r1.<init>(r2)
                throw r1
            L_0x00fc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "You must have at least one anchor."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.O0.d.a(androidx.compose.ui.d, U0.m, int):androidx.compose.ui.d");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P0 f7434c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f7435d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f7436e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7437f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f7438g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f7439h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f7440i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4582s0 f7441j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f7442k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(P0 p02, Map map, v vVar, boolean z10, boolean z11, m mVar, p pVar, C4582s0 s0Var, float f10) {
            super(1);
            this.f7434c = p02;
            this.f7435d = map;
            this.f7436e = vVar;
            this.f7437f = z10;
            this.f7438g = z11;
            this.f7439h = mVar;
            this.f7440i = pVar;
            this.f7441j = s0Var;
            this.f7442k = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("swipeable");
            v0Var.a().c("state", this.f7434c);
            v0Var.a().c("anchors", this.f7435d);
            v0Var.a().c("orientation", this.f7436e);
            v0Var.a().c("enabled", Boolean.valueOf(this.f7437f));
            v0Var.a().c("reverseDirection", Boolean.valueOf(this.f7438g));
            v0Var.a().c("interactionSource", this.f7439h);
            v0Var.a().c("thresholds", this.f7440i);
            v0Var.a().c("resistance", this.f7441j);
            v0Var.a().c("velocityThreshold", h.m(this.f7442k));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float d(float r3, float r4, java.util.Set<java.lang.Float> r5, nI.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = e(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x006c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0062
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            return r5
        L_0x002b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x0042:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x006c
        L_0x0060:
            r4 = r0
            goto L_0x006c
        L_0x0062:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.O0.d(float, float, java.util.Set, nI.p, float, float):float");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Number} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.Float> e(float r13, java.util.Set<java.lang.Float> r14) {
        /*
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r14.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            double r5 = (double) r5
            double r7 = (double) r13
            double r7 = r7 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x000b
            r0.add(r2)
            goto L_0x000b
        L_0x002c:
            boolean r1 = r0.isEmpty()
            r2 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0037
            r1 = r5
            goto L_0x0061
        L_0x0037:
            java.lang.Object r1 = r0.get(r2)
            r7 = r1
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r8 = YH.C16877v.p(r0)
            if (r6 > r8) goto L_0x0061
            r9 = r6
        L_0x0049:
            java.lang.Object r10 = r0.get(r9)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r12 = java.lang.Float.compare(r7, r11)
            if (r12 >= 0) goto L_0x005c
            r1 = r10
            r7 = r11
        L_0x005c:
            if (r9 == r8) goto L_0x0061
            int r9 = r9 + 1
            goto L_0x0049
        L_0x0061:
            java.lang.Float r1 = (java.lang.Float) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x006c:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0088
            java.lang.Object r7 = r14.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            double r8 = (double) r8
            double r10 = (double) r13
            double r10 = r10 - r3
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x006c
            r0.add(r7)
            goto L_0x006c
        L_0x0088:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x008f
            goto L_0x00b9
        L_0x008f:
            java.lang.Object r13 = r0.get(r2)
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            int r2 = YH.C16877v.p(r0)
            if (r6 > r2) goto L_0x00b8
        L_0x00a0:
            java.lang.Object r3 = r0.get(r6)
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r5 = java.lang.Float.compare(r14, r4)
            if (r5 <= 0) goto L_0x00b3
            r13 = r3
            r14 = r4
        L_0x00b3:
            if (r6 == r2) goto L_0x00b8
            int r6 = r6 + 1
            goto L_0x00a0
        L_0x00b8:
            r5 = r13
        L_0x00b9:
            java.lang.Float r5 = (java.lang.Float) r5
            if (r1 != 0) goto L_0x00c2
            java.util.List r13 = YH.C16877v.r(r5)
            goto L_0x00dc
        L_0x00c2:
            if (r5 != 0) goto L_0x00c9
            java.util.List r13 = YH.C16877v.e(r1)
            goto L_0x00dc
        L_0x00c9:
            boolean r13 = kotlin.jvm.internal.C17542s.d(r1, r5)
            if (r13 == 0) goto L_0x00d4
            java.util.List r13 = YH.C16877v.e(r1)
            goto L_0x00dc
        L_0x00d4:
            java.lang.Float[] r13 = new java.lang.Float[]{r1, r5}
            java.util.List r13 = YH.C16877v.q(r13)
        L_0x00dc:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.O0.e(float, java.util.Set):java.util.List");
    }

    /* access modifiers changed from: private */
    public static final <T> Float f(Map<Float, ? extends T> map, T t10) {
        Object obj;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Map.Entry) obj).getValue(), t10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> I0.P0<T> g(T r8, m0.C5546i<java.lang.Float> r9, nI.C17642l<? super T, java.lang.Boolean> r10, U0.C4889m r11, int r12, int r13) {
        /*
            r0 = r13 & 2
            if (r0 == 0) goto L_0x000a
            I0.N0 r9 = I0.N0.f7396a
            m0.o0 r9 = r9.a()
        L_0x000a:
            r0 = 4
            r13 = r13 & r0
            if (r13 == 0) goto L_0x0010
            I0.O0$a r10 = I0.O0.a.f7403c
        L_0x0010:
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x001f
            r13 = -1
            java.lang.String r1 = "androidx.compose.material.rememberSwipeableState (Swipeable.kt:479)"
            r2 = -1237755169(0xffffffffb6395adf, float:-2.7620042E-6)
            U0.C4895p.S(r2, r12, r13, r1)
        L_0x001f:
            r13 = 0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            I0.P0$a r2 = I0.P0.f7445q
            f1.k r2 = r2.a(r9, r10)
            r3 = r12 & 14
            r3 = r3 ^ 6
            r4 = 1
            if (r3 <= r0) goto L_0x0035
            boolean r3 = r11.F(r8)
            if (r3 != 0) goto L_0x0039
        L_0x0035:
            r3 = r12 & 6
            if (r3 != r0) goto L_0x003b
        L_0x0039:
            r0 = r4
            goto L_0x003c
        L_0x003b:
            r0 = r13
        L_0x003c:
            boolean r3 = r11.F(r9)
            r0 = r0 | r3
            r3 = r12 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 <= r5) goto L_0x004f
            boolean r3 = r11.V(r10)
            if (r3 != 0) goto L_0x0053
        L_0x004f:
            r12 = r12 & 384(0x180, float:5.38E-43)
            if (r12 != r5) goto L_0x0054
        L_0x0053:
            r13 = r4
        L_0x0054:
            r12 = r0 | r13
            java.lang.Object r13 = r11.D()
            if (r12 != 0) goto L_0x0064
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x006c
        L_0x0064:
            I0.O0$b r13 = new I0.O0$b
            r13.<init>(r8, r9, r10)
            r11.u(r13)
        L_0x006c:
            r4 = r13
            nI.a r4 = (nI.C17631a) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r11
            java.lang.Object r8 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            I0.P0 r8 = (I0.P0) r8
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0082
            U0.C4895p.R()
        L_0x0082:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.O0.g(java.lang.Object, m0.i, nI.l, U0.m, int, int):I0.P0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: nI.l<androidx.compose.ui.platform.v0, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: I0.O0$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: I0.O0$e} */
    /* JADX WARNING: type inference failed for: r0v1, types: [nI.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> androidx.compose.ui.d h(androidx.compose.ui.d r12, I0.P0<T> r13, java.util.Map<java.lang.Float, ? extends T> r14, p0.v r15, boolean r16, boolean r17, r0.m r18, nI.p<? super T, ? super T, ? extends I0.c1> r19, I0.C4582s0 r20, float r21) {
        /*
            boolean r0 = androidx.compose.ui.platform.C5133t0.b()
            if (r0 == 0) goto L_0x001c
            I0.O0$e r0 = new I0.O0$e
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0020
        L_0x001c:
            nI.l r0 = androidx.compose.ui.platform.C5133t0.a()
        L_0x0020:
            I0.O0$d r11 = new I0.O0$d
            r1 = r11
            r2 = r14
            r3 = r13
            r4 = r20
            r5 = r19
            r6 = r21
            r7 = r15
            r8 = r16
            r9 = r18
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r12
            androidx.compose.ui.d r0 = androidx.compose.ui.c.b(r12, r0, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.O0.h(androidx.compose.ui.d, I0.P0, java.util.Map, p0.v, boolean, boolean, r0.m, nI.p, I0.s0, float):androidx.compose.ui.d");
    }

    public static /* synthetic */ androidx.compose.ui.d i(androidx.compose.ui.d dVar, P0 p02, Map map, v vVar, boolean z10, boolean z11, m mVar, p pVar, C4582s0 s0Var, float f10, int i10, Object obj) {
        int i11 = i10;
        return h(dVar, p02, map, vVar, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : mVar, (i11 & 64) != 0 ? c.f7407c : pVar, (i11 & 128) != 0 ? N0.d(N0.f7396a, map.keySet(), 0.0f, 0.0f, 6, (Object) null) : s0Var, (i11 & 256) != 0 ? N0.f7396a.b() : f10);
    }
}
