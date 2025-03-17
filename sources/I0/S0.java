package I0;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import g1.C5353v;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.u;
import m0.C5525D;
import m0.C5546i;
import m0.y0;
import n0.C5603i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import p1.k1;
import pI.C17752b;
import r0.C5809a;
import r0.C5810b;
import r0.C5811c;
import r0.m;
import r0.o;
import s0.C5844O;
import s0.C5857c;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u001a\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u001a\u0010&\u001a\u00020\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0014\u0010*\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d\"\u0014\u0010+\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\"\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001d\"\u0014\u0010/\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001d\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001d\"\u0014\u00107\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010\u001d\"\u0014\u00109\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\u000e\u0010:\u001a\u00020\u00008\n@\nX\u0002²\u0006\u001a\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u0002²\u0006\f\u0010<\u001a\u00020\u00008\nX\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u0002²\u0006\f\u0010=\u001a\u00020\u00168\nX\u0002²\u0006\f\u0010>\u001a\u00020\u00168\nX\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "LXH/N;", "onCheckedChange", "Landroidx/compose/ui/d;", "modifier", "enabled", "Lr0/m;", "interactionSource", "LI0/Q0;", "colors", "a", "(ZLnI/l;Landroidx/compose/ui/d;ZLr0/m;LI0/Q0;LU0/m;II)V", "Ls0/c;", "Lkotlin/Function0;", "", "thumbValue", "Lr0/k;", "f", "(Ls0/c;ZZLI0/Q0;LnI/a;Lr0/k;LU0/m;I)V", "Lr1/f;", "Lp1/v0;", "trackColor", "trackWidth", "strokeWidth", "q", "(Lr1/f;JFF)V", "Lc2/h;", "F", "s", "()F", "TrackWidth", "b", "r", "TrackStrokeWidth", "c", "getThumbDiameter", "ThumbDiameter", "d", "ThumbRippleRadius", "e", "DefaultSwitchPadding", "SwitchWidth", "g", "SwitchHeight", "h", "ThumbPathLength", "Lm0/y0;", "i", "Lm0/y0;", "AnimationSpec", "j", "ThumbDefaultElevation", "k", "ThumbPressedElevation", "l", "SwitchVelocityThreshold", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class S0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7505a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f7506b = c2.h.B((float) 14);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7507c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f7508d = c2.h.B((float) 24);

    /* renamed from: e  reason: collision with root package name */
    private static final float f7509e = c2.h.B((float) 2);

    /* renamed from: f  reason: collision with root package name */
    private static final float f7510f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f7511g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f7512h;

    /* renamed from: i  reason: collision with root package name */
    private static final y0<Float> f7513i = new y0(100, 0, (C5525D) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private static final float f7514j = c2.h.B((float) 1);

    /* renamed from: k  reason: collision with root package name */
    private static final float f7515k = c2.h.B((float) 6);

    /* renamed from: l  reason: collision with root package name */
    private static final float f7516l = c2.h.B((float) 125);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", l = {127}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4552d<Boolean> f7518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f7519e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<Boolean, C16807N>> f7520f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f7521g;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: I0.S0$a$a  reason: collision with other inner class name */
        static final class C0099a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4552d<Boolean> f7522c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0099a(C4552d<Boolean> dVar) {
                super(0);
                this.f7522c = dVar;
            }

            public final Boolean invoke() {
                return this.f7522c.s();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
        static final class b extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7523c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f7524d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ A1<Boolean> f7525e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ A1<C17642l<Boolean, C16807N>> f7526f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f7527g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(A1<Boolean> a12, A1<? extends C17642l<? super Boolean, C16807N>> a13, C4899r0<Boolean> r0Var, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f7525e = a12;
                this.f7526f = a13;
                this.f7527g = r0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f7525e, this.f7526f, this.f7527g, eVar);
                bVar.f7524d = ((Boolean) obj).booleanValue();
                return bVar;
            }

            public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
                return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f7523c == 0) {
                    y.b(obj);
                    boolean z10 = this.f7524d;
                    if (S0.e(this.f7525e) != z10) {
                        C17642l l10 = S0.d(this.f7526f);
                        if (l10 != null) {
                            l10.invoke(kotlin.coroutines.jvm.internal.b.a(z10));
                        }
                        C4899r0<Boolean> r0Var = this.f7527g;
                        S0.c(r0Var, !S0.b(r0Var));
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4552d<Boolean> dVar, A1<Boolean> a12, A1<? extends C17642l<? super Boolean, C16807N>> a13, C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f7518d = dVar;
            this.f7519e = a12;
            this.f7520f = a13;
            this.f7521g = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f7518d, this.f7519e, this.f7520f, this.f7521g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7517c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new C0099a(this.f7518d));
                b bVar = new b(this.f7519e, this.f7520f, this.f7521g, (C17164e<? super b>) null);
                this.f7517c = 1;
                if (C16534i.j(r10, bVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", l = {136}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7529d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4552d<Boolean> f7530e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C4552d<Boolean> dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f7529d = z10;
            this.f7530e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f7529d, this.f7530e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7528c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f7529d != this.f7530e.s().booleanValue()) {
                    C4552d<Boolean> dVar = this.f7530e;
                    Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.f7529d);
                    this.f7528c = 1;
                    if (androidx.compose.material.a.g(dVar, a10, 0.0f, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4552d<Boolean> f7531c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4552d<Boolean> dVar) {
            super(0);
            this.f7531c = dVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f7531c.A());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7532c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f7533d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7534e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7535f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f7536g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Q0 f7537h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f7538i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f7539j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, C17642l<? super Boolean, C16807N> lVar, androidx.compose.ui.d dVar, boolean z11, m mVar, Q0 q02, int i10, int i11) {
            super(2);
            this.f7532c = z10;
            this.f7533d = lVar;
            this.f7534e = dVar;
            this.f7535f = z11;
            this.f7536g = mVar;
            this.f7537h = q02;
            this.f7538i = i10;
            this.f7539j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            S0.a(this.f7532c, this.f7533d, this.f7534e, this.f7535f, this.f7536g, this.f7537h, mVar, M0.a(this.f7538i | 1), this.f7539j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/D;", "", "LXH/N;", "a", "(LI0/D;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<D<Boolean>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7540c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f7541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(float f10, float f11) {
            super(1);
            this.f7540c = f10;
            this.f7541d = f11;
        }

        public final void a(D<Boolean> d10) {
            d10.a(Boolean.FALSE, this.f7540c);
            d10.a(Boolean.TRUE, this.f7541d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "distance", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f7542c = new f();

        f() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(f10 * 0.7f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7543c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(float f10) {
            super(0);
            this.f7543c = f10;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f7543c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {225}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0.k f7545d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5353v<r0.j> f7546e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5353v<r0.j> f7547a;

            a(C5353v<r0.j> vVar) {
                this.f7547a = vVar;
            }

            /* renamed from: c */
            public final Object emit(r0.j jVar, C17164e<? super C16807N> eVar) {
                if (jVar instanceof o.b) {
                    this.f7547a.add(jVar);
                } else if (jVar instanceof o.c) {
                    this.f7547a.remove((Object) ((o.c) jVar).a());
                } else if (jVar instanceof o.a) {
                    this.f7547a.remove((Object) ((o.a) jVar).a());
                } else if (jVar instanceof C5810b) {
                    this.f7547a.add(jVar);
                } else if (jVar instanceof C5811c) {
                    this.f7547a.remove((Object) ((C5811c) jVar).a());
                } else if (jVar instanceof C5809a) {
                    this.f7547a.remove((Object) ((C5809a) jVar).a());
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(r0.k kVar, C5353v<r0.j> vVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f7545d = kVar;
            this.f7546e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f7545d, this.f7546e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7544c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<r0.j> c10 = this.f7545d.c();
                a aVar = new a(this.f7546e);
                this.f7544c = 1;
                if (c10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C5747v0> f7548c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(A1<C5747v0> a12) {
            super(1);
            this.f7548c = a12;
        }

        public final void a(r1.f fVar) {
            S0.q(fVar, S0.g(this.f7548c), fVar.H1(S0.s()), fVar.H1(S0.r()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/d;", "Lc2/n;", "a", "(Lc2/d;)J"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<c2.d, n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f7549c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C17631a<Float> aVar) {
            super(1);
            this.f7549c = aVar;
        }

        public final long a(c2.d dVar) {
            return c2.o.a(C17752b.e(this.f7549c.invoke().floatValue()), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((c2.d) obj));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5857c f7550c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7551d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7552e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Q0 f7553f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f7554g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r0.k f7555h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f7556i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5857c cVar, boolean z10, boolean z11, Q0 q02, C17631a<Float> aVar, r0.k kVar, int i10) {
            super(2);
            this.f7550c = cVar;
            this.f7551d = z10;
            this.f7552e = z11;
            this.f7553f = q02;
            this.f7554g = aVar;
            this.f7555h = kVar;
            this.f7556i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            S0.f(this.f7550c, this.f7551d, this.f7552e, this.f7553f, this.f7554g, this.f7555h, mVar, M0.a(this.f7556i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        float B10 = c2.h.B((float) 34);
        f7505a = B10;
        float B11 = c2.h.B((float) 20);
        f7507c = B11;
        f7510f = B10;
        f7511g = B11;
        f7512h = c2.h.B(B10 - B11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: I0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: I0.S0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: I0.S0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: I0.d} */
    /* JADX WARNING: type inference failed for: r3v3, types: [U0.o1, dI.e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c6, code lost:
        if (r12 == r11.a()) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021f, code lost:
        if (r5 == r11.a()) goto L_0x0221;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r36, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r37, androidx.compose.ui.d r38, boolean r39, r0.m r40, I0.Q0 r41, U0.C4889m r42, int r43, int r44) {
        /*
            r7 = r36
            r8 = r37
            r9 = r43
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r1 = r42
            U0.m r6 = r1.k(r0)
            r1 = r44 & 1
            r5 = 2
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.b(r7)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = r5
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r3 = r44 & 2
            if (r3 == 0) goto L_0x002e
            r1 = r1 | 48
            goto L_0x003e
        L_0x002e:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x003e
            boolean r3 = r6.F(r8)
            if (r3 == 0) goto L_0x003b
            r3 = 32
            goto L_0x003d
        L_0x003b:
            r3 = 16
        L_0x003d:
            r1 = r1 | r3
        L_0x003e:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r4 = r38
            goto L_0x0059
        L_0x0047:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0044
            r4 = r38
            boolean r10 = r6.V(r4)
            if (r10 == 0) goto L_0x0056
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r10
        L_0x0059:
            r10 = r44 & 8
            if (r10 == 0) goto L_0x0062
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x005f:
            r11 = r39
            goto L_0x0074
        L_0x0062:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x005f
            r11 = r39
            boolean r12 = r6.b(r11)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r12
        L_0x0074:
            r12 = r44 & 16
            if (r12 == 0) goto L_0x007d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007a:
            r13 = r40
            goto L_0x008f
        L_0x007d:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007a
            r13 = r40
            boolean r14 = r6.V(r13)
            if (r14 == 0) goto L_0x008c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r1 = r1 | r14
        L_0x008f:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00a9
            r14 = r44 & 32
            if (r14 != 0) goto L_0x00a3
            r14 = r41
            boolean r15 = r6.V(r14)
            if (r15 == 0) goto L_0x00a5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00a3:
            r14 = r41
        L_0x00a5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00a7:
            r1 = r1 | r15
            goto L_0x00ab
        L_0x00a9:
            r14 = r41
        L_0x00ab:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r2) goto L_0x00c5
            boolean r2 = r6.l()
            if (r2 != 0) goto L_0x00bb
            goto L_0x00c5
        L_0x00bb:
            r6.L()
            r3 = r4
            r2 = r6
            r4 = r11
            r5 = r13
            r6 = r14
            goto L_0x03a9
        L_0x00c5:
            r6.G()
            r2 = r9 & 1
            r33 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = 0
            r34 = 1
            if (r2 == 0) goto L_0x00ed
            boolean r2 = r6.O()
            if (r2 == 0) goto L_0x00d9
            goto L_0x00ed
        L_0x00d9:
            r6.L()
            r2 = r44 & 32
            if (r2 == 0) goto L_0x00e2
            r1 = r1 & r33
        L_0x00e2:
            r10 = r1
            r18 = r11
            r19 = r13
            r20 = r14
            r3 = r15
            r15 = r4
            goto L_0x013f
        L_0x00ed:
            if (r3 == 0) goto L_0x00f2
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00f3
        L_0x00f2:
            r2 = r4
        L_0x00f3:
            if (r10 == 0) goto L_0x00f8
            r3 = r34
            goto L_0x00f9
        L_0x00f8:
            r3 = r11
        L_0x00f9:
            if (r12 == 0) goto L_0x00fd
            r4 = r15
            goto L_0x00fe
        L_0x00fd:
            r4 = r13
        L_0x00fe:
            r10 = r44 & 32
            if (r10 == 0) goto L_0x0134
            I0.R0 r10 = I0.R0.f7503a
            r31 = 6
            r32 = 1023(0x3ff, float:1.434E-42)
            r11 = 0
            r13 = 0
            r16 = 0
            r38 = r3
            r3 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 0
            r29 = r6
            I0.Q0 r10 = r10.a(r11, r13, r15, r16, r18, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            r1 = r1 & r33
            r18 = r38
            r15 = r2
            r19 = r4
            r20 = r10
            r10 = r1
            goto L_0x013f
        L_0x0134:
            r38 = r3
            r3 = r15
            r18 = r38
            r10 = r1
            r15 = r2
            r19 = r4
            r20 = r14
        L_0x013f:
            r6.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x014e
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Switch (Switch.kt:99)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x014e:
            if (r19 != 0) goto L_0x0171
            r0 = -1604953567(0xffffffffa0565a21, float:-1.8156326E-19)
            r6.W(r0)
            java.lang.Object r0 = r6.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0169
            r0.m r0 = r0.l.a()
            r6.u(r0)
        L_0x0169:
            r0.m r0 = (r0.m) r0
            r6.P()
            r16 = r0
            goto L_0x017c
        L_0x0171:
            r0 = 779510646(0x2e766376, float:5.6022263E-11)
            r6.W(r0)
            r6.P()
            r16 = r19
        L_0x017c:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r6.Q(r0)
            c2.d r0 = (c2.d) r0
            float r1 = f7512h
            float r0 = r0.H1(r1)
            java.lang.Object r1 = r6.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r2 = r11.a()
            if (r1 != r2) goto L_0x01a1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            U0.r0 r1 = U0.u1.e(r1, r3, r5, r3)
            r6.u(r1)
        L_0x01a1:
            U0.r0 r1 = (U0.C4899r0) r1
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r2 = r6.Q(r2)
            c2.d r2 = (c2.d) r2
            float r4 = f7516l
            float r2 = r2.H1(r4)
            boolean r4 = r6.c(r0)
            boolean r12 = r6.c(r2)
            r4 = r4 | r12
            java.lang.Object r12 = r6.D()
            if (r4 != 0) goto L_0x01c8
            java.lang.Object r4 = r11.a()
            if (r12 != r4) goto L_0x01f1
        L_0x01c8:
            m0.y0<java.lang.Float> r26 = f7513i
            I0.S0$e r4 = new I0.S0$e
            r12 = 0
            r4.<init>(r12, r0)
            I0.C r23 = androidx.compose.material.a.a(r4)
            I0.d r12 = new I0.d
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r36)
            I0.S0$f r24 = I0.S0.f.f7542c
            I0.S0$g r0 = new I0.S0$g
            r0.<init>(r2)
            r28 = 32
            r29 = 0
            r27 = 0
            r21 = r12
            r25 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r6.u(r12)
        L_0x01f1:
            I0.d r12 = (I0.C4552d) r12
            int r13 = r10 >> 3
            r0 = r13 & 14
            U0.A1 r0 = U0.p1.q(r8, r6, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r36)
            r4 = r10 & 14
            U0.A1 r2 = U0.p1.q(r2, r6, r4)
            boolean r14 = r6.V(r12)
            boolean r17 = r6.V(r2)
            r14 = r14 | r17
            boolean r17 = r6.V(r0)
            r14 = r14 | r17
            java.lang.Object r5 = r6.D()
            if (r14 != 0) goto L_0x0221
            java.lang.Object r14 = r11.a()
            if (r5 != r14) goto L_0x0235
        L_0x0221:
            I0.S0$a r5 = new I0.S0$a
            r26 = 0
            r21 = r5
            r22 = r12
            r23 = r2
            r24 = r0
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r6.u(r5)
        L_0x0235:
            nI.p r5 = (nI.p) r5
            r14 = 0
            U0.P.g(r12, r5, r6, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r36)
            boolean r1 = b(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            if (r4 != r2) goto L_0x024d
            r2 = r34
            goto L_0x024e
        L_0x024d:
            r2 = r14
        L_0x024e:
            boolean r5 = r6.V(r12)
            r2 = r2 | r5
            java.lang.Object r5 = r6.D()
            if (r2 != 0) goto L_0x025f
            java.lang.Object r2 = r11.a()
            if (r5 != r2) goto L_0x0267
        L_0x025f:
            I0.S0$b r5 = new I0.S0$b
            r5.<init>(r7, r12, r3)
            r6.u(r5)
        L_0x0267:
            nI.p r5 = (nI.p) r5
            U0.P.f(r0, r1, r5, r6, r4)
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r6.Q(r0)
            c2.t r1 = c2.t.Rtl
            if (r0 != r1) goto L_0x027b
            r25 = r34
            goto L_0x027d
        L_0x027b:
            r25 = r14
        L_0x027d:
            if (r8 == 0) goto L_0x029d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            L1.i$a r1 = L1.i.f8936b
            int r1 = r1.f()
            r4 = 0
            L1.i r5 = L1.i.h(r1)
            r1 = r36
            r2 = r16
            r7 = r3
            r3 = r4
            r4 = r18
            r35 = r6
            r6 = r37
            androidx.compose.ui.d r0 = androidx.compose.foundation.selection.c.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a2
        L_0x029d:
            r7 = r3
            r35 = r6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
        L_0x02a2:
            if (r8 == 0) goto L_0x02ab
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r1 = I0.C4547a0.c(r1)
            goto L_0x02ad
        L_0x02ab:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
        L_0x02ad:
            androidx.compose.ui.d r1 = r15.s(r1)
            androidx.compose.ui.d r21 = r1.s(r0)
            p0.v r23 = p0.v.Horizontal
            if (r18 == 0) goto L_0x02be
            if (r8 == 0) goto L_0x02be
            r24 = r34
            goto L_0x02c0
        L_0x02be:
            r24 = r14
        L_0x02c0:
            r27 = 0
            r22 = r12
            r26 = r16
            androidx.compose.ui.d r0 = androidx.compose.material.a.d(r21, r22, r23, r24, r25, r26, r27)
            i1.c$a r1 = i1.C5437c.f24302a
            i1.c r2 = r1.e()
            r3 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.E(r0, r2, r14, r3, r7)
            float r2 = f7509e
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r0, r2)
            float r2 = f7510f
            float r3 = f7511g
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.p(r0, r2, r3)
            i1.c r1 = r1.o()
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r14)
            r2 = r35
            int r3 = U0.C4883j.a(r2, r14)
            U0.y r4 = r2.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r2, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r2.m()
            if (r7 != 0) goto L_0x0308
            U0.C4883j.c()
        L_0x0308:
            r2.I()
            boolean r7 = r2.i()
            if (r7 == 0) goto L_0x0315
            r2.p(r6)
            goto L_0x0318
        L_0x0315:
            r2.t()
        L_0x0318:
            U0.m r6 = U0.F1.a(r2)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r1, r7)
            nI.p r1 = r5.e()
            U0.F1.c(r6, r4, r1)
            nI.p r1 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0342
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0350
        L_0x0342:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r1)
        L_0x0350:
            nI.p r1 = r5.d()
            U0.F1.c(r6, r0, r1)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.Object r1 = r12.x()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r3 = r2.V(r12)
            java.lang.Object r4 = r2.D()
            if (r3 != 0) goto L_0x0373
            java.lang.Object r3 = r11.a()
            if (r4 != r3) goto L_0x037b
        L_0x0373:
            I0.S0$c r4 = new I0.S0$c
            r4.<init>(r12)
            r2.u(r4)
        L_0x037b:
            r14 = r4
            nI.a r14 = (nI.C17631a) r14
            r3 = r13 & 896(0x380, float:1.256E-42)
            r4 = 6
            r3 = r3 | r4
            int r4 = r10 >> 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r17 = r3 | r4
            r10 = r0
            r11 = r1
            r12 = r18
            r13 = r20
            r4 = r15
            r15 = r16
            r16 = r2
            f(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03a2
            U0.C4895p.R()
        L_0x03a2:
            r3 = r4
            r4 = r18
            r5 = r19
            r6 = r20
        L_0x03a9:
            U0.Y0 r10 = r2.n()
            if (r10 == 0) goto L_0x03c0
            I0.S0$d r11 = new I0.S0$d
            r0 = r11
            r1 = r36
            r2 = r37
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x03c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.S0.a(boolean, nI.l, androidx.compose.ui.d, boolean, r0.m, I0.Q0, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean b(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void c(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C17642l<Boolean, C16807N> d(A1<? extends C17642l<? super Boolean, C16807N>> a12) {
        return (C17642l) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final boolean e(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void f(C5857c cVar, boolean z10, boolean z11, Q0 q02, C17631a<Float> aVar, r0.k kVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        d.a aVar2;
        long j10;
        C5857c cVar2 = cVar;
        boolean z12 = z10;
        boolean z13 = z11;
        Q0 q03 = q02;
        C17631a<Float> aVar3 = aVar;
        r0.k kVar2 = kVar;
        int i13 = i10;
        C4889m k10 = mVar.k(70908914);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.b(z12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.b(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.V(q03) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i11 |= k10.V(kVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i14 = i11;
        if ((74899 & i14) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(70908914, i14, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            Object D10 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D10 == aVar4.a()) {
                D10 = p1.f();
                k10.u(D10);
            }
            C5353v vVar = (C5353v) D10;
            boolean z14 = (458752 & i14) == 131072;
            Object D11 = k10.D();
            if (z14 || D11 == aVar4.a()) {
                D11 = new h(kVar2, vVar, (C17164e<? super h>) null);
                k10.u(D11);
            }
            P.g(kVar2, (p) D11, k10, (i14 >> 15) & 14);
            float f10 = !vVar.isEmpty() ? f7515k : f7514j;
            int i15 = ((i14 >> 6) & 14) | (i14 & 112) | ((i14 >> 3) & 896);
            A1<C5747v0> b10 = q03.b(z13, z12, k10, i15);
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            C5437c.a aVar6 = C5437c.f24302a;
            androidx.compose.ui.d f11 = J.f(cVar2.a(aVar5, aVar6.e()), 0.0f, 1, (Object) null);
            boolean V10 = k10.V(b10);
            Object D12 = k10.D();
            if (V10 || D12 == aVar4.a()) {
                D12 = new i(b10);
                k10.u(D12);
            }
            C5603i.a(f11, (C17642l) D12, k10, 0);
            A1<C5747v0> a10 = q03.a(z13, z12, k10, i15);
            L l10 = (L) k10.Q(M.d());
            float B10 = c2.h.B(((c2.h) k10.Q(M.c())).G() + f10);
            if (!C5747v0.q(h(a10), C4553d0.f7988a.a(k10, 6).n()) || l10 == null) {
                aVar2 = aVar5;
                i12 = i14;
                k10.W(1478489190);
                k10.P();
                j10 = h(a10);
            } else {
                k10.W(1478408187);
                float f12 = B10;
                aVar2 = aVar5;
                i12 = i14;
                j10 = l10.a(h(a10), f12, k10, 0);
                k10.P();
            }
            mVar2 = k10;
            A1<C5747v0> a11 = u.a(j10, (C5546i<C5747v0>) null, (String) null, (C17642l<? super C5747v0, C16807N>) null, k10, 0, 14);
            androidx.compose.ui.d a12 = cVar2.a(aVar2, aVar6.h());
            boolean z15 = (i12 & 57344) == 16384;
            Object D13 = mVar2.D();
            if (z15 || D13 == aVar4.a()) {
                D13 = new j(aVar3);
                mVar2.u(D13);
            }
            C5844O.a(androidx.compose.foundation.b.c(m1.m.b(J.o(androidx.compose.foundation.j.b(A.a(a12, (C17642l) D13), kVar2, C4588v0.g(false, f7508d, 0, mVar2, 54, 4)), f7507c), f10, A0.g.h(), false, 0, 0, 24, (Object) null), i(a11), A0.g.h()), mVar2, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new k(cVar, z10, z11, q02, aVar, kVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final long g(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final long h(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final long i(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final void q(r1.f fVar, long j10, float f10, float f11) {
        float f12 = f11 / ((float) 2);
        r1.f.u0(fVar, j10, C5668h.a(f12, C5667g.n(fVar.N1())), C5668h.a(f10 - f12, C5667g.n(fVar.N1())), f11, k1.f27320b.b(), (V0) null, 0.0f, (C5749w0) null, 0, 480, (Object) null);
    }

    public static final float r() {
        return f7506b;
    }

    public static final float s() {
        return f7505a;
    }
}
