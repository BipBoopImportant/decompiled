package wK;

import B0.C4381z;
import HJ.C15854t;
import N1.W;
import N1.Y;
import QJ.Q;
import T1.P;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.y;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5530a;
import n0.C5601g;
import n1.C5626f;
import n1.C5635o;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5662b;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import r0.m;
import r1.k;
import s0.C5844O;
import tI.C17978n;
import tK.C18014e;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;
import zK.C18767l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0001\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aA\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u0001\u0010(\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0003¢\u0006\u0004\b(\u0010)\u001a'\u0010*\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\u001a'\u0010,\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b,\u0010+\u001a?\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\u0006\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00103¨\u0006@²\u0006\f\u00104\u001a\u00020\b8\nX\u0002²\u0006\f\u00106\u001a\u0002058\nX\u0002²\u0006\f\u00107\u001a\u00020\b8\nX\u0002²\u0006\f\u00108\u001a\u00020\b8\nX\u0002²\u0006\f\u00109\u001a\u0002058\nX\u0002²\u0006\f\u0010:\u001a\u0002058\nX\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u0002²\u0006\u000e\u0010=\u001a\u00020\b8\n@\nX\u0002²\u0006\u000e\u0010?\u001a\u00020>8\n@\nX\u0002²\u0006\f\u00101\u001a\u00020\b8\nX\u0002"}, d2 = {"", "value", "Landroidx/compose/ui/d;", "modifier", "minValue", "maxValue", "LwK/R7;", "size", "", "enabled", "Lr0/m;", "interactionSource", "", "increaseButtonContentDescription", "decreaseButtonContentDescription", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "m", "(ILandroidx/compose/ui/d;IILwK/R7;ZLr0/m;Ljava/lang/String;Ljava/lang/String;LnI/l;LU0/m;II)V", "LT1/r;", "imeAction", "LB0/z;", "keyboardActions", "LwK/C7;", "quantityStepperActions", "o", "(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;IILwK/R7;ZLr0/m;ILB0/z;LwK/C7;LnI/l;LU0/m;III)V", "iconResource", "contentDescription", "Lkotlin/Function0;", "onClick", "p", "(ILjava/lang/String;LwK/R7;ZLnI/a;LU0/m;II)V", "Lc2/h;", "width", "height", "LN1/Y;", "textStyle", "onInputValueChange", "x", "(Landroidx/compose/ui/d;IIIFFZLN1/Y;Lr0/m;ILB0/z;LnI/l;LnI/l;LU0/m;III)V", "T", "(III)I", "R", "Ln1/f;", "focusManager", "onIncrease", "onDecrease", "focused", "S", "(Landroidx/compose/ui/d;Ln1/f;LnI/a;LnI/a;Z)Landroidx/compose/ui/d;", "isFocused", "Lp1/v0;", "borderColor", "pressed", "hover", "backgroundColor", "contentColor", "Ln0/g;", "buttonStroke", "isEmpty", "LN1/W;", "textRange", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P7 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<h, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f149952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f149953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f149955d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ R1 f149956e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f149957f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Y f149958g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f149959h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f149960i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4381z f149961j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C7 f149962k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f149963l;

        a(androidx.compose.ui.d dVar, int i10, int i11, int i12, R1 r12, boolean z10, Y y10, m mVar, int i13, C4381z zVar, C7 c72, C17642l<? super Integer, C16807N> lVar) {
            this.f149952a = dVar;
            this.f149953b = i10;
            this.f149954c = i11;
            this.f149955d = i12;
            this.f149956e = r12;
            this.f149957f = z10;
            this.f149958g = y10;
            this.f149959h = mVar;
            this.f149960i = i13;
            this.f149961j = zVar;
            this.f149962k = c72;
            this.f149963l = lVar;
        }

        public final void a(float f10, C4889m mVar, int i10) {
            int i11;
            C4889m mVar2 = mVar;
            float f11 = f10;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.c(f11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-319458409, i11, -1, "net.ikea.skapa.ui.components.QuantityStepper.<anonymous>.<anonymous> (QuantityStepper.kt:212)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                Q7 q72 = Q7.f150020a;
                C5844O.a(J.y(aVar, q72.i()), mVar2, 6);
                androidx.compose.ui.d dVar = this.f149952a;
                int m10 = C17978n.m(this.f149953b, this.f149954c, this.f149955d);
                int i12 = this.f149954c;
                int i13 = this.f149955d;
                float b10 = this.f149956e.b();
                boolean z10 = this.f149957f;
                Y y10 = this.f149958g;
                m mVar3 = this.f149959h;
                int i14 = this.f149960i;
                C4381z zVar = this.f149961j;
                C17642l<Integer, C16807N> d10 = this.f149962k.d();
                C17642l<Integer, C16807N> lVar = this.f149963l;
                P7.x(dVar, m10, i12, i13, f10, b10, z10, y10, mVar3, i14, zVar, d10, lVar, mVar, 57344 & (i11 << 12), 0, 0);
                C5844O.a(J.y(aVar, q72.i()), mVar, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((h) obj).G(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "net.ikea.skapa.ui.components.QuantityStepperKt$QuantityStepperInput$1$1", f = "QuantityStepper.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f149964c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f149965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4899r0<Boolean> r0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f149965d = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f149965d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f149964c == 0) {
                y.b(obj);
                if (P7.y(this.f149965d)) {
                    P7.z(this.f149965d, false);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149966a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.R7[] r0 = wK.R7.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.R7 r1 = wK.R7.Medium     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.R7 r1 = wK.R7.Small     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f149966a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.P7.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements C17642l<C6254b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f149967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f149968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f149969c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5626f f149970d;

        d(boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C5626f fVar) {
            this.f149967a = z10;
            this.f149968b = aVar;
            this.f149969c = aVar2;
            this.f149970d = fVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            C17542s.j(keyEvent, "it");
            int b10 = C6256d.b(keyEvent);
            C6255c.a aVar = C6255c.f32260a;
            boolean z10 = true;
            if (C6255c.e(b10, aVar.a()) && Q7.f150020a.e().contains(Integer.valueOf(keyEvent.getKeyCode())) && this.f149967a) {
                this.f149968b.invoke();
            } else if (C6255c.e(C6256d.b(keyEvent), aVar.a()) && Q7.f150020a.c().contains(Integer.valueOf(keyEvent.getKeyCode())) && this.f149967a) {
                this.f149969c.invoke();
            } else if (C6255c.e(C6256d.b(keyEvent), aVar.a()) && keyEvent.getKeyCode() == 22) {
                this.f149970d.d(androidx.compose.ui.focus.d.f18832b.g());
            } else if (!C6255c.e(C6256d.b(keyEvent), aVar.a()) || keyEvent.getKeyCode() != 21) {
                z10 = false;
            } else {
                this.f149970d.d(androidx.compose.ui.focus.d.f18832b.d());
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    private static final long A(C4899r0<W> r0Var) {
        return r0Var.getValue().r();
    }

    private static final void B(C4899r0<W> r0Var, long j10) {
        r0Var.setValue(W.b(j10));
    }

    private static final boolean C(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N D(int i10, int i11, int i12, C17642l lVar, C17642l lVar2, C4899r0 r0Var, C4899r0 r0Var2, P p10) {
        int i13;
        Integer t10;
        C17542s.j(p10, "it");
        z(r0Var, C15854t.v0(p10.i()));
        if (!y(r0Var) && (t10 = C15854t.t(p10.i())) != null) {
            i13 = C17978n.m(t10.intValue(), i11, i12);
            B(r0Var2, p10.h());
        } else {
            i13 = i10;
        }
        if (i13 != i10 && i13 <= i12) {
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i13));
            }
            lVar2.invoke(Integer.valueOf(i13));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(int i10, int i11, int i12, C17642l lVar, C17642l lVar2) {
        int T10 = T(i10, i11, i12);
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(T10));
        }
        lVar2.invoke(Integer.valueOf(T10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(int i10, int i11, int i12, C17642l lVar, C17642l lVar2) {
        int R10 = R(i10, i11, i12);
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(R10));
        }
        lVar2.invoke(Integer.valueOf(R10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(int i10, int i11, int i12, C17642l lVar, C17642l lVar2, C4899r0 r0Var, C5635o oVar) {
        C17542s.j(oVar, "it");
        if (!oVar.b()) {
            int m10 = C17978n.m(i10, i11, i12);
            if (y(r0Var)) {
                z(r0Var, false);
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(m10));
                }
                lVar2.invoke(Integer.valueOf(m10));
            } else if (i10 != m10) {
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(m10));
                }
                lVar2.invoke(Integer.valueOf(m10));
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(androidx.compose.ui.d dVar, int i10, int i11, int i12, float f10, float f11, boolean z10, Y y10, m mVar, int i13, C4381z zVar, C17642l lVar, C17642l lVar2, int i14, int i15, int i16, C4889m mVar2, int i17) {
        x(dVar, i10, i11, i12, f10, f11, z10, y10, mVar, i13, zVar, lVar, lVar2, mVar2, M0.a(i14 | 1), M0.a(i15), i16);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(int i10, int i11, int i12, C7 c72, C17642l lVar) {
        int T10 = T(i10, i11, i12);
        C17642l<Integer, C16807N> c10 = c72.c();
        if (c10 != null) {
            c10.invoke(Integer.valueOf(T10));
        }
        lVar.invoke(Integer.valueOf(T10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(int i10, int i11, int i12, C7 c72, C17642l lVar) {
        int R10 = R(i10, i11, i12);
        C17642l<Integer, C16807N> b10 = c72.b();
        if (b10 != null) {
            b10.invoke(Integer.valueOf(R10));
        }
        lVar.invoke(Integer.valueOf(R10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(int i10, String str, String str2, androidx.compose.ui.d dVar, int i11, int i12, R7 r72, boolean z10, m mVar, int i13, C4381z zVar, C7 c72, C17642l lVar, int i14, int i15, int i16, C4889m mVar2, int i17) {
        o(i10, str, str2, dVar, i11, i12, r72, z10, mVar, i13, zVar, c72, lVar, mVar2, M0.a(i14 | 1), M0.a(i15), i16);
        return C16807N.f139792a;
    }

    private static final boolean L(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long M(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final C16807N N(A1 a12, A1 a13, r1.f fVar) {
        r1.f fVar2 = fVar;
        C17542s.j(fVar2, "$this$drawBehind");
        float H12 = fVar2.H1(L(a12) ? C18014e.f147445a.a() : C18014e.f147445a.b());
        float f10 = (float) 2;
        float f11 = H12 * f10;
        r1.f.L1(fVar, M(a13), C5668h.a(H12, H12), C5674n.a(C5673m.l(fVar.b()) - f11, C5673m.i(fVar.b()) - f11), C5662b.b(C5673m.i(fVar.b()) / f10, 0.0f, 2, (Object) null), new k(H12, 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), 0.0f, (C5749w0) null, 0, 224, (Object) null);
        return C16807N.f139792a;
    }

    private static final int R(int i10, int i11, int i12) {
        return C17978n.m(i10 - 1, i11, i12);
    }

    private static final androidx.compose.ui.d S(androidx.compose.ui.d dVar, C5626f fVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, boolean z10) {
        return androidx.compose.ui.input.key.a.b(dVar, new d(z10, aVar, aVar2, fVar));
    }

    private static final int T(int i10, int i11, int i12) {
        return C17978n.m(i10 + 1, i11, i12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(int r24, androidx.compose.ui.d r25, int r26, int r27, wK.R7 r28, boolean r29, r0.m r30, java.lang.String r31, java.lang.String r32, nI.C17642l<? super java.lang.Integer, XH.C16807N> r33, U0.C4889m r34, int r35, int r36) {
        /*
            r13 = r33
            r12 = r35
            r8 = r36
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 1848629394(0x6e2fd892, float:1.3605424E28)
            r1 = r34
            U0.m r7 = r1.k(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r12 | 6
            r6 = r24
            goto L_0x002f
        L_0x001d:
            r1 = r12 & 6
            r6 = r24
            if (r1 != 0) goto L_0x002e
            boolean r1 = r7.d(r6)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r2 = r8 & 2
            if (r2 == 0) goto L_0x0038
            r1 = r1 | 48
        L_0x0035:
            r3 = r25
            goto L_0x004a
        L_0x0038:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x0035
            r3 = r25
            boolean r4 = r7.V(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0047:
            r4 = 16
        L_0x0049:
            r1 = r1 | r4
        L_0x004a:
            r4 = r8 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r5 = r26
            goto L_0x0065
        L_0x0053:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0050
            r5 = r26
            boolean r9 = r7.d(r5)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r9
        L_0x0065:
            r9 = r8 & 8
            if (r9 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r10 = r27
            goto L_0x0080
        L_0x006e:
            r10 = r12 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x006b
            r10 = r27
            boolean r11 = r7.d(r10)
            if (r11 == 0) goto L_0x007d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r11
        L_0x0080:
            r11 = r8 & 16
            if (r11 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r14 = r28
            goto L_0x009b
        L_0x0089:
            r14 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0086
            r14 = r28
            boolean r15 = r7.V(r14)
            if (r15 == 0) goto L_0x0098
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r15
        L_0x009b:
            r15 = r8 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a6
            r1 = r1 | r16
            r0 = r29
            goto L_0x00b9
        L_0x00a6:
            r16 = r12 & r16
            r0 = r29
            if (r16 != 0) goto L_0x00b9
            boolean r17 = r7.b(r0)
            if (r17 == 0) goto L_0x00b5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r17
        L_0x00b9:
            r17 = r8 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c4
            r1 = r1 | r18
            r0 = r30
            goto L_0x00d7
        L_0x00c4:
            r18 = r12 & r18
            r0 = r30
            if (r18 != 0) goto L_0x00d7
            boolean r18 = r7.V(r0)
            if (r18 == 0) goto L_0x00d3
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r18
        L_0x00d7:
            r0 = r8 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e2
            r1 = r1 | r18
        L_0x00df:
            r0 = r31
            goto L_0x00f5
        L_0x00e2:
            r0 = r12 & r18
            if (r0 != 0) goto L_0x00df
            r0 = r31
            boolean r18 = r7.V(r0)
            if (r18 == 0) goto L_0x00f1
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r1 = r1 | r18
        L_0x00f5:
            r0 = r8 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0100
            r1 = r1 | r18
        L_0x00fd:
            r0 = r32
            goto L_0x0113
        L_0x0100:
            r0 = r12 & r18
            if (r0 != 0) goto L_0x00fd
            r0 = r32
            boolean r18 = r7.V(r0)
            if (r18 == 0) goto L_0x010f
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r1 = r1 | r18
        L_0x0113:
            r0 = r8 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011c
            r1 = r1 | r18
            goto L_0x012c
        L_0x011c:
            r0 = r12 & r18
            if (r0 != 0) goto L_0x012c
            boolean r0 = r7.F(r13)
            if (r0 == 0) goto L_0x0129
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012b
        L_0x0129:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012b:
            r1 = r1 | r0
        L_0x012c:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r1
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x014c
            boolean r0 = r7.l()
            if (r0 != 0) goto L_0x013c
            goto L_0x014c
        L_0x013c:
            r7.L()
            r2 = r25
            r6 = r29
            r3 = r5
            r18 = r7
            r4 = r10
            r5 = r14
            r7 = r30
            goto L_0x021d
        L_0x014c:
            if (r2 == 0) goto L_0x0153
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r19 = r0
            goto L_0x0155
        L_0x0153:
            r19 = r25
        L_0x0155:
            if (r4 == 0) goto L_0x015b
            r0 = 0
            r20 = r0
            goto L_0x015d
        L_0x015b:
            r20 = r5
        L_0x015d:
            if (r9 == 0) goto L_0x0165
            r0 = 99999(0x1869f, float:1.40128E-40)
            r21 = r0
            goto L_0x0167
        L_0x0165:
            r21 = r10
        L_0x0167:
            if (r11 == 0) goto L_0x016e
            wK.R7 r0 = wK.R7.Medium
            r22 = r0
            goto L_0x0170
        L_0x016e:
            r22 = r14
        L_0x0170:
            if (r15 == 0) goto L_0x0176
            r0 = 1
            r23 = r0
            goto L_0x0178
        L_0x0176:
            r23 = r29
        L_0x0178:
            if (r17 == 0) goto L_0x019b
            r0 = 639917276(0x26245cdc, float:5.702478E-16)
            r7.W(r0)
            java.lang.Object r0 = r7.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0193
            r0.m r0 = r0.l.a()
            r7.u(r0)
        L_0x0193:
            r0.m r0 = (r0.m) r0
            r7.P()
            r17 = r0
            goto L_0x019d
        L_0x019b:
            r17 = r30
        L_0x019d:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ac
            r0 = -1
            java.lang.String r2 = "net.ikea.skapa.ui.components.QuantityStepper (QuantityStepper.kt:105)"
            r3 = 1848629394(0x6e2fd892, float:1.3605424E28)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x01ac:
            T1.r$a r0 = T1.r.f13620b
            int r9 = r0.a()
            B0.z$a r0 = B0.C4381z.f5150g
            B0.z r10 = r0.a()
            wK.C7$a r0 = wK.C7.f149350d
            wK.C7 r11 = r0.a()
            r0 = r1 & 14
            r0 = r0 | r18
            int r2 = r1 >> 21
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 15
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r1 = r1 << 6
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r3
            r14 = r0 | r1
            r0 = r2 & 896(0x380, float:1.256E-42)
            r15 = r0 | 54
            r16 = 0
            r0 = r24
            r1 = r32
            r2 = r31
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r18 = r7
            r7 = r23
            r8 = r17
            r12 = r33
            r13 = r18
            o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0211
            U0.C4895p.R()
        L_0x0211:
            r7 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
        L_0x021d:
            U0.Y0 r13 = r18.n()
            if (r13 == 0) goto L_0x0238
            wK.D7 r14 = new wK.D7
            r0 = r14
            r1 = r24
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r35
            r12 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.P7.m(int, androidx.compose.ui.d, int, int, wK.R7, boolean, r0.m, java.lang.String, java.lang.String, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(int i10, androidx.compose.ui.d dVar, int i11, int i12, R7 r72, boolean z10, m mVar, String str, String str2, C17642l lVar, int i13, int i14, C4889m mVar2, int i15) {
        m(i10, dVar, i11, i12, r72, z10, mVar, str, str2, lVar, mVar2, M0.a(i13 | 1), i14);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: wK.H7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: wK.I7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v7, resolved type: wK.I7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v8, resolved type: wK.H7} */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r0v25, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03c6, code lost:
        if (r4 == U0.C4889m.f14007a.a()) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04ac, code lost:
        if (r4 == U0.C4889m.f14007a.a()) goto L_0x04ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(int r37, java.lang.String r38, java.lang.String r39, androidx.compose.ui.d r40, int r41, int r42, wK.R7 r43, boolean r44, r0.m r45, int r46, B0.C4381z r47, wK.C7 r48, nI.C17642l<? super java.lang.Integer, XH.C16807N> r49, U0.C4889m r50, int r51, int r52, int r53) {
        /*
            r13 = r37
            r14 = r49
            r15 = r51
            r12 = r52
            r11 = r53
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 990930204(0x3b10651c, float:0.0022032922)
            r1 = r50
            U0.m r10 = r1.k(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r15 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r10.d(r13)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r15
            goto L_0x002f
        L_0x002e:
            r1 = r15
        L_0x002f:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0038
            r1 = r1 | 48
            r7 = r38
            goto L_0x004a
        L_0x0038:
            r3 = r15 & 48
            r7 = r38
            if (r3 != 0) goto L_0x004a
            boolean r3 = r10.V(r7)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0049
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r3 = r39
            goto L_0x0066
        L_0x0053:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0050
            r3 = r39
            boolean r16 = r10.V(r3)
            if (r16 == 0) goto L_0x0062
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r16
        L_0x0066:
            r16 = r11 & 8
            if (r16 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r4 = r40
            goto L_0x0082
        L_0x006f:
            r4 = r15 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x006c
            r4 = r40
            boolean r17 = r10.V(r4)
            if (r17 == 0) goto L_0x007e
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r17
        L_0x0082:
            r17 = r11 & 16
            if (r17 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r5 = r41
            goto L_0x009e
        L_0x008b:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0088
            r5 = r41
            boolean r20 = r10.d(r5)
            if (r20 == 0) goto L_0x009a
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r20
        L_0x009e:
            r20 = r11 & 32
            r21 = 196608(0x30000, float:2.75506E-40)
            if (r20 == 0) goto L_0x00a9
            r1 = r1 | r21
            r8 = r42
            goto L_0x00bc
        L_0x00a9:
            r21 = r15 & r21
            r8 = r42
            if (r21 != 0) goto L_0x00bc
            boolean r23 = r10.d(r8)
            if (r23 == 0) goto L_0x00b8
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r23
        L_0x00bc:
            r23 = r11 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00c7
            r1 = r1 | r24
            r6 = r43
            goto L_0x00da
        L_0x00c7:
            r24 = r15 & r24
            r6 = r43
            if (r24 != 0) goto L_0x00da
            boolean r25 = r10.V(r6)
            if (r25 == 0) goto L_0x00d6
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r25
        L_0x00da:
            r9 = r11 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00e5
            r1 = r1 | r26
            r2 = r44
            goto L_0x00f8
        L_0x00e5:
            r26 = r15 & r26
            r2 = r44
            if (r26 != 0) goto L_0x00f8
            boolean r27 = r10.b(r2)
            if (r27 == 0) goto L_0x00f4
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r27
        L_0x00f8:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0103
            r1 = r1 | r28
            r2 = r45
            goto L_0x0116
        L_0x0103:
            r28 = r15 & r28
            r2 = r45
            if (r28 != 0) goto L_0x0116
            boolean r28 = r10.V(r2)
            if (r28 == 0) goto L_0x0112
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r1 = r1 | r28
        L_0x0116:
            r2 = r11 & 512(0x200, float:7.175E-43)
            r28 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0121
            r1 = r1 | r28
            r3 = r46
            goto L_0x0134
        L_0x0121:
            r28 = r15 & r28
            r3 = r46
            if (r28 != 0) goto L_0x0134
            boolean r28 = r10.d(r3)
            if (r28 == 0) goto L_0x0130
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x0130:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0132:
            r1 = r1 | r28
        L_0x0134:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013d
            r28 = r12 | 6
            r4 = r47
            goto L_0x0153
        L_0x013d:
            r28 = r12 & 6
            r4 = r47
            if (r28 != 0) goto L_0x0151
            boolean r28 = r10.V(r4)
            if (r28 == 0) goto L_0x014c
            r28 = 4
            goto L_0x014e
        L_0x014c:
            r28 = 2
        L_0x014e:
            r28 = r12 | r28
            goto L_0x0153
        L_0x0151:
            r28 = r12
        L_0x0153:
            r4 = r11 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x015c
            r28 = r28 | 48
        L_0x0159:
            r5 = r28
            goto L_0x0170
        L_0x015c:
            r29 = r12 & 48
            r5 = r48
            if (r29 != 0) goto L_0x0159
            boolean r29 = r10.V(r5)
            if (r29 == 0) goto L_0x016b
            r29 = 32
            goto L_0x016d
        L_0x016b:
            r29 = 16
        L_0x016d:
            r28 = r28 | r29
            goto L_0x0159
        L_0x0170:
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0177
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0188
        L_0x0177:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0188
            boolean r6 = r10.F(r14)
            if (r6 == 0) goto L_0x0184
            r19 = 256(0x100, float:3.59E-43)
            goto L_0x0186
        L_0x0184:
            r19 = 128(0x80, float:1.794E-43)
        L_0x0186:
            r5 = r5 | r19
        L_0x0188:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r1
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x01b6
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x01b6
            boolean r6 = r10.l()
            if (r6 != 0) goto L_0x019e
            goto L_0x01b6
        L_0x019e:
            r10.L()
            r4 = r40
            r5 = r41
            r7 = r43
            r9 = r45
            r11 = r47
            r12 = r48
            r6 = r8
            r15 = r10
            r3 = r13
            r8 = r44
            r10 = r46
            goto L_0x04fe
        L_0x01b6:
            if (r16 == 0) goto L_0x01bc
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r7 = r6
            goto L_0x01be
        L_0x01bc:
            r7 = r40
        L_0x01be:
            if (r17 == 0) goto L_0x01c2
            r6 = 0
            goto L_0x01c4
        L_0x01c2:
            r6 = r41
        L_0x01c4:
            if (r20 == 0) goto L_0x01c9
            r8 = 99999(0x1869f, float:1.40128E-40)
        L_0x01c9:
            if (r23 == 0) goto L_0x01d0
            wK.R7 r16 = wK.R7.Medium
            r14 = r16
            goto L_0x01d2
        L_0x01d0:
            r14 = r43
        L_0x01d2:
            if (r9 == 0) goto L_0x01d6
            r9 = 1
            goto L_0x01d8
        L_0x01d6:
            r9 = r44
        L_0x01d8:
            if (r0 == 0) goto L_0x01fa
            r0 = 640059484(0x2626885c, float:5.777762E-16)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r15 = r16.a()
            if (r0 != r15) goto L_0x01f3
            r0.m r0 = r0.l.a()
            r10.u(r0)
        L_0x01f3:
            r0.m r0 = (r0.m) r0
            r10.P()
            r15 = r0
            goto L_0x01fc
        L_0x01fa:
            r15 = r45
        L_0x01fc:
            if (r2 == 0) goto L_0x0207
            T1.r$a r0 = T1.r.f13620b
            int r0 = r0.a()
            r16 = r0
            goto L_0x0209
        L_0x0207:
            r16 = r46
        L_0x0209:
            if (r3 == 0) goto L_0x0214
            B0.z$a r0 = B0.C4381z.f5150g
            B0.z r0 = r0.a()
            r19 = r0
            goto L_0x0216
        L_0x0214:
            r19 = r47
        L_0x0216:
            if (r4 == 0) goto L_0x0221
            wK.C7$a r0 = wK.C7.f149350d
            wK.C7 r0 = r0.a()
            r20 = r0
            goto L_0x0223
        L_0x0221:
            r20 = r48
        L_0x0223:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0231
            java.lang.String r0 = "net.ikea.skapa.ui.components.QuantityStepper (QuantityStepper.kt:171)"
            r2 = 990930204(0x3b10651c, float:0.0022032922)
            U0.C4895p.S(r2, r1, r5, r0)
        L_0x0231:
            if (r8 <= r6) goto L_0x0524
            int r0 = r1 >> 24
            r0 = r0 & 14
            U0.A1 r0 = r0.C5814f.a(r15, r10, r0)
            wK.Q7 r2 = wK.Q7.f150020a
            int r3 = r1 >> 18
            r3 = r3 & 14
            r3 = r3 | 48
            wK.R1 r23 = r2.l(r14, r10, r3)
            int r3 = r1 >> 21
            r3 = r3 & 14
            r4 = r3 | 48
            N1.Y r4 = r2.k(r9, r10, r4)
            r48 = r4
            boolean r4 = L(r0)
            r12 = 384(0x180, float:5.38E-43)
            r3 = r3 | r12
            U0.A1 r3 = r2.j(r9, r4, r10, r3)
            r4 = 640082697(0x2626e309, float:5.790051E-16)
            r10.W(r4)
            boolean r4 = r10.V(r0)
            boolean r27 = r10.V(r3)
            r4 = r4 | r27
            java.lang.Object r12 = r10.D()
            if (r4 != 0) goto L_0x027c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r12 != r4) goto L_0x0284
        L_0x027c:
            wK.G7 r12 = new wK.G7
            r12.<init>(r0, r3)
            r10.u(r12)
        L_0x0284:
            nI.l r12 = (nI.C17642l) r12
            r10.P()
            androidx.compose.ui.d r0 = androidx.compose.ui.draw.b.b(r7, r12)
            s0.E r3 = r23.d()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r0, r3)
            tK.v r3 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r10, r4)
            long r3 = r3.k0()
            A0.f r2 = r2.h()
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.c(r0, r3, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r2 = r2.d()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.i()
            r4 = 54
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r10, r4)
            r12 = 0
            int r3 = U0.C4883j.a(r10, r12)
            U0.y r4 = r10.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r10, r0)
            G1.g$a r28 = G1.C4504g.f6515W
            nI.a r12 = r28.a()
            U0.f r29 = r10.m()
            if (r29 != 0) goto L_0x02d7
            U0.C4883j.c()
        L_0x02d7:
            r10.I()
            boolean r29 = r10.i()
            if (r29 == 0) goto L_0x02e4
            r10.p(r12)
            goto L_0x02e7
        L_0x02e4:
            r10.t()
        L_0x02e7:
            U0.m r12 = U0.F1.a(r10)
            nI.p r11 = r28.c()
            U0.F1.c(r12, r2, r11)
            nI.p r2 = r28.e()
            U0.F1.c(r12, r4, r2)
            nI.p r2 = r28.b()
            boolean r4 = r12.i()
            if (r4 != 0) goto L_0x0311
            java.lang.Object r4 = r12.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r11)
            if (r4 != 0) goto L_0x031f
        L_0x0311:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.w(r3, r2)
        L_0x031f:
            nI.p r2 = r28.d()
            U0.F1.c(r12, r0, r2)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 0
            r4 = 0
            r11 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r2, r3, r11, r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r7, r3)
            if (r3 == 0) goto L_0x0359
            r3 = 2
            r4 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r40 = r0
            r41 = r2
            r42 = r11
            r43 = r12
            r44 = r3
            r45 = r4
            androidx.compose.ui.d r0 = s0.C5842M.e(r40, r41, r42, r43, r44, r45)
            tK.u r2 = tK.C18029u.f147649a
            float r2 = r2.l()
            r3 = 0
            r11 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r0, r2, r3, r11, r4)
            r2 = r0
        L_0x0359:
            wK.R7 r12 = wK.R7.Medium
            if (r14 != r12) goto L_0x0360
            int r0 = sK.C17950a.f147139A
            goto L_0x0362
        L_0x0360:
            int r0 = sK.C17950a.f147140B
        L_0x0362:
            if (r9 == 0) goto L_0x0368
            if (r13 <= r6) goto L_0x0368
            r3 = 1
            goto L_0x0369
        L_0x0368:
            r3 = 0
        L_0x0369:
            r4 = 1587499863(0x5e9f5357, float:5.7403078E18)
            r10.W(r4)
            r11 = r1 & 14
            r4 = 4
            if (r11 != r4) goto L_0x0377
            r25 = 1
            goto L_0x0379
        L_0x0377:
            r25 = 0
        L_0x0379:
            r26 = 57344(0xe000, float:8.0356E-41)
            r13 = r1 & r26
            r26 = r7
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r13 != r7) goto L_0x0387
            r24 = 1
            goto L_0x0389
        L_0x0387:
            r24 = 0
        L_0x0389:
            r24 = r25 | r24
            r25 = 458752(0x70000, float:6.42848E-40)
            r28 = r13
            r13 = r1 & r25
            r25 = r11
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r13 != r11) goto L_0x039a
            r21 = 1
            goto L_0x039c
        L_0x039a:
            r21 = 0
        L_0x039c:
            r21 = r24 | r21
            r24 = r13
            r13 = r5 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r13 != r11) goto L_0x03a9
            r22 = 1
            goto L_0x03ab
        L_0x03a9:
            r22 = 0
        L_0x03ab:
            r21 = r21 | r22
            r5 = r5 & 896(0x380, float:1.256E-42)
            r7 = 256(0x100, float:3.59E-43)
            if (r5 != r7) goto L_0x03b6
            r18 = 1
            goto L_0x03b8
        L_0x03b6:
            r18 = 0
        L_0x03b8:
            r18 = r21 | r18
            java.lang.Object r4 = r10.D()
            if (r18 != 0) goto L_0x03c8
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r7 = r18.a()
            if (r4 != r7) goto L_0x03dc
        L_0x03c8:
            wK.H7 r4 = new wK.H7
            r40 = r4
            r41 = r37
            r42 = r6
            r43 = r8
            r44 = r20
            r45 = r49
            r40.<init>(r41, r42, r43, r44, r45)
            r10.u(r4)
        L_0x03dc:
            nI.a r4 = (nI.C17631a) r4
            r10.P()
            r7 = r1 & 112(0x70, float:1.57E-43)
            int r11 = r1 >> 12
            r11 = r11 & 896(0x380, float:1.256E-42)
            r7 = r7 | r11
            r30 = 0
            r40 = r0
            r41 = r38
            r42 = r14
            r43 = r3
            r44 = r4
            r45 = r10
            r46 = r7
            r47 = r30
            p(r40, r41, r42, r43, r44, r45, r46, r47)
            java.lang.String r7 = java.lang.String.valueOf(r8)
            wK.P7$a r4 = new wK.P7$a
            r0 = r4
            r30 = r1
            r1 = r2
            r2 = r37
            r3 = r6
            r40 = r13
            r21 = 4
            r13 = r4
            r4 = r8
            r31 = r5
            r5 = r23
            r50 = r6
            r22 = 0
            r6 = r9
            r23 = r26
            r26 = r14
            r14 = r7
            r7 = r48
            r32 = r8
            r8 = r15
            r18 = r15
            r15 = r21
            r21 = r9
            r9 = r16
            r15 = r10
            r10 = r19
            r33 = r25
            r25 = r11
            r11 = r20
            r34 = r12
            r12 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 54
            r1 = -319458409(0xffffffffecf57397, float:-2.3738615E27)
            r2 = 1
            c1.a r0 = c1.c.e(r1, r2, r13, r15, r0)
            r1 = r48
            r3 = 384(0x180, float:5.38E-43)
            vK.C18205e.b(r14, r1, r0, r15, r3)
            r0 = r26
            r1 = r34
            if (r0 != r1) goto L_0x0455
            int r1 = sK.C17950a.f147141C
            goto L_0x0457
        L_0x0455:
            int r1 = sK.C17950a.f147142D
        L_0x0457:
            r3 = r37
            r4 = r28
            r8 = r32
            if (r21 == 0) goto L_0x0463
            if (r3 >= r8) goto L_0x0463
            r5 = r2
            goto L_0x0465
        L_0x0463:
            r5 = r22
        L_0x0465:
            r6 = 1587547447(0x5ea00d37, float:5.7664673E18)
            r15.W(r6)
            r7 = r33
            r6 = 4
            if (r7 != r6) goto L_0x0474
            r6 = r2
        L_0x0471:
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0477
        L_0x0474:
            r6 = r22
            goto L_0x0471
        L_0x0477:
            if (r4 != r7) goto L_0x047b
            r4 = r2
            goto L_0x047d
        L_0x047b:
            r4 = r22
        L_0x047d:
            r4 = r4 | r6
            r7 = r24
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r7 != r6) goto L_0x0486
            r6 = r2
            goto L_0x0488
        L_0x0486:
            r6 = r22
        L_0x0488:
            r4 = r4 | r6
            r7 = r40
            r6 = 32
            if (r7 != r6) goto L_0x0491
            r6 = r2
            goto L_0x0493
        L_0x0491:
            r6 = r22
        L_0x0493:
            r4 = r4 | r6
            r7 = r31
            r6 = 256(0x100, float:3.59E-43)
            if (r7 != r6) goto L_0x049c
            r6 = r2
            goto L_0x049e
        L_0x049c:
            r6 = r22
        L_0x049e:
            r2 = r4 | r6
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x04ae
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x04c2
        L_0x04ae:
            wK.I7 r4 = new wK.I7
            r40 = r4
            r41 = r37
            r42 = r50
            r43 = r8
            r44 = r20
            r45 = r49
            r40.<init>(r41, r42, r43, r44, r45)
            r15.u(r4)
        L_0x04c2:
            r2 = r4
            nI.a r2 = (nI.C17631a) r2
            r15.P()
            int r4 = r30 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r25
            r6 = 0
            r40 = r1
            r41 = r39
            r42 = r0
            r43 = r5
            r44 = r2
            r45 = r15
            r46 = r4
            r47 = r6
            p(r40, r41, r42, r43, r44, r45, r46, r47)
            r15.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x04ee
            U0.C4895p.R()
        L_0x04ee:
            r5 = r50
            r7 = r0
            r6 = r8
            r10 = r16
            r9 = r18
            r11 = r19
            r12 = r20
            r8 = r21
            r4 = r23
        L_0x04fe:
            U0.Y0 r15 = r15.n()
            if (r15 == 0) goto L_0x0523
            wK.J7 r14 = new wK.J7
            r0 = r14
            r1 = r37
            r2 = r38
            r3 = r39
            r13 = r49
            r35 = r14
            r14 = r51
            r36 = r15
            r15 = r52
            r16 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r35
            r0 = r36
            r0.a(r1)
        L_0x0523:
            return
        L_0x0524:
            r50 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxValue("
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ") must be higher than minValue("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.P7.o(int, java.lang.String, java.lang.String, androidx.compose.ui.d, int, int, wK.R7, boolean, r0.m, int, B0.z, wK.C7, nI.l, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(int r30, java.lang.String r31, wK.R7 r32, boolean r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r30
            r6 = r36
            r0 = 16
            r2 = 4
            r3 = 6
            r4 = 1380802146(0x524d5e62, float:2.20512944E11)
            r5 = r35
            U0.m r5 = r5.k(r4)
            r14 = 1
            r7 = r37 & 1
            r15 = 2
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0029
            boolean r7 = r5.d(r1)
            if (r7 == 0) goto L_0x0026
            r7 = r2
            goto L_0x0027
        L_0x0026:
            r7 = r15
        L_0x0027:
            r7 = r7 | r6
            goto L_0x002a
        L_0x0029:
            r7 = r6
        L_0x002a:
            r8 = r37 & 2
            if (r8 == 0) goto L_0x0033
            r7 = r7 | 48
            r13 = r31
            goto L_0x0044
        L_0x0033:
            r8 = r6 & 48
            r13 = r31
            if (r8 != 0) goto L_0x0044
            boolean r8 = r5.V(r13)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0043
        L_0x0042:
            r8 = r0
        L_0x0043:
            r7 = r7 | r8
        L_0x0044:
            r2 = r37 & 4
            if (r2 == 0) goto L_0x004d
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r2 = r32
            goto L_0x005f
        L_0x004d:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004a
            r2 = r32
            boolean r8 = r5.V(r2)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r7 = r7 | r8
        L_0x005f:
            r8 = r37 & 8
            if (r8 == 0) goto L_0x0068
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r33
            goto L_0x007a
        L_0x0068:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r33
            boolean r10 = r5.b(r9)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r7 = r7 | r10
        L_0x007a:
            r0 = r37 & 16
            if (r0 == 0) goto L_0x0084
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r0 = r34
        L_0x0082:
            r12 = r7
            goto L_0x0097
        L_0x0084:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0080
            r0 = r34
            boolean r10 = r5.F(r0)
            if (r10 == 0) goto L_0x0093
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r7 = r7 | r10
            goto L_0x0082
        L_0x0097:
            r7 = r12 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r10) goto L_0x00aa
            boolean r7 = r5.l()
            if (r7 != 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            r5.L()
            r4 = r9
            goto L_0x02b3
        L_0x00aa:
            if (r8 == 0) goto L_0x00ae
            r11 = r14
            goto L_0x00af
        L_0x00ae:
            r11 = r9
        L_0x00af:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00bb
            r7 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.components.QuantityStepperButton (QuantityStepper.kt:307)"
            U0.C4895p.S(r4, r12, r7, r8)
        L_0x00bb:
            r4 = -1553942354(0xffffffffa360b8ae, float:-1.2182172E-17)
            r5.W(r4)
            java.lang.Object r4 = r5.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r7 = r16.a()
            if (r4 != r7) goto L_0x00d4
            r0.m r4 = r0.l.a()
            r5.u(r4)
        L_0x00d4:
            r0.m r4 = (r0.m) r4
            r5.P()
            U0.A1 r25 = r0.C5814f.a(r4, r5, r3)
            U0.A1 r17 = r0.p.a(r4, r5, r3)
            U0.A1 r3 = r0.i.a(r4, r5, r3)
            wK.i0 r7 = wK.C18354i0.f151014a
            wK.l0$h r8 = wK.C18390l0.h.f151165b
            r9 = 54
            wK.S1 r18 = r7.c(r8, r5, r9)
            boolean r9 = q(r17)
            java.lang.Object r7 = r25.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r10 = r7.booleanValue()
            boolean r19 = r(r3)
            int r7 = r12 >> 9
            r20 = r7 & 14
            r7 = r18
            r8 = r11
            r33 = r11
            r11 = r19
            r26 = r12
            r12 = r5
            r13 = r20
            U0.A1 r13 = r7.a(r8, r9, r10, r11, r12, r13)
            boolean r9 = q(r17)
            r10 = 0
            r19 = 4
            r8 = r33
            r11 = r5
            r12 = r20
            r27 = r13
            r13 = r19
            U0.A1 r28 = r7.c(r8, r9, r10, r11, r12, r13)
            boolean r9 = q(r17)
            boolean r10 = r(r3)
            U0.A1 r29 = r7.b(r8, r9, r10, r11, r12)
            int[] r7 = wK.P7.c.f149966a
            int r8 = r32.ordinal()
            r7 = r7[r8]
            if (r7 == r14) goto L_0x014e
            if (r7 != r15) goto L_0x0148
            wK.Q7 r7 = wK.Q7.f150020a
            float r7 = r7.b()
            goto L_0x0154
        L_0x0148:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x014e:
            wK.Q7 r7 = wK.Q7.f150020a
            float r7 = r7.a()
        L_0x0154:
            r8 = -1553918206(0xffffffffa3611702, float:-1.22021465E-17)
            r5.W(r8)
            java.lang.Object r8 = r5.D()
            java.lang.Object r9 = r16.a()
            if (r8 != r9) goto L_0x016f
            r8 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            m0.a r8 = m0.C5532b.b(r10, r8, r15, r9)
            r5.u(r8)
        L_0x016f:
            r11 = r8
            m0.a r11 = (m0.C5530a) r11
            r5.P()
            float r8 = (float) r15
            float r8 = r8 * r7
            float r10 = c2.h.B(r8)
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.t(r15, r7)
            r8 = -1553912082(0xffffffffa3612eee, float:-1.2207212E-17)
            r5.W(r8)
            boolean r8 = r5.F(r11)
            r9 = r27
            boolean r12 = r5.V(r9)
            r8 = r8 | r12
            boolean r12 = r5.c(r10)
            r8 = r8 | r12
            java.lang.Object r12 = r5.D()
            if (r8 != 0) goto L_0x01a3
            java.lang.Object r8 = r16.a()
            if (r12 != r8) goto L_0x01ab
        L_0x01a3:
            wK.E7 r12 = new wK.E7
            r12.<init>(r11, r10, r9)
            r5.u(r12)
        L_0x01ab:
            nI.l r12 = (nI.C17642l) r12
            r5.P()
            androidx.compose.ui.d r16 = androidx.compose.ui.draw.b.b(r7, r12)
            long r7 = r18.g()
            p1.v0 r9 = p1.C5747v0.k(r7)
            int r7 = m0.C5530a.f25673m
            int r13 = r7 << 12
            r14 = 3
            r7 = 0
            r8 = 0
            r12 = r5
            n0.G r18 = zK.C18767l.c(r7, r8, r9, r10, r11, r12, r13, r14)
            L1.i$a r7 = L1.i.f8936b
            int r7 = r7.a()
            L1.i r21 = L1.i.h(r7)
            r23 = 8
            r24 = 0
            r20 = 0
            r17 = r4
            r19 = r33
            r22 = r34
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            n0.g r7 = u(r29)
            wK.Q7 r8 = wK.Q7.f150020a
            A0.f r9 = r8.h()
            androidx.compose.ui.d r4 = n0.C5599e.e(r4, r7, r9)
            boolean r3 = r(r3)
            r14 = r33
            androidx.compose.ui.d r16 = zK.C18756a.i(r4, r3, r14)
            A0.f r19 = r8.h()
            r24 = 88
            r3 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r17 = r25
            r18 = r14
            r25 = r3
            androidx.compose.ui.d r3 = zK.C18756a.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.e()
            r7 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r7)
            int r7 = U0.C4883j.a(r5, r7)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r5, r3)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r5.m()
            if (r12 != 0) goto L_0x0237
            U0.C4883j.c()
        L_0x0237:
            r5.I()
            boolean r12 = r5.i()
            if (r12 == 0) goto L_0x0244
            r5.p(r11)
            goto L_0x0247
        L_0x0244:
            r5.t()
        L_0x0247:
            U0.m r11 = U0.F1.a(r5)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r4, r12)
            nI.p r4 = r10.e()
            U0.F1.c(r11, r9, r4)
            nI.p r4 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0271
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x027f
        L_0x0271:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r11.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r4)
        L_0x027f:
            nI.p r4 = r10.d()
            U0.F1.c(r11, r3, r4)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            r3 = r26 & 14
            t1.c r7 = J1.e.c(r1, r5, r3)
            float r3 = r8.d()
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.t(r15, r3)
            long r10 = t(r28)
            r3 = r26 & 112(0x70, float:1.57E-43)
            r13 = r3 | 384(0x180, float:5.38E-43)
            r3 = 0
            r8 = r31
            r12 = r5
            r4 = r14
            r14 = r3
            O0.V.a(r7, r8, r9, r10, r12, r13, r14)
            r5.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02b3
            U0.C4895p.R()
        L_0x02b3:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x02ce
            wK.F7 r9 = new wK.F7
            r0 = r9
            r1 = r30
            r2 = r31
            r3 = r32
            r5 = r34
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.P7.p(int, java.lang.String, wK.R7, boolean, nI.a, U0.m, int, int):void");
    }

    private static final boolean q(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean r(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long s(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final long t(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final C5601g u(A1<C5601g> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C5530a aVar, float f10, A1 a12, r1.f fVar) {
        C17542s.j(fVar, "$this$drawBehind");
        C18767l.a(fVar, aVar, s(a12), f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(int i10, String str, R7 r72, boolean z10, C17631a aVar, int i11, int i12, C4889m mVar, int i13) {
        p(i10, str, r72, z10, aVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: wK.K7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: wK.L7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: wK.N7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v53, resolved type: wK.N7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v54, resolved type: wK.M7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v55, resolved type: wK.L7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v56, resolved type: wK.K7} */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x03c9, code lost:
        if (r15 == r10.a()) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0423, code lost:
        if (r4 == r10.a()) goto L_0x0425;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x(androidx.compose.ui.d r42, int r43, int r44, int r45, float r46, float r47, boolean r48, N1.Y r49, r0.m r50, int r51, B0.C4381z r52, nI.C17642l<? super java.lang.Integer, XH.C16807N> r53, nI.C17642l<? super java.lang.Integer, XH.C16807N> r54, U0.C4889m r55, int r56, int r57, int r58) {
        /*
            r1 = r42
            r5 = r46
            r6 = r47
            r4 = r50
            r3 = r56
            r2 = r57
            r0 = r58
            r7 = 1325675819(0x4f04352b, float:2.21807693E9)
            r8 = r55
            U0.m r14 = r8.k(r7)
            r8 = r0 & 1
            if (r8 == 0) goto L_0x001e
            r8 = r3 | 6
            goto L_0x002e
        L_0x001e:
            r8 = r3 & 6
            if (r8 != 0) goto L_0x002d
            boolean r8 = r14.V(r1)
            if (r8 == 0) goto L_0x002a
            r8 = 4
            goto L_0x002b
        L_0x002a:
            r8 = 2
        L_0x002b:
            r8 = r8 | r3
            goto L_0x002e
        L_0x002d:
            r8 = r3
        L_0x002e:
            r11 = r0 & 2
            if (r11 == 0) goto L_0x0037
            r8 = r8 | 48
        L_0x0034:
            r11 = r43
            goto L_0x0049
        L_0x0037:
            r11 = r3 & 48
            if (r11 != 0) goto L_0x0034
            r11 = r43
            boolean r15 = r14.d(r11)
            if (r15 == 0) goto L_0x0046
            r15 = 32
            goto L_0x0048
        L_0x0046:
            r15 = 16
        L_0x0048:
            r8 = r8 | r15
        L_0x0049:
            r15 = r0 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0054
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r15 = r44
            goto L_0x0067
        L_0x0054:
            r15 = r3 & 384(0x180, float:5.38E-43)
            if (r15 != 0) goto L_0x0051
            r15 = r44
            boolean r17 = r14.d(r15)
            if (r17 == 0) goto L_0x0063
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r17 = r16
        L_0x0065:
            r8 = r8 | r17
        L_0x0067:
            r17 = r0 & 8
            if (r17 == 0) goto L_0x0070
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r12 = r45
            goto L_0x0083
        L_0x0070:
            r12 = r3 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x006d
            r12 = r45
            boolean r17 = r14.d(r12)
            if (r17 == 0) goto L_0x007f
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r8 = r8 | r17
        L_0x0083:
            r17 = r0 & 16
            if (r17 == 0) goto L_0x008a
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x008a:
            r9 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x009a
            boolean r9 = r14.c(r5)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r8 = r8 | r9
        L_0x009a:
            r9 = r0 & 32
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00a3
            r8 = r8 | r25
            goto L_0x00b3
        L_0x00a3:
            r9 = r3 & r25
            if (r9 != 0) goto L_0x00b3
            boolean r9 = r14.c(r6)
            if (r9 == 0) goto L_0x00b0
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r8 = r8 | r9
        L_0x00b3:
            r9 = r0 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00be
            r8 = r8 | r17
        L_0x00bb:
            r9 = r48
            goto L_0x00d1
        L_0x00be:
            r9 = r3 & r17
            if (r9 != 0) goto L_0x00bb
            r9 = r48
            boolean r17 = r14.b(r9)
            if (r17 == 0) goto L_0x00cd
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r8 = r8 | r17
        L_0x00d1:
            r13 = r0 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 == 0) goto L_0x00dc
            r8 = r8 | r17
        L_0x00d9:
            r13 = r49
            goto L_0x00ef
        L_0x00dc:
            r13 = r3 & r17
            if (r13 != 0) goto L_0x00d9
            r13 = r49
            boolean r17 = r14.V(r13)
            if (r17 == 0) goto L_0x00eb
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r8 = r8 | r17
        L_0x00ef:
            r10 = r0 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 == 0) goto L_0x00f8
            r8 = r8 | r27
            goto L_0x0108
        L_0x00f8:
            r10 = r3 & r27
            if (r10 != 0) goto L_0x0108
            boolean r10 = r14.V(r4)
            if (r10 == 0) goto L_0x0105
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r10 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r8 = r8 | r10
        L_0x0108:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r10 == 0) goto L_0x0113
            r8 = r8 | r19
            r7 = r51
            goto L_0x0126
        L_0x0113:
            r19 = r3 & r19
            r7 = r51
            if (r19 != 0) goto L_0x0126
            boolean r20 = r14.d(r7)
            if (r20 == 0) goto L_0x0122
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0124
        L_0x0122:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0124:
            r8 = r8 | r20
        L_0x0126:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x012f
            r20 = r2 | 6
            r7 = r52
            goto L_0x0145
        L_0x012f:
            r20 = r2 & 6
            r7 = r52
            if (r20 != 0) goto L_0x0143
            boolean r20 = r14.V(r7)
            if (r20 == 0) goto L_0x013e
            r20 = 4
            goto L_0x0140
        L_0x013e:
            r20 = 2
        L_0x0140:
            r20 = r2 | r20
            goto L_0x0145
        L_0x0143:
            r20 = r2
        L_0x0145:
            r7 = r0 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x014e
            r20 = r20 | 48
        L_0x014b:
            r9 = r20
            goto L_0x0162
        L_0x014e:
            r21 = r2 & 48
            r9 = r53
            if (r21 != 0) goto L_0x014b
            boolean r21 = r14.F(r9)
            if (r21 == 0) goto L_0x015d
            r18 = 32
            goto L_0x015f
        L_0x015d:
            r18 = 16
        L_0x015f:
            r20 = r20 | r18
            goto L_0x014b
        L_0x0162:
            r11 = r0 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x016b
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0168:
            r11 = r54
            goto L_0x017b
        L_0x016b:
            r11 = r2 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0168
            r11 = r54
            boolean r18 = r14.F(r11)
            if (r18 == 0) goto L_0x0179
            r16 = 256(0x100, float:3.59E-43)
        L_0x0179:
            r9 = r9 | r16
        L_0x017b:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r8 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x019e
            r0 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r0 != r2) goto L_0x019e
            boolean r0 = r14.l()
            if (r0 != 0) goto L_0x0192
            goto L_0x019e
        L_0x0192:
            r14.L()
            r10 = r51
            r11 = r52
            r12 = r53
            r1 = r14
            goto L_0x04b9
        L_0x019e:
            if (r10 == 0) goto L_0x01a7
            T1.r$a r0 = T1.r.f13620b
            int r0 = r0.a()
            goto L_0x01a9
        L_0x01a7:
            r0 = r51
        L_0x01a9:
            if (r3 == 0) goto L_0x01b2
            B0.z$a r2 = B0.C4381z.f5150g
            B0.z r2 = r2.a()
            goto L_0x01b4
        L_0x01b2:
            r2 = r52
        L_0x01b4:
            if (r7 == 0) goto L_0x01b9
            r38 = 0
            goto L_0x01bb
        L_0x01b9:
            r38 = r53
        L_0x01bb:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x01c9
            java.lang.String r7 = "net.ikea.skapa.ui.components.QuantityStepperInput (QuantityStepper.kt:376)"
            r10 = 1325675819(0x4f04352b, float:2.21807693E9)
            U0.C4895p.S(r10, r8, r9, r7)
        L_0x01c9:
            java.lang.String r29 = java.lang.String.valueOf(r43)
            r7 = 1941083703(0x73b29637, float:2.8298204E31)
            r14.W(r7)
            java.lang.Object r7 = r14.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r3 = r10.a()
            if (r7 != r3) goto L_0x01eb
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r7 = 2
            r11 = 0
            U0.r0 r3 = U0.u1.e(r3, r11, r7, r11)
            r14.u(r3)
            r7 = r3
        L_0x01eb:
            r3 = r7
            U0.r0 r3 = (U0.C4899r0) r3
            r14.P()
            r7 = 1941086993(0x73b2a311, float:2.830616E31)
            r14.W(r7)
            java.lang.Object r7 = r14.D()
            java.lang.Object r11 = r10.a()
            if (r7 != r11) goto L_0x0216
            int r7 = r29.length()
            long r18 = N1.X.a(r7)
            N1.W r7 = N1.W.b(r18)
            r11 = 2
            r12 = 0
            U0.r0 r7 = U0.u1.e(r7, r12, r11, r12)
            r14.u(r7)
        L_0x0216:
            r22 = r7
            U0.r0 r22 = (U0.C4899r0) r22
            r14.P()
            T1.P r7 = new T1.P
            long r30 = A(r22)
            r33 = 4
            r34 = 0
            r32 = 0
            r28 = r7
            r28.<init>((java.lang.String) r29, (long) r30, (N1.W) r32, (int) r33, (kotlin.jvm.internal.DefaultConstructorMarker) r34)
            int r11 = r8 >> 24
            r11 = r11 & 14
            U0.A1 r11 = r0.C5814f.a(r4, r14, r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r43)
            r4 = 1941093889(0x73b2be01, float:2.8322833E31)
            r14.W(r4)
            java.lang.Object r4 = r14.D()
            r52 = r7
            java.lang.Object r7 = r10.a()
            if (r4 != r7) goto L_0x0255
            wK.P7$b r4 = new wK.P7$b
            r7 = 0
            r4.<init>(r3, r7)
            r14.u(r4)
        L_0x0255:
            nI.p r4 = (nI.p) r4
            r14.P()
            int r7 = r8 >> 3
            r7 = r7 & 14
            U0.P.g(r12, r4, r14, r7)
            boolean r4 = y(r3)
            if (r4 == 0) goto L_0x027a
            T1.P r4 = new T1.P
            r33 = 7
            r34 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r28 = r4
            r28.<init>((java.lang.String) r29, (long) r30, (N1.W) r32, (int) r33, (kotlin.jvm.internal.DefaultConstructorMarker) r34)
            r7 = r4
            goto L_0x027c
        L_0x027a:
            r7 = r52
        L_0x027c:
            r4 = 1941099700(0x73b2d4b4, float:2.8336883E31)
            r14.W(r4)
            r4 = r8 & 112(0x70, float:1.57E-43)
            r28 = 1
            r12 = 32
            if (r4 != r12) goto L_0x028d
            r12 = r28
            goto L_0x028e
        L_0x028d:
            r12 = 0
        L_0x028e:
            r13 = r8 & 896(0x380, float:1.256E-42)
            r15 = 256(0x100, float:3.59E-43)
            if (r13 != r15) goto L_0x0297
            r15 = r28
            goto L_0x0298
        L_0x0297:
            r15 = 0
        L_0x0298:
            r12 = r12 | r15
            r15 = r8 & 7168(0x1c00, float:1.0045E-41)
            r55 = r2
            r2 = 2048(0x800, float:2.87E-42)
            if (r15 != r2) goto L_0x02a4
            r2 = r28
            goto L_0x02a5
        L_0x02a4:
            r2 = 0
        L_0x02a5:
            r2 = r2 | r12
            r12 = r9 & 112(0x70, float:1.57E-43)
            r16 = r15
            r15 = 32
            if (r12 != r15) goto L_0x02b1
            r15 = r28
            goto L_0x02b2
        L_0x02b1:
            r15 = 0
        L_0x02b2:
            r2 = r2 | r15
            r15 = r9 & 896(0x380, float:1.256E-42)
            r29 = r9
            r9 = 256(0x100, float:3.59E-43)
            if (r15 != r9) goto L_0x02be
            r9 = r28
            goto L_0x02bf
        L_0x02be:
            r9 = 0
        L_0x02bf:
            r2 = r2 | r9
            java.lang.Object r9 = r14.D()
            if (r2 != 0) goto L_0x02d3
            java.lang.Object r2 = r10.a()
            if (r9 != r2) goto L_0x02cd
            goto L_0x02d3
        L_0x02cd:
            r53 = r7
            r7 = r15
            r2 = r16
            goto L_0x02ed
        L_0x02d3:
            wK.K7 r9 = new wK.K7
            r53 = r7
            r7 = r15
            r2 = r16
            r15 = r9
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r38
            r20 = r54
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r14.u(r9)
        L_0x02ed:
            r39 = r9
            nI.l r39 = (nI.C17642l) r39
            r14.P()
            wK.Q7 r9 = wK.Q7.f150020a
            float r15 = r9.f()
            float r15 = r15 + r5
            float r15 = c2.h.B(r15)
            c2.h r15 = c2.h.m(r15)
            float r9 = r9.g()
            c2.h r9 = c2.h.m(r9)
            java.lang.Comparable r9 = bI.C17035a.k(r15, r9)
            c2.h r9 = (c2.h) r9
            float r9 = r9.G()
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.y(r1, r9)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r9, r6)
            boolean r11 = C(r11)
            U0.I0 r15 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r15 = r14.Q(r15)
            n1.f r15 = (n1.C5626f) r15
            r1 = 1941134803(0x73b35dd3, float:2.8421757E31)
            r14.W(r1)
            r1 = 32
            if (r4 != r1) goto L_0x033a
            r16 = r28
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x033e
        L_0x033a:
            r1 = 256(0x100, float:3.59E-43)
            r16 = 0
        L_0x033e:
            if (r13 != r1) goto L_0x0343
            r1 = r28
            goto L_0x0344
        L_0x0343:
            r1 = 0
        L_0x0344:
            r1 = r16 | r1
            r5 = 2048(0x800, float:2.87E-42)
            if (r2 != r5) goto L_0x034d
            r5 = r28
            goto L_0x034e
        L_0x034d:
            r5 = 0
        L_0x034e:
            r1 = r1 | r5
            r5 = 32
            if (r12 != r5) goto L_0x0356
            r5 = r28
            goto L_0x0357
        L_0x0356:
            r5 = 0
        L_0x0357:
            r1 = r1 | r5
            r5 = 256(0x100, float:3.59E-43)
            if (r7 != r5) goto L_0x035f
            r5 = r28
            goto L_0x0360
        L_0x035f:
            r5 = 0
        L_0x0360:
            r1 = r1 | r5
            java.lang.Object r5 = r14.D()
            if (r1 != 0) goto L_0x0370
            java.lang.Object r1 = r10.a()
            if (r5 != r1) goto L_0x036e
            goto L_0x0370
        L_0x036e:
            r1 = r15
            goto L_0x0384
        L_0x0370:
            wK.L7 r5 = new wK.L7
            r1 = r15
            r15 = r5
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r38
            r20 = r54
            r15.<init>(r16, r17, r18, r19, r20)
            r14.u(r5)
        L_0x0384:
            nI.a r5 = (nI.C17631a) r5
            r14.P()
            r15 = 1941143923(0x73b38173, float:2.8443807E31)
            r14.W(r15)
            r15 = 32
            if (r4 != r15) goto L_0x0398
            r16 = r28
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x039c
        L_0x0398:
            r15 = 256(0x100, float:3.59E-43)
            r16 = 0
        L_0x039c:
            if (r13 != r15) goto L_0x03a1
            r15 = r28
            goto L_0x03a2
        L_0x03a1:
            r15 = 0
        L_0x03a2:
            r15 = r16 | r15
            r6 = 2048(0x800, float:2.87E-42)
            if (r2 != r6) goto L_0x03ab
            r6 = r28
            goto L_0x03ac
        L_0x03ab:
            r6 = 0
        L_0x03ac:
            r6 = r6 | r15
            r15 = 32
            if (r12 != r15) goto L_0x03b4
            r15 = r28
            goto L_0x03b5
        L_0x03b4:
            r15 = 0
        L_0x03b5:
            r6 = r6 | r15
            r15 = 256(0x100, float:3.59E-43)
            if (r7 != r15) goto L_0x03bd
            r15 = r28
            goto L_0x03be
        L_0x03bd:
            r15 = 0
        L_0x03be:
            r6 = r6 | r15
            java.lang.Object r15 = r14.D()
            if (r6 != 0) goto L_0x03cb
            java.lang.Object r6 = r10.a()
            if (r15 != r6) goto L_0x03de
        L_0x03cb:
            wK.M7 r6 = new wK.M7
            r15 = r6
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r38
            r20 = r54
            r15.<init>(r16, r17, r18, r19, r20)
            r14.u(r6)
        L_0x03de:
            nI.a r15 = (nI.C17631a) r15
            r14.P()
            androidx.compose.ui.d r1 = S(r9, r1, r5, r15, r11)
            r5 = 1941153963(0x73b3a8ab, float:2.8468083E31)
            r14.W(r5)
            r5 = 32
            if (r4 != r5) goto L_0x03f6
            r6 = r28
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x03f9
        L_0x03f6:
            r4 = 256(0x100, float:3.59E-43)
            r6 = 0
        L_0x03f9:
            if (r13 != r4) goto L_0x03fe
            r4 = r28
            goto L_0x03ff
        L_0x03fe:
            r4 = 0
        L_0x03ff:
            r4 = r4 | r6
            r6 = 2048(0x800, float:2.87E-42)
            if (r2 != r6) goto L_0x0407
            r2 = r28
            goto L_0x0408
        L_0x0407:
            r2 = 0
        L_0x0408:
            r2 = r2 | r4
            if (r12 != r5) goto L_0x040e
            r4 = r28
            goto L_0x040f
        L_0x040e:
            r4 = 0
        L_0x040f:
            r2 = r2 | r4
            r4 = 256(0x100, float:3.59E-43)
            if (r7 != r4) goto L_0x0417
            r12 = r28
            goto L_0x0418
        L_0x0417:
            r12 = 0
        L_0x0418:
            r2 = r2 | r12
            java.lang.Object r4 = r14.D()
            if (r2 != 0) goto L_0x0425
            java.lang.Object r2 = r10.a()
            if (r4 != r2) goto L_0x043a
        L_0x0425:
            wK.N7 r4 = new wK.N7
            r15 = r4
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r38
            r20 = r54
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r14.u(r4)
        L_0x043a:
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            androidx.compose.ui.d r9 = androidx.compose.ui.focus.b.a(r1, r4)
            r1 = r29
            B0.A r28 = new B0.A
            r13 = r28
            T1.y$a r2 = T1.C4855y.f13650b
            int r31 = r2.d()
            r36 = 115(0x73, float:1.61E-43)
            r37 = 0
            r29 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r32 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            p1.j1 r2 = new p1.j1
            r21 = r2
            long r3 = r49.h()
            r5 = 0
            r2.<init>(r3, r5)
            wK.b2 r2 = wK.C18272b2.f150601a
            nI.q r22 = r2.a()
            int r2 = r8 >> 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r27
            r3 = 458752(0x70000, float:6.42848E-40)
            int r4 = r8 >> 6
            r3 = r3 & r4
            r2 = r2 | r3
            int r1 = r1 << 21
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r3
            r24 = r2 | r1
            int r1 = r8 >> 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r25 = r1 | r25
            r26 = 7696(0x1e10, float:1.0784E-41)
            r11 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r7 = r53
            r8 = r39
            r10 = r48
            r12 = r49
            r1 = r14
            r14 = r55
            r20 = r50
            r23 = r1
            B0.C4359c.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x04b4
            U0.C4895p.R()
        L_0x04b4:
            r11 = r55
            r10 = r0
            r12 = r38
        L_0x04b9:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x04ea
            wK.O7 r14 = new wK.O7
            r0 = r14
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r8 = r49
            r9 = r50
            r13 = r54
            r40 = r14
            r14 = r56
            r41 = r15
            r15 = r57
            r16 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r40
            r0 = r41
            r0.a(r1)
        L_0x04ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.P7.x(androidx.compose.ui.d, int, int, int, float, float, boolean, N1.Y, r0.m, int, B0.z, nI.l, nI.l, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean y(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void z(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
