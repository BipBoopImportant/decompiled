package E0;

import B0.B;
import B0.d0;
import D0.d;
import H0.Q;
import HJ.C15846l;
import HJ.C15850p;
import N1.C4669d;
import N1.I;
import N1.P;
import N1.W;
import N1.X;
import T1.C4832a;
import T1.C4838g;
import T1.C4840i;
import T1.O;
import XH.C16807N;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17642l;
import p1.b1;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b!\u0010\"J-\u0010$\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b'\u0010(J&\u0010-\u001a\u00020\f*\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020/H\u0003¢\u0006\u0004\b0\u00101J&\u00105\u001a\u00020\f*\u00020\u00042\u0006\u00102\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106J9\u0010=\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\b=\u0010>J%\u0010@\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\b@\u0010AJ7\u0010D\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020B2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bD\u0010EJ%\u0010F\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bJ\u0010KJ7\u0010L\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010C\u001a\u00020B2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bL\u0010MJ%\u0010N\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00192\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bN\u0010OJA\u0010P\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020B2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bP\u0010QJ9\u0010R\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010C\u001a\u00020B2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bT\u0010UJ3\u0010X\u001a\u00020\f2\u0006\u0010V\u001a\u00020\t2\u0006\u0010C\u001a\u00020W2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bX\u0010YJ8\u0010Z\u001a\u00020\f2\u0006\u00102\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J>\u0010\\\u001a\u00020\f2\u0006\u00102\u001a\u00020)2\u0006\u0010C\u001a\u00020B2\u0006\u0010,\u001a\u00020+2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J+\u0010^\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020`*\u00020\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ-\u0010d\u001a\u00020\t*\u00020\u00042\u0006\u0010c\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\bd\u0010eJ-\u0010i\u001a\u00020+*\u00020\u00042\u0006\u0010c\u001a\u00020f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010h\u001a\u0004\u0018\u00010gH\u0001¢\u0006\u0004\bi\u0010jJC\u0010k\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u0001082\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0001¢\u0006\u0004\bk\u0010lJ/\u0010m\u001a\u00020+*\u0002072\u0006\u0010\u0006\u001a\u00020f2\b\u0010?\u001a\u0004\u0018\u0001082\b\u0010h\u001a\u0004\u0018\u00010gH\u0001¢\u0006\u0004\bm\u0010n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"LE0/i0;", "", "<init>", "()V", "LE0/y0;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "LE0/w0;", "layoutState", "", "v", "(LE0/y0;Landroid/view/inputmethod/SelectGesture;LE0/w0;)I", "LXH/N;", "I", "(LE0/y0;Landroid/view/inputmethod/SelectGesture;LE0/w0;)V", "Landroid/view/inputmethod/DeleteGesture;", "g", "(LE0/y0;Landroid/view/inputmethod/DeleteGesture;LE0/w0;)I", "A", "(LE0/y0;Landroid/view/inputmethod/DeleteGesture;LE0/w0;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "x", "(LE0/y0;Landroid/view/inputmethod/SelectRangeGesture;LE0/w0;)I", "K", "(LE0/y0;Landroid/view/inputmethod/SelectRangeGesture;LE0/w0;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "i", "(LE0/y0;Landroid/view/inputmethod/DeleteRangeGesture;LE0/w0;)I", "C", "(LE0/y0;Landroid/view/inputmethod/DeleteRangeGesture;LE0/w0;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "r", "(LE0/y0;Landroid/view/inputmethod/JoinOrSplitGesture;LE0/w0;Landroidx/compose/ui/platform/w1;)I", "Landroid/view/inputmethod/InsertGesture;", "o", "(LE0/y0;Landroid/view/inputmethod/InsertGesture;LE0/w0;Landroidx/compose/ui/platform/w1;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "t", "(LE0/y0;Landroid/view/inputmethod/RemoveSpaceGesture;LE0/w0;Landroidx/compose/ui/platform/w1;)I", "LN1/W;", "rangeInTransformedText", "", "adjustRange", "j", "(LE0/y0;JZ)V", "Landroid/view/inputmethod/HandwritingGesture;", "c", "(LE0/y0;Landroid/view/inputmethod/HandwritingGesture;)I", "range", "LD0/d;", "type", "e", "(LE0/y0;JI)V", "LB0/B;", "LH0/Q;", "textSelectionManager", "Lkotlin/Function1;", "LT1/i;", "editCommandConsumer", "u", "(LB0/B;Landroid/view/inputmethod/SelectGesture;LH0/Q;LnI/l;)I", "textFieldSelectionManager", "H", "(LB0/B;Landroid/view/inputmethod/SelectGesture;LH0/Q;)V", "LN1/d;", "text", "f", "(LB0/B;Landroid/view/inputmethod/DeleteGesture;LN1/d;LnI/l;)I", "z", "(LB0/B;Landroid/view/inputmethod/DeleteGesture;LH0/Q;)V", "w", "(LB0/B;Landroid/view/inputmethod/SelectRangeGesture;LH0/Q;LnI/l;)I", "J", "(LB0/B;Landroid/view/inputmethod/SelectRangeGesture;LH0/Q;)V", "h", "(LB0/B;Landroid/view/inputmethod/DeleteRangeGesture;LN1/d;LnI/l;)I", "B", "(LB0/B;Landroid/view/inputmethod/DeleteRangeGesture;LH0/Q;)V", "q", "(LB0/B;Landroid/view/inputmethod/JoinOrSplitGesture;LN1/d;Landroidx/compose/ui/platform/w1;LnI/l;)I", "n", "(LB0/B;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/w1;LnI/l;)I", "s", "(LB0/B;Landroid/view/inputmethod/RemoveSpaceGesture;LN1/d;Landroidx/compose/ui/platform/w1;LnI/l;)I", "offset", "", "p", "(ILjava/lang/String;LnI/l;)V", "y", "(JLH0/Q;LnI/l;)V", "k", "(JLN1/d;ZLnI/l;)V", "d", "(Landroid/view/inputmethod/HandwritingGesture;LnI/l;)I", "LN1/I;", "L", "(I)I", "handwritingGesture", "m", "(LE0/y0;Landroid/view/inputmethod/HandwritingGesture;LE0/w0;Landroidx/compose/ui/platform/w1;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "E", "(LE0/y0;Landroid/view/inputmethod/PreviewableHandwritingGesture;LE0/w0;Landroid/os/CancellationSignal;)Z", "l", "(LB0/B;Landroid/view/inputmethod/HandwritingGesture;LH0/Q;Landroidx/compose/ui/platform/w1;LnI/l;)I", "D", "(LB0/B;Landroid/view/inputmethod/PreviewableHandwritingGesture;LH0/Q;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f5704a = new i0();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHJ/l;", "it", "", "a", "(LHJ/l;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C15846l, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ M f5705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M f5706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(M m10, M m11) {
            super(1);
            this.f5705c = m10;
            this.f5706d = m11;
        }

        /* renamed from: a */
        public final CharSequence invoke(C15846l lVar) {
            M m10 = this.f5705c;
            if (m10.f144346a == -1) {
                m10.f144346a = lVar.c().p();
            }
            this.f5706d.f144346a = lVar.c().q() + 1;
            return "";
        }
    }

    private i0() {
    }

    private final void A(y0 y0Var, DeleteGesture deleteGesture, w0 w0Var) {
        e(y0Var, j0.w(w0Var, b1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), N1.M.f9383a.h()), d.f5495a.a());
    }

    private final void B(B b10, DeleteRangeGesture deleteRangeGesture, Q q10) {
        if (q10 != null) {
            q10.X(j0.x(b10, b1.f(deleteRangeGesture.getDeletionStartArea()), b1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), N1.M.f9383a.h()));
        }
    }

    private final void C(y0 y0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        e(y0Var, j0.y(w0Var, b1.f(deleteRangeGesture.getDeletionStartArea()), b1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), N1.M.f9383a.h()), d.f5495a.a());
    }

    /* access modifiers changed from: private */
    public static final void F(y0 y0Var) {
        y0.b(y0Var);
        y0.a(y0Var);
        F0.a aVar = F0.a.MergeIfPossible;
        throw null;
    }

    /* access modifiers changed from: private */
    public static final void G(Q q10) {
        if (q10 != null) {
            q10.n();
        }
    }

    private final void H(B b10, SelectGesture selectGesture, Q q10) {
        if (q10 != null) {
            q10.g0(j0.v(b10, b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), N1.M.f9383a.h()));
        }
    }

    private final void I(y0 y0Var, SelectGesture selectGesture, w0 w0Var) {
        e(y0Var, j0.w(w0Var, b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), N1.M.f9383a.h()), d.f5495a.b());
    }

    private final void J(B b10, SelectRangeGesture selectRangeGesture, Q q10) {
        if (q10 != null) {
            q10.g0(j0.x(b10, b1.f(selectRangeGesture.getSelectionStartArea()), b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), N1.M.f9383a.h()));
        }
    }

    private final void K(y0 y0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        e(y0Var, j0.y(w0Var, b1.f(selectRangeGesture.getSelectionStartArea()), b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), N1.M.f9383a.h()), d.f5495a.b());
    }

    private final int L(int i10) {
        return i10 != 1 ? i10 != 2 ? I.f9380a.a() : I.f9380a.a() : I.f9380a.b();
    }

    private final int c(y0 y0Var, HandwritingGesture handwritingGesture) {
        y0.b(y0Var);
        y0.a(y0Var);
        F0.a aVar = F0.a.MergeIfPossible;
        throw null;
    }

    private final int d(HandwritingGesture handwritingGesture, C17642l<? super C4840i, C16807N> lVar) {
        String a10 = handwritingGesture.getFallbackText();
        if (a10 == null) {
            return 3;
        }
        lVar.invoke(new C4832a(a10, 1));
        return 5;
    }

    private final void e(y0 y0Var, long j10, int i10) {
        if (W.h(j10)) {
            y0.b(y0Var);
            y0.a(y0Var);
            F0.a aVar = F0.a.MergeIfPossible;
            throw null;
        }
        throw null;
    }

    private final int f(B b10, DeleteGesture deleteGesture, C4669d dVar, C17642l<? super C4840i, C16807N> lVar) {
        int L10 = L(deleteGesture.getGranularity());
        long f10 = j0.v(b10, b1.f(deleteGesture.getDeletionArea()), L10, N1.M.f9383a.h());
        if (W.h(f10)) {
            return f5704a.d(d0.a(deleteGesture), lVar);
        }
        k(f10, dVar, I.d(L10, I.f9380a.b()), lVar);
        return 1;
    }

    private final int g(y0 y0Var, DeleteGesture deleteGesture, w0 w0Var) {
        int L10 = L(deleteGesture.getGranularity());
        long g10 = j0.w(w0Var, b1.f(deleteGesture.getDeletionArea()), L10, N1.M.f9383a.h());
        if (W.h(g10)) {
            return f5704a.c(y0Var, d0.a(deleteGesture));
        }
        j(y0Var, g10, I.d(L10, I.f9380a.b()));
        return 1;
    }

    private final int h(B b10, DeleteRangeGesture deleteRangeGesture, C4669d dVar, C17642l<? super C4840i, C16807N> lVar) {
        int L10 = L(deleteRangeGesture.getGranularity());
        long h10 = j0.x(b10, b1.f(deleteRangeGesture.getDeletionStartArea()), b1.f(deleteRangeGesture.getDeletionEndArea()), L10, N1.M.f9383a.h());
        if (W.h(h10)) {
            return f5704a.d(d0.a(deleteRangeGesture), lVar);
        }
        k(h10, dVar, I.d(L10, I.f9380a.b()), lVar);
        return 1;
    }

    private final int i(y0 y0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        int L10 = L(deleteRangeGesture.getGranularity());
        long i10 = j0.y(w0Var, b1.f(deleteRangeGesture.getDeletionStartArea()), b1.f(deleteRangeGesture.getDeletionEndArea()), L10, N1.M.f9383a.h());
        if (W.h(i10)) {
            return f5704a.c(y0Var, d0.a(deleteRangeGesture));
        }
        j(y0Var, i10, I.d(L10, I.f9380a.b()));
        return 1;
    }

    private final void j(y0 y0Var, long j10, boolean z10) {
        if (!z10) {
            y0.c(y0Var, "", j10, (F0.a) null, false, 12, (Object) null);
            return;
        }
        throw null;
    }

    private final void k(long j10, C4669d dVar, boolean z10, C17642l<? super C4840i, C16807N> lVar) {
        if (z10) {
            j10 = j0.m(j10, dVar);
        }
        lVar.invoke(j0.n(new O(W.i(j10), W.i(j10)), new C4838g(W.j(j10), 0)));
    }

    private final int n(B b10, InsertGesture insertGesture, w1 w1Var, C17642l<? super C4840i, C16807N> lVar) {
        d0 j10;
        P f10;
        if (w1Var == null) {
            return d(d0.a(insertGesture), lVar);
        }
        int c10 = j0.q(b10, j0.F(insertGesture.getInsertionPoint()), w1Var);
        if (c10 == -1 || ((j10 = b10.j()) != null && (f10 = j10.f()) != null && j0.z(f10, c10))) {
            return d(d0.a(insertGesture), lVar);
        }
        p(c10, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final int o(y0 y0Var, InsertGesture insertGesture, w0 w0Var, w1 w1Var) {
        int d10 = j0.r(w0Var, j0.F(insertGesture.getInsertionPoint()), w1Var);
        if (d10 == -1) {
            return c(y0Var, d0.a(insertGesture));
        }
        y0.c(y0Var, insertGesture.getTextToInsert(), X.a(d10), (F0.a) null, false, 12, (Object) null);
        return 1;
    }

    private final void p(int i10, String str, C17642l<? super C4840i, C16807N> lVar) {
        lVar.invoke(j0.n(new O(i10, i10), new C4832a(str, 1)));
    }

    private final int q(B b10, JoinOrSplitGesture joinOrSplitGesture, C4669d dVar, w1 w1Var, C17642l<? super C4840i, C16807N> lVar) {
        d0 j10;
        P f10;
        if (w1Var == null) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        int c10 = j0.q(b10, j0.F(joinOrSplitGesture.getJoinOrSplitPoint()), w1Var);
        if (c10 == -1 || ((j10 = b10.j()) != null && (f10 = j10.f()) != null && j0.z(f10, c10))) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        long k10 = j0.E(dVar, c10);
        if (W.h(k10)) {
            p(W.n(k10), " ", lVar);
        } else {
            k(k10, dVar, false, lVar);
        }
        return 1;
    }

    private final int r(y0 y0Var, JoinOrSplitGesture joinOrSplitGesture, w0 w0Var, w1 w1Var) {
        throw null;
    }

    private final int s(B b10, RemoveSpaceGesture removeSpaceGesture, C4669d dVar, w1 w1Var, C17642l<? super C4840i, C16807N> lVar) {
        d0 j10 = b10.j();
        long e10 = j0.t(j10 != null ? j10.f() : null, j0.F(removeSpaceGesture.getStartPoint()), j0.F(removeSpaceGesture.getEndPoint()), b10.i(), w1Var);
        if (W.h(e10)) {
            return f5704a.d(d0.a(removeSpaceGesture), lVar);
        }
        M m10 = new M();
        m10.f144346a = -1;
        M m11 = new M();
        m11.f144346a = -1;
        String k10 = new C15850p("\\s+").k(X.e(dVar, e10), new a(m10, m11));
        if (m10.f144346a == -1 || m11.f144346a == -1) {
            return d(d0.a(removeSpaceGesture), lVar);
        }
        int n10 = W.n(e10) + m10.f144346a;
        int n11 = W.n(e10) + m11.f144346a;
        String substring = k10.substring(m10.f144346a, k10.length() - (W.j(e10) - m11.f144346a));
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.invoke(j0.n(new O(n10, n11), new C4832a(substring, 1)));
        return 1;
    }

    private final int t(y0 y0Var, RemoveSpaceGesture removeSpaceGesture, w0 w0Var, w1 w1Var) {
        throw null;
    }

    private final int u(B b10, SelectGesture selectGesture, Q q10, C17642l<? super C4840i, C16807N> lVar) {
        long f10 = j0.v(b10, b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), N1.M.f9383a.h());
        if (W.h(f10)) {
            return f5704a.d(d0.a(selectGesture), lVar);
        }
        y(f10, q10, lVar);
        return 1;
    }

    private final int v(y0 y0Var, SelectGesture selectGesture, w0 w0Var) {
        if (W.h(j0.w(w0Var, b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), N1.M.f9383a.h()))) {
            return f5704a.c(y0Var, d0.a(selectGesture));
        }
        throw null;
    }

    private final int w(B b10, SelectRangeGesture selectRangeGesture, Q q10, C17642l<? super C4840i, C16807N> lVar) {
        long h10 = j0.x(b10, b1.f(selectRangeGesture.getSelectionStartArea()), b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), N1.M.f9383a.h());
        if (W.h(h10)) {
            return f5704a.d(d0.a(selectRangeGesture), lVar);
        }
        y(h10, q10, lVar);
        return 1;
    }

    private final int x(y0 y0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        if (W.h(j0.y(w0Var, b1.f(selectRangeGesture.getSelectionStartArea()), b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), N1.M.f9383a.h()))) {
            return f5704a.c(y0Var, d0.a(selectRangeGesture));
        }
        throw null;
    }

    private final void y(long j10, Q q10, C17642l<? super C4840i, C16807N> lVar) {
        lVar.invoke(new O(W.n(j10), W.i(j10)));
        if (q10 != null) {
            q10.v(true);
        }
    }

    private final void z(B b10, DeleteGesture deleteGesture, Q q10) {
        if (q10 != null) {
            q10.X(j0.v(b10, b1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), N1.M.f9383a.h()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = (r2 = r2.f()).l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(B0.B r4, android.view.inputmethod.PreviewableHandwritingGesture r5, H0.Q r6, android.os.CancellationSignal r7) {
        /*
            r3 = this;
            N1.d r0 = r4.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            B0.d0 r2 = r4.j()
            if (r2 == 0) goto L_0x001f
            N1.P r2 = r2.f()
            if (r2 == 0) goto L_0x001f
            N1.O r2 = r2.l()
            if (r2 == 0) goto L_0x001f
            N1.d r2 = r2.j()
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r0 = E0.e0.a(r5)
            if (r0 == 0) goto L_0x0035
            android.view.inputmethod.SelectGesture r5 = E0.f0.a(r5)
            r3.H(r4, r5, r6)
            goto L_0x005e
        L_0x0035:
            boolean r0 = E0.B.a(r5)
            if (r0 == 0) goto L_0x0043
            android.view.inputmethod.DeleteGesture r5 = E0.C.a(r5)
            r3.z(r4, r5, r6)
            goto L_0x005e
        L_0x0043:
            boolean r0 = E0.D.a(r5)
            if (r0 == 0) goto L_0x0051
            android.view.inputmethod.SelectRangeGesture r5 = E0.E.a(r5)
            r3.J(r4, r5, r6)
            goto L_0x005e
        L_0x0051:
            boolean r0 = E0.F.a(r5)
            if (r0 == 0) goto L_0x006a
            android.view.inputmethod.DeleteRangeGesture r5 = E0.G.a(r5)
            r3.B(r4, r5, r6)
        L_0x005e:
            if (r7 == 0) goto L_0x0068
            E0.g0 r4 = new E0.g0
            r4.<init>(r6)
            r7.setOnCancelListener(r4)
        L_0x0068:
            r4 = 1
            return r4
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.i0.D(B0.B, android.view.inputmethod.PreviewableHandwritingGesture, H0.Q, android.os.CancellationSignal):boolean");
    }

    public final boolean E(y0 y0Var, PreviewableHandwritingGesture previewableHandwritingGesture, w0 w0Var, CancellationSignal cancellationSignal) {
        if (e0.a(previewableHandwritingGesture)) {
            I(y0Var, f0.a(previewableHandwritingGesture), w0Var);
        } else if (B.a(previewableHandwritingGesture)) {
            A(y0Var, C.a(previewableHandwritingGesture), w0Var);
        } else if (D.a(previewableHandwritingGesture)) {
            K(y0Var, E.a(previewableHandwritingGesture), w0Var);
        } else if (!F.a(previewableHandwritingGesture)) {
            return false;
        } else {
            C(y0Var, G.a(previewableHandwritingGesture), w0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new h0(y0Var));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r1 = (r1 = r1.f()).l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(B0.B r7, android.view.inputmethod.HandwritingGesture r8, H0.Q r9, androidx.compose.ui.platform.w1 r10, nI.C17642l<? super T1.C4840i, XH.C16807N> r11) {
        /*
            r6 = this;
            N1.d r3 = r7.w()
            r0 = 3
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            B0.d0 r1 = r7.j()
            if (r1 == 0) goto L_0x001f
            N1.P r1 = r1.f()
            if (r1 == 0) goto L_0x001f
            N1.O r1 = r1.l()
            if (r1 == 0) goto L_0x001f
            N1.d r1 = r1.j()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r1)
            if (r1 != 0) goto L_0x0027
            return r0
        L_0x0027:
            boolean r0 = E0.e0.a(r8)
            if (r0 == 0) goto L_0x0037
            android.view.inputmethod.SelectGesture r8 = E0.f0.a(r8)
            int r7 = r6.u(r7, r8, r9, r11)
            goto L_0x009a
        L_0x0037:
            boolean r0 = E0.B.a(r8)
            if (r0 == 0) goto L_0x0046
            android.view.inputmethod.DeleteGesture r8 = E0.C.a(r8)
            int r7 = r6.f(r7, r8, r3, r11)
            goto L_0x009a
        L_0x0046:
            boolean r0 = E0.D.a(r8)
            if (r0 == 0) goto L_0x0055
            android.view.inputmethod.SelectRangeGesture r8 = E0.E.a(r8)
            int r7 = r6.w(r7, r8, r9, r11)
            goto L_0x009a
        L_0x0055:
            boolean r9 = E0.F.a(r8)
            if (r9 == 0) goto L_0x0064
            android.view.inputmethod.DeleteRangeGesture r8 = E0.G.a(r8)
            int r7 = r6.h(r7, r8, r3, r11)
            goto L_0x009a
        L_0x0064:
            boolean r9 = E0.O.a(r8)
            if (r9 == 0) goto L_0x0077
            android.view.inputmethod.JoinOrSplitGesture r2 = E0.P.a(r8)
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            int r7 = r0.q(r1, r2, r3, r4, r5)
            goto L_0x009a
        L_0x0077:
            boolean r9 = E0.J.a(r8)
            if (r9 == 0) goto L_0x0086
            android.view.inputmethod.InsertGesture r8 = E0.K.a(r8)
            int r7 = r6.n(r7, r8, r10, r11)
            goto L_0x009a
        L_0x0086:
            boolean r9 = E0.M.a(r8)
            if (r9 == 0) goto L_0x0099
            android.view.inputmethod.RemoveSpaceGesture r2 = E0.N.a(r8)
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            int r7 = r0.s(r1, r2, r3, r4, r5)
            goto L_0x009a
        L_0x0099:
            r7 = 2
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.i0.l(B0.B, android.view.inputmethod.HandwritingGesture, H0.Q, androidx.compose.ui.platform.w1, nI.l):int");
    }

    public final int m(y0 y0Var, HandwritingGesture handwritingGesture, w0 w0Var, w1 w1Var) {
        if (e0.a(handwritingGesture)) {
            return v(y0Var, f0.a(handwritingGesture), w0Var);
        }
        if (B.a(handwritingGesture)) {
            return g(y0Var, C.a(handwritingGesture), w0Var);
        }
        if (D.a(handwritingGesture)) {
            return x(y0Var, E.a(handwritingGesture), w0Var);
        }
        if (F.a(handwritingGesture)) {
            return i(y0Var, G.a(handwritingGesture), w0Var);
        }
        if (O.a(handwritingGesture)) {
            return r(y0Var, P.a(handwritingGesture), w0Var, w1Var);
        }
        if (J.a(handwritingGesture)) {
            return o(y0Var, K.a(handwritingGesture), w0Var, w1Var);
        }
        if (M.a(handwritingGesture)) {
            return t(y0Var, N.a(handwritingGesture), w0Var, w1Var);
        }
        return 2;
    }
}
