package E0;

import B0.B;
import E0.q0;
import H0.Q;
import N1.W;
import T1.C4840i;
import T1.C4849s;
import T1.H;
import T1.P;
import T1.r;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.H0;
import androidx.compose.ui.platform.w1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5669i;
import p1.O0;
import pI.C17752b;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J5\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010CR$\u0010J\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\"\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0M0L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010NR\u001b\u0010S\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bF\u0010RR$\u0010Z\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\¨\u0006^"}, d2 = {"LE0/s0;", "Landroidx/compose/ui/platform/H0;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lp1/O0;", "LXH/N;", "localToScreen", "LE0/l0;", "inputMethodManager", "<init>", "(Landroid/view/View;LnI/l;LE0/l0;)V", "k", "()V", "LT1/P;", "value", "LE0/q0$a;", "textInputNode", "LT1/s;", "imeOptions", "", "LT1/i;", "onEditCommand", "LT1/r;", "onImeActionPerformed", "l", "(LT1/P;LE0/q0$a;LT1/s;LnI/l;LnI/l;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "LE0/u0;", "g", "(Landroid/view/inputmethod/EditorInfo;)LE0/u0;", "oldValue", "newValue", "m", "(LT1/P;LT1/P;)V", "Lo1/i;", "rect", "j", "(Lo1/i;)V", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "n", "(LT1/P;LT1/H;LN1/P;Lo1/i;Lo1/i;)V", "a", "Landroid/view/View;", "i", "()Landroid/view/View;", "b", "LE0/l0;", "c", "LnI/l;", "d", "LB0/B;", "e", "LB0/B;", "legacyTextFieldState", "LH0/Q;", "f", "LH0/Q;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/w1;", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "<set-?>", "h", "LT1/P;", "getState", "()LT1/P;", "state", "LT1/s;", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "LXH/o;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "focusedRect", "LE0/p0;", "LE0/p0;", "cursorAnchorInfoController", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f5749a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f5750b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C17642l<? super List<? extends C4840i>, C16807N> f5751c = c.f5764c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C17642l<? super r, C16807N> f5752d = d.f5765c;

    /* renamed from: e  reason: collision with root package name */
    private B f5753e;

    /* renamed from: f  reason: collision with root package name */
    private Q f5754f;

    /* renamed from: g  reason: collision with root package name */
    private w1 f5755g;

    /* renamed from: h  reason: collision with root package name */
    private P f5756h = new P("", W.f9419b.a(), (W) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private C4849s f5757i = C4849s.f13631g.a();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<WeakReference<u0>> f5758j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f5759k = C16825p.a(s.NONE, new a(this));

    /* renamed from: l  reason: collision with root package name */
    private Rect f5760l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final p0 f5761m;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "b", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<BaseInputConnection> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s0 f5762c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s0 s0Var) {
            super(0);
            this.f5762c = s0Var;
        }

        /* renamed from: b */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.f5762c.i(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"E0/s0$b", "LE0/k0;", "", "LT1/i;", "editCommands", "LXH/N;", "d", "(Ljava/util/List;)V", "LT1/r;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "LE0/u0;", "inputConnection", "e", "(LE0/u0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements k0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0 f5763a;

        b(s0 s0Var) {
            this.f5763a = s0Var;
        }

        public void a(KeyEvent keyEvent) {
            this.f5763a.h().sendKeyEvent(keyEvent);
        }

        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f5763a.f5761m.b(z10, z11, z12, z13, z14, z15);
        }

        public void c(int i10) {
            this.f5763a.f5752d.invoke(r.j(i10));
        }

        public void d(List<? extends C4840i> list) {
            this.f5763a.f5751c.invoke(list);
        }

        public void e(u0 u0Var) {
            int size = this.f5763a.f5758j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C17542s.e(((WeakReference) this.f5763a.f5758j.get(i10)).get(), u0Var)) {
                    this.f5763a.f5758j.remove(i10);
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LT1/i;", "it", "LXH/N;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<List<? extends C4840i>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f5764c = new c();

        c() {
            super(1);
        }

        public final void a(List<? extends C4840i> list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/r;", "it", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f5765c = new d();

        d() {
            super(1);
        }

        public final void a(int i10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C16807N.f139792a;
        }
    }

    public s0(View view, C17642l<? super O0, C16807N> lVar, l0 l0Var) {
        this.f5749a = view;
        this.f5750b = l0Var;
        this.f5761m = new p0(lVar, l0Var);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection h() {
        return (BaseInputConnection) this.f5759k.getValue();
    }

    private final void k() {
        this.f5750b.f();
    }

    /* renamed from: g */
    public u0 a(EditorInfo editorInfo) {
        C4467z.c(editorInfo, this.f5756h.i(), this.f5756h.h(), this.f5757i, (String[]) null, 8, (Object) null);
        r0.d(editorInfo);
        u0 u0Var = new u0(this.f5756h, new b(this), this.f5757i.b(), this.f5753e, this.f5754f, this.f5755g);
        this.f5758j.add(new WeakReference(u0Var));
        return u0Var;
    }

    public final View i() {
        return this.f5749a;
    }

    public final void j(C5669i iVar) {
        Rect rect;
        this.f5760l = new Rect(C17752b.e(iVar.o()), C17752b.e(iVar.r()), C17752b.e(iVar.p()), C17752b.e(iVar.j()));
        if (this.f5758j.isEmpty() && (rect = this.f5760l) != null) {
            this.f5749a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void l(P p10, q0.a aVar, C4849s sVar, C17642l<? super List<? extends C4840i>, C16807N> lVar, C17642l<? super r, C16807N> lVar2) {
        this.f5756h = p10;
        this.f5757i = sVar;
        this.f5751c = lVar;
        this.f5752d = lVar2;
        w1 w1Var = null;
        this.f5753e = aVar != null ? aVar.S1() : null;
        this.f5754f = aVar != null ? aVar.r1() : null;
        if (aVar != null) {
            w1Var = aVar.getViewConfiguration();
        }
        this.f5755g = w1Var;
    }

    public final void m(P p10, P p11) {
        boolean z10 = !W.g(this.f5756h.h(), p11.h()) || !C17542s.e(this.f5756h.g(), p11.g());
        this.f5756h = p11;
        int size = this.f5758j.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = (u0) this.f5758j.get(i10).get();
            if (u0Var != null) {
                u0Var.g(p11);
            }
        }
        this.f5761m.a();
        if (C17542s.e(p10, p11)) {
            if (z10) {
                l0 l0Var = this.f5750b;
                int l10 = W.l(p11.h());
                int k10 = W.k(p11.h());
                W g10 = this.f5756h.g();
                int i11 = -1;
                int l11 = g10 != null ? W.l(g10.r()) : -1;
                W g11 = this.f5756h.g();
                if (g11 != null) {
                    i11 = W.k(g11.r());
                }
                l0Var.e(l10, k10, l11, i11);
            }
        } else if (p10 == null || (C17542s.e(p10.i(), p11.i()) && (!W.g(p10.h(), p11.h()) || C17542s.e(p10.g(), p11.g())))) {
            int size2 = this.f5758j.size();
            for (int i12 = 0; i12 < size2; i12++) {
                u0 u0Var2 = (u0) this.f5758j.get(i12).get();
                if (u0Var2 != null) {
                    u0Var2.h(this.f5756h, this.f5750b);
                }
            }
        } else {
            k();
        }
    }

    public final void n(P p10, H h10, N1.P p11, C5669i iVar, C5669i iVar2) {
        this.f5761m.d(p10, h10, p11, iVar, iVar2);
    }
}
