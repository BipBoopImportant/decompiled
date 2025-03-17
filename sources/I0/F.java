package I0;

import A1.K;
import A1.U;
import E1.I;
import G1.C4504g;
import L1.v;
import L1.x;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import c2.o;
import com.adjust.sdk.Constants;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.y0;
import n0.C5603i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p0.G;
import p1.C5749w0;
import p1.i1;
import pI.C17752b;
import s0.C5859e;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0001\u0010\u0019\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010\u001c\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010#\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010$\"\u0014\u0010&\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%\"\u0014\u0010'\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%\"\u0014\u0010)\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010%\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\f\u0010.\u001a\u00020\u001b8\nX\u0002"}, d2 = {"LI0/H;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "LI0/G;", "j", "(LI0/H;LnI/l;LU0/m;II)LI0/G;", "Ls0/g;", "LXH/N;", "drawerContent", "Landroidx/compose/ui/d;", "modifier", "drawerState", "gesturesEnabled", "Lp1/i1;", "drawerShape", "Lc2/h;", "drawerElevation", "Lp1/v0;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "a", "(LnI/q;Landroidx/compose/ui/d;LI0/G;ZLp1/i1;FJJJLnI/p;LU0/m;II)V", "", "b", "pos", "i", "(FFF)F", "open", "onClose", "fraction", "color", "(ZLnI/a;LnI/a;JLU0/m;I)V", "F", "EndDrawerPadding", "DrawerPositionalThreshold", "c", "DrawerVelocityThreshold", "Lm0/y0;", "d", "Lm0/y0;", "AnimationSpec", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f7144a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f7145b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f7146c = c2.h.B((float) Constants.MINIMAL_ERROR_STATUS_CODE);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y0<Float> f7147d = new y0(256, 0, (C5525D) null, 6, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/e;", "LXH/N;", "a", "(Ls0/e;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f7148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7149d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f7150e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7151f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f7152g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7153h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7154i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7155j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7156k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f7157l;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.F$a$a  reason: collision with other inner class name */
        static final class C0085a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ G f7158c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c2.d f7159d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f7160e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f7161f;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/D;", "LI0/H;", "LXH/N;", "a", "(LI0/D;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I0.F$a$a$a  reason: collision with other inner class name */
            static final class C0086a extends C17544u implements C17642l<D<H>, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ float f7162c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ float f7163d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0086a(float f10, float f11) {
                    super(1);
                    this.f7162c = f10;
                    this.f7163d = f11;
                }

                public final void a(D<H> d10) {
                    d10.a(H.Closed, this.f7162c);
                    d10.a(H.Open, this.f7163d);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((D) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0085a(G g10, c2.d dVar, float f10, float f11) {
                super(0);
                this.f7158c = g10;
                this.f7159d = dVar;
                this.f7160e = f10;
                this.f7161f = f11;
            }

            public final void invoke() {
                this.f7158c.i(this.f7159d);
                C4552d.J(this.f7158c.c(), androidx.compose.material.a.a(new C0086a(this.f7160e, this.f7161f)), (Object) null, 2, (Object) null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f7164c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G f7165d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Q f7166e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {542}, m = "invokeSuspend")
            /* renamed from: I0.F$a$b$a  reason: collision with other inner class name */
            static final class C0087a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f7167c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ G f7168d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0087a(G g10, C17164e<? super C0087a> eVar) {
                    super(2, eVar);
                    this.f7168d = g10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0087a(this.f7168d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0087a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f7167c;
                    if (i10 == 0) {
                        y.b(obj);
                        G g10 = this.f7168d;
                        this.f7167c = 1;
                        if (g10.b(this) == f10) {
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
            b(boolean z10, G g10, Q q10) {
                super(0);
                this.f7164c = z10;
                this.f7165d = g10;
                this.f7166e = q10;
            }

            public final void invoke() {
                if (this.f7164c && this.f7165d.c().r().invoke(H.Closed).booleanValue()) {
                    F0 unused = C16314k.d(this.f7166e, (C17168i) null, (T) null, new C0087a(this.f7165d, (C17164e<? super C0087a>) null), 3, (Object) null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements C17631a<Float> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7169c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f7170d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ G f7171e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, G g10) {
                super(0);
                this.f7169c = f10;
                this.f7170d = f11;
                this.f7171e = g10;
            }

            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(F.i(this.f7169c, this.f7170d, this.f7171e.h()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/d;", "Lc2/n;", "a", "(Lc2/d;)J"}, k = 3, mv = {1, 8, 0})
        static final class d extends C17544u implements C17642l<c2.d, n> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ G f7172c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(G g10) {
                super(1);
                this.f7172c = g10;
            }

            public final long a(c2.d dVar) {
                return o.a(C17752b.e(this.f7172c.h()), 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n.b(a((c2.d) obj));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f7173c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G f7174d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Q f7175e;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: I0.F$a$e$a  reason: collision with other inner class name */
            static final class C0088a extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ G f7176c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Q f7177d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {577}, m = "invokeSuspend")
                /* renamed from: I0.F$a$e$a$a  reason: collision with other inner class name */
                static final class C0089a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f7178c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ G f7179d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0089a(G g10, C17164e<? super C0089a> eVar) {
                        super(2, eVar);
                        this.f7179d = g10;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0089a(this.f7179d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0089a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f7178c;
                        if (i10 == 0) {
                            y.b(obj);
                            G g10 = this.f7179d;
                            this.f7178c = 1;
                            if (g10.b(this) == f10) {
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
                C0088a(G g10, Q q10) {
                    super(0);
                    this.f7176c = g10;
                    this.f7177d = q10;
                }

                public final Boolean invoke() {
                    if (this.f7176c.c().r().invoke(H.Closed).booleanValue()) {
                        F0 unused = C16314k.d(this.f7177d, (C17168i) null, (T) null, new C0089a(this.f7176c, (C17164e<? super C0089a>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(String str, G g10, Q q10) {
                super(1);
                this.f7173c = str;
                this.f7174d = g10;
                this.f7175e = q10;
            }

            public final void a(x xVar) {
                v.j0(xVar, this.f7173c);
                if (this.f7174d.e()) {
                    v.n(xVar, (String) null, new C0088a(this.f7174d, this.f7175e), 1, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f7180c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
                super(2);
                this.f7180c = qVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1941234439, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:586)");
                    }
                    androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                    q<C5861g, C4889m, Integer, C16807N> qVar = this.f7180c;
                    I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                    int a11 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, f10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a12);
                    } else {
                        mVar.t();
                    }
                    C4889m a13 = F1.a(mVar);
                    F1.c(a13, a10, aVar.c());
                    F1.c(a13, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b10);
                    }
                    F1.c(a13, e10, aVar.d());
                    qVar.invoke(C5862h.f28810a, mVar, 6);
                    mVar.x();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G g10, boolean z10, Q q10, long j10, i1 i1Var, long j11, long j12, float f10, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(3);
            this.f7148c = g10;
            this.f7149d = z10;
            this.f7150e = q10;
            this.f7151f = j10;
            this.f7152g = i1Var;
            this.f7153h = j11;
            this.f7154i = j12;
            this.f7155j = f10;
            this.f7156k = pVar;
            this.f7157l = qVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(s0.C5859e r29, U0.C4889m r30, int r31) {
            /*
                r28 = this;
                r0 = r28
                r13 = r30
                r8 = 6
                r1 = r31 & 6
                if (r1 != 0) goto L_0x0017
                r1 = r29
                boolean r2 = r13.V(r1)
                if (r2 == 0) goto L_0x0013
                r2 = 4
                goto L_0x0014
            L_0x0013:
                r2 = 2
            L_0x0014:
                r2 = r31 | r2
                goto L_0x001b
            L_0x0017:
                r1 = r29
                r2 = r31
            L_0x001b:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002d
                boolean r3 = r30.l()
                if (r3 != 0) goto L_0x0028
                goto L_0x002d
            L_0x0028:
                r30.L()
                goto L_0x02e1
            L_0x002d:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003c
                r3 = -1
                java.lang.String r4 = "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:503)"
                r5 = 816674999(0x30ad78b7, float:1.2621716E-9)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003c:
                long r9 = r29.b()
                boolean r1 = c2.C5267b.h(r9)
                if (r1 == 0) goto L_0x02e2
                int r1 = c2.C5267b.l(r9)
                float r1 = (float) r1
                float r1 = -r1
                U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r2 = r13.Q(r2)
                c2.d r2 = (c2.d) r2
                I0.G r3 = r0.f7148c
                boolean r3 = r13.V(r3)
                boolean r4 = r13.V(r2)
                r3 = r3 | r4
                boolean r4 = r13.c(r1)
                r3 = r3 | r4
                I0.G r4 = r0.f7148c
                java.lang.Object r5 = r30.D()
                r6 = 0
                if (r3 != 0) goto L_0x0077
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x007f
            L_0x0077:
                I0.F$a$a r5 = new I0.F$a$a
                r5.<init>(r4, r2, r1, r6)
                r13.u(r5)
            L_0x007f:
                nI.a r5 = (nI.C17631a) r5
                r11 = 0
                U0.P.i(r5, r13, r11)
                U0.I0 r2 = androidx.compose.ui.platform.C5100f0.k()
                java.lang.Object r2 = r13.Q(r2)
                c2.t r3 = c2.t.Rtl
                if (r2 != r3) goto L_0x0094
                r18 = 1
                goto L_0x0096
            L_0x0094:
                r18 = r11
            L_0x0096:
                androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
                I0.G r2 = r0.f7148c
                I0.d r15 = r2.c()
                p0.v r16 = p0.v.Horizontal
                boolean r2 = r0.f7149d
                r21 = 48
                r22 = 0
                r19 = 0
                r20 = 0
                r14 = r7
                r17 = r2
                androidx.compose.ui.d r2 = androidx.compose.material.a.e(r14, r15, r16, r17, r18, r19, r20, r21, r22)
                I0.G r14 = r0.f7148c
                boolean r3 = r0.f7149d
                QJ.Q r15 = r0.f7150e
                long r4 = r0.f7151f
                p1.i1 r12 = r0.f7152g
                r17 = r9
                long r8 = r0.f7153h
                r10 = r7
                long r6 = r0.f7154i
                r19 = r6
                float r7 = r0.f7155j
                nI.p<U0.m, java.lang.Integer, XH.N> r6 = r0.f7156k
                r21 = r7
                nI.q<s0.g, U0.m, java.lang.Integer, XH.N> r7 = r0.f7157l
                i1.c$a r22 = i1.C5437c.f24302a
                i1.c r0 = r22.o()
                E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r11)
                int r23 = U0.C4883j.a(r13, r11)
                U0.y r11 = r30.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
                G1.g$a r24 = G1.C4504g.f6515W
                r25 = r7
                nI.a r7 = r24.a()
                U0.f r26 = r30.m()
                if (r26 != 0) goto L_0x00f3
                U0.C4883j.c()
            L_0x00f3:
                r30.I()
                boolean r26 = r30.i()
                if (r26 == 0) goto L_0x0100
                r13.p(r7)
                goto L_0x0103
            L_0x0100:
                r30.t()
            L_0x0103:
                U0.m r7 = U0.F1.a(r30)
                r26 = r8
                nI.p r8 = r24.c()
                U0.F1.c(r7, r0, r8)
                nI.p r0 = r24.e()
                U0.F1.c(r7, r11, r0)
                nI.p r0 = r24.b()
                boolean r8 = r7.i()
                if (r8 != 0) goto L_0x012f
                java.lang.Object r8 = r7.D()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
                if (r8 != 0) goto L_0x013d
            L_0x012f:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
                r7.u(r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
                r7.w(r8, r0)
            L_0x013d:
                nI.p r0 = r24.d()
                U0.F1.c(r7, r2, r0)
                androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
                i1.c r0 = r22.o()
                r2 = 0
                E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r2)
                int r7 = U0.C4883j.a(r13, r2)
                U0.y r2 = r30.s()
                androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r13, r10)
                nI.a r9 = r24.a()
                U0.f r11 = r30.m()
                if (r11 != 0) goto L_0x0168
                U0.C4883j.c()
            L_0x0168:
                r30.I()
                boolean r11 = r30.i()
                if (r11 == 0) goto L_0x0175
                r13.p(r9)
                goto L_0x0178
            L_0x0175:
                r30.t()
            L_0x0178:
                U0.m r9 = U0.F1.a(r30)
                nI.p r11 = r24.c()
                U0.F1.c(r9, r0, r11)
                nI.p r0 = r24.e()
                U0.F1.c(r9, r2, r0)
                nI.p r0 = r24.b()
                boolean r2 = r9.i()
                if (r2 != 0) goto L_0x01a2
                java.lang.Object r2 = r9.D()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r11)
                if (r2 != 0) goto L_0x01b0
            L_0x01a2:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r9.u(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r9.w(r2, r0)
            L_0x01b0:
                nI.p r0 = r24.d()
                U0.F1.c(r9, r8, r0)
                r0 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r6.invoke(r13, r2)
                r30.x()
                boolean r0 = r14.e()
                boolean r2 = r13.b(r3)
                boolean r6 = r13.V(r14)
                r2 = r2 | r6
                boolean r6 = r13.F(r15)
                r2 = r2 | r6
                java.lang.Object r6 = r30.D()
                if (r2 != 0) goto L_0x01e2
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r6 != r2) goto L_0x01ea
            L_0x01e2:
                I0.F$a$b r6 = new I0.F$a$b
                r6.<init>(r3, r14, r15)
                r13.u(r6)
            L_0x01ea:
                r2 = r6
                nI.a r2 = (nI.C17631a) r2
                boolean r3 = r13.c(r1)
                boolean r6 = r13.V(r14)
                r3 = r3 | r6
                java.lang.Object r6 = r30.D()
                if (r3 != 0) goto L_0x0204
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x020d
            L_0x0204:
                I0.F$a$c r6 = new I0.F$a$c
                r3 = 0
                r6.<init>(r1, r3, r14)
                r13.u(r6)
            L_0x020d:
                r3 = r6
                nI.a r3 = (nI.C17631a) r3
                r7 = 0
                r1 = r0
                r8 = r19
                r6 = r30
                r0 = r10
                r10 = r21
                r11 = r25
                I0.F.b(r1, r2, r3, r4, r6, r7)
                I0.J0$a r1 = I0.J0.f7334a
                int r1 = r1.e()
                r2 = 6
                java.lang.String r1 = I0.K0.a(r1, r13, r2)
                U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r2 = r13.Q(r2)
                c2.d r2 = (c2.d) r2
                int r3 = c2.C5267b.n(r17)
                float r3 = r2.H(r3)
                int r4 = c2.C5267b.m(r17)
                float r4 = r2.H(r4)
                int r5 = c2.C5267b.l(r17)
                float r5 = r2.H(r5)
                int r6 = c2.C5267b.k(r17)
                float r2 = r2.H(r6)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.w(r0, r3, r4, r5, r2)
                boolean r2 = r13.V(r14)
                java.lang.Object r3 = r30.D()
                if (r2 != 0) goto L_0x0269
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0271
            L_0x0269:
                I0.F$a$d r3 = new I0.F$a$d
                r3.<init>(r14)
                r13.u(r3)
            L_0x0271:
                nI.l r3 = (nI.C17642l) r3
                androidx.compose.ui.d r16 = androidx.compose.foundation.layout.A.a(r0, r3)
                float r19 = I0.F.f7144a
                r21 = 11
                r22 = 0
                r17 = 0
                r18 = 0
                r20 = 0
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
                boolean r2 = r13.V(r1)
                boolean r3 = r13.V(r14)
                r2 = r2 | r3
                boolean r3 = r13.F(r15)
                r2 = r2 | r3
                java.lang.Object r3 = r30.D()
                if (r2 != 0) goto L_0x02a5
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x02ad
            L_0x02a5:
                I0.F$a$e r3 = new I0.F$a$e
                r3.<init>(r1, r14, r15)
                r13.u(r3)
            L_0x02ad:
                nI.l r3 = (nI.C17642l) r3
                r1 = 0
                r2 = 0
                r4 = 1
                androidx.compose.ui.d r1 = L1.o.d(r0, r2, r3, r4, r1)
                I0.F$a$f r0 = new I0.F$a$f
                r0.<init>(r11)
                r2 = 54
                r3 = -1941234439(0xffffffff8c4b1cf9, float:-1.564727E-31)
                c1.a r0 = c1.c.e(r3, r4, r0, r13, r2)
                r11 = 1572864(0x180000, float:2.204052E-39)
                r14 = 16
                r7 = 0
                r2 = r12
                r3 = r26
                r5 = r8
                r8 = r10
                r9 = r0
                r10 = r30
                r12 = r14
                I0.L0.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
                r30.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x02e1
                U0.C4895p.R()
            L_0x02e1:
                return
            L_0x02e2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Drawer shouldn't have infinite width"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.F.a.a(s0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f7181c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7182d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G f7183e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7184f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f7185g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7186h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7187i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7188j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f7189k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7190l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f7191m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7192n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, androidx.compose.ui.d dVar, G g10, boolean z10, i1 i1Var, float f10, long j10, long j11, long j12, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f7181c = qVar;
            this.f7182d = dVar;
            this.f7183e = g10;
            this.f7184f = z10;
            this.f7185g = i1Var;
            this.f7186h = f10;
            this.f7187i = j10;
            this.f7188j = j11;
            this.f7189k = j12;
            this.f7190l = pVar;
            this.f7191m = i10;
            this.f7192n = i11;
        }

        public final void a(C4889m mVar, int i10) {
            F.a(this.f7181c, this.f7182d, this.f7183e, this.f7184f, this.f7185g, this.f7186h, this.f7187i, this.f7188j, this.f7189k, this.f7190l, mVar, M0.a(this.f7191m | 1), this.f7192n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7193c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f7194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(long j10, C17631a<Float> aVar) {
            super(1);
            this.f7193c = j10;
            this.f7194d = aVar;
        }

        public final void a(r1.f fVar) {
            r1.f.q1(fVar, this.f7193c, 0, 0, this.f7194d.invoke().floatValue(), (r1.g) null, (C5749w0) null, 0, 118, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f7196d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f7197e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7198f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7199g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, C17631a<C16807N> aVar, C17631a<Float> aVar2, long j10, int i10) {
            super(2);
            this.f7195c = z10;
            this.f7196d = aVar;
            this.f7197e = aVar2;
            this.f7198f = j10;
            this.f7199g = i10;
        }

        public final void a(C4889m mVar, int i10) {
            F.b(this.f7195c, this.f7196d, this.f7197e, this.f7198f, mVar, M0.a(this.f7199g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {834}, m = "invokeSuspend")
    static final class e extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7200c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f7201d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f7202e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f7203c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(1);
                this.f7203c = aVar;
            }

            public final void a(long j10) {
                this.f7203c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5667g) obj).v());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17631a<C16807N> aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f7202e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f7202e, eVar);
            eVar2.f7201d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((e) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7200c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f7202e);
                this.f7200c = 1;
                if (G.j((K) this.f7201d, (C17642l) null, (C17642l) null, (q) null, aVar, this, 7, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7204c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f7205d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f7206c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(0);
                this.f7206c = aVar;
            }

            public final Boolean invoke() {
                this.f7206c.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, C17631a<C16807N> aVar) {
            super(1);
            this.f7204c = str;
            this.f7205d = aVar;
        }

        public final void a(x xVar) {
            v.d0(xVar, this.f7204c);
            v.B(xVar, (String) null, new a(this.f7205d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements C17642l<H, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f7207c = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(H h10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI0/G;", "b", "()LI0/G;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<G> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f7208c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<H, Boolean> f7209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(H h10, C17642l<? super H, Boolean> lVar) {
            super(0);
            this.f7208c = h10;
            this.f7209d = lVar;
        }

        /* renamed from: b */
        public final G invoke() {
            return new G(this.f7208c, this.f7209d);
        }
    }

    static {
        float f10 = (float) 56;
        f7144a = c2.h.B(f10);
        f7145b = c2.h.B(f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, androidx.compose.ui.d r35, I0.G r36, boolean r37, p1.i1 r38, float r39, long r40, long r42, long r44, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r46, U0.C4889m r47, int r48, int r49) {
        /*
            r14 = r48
            r15 = r49
            r0 = 1305806945(0x4dd50861, float:4.46762016E8)
            r1 = r47
            U0.m r1 = r1.k(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r14 | 6
            r4 = r2
            r2 = r34
            goto L_0x002b
        L_0x0017:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r34
            boolean r4 = r1.F(r2)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r14
            goto L_0x002b
        L_0x0028:
            r2 = r34
            r4 = r14
        L_0x002b:
            r5 = r15 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r35
            goto L_0x0046
        L_0x0034:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r35
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005f
            r7 = r15 & 4
            if (r7 != 0) goto L_0x0059
            r7 = r36
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r7 = r36
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r36
        L_0x0061:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r37
            goto L_0x007c
        L_0x006a:
            r9 = r14 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r37
            boolean r10 = r1.b(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
        L_0x007c:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0095
            r10 = r15 & 16
            if (r10 != 0) goto L_0x008f
            r10 = r38
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0091
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r10 = r38
        L_0x0091:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r11
            goto L_0x0097
        L_0x0095:
            r10 = r38
        L_0x0097:
            r11 = r15 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r4 = r4 | r12
        L_0x009e:
            r12 = r39
            goto L_0x00b2
        L_0x00a1:
            r12 = r12 & r14
            if (r12 != 0) goto L_0x009e
            r12 = r39
            boolean r13 = r1.c(r12)
            if (r13 == 0) goto L_0x00af
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r13
        L_0x00b2:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x00cf
            r13 = r15 & 64
            if (r13 != 0) goto L_0x00c7
            r13 = r4
            r3 = r40
            boolean r16 = r1.e(r3)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00c7:
            r13 = r4
            r3 = r40
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r13 = r13 | r16
            goto L_0x00d2
        L_0x00cf:
            r13 = r4
            r3 = r40
        L_0x00d2:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00eb
            r0 = r15 & 128(0x80, float:1.794E-43)
            r2 = r42
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r1.e(r2)
            if (r0 == 0) goto L_0x00e7
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r13 = r13 | r0
            goto L_0x00ed
        L_0x00eb:
            r2 = r42
        L_0x00ed:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0105
            r0 = r15 & 256(0x100, float:3.59E-43)
            r2 = r44
            if (r0 != 0) goto L_0x0101
            boolean r0 = r1.e(r2)
            if (r0 == 0) goto L_0x0101
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0103
        L_0x0101:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0103:
            r13 = r13 | r0
            goto L_0x0107
        L_0x0105:
            r2 = r44
        L_0x0107:
            r0 = r15 & 512(0x200, float:7.175E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0111
            r13 = r13 | r4
            r4 = r46
            goto L_0x0123
        L_0x0111:
            r0 = r14 & r4
            r4 = r46
            if (r0 != 0) goto L_0x0123
            boolean r0 = r1.F(r4)
            if (r0 == 0) goto L_0x0120
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0122
        L_0x0120:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0122:
            r13 = r13 | r0
        L_0x0123:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r13
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0143
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x0133
            goto L_0x0143
        L_0x0133:
            r1.L()
            r2 = r6
            r3 = r7
            r4 = r9
            r5 = r10
            r6 = r12
            r7 = r40
            r9 = r42
            r11 = r44
            goto L_0x027c
        L_0x0143:
            r1.G()
            r0 = r14 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x018a
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x015d
            goto L_0x018a
        L_0x015d:
            r1.L()
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0166
            r13 = r13 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0166:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x016c
            r13 = r13 & r19
        L_0x016c:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0172
            r13 = r13 & r18
        L_0x0172:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0178
            r13 = r13 & r17
        L_0x0178:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x017d
            r13 = r13 & r3
        L_0x017d:
            r30 = r44
            r0 = r6
            r5 = r7
            r2 = r10
            r7 = r12
            r3 = r13
            r10 = r40
            r12 = r42
            goto L_0x01f3
        L_0x018a:
            if (r5 == 0) goto L_0x018f
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0190
        L_0x018f:
            r0 = r6
        L_0x0190:
            r5 = r15 & 4
            r6 = 6
            if (r5 == 0) goto L_0x01a0
            I0.H r5 = I0.H.Closed
            r2 = 0
            r7 = 2
            I0.G r5 = j(r5, r2, r1, r6, r7)
            r13 = r13 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01a1
        L_0x01a0:
            r5 = r7
        L_0x01a1:
            if (r8 == 0) goto L_0x01a4
            r9 = 1
        L_0x01a4:
            r2 = r15 & 16
            if (r2 == 0) goto L_0x01b1
            I0.E r2 = I0.E.f7141a
            p1.i1 r2 = r2.d(r1, r6)
            r13 = r13 & r19
            goto L_0x01b2
        L_0x01b1:
            r2 = r10
        L_0x01b2:
            if (r11 == 0) goto L_0x01bb
            I0.E r7 = I0.E.f7141a
            float r7 = r7.b()
            goto L_0x01bc
        L_0x01bb:
            r7 = r12
        L_0x01bc:
            r8 = r15 & 64
            if (r8 == 0) goto L_0x01c9
            I0.E r8 = I0.E.f7141a
            long r10 = r8.a(r1, r6)
            r13 = r13 & r18
            goto L_0x01cb
        L_0x01c9:
            r10 = r40
        L_0x01cb:
            r8 = r15 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01db
            int r8 = r13 >> 18
            r8 = r8 & 14
            long r18 = I0.C4570m.b(r10, r1, r8)
            r8 = r13 & r17
            r13 = r8
            goto L_0x01dd
        L_0x01db:
            r18 = r42
        L_0x01dd:
            r8 = r15 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x01ee
            I0.E r8 = I0.E.f7141a
            long r21 = r8.c(r1, r6)
            r13 = r13 & r3
            r3 = r13
            r12 = r18
            r30 = r21
            goto L_0x01f3
        L_0x01ee:
            r30 = r44
            r3 = r13
            r12 = r18
        L_0x01f3:
            r1.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0205
            r6 = -1
            java.lang.String r8 = "androidx.compose.material.ModalDrawer (Drawer.kt:500)"
            r4 = 1305806945(0x4dd50861, float:4.46762016E8)
            U0.C4895p.S(r4, r3, r6, r8)
        L_0x0205:
            java.lang.Object r3 = r1.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x0220
            dI.j r3 = dI.C17169j.f142968a
            QJ.Q r3 = U0.P.k(r3, r1)
            U0.B r4 = new U0.B
            r4.<init>(r3)
            r1.u(r4)
            r3 = r4
        L_0x0220:
            U0.B r3 = (U0.B) r3
            QJ.Q r19 = r3.a()
            r3 = 0
            r4 = 0
            r6 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.f(r0, r3, r6, r4)
            I0.F$a r4 = new I0.F$a
            r16 = r4
            r17 = r5
            r18 = r9
            r20 = r30
            r22 = r2
            r23 = r10
            r25 = r12
            r27 = r7
            r28 = r46
            r29 = r34
            r16.<init>(r17, r18, r19, r20, r22, r23, r25, r27, r28, r29)
            r6 = 54
            r8 = 816674999(0x30ad78b7, float:1.2621716E-9)
            r16 = r0
            r0 = 1
            c1.a r0 = c1.c.e(r8, r0, r4, r1, r6)
            r4 = 3072(0xc00, float:4.305E-42)
            r6 = 6
            r8 = 0
            r17 = 0
            r35 = r3
            r36 = r8
            r37 = r17
            r38 = r0
            r39 = r1
            r40 = r4
            r41 = r6
            s0.C5858d.a(r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0272
            U0.C4895p.R()
        L_0x0272:
            r3 = r5
            r6 = r7
            r4 = r9
            r7 = r10
            r9 = r12
            r11 = r30
            r5 = r2
            r2 = r16
        L_0x027c:
            U0.Y0 r13 = r1.n()
            if (r13 == 0) goto L_0x029b
            I0.F$b r1 = new I0.F$b
            r0 = r1
            r32 = r1
            r1 = r34
            r33 = r13
            r13 = r46
            r14 = r48
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.a(r1)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.F.a(nI.q, androidx.compose.ui.d, I0.G, boolean, p1.i1, float, long, long, long, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(boolean z10, C17631a<C16807N> aVar, C17631a<Float> aVar2, long j10, C4889m mVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar;
        boolean z11 = z10;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<Float> aVar4 = aVar2;
        long j11 = j10;
        int i12 = i10;
        C4889m k10 = mVar.k(1983403750);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.e(j11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:829)");
            }
            String a10 = K0.a(J0.f7334a.a(), k10, 6);
            boolean z12 = true;
            if (z11) {
                k10.W(487729414);
                d.a aVar5 = androidx.compose.ui.d.f18749a;
                int i13 = i11 & 112;
                boolean z13 = i13 == 32;
                Object D10 = k10.D();
                if (z13 || D10 == C4889m.f14007a.a()) {
                    D10 = new e(aVar3, (C17164e<? super e>) null);
                    k10.u(D10);
                }
                androidx.compose.ui.d d10 = U.d(aVar5, aVar3, (p) D10);
                boolean V10 = (i13 == 32) | k10.V(a10);
                Object D11 = k10.D();
                if (V10 || D11 == C4889m.f14007a.a()) {
                    D11 = new f(a10, aVar3);
                    k10.u(D11);
                }
                dVar = L1.o.c(d10, true, (C17642l) D11);
                k10.P();
            } else {
                k10.W(487978282);
                k10.P();
                dVar = androidx.compose.ui.d.f18749a;
            }
            androidx.compose.ui.d s10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null).s(dVar);
            boolean z14 = (i11 & 7168) == 2048;
            if ((i11 & 896) != 256) {
                z12 = false;
            }
            boolean z15 = z14 | z12;
            Object D12 = k10.D();
            if (z15 || D12 == C4889m.f14007a.a()) {
                D12 = new c(j11, aVar4);
                k10.u(D12);
            }
            C5603i.a(s10, (C17642l) D12, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(z10, aVar, aVar2, j10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float i(float f10, float f11, float f12) {
        float f13 = (f12 - f10) / (f11 - f10);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final I0.G j(I0.H r7, nI.C17642l<? super I0.H, java.lang.Boolean> r8, U0.C4889m r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            I0.F$g r8 = I0.F.g.f7207c
        L_0x0006:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0015
            r11 = -1
            java.lang.String r0 = "androidx.compose.material.rememberDrawerState (Drawer.kt:429)"
            r1 = -1435874229(0xffffffffaa6a4c4b, float:-2.0809844E-13)
            U0.C4895p.S(r1, r10, r11, r0)
        L_0x0015:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            I0.G$b r1 = I0.G.f7245c
            f1.k r1 = r1.a(r8)
            r2 = r10 & 14
            r2 = r2 ^ 6
            r3 = 1
            r4 = 4
            if (r2 <= r4) goto L_0x002c
            boolean r2 = r9.V(r7)
            if (r2 != 0) goto L_0x0030
        L_0x002c:
            r2 = r10 & 6
            if (r2 != r4) goto L_0x0032
        L_0x0030:
            r2 = r3
            goto L_0x0033
        L_0x0032:
            r2 = r11
        L_0x0033:
            r4 = r10 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r5 = 32
            if (r4 <= r5) goto L_0x0041
            boolean r4 = r9.V(r8)
            if (r4 != 0) goto L_0x0045
        L_0x0041:
            r10 = r10 & 48
            if (r10 != r5) goto L_0x0046
        L_0x0045:
            r11 = r3
        L_0x0046:
            r10 = r2 | r11
            java.lang.Object r11 = r9.D()
            if (r10 != 0) goto L_0x0056
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x005e
        L_0x0056:
            I0.F$h r11 = new I0.F$h
            r11.<init>(r7, r8)
            r9.u(r11)
        L_0x005e:
            r3 = r11
            nI.a r3 = (nI.C17631a) r3
            r5 = 0
            r6 = 4
            r2 = 0
            r4 = r9
            java.lang.Object r7 = f1.C5301c.e(r0, r1, r2, r3, r4, r5, r6)
            I0.G r7 = (I0.G) r7
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0074
            U0.C4895p.R()
        L_0x0074:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.F.j(I0.H, nI.l, U0.m, int, int):I0.G");
    }
}
