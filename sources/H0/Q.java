package H0;

import B0.B;
import B0.C4369m;
import B0.C4370n;
import B0.L;
import B0.N;
import B0.O;
import B0.d0;
import B0.o0;
import B0.s0;
import N1.C4669d;
import N1.W;
import N1.X;
import T1.H;
import T1.P;
import T1.b0;
import U0.C4899r0;
import XH.C16807N;
import androidx.compose.ui.focus.m;
import androidx.compose.ui.platform.C5094d0;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import tI.C17978n;
import w1.C6203a;
import w1.C6204b;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010+J\u0019\u00105\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u0010+J\u000f\u00107\u001a\u00020\bH\u0000¢\u0006\u0004\b7\u0010+J\u000f\u00108\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u0010+J\u001d\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b?\u0010+J\u000f\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010+J\u000f\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010N\u001a\u00020G8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0O8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e8@@@X\u0002¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010m\u001a\u00020f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010u\u001a\u0004\u0018\u00010n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R/\u0010\u0001\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068F@FX\u0002¢\u0006\u0015\n\u0005\b\u0001\u0010a\u001a\u0005\b\u0001\u0010B\"\u0005\b\u0001\u0010\nR/\u0010\u0001\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068F@FX\u0002¢\u0006\u0015\n\u0005\b\u0001\u0010a\u001a\u0005\b\u0001\u0010B\"\u0005\b\u0001\u0010\nR\u001e\u0010\u0001\u001a\u00020\u00108\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0001\u0010JR\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u00108\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010JR7\u0010¢\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010_\u001a\u0005\u0018\u00010\u00018F@BX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010a\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b \u0001\u0010¡\u0001R9\u0010¦\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010_\u001a\u0004\u0018\u00010\u00108F@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b!\u0010a\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010.R\u0019\u0010¨\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b&\u0010§\u0001R\u0018\u0010ª\u0001\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b7\u0010©\u0001R\u001b\u0010­\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b-\u0010¬\u0001R\u001e\u0010±\u0001\u001a\u00020#8\u0000X\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b°\u0001\u0010'R\u001f\u0010µ\u0001\u001a\u00030²\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b)\u0010³\u0001\u001a\u0006\b§\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010\u001e8@X\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"LH0/Q;", "", "LB0/o0;", "undoManager", "<init>", "(LB0/o0;)V", "", "show", "LXH/N;", "m0", "(Z)V", "Lo1/i;", "z", "()Lo1/i;", "LT1/P;", "value", "Lo1/g;", "currentPosition", "isStartOfSelection", "isStartHandle", "LH0/v;", "adjustment", "isTouchBasedSelection", "LN1/W;", "n0", "(LT1/P;JZZLH0/v;Z)J", "LB0/n;", "handleState", "c0", "(LB0/n;)V", "LN1/d;", "annotatedString", "selection", "q", "(LN1/d;J)LT1/P;", "LB0/N;", "Q", "(Z)LB0/N;", "r", "()LB0/N;", "showFloatingToolbar", "v", "x", "()V", "position", "t", "(Lo1/g;)V", "range", "g0", "(J)V", "X", "n", "cancelSelection", "o", "T", "s", "U", "G", "(Z)J", "Lc2/d;", "density", "B", "(Lc2/d;)J", "l0", "R", "S", "()Z", "a", "LB0/o0;", "getUndoManager", "()LB0/o0;", "LT1/H;", "b", "LT1/H;", "J", "()LT1/H;", "e0", "(LT1/H;)V", "offsetMapping", "Lkotlin/Function1;", "c", "LnI/l;", "K", "()LnI/l;", "f0", "(LnI/l;)V", "onValueChange", "LB0/B;", "d", "LB0/B;", "L", "()LB0/B;", "h0", "(LB0/B;)V", "state", "<set-?>", "e", "LU0/r0;", "O", "()LT1/P;", "j0", "(LT1/P;)V", "LT1/b0;", "f", "LT1/b0;", "P", "()LT1/b0;", "k0", "(LT1/b0;)V", "visualTransformation", "Landroidx/compose/ui/platform/d0;", "g", "Landroidx/compose/ui/platform/d0;", "y", "()Landroidx/compose/ui/platform/d0;", "V", "(Landroidx/compose/ui/platform/d0;)V", "clipboardManager", "Landroidx/compose/ui/platform/m1;", "h", "Landroidx/compose/ui/platform/m1;", "getTextToolbar", "()Landroidx/compose/ui/platform/m1;", "i0", "(Landroidx/compose/ui/platform/m1;)V", "textToolbar", "Lw1/a;", "i", "Lw1/a;", "H", "()Lw1/a;", "d0", "(Lw1/a;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/m;", "j", "Landroidx/compose/ui/focus/m;", "F", "()Landroidx/compose/ui/focus/m;", "b0", "(Landroidx/compose/ui/focus/m;)V", "focusRequester", "k", "D", "Z", "editable", "l", "E", "a0", "enabled", "m", "dragBeginPosition", "", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "LB0/m;", "p", "C", "()LB0/m;", "Y", "(LB0/m;)V", "draggingHandle", "A", "()Lo1/g;", "W", "currentDragPosition", "I", "previousRawDragOffset", "LT1/P;", "oldValue", "LH0/C;", "LH0/C;", "previousSelectionLayout", "u", "LB0/N;", "M", "touchSelectionObserver", "LH0/i;", "LH0/i;", "()LH0/i;", "mouseSelectionObserver", "N", "()LN1/d;", "transformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f6819a;

    /* renamed from: b  reason: collision with root package name */
    private H f6820b;

    /* renamed from: c  reason: collision with root package name */
    private C17642l<? super P, C16807N> f6821c;

    /* renamed from: d  reason: collision with root package name */
    private B f6822d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f6823e;

    /* renamed from: f  reason: collision with root package name */
    private b0 f6824f;

    /* renamed from: g  reason: collision with root package name */
    private C5094d0 f6825g;

    /* renamed from: h  reason: collision with root package name */
    private m1 f6826h;

    /* renamed from: i  reason: collision with root package name */
    private C6203a f6827i;

    /* renamed from: j  reason: collision with root package name */
    private m f6828j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f6829k;

    /* renamed from: l  reason: collision with root package name */
    private final C4899r0 f6830l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f6831m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Integer f6832n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public long f6833o;

    /* renamed from: p  reason: collision with root package name */
    private final C4899r0 f6834p;

    /* renamed from: q  reason: collision with root package name */
    private final C4899r0 f6835q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f6836r;

    /* renamed from: s  reason: collision with root package name */
    private P f6837s;

    /* renamed from: t  reason: collision with root package name */
    private C f6838t;

    /* renamed from: u  reason: collision with root package name */
    private final N f6839u;

    /* renamed from: v  reason: collision with root package name */
    private final C4531i f6840v;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"H0/Q$a", "LB0/N;", "Lo1/g;", "point", "LXH/N;", "h", "(J)V", "j", "()V", "startPoint", "i", "delta", "k", "g", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f6841a;

        a(Q q10) {
            this.f6841a = q10;
        }

        public void g() {
            this.f6841a.Y((C4369m) null);
            this.f6841a.W((C5667g) null);
        }

        public void h(long j10) {
        }

        public void i(long j10) {
            d0 j11;
            long a10 = B.a(this.f6841a.G(true));
            B L10 = this.f6841a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                long k10 = j11.k(a10);
                this.f6841a.f6831m = k10;
                this.f6841a.W(C5667g.d(k10));
                this.f6841a.f6833o = C5667g.f26701b.c();
                this.f6841a.Y(C4369m.Cursor);
                this.f6841a.m0(false);
            }
        }

        public void j() {
            this.f6841a.Y((C4369m) null);
            this.f6841a.W((C5667g) null);
        }

        public void k(long j10) {
            d0 j11;
            C6203a H10;
            Q q10 = this.f6841a;
            q10.f6833o = C5667g.r(q10.f6833o, j10);
            B L10 = this.f6841a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                Q q11 = this.f6841a;
                q11.W(C5667g.d(C5667g.r(q11.f6831m, q11.f6833o)));
                H J10 = q11.J();
                C5667g A10 = q11.A();
                C17542s.g(A10);
                int a10 = J10.a(d0.e(j11, A10.v(), false, 2, (Object) null));
                long b10 = X.b(a10, a10);
                if (!W.g(b10, q11.O().h())) {
                    B L11 = q11.L();
                    if ((L11 == null || L11.y()) && (H10 = q11.H()) != null) {
                        H10.a(C6204b.f31328a.b());
                    }
                    q11.K().invoke(q11.q(q11.O().f(), b10));
                }
            }
        }

        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"H0/Q$b", "LB0/N;", "Lo1/g;", "point", "LXH/N;", "h", "(J)V", "j", "()V", "startPoint", "i", "delta", "k", "g", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f6842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6843b;

        b(Q q10, boolean z10) {
            this.f6842a = q10;
            this.f6843b = z10;
        }

        public void g() {
            this.f6842a.Y((C4369m) null);
            this.f6842a.W((C5667g) null);
            this.f6842a.m0(true);
        }

        public void h(long j10) {
            d0 j11;
            this.f6842a.Y(this.f6843b ? C4369m.SelectionStart : C4369m.SelectionEnd);
            long a10 = B.a(this.f6842a.G(this.f6843b));
            B L10 = this.f6842a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                long k10 = j11.k(a10);
                this.f6842a.f6831m = k10;
                this.f6842a.W(C5667g.d(k10));
                this.f6842a.f6833o = C5667g.f26701b.c();
                this.f6842a.f6836r = -1;
                B L11 = this.f6842a.L();
                if (L11 != null) {
                    L11.D(true);
                }
                this.f6842a.m0(false);
            }
        }

        public void i(long j10) {
        }

        public void j() {
            this.f6842a.Y((C4369m) null);
            this.f6842a.W((C5667g) null);
            this.f6842a.m0(true);
        }

        public void k(long j10) {
            Q q10 = this.f6842a;
            q10.f6833o = C5667g.r(q10.f6833o, j10);
            Q q11 = this.f6842a;
            q11.W(C5667g.d(C5667g.r(q11.f6831m, this.f6842a.f6833o)));
            Q q12 = this.f6842a;
            P O10 = q12.O();
            C5667g A10 = this.f6842a.A();
            C17542s.g(A10);
            long unused = q12.n0(O10, A10.v(), false, this.f6843b, C4543v.f6972a.k(), true);
            this.f6842a.m0(false);
        }

        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"H0/Q$c", "LH0/i;", "Lo1/g;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "LH0/v;", "adjustment", "b", "(JLH0/v;)Z", "c", "LT1/P;", "value", "currentPosition", "isStartOfSelection", "LXH/N;", "f", "(LT1/P;JZLH0/v;)V", "a", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C4531i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f6844a;

        c(Q q10) {
            this.f6844a = q10;
        }

        public void a() {
        }

        public boolean b(long j10, C4543v vVar) {
            B L10;
            if (!this.f6844a.E() || this.f6844a.O().i().length() == 0 || (L10 = this.f6844a.L()) == null || L10.j() == null) {
                return false;
            }
            m F10 = this.f6844a.F();
            if (F10 != null) {
                F10.f();
            }
            this.f6844a.f6831m = j10;
            this.f6844a.f6836r = -1;
            Q.w(this.f6844a, false, 1, (Object) null);
            f(this.f6844a.O(), this.f6844a.f6831m, true, vVar);
            return true;
        }

        public boolean c(long j10, C4543v vVar) {
            B L10;
            if (!this.f6844a.E() || this.f6844a.O().i().length() == 0 || (L10 = this.f6844a.L()) == null || L10.j() == null) {
                return false;
            }
            f(this.f6844a.O(), j10, false, vVar);
            return true;
        }

        public boolean d(long j10) {
            B L10;
            if (!this.f6844a.E() || this.f6844a.O().i().length() == 0 || (L10 = this.f6844a.L()) == null || L10.j() == null) {
                return false;
            }
            f(this.f6844a.O(), j10, false, C4543v.f6972a.l());
            return true;
        }

        public boolean e(long j10) {
            B L10 = this.f6844a.L();
            if (L10 == null || L10.j() == null || !this.f6844a.E()) {
                return false;
            }
            this.f6844a.f6836r = -1;
            f(this.f6844a.O(), j10, false, C4543v.f6972a.l());
            return true;
        }

        public final void f(P p10, long j10, boolean z10, C4543v vVar) {
            this.f6844a.c0(W.h(this.f6844a.n0(p10, j10, z10, false, vVar, false)) ? C4370n.Cursor : C4370n.Selection);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/P;", "it", "LXH/N;", "a", "(LT1/P;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f6845c = new d();

        d() {
            super(1);
        }

        public final void a(P p10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f6846c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Q q10) {
            super(0);
            this.f6846c = q10;
        }

        public final void invoke() {
            Q.p(this.f6846c, false, 1, (Object) null);
            this.f6846c.R();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f6847c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Q q10) {
            super(0);
            this.f6847c = q10;
        }

        public final void invoke() {
            this.f6847c.s();
            this.f6847c.R();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f6848c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Q q10) {
            super(0);
            this.f6848c = q10;
        }

        public final void invoke() {
            this.f6848c.T();
            this.f6848c.R();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f6849c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Q q10) {
            super(0);
            this.f6849c = q10;
        }

        public final void invoke() {
            this.f6849c.U();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"H0/Q$i", "LB0/N;", "LXH/N;", "a", "()V", "Lo1/g;", "point", "h", "(J)V", "j", "startPoint", "i", "delta", "k", "g", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f6850a;

        i(Q q10) {
            this.f6850a = q10;
        }

        private final void a() {
            this.f6850a.Y((C4369m) null);
            this.f6850a.W((C5667g) null);
            boolean z10 = true;
            this.f6850a.m0(true);
            this.f6850a.f6832n = null;
            boolean h10 = W.h(this.f6850a.O().h());
            this.f6850a.c0(h10 ? C4370n.Cursor : C4370n.Selection);
            B L10 = this.f6850a.L();
            if (L10 != null) {
                L10.M(!h10 && S.c(this.f6850a, true));
            }
            B L11 = this.f6850a.L();
            if (L11 != null) {
                L11.L(!h10 && S.c(this.f6850a, false));
            }
            B L12 = this.f6850a.L();
            if (L12 != null) {
                if (!h10 || !S.c(this.f6850a, true)) {
                    z10 = false;
                }
                L12.J(z10);
            }
        }

        public void g() {
            a();
        }

        public void h(long j10) {
        }

        public void i(long j10) {
            d0 j11;
            d0 j12;
            if (this.f6850a.E() && this.f6850a.C() == null) {
                this.f6850a.Y(C4369m.SelectionEnd);
                this.f6850a.f6836r = -1;
                this.f6850a.R();
                B L10 = this.f6850a.L();
                if (L10 == null || (j12 = L10.j()) == null || !j12.g(j10)) {
                    B L11 = this.f6850a.L();
                    if (!(L11 == null || (j11 = L11.j()) == null)) {
                        Q q10 = this.f6850a;
                        int a10 = q10.J().a(d0.e(j11, j10, false, 2, (Object) null));
                        P a11 = q10.q(q10.O().f(), X.b(a10, a10));
                        q10.v(false);
                        C6203a H10 = q10.H();
                        if (H10 != null) {
                            H10.a(C6204b.f31328a.b());
                        }
                        q10.K().invoke(a11);
                    }
                } else if (this.f6850a.O().i().length() != 0) {
                    this.f6850a.v(false);
                    Q q11 = this.f6850a;
                    this.f6850a.f6832n = Integer.valueOf(W.n(q11.n0(P.d(q11.O(), (C4669d) null, W.f9419b.a(), (W) null, 5, (Object) null), j10, true, false, C4543v.f6972a.n(), true)));
                } else {
                    return;
                }
                this.f6850a.c0(C4370n.None);
                this.f6850a.f6831m = j10;
                Q q12 = this.f6850a;
                q12.W(C5667g.d(q12.f6831m));
                this.f6850a.f6833o = C5667g.f26701b.c();
            }
        }

        public void j() {
        }

        public void k(long j10) {
            d0 j11;
            long j12;
            if (this.f6850a.E() && this.f6850a.O().i().length() != 0) {
                Q q10 = this.f6850a;
                q10.f6833o = C5667g.r(q10.f6833o, j10);
                B L10 = this.f6850a.L();
                if (!(L10 == null || (j11 = L10.j()) == null)) {
                    Q q11 = this.f6850a;
                    q11.W(C5667g.d(C5667g.r(q11.f6831m, q11.f6833o)));
                    if (q11.f6832n == null) {
                        C5667g A10 = q11.A();
                        C17542s.g(A10);
                        if (!j11.g(A10.v())) {
                            int a10 = q11.J().a(d0.e(j11, q11.f6831m, false, 2, (Object) null));
                            H J10 = q11.J();
                            C5667g A11 = q11.A();
                            C17542s.g(A11);
                            C4543v l10 = a10 == J10.a(d0.e(j11, A11.v(), false, 2, (Object) null)) ? C4543v.f6972a.l() : C4543v.f6972a.n();
                            P O10 = q11.O();
                            C5667g A12 = q11.A();
                            C17542s.g(A12);
                            j12 = q11.n0(O10, A12.v(), false, false, l10, true);
                            W.b(j12);
                        }
                    }
                    Integer b10 = q11.f6832n;
                    int intValue = b10 != null ? b10.intValue() : j11.d(q11.f6831m, false);
                    C5667g A13 = q11.A();
                    C17542s.g(A13);
                    int d10 = j11.d(A13.v(), false);
                    if (q11.f6832n != null || intValue != d10) {
                        P O11 = q11.O();
                        C5667g A14 = q11.A();
                        C17542s.g(A14);
                        j12 = q11.n0(O11, A14.v(), false, false, C4543v.f6972a.n(), true);
                        W.b(j12);
                    } else {
                        return;
                    }
                }
                this.f6850a.m0(false);
            }
        }

        public void onCancel() {
            a();
        }
    }

    public Q() {
        this((o0) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final void W(C5667g gVar) {
        this.f6835q.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void Y(C4369m mVar) {
        this.f6834p.setValue(mVar);
    }

    /* access modifiers changed from: private */
    public final void c0(C4370n nVar) {
        B b10 = this.f6822d;
        if (b10 != null) {
            if (b10.d() == nVar) {
                b10 = null;
            }
            if (b10 != null) {
                b10.B(nVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void m0(boolean z10) {
        B b10 = this.f6822d;
        if (b10 != null) {
            b10.K(z10);
        }
        if (z10) {
            l0();
        } else {
            R();
        }
    }

    /* access modifiers changed from: private */
    public final long n0(P p10, long j10, boolean z10, boolean z11, C4543v vVar, boolean z12) {
        d0 j11;
        int i10;
        C6203a aVar;
        boolean z13 = z12;
        B b10 = this.f6822d;
        if (b10 == null || (j11 = b10.j()) == null) {
            return W.f9419b.a();
        }
        long b11 = X.b(this.f6820b.b(W.n(p10.h())), this.f6820b.b(W.i(p10.h())));
        boolean z14 = false;
        int d10 = j11.d(j10, false);
        int n10 = (z11 || z10) ? d10 : W.n(b11);
        int i11 = (!z11 || z10) ? d10 : W.i(b11);
        C c10 = this.f6838t;
        if (z10 || c10 == null || (i10 = this.f6836r) == -1) {
            i10 = -1;
        }
        C c11 = E.c(j11.f(), n10, i11, i10, b11, z10, z11);
        if (!c11.d(c10)) {
            return p10.h();
        }
        this.f6838t = c11;
        this.f6836r = d10;
        C4538p a10 = vVar.a(c11);
        long b12 = X.b(this.f6820b.a(a10.e().d()), this.f6820b.a(a10.c().d()));
        if (W.g(b12, p10.h())) {
            return p10.h();
        }
        boolean z15 = W.m(b12) != W.m(p10.h()) && W.g(X.b(W.i(b12), W.n(b12)), p10.h());
        boolean z16 = W.h(b12) && W.h(p10.h());
        if (z13 && p10.i().length() > 0 && !z15 && !z16 && (aVar = this.f6827i) != null) {
            aVar.a(C6204b.f31328a.b());
        }
        this.f6821c.invoke(q(p10.f(), b12));
        if (!z13) {
            m0(!W.h(b12));
        }
        B b13 = this.f6822d;
        if (b13 != null) {
            b13.D(z13);
        }
        B b14 = this.f6822d;
        if (b14 != null) {
            b14.M(!W.h(b12) && S.c(this, true));
        }
        B b15 = this.f6822d;
        if (b15 != null) {
            b15.L(!W.h(b12) && S.c(this, false));
        }
        B b16 = this.f6822d;
        if (b16 != null) {
            if (W.h(b12) && S.c(this, true)) {
                z14 = true;
            }
            b16.J(z14);
        }
        return b12;
    }

    public static /* synthetic */ void p(Q q10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        q10.o(z10);
    }

    /* access modifiers changed from: private */
    public final P q(C4669d dVar, long j10) {
        return new P(dVar, j10, (W) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void u(Q q10, C5667g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        q10.t(gVar);
    }

    public static /* synthetic */ void w(Q q10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        q10.v(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r3 = r3.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final o1.C5669i z() {
        /*
            r11 = this;
            B0.B r0 = r11.f6822d
            if (r0 == 0) goto L_0x0108
            boolean r1 = r0.z()
            if (r1 != 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0108
            T1.H r1 = r11.f6820b
            T1.P r2 = r11.O()
            long r2 = r2.h()
            int r2 = N1.W.n(r2)
            int r1 = r1.b(r2)
            T1.H r2 = r11.f6820b
            T1.P r3 = r11.O()
            long r3 = r3.h()
            int r3 = N1.W.i(r3)
            int r2 = r2.b(r3)
            B0.B r3 = r11.f6822d
            if (r3 == 0) goto L_0x0046
            E1.v r3 = r3.i()
            if (r3 == 0) goto L_0x0046
            r4 = 1
            long r4 = r11.G(r4)
            long r3 = r3.p0(r4)
            goto L_0x004c
        L_0x0046:
            o1.g$a r3 = o1.C5667g.f26701b
            long r3 = r3.c()
        L_0x004c:
            B0.B r5 = r11.f6822d
            if (r5 == 0) goto L_0x0060
            E1.v r5 = r5.i()
            if (r5 == 0) goto L_0x0060
            r6 = 0
            long r6 = r11.G(r6)
            long r5 = r5.p0(r6)
            goto L_0x0066
        L_0x0060:
            o1.g$a r5 = o1.C5667g.f26701b
            long r5 = r5.c()
        L_0x0066:
            B0.B r7 = r11.f6822d
            r8 = 0
            if (r7 == 0) goto L_0x0096
            E1.v r7 = r7.i()
            if (r7 == 0) goto L_0x0096
            B0.d0 r9 = r0.j()
            if (r9 == 0) goto L_0x0088
            N1.P r9 = r9.f()
            if (r9 == 0) goto L_0x0088
            o1.i r1 = r9.e(r1)
            if (r1 == 0) goto L_0x0088
            float r1 = r1.r()
            goto L_0x0089
        L_0x0088:
            r1 = r8
        L_0x0089:
            long r9 = o1.C5668h.a(r8, r1)
            long r9 = r7.p0(r9)
            float r1 = o1.C5667g.n(r9)
            goto L_0x0097
        L_0x0096:
            r1 = r8
        L_0x0097:
            B0.B r7 = r11.f6822d
            if (r7 == 0) goto L_0x00c5
            E1.v r7 = r7.i()
            if (r7 == 0) goto L_0x00c5
            B0.d0 r9 = r0.j()
            if (r9 == 0) goto L_0x00b8
            N1.P r9 = r9.f()
            if (r9 == 0) goto L_0x00b8
            o1.i r2 = r9.e(r2)
            if (r2 == 0) goto L_0x00b8
            float r2 = r2.r()
            goto L_0x00b9
        L_0x00b8:
            r2 = r8
        L_0x00b9:
            long r8 = o1.C5668h.a(r8, r2)
            long r7 = r7.p0(r8)
            float r8 = o1.C5667g.n(r7)
        L_0x00c5:
            float r2 = o1.C5667g.m(r3)
            float r7 = o1.C5667g.m(r5)
            float r2 = java.lang.Math.min(r2, r7)
            float r7 = o1.C5667g.m(r3)
            float r9 = o1.C5667g.m(r5)
            float r7 = java.lang.Math.max(r7, r9)
            float r1 = java.lang.Math.min(r1, r8)
            float r3 = o1.C5667g.n(r3)
            float r4 = o1.C5667g.n(r5)
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 25
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            B0.L r0 = r0.v()
            c2.d r0 = r0.a()
            float r0 = r0.getDensity()
            float r4 = r4 * r0
            float r3 = r3 + r4
            o1.i r0 = new o1.i
            r0.<init>(r2, r1, r7, r3)
            return r0
        L_0x0108:
            o1.i$a r0 = o1.C5669i.f26706e
            o1.i r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.Q.z():o1.i");
    }

    public final C5667g A() {
        return (C5667g) this.f6835q.getValue();
    }

    public final long B(c2.d dVar) {
        int b10 = this.f6820b.b(W.n(O().h()));
        B b11 = this.f6822d;
        d0 j10 = b11 != null ? b11.j() : null;
        C17542s.g(j10);
        N1.P f10 = j10.f();
        C5669i e10 = f10.e(C17978n.m(b10, 0, f10.l().j().length()));
        return C5668h.a(e10.o() + (dVar.H1(O.b()) / ((float) 2)), e10.j());
    }

    public final C4369m C() {
        return (C4369m) this.f6834p.getValue();
    }

    public final boolean D() {
        return ((Boolean) this.f6829k.getValue()).booleanValue();
    }

    public final boolean E() {
        return ((Boolean) this.f6830l.getValue()).booleanValue();
    }

    public final m F() {
        return this.f6828j;
    }

    public final long G(boolean z10) {
        d0 j10;
        N1.P f10;
        B b10 = this.f6822d;
        if (b10 == null || (j10 = b10.j()) == null || (f10 = j10.f()) == null) {
            return C5667g.f26701b.b();
        }
        C4669d N10 = N();
        if (N10 == null) {
            return C5667g.f26701b.b();
        }
        if (!C17542s.e(N10.j(), f10.l().j().j())) {
            return C5667g.f26701b.b();
        }
        long h10 = O().h();
        return X.b(f10, this.f6820b.b(z10 ? W.n(h10) : W.i(h10)), z10, W.m(O().h()));
    }

    public final C6203a H() {
        return this.f6827i;
    }

    public final C4531i I() {
        return this.f6840v;
    }

    public final H J() {
        return this.f6820b;
    }

    public final C17642l<P, C16807N> K() {
        return this.f6821c;
    }

    public final B L() {
        return this.f6822d;
    }

    public final N M() {
        return this.f6839u;
    }

    public final C4669d N() {
        L v10;
        B b10 = this.f6822d;
        if (b10 == null || (v10 = b10.v()) == null) {
            return null;
        }
        return v10.k();
    }

    public final P O() {
        return (P) this.f6823e.getValue();
    }

    public final b0 P() {
        return this.f6824f;
    }

    public final N Q(boolean z10) {
        return new b(this, z10);
    }

    public final void R() {
        m1 m1Var;
        m1 m1Var2 = this.f6826h;
        if ((m1Var2 != null ? m1Var2.i() : null) == o1.Shown && (m1Var = this.f6826h) != null) {
            m1Var.b();
        }
    }

    public final boolean S() {
        return !C17542s.e(this.f6837s.i(), O().i());
    }

    public final void T() {
        C4669d a10;
        C5094d0 d0Var = this.f6825g;
        if (d0Var != null && (a10 = d0Var.a()) != null) {
            C4669d p10 = T1.Q.c(O(), O().i().length()).p(a10).p(T1.Q.b(O(), O().i().length()));
            int l10 = W.l(O().h()) + a10.length();
            this.f6821c.invoke(q(p10, X.b(l10, l10)));
            c0(C4370n.None);
            o0 o0Var = this.f6819a;
            if (o0Var != null) {
                o0Var.a();
            }
        }
    }

    public final void U() {
        P q10 = q(O().f(), X.b(0, O().i().length()));
        this.f6821c.invoke(q10);
        this.f6837s = P.d(this.f6837s, (C4669d) null, q10.h(), (W) null, 5, (Object) null);
        v(true);
    }

    public final void V(C5094d0 d0Var) {
        this.f6825g = d0Var;
    }

    public final void X(long j10) {
        B b10 = this.f6822d;
        if (b10 != null) {
            b10.A(j10);
        }
        B b11 = this.f6822d;
        if (b11 != null) {
            b11.I(W.f9419b.a());
        }
        if (!W.h(j10)) {
            x();
        }
    }

    public final void Z(boolean z10) {
        this.f6829k.setValue(Boolean.valueOf(z10));
    }

    public final void a0(boolean z10) {
        this.f6830l.setValue(Boolean.valueOf(z10));
    }

    public final void b0(m mVar) {
        this.f6828j = mVar;
    }

    public final void d0(C6203a aVar) {
        this.f6827i = aVar;
    }

    public final void e0(H h10) {
        this.f6820b = h10;
    }

    public final void f0(C17642l<? super P, C16807N> lVar) {
        this.f6821c = lVar;
    }

    public final void g0(long j10) {
        B b10 = this.f6822d;
        if (b10 != null) {
            b10.I(j10);
        }
        B b11 = this.f6822d;
        if (b11 != null) {
            b11.A(W.f9419b.a());
        }
        if (!W.h(j10)) {
            x();
        }
    }

    public final void h0(B b10) {
        this.f6822d = b10;
    }

    public final void i0(m1 m1Var) {
        this.f6826h = m1Var;
    }

    public final void j0(P p10) {
        this.f6823e.setValue(p10);
    }

    public final void k0(b0 b0Var) {
        this.f6824f = b0Var;
    }

    public final void l0() {
        C5094d0 d0Var;
        if (E()) {
            B b10 = this.f6822d;
            if (b10 == null || b10.y()) {
                h hVar = null;
                e eVar = !W.h(O().h()) ? new e(this) : null;
                f fVar = (W.h(O().h()) || !D()) ? null : new f(this);
                g gVar = (!D() || (d0Var = this.f6825g) == null || !d0Var.c()) ? null : new g(this);
                if (W.j(O().h()) != O().i().length()) {
                    hVar = new h(this);
                }
                h hVar2 = hVar;
                m1 m1Var = this.f6826h;
                if (m1Var != null) {
                    m1Var.c(z(), eVar, gVar, fVar, hVar2);
                }
            }
        }
    }

    public final void n() {
        B b10 = this.f6822d;
        if (b10 != null) {
            b10.A(W.f9419b.a());
        }
        B b11 = this.f6822d;
        if (b11 != null) {
            b11.I(W.f9419b.a());
        }
    }

    public final void o(boolean z10) {
        if (!W.h(O().h())) {
            C5094d0 d0Var = this.f6825g;
            if (d0Var != null) {
                d0Var.b(T1.Q.a(O()));
            }
            if (z10) {
                int k10 = W.k(O().h());
                this.f6821c.invoke(q(O().f(), X.b(k10, k10)));
                c0(C4370n.None);
            }
        }
    }

    public final N r() {
        return new a(this);
    }

    public final void s() {
        if (!W.h(O().h())) {
            C5094d0 d0Var = this.f6825g;
            if (d0Var != null) {
                d0Var.b(T1.Q.a(O()));
            }
            C4669d p10 = T1.Q.c(O(), O().i().length()).p(T1.Q.b(O(), O().i().length()));
            int l10 = W.l(O().h());
            this.f6821c.invoke(q(p10, X.b(l10, l10)));
            c0(C4370n.None);
            o0 o0Var = this.f6819a;
            if (o0Var != null) {
                o0Var.a();
            }
        }
    }

    public final void t(C5667g gVar) {
        if (!W.h(O().h())) {
            B b10 = this.f6822d;
            d0 j10 = b10 != null ? b10.j() : null;
            this.f6821c.invoke(P.d(O(), (C4669d) null, X.a((gVar == null || j10 == null) ? W.k(O().h()) : this.f6820b.a(d0.e(j10, gVar.v(), false, 2, (Object) null))), (W) null, 5, (Object) null));
        }
        c0((gVar == null || O().i().length() <= 0) ? C4370n.None : C4370n.Cursor);
        m0(false);
    }

    public final void v(boolean z10) {
        m mVar;
        B b10 = this.f6822d;
        if (!(b10 == null || b10.e() || (mVar = this.f6828j) == null)) {
            mVar.f();
        }
        this.f6837s = O();
        m0(z10);
        c0(C4370n.Selection);
    }

    public final void x() {
        m0(false);
        c0(C4370n.None);
    }

    public final C5094d0 y() {
        return this.f6825g;
    }

    public Q(o0 o0Var) {
        this.f6819a = o0Var;
        this.f6820b = s0.d();
        this.f6821c = d.f6845c;
        this.f6823e = u1.e(new P((String) null, 0, (W) null, 7, (DefaultConstructorMarker) null), (U0.o1) null, 2, (Object) null);
        this.f6824f = b0.f13577a.c();
        Boolean bool = Boolean.TRUE;
        this.f6829k = u1.e(bool, (U0.o1) null, 2, (Object) null);
        this.f6830l = u1.e(bool, (U0.o1) null, 2, (Object) null);
        C5667g.a aVar = C5667g.f26701b;
        this.f6831m = aVar.c();
        this.f6833o = aVar.c();
        this.f6834p = u1.e((Object) null, (U0.o1) null, 2, (Object) null);
        this.f6835q = u1.e((Object) null, (U0.o1) null, 2, (Object) null);
        this.f6836r = -1;
        this.f6837s = new P((String) null, 0, (W) null, 7, (DefaultConstructorMarker) null);
        this.f6839u = new i(this);
        this.f6840v = new c(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(o0 o0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : o0Var);
    }
}
