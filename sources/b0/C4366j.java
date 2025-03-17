package B0;

import E0.q0;
import E1.C4469b;
import E1.C4484q;
import E1.C4488v;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import H0.A;
import H0.B;
import H0.C4535m;
import H0.N;
import H0.z;
import HJ.C15854t;
import L1.x;
import N1.C4669d;
import N1.P;
import N1.W;
import N1.Y;
import QJ.F0;
import QJ.Q;
import QJ.T;
import T1.C4832a;
import T1.C4837f;
import T1.C4845n;
import T1.C4849s;
import T1.C4855y;
import T1.H;
import T1.S;
import T1.Z;
import T1.b0;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16795B;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.ui.platform.C1;
import androidx.compose.ui.platform.C5113j1;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g1.C5342k;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n1.C5635o;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5669i;
import p0.G;
import p1.C5728l0;
import p1.C5732n0;
import y0.C6248b;
import y1.C6254b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a×\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010(\u001a'\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010-\u001a7\u00102\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b4\u00105\u001a4\u0010:\u001a\u00020\u0003*\u0002062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u000200H@¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010=\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010<\u001a\u00020\u0011H\u0003¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010?\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b?\u0010@\u001a'\u0010A\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bA\u0010B¨\u0006D²\u0006\f\u0010C\u001a\u00020\u00118\nX\u0002"}, d2 = {"LT1/P;", "value", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "Landroidx/compose/ui/d;", "modifier", "LN1/Y;", "textStyle", "LT1/b0;", "visualTransformation", "LN1/P;", "onTextLayout", "Lr0/m;", "interactionSource", "Lp1/l0;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "LT1/s;", "imeOptions", "LB0/z;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "decorationBox", "a", "(LT1/P;LnI/l;Landroidx/compose/ui/d;LN1/Y;LT1/b0;LnI/l;Lr0/m;Lp1/l0;ZIILT1/s;LB0/z;ZZLnI/q;LU0/m;III)V", "LH0/Q;", "manager", "content", "c", "(Landroidx/compose/ui/d;LH0/Q;LnI/p;LU0/m;I)V", "LB0/B;", "state", "p", "(Landroidx/compose/ui/d;LB0/B;LH0/Q;)Landroidx/compose/ui/d;", "Landroidx/compose/ui/focus/m;", "focusRequester", "allowKeyboard", "r", "(LB0/B;Landroidx/compose/ui/focus/m;Z)V", "LT1/S;", "textInputService", "LT1/H;", "offsetMapping", "q", "(LT1/S;LB0/B;LT1/P;LT1/s;LT1/H;)V", "n", "(LB0/B;)V", "Ly0/b;", "LB0/L;", "textDelegate", "textLayoutResult", "m", "(Ly0/b;LT1/P;LB0/L;LN1/P;LT1/H;LdI/e;)Ljava/lang/Object;", "show", "d", "(LH0/Q;ZLU0/m;I)V", "e", "(LH0/Q;LU0/m;I)V", "o", "(LB0/B;LT1/P;LT1/H;)V", "writeable", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.j  reason: case insensitive filesystem */
public final class C4366j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$a */
    static final class a extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4906c = new a();

        a() {
            super(1);
        }

        public final void a(P p10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {357}, m = "invokeSuspend")
    /* renamed from: B0.j$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f4907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ B f4908d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f4909e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ S f4910f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ H0.Q f4911g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4849s f4912h;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$b$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<Boolean> f4913c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1<Boolean> a12) {
                super(0);
                this.f4913c = a12;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(C4366j.b(this.f4913c));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "writeable", "LXH/N;", "c", "(ZLdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$b$b  reason: collision with other inner class name */
        static final class C0024b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ B f4914a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ S f4915b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0.Q f4916c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4849s f4917d;

            C0024b(B b10, S s10, H0.Q q10, C4849s sVar) {
                this.f4914a = b10;
                this.f4915b = s10;
                this.f4916c = q10;
                this.f4917d = sVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                if (!z10 || !this.f4914a.e()) {
                    C4366j.n(this.f4914a);
                } else {
                    C4366j.q(this.f4915b, this.f4914a, this.f4916c.O(), this.f4917d, this.f4916c.J());
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(B b10, A1<Boolean> a12, S s10, H0.Q q10, C4849s sVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f4908d = b10;
            this.f4909e = a12;
            this.f4910f = s10;
            this.f4911g = q10;
            this.f4912h = sVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f4908d, this.f4909e, this.f4910f, this.f4911g, this.f4912h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f4907c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new a(this.f4909e));
                C0024b bVar = new C0024b(this.f4908d, this.f4910f, this.f4911g, this.f4912h);
                this.f4907c = 1;
                if (r10.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C4366j.n(this.f4908d);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4366j.n(this.f4908d);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$c */
    static final class c extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0.Q f4918c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"B0/j$c$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$c$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H0.Q f4919a;

            public a(H0.Q q10) {
                this.f4919a = q10;
            }

            public void b() {
                this.f4919a.R();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(H0.Q q10) {
            super(1);
            this.f4918c = q10;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f4918c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$d */
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f4920c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S f4921d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T1.P f4922e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4849s f4923f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"B0/j$d$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$d$a */
        public static final class a implements L {
            public void b() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(B b10, S s10, T1.P p10, C4849s sVar) {
            super(1);
            this.f4920c = b10;
            this.f4921d = s10;
            this.f4922e = p10;
            this.f4923f = sVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            if (this.f4920c.e()) {
                B b10 = this.f4920c;
                b10.E(P.f4596a.i(this.f4921d, this.f4922e, b10.n(), this.f4923f, this.f4920c.m(), this.f4920c.l()));
            }
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$e */
    static final class e extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.q<nI.p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f4924c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ B f4925d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f4926e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f4927f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f4928g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Z f4929h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ T1.P f4930i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b0 f4931j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4932k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4933l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4934m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4935n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C6248b f4936o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ H0.Q f4937p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f4938q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f4939r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4940s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ H f4941t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c2.d f4942u;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$e$a */
        static final class a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B f4943c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Y f4944d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f4945e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f4946f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Z f4947g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ T1.P f4948h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ b0 f4949i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f4950j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f4951k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f4952l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f4953m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C6248b f4954n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ H0.Q f4955o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f4956p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ boolean f4957q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ C17642l<P, C16807N> f4958r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ H f4959s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ c2.d f4960t;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: B0.j$e$a$a  reason: collision with other inner class name */
            static final class C0025a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ H0.Q f4961c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ B f4962d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ boolean f4963e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ boolean f4964f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C17642l<P, C16807N> f4965g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ T1.P f4966h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ H f4967i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ c2.d f4968j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ int f4969k;

                @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"B0/j$e$a$a$a", "LE1/I;", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "d", "(LE1/r;Ljava/util/List;I)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: B0.j$e$a$a$a  reason: collision with other inner class name */
                public static final class C0026a implements I {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ B f4970a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C17642l<P, C16807N> f4971b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ T1.P f4972c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ H f4973d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ c2.d f4974e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ int f4975f;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: B0.j$e$a$a$a$a  reason: collision with other inner class name */
                    static final class C0027a extends C17544u implements C17642l<a0.a, C16807N> {

                        /* renamed from: c  reason: collision with root package name */
                        public static final C0027a f4976c = new C0027a();

                        C0027a() {
                            super(1);
                        }

                        public final void a(a0.a aVar) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((a0.a) obj);
                            return C16807N.f139792a;
                        }
                    }

                    C0026a(B b10, C17642l<? super P, C16807N> lVar, T1.P p10, H h10, c2.d dVar, int i10) {
                        this.f4970a = b10;
                        this.f4971b = lVar;
                        this.f4972c = p10;
                        this.f4973d = h10;
                        this.f4974e = dVar;
                        this.f4975f = i10;
                    }

                    public int d(E1.r rVar, List<? extends C4484q> list, int i10) {
                        this.f4970a.v().m(rVar.getLayoutDirection());
                        return this.f4970a.v().c();
                    }

                    public J i(K k10, List<? extends E1.H> list, long j10) {
                        C5342k.a aVar = C5342k.f23395e;
                        B b10 = this.f4970a;
                        C5342k d10 = aVar.d();
                        C4488v vVar = null;
                        C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
                        C5342k f10 = aVar.f(d10);
                        try {
                            d0 j11 = b10.j();
                            P f11 = j11 != null ? j11.f() : null;
                            C16795B<Integer, Integer, P> d11 = P.f4596a.d(this.f4970a.v(), j10, k10.getLayoutDirection(), f11);
                            int intValue = d11.a().intValue();
                            int intValue2 = d11.b().intValue();
                            P c10 = d11.c();
                            if (!C17542s.e(f11, c10)) {
                                B b11 = this.f4970a;
                                if (j11 != null) {
                                    vVar = j11.b();
                                }
                                b11.G(new d0(c10, (C4488v) null, vVar, 2, (DefaultConstructorMarker) null));
                                this.f4971b.invoke(c10);
                                C4366j.o(this.f4970a, this.f4972c, this.f4973d);
                            }
                            B b12 = this.f4970a;
                            c2.d dVar = this.f4974e;
                            int i10 = 0;
                            if (this.f4975f == 1) {
                                i10 = M.a(c10.m(0));
                            }
                            b12.H(dVar.H(i10));
                            return k10.I0(intValue, intValue2, X.m(C16796C.a(C4469b.a(), Integer.valueOf(Math.round(c10.h()))), C16796C.a(C4469b.b(), Integer.valueOf(Math.round(c10.k())))), C0027a.f4976c);
                        } finally {
                            aVar.n(d10, f10, h10);
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0025a(H0.Q q10, B b10, boolean z10, boolean z11, C17642l<? super P, C16807N> lVar, T1.P p10, H h10, c2.d dVar, int i10) {
                    super(2);
                    this.f4961c = q10;
                    this.f4962d = b10;
                    this.f4963e = z10;
                    this.f4964f = z11;
                    this.f4965g = lVar;
                    this.f4966h = p10;
                    this.f4967i = h10;
                    this.f4968j = dVar;
                    this.f4969k = i10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
                /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(U0.C4889m r11, int r12) {
                    /*
                        r10 = this;
                        r0 = r12 & 3
                        r1 = 2
                        if (r0 != r1) goto L_0x0011
                        boolean r0 = r11.l()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0011
                    L_0x000c:
                        r11.L()
                        goto L_0x0102
                    L_0x0011:
                        boolean r0 = U0.C4895p.J()
                        if (r0 == 0) goto L_0x0020
                        r0 = -1
                        java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"
                        r2 = -363167407(0xffffffffea5a8151, float:-6.6039127E25)
                        U0.C4895p.S(r2, r12, r0, r1)
                    L_0x0020:
                        B0.j$e$a$a$a r12 = new B0.j$e$a$a$a
                        B0.B r4 = r10.f4962d
                        nI.l<N1.P, XH.N> r5 = r10.f4965g
                        T1.P r6 = r10.f4966h
                        T1.H r7 = r10.f4967i
                        c2.d r8 = r10.f4968j
                        int r9 = r10.f4969k
                        r3 = r12
                        r3.<init>(r4, r5, r6, r7, r8, r9)
                        androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                        r1 = 0
                        int r2 = U0.C4883j.a(r11, r1)
                        U0.y r3 = r11.s()
                        androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r11, r0)
                        G1.g$a r4 = G1.C4504g.f6515W
                        nI.a r5 = r4.a()
                        U0.f r6 = r11.m()
                        if (r6 != 0) goto L_0x0050
                        U0.C4883j.c()
                    L_0x0050:
                        r11.I()
                        boolean r6 = r11.i()
                        if (r6 == 0) goto L_0x005d
                        r11.p(r5)
                        goto L_0x0060
                    L_0x005d:
                        r11.t()
                    L_0x0060:
                        U0.m r5 = U0.F1.a(r11)
                        nI.p r6 = r4.c()
                        U0.F1.c(r5, r12, r6)
                        nI.p r12 = r4.e()
                        U0.F1.c(r5, r3, r12)
                        nI.p r12 = r4.b()
                        boolean r3 = r5.i()
                        if (r3 != 0) goto L_0x008a
                        java.lang.Object r3 = r5.D()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                        if (r3 != 0) goto L_0x0098
                    L_0x008a:
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                        r5.u(r3)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r5.w(r2, r12)
                    L_0x0098:
                        nI.p r12 = r4.d()
                        U0.F1.c(r5, r0, r12)
                        r11.x()
                        H0.Q r12 = r10.f4961c
                        B0.B r0 = r10.f4962d
                        B0.n r0 = r0.d()
                        B0.n r2 = B0.C4370n.None
                        if (r0 == r2) goto L_0x00cb
                        B0.B r0 = r10.f4962d
                        E1.v r0 = r0.i()
                        if (r0 == 0) goto L_0x00cb
                        B0.B r0 = r10.f4962d
                        E1.v r0 = r0.i()
                        kotlin.jvm.internal.C17542s.g(r0)
                        boolean r0 = r0.c()
                        if (r0 == 0) goto L_0x00cb
                        boolean r0 = r10.f4963e
                        if (r0 == 0) goto L_0x00cb
                        r0 = 1
                        goto L_0x00cc
                    L_0x00cb:
                        r0 = r1
                    L_0x00cc:
                        B0.C4366j.d(r12, r0, r11, r1)
                        B0.B r12 = r10.f4962d
                        B0.n r12 = r12.d()
                        B0.n r0 = B0.C4370n.Cursor
                        if (r12 != r0) goto L_0x00f0
                        boolean r12 = r10.f4964f
                        if (r12 != 0) goto L_0x00f0
                        boolean r12 = r10.f4963e
                        if (r12 == 0) goto L_0x00f0
                        r12 = -2032274(0xffffffffffe0fd6e, float:NaN)
                        r11.W(r12)
                        H0.Q r12 = r10.f4961c
                        B0.C4366j.e(r12, r11, r1)
                        r11.P()
                        goto L_0x00f9
                    L_0x00f0:
                        r12 = -1955394(0xffffffffffe229be, float:NaN)
                        r11.W(r12)
                        r11.P()
                    L_0x00f9:
                        boolean r11 = U0.C4895p.J()
                        if (r11 == 0) goto L_0x0102
                        U0.C4895p.R()
                    L_0x0102:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B0.C4366j.e.a.C0025a.a(U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB0/d0;", "b", "()LB0/d0;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: B0.j$e$a$b */
            static final class b extends C17544u implements C17631a<d0> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ B f4977c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(B b10) {
                    super(0);
                    this.f4977c = b10;
                }

                /* renamed from: b */
                public final d0 invoke() {
                    return this.f4977c.j();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(B b10, Y y10, int i10, int i11, Z z10, T1.P p10, b0 b0Var, androidx.compose.ui.d dVar, androidx.compose.ui.d dVar2, androidx.compose.ui.d dVar3, androidx.compose.ui.d dVar4, C6248b bVar, H0.Q q10, boolean z11, boolean z12, C17642l<? super P, C16807N> lVar, H h10, c2.d dVar5) {
                super(2);
                this.f4943c = b10;
                this.f4944d = y10;
                this.f4945e = i10;
                this.f4946f = i11;
                this.f4947g = z10;
                this.f4948h = p10;
                this.f4949i = b0Var;
                this.f4950j = dVar;
                this.f4951k = dVar2;
                this.f4952l = dVar3;
                this.f4953m = dVar4;
                this.f4954n = bVar;
                this.f4955o = q10;
                this.f4956p = z11;
                this.f4957q = z12;
                this.f4958r = lVar;
                this.f4959s = h10;
                this.f4960t = dVar5;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(2032502107, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                    }
                    androidx.compose.ui.d a10 = C4371o.a(androidx.compose.foundation.layout.J.k(androidx.compose.ui.d.f18749a, this.f4943c.k(), 0.0f, 2, (Object) null), this.f4944d, this.f4945e, this.f4946f);
                    Z z10 = this.f4947g;
                    T1.P p10 = this.f4948h;
                    b0 b0Var = this.f4949i;
                    boolean F10 = mVar.F(this.f4943c);
                    B b10 = this.f4943c;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new b(b10);
                        mVar.u(D10);
                    }
                    N.a(androidx.compose.foundation.relocation.b.b(b0.a(Y.c(a10, z10, p10, b0Var, (C17631a) D10).s(this.f4950j).s(this.f4951k), this.f4944d).s(this.f4952l).s(this.f4953m), this.f4954n), c1.c.e(-363167407, true, new C0025a(this.f4955o, this.f4943c, this.f4956p, this.f4957q, this.f4958r, this.f4948h, this.f4959s, this.f4960t, this.f4946f), mVar, 54), mVar, 48, 0);
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
        e(nI.q<? super nI.p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N> qVar, B b10, Y y10, int i10, int i11, Z z10, T1.P p10, b0 b0Var, androidx.compose.ui.d dVar, androidx.compose.ui.d dVar2, androidx.compose.ui.d dVar3, androidx.compose.ui.d dVar4, C6248b bVar, H0.Q q10, boolean z11, boolean z12, C17642l<? super P, C16807N> lVar, H h10, c2.d dVar5) {
            super(2);
            this.f4924c = qVar;
            this.f4925d = b10;
            this.f4926e = y10;
            this.f4927f = i10;
            this.f4928g = i11;
            this.f4929h = z10;
            this.f4930i = p10;
            this.f4931j = b0Var;
            this.f4932k = dVar;
            this.f4933l = dVar2;
            this.f4934m = dVar3;
            this.f4935n = dVar4;
            this.f4936o = bVar;
            this.f4937p = q10;
            this.f4938q = z11;
            this.f4939r = z12;
            this.f4940s = lVar;
            this.f4941t = h10;
            this.f4942u = dVar5;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-374338080, i11, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                }
                C4889m mVar3 = mVar;
                nI.q<nI.p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> qVar = this.f4924c;
                qVar.invoke(c1.c.e(2032502107, true, new a(this.f4925d, this.f4926e, this.f4927f, this.f4928g, this.f4929h, this.f4930i, this.f4931j, this.f4932k, this.f4933l, this.f4934m, this.f4935n, this.f4936o, this.f4937p, this.f4938q, this.f4939r, this.f4940s, this.f4941t, this.f4942u), mVar3, 54), mVar3, 6);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$f */
    static final class f extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T1.P f4978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<T1.P, C16807N> f4979d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f4980e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Y f4981f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b0 f4982g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4983h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r0.m f4984i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5728l0 f4985j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f4986k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f4987l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f4988m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C4849s f4989n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C4381z f4990o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f4991p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f4992q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ nI.q<nI.p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f4993r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f4994s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f4995t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f4996u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(T1.P p10, C17642l<? super T1.P, C16807N> lVar, androidx.compose.ui.d dVar, Y y10, b0 b0Var, C17642l<? super P, C16807N> lVar2, r0.m mVar, C5728l0 l0Var, boolean z10, int i10, int i11, C4849s sVar, C4381z zVar, boolean z11, boolean z12, nI.q<? super nI.p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N> qVar, int i12, int i13, int i14) {
            super(2);
            this.f4978c = p10;
            this.f4979d = lVar;
            this.f4980e = dVar;
            this.f4981f = y10;
            this.f4982g = b0Var;
            this.f4983h = lVar2;
            this.f4984i = mVar;
            this.f4985j = l0Var;
            this.f4986k = z10;
            this.f4987l = i10;
            this.f4988m = i11;
            this.f4989n = sVar;
            this.f4990o = zVar;
            this.f4991p = z11;
            this.f4992q = z12;
            this.f4993r = qVar;
            this.f4994s = i12;
            this.f4995t = i13;
            this.f4996u = i14;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            T1.P p10 = this.f4978c;
            T1.P p11 = p10;
            C4366j.a(p11, this.f4979d, this.f4980e, this.f4981f, this.f4982g, this.f4983h, this.f4984i, this.f4985j, this.f4986k, this.f4987l, this.f4988m, this.f4989n, this.f4990o, this.f4991p, this.f4992q, this.f4993r, mVar2, M0.a(this.f4994s | 1), M0.a(this.f4995t), this.f4996u);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "it", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$g */
    static final class g extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f4997c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(B b10) {
            super(1);
            this.f4997c = b10;
        }

        public final void a(C4488v vVar) {
            d0 j10 = this.f4997c.j();
            if (j10 != null) {
                j10.h(vVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$h */
    static final class h extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f4998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T1.P f4999d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H f5000e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(B b10, T1.P p10, H h10) {
            super(1);
            this.f4998c = b10;
            this.f4999d = p10;
            this.f5000e = h10;
        }

        public final void a(r1.f fVar) {
            d0 j10 = this.f4998c.j();
            if (j10 != null) {
                T1.P p10 = this.f4999d;
                B b10 = this.f4998c;
                H h10 = this.f5000e;
                C5732n0 e10 = fVar.I1().e();
                P.f4596a.b(e10, p10, b10.q(), b10.c(), h10, j10.f(), b10.f(), b10.p());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln1/o;", "it", "LXH/N;", "a", "(Ln1/o;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$i */
    static final class i extends C17544u implements C17642l<C5635o, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5002d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f5003e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ S f5004f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T1.P f5005g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4849s f5006h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ H f5007i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ H0.Q f5008j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Q f5009k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C6248b f5010l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {340}, m = "invokeSuspend")
        /* renamed from: B0.j$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f5011c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6248b f5012d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ T1.P f5013e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ B f5014f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d0 f5015g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ H f5016h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6248b bVar, T1.P p10, B b10, d0 d0Var, H h10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f5012d = bVar;
                this.f5013e = p10;
                this.f5014f = b10;
                this.f5015g = d0Var;
                this.f5016h = h10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f5012d, this.f5013e, this.f5014f, this.f5015g, this.f5016h, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f5011c;
                if (i10 == 0) {
                    y.b(obj);
                    C6248b bVar = this.f5012d;
                    T1.P p10 = this.f5013e;
                    L v10 = this.f5014f.v();
                    P f11 = this.f5015g.f();
                    H h10 = this.f5016h;
                    this.f5011c = 1;
                    if (C4366j.m(bVar, p10, v10, f11, h10, this) == f10) {
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
        i(B b10, boolean z10, boolean z11, S s10, T1.P p10, C4849s sVar, H h10, H0.Q q10, Q q11, C6248b bVar) {
            super(1);
            this.f5001c = b10;
            this.f5002d = z10;
            this.f5003e = z11;
            this.f5004f = s10;
            this.f5005g = p10;
            this.f5006h = sVar;
            this.f5007i = h10;
            this.f5008j = q10;
            this.f5009k = q11;
            this.f5010l = bVar;
        }

        public final void a(C5635o oVar) {
            d0 j10;
            if (this.f5001c.e() != oVar.a()) {
                this.f5001c.C(oVar.a());
                if (!this.f5001c.e() || !this.f5002d || this.f5003e) {
                    C4366j.n(this.f5001c);
                } else {
                    C4366j.q(this.f5004f, this.f5001c, this.f5005g, this.f5006h, this.f5007i);
                }
                if (oVar.a() && (j10 = this.f5001c.j()) != null) {
                    F0 unused = C16314k.d(this.f5009k, (C17168i) null, (T) null, new a(this.f5010l, this.f5005g, this.f5001c, j10, this.f5007i, (C17164e<? super a>) null), 3, (Object) null);
                }
                if (!oVar.a()) {
                    H0.Q.u(this.f5008j, (C5667g) null, 1, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5635o) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "it", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$j  reason: collision with other inner class name */
    static final class C0028j extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5018d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1 f5019e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ H0.Q f5020f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T1.P f5021g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ H f5022h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0028j(B b10, boolean z10, C1 c12, H0.Q q10, T1.P p10, H h10) {
            super(1);
            this.f5017c = b10;
            this.f5018d = z10;
            this.f5019e = c12;
            this.f5020f = q10;
            this.f5021g = p10;
            this.f5022h = h10;
        }

        public final void a(C4488v vVar) {
            this.f5017c.F(vVar);
            d0 j10 = this.f5017c.j();
            if (j10 != null) {
                j10.i(vVar);
            }
            if (this.f5018d) {
                if (this.f5017c.d() == C4370n.Selection) {
                    if (!this.f5017c.s() || !this.f5019e.a()) {
                        this.f5020f.R();
                    } else {
                        this.f5020f.l0();
                    }
                    this.f5017c.M(H0.S.c(this.f5020f, true));
                    this.f5017c.L(H0.S.c(this.f5020f, false));
                    this.f5017c.J(W.h(this.f5021g.h()));
                } else if (this.f5017c.d() == C4370n.Cursor) {
                    this.f5017c.J(H0.S.c(this.f5020f, true));
                }
                C4366j.o(this.f5017c, this.f5021g, this.f5022h);
                d0 j11 = this.f5017c.j();
                if (j11 != null) {
                    B b10 = this.f5017c;
                    T1.P p10 = this.f5021g;
                    H h10 = this.f5022h;
                    T1.Y g10 = b10.g();
                    if (g10 != null && b10.e()) {
                        P.f4596a.k(g10, p10, h10, j11);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$k */
    static final class k extends C17544u implements C17642l<Boolean, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5023c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(B b10) {
            super(1);
            this.f5023c = b10;
        }

        public final void a(boolean z10) {
            this.f5023c.D(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "offset", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$l */
    static final class l extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f5025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f5026e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f5027f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ H0.Q f5028g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ H f5029h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(B b10, androidx.compose.ui.focus.m mVar, boolean z10, boolean z11, H0.Q q10, H h10) {
            super(1);
            this.f5024c = b10;
            this.f5025d = mVar;
            this.f5026e = z10;
            this.f5027f = z11;
            this.f5028g = q10;
            this.f5029h = h10;
        }

        public final void a(long j10) {
            C4366j.r(this.f5024c, this.f5025d, !this.f5026e);
            if (this.f5024c.e() && this.f5027f) {
                if (this.f5024c.d() != C4370n.Selection) {
                    d0 j11 = this.f5024c.j();
                    if (j11 != null) {
                        B b10 = this.f5024c;
                        long j12 = j10;
                        P.f4596a.j(j12, j11, b10.n(), this.f5029h, b10.m());
                        if (b10.v().k().length() > 0) {
                            b10.B(C4370n.Cursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f5028g.t(C5667g.d(j10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB0/Z;", "b", "()LB0/Z;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$m */
    static final class m extends C17544u implements C17631a<Z> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p0.v f5030c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(p0.v vVar) {
            super(0);
            this.f5030c = vVar;
        }

        /* renamed from: b */
        public final Z invoke() {
            return new Z(this.f5030c, 0.0f, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$n */
    static final class n extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Z f5031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T1.P f5032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f5033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f5034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f5035g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4849s f5036h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ B f5037i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ H f5038j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ H0.Q f5039k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f5040l;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0.Q f5041c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(H0.Q q10) {
                super(0);
                this.f5041c = q10;
            }

            public final Boolean invoke() {
                this.f5041c.T();
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LN1/P;", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$n$b */
        static final class b extends C17544u implements C17642l<List<P>, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B f5042c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(B b10) {
                super(1);
                this.f5042c = b10;
            }

            /* renamed from: a */
            public final Boolean invoke(List<P> list) {
                boolean z10;
                if (this.f5042c.j() != null) {
                    d0 j10 = this.f5042c.j();
                    C17542s.g(j10);
                    list.add(j10.f());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/d;", "text", "", "a", "(LN1/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$n$c */
        static final class c extends C17544u implements C17642l<C4669d, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B f5043c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ x f5044d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(B b10, x xVar) {
                super(1);
                this.f5043c = b10;
                this.f5044d = xVar;
            }

            /* renamed from: a */
            public final Boolean invoke(C4669d dVar) {
                C16807N n10;
                T1.Y g10 = this.f5043c.g();
                if (g10 != null) {
                    B b10 = this.f5043c;
                    P.f4596a.g(C16877v.q(new C4837f(), new C4832a(dVar, 1)), b10.n(), b10.m(), g10);
                    n10 = C16807N.f139792a;
                } else {
                    n10 = null;
                }
                if (n10 == null) {
                    this.f5043c.m().invoke(new T1.P(dVar.j(), N1.X.a(dVar.j().length()), (W) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/d;", "text", "", "a", "(LN1/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$n$d */
        static final class d extends C17544u implements C17642l<C4669d, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f5045c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f5046d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ B f5047e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ x f5048f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ T1.P f5049g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(boolean z10, boolean z11, B b10, x xVar, T1.P p10) {
                super(1);
                this.f5045c = z10;
                this.f5046d = z11;
                this.f5047e = b10;
                this.f5048f = xVar;
                this.f5049g = p10;
            }

            /* renamed from: a */
            public final Boolean invoke(C4669d dVar) {
                C16807N n10;
                if (this.f5045c || !this.f5046d) {
                    return Boolean.FALSE;
                }
                T1.Y g10 = this.f5047e.g();
                if (g10 != null) {
                    B b10 = this.f5047e;
                    P.f4596a.g(C16877v.q(new C4845n(), new C4832a(dVar, 1)), b10.n(), b10.m(), g10);
                    n10 = C16807N.f139792a;
                } else {
                    n10 = null;
                }
                if (n10 == null) {
                    T1.P p10 = this.f5049g;
                    this.f5047e.m().invoke(new T1.P(C15854t.S0(p10.i(), W.n(p10.h()), W.i(p10.h()), dVar).toString(), N1.X.a(W.n(p10.h()) + dVar.length()), (W) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectionStart", "selectionEnd", "", "relativeToOriginalText", "a", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.j$n$e */
        static final class e extends C17544u implements nI.q<Integer, Integer, Boolean, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H f5050c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f5051d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ T1.P f5052e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ H0.Q f5053f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ B f5054g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(H h10, boolean z10, T1.P p10, H0.Q q10, B b10) {
                super(3);
                this.f5050c = h10;
                this.f5051d = z10;
                this.f5052e = p10;
                this.f5053f = q10;
                this.f5054g = b10;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = this.f5050c.a(i10);
                }
                if (!z10) {
                    i11 = this.f5050c.a(i11);
                }
                boolean z11 = false;
                if (this.f5051d && !(i10 == W.n(this.f5052e.h()) && i11 == W.i(this.f5052e.h()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > this.f5052e.f().length()) {
                        this.f5053f.x();
                    } else {
                        if (z10 || i10 == i11) {
                            this.f5053f.x();
                        } else {
                            H0.Q.w(this.f5053f, false, 1, (Object) null);
                        }
                        this.f5054g.m().invoke(new T1.P(this.f5052e.f(), N1.X.b(i10, i11), (W) null, 4, (DefaultConstructorMarker) null));
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$f */
        static final class f extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B f5055c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4849s f5056d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(B b10, C4849s sVar) {
                super(0);
                this.f5055c = b10;
                this.f5056d = sVar;
            }

            public final Boolean invoke() {
                this.f5055c.l().invoke(T1.r.j(this.f5056d.e()));
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$g */
        static final class g extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B f5057c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.m f5058d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f5059e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(B b10, androidx.compose.ui.focus.m mVar, boolean z10) {
                super(0);
                this.f5057c = b10;
                this.f5058d = mVar;
                this.f5059e = z10;
            }

            public final Boolean invoke() {
                C4366j.r(this.f5057c, this.f5058d, !this.f5059e);
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$h */
        static final class h extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0.Q f5060c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(H0.Q q10) {
                super(0);
                this.f5060c = q10;
            }

            public final Boolean invoke() {
                H0.Q.w(this.f5060c, false, 1, (Object) null);
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$i */
        static final class i extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0.Q f5061c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            i(H0.Q q10) {
                super(0);
                this.f5061c = q10;
            }

            public final Boolean invoke() {
                H0.Q.p(this.f5061c, false, 1, (Object) null);
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.j$n$j  reason: collision with other inner class name */
        static final class C0029j extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0.Q f5062c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0029j(H0.Q q10) {
                super(0);
                this.f5062c = q10;
            }

            public final Boolean invoke() {
                this.f5062c.s();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(Z z10, T1.P p10, boolean z11, boolean z12, boolean z13, C4849s sVar, B b10, H h10, H0.Q q10, androidx.compose.ui.focus.m mVar) {
            super(1);
            this.f5031c = z10;
            this.f5032d = p10;
            this.f5033e = z11;
            this.f5034f = z12;
            this.f5035g = z13;
            this.f5036h = sVar;
            this.f5037i = b10;
            this.f5038j = h10;
            this.f5039k = q10;
            this.f5040l = mVar;
        }

        public final void a(x xVar) {
            x xVar2 = xVar;
            L1.v.f0(xVar2, this.f5031c.b());
            L1.v.v0(xVar2, this.f5032d.h());
            if (!this.f5033e) {
                L1.v.l(xVar);
            }
            if (this.f5034f) {
                L1.v.O(xVar);
            }
            boolean z10 = this.f5033e && !this.f5035g;
            L1.v.e0(xVar2, z10);
            L1.v.u(xVar2, (String) null, new b(this.f5037i), 1, (Object) null);
            if (z10) {
                L1.v.u0(xVar2, (String) null, new c(this.f5037i, xVar2), 1, (Object) null);
                L1.v.y(xVar2, (String) null, new d(this.f5035g, this.f5033e, this.f5037i, xVar, this.f5032d), 1, (Object) null);
            }
            L1.v.o0(xVar2, (String) null, new e(this.f5038j, this.f5033e, this.f5032d, this.f5039k, this.f5037i), 1, (Object) null);
            L1.v.D(xVar, this.f5036h.e(), (String) null, new f(this.f5037i, this.f5036h), 2, (Object) null);
            L1.v.B(xVar2, (String) null, new g(this.f5037i, this.f5040l, this.f5035g), 1, (Object) null);
            L1.v.F(xVar2, (String) null, new h(this.f5039k), 1, (Object) null);
            if (!W.h(this.f5032d.h()) && !this.f5034f) {
                L1.v.h(xVar2, (String) null, new i(this.f5039k), 1, (Object) null);
                if (this.f5033e && !this.f5035g) {
                    L1.v.j(xVar2, (String) null, new C0029j(this.f5039k), 1, (Object) null);
                }
            }
            if (this.f5033e && !this.f5035g) {
                L1.v.Q(xVar2, (String) null, new a(this.f5039k), 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$o */
    static final class o extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f5064d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4849s f5065e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q0 f5066f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(B b10, androidx.compose.ui.focus.m mVar, C4849s sVar, q0 q0Var) {
            super(0);
            this.f5063c = b10;
            this.f5064d = mVar;
            this.f5065e = sVar;
            this.f5066f = q0Var;
        }

        public final Boolean invoke() {
            if (!this.f5063c.e()) {
                this.f5064d.f();
            }
            int f10 = this.f5065e.f();
            C4855y.a aVar = C4855y.f13650b;
            if (!C4855y.n(f10, aVar.f()) && !C4855y.n(this.f5065e.f(), aVar.e())) {
                this.f5066f.k();
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$p */
    static final class p extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f5067c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0.Q f5068d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f5069e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5070f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(androidx.compose.ui.d dVar, H0.Q q10, nI.p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f5067c = dVar;
            this.f5068d = q10;
            this.f5069e = pVar;
            this.f5070f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4366j.c(this.f5067c, this.f5068d, this.f5069e, mVar, M0.a(this.f5070f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$q */
    static final class q extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0.Q f5071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5072d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(H0.Q q10, boolean z10, int i10) {
            super(2);
            this.f5071c = q10;
            this.f5072d = z10;
            this.f5073e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4366j.d(this.f5071c, this.f5072d, mVar, M0.a(this.f5073e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$r */
    static final class r implements C4535m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f5074a;

        r(long j10) {
            this.f5074a = j10;
        }

        public final long a() {
            return this.f5074a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1", f = "CoreTextField.kt", l = {1198}, m = "invokeSuspend")
    /* renamed from: B0.j$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements nI.p<A1.K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f5075c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f5076d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ N f5077e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ H0.Q f5078f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B0.j$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f5079c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f5080d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ A1.K f5081e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ N f5082f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ H0.Q f5083g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1202}, m = "invokeSuspend")
            /* renamed from: B0.j$s$a$a  reason: collision with other inner class name */
            static final class C0030a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f5084c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ A1.K f5085d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ N f5086e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0030a(A1.K k10, N n10, C17164e<? super C0030a> eVar) {
                    super(2, eVar);
                    this.f5085d = k10;
                    this.f5086e = n10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0030a(this.f5085d, this.f5086e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0030a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f5084c;
                    if (i10 == 0) {
                        y.b(obj);
                        A1.K k10 = this.f5085d;
                        N n10 = this.f5086e;
                        this.f5084c = 1;
                        if (E.c(k10, n10, this) == f10) {
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
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1205}, m = "invokeSuspend")
            /* renamed from: B0.j$s$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f5087c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ A1.K f5088d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ H0.Q f5089e;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: B0.j$s$a$b$a  reason: collision with other inner class name */
                static final class C0031a extends C17544u implements C17642l<C5667g, C16807N> {

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ H0.Q f5090c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0031a(H0.Q q10) {
                        super(1);
                        this.f5090c = q10;
                    }

                    public final void a(long j10) {
                        this.f5090c.l0();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((C5667g) obj).v());
                        return C16807N.f139792a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(A1.K k10, H0.Q q10, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f5088d = k10;
                    this.f5089e = q10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new b(this.f5088d, this.f5089e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f5087c;
                    if (i10 == 0) {
                        y.b(obj);
                        A1.K k10 = this.f5088d;
                        C0031a aVar = new C0031a(this.f5089e);
                        this.f5087c = 1;
                        if (G.j(k10, (C17642l) null, (C17642l) null, (nI.q) null, aVar, this, 7, (Object) null) == f10) {
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
            a(A1.K k10, N n10, H0.Q q10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f5081e = k10;
                this.f5082f = n10;
                this.f5083g = q10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f5081e, this.f5082f, this.f5083g, eVar);
                aVar.f5080d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f5079c == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f5080d;
                    T t10 = T.UNDISPATCHED;
                    T t11 = t10;
                    F0 unused = C16314k.d(q10, (C17168i) null, t11, new C0030a(this.f5081e, this.f5082f, (C17164e<? super C0030a>) null), 1, (Object) null);
                    F0 unused2 = C16314k.d(q10, (C17168i) null, t11, new b(this.f5081e, this.f5083g, (C17164e<? super b>) null), 1, (Object) null);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(N n10, H0.Q q10, C17164e<? super s> eVar) {
            super(2, eVar);
            this.f5077e = n10;
            this.f5078f = q10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            s sVar = new s(this.f5077e, this.f5078f, eVar);
            sVar.f5076d = obj;
            return sVar;
        }

        /* renamed from: i */
        public final Object invoke(A1.K k10, C17164e<? super C16807N> eVar) {
            return ((s) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f5075c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a((A1.K) this.f5076d, this.f5077e, this.f5078f, (C17164e<? super a>) null);
                this.f5075c = 1;
                if (QJ.S.f(aVar, this) == f10) {
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
    /* renamed from: B0.j$t */
    static final class t extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f5091c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(long j10) {
            super(1);
            this.f5091c = j10;
        }

        public final void a(x xVar) {
            xVar.b(B.d(), new A(C4369m.Cursor, this.f5091c, z.Middle, true, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.j$u */
    static final class u extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0.Q f5092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(H0.Q q10, int i10) {
            super(2);
            this.f5092c = q10;
            this.f5093d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4366j.e(this.f5092c, mVar, M0.a(this.f5093d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.j$v */
    static final class v extends C17544u implements C17642l<C6254b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f5094c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0.Q f5095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(B b10, H0.Q q10) {
            super(1);
            this.f5094c = b10;
            this.f5095d = q10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f5094c.d() != C4370n.Selection || !C4375t.a(keyEvent)) {
                z10 = false;
            } else {
                z10 = true;
                H0.Q.u(this.f5095d, (C5667g) null, 1, (Object) null);
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: nI.q<? super nI.p<? super U0.m, ? super java.lang.Integer, XH.N>, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: B0.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: nI.q<? super nI.p<? super U0.m, ? super java.lang.Integer, XH.N>, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: nI.q<? super nI.p<? super U0.m, ? super java.lang.Integer, XH.N>, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: nI.q<nI.p<? super U0.m, ? super java.lang.Integer, XH.N>, U0.m, java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: nI.q<? super nI.p<? super U0.m, ? super java.lang.Integer, XH.N>, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: B0.j$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: B0.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: B0.j$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: B0.j$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: B0.j$n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v16, resolved type: B0.j$n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v17, resolved type: B0.j$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v18, resolved type: B0.j$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v19, resolved type: B0.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v20, resolved type: B0.j$i} */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03bc, code lost:
        if (r9 == r2.a()) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05df, code lost:
        if (r5 == r2.a()) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0654, code lost:
        if (r9 == r2.a()) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06c5, code lost:
        if (r9 == r2.a()) goto L_0x06c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0762, code lost:
        if (r1 == r2.a()) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07ce, code lost:
        if (r5 == r2.a()) goto L_0x07d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x07f7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0857  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x08c0  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x08c2  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0938  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x093b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x09ab  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x09d0  */
    /* JADX WARNING: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(T1.P r54, nI.C17642l<? super T1.P, XH.C16807N> r55, androidx.compose.ui.d r56, N1.Y r57, T1.b0 r58, nI.C17642l<? super N1.P, XH.C16807N> r59, r0.m r60, p1.C5728l0 r61, boolean r62, int r63, int r64, T1.C4849s r65, B0.C4381z r66, boolean r67, boolean r68, nI.q<? super nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N>, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r69, U0.C4889m r70, int r71, int r72, int r73) {
        /*
            r15 = r54
            r14 = r71
            r13 = r72
            r12 = r73
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r1 = r70
            U0.m r11 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r11.V(r15)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            r10 = r55
            goto L_0x0043
        L_0x0031:
            r4 = r14 & 48
            r10 = r55
            if (r4 != 0) goto L_0x0043
            boolean r4 = r11.F(r10)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r9 = r56
            goto L_0x005f
        L_0x004c:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0049
            r9 = r56
            boolean r16 = r11.V(r9)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r16
        L_0x005f:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r7 = r57
            goto L_0x007d
        L_0x006a:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r57
            boolean r19 = r11.V(r7)
            if (r19 == 0) goto L_0x0079
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r1 = r1 | r19
        L_0x007d:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r2 = r58
            goto L_0x009b
        L_0x0088:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0085
            r2 = r58
            boolean r23 = r11.V(r2)
            if (r23 == 0) goto L_0x0097
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r23 = r20
        L_0x0099:
            r1 = r1 | r23
        L_0x009b:
            r23 = r12 & 32
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00aa
            r1 = r1 | r26
            r6 = r59
            goto L_0x00bd
        L_0x00aa:
            r27 = r14 & r26
            r6 = r59
            if (r27 != 0) goto L_0x00bd
            boolean r28 = r11.F(r6)
            if (r28 == 0) goto L_0x00b9
            r28 = r25
            goto L_0x00bb
        L_0x00b9:
            r28 = r24
        L_0x00bb:
            r1 = r1 | r28
        L_0x00bd:
            r28 = r12 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00c8
            r1 = r1 | r29
            r5 = r60
            goto L_0x00db
        L_0x00c8:
            r29 = r14 & r29
            r5 = r60
            if (r29 != 0) goto L_0x00db
            boolean r30 = r11.V(r5)
            if (r30 == 0) goto L_0x00d7
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r30
        L_0x00db:
            r8 = r12 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00e6
            r1 = r1 | r31
            r3 = r61
            goto L_0x00f9
        L_0x00e6:
            r31 = r14 & r31
            r3 = r61
            if (r31 != 0) goto L_0x00f9
            boolean r32 = r11.V(r3)
            if (r32 == 0) goto L_0x00f5
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r32
        L_0x00f9:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0104
            r1 = r1 | r33
            r2 = r62
            goto L_0x0117
        L_0x0104:
            r33 = r14 & r33
            r2 = r62
            if (r33 != 0) goto L_0x0117
            boolean r33 = r11.b(r2)
            if (r33 == 0) goto L_0x0113
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r33
        L_0x0117:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0122
            r1 = r1 | r33
            r3 = r63
            goto L_0x0135
        L_0x0122:
            r33 = r14 & r33
            r3 = r63
            if (r33 != 0) goto L_0x0135
            boolean r33 = r11.d(r3)
            if (r33 == 0) goto L_0x0131
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r33
        L_0x0135:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013e
            r33 = r13 | 6
            r5 = r64
            goto L_0x0154
        L_0x013e:
            r33 = r13 & 6
            r5 = r64
            if (r33 != 0) goto L_0x0152
            boolean r33 = r11.d(r5)
            if (r33 == 0) goto L_0x014d
            r33 = 4
            goto L_0x014f
        L_0x014d:
            r33 = 2
        L_0x014f:
            r33 = r13 | r33
            goto L_0x0154
        L_0x0152:
            r33 = r13
        L_0x0154:
            r34 = r13 & 48
            if (r34 != 0) goto L_0x0170
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0167
            r5 = r65
            boolean r34 = r11.V(r5)
            if (r34 == 0) goto L_0x0169
            r34 = 32
            goto L_0x016b
        L_0x0167:
            r5 = r65
        L_0x0169:
            r34 = 16
        L_0x016b:
            r33 = r33 | r34
        L_0x016d:
            r5 = r33
            goto L_0x0173
        L_0x0170:
            r5 = r65
            goto L_0x016d
        L_0x0173:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x017c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0179:
            r7 = r66
            goto L_0x018f
        L_0x017c:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0179
            r7 = r66
            boolean r33 = r11.V(r7)
            if (r33 == 0) goto L_0x018b
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x018d
        L_0x018b:
            r18 = 128(0x80, float:1.794E-43)
        L_0x018d:
            r5 = r5 | r18
        L_0x018f:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0198
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0195:
            r9 = r67
            goto L_0x01a8
        L_0x0198:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0195
            r9 = r67
            boolean r18 = r11.b(r9)
            if (r18 == 0) goto L_0x01a6
            r17 = 2048(0x800, float:2.87E-42)
        L_0x01a6:
            r5 = r5 | r17
        L_0x01a8:
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01b1
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x01ae:
            r10 = r68
            goto L_0x01c1
        L_0x01b1:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x01ae
            r10 = r68
            boolean r17 = r11.b(r10)
            if (r17 == 0) goto L_0x01bf
            r20 = 16384(0x4000, float:2.2959E-41)
        L_0x01bf:
            r5 = r5 | r20
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            if (r17 == 0) goto L_0x01cd
            r5 = r5 | r26
            r10 = r69
            goto L_0x01dd
        L_0x01cd:
            r18 = r13 & r26
            r10 = r69
            if (r18 != 0) goto L_0x01dd
            boolean r18 = r11.F(r10)
            if (r18 == 0) goto L_0x01db
            r24 = r25
        L_0x01db:
            r5 = r5 | r24
        L_0x01dd:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r1 & r18
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0219
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r5
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r13) goto L_0x0219
            boolean r10 = r11.l()
            if (r10 != 0) goto L_0x01f7
            goto L_0x0219
        L_0x01f7:
            r11.L()
            r3 = r56
            r4 = r57
            r5 = r58
            r6 = r59
            r7 = r60
            r8 = r61
            r9 = r62
            r10 = r63
            r12 = r65
            r13 = r66
            r14 = r67
            r15 = r68
            r16 = r69
            r2 = r11
            r11 = r64
            goto L_0x09ca
        L_0x0219:
            r11.G()
            r10 = r14 & 1
            if (r10 == 0) goto L_0x024e
            boolean r10 = r11.O()
            if (r10 == 0) goto L_0x0227
            goto L_0x024e
        L_0x0227:
            r11.L()
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0230
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0230:
            r14 = r56
            r20 = r57
            r13 = r58
            r21 = r59
            r10 = r60
            r24 = r61
            r25 = r62
            r9 = r63
            r26 = r64
            r8 = r65
            r28 = r66
            r7 = r67
            r33 = r68
            r34 = r69
            goto L_0x02fa
        L_0x024e:
            if (r4 == 0) goto L_0x0253
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0255
        L_0x0253:
            r4 = r56
        L_0x0255:
            if (r16 == 0) goto L_0x025e
            N1.Y$a r10 = N1.Y.f9422d
            N1.Y r10 = r10.a()
            goto L_0x0260
        L_0x025e:
            r10 = r57
        L_0x0260:
            if (r19 == 0) goto L_0x0269
            T1.b0$a r16 = T1.b0.f13577a
            T1.b0 r16 = r16.c()
            goto L_0x026b
        L_0x0269:
            r16 = r58
        L_0x026b:
            if (r23 == 0) goto L_0x0270
            B0.j$a r19 = B0.C4366j.a.f4906c
            goto L_0x0272
        L_0x0270:
            r19 = r59
        L_0x0272:
            if (r28 == 0) goto L_0x0277
            r20 = 0
            goto L_0x0279
        L_0x0277:
            r20 = r60
        L_0x0279:
            if (r8 == 0) goto L_0x028a
            p1.j1 r8 = new p1.j1
            p1.v0$a r21 = p1.C5747v0.f27350b
            long r13 = r21.i()
            r56 = r4
            r4 = 0
            r8.<init>(r13, r4)
            goto L_0x028e
        L_0x028a:
            r56 = r4
            r8 = r61
        L_0x028e:
            if (r0 == 0) goto L_0x0292
            r0 = 1
            goto L_0x0294
        L_0x0292:
            r0 = r62
        L_0x0294:
            if (r2 == 0) goto L_0x029a
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x029c
        L_0x029a:
            r2 = r63
        L_0x029c:
            if (r3 == 0) goto L_0x02a0
            r3 = 1
            goto L_0x02a2
        L_0x02a0:
            r3 = r64
        L_0x02a2:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x02af
            T1.s$a r4 = T1.C4849s.f13631g
            T1.s r4 = r4.a()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02b1
        L_0x02af:
            r4 = r65
        L_0x02b1:
            if (r6 == 0) goto L_0x02ba
            B0.z$a r6 = B0.C4381z.f5150g
            B0.z r6 = r6.a()
            goto L_0x02bc
        L_0x02ba:
            r6 = r66
        L_0x02bc:
            if (r7 == 0) goto L_0x02c0
            r7 = 1
            goto L_0x02c2
        L_0x02c0:
            r7 = r67
        L_0x02c2:
            if (r9 == 0) goto L_0x02c6
            r9 = 0
            goto L_0x02c8
        L_0x02c6:
            r9 = r68
        L_0x02c8:
            if (r17 == 0) goto L_0x02eb
            B0.g r13 = B0.C4363g.f4859a
            nI.q r13 = r13.a()
            r14 = r56
            r25 = r0
            r26 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            r34 = r13
        L_0x02de:
            r13 = r16
            r21 = r19
            r9 = r2
            r8 = r4
            r53 = r20
            r20 = r10
            r10 = r53
            goto L_0x02fa
        L_0x02eb:
            r14 = r56
            r34 = r69
            r25 = r0
            r26 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            goto L_0x02de
        L_0x02fa:
            r11.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x030b
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)"
            r2 = -958708118(0xffffffffc6db466a, float:-28067.207)
            U0.C4895p.S(r2, r1, r5, r0)
        L_0x030b:
            java.lang.Object r0 = r11.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            if (r0 != r3) goto L_0x031f
            androidx.compose.ui.focus.m r0 = new androidx.compose.ui.focus.m
            r0.<init>()
            r11.u(r0)
        L_0x031f:
            androidx.compose.ui.focus.m r0 = (androidx.compose.ui.focus.m) r0
            java.lang.Object r3 = r11.D()
            java.lang.Object r4 = r2.a()
            if (r3 != r4) goto L_0x0332
            E0.q0 r3 = E0.r0.b()
            r11.u(r3)
        L_0x0332:
            E0.q0 r3 = (E0.q0) r3
            java.lang.Object r4 = r11.D()
            java.lang.Object r6 = r2.a()
            if (r4 != r6) goto L_0x0346
            T1.S r4 = new T1.S
            r4.<init>(r3)
            r11.u(r4)
        L_0x0346:
            T1.S r4 = (T1.S) r4
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r6 = r11.Q(r6)
            r19 = r6
            c2.d r19 = (c2.d) r19
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.g()
            java.lang.Object r6 = r11.Q(r6)
            S1.m$b r6 = (S1.C4820m.b) r6
            U0.I0 r12 = H0.W.b()
            java.lang.Object r12 = r11.Q(r12)
            H0.V r12 = (H0.V) r12
            long r16 = r12.a()
            U0.I0 r12 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r12 = r11.Q(r12)
            n1.f r12 = (n1.C5626f) r12
            r32 = r14
            U0.I0 r14 = androidx.compose.ui.platform.C5100f0.s()
            java.lang.Object r14 = r11.Q(r14)
            androidx.compose.ui.platform.C1 r14 = (androidx.compose.ui.platform.C1) r14
            r68 = r3
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.o()
            java.lang.Object r3 = r11.Q(r3)
            androidx.compose.ui.platform.j1 r3 = (androidx.compose.ui.platform.C5113j1) r3
            r69 = r14
            r14 = 1
            if (r9 != r14) goto L_0x039e
            if (r25 != 0) goto L_0x039e
            boolean r14 = r8.h()
            if (r14 == 0) goto L_0x039e
            p0.v r14 = p0.v.Horizontal
            goto L_0x03a0
        L_0x039e:
            p0.v r14 = p0.v.Vertical
        L_0x03a0:
            java.lang.Object[] r35 = new java.lang.Object[]{r14}
            B0.Z$c r36 = B0.Z.f4680f
            f1.k r36 = r36.a()
            boolean r37 = r11.V(r14)
            r38 = r9
            java.lang.Object r9 = r11.D()
            if (r37 != 0) goto L_0x03bf
            r37 = r10
            java.lang.Object r10 = r2.a()
            if (r9 != r10) goto L_0x03c9
            goto L_0x03c1
        L_0x03bf:
            r37 = r10
        L_0x03c1:
            B0.j$m r9 = new B0.j$m
            r9.<init>(r14)
            r11.u(r9)
        L_0x03c9:
            nI.a r9 = (nI.C17631a) r9
            r10 = 0
            r14 = 4
            r39 = 0
            r56 = r35
            r57 = r36
            r58 = r39
            r59 = r9
            r60 = r11
            r61 = r10
            r62 = r14
            java.lang.Object r9 = f1.C5301c.e(r56, r57, r58, r59, r60, r61, r62)
            B0.Z r9 = (B0.Z) r9
            r10 = r1 & 14
            r14 = 4
            if (r10 != r14) goto L_0x03ea
            r14 = 1
            goto L_0x03eb
        L_0x03ea:
            r14 = 0
        L_0x03eb:
            r35 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r35
            r35 = r9
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r9) goto L_0x03f8
            r1 = 1
            goto L_0x03f9
        L_0x03f8:
            r1 = 0
        L_0x03f9:
            r1 = r1 | r14
            java.lang.Object r9 = r11.D()
            if (r1 != 0) goto L_0x040a
            java.lang.Object r1 = r2.a()
            if (r9 != r1) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            r36 = r8
            goto L_0x0430
        L_0x040a:
            N1.d r1 = r54.f()
            T1.Z r1 = B0.s0.c(r13, r1)
            N1.W r9 = r54.g()
            if (r9 == 0) goto L_0x042a
            r14 = r8
            long r8 = r9.r()
            r36 = r14
            B0.P$a r14 = B0.P.f4596a
            T1.Z r8 = r14.a(r8, r1)
            if (r8 != 0) goto L_0x0428
            goto L_0x042c
        L_0x0428:
            r9 = r8
            goto L_0x042d
        L_0x042a:
            r36 = r8
        L_0x042c:
            r9 = r1
        L_0x042d:
            r11.u(r9)
        L_0x0430:
            r1 = r9
            T1.Z r1 = (T1.Z) r1
            N1.d r8 = r1.b()
            T1.H r14 = r1.a()
            r39 = r1
            r9 = 0
            U0.K0 r1 = U0.C4883j.b(r11, r9)
            boolean r9 = r11.V(r3)
            r40 = r10
            java.lang.Object r10 = r11.D()
            if (r9 != 0) goto L_0x0454
            java.lang.Object r9 = r2.a()
            if (r10 != r9) goto L_0x0485
        L_0x0454:
            B0.B r10 = new B0.B
            B0.L r9 = new B0.L
            r41 = 300(0x12c, float:4.2E-43)
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r56 = r9
            r57 = r8
            r58 = r20
            r59 = r43
            r60 = r44
            r61 = r25
            r62 = r45
            r63 = r19
            r64 = r6
            r65 = r46
            r66 = r41
            r67 = r42
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r10.<init>(r9, r1, r3)
            r11.u(r10)
        L_0x0485:
            r3 = r10
            B0.B r3 = (B0.B) r3
            N1.d r1 = r54.f()
            r56 = r3
            r57 = r1
            r58 = r8
            r59 = r20
            r60 = r25
            r61 = r19
            r62 = r6
            r63 = r55
            r64 = r28
            r65 = r12
            r66 = r16
            r56.N(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            T1.k r1 = r3.n()
            T1.Y r6 = r3.g()
            r1.d(r15, r6)
            java.lang.Object r1 = r11.D()
            java.lang.Object r6 = r2.a()
            if (r1 != r6) goto L_0x04c5
            B0.o0 r1 = new B0.o0
            r6 = 0
            r8 = 0
            r9 = 1
            r1.<init>(r8, r9, r6)
            r11.u(r1)
        L_0x04c5:
            B0.o0 r1 = (B0.o0) r1
            r6 = 2
            r8 = 0
            r9 = 0
            r56 = r1
            r57 = r54
            r58 = r9
            r60 = r6
            r61 = r8
            B0.o0.f(r56, r57, r58, r60, r61)
            java.lang.Object r6 = r11.D()
            java.lang.Object r8 = r2.a()
            if (r6 != r8) goto L_0x04ea
            H0.Q r6 = new H0.Q
            r6.<init>(r1)
            r11.u(r6)
        L_0x04ea:
            r10 = r6
            H0.Q r10 = (H0.Q) r10
            r10.e0(r14)
            r10.k0(r13)
            nI.l r6 = r3.m()
            r10.f0(r6)
            r10.h0(r3)
            r10.j0(r15)
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.d()
            java.lang.Object r6 = r11.Q(r6)
            androidx.compose.ui.platform.d0 r6 = (androidx.compose.ui.platform.C5094d0) r6
            r10.V(r6)
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.p()
            java.lang.Object r6 = r11.Q(r6)
            androidx.compose.ui.platform.m1 r6 = (androidx.compose.ui.platform.m1) r6
            r10.i0(r6)
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.i()
            java.lang.Object r6 = r11.Q(r6)
            w1.a r6 = (w1.C6203a) r6
            r10.d0(r6)
            r10.b0(r0)
            r6 = r33 ^ 1
            r10.Z(r6)
            r10.a0(r7)
            java.lang.Object r6 = r11.D()
            java.lang.Object r8 = r2.a()
            if (r6 != r8) goto L_0x054b
            dI.j r6 = dI.C17169j.f142968a
            QJ.Q r6 = U0.P.k(r6, r11)
            U0.B r8 = new U0.B
            r8.<init>(r6)
            r11.u(r8)
            r6 = r8
        L_0x054b:
            U0.B r6 = (U0.B) r6
            QJ.Q r6 = r6.a()
            java.lang.Object r8 = r11.D()
            java.lang.Object r9 = r2.a()
            if (r8 != r9) goto L_0x0562
            y0.b r8 = androidx.compose.foundation.relocation.b.a()
            r11.u(r8)
        L_0x0562:
            r9 = r8
            y0.b r9 = (y0.C6248b) r9
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            boolean r16 = r11.F(r3)
            r17 = r13
            r13 = r5 & 7168(0x1c00, float:1.0045E-41)
            r67 = r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r13 != r12) goto L_0x0577
            r12 = 1
            goto L_0x0578
        L_0x0577:
            r12 = 0
        L_0x0578:
            r12 = r16 | r12
            r16 = 57344(0xe000, float:8.0356E-41)
            r41 = r1
            r1 = r5 & r16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r15) goto L_0x0587
            r15 = 1
            goto L_0x0588
        L_0x0587:
            r15 = 0
        L_0x0588:
            r12 = r12 | r15
            boolean r15 = r11.F(r4)
            r12 = r12 | r15
            r16 = r13
            r13 = r40
            r15 = 4
            if (r13 != r15) goto L_0x0597
            r15 = 1
            goto L_0x0598
        L_0x0597:
            r15 = 0
        L_0x0598:
            r12 = r12 | r15
            r15 = r5 & 112(0x70, float:1.57E-43)
            r15 = r15 ^ 48
            r40 = r13
            r13 = 32
            if (r15 <= r13) goto L_0x05b1
            r13 = r36
            boolean r36 = r11.V(r13)
            if (r36 != 0) goto L_0x05ac
            goto L_0x05b3
        L_0x05ac:
            r36 = r1
            r42 = r5
            goto L_0x05bd
        L_0x05b1:
            r13 = r36
        L_0x05b3:
            r36 = r1
            r1 = r5 & 48
            r42 = r5
            r5 = 32
            if (r1 != r5) goto L_0x05bf
        L_0x05bd:
            r1 = 1
            goto L_0x05c0
        L_0x05bf:
            r1 = 0
        L_0x05c0:
            r1 = r1 | r12
            boolean r5 = r11.F(r14)
            r1 = r1 | r5
            boolean r5 = r11.F(r6)
            r1 = r1 | r5
            boolean r5 = r11.F(r9)
            r1 = r1 | r5
            boolean r5 = r11.F(r10)
            r1 = r1 | r5
            java.lang.Object r5 = r11.D()
            if (r1 != 0) goto L_0x05e1
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x05ff
        L_0x05e1:
            B0.j$i r5 = new B0.j$i
            r56 = r5
            r57 = r3
            r58 = r7
            r59 = r33
            r60 = r4
            r61 = r54
            r62 = r13
            r63 = r14
            r64 = r10
            r65 = r6
            r66 = r9
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r11.u(r5)
        L_0x05ff:
            nI.l r5 = (nI.C17642l) r5
            r12 = r37
            androidx.compose.ui.d r1 = B0.T.a(r8, r7, r0, r12, r5)
            if (r7 == 0) goto L_0x060d
            if (r33 != 0) goto L_0x060d
            r5 = 1
            goto L_0x060e
        L_0x060d:
            r5 = 0
        L_0x060e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            U0.A1 r5 = U0.p1.q(r5, r11, r6)
            XH.N r6 = XH.C16807N.f139792a
            boolean r37 = r11.V(r5)
            boolean r43 = r11.F(r3)
            r37 = r37 | r43
            boolean r43 = r11.F(r4)
            r37 = r37 | r43
            boolean r43 = r11.F(r10)
            r37 = r37 | r43
            r43 = r9
            r9 = 32
            if (r15 <= r9) goto L_0x063f
            boolean r27 = r11.V(r13)
            if (r27 != 0) goto L_0x063c
            goto L_0x063f
        L_0x063c:
            r44 = r1
            goto L_0x0645
        L_0x063f:
            r44 = r1
            r1 = r42 & 48
            if (r1 != r9) goto L_0x0647
        L_0x0645:
            r1 = 1
            goto L_0x0648
        L_0x0647:
            r1 = 0
        L_0x0648:
            r1 = r37 | r1
            java.lang.Object r9 = r11.D()
            if (r1 != 0) goto L_0x0656
            java.lang.Object r1 = r2.a()
            if (r9 != r1) goto L_0x066d
        L_0x0656:
            B0.j$b r9 = new B0.j$b
            r1 = 0
            r56 = r9
            r57 = r3
            r58 = r5
            r59 = r4
            r60 = r10
            r61 = r13
            r62 = r1
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.u(r9)
        L_0x066d:
            nI.p r9 = (nI.p) r9
            r1 = 6
            U0.P.g(r6, r9, r11, r1)
            boolean r1 = r11.F(r3)
            java.lang.Object r6 = r11.D()
            if (r1 != 0) goto L_0x0683
            java.lang.Object r1 = r2.a()
            if (r6 != r1) goto L_0x068b
        L_0x0683:
            B0.j$k r6 = new B0.j$k
            r6.<init>(r3)
            r11.u(r6)
        L_0x068b:
            nI.l r6 = (nI.C17642l) r6
            androidx.compose.ui.d r1 = H0.y.k(r8, r6)
            boolean r6 = r11.F(r3)
            r9 = 16384(0x4000, float:2.2959E-41)
            r53 = r36
            r36 = r5
            r5 = r53
            if (r5 != r9) goto L_0x06a1
            r9 = 1
            goto L_0x06a2
        L_0x06a1:
            r9 = 0
        L_0x06a2:
            r6 = r6 | r9
            r9 = 2048(0x800, float:2.87E-42)
            r53 = r16
            r16 = r4
            r4 = r53
            if (r4 != r9) goto L_0x06af
            r9 = 1
            goto L_0x06b0
        L_0x06af:
            r9 = 0
        L_0x06b0:
            r6 = r6 | r9
            boolean r9 = r11.F(r14)
            r6 = r6 | r9
            boolean r9 = r11.F(r10)
            r6 = r6 | r9
            java.lang.Object r9 = r11.D()
            if (r6 != 0) goto L_0x06c7
            java.lang.Object r6 = r2.a()
            if (r9 != r6) goto L_0x06dd
        L_0x06c7:
            B0.j$l r9 = new B0.j$l
            r56 = r9
            r57 = r3
            r58 = r0
            r59 = r33
            r60 = r7
            r61 = r10
            r62 = r14
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.u(r9)
        L_0x06dd:
            nI.l r9 = (nI.C17642l) r9
            androidx.compose.ui.d r1 = B0.X.a(r1, r12, r7, r9)
            H0.i r6 = r10.I()
            B0.N r9 = r10.M()
            androidx.compose.ui.d r1 = H0.y.i(r1, r6, r9)
            A1.w r6 = B0.j0.a()
            r70 = r0
            r37 = r12
            r0 = 0
            r9 = 2
            r12 = 0
            androidx.compose.ui.d r1 = A1.C4356x.b(r1, r6, r0, r9, r12)
            boolean r0 = r11.F(r3)
            r9 = r40
            r6 = 4
            if (r9 != r6) goto L_0x0709
            r6 = 1
            goto L_0x070a
        L_0x0709:
            r6 = 0
        L_0x070a:
            r0 = r0 | r6
            boolean r6 = r11.F(r14)
            r0 = r0 | r6
            java.lang.Object r6 = r11.D()
            if (r0 != 0) goto L_0x0720
            java.lang.Object r0 = r2.a()
            if (r6 != r0) goto L_0x071d
            goto L_0x0720
        L_0x071d:
            r12 = r54
            goto L_0x072a
        L_0x0720:
            B0.j$h r6 = new B0.j$h
            r12 = r54
            r6.<init>(r3, r12, r14)
            r11.u(r6)
        L_0x072a:
            nI.l r6 = (nI.C17642l) r6
            androidx.compose.ui.d r22 = androidx.compose.ui.draw.b.b(r8, r6)
            boolean r0 = r11.F(r3)
            r6 = 2048(0x800, float:2.87E-42)
            if (r4 != r6) goto L_0x073a
            r6 = 1
            goto L_0x073b
        L_0x073a:
            r6 = 0
        L_0x073b:
            r0 = r0 | r6
            r6 = r69
            boolean r40 = r11.V(r6)
            r0 = r0 | r40
            boolean r40 = r11.F(r10)
            r0 = r0 | r40
            r69 = r1
            r1 = 4
            if (r9 != r1) goto L_0x0751
            r1 = 1
            goto L_0x0752
        L_0x0751:
            r1 = 0
        L_0x0752:
            r0 = r0 | r1
            boolean r1 = r11.F(r14)
            r0 = r0 | r1
            java.lang.Object r1 = r11.D()
            if (r0 != 0) goto L_0x0764
            java.lang.Object r0 = r2.a()
            if (r1 != r0) goto L_0x077a
        L_0x0764:
            B0.j$j r1 = new B0.j$j
            r56 = r1
            r57 = r3
            r58 = r7
            r59 = r6
            r60 = r10
            r61 = r54
            r62 = r14
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.u(r1)
        L_0x077a:
            nI.l r1 = (nI.C17642l) r1
            androidx.compose.ui.d r40 = androidx.compose.ui.layout.c.a(r8, r1)
            r0 = r39
            boolean r1 = r11.F(r0)
            r12 = 4
            if (r9 != r12) goto L_0x078b
            r12 = 1
            goto L_0x078c
        L_0x078b:
            r12 = 0
        L_0x078c:
            r1 = r1 | r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r4 != r12) goto L_0x0793
            r4 = 1
            goto L_0x0794
        L_0x0793:
            r4 = 0
        L_0x0794:
            r1 = r1 | r4
            r4 = 0
            boolean r12 = r11.b(r4)
            r1 = r1 | r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r12) goto L_0x07a1
            r5 = 1
            goto L_0x07a2
        L_0x07a1:
            r5 = 0
        L_0x07a2:
            r1 = r1 | r5
            boolean r5 = r11.F(r3)
            r1 = r1 | r5
            boolean r5 = r11.F(r14)
            r1 = r1 | r5
            boolean r5 = r11.F(r10)
            r1 = r1 | r5
            r5 = 32
            if (r15 <= r5) goto L_0x07bc
            boolean r12 = r11.V(r13)
            if (r12 != 0) goto L_0x07c0
        L_0x07bc:
            r12 = r42 & 48
            if (r12 != r5) goto L_0x07c2
        L_0x07c0:
            r5 = 1
            goto L_0x07c3
        L_0x07c2:
            r5 = 0
        L_0x07c3:
            r1 = r1 | r5
            java.lang.Object r5 = r11.D()
            if (r1 != 0) goto L_0x07d0
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x07ee
        L_0x07d0:
            B0.j$n r5 = new B0.j$n
            r56 = r5
            r57 = r0
            r58 = r54
            r59 = r7
            r60 = r4
            r61 = r33
            r62 = r13
            r63 = r3
            r64 = r14
            r65 = r10
            r66 = r70
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r11.u(r5)
        L_0x07ee:
            nI.l r5 = (nI.C17642l) r5
            r0 = 1
            androidx.compose.ui.d r1 = L1.o.c(r8, r0, r5)
            if (r7 == 0) goto L_0x0807
            if (r33 != 0) goto L_0x0807
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x0807
            boolean r0 = r3.x()
            if (r0 != 0) goto L_0x0807
            r0 = 1
            goto L_0x0808
        L_0x0807:
            r0 = 0
        L_0x0808:
            r56 = r8
            r57 = r3
            r58 = r54
            r59 = r14
            r60 = r24
            r61 = r0
            androidx.compose.ui.d r12 = B0.O.a(r56, r57, r58, r59, r60, r61)
            boolean r0 = r11.F(r10)
            java.lang.Object r4 = r11.D()
            if (r0 != 0) goto L_0x0828
            java.lang.Object r0 = r2.a()
            if (r4 != r0) goto L_0x0830
        L_0x0828:
            B0.j$c r4 = new B0.j$c
            r4.<init>(r10)
            r11.u(r4)
        L_0x0830:
            nI.l r4 = (nI.C17642l) r4
            r0 = 0
            U0.P.c(r10, r4, r11, r0)
            boolean r4 = r11.F(r3)
            r5 = r16
            boolean r16 = r11.F(r5)
            r4 = r4 | r16
            r0 = 4
            if (r9 != r0) goto L_0x0847
            r0 = 1
            goto L_0x0848
        L_0x0847:
            r0 = 0
        L_0x0848:
            r0 = r0 | r4
            r4 = 32
            if (r15 <= r4) goto L_0x0853
            boolean r9 = r11.V(r13)
            if (r9 != 0) goto L_0x0857
        L_0x0853:
            r9 = r42 & 48
            if (r9 != r4) goto L_0x0859
        L_0x0857:
            r4 = 1
            goto L_0x085a
        L_0x0859:
            r4 = 0
        L_0x085a:
            r0 = r0 | r4
            java.lang.Object r4 = r11.D()
            if (r0 != 0) goto L_0x086b
            java.lang.Object r0 = r2.a()
            if (r4 != r0) goto L_0x0868
            goto L_0x086b
        L_0x0868:
            r9 = r54
            goto L_0x0875
        L_0x086b:
            B0.j$d r4 = new B0.j$d
            r9 = r54
            r4.<init>(r3, r5, r9, r13)
            r11.u(r4)
        L_0x0875:
            nI.l r4 = (nI.C17642l) r4
            int r0 = r42 >> 3
            r0 = r0 & 14
            U0.P.c(r13, r4, r11, r0)
            nI.l r0 = r3.m()
            r4 = r33 ^ 1
            r9 = r38
            r5 = 1
            if (r9 != r5) goto L_0x088c
            r16 = r5
            goto L_0x088e
        L_0x088c:
            r16 = 0
        L_0x088e:
            int r23 = r13.e()
            r56 = r8
            r57 = r3
            r58 = r10
            r59 = r54
            r60 = r0
            r61 = r4
            r62 = r16
            r63 = r14
            r64 = r41
            r65 = r23
            androidx.compose.ui.d r0 = B0.V.a(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            boolean r4 = b(r36)
            boolean r16 = r11.F(r3)
            r5 = 32
            if (r15 <= r5) goto L_0x08bc
            boolean r15 = r11.V(r13)
            if (r15 != 0) goto L_0x08c0
        L_0x08bc:
            r15 = r42 & 48
            if (r15 != r5) goto L_0x08c2
        L_0x08c0:
            r5 = 1
            goto L_0x08c3
        L_0x08c2:
            r5 = 0
        L_0x08c3:
            r5 = r16 | r5
            r15 = r68
            boolean r16 = r11.F(r15)
            r5 = r5 | r16
            r56 = r14
            java.lang.Object r14 = r11.D()
            if (r5 != 0) goto L_0x08db
            java.lang.Object r2 = r2.a()
            if (r14 != r2) goto L_0x08e5
        L_0x08db:
            B0.j$o r14 = new B0.j$o
            r2 = r70
            r14.<init>(r3, r2, r13, r15)
            r11.u(r14)
        L_0x08e5:
            nI.a r14 = (nI.C17631a) r14
            androidx.compose.ui.d r2 = androidx.compose.foundation.text.handwriting.a.c(r8, r4, r14)
            r14 = r32
            androidx.compose.ui.d r4 = androidx.compose.foundation.text.input.internal.a.a(r14, r15, r3, r10)
            androidx.compose.ui.d r2 = r4.s(r2)
            r4 = r44
            androidx.compose.ui.d r2 = r2.s(r4)
            r4 = r67
            androidx.compose.ui.d r2 = B0.S.b(r2, r3, r4)
            androidx.compose.ui.d r2 = p(r2, r3, r10)
            androidx.compose.ui.d r0 = r2.s(r0)
            r5 = r35
            r15 = r37
            androidx.compose.ui.d r0 = B0.Y.d(r0, r5, r15, r7)
            r2 = r69
            androidx.compose.ui.d r0 = r0.s(r2)
            androidx.compose.ui.d r0 = r0.s(r1)
            B0.j$g r1 = new B0.j$g
            r1.<init>(r3)
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.c.a(r0, r1)
            if (r7 == 0) goto L_0x093b
            boolean r0 = r3.e()
            if (r0 == 0) goto L_0x093b
            boolean r0 = r3.y()
            if (r0 == 0) goto L_0x093b
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x093b
            r18 = 1
            goto L_0x093d
        L_0x093b:
            r18 = 0
        L_0x093d:
            if (r18 == 0) goto L_0x0946
            androidx.compose.ui.d r0 = H0.T.c(r8, r10)
            r16 = r0
            goto L_0x0948
        L_0x0946:
            r16 = r8
        L_0x0948:
            B0.j$e r8 = new B0.j$e
            r0 = r8
            r1 = r34
            r2 = r3
            r3 = r20
            r6 = r4
            r4 = r26
            r27 = r5
            r23 = 1
            r5 = r9
            r47 = r6
            r6 = r27
            r27 = r7
            r7 = r54
            r29 = r13
            r13 = r8
            r8 = r17
            r30 = r9
            r31 = r43
            r9 = r12
            r32 = r15
            r15 = r10
            r10 = r22
            r12 = r11
            r11 = r40
            r48 = r12
            r12 = r16
            r49 = r13
            r22 = r17
            r13 = r31
            r31 = r56
            r23 = r14
            r14 = r15
            r50 = r15
            r15 = r18
            r16 = r33
            r17 = r21
            r18 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 54
            r1 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            r2 = r48
            r4 = r49
            r3 = 1
            c1.a r0 = c1.c.e(r1, r3, r4, r2, r0)
            r1 = 384(0x180, float:5.38E-43)
            r3 = r47
            r6 = r50
            c(r3, r6, r0, r2, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x09ae
            U0.C4895p.R()
        L_0x09ae:
            r4 = r20
            r6 = r21
            r5 = r22
            r3 = r23
            r8 = r24
            r9 = r25
            r11 = r26
            r14 = r27
            r13 = r28
            r12 = r29
            r10 = r30
            r7 = r32
            r15 = r33
            r16 = r34
        L_0x09ca:
            U0.Y0 r2 = r2.n()
            if (r2 == 0) goto L_0x09eb
            B0.j$f r1 = new B0.j$f
            r0 = r1
            r51 = r1
            r1 = r54
            r52 = r2
            r2 = r55
            r17 = r71
            r18 = r72
            r19 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r51
            r0 = r52
            r0.a(r1)
        L_0x09eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C4366j.a(T1.P, nI.l, androidx.compose.ui.d, N1.Y, T1.b0, nI.l, r0.m, p1.l0, boolean, int, int, T1.s, B0.z, boolean, boolean, nI.q, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean b(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void c(androidx.compose.ui.d dVar, H0.Q q10, nI.p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-20551815);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(q10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            I h10 = C5077h.h(C5437c.f24302a.o(), true);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, dVar);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s10, aVar.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            C4364h.b(q10, pVar, k10, (i11 >> 3) & 126);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(dVar, q10, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(H0.Q q10, boolean z10, C4889m mVar, int i10) {
        int i11;
        d0 j10;
        P f10;
        C4889m k10 = mVar.k(626339208);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(q10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z10) {
                k10.W(-1286242594);
                B L10 = q10.L();
                P p10 = null;
                if (!(L10 == null || (j10 = L10.j()) == null || (f10 = j10.f()) == null)) {
                    B L11 = q10.L();
                    if (!(L11 != null ? L11.z() : true)) {
                        p10 = f10;
                    }
                }
                if (p10 == null) {
                    k10.W(-1285984396);
                } else {
                    k10.W(-1285984395);
                    if (!W.h(q10.O().h())) {
                        k10.W(-1680616096);
                        int b10 = q10.J().b(W.n(q10.O().h()));
                        int b11 = q10.J().b(W.i(q10.O().h()));
                        Y1.i c10 = p10.c(b10);
                        Y1.i c11 = p10.c(Math.max(b11 - 1, 0));
                        B L12 = q10.L();
                        if (L12 == null || !L12.u()) {
                            k10.W(-1679975078);
                            k10.P();
                        } else {
                            k10.W(-1680216289);
                            H0.S.a(true, c10, q10, k10, ((i11 << 6) & 896) | 6);
                            k10.P();
                        }
                        B L13 = q10.L();
                        if (L13 == null || !L13.t()) {
                            k10.W(-1679655654);
                            k10.P();
                        } else {
                            k10.W(-1679895904);
                            H0.S.a(false, c11, q10, k10, ((i11 << 6) & 896) | 6);
                            k10.P();
                        }
                        k10.P();
                    } else {
                        k10.W(-1679637798);
                        k10.P();
                    }
                    B L14 = q10.L();
                    if (L14 != null) {
                        if (q10.S()) {
                            L14.K(false);
                        }
                        if (L14.e()) {
                            if (L14.s()) {
                                q10.l0();
                            } else {
                                q10.R();
                            }
                        }
                        C16807N n10 = C16807N.f139792a;
                    }
                }
                k10.P();
                k10.P();
            } else {
                k10.W(651305535);
                k10.P();
                q10.R();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new q(q10, z10, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: H0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(H0.Q r9, U0.C4889m r10, int r11) {
        /*
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            U0.m r10 = r10.k(r0)
            r1 = r11 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r10.F(r9)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r11
            goto L_0x0018
        L_0x0017:
            r1 = r11
        L_0x0018:
            r3 = r1 & 3
            if (r3 != r2) goto L_0x0028
            boolean r2 = r10.l()
            if (r2 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r10.L()
            goto L_0x0101
        L_0x0028:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0034
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0034:
            B0.B r0 = r9.L()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.r()
            r1 = 1
            if (r0 != r1) goto L_0x00ef
            N1.d r0 = r9.N()
            if (r0 == 0) goto L_0x00ef
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ef
            r0 = -285446808(0xffffffffeefc6d68, float:-3.9061243E28)
            r10.W(r0)
            boolean r0 = r10.V(r9)
            java.lang.Object r2 = r10.D()
            if (r0 != 0) goto L_0x0065
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x006c
        L_0x0065:
            B0.N r2 = r9.r()
            r10.u(r2)
        L_0x006c:
            B0.N r2 = (B0.N) r2
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r10.Q(r0)
            c2.d r0 = (c2.d) r0
            long r3 = r9.B(r0)
            boolean r0 = r10.e(r3)
            java.lang.Object r5 = r10.D()
            if (r0 != 0) goto L_0x008e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x0096
        L_0x008e:
            B0.j$r r5 = new B0.j$r
            r5.<init>(r3)
            r10.u(r5)
        L_0x0096:
            r0 = r5
            H0.m r0 = (H0.C4535m) r0
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            boolean r6 = r10.F(r2)
            boolean r7 = r10.F(r9)
            r6 = r6 | r7
            java.lang.Object r7 = r10.D()
            r8 = 0
            if (r6 != 0) goto L_0x00b3
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00bb
        L_0x00b3:
            B0.j$s r7 = new B0.j$s
            r7.<init>(r2, r9, r8)
            r10.u(r7)
        L_0x00bb:
            nI.p r7 = (nI.p) r7
            androidx.compose.ui.d r2 = A1.U.d(r5, r2, r7)
            boolean r5 = r10.e(r3)
            java.lang.Object r6 = r10.D()
            if (r5 != 0) goto L_0x00d3
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00db
        L_0x00d3:
            B0.j$t r6 = new B0.j$t
            r6.<init>(r3)
            r10.u(r6)
        L_0x00db:
            nI.l r6 = (nI.C17642l) r6
            r3 = 0
            androidx.compose.ui.d r2 = L1.o.d(r2, r3, r6, r1, r8)
            r6 = 0
            r7 = 4
            r3 = 0
            r1 = r0
            r5 = r10
            B0.C4357a.a(r1, r2, r3, r5, r6, r7)
            r10.P()
            goto L_0x00f8
        L_0x00ef:
            r0 = -284257090(0xffffffffef0e94be, float:-4.412669E28)
            r10.W(r0)
            r10.P()
        L_0x00f8:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0101
            U0.C4895p.R()
        L_0x0101:
            U0.Y0 r10 = r10.n()
            if (r10 == 0) goto L_0x010f
            B0.j$u r0 = new B0.j$u
            r0.<init>(r9, r11)
            r10.a(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C4366j.e(H0.Q, U0.m, int):void");
    }

    public static final Object m(C6248b bVar, T1.P p10, L l10, P p11, H h10, C17164e<? super C16807N> eVar) {
        int b10 = h10.b(W.k(p10.h()));
        Object b11 = bVar.b(b10 < p11.l().j().length() ? p11.d(b10) : b10 != 0 ? p11.d(b10 - 1) : new C5669i(0.0f, 0.0f, 1.0f, (float) c2.r.g(Q.b(l10.j(), l10.a(), l10.b(), (String) null, 0, 24, (Object) null))), eVar);
        return b11 == C17187b.f() ? b11 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(B b10) {
        T1.Y g10 = b10.g();
        if (g10 != null) {
            P.f4596a.f(g10, b10.n(), b10.m());
        }
        b10.E((T1.Y) null);
    }

    /* access modifiers changed from: private */
    public static final void o(B b10, T1.P p10, H h10) {
        C5342k.a aVar = C5342k.f23395e;
        C5342k d10 = aVar.d();
        C17642l<Object, C16807N> h11 = d10 != null ? d10.h() : null;
        C5342k f10 = aVar.f(d10);
        try {
            d0 j10 = b10.j();
            if (j10 != null) {
                T1.Y g10 = b10.g();
                if (g10 == null) {
                    aVar.n(d10, f10, h11);
                    return;
                }
                C4488v i10 = b10.i();
                if (i10 == null) {
                    aVar.n(d10, f10, h11);
                    return;
                }
                P.f4596a.e(p10, b10.v(), j10.f(), i10, g10, b10.e(), h10);
                C16807N n10 = C16807N.f139792a;
                aVar.n(d10, f10, h11);
            }
        } finally {
            aVar.n(d10, f10, h11);
        }
    }

    private static final androidx.compose.ui.d p(androidx.compose.ui.d dVar, B b10, H0.Q q10) {
        return androidx.compose.ui.input.key.a.b(dVar, new v(b10, q10));
    }

    /* access modifiers changed from: private */
    public static final void q(S s10, B b10, T1.P p10, C4849s sVar, H h10) {
        b10.E(P.f4596a.h(s10, p10, b10.n(), sVar, b10.m(), b10.l()));
        o(b10, p10, h10);
    }

    /* access modifiers changed from: private */
    public static final void r(B b10, androidx.compose.ui.focus.m mVar, boolean z10) {
        C5113j1 h10;
        if (!b10.e()) {
            mVar.f();
        } else if (z10 && (h10 = b10.h()) != null) {
            h10.a();
        }
    }
}
