package H0;

import A1.B;
import A1.C4336c;
import A1.K;
import A1.U;
import B0.C4369m;
import B0.N;
import E0.x0;
import E1.C4488v;
import E1.C4489w;
import H0.C4538p;
import N1.C4669d;
import U0.C4899r0;
import U0.o1;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.platform.C5094d0;
import androidx.compose.ui.platform.m1;
import bI.C17035a;
import dI.C17164e;
import eI.C17187b;
import j0.C5463t;
import j0.C5464u;
import j0.C5465v;
import j0.H;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n1.C5635o;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import w1.C6203a;
import w1.C6204b;
import y1.C6254b;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u0006*\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J*\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104J5\u0010:\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*09082\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001fH\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u001fH\u0000¢\u0006\u0004\b?\u0010=J\u000f\u0010@\u001a\u00020\u001fH\u0000¢\u0006\u0004\b@\u0010=J\u0011\u0010B\u001a\u0004\u0018\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0006H\u0000¢\u0006\u0004\bD\u0010\bJ\r\u0010E\u001a\u00020\u0006¢\u0006\u0004\bE\u0010\bJ\u0015\u0010G\u001a\u00020F2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bG\u0010HJ4\u0010K\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010\u00102\u0006\u0010J\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ2\u0010M\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001fH\u0001¢\u0006\u0004\bO\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010TRF\u0010_\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00060\u000f2\u0014\u0010X\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00060\u000f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010w\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u001a\u00020x8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R1\u0010\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020\u001f8F@FX\u0002¢\u0006\u0016\n\u0005\b\u0001\u0010T\u001a\u0005\b\u0001\u0010=\"\u0006\b\u0001\u0010\u0001R \u0010J\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0001\u0010\u0001R5\u0010\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010\u0001\u001a\u0004\u0018\u00010\u00198\u0006@FX\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u00104\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020\u00108@@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0001\u0010T\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020\u00108@@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0001\u0010T\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R;\u0010\u0001\u001a\u0004\u0018\u00010\u00102\t\u0010\u0001\u001a\u0004\u0018\u00010\u00108F@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\u001c\u0010T\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R;\u0010 \u0001\u001a\u0004\u0018\u00010\u00102\t\u0010\u0001\u001a\u0004\u0018\u00010\u00108F@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\bD\u0010T\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R7\u0010¦\u0001\u001a\u0005\u0018\u00010¡\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010¡\u00018F@BX\u0002¢\u0006\u0016\n\u0004\b\u0012\u0010T\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R;\u0010©\u0001\u001a\u0004\u0018\u00010\u00102\t\u0010\u0001\u001a\u0004\u0018\u00010\u00108F@BX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b1\u0010T\u001a\u0006\b§\u0001\u0010\u0001\"\u0006\b¨\u0001\u0010\u0001R2\u0010°\u0001\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u000e¢\u0006\u001f\n\u0006\b\u0001\u0010ª\u0001\u0012\u0005\b¯\u0001\u0010\b\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R/\u0010³\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020\u001f8\u0000@@X\u000e¢\u0006\u0015\n\u0004\b\f\u0010e\u001a\u0005\b±\u0001\u0010=\"\u0006\b²\u0001\u0010\u0001R\u0016\u0010µ\u0001\u001a\u00020\u001f8BX\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010=R.\u0010º\u0001\u001a\u0004\u0018\u00010*2\t\u0010\u0001\u001a\u0004\u0018\u00010*8F@FX\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R)\u0010½\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020\u001f8F@FX\u000e¢\u0006\u000f\u001a\u0005\b»\u0001\u0010=\"\u0006\b¼\u0001\u0010\u0001R\u0014\u0010À\u0001\u001a\u00020\u00148F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Á\u0001"}, d2 = {"LH0/G;", "", "LH0/L;", "selectionRegistrar", "<init>", "(LH0/L;)V", "LXH/N;", "k0", "()V", "j0", "n0", "Lo1/i;", "s", "()Lo1/i;", "LA1/K;", "Lkotlin/Function1;", "Lo1/g;", "onTap", "p", "(LA1/K;LnI/l;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/ui/d;", "Lkotlin/Function0;", "block", "M", "(Landroidx/compose/ui/d;LnI/a;)Landroidx/compose/ui/d;", "LE1/v;", "layoutCoordinates", "offset", "n", "(LE1/v;J)J", "position", "", "isStartHandle", "LH0/v;", "adjustment", "i0", "(JZLH0/v;)V", "previousHandlePosition", "LH0/C;", "E", "(JJZ)LH0/C;", "selectionLayout", "LH0/p;", "newSelection", "R", "(LH0/C;LH0/p;)V", "LH0/p$a;", "anchor", "LH0/n;", "q", "(LH0/p$a;)LH0/n;", "O", "()LE1/v;", "", "selectableId", "previousSelection", "LXH/v;", "Lj0/u;", "Q", "(JLH0/p;)LXH/v;", "I", "()Z", "P", "L", "K", "LN1/d;", "C", "()LN1/d;", "o", "N", "LB0/N;", "H", "(Z)LB0/N;", "newPosition", "previousPosition", "m0", "(Lo1/g;JZLH0/v;)Z", "l0", "(JJZLH0/v;)Z", "h0", "a", "LH0/L;", "LU0/r0;", "b", "LU0/r0;", "_selection", "c", "_isInTouchMode", "newOnSelectionChange", "d", "LnI/l;", "B", "()LnI/l;", "c0", "(LnI/l;)V", "onSelectionChange", "Lw1/a;", "e", "Lw1/a;", "getHapticFeedBack", "()Lw1/a;", "Z", "(Lw1/a;)V", "hapticFeedBack", "Landroidx/compose/ui/platform/d0;", "f", "Landroidx/compose/ui/platform/d0;", "getClipboardManager", "()Landroidx/compose/ui/platform/d0;", "S", "(Landroidx/compose/ui/platform/d0;)V", "clipboardManager", "Landroidx/compose/ui/platform/m1;", "g", "Landroidx/compose/ui/platform/m1;", "getTextToolbar", "()Landroidx/compose/ui/platform/m1;", "g0", "(Landroidx/compose/ui/platform/m1;)V", "textToolbar", "Landroidx/compose/ui/focus/m;", "h", "Landroidx/compose/ui/focus/m;", "y", "()Landroidx/compose/ui/focus/m;", "setFocusRequester", "(Landroidx/compose/ui/focus/m;)V", "focusRequester", "<set-?>", "i", "z", "a0", "(Z)V", "hasFocus", "j", "Lo1/g;", "value", "k", "LE1/v;", "r", "T", "(LE1/v;)V", "containerLayoutCoordinates", "l", "u", "()J", "V", "(J)V", "dragBeginPosition", "m", "v", "W", "dragTotalDistance", "G", "()Lo1/g;", "f0", "(Lo1/g;)V", "startHandlePosition", "x", "Y", "endHandlePosition", "LB0/m;", "w", "()LB0/m;", "X", "(LB0/m;)V", "draggingHandle", "t", "U", "currentDragPosition", "LH0/C;", "getPreviousSelectionLayout$foundation_release", "()LH0/C;", "setPreviousSelectionLayout$foundation_release", "(LH0/C;)V", "getPreviousSelectionLayout$foundation_release$annotations", "previousSelectionLayout", "getShowToolbar$foundation_release", "e0", "showToolbar", "F", "shouldShowMagnifier", "D", "()LH0/p;", "d0", "(LH0/p;)V", "selection", "J", "b0", "isInTouchMode", "A", "()Landroidx/compose/ui/d;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final L f6723a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0<C4538p> f6724b = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0<Boolean> f6725c = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private C17642l<? super C4538p, C16807N> f6726d = new q(this);

    /* renamed from: e  reason: collision with root package name */
    private C6203a f6727e;

    /* renamed from: f  reason: collision with root package name */
    private C5094d0 f6728f;

    /* renamed from: g  reason: collision with root package name */
    private m1 f6729g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.compose.ui.focus.m f6730h = new androidx.compose.ui.focus.m();

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f6731i = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    /* renamed from: j  reason: collision with root package name */
    private C5667g f6732j;

    /* renamed from: k  reason: collision with root package name */
    private C4488v f6733k;

    /* renamed from: l  reason: collision with root package name */
    private final C4899r0 f6734l;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f6735m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f6736n;

    /* renamed from: o  reason: collision with root package name */
    private final C4899r0 f6737o;

    /* renamed from: p  reason: collision with root package name */
    private final C4899r0 f6738p;

    /* renamed from: q  reason: collision with root package name */
    private final C4899r0 f6739q;

    /* renamed from: r  reason: collision with root package name */
    private C f6740r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6741s;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6742c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G g10) {
            super(1);
            this.f6742c = g10;
        }

        public final void a(long j10) {
            if (this.f6742c.f6723a.c().a(j10)) {
                this.f6742c.k0();
                this.f6742c.n0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isInTouchMode", "LE1/v;", "layoutCoordinates", "Lo1/g;", "rawPosition", "LH0/v;", "selectionMode", "LXH/N;", "a", "(ZLE1/v;JLH0/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements nI.r<Boolean, C4488v, C5667g, C4543v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6743c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(G g10) {
            super(4);
            this.f6743c = g10;
        }

        public final void a(boolean z10, C4488v vVar, long j10, C4543v vVar2) {
            long a10 = vVar.a();
            C5669i iVar = new C5669i(0.0f, 0.0f, (float) c2.r.h(a10), (float) c2.r.g(a10));
            if (!H.d(iVar, j10)) {
                j10 = x0.a(j10, iVar);
            }
            long a11 = this.f6743c.n(vVar, j10);
            if (C5668h.c(a11)) {
                this.f6743c.b0(z10);
                this.f6743c.i0(a11, false, vVar2);
                this.f6743c.y().f();
                this.f6743c.e0(false);
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Boolean) obj).booleanValue(), (C4488v) obj2, ((C5667g) obj3).v(), (C4543v) obj4);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isInTouchMode", "", "selectableId", "LXH/N;", "a", "(ZJ)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements nI.p<Boolean, Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6744c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G g10) {
            super(2);
            this.f6744c = g10;
        }

        public final void a(boolean z10, long j10) {
            G g10 = this.f6744c;
            v<C4538p, C5464u<C4538p>> Q10 = g10.Q(j10, g10.D());
            C4538p a10 = Q10.a();
            C5464u b10 = Q10.b();
            if (!C17542s.e(a10, this.f6744c.D())) {
                this.f6744c.f6723a.v(b10);
                this.f6744c.B().invoke(a10);
            }
            this.f6744c.b0(z10);
            this.f6744c.y().f();
            this.f6744c.e0(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "isInTouchMode", "LE1/v;", "layoutCoordinates", "Lo1/g;", "newPosition", "previousPosition", "isStartHandle", "LH0/v;", "selectionMode", "a", "(ZLE1/v;JJZLH0/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements nI.t<Boolean, C4488v, C5667g, C5667g, Boolean, C4543v, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6745c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(G g10) {
            super(6);
            this.f6745c = g10;
        }

        public final Boolean a(boolean z10, C4488v vVar, long j10, long j11, boolean z11, C4543v vVar2) {
            long a10 = this.f6745c.n(vVar, j10);
            long a11 = this.f6745c.n(vVar, j11);
            this.f6745c.b0(z10);
            return Boolean.valueOf(this.f6745c.m0(C5667g.d(a10), a11, z11, vVar2));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return a(((Boolean) obj).booleanValue(), (C4488v) obj2, ((C5667g) obj3).v(), ((C5667g) obj4).v(), ((Boolean) obj5).booleanValue(), (C4543v) obj6);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6746c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(G g10) {
            super(0);
            this.f6746c = g10;
        }

        public final void invoke() {
            this.f6746c.e0(true);
            this.f6746c.X((C4369m) null);
            this.f6746c.U((C5667g) null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableKey", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6747c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(G g10) {
            super(1);
            this.f6747c = g10;
        }

        public final void a(long j10) {
            if (this.f6747c.f6723a.c().a(j10)) {
                this.f6747c.N();
                this.f6747c.d0((C4538p) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6748c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(G g10) {
            super(1);
            this.f6748c = g10;
        }

        public final void a(long j10) {
            C4538p.a c10;
            C4538p.a e10;
            C4538p D10 = this.f6748c.D();
            if (!(D10 == null || (e10 = D10.e()) == null || j10 != e10.e())) {
                this.f6748c.f0((C5667g) null);
            }
            C4538p D11 = this.f6748c.D();
            if (!(D11 == null || (c10 = D11.c()) == null || j10 != c10.e())) {
                this.f6748c.Y((C5667g) null);
            }
            if (this.f6748c.f6723a.c().a(j10)) {
                this.f6748c.n0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {739}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.k implements nI.p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        int f6749d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f6750e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f6751f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17642l<? super C5667g, C16807N> lVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f6751f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f6751f, eVar);
            hVar.f6750e = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((h) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f6749d;
            if (i10 == 0) {
                y.b(obj);
                this.f6749d = 1;
                obj = p0.G.l((C4336c) this.f6750e, (A1.r) null, this, 1, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            B b10 = (B) obj;
            if (b10 != null) {
                this.f6751f.invoke(C5667g.d(b10.h()));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class i<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0.G f6752a;

        public i(j0.G g10) {
            this.f6752a = g10;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(this.f6752a.b(((Number) t10).longValue())), Integer.valueOf(this.f6752a.b(((Number) t11).longValue())));
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"H0/G$j", "LB0/N;", "LXH/N;", "a", "()V", "Lo1/g;", "point", "h", "(J)V", "startPoint", "i", "delta", "k", "j", "g", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f6754b;

        j(boolean z10, G g10) {
            this.f6753a = z10;
            this.f6754b = g10;
        }

        private final void a() {
            this.f6754b.e0(true);
            this.f6754b.X((C4369m) null);
            this.f6754b.U((C5667g) null);
        }

        public void g() {
            a();
        }

        public void h(long j10) {
            C4488v x10;
            C5667g G10 = this.f6753a ? this.f6754b.G() : this.f6754b.x();
            if (G10 != null) {
                G10.v();
                C4538p D10 = this.f6754b.D();
                if (D10 != null) {
                    C4536n q10 = this.f6754b.q(this.f6753a ? D10.e() : D10.c());
                    if (q10 != null && (x10 = q10.x()) != null) {
                        long k10 = q10.k(D10, this.f6753a);
                        if (!C5668h.d(k10)) {
                            long a10 = B.a(k10);
                            G g10 = this.f6754b;
                            g10.U(C5667g.d(g10.O().E(x10, a10)));
                            this.f6754b.X(this.f6753a ? C4369m.SelectionStart : C4369m.SelectionEnd);
                            this.f6754b.e0(false);
                        }
                    }
                }
            }
        }

        public void i(long j10) {
            if (this.f6754b.w() != null) {
                C4538p D10 = this.f6754b.D();
                C17542s.g(D10);
                C4536n c10 = this.f6754b.f6723a.m().c((this.f6753a ? D10.e() : D10.c()).e());
                if (c10 != null) {
                    C4536n nVar = c10;
                    C4488v x10 = nVar.x();
                    if (x10 != null) {
                        long k10 = nVar.k(D10, this.f6753a);
                        if (!C5668h.d(k10)) {
                            long a10 = B.a(k10);
                            G g10 = this.f6754b;
                            g10.V(g10.O().E(x10, a10));
                            this.f6754b.W(C5667g.f26701b.c());
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Current selectable should have layout coordinates.");
                }
                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
            }
        }

        public void j() {
            a();
        }

        public void k(long j10) {
            if (this.f6754b.w() != null) {
                G g10 = this.f6754b;
                g10.W(C5667g.r(g10.v(), j10));
                long r10 = C5667g.r(this.f6754b.u(), this.f6754b.v());
                if (this.f6754b.m0(C5667g.d(r10), this.f6754b.u(), this.f6753a, C4543v.f6972a.k())) {
                    this.f6754b.V(r10);
                    this.f6754b.W(C5667g.f26701b.c());
                }
            }
        }

        public void onCancel() {
            a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6755c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(G g10) {
            super(0);
            this.f6755c = g10;
        }

        public final void invoke() {
            this.f6755c.N();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "it", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6756c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(G g10) {
            super(1);
            this.f6756c = g10;
        }

        public final void a(C4488v vVar) {
            this.f6756c.T(vVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln1/o;", "focusState", "LXH/N;", "a", "(Ln1/o;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17642l<C5635o, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6757c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(G g10) {
            super(1);
            this.f6757c = g10;
        }

        public final void a(C5635o oVar) {
            if (!oVar.a() && this.f6757c.z()) {
                this.f6757c.N();
            }
            this.f6757c.a0(oVar.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5635o) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends C17544u implements C17642l<Boolean, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6758c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(G g10) {
            super(1);
            this.f6758c = g10;
        }

        public final void a(boolean z10) {
            this.f6758c.b0(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends C17544u implements C17642l<C6254b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6759c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(G g10) {
            super(1);
            this.f6759c = g10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (I.b(keyEvent)) {
                this.f6759c.o();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {746}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f6760c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f6761d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G f6762e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f6763f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f6764c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(1);
                this.f6764c = aVar;
            }

            public final void a(long j10) {
                this.f6764c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5667g) obj).v());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(G g10, C17631a<C16807N> aVar, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f6762e = g10;
            this.f6763f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            p pVar = new p(this.f6762e, this.f6763f, eVar);
            pVar.f6761d = obj;
            return pVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((p) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f6760c;
            if (i10 == 0) {
                y.b(obj);
                G g10 = this.f6762e;
                a aVar = new a(this.f6763f);
                this.f6760c = 1;
                if (g10.p((K) this.f6761d, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/p;", "it", "LXH/N;", "a", "(LH0/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends C17544u implements C17642l<C4538p, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6765c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(G g10) {
            super(1);
            this.f6765c = g10;
        }

        public final void a(C4538p pVar) {
            this.f6765c.d0(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4538p) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/p;", "newSelection", "LXH/N;", "a", "(LH0/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends C17544u implements C17642l<C4538p, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C4538p, C16807N> f6767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(G g10, C17642l<? super C4538p, C16807N> lVar) {
            super(1);
            this.f6766c = g10;
            this.f6767d = lVar;
        }

        public final void a(C4538p pVar) {
            this.f6766c.d0(pVar);
            this.f6767d.invoke(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4538p) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class s extends C17540p implements C17631a<C16807N> {
        s(Object obj) {
            super(0, obj, G.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((G) this.receiver).j0();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class t extends C17540p implements C17631a<C16807N> {
        t(Object obj) {
            super(0, obj, G.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((G) this.receiver).P();
        }
    }

    public G(L l10) {
        this.f6723a = l10;
        C5667g.a aVar = C5667g.f26701b;
        this.f6734l = u1.e(C5667g.d(aVar.c()), (o1) null, 2, (Object) null);
        this.f6735m = u1.e(C5667g.d(aVar.c()), (o1) null, 2, (Object) null);
        this.f6736n = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f6737o = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f6738p = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f6739q = u1.e((Object) null, (o1) null, 2, (Object) null);
        l10.p(new a(this));
        l10.u(new b(this));
        l10.t(new c(this));
        l10.r(new d(this));
        l10.s(new e(this));
        l10.q(new f(this));
        l10.o(new g(this));
    }

    private final C E(long j10, long j11, boolean z10) {
        C4488v O10 = O();
        List<C4536n> w10 = this.f6723a.w(O10);
        j0.G a10 = C5463t.a();
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            a10.n(w10.get(i10).h(), i10);
        }
        D d10 = new D(j10, j11, O10, z10, C5668h.d(j11) ? null : D(), new i(a10), (DefaultConstructorMarker) null);
        int size2 = w10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            w10.get(i11).l(d10);
        }
        return d10.b();
    }

    private final boolean F() {
        return w() != null && J() && !L();
    }

    private final androidx.compose.ui.d M(androidx.compose.ui.d dVar, C17631a<C16807N> aVar) {
        return z() ? U.d(dVar, C16807N.f139792a, new p(this, aVar, (C17164e<? super p>) null)) : dVar;
    }

    private final void R(C c10, C4538p pVar) {
        C6203a aVar;
        if (h0() && (aVar = this.f6727e) != null) {
            aVar.a(C6204b.f31328a.b());
        }
        this.f6723a.v(c10.k(pVar));
        this.f6726d.invoke(pVar);
    }

    /* access modifiers changed from: private */
    public final void U(C5667g gVar) {
        this.f6739q.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void V(long j10) {
        this.f6734l.setValue(C5667g.d(j10));
    }

    /* access modifiers changed from: private */
    public final void W(long j10) {
        this.f6735m.setValue(C5667g.d(j10));
    }

    /* access modifiers changed from: private */
    public final void X(C4369m mVar) {
        this.f6738p.setValue(mVar);
    }

    /* access modifiers changed from: private */
    public final void Y(C5667g gVar) {
        this.f6737o.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void f0(C5667g gVar) {
        this.f6736n.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void i0(long j10, boolean z10, C4543v vVar) {
        this.f6740r = null;
        l0(j10, C5667g.f26701b.b(), z10, vVar);
    }

    /* access modifiers changed from: private */
    public final void j0() {
        o();
        N();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r0.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (H0.H.d(r7, r8) == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0() {
        /*
            r11 = this;
            H0.p r0 = r11.D()
            E1.v r1 = r11.f6733k
            r2 = 0
            if (r0 == 0) goto L_0x0014
            H0.p$a r3 = r0.e()
            if (r3 == 0) goto L_0x0014
            H0.n r3 = r11.q(r3)
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x0022
            H0.p$a r4 = r0.c()
            if (r4 == 0) goto L_0x0022
            H0.n r4 = r11.q(r4)
            goto L_0x0023
        L_0x0022:
            r4 = r2
        L_0x0023:
            if (r3 == 0) goto L_0x002a
            E1.v r5 = r3.x()
            goto L_0x002b
        L_0x002a:
            r5 = r2
        L_0x002b:
            if (r4 == 0) goto L_0x0032
            E1.v r6 = r4.x()
            goto L_0x0033
        L_0x0032:
            r6 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x00a0
            boolean r7 = r1.c()
            if (r7 == 0) goto L_0x00a0
            if (r5 != 0) goto L_0x0042
            if (r6 != 0) goto L_0x0042
            goto L_0x00a0
        L_0x0042:
            o1.i r7 = H0.H.i(r1)
            if (r5 == 0) goto L_0x006f
            r8 = 1
            long r8 = r3.k(r0, r8)
            boolean r3 = o1.C5668h.d(r8)
            if (r3 == 0) goto L_0x0054
            goto L_0x006f
        L_0x0054:
            long r8 = r1.E(r5, r8)
            o1.g r3 = o1.C5667g.d(r8)
            long r8 = r3.v()
            B0.m r5 = r11.w()
            B0.m r10 = B0.C4369m.SelectionStart
            if (r5 == r10) goto L_0x0070
            boolean r5 = H0.H.d(r7, r8)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r2
        L_0x0070:
            r11.f0(r3)
            if (r6 == 0) goto L_0x009c
            r3 = 0
            long r3 = r4.k(r0, r3)
            boolean r0 = o1.C5668h.d(r3)
            if (r0 == 0) goto L_0x0081
            goto L_0x009c
        L_0x0081:
            long r0 = r1.E(r6, r3)
            o1.g r0 = o1.C5667g.d(r0)
            long r3 = r0.v()
            B0.m r1 = r11.w()
            B0.m r5 = B0.C4369m.SelectionEnd
            if (r1 == r5) goto L_0x009b
            boolean r1 = H0.H.d(r7, r3)
            if (r1 == 0) goto L_0x009c
        L_0x009b:
            r2 = r0
        L_0x009c:
            r11.Y(r2)
            return
        L_0x00a0:
            r11.f0(r2)
            r11.Y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.G.k0():void");
    }

    /* access modifiers changed from: private */
    public final long n(C4488v vVar, long j10) {
        C4488v vVar2 = this.f6733k;
        return (vVar2 == null || !vVar2.c()) ? C5667g.f26701b.b() : O().E(vVar, j10);
    }

    /* access modifiers changed from: private */
    public final void n0() {
        m1 m1Var;
        if (!z() || (m1Var = this.f6729g) == null) {
            return;
        }
        if (this.f6741s && J()) {
            C5669i s10 = s();
            if (s10 != null) {
                t tVar = null;
                s sVar = K() ? new s(this) : null;
                if (!I()) {
                    tVar = new t(this);
                }
                m1.a(m1Var, s10, sVar, (C17631a) null, (C17631a) null, tVar, 12, (Object) null);
            }
        } else if (m1Var.i() == androidx.compose.ui.platform.o1.Shown) {
            m1Var.b();
        }
    }

    /* access modifiers changed from: private */
    public final Object p(K k10, C17642l<? super C5667g, C16807N> lVar, C17164e<? super C16807N> eVar) {
        Object c10 = p0.t.c(k10, new h(lVar, (C17164e<? super h>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    private final C5669i s() {
        C4488v vVar;
        if (D() == null || (vVar = this.f6733k) == null || !vVar.c()) {
            return null;
        }
        List<C4536n> w10 = this.f6723a.w(O());
        ArrayList arrayList = new ArrayList(w10.size());
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4536n nVar = w10.get(i10);
            C4538p c10 = this.f6723a.c().c(nVar.h());
            v a10 = c10 != null ? C16796C.a(nVar, c10) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        List a11 = H.e(arrayList);
        if (a11.isEmpty()) {
            return null;
        }
        C5669i g10 = H.g(a11, vVar);
        if (C17542s.e(g10, H.f6768a)) {
            return null;
        }
        C5669i w11 = H.i(vVar).w(g10);
        if (w11.t() < 0.0f || w11.n() < 0.0f) {
            return null;
        }
        C5669i A10 = w11.A(C4489w.f(vVar));
        return C5669i.h(A10, 0.0f, 0.0f, 0.0f, A10.j() + (B.b() * ((float) 4)), 7, (Object) null);
    }

    public final androidx.compose.ui.d A() {
        androidx.compose.ui.d dVar = androidx.compose.ui.d.f18749a;
        androidx.compose.ui.d a10 = androidx.compose.ui.input.key.a.a(y.k(FocusableKt.c(androidx.compose.ui.focus.b.a(androidx.compose.ui.focus.n.a(androidx.compose.ui.layout.c.a(M(dVar, new k(this)), new l(this)), this.f6730h), new m(this)), false, (r0.m) null, 3, (Object) null), new n(this)), new o(this));
        if (F()) {
            dVar = I.c(dVar, this);
        }
        return a10.s(dVar);
    }

    public final C17642l<C4538p, C16807N> B() {
        return this.f6726d;
    }

    public final C4669d C() {
        if (D() == null || this.f6723a.c().f()) {
            return null;
        }
        C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        List<C4536n> w10 = this.f6723a.w(O());
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4536n nVar = w10.get(i10);
            C4538p c10 = this.f6723a.c().c(nVar.h());
            if (c10 != null) {
                C4669d a10 = nVar.a();
                aVar.h(c10.d() ? a10.subSequence(c10.c().d(), c10.e().d()) : a10.subSequence(c10.e().d(), c10.c().d()));
            }
        }
        return aVar.q();
    }

    public final C4538p D() {
        return this.f6724b.getValue();
    }

    public final C5667g G() {
        return (C5667g) this.f6736n.getValue();
    }

    public final N H(boolean z10) {
        return new j(z10, this);
    }

    public final boolean I() {
        C4538p c10;
        List<C4536n> w10 = this.f6723a.w(O());
        if (w10.isEmpty()) {
            return true;
        }
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4536n nVar = w10.get(i10);
            C4669d a10 = nVar.a();
            if (a10.length() != 0 && ((c10 = this.f6723a.c().c(nVar.h())) == null || Math.abs(c10.e().d() - c10.c().d()) != a10.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean J() {
        return this.f6725c.getValue().booleanValue();
    }

    public final boolean K() {
        C4538p D10 = D();
        if (D10 == null || C17542s.e(D10.e(), D10.c())) {
            return false;
        }
        if (D10.e().e() == D10.c().e()) {
            return true;
        }
        List<C4536n> w10 = this.f6723a.w(O());
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4538p c10 = this.f6723a.c().c(w10.get(i10).h());
            if (c10 != null && c10.e().d() != c10.c().d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean L() {
        C4538p D10 = D();
        if (D10 == null) {
            return true;
        }
        return C17542s.e(D10.e(), D10.c());
    }

    public final void N() {
        C6203a aVar;
        this.f6723a.v(C5465v.a());
        e0(false);
        if (D() != null) {
            this.f6726d.invoke(null);
            if (J() && (aVar = this.f6727e) != null) {
                aVar.a(C6204b.f31328a.b());
            }
        }
    }

    public final C4488v O() {
        C4488v vVar = this.f6733k;
        if (vVar == null) {
            throw new IllegalArgumentException("null coordinates");
        } else if (vVar.c()) {
            return vVar;
        } else {
            throw new IllegalArgumentException("unattached coordinates");
        }
    }

    public final void P() {
        List<C4536n> w10 = this.f6723a.w(O());
        if (!w10.isEmpty()) {
            H c10 = C5465v.c();
            int size = w10.size();
            C4538p pVar = null;
            C4538p pVar2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                C4536n nVar = w10.get(i10);
                C4538p i11 = nVar.i();
                if (i11 != null) {
                    if (pVar == null) {
                        pVar = i11;
                    }
                    c10.o(nVar.h(), i11);
                    pVar2 = i11;
                }
            }
            if (!c10.f()) {
                if (pVar != pVar2) {
                    C17542s.g(pVar);
                    C4538p.a e10 = pVar.e();
                    C17542s.g(pVar2);
                    pVar = new C4538p(e10, pVar2.c(), false);
                }
                this.f6723a.v(c10);
                this.f6726d.invoke(pVar);
                this.f6740r = null;
            }
        }
    }

    public final v<C4538p, C5464u<C4538p>> Q(long j10, C4538p pVar) {
        C6203a aVar;
        H c10 = C5465v.c();
        List<C4536n> w10 = this.f6723a.w(O());
        int size = w10.size();
        C4538p pVar2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            C4536n nVar = w10.get(i10);
            C4538p i11 = nVar.h() == j10 ? nVar.i() : null;
            if (i11 != null) {
                c10.s(nVar.h(), i11);
            }
            pVar2 = H.h(pVar2, i11);
        }
        if (J() && !C17542s.e(pVar2, pVar) && (aVar = this.f6727e) != null) {
            aVar.a(C6204b.f31328a.b());
        }
        return new v<>(pVar2, c10);
    }

    public final void S(C5094d0 d0Var) {
        this.f6728f = d0Var;
    }

    public final void T(C4488v vVar) {
        this.f6733k = vVar;
        if (z() && D() != null) {
            C5667g d10 = vVar != null ? C5667g.d(C4489w.g(vVar)) : null;
            if (!C17542s.e(this.f6732j, d10)) {
                this.f6732j = d10;
                k0();
                n0();
            }
        }
    }

    public final void Z(C6203a aVar) {
        this.f6727e = aVar;
    }

    public final void a0(boolean z10) {
        this.f6731i.setValue(Boolean.valueOf(z10));
    }

    public final void b0(boolean z10) {
        if (this.f6725c.getValue().booleanValue() != z10) {
            this.f6725c.setValue(Boolean.valueOf(z10));
            n0();
        }
    }

    public final void c0(C17642l<? super C4538p, C16807N> lVar) {
        this.f6726d = new r(this, lVar);
    }

    public final void d0(C4538p pVar) {
        this.f6724b.setValue(pVar);
        if (pVar != null) {
            k0();
        }
    }

    public final void e0(boolean z10) {
        this.f6741s = z10;
        n0();
    }

    public final void g0(m1 m1Var) {
        this.f6729g = m1Var;
    }

    public final boolean h0() {
        if (!J()) {
            return false;
        }
        List<C4536n> n10 = this.f6723a.n();
        int size = n10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (n10.get(i10).a().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l0(long j10, long j11, boolean z10, C4543v vVar) {
        X(z10 ? C4369m.SelectionStart : C4369m.SelectionEnd);
        U(C5667g.d(j10));
        C E10 = E(j10, j11, z10);
        if (!E10.d(this.f6740r)) {
            return false;
        }
        C4538p a10 = vVar.a(E10);
        if (!C17542s.e(a10, D())) {
            R(E10, a10);
        }
        this.f6740r = E10;
        return true;
    }

    public final boolean m0(C5667g gVar, long j10, boolean z10, C4543v vVar) {
        if (gVar == null) {
            return false;
        }
        return l0(gVar.v(), j10, z10, vVar);
    }

    public final void o() {
        C5094d0 d0Var;
        C4669d C10 = C();
        if (C10 != null) {
            if (C10.length() <= 0) {
                C10 = null;
            }
            if (C10 != null && (d0Var = this.f6728f) != null) {
                d0Var.b(C10);
            }
        }
    }

    public final C4536n q(C4538p.a aVar) {
        return this.f6723a.m().c(aVar.e());
    }

    public final C4488v r() {
        return this.f6733k;
    }

    public final C5667g t() {
        return (C5667g) this.f6739q.getValue();
    }

    public final long u() {
        return ((C5667g) this.f6734l.getValue()).v();
    }

    public final long v() {
        return ((C5667g) this.f6735m.getValue()).v();
    }

    public final C4369m w() {
        return (C4369m) this.f6738p.getValue();
    }

    public final C5667g x() {
        return (C5667g) this.f6737o.getValue();
    }

    public final androidx.compose.ui.focus.m y() {
        return this.f6730h;
    }

    public final boolean z() {
        return ((Boolean) this.f6731i.getValue()).booleanValue();
    }
}
