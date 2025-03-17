package E1;

import E1.a0;
import E1.l0;
import E1.n0;
import G1.A0;
import G1.B0;
import G1.C0;
import G1.C4494a0;
import G1.G;
import G1.K;
import G1.L;
import G1.Q;
import U0.C4885k;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.V0;
import U0.o1;
import U0.r;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.K1;
import c2.C5267b;
import c2.t;
import g1.C5342k;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003K9TB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001c\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010&J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u00102J-\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010&J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010&J+\u0010:\u001a\b\u0012\u0004\u0012\u000204032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b:\u00106J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001e¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010&J'\u0010E\u001a\u00020D2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0?¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u00020G2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\f¢\u0006\u0004\bJ\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010R\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010PR\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010PR0\u0010a\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100^j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010`_8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010`R4\u0010c\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020^j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`_8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010g\u001a\u00060dR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u00060hR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR4\u0010m\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020^j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`_8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010`R\u0014\u0010q\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\"\u0010t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020G0r8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010sR\u001c\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010PR\u0016\u0010|\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010PR\u0015\u0010\u0001\u001a\u00020}8\u0002XD¢\u0006\u0006\n\u0004\b~\u0010¨\u0006\u0001"}, d2 = {"LE1/D;", "LU0/k;", "LG1/G;", "root", "LE1/n0;", "slotReusePolicy", "<init>", "(LG1/G;LE1/n0;)V", "node", "", "slotId", "Lkotlin/Function0;", "LXH/N;", "content", "M", "(LG1/G;Ljava/lang/Object;LnI/p;)V", "LE1/D$a;", "nodeState", "L", "(LG1/G;LE1/D$a;)V", "LU0/V0;", "existing", "container", "", "reuseContent", "LU0/r;", "parent", "composable", "N", "(LU0/V0;LG1/G;ZLU0/r;LnI/p;)LU0/V0;", "", "index", "A", "(I)Ljava/lang/Object;", "deactivate", "C", "(Z)V", "w", "()V", "H", "(LG1/G;)V", "O", "(Ljava/lang/Object;)LG1/G;", "y", "v", "(I)LG1/G;", "from", "to", "count", "D", "(III)V", "", "LE1/H;", "F", "(Ljava/lang/Object;LnI/p;)Ljava/util/List;", "l", "f", "b", "K", "startIndex", "x", "(I)V", "B", "Lkotlin/Function2;", "LE1/m0;", "Lc2/b;", "LE1/J;", "block", "LE1/I;", "u", "(LnI/p;)LE1/I;", "LE1/l0$a;", "G", "(Ljava/lang/Object;LnI/p;)LE1/l0$a;", "z", "a", "LG1/G;", "LU0/r;", "getCompositionContext", "()LU0/r;", "I", "(LU0/r;)V", "compositionContext", "value", "c", "LE1/n0;", "getSlotReusePolicy", "()LE1/n0;", "J", "(LE1/n0;)V", "d", "currentIndex", "e", "currentPostLookaheadIndex", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeToNodeState", "g", "slotIdToNode", "LE1/D$c;", "h", "LE1/D$c;", "scope", "LE1/D$b;", "i", "LE1/D$b;", "postLookaheadMeasureScope", "j", "precomposeMap", "LE1/n0$a;", "k", "LE1/n0$a;", "reusableSlotIdsSet", "", "Ljava/util/Map;", "postLookaheadPrecomposeSlotHandleMap", "LW0/b;", "m", "LW0/b;", "postLookaheadComposedSlotIds", "n", "reusableCount", "o", "precomposedCount", "", "p", "Ljava/lang/String;", "NoIntrinsicsMessage", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D implements C4885k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f5790a;

    /* renamed from: b  reason: collision with root package name */
    private r f5791b;

    /* renamed from: c  reason: collision with root package name */
    private n0 f5792c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f5793d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f5794e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<G, a> f5795f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<Object, G> f5796g = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final c f5797h = new c();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f5798i = new b();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<Object, G> f5799j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final n0.a f5800k = new n0.a((Set) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private final Map<Object, l0.a> f5801l = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final W0.b<Object> f5802m = new W0.b<>(new Object[16], 0);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f5803n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f5804o;

    /* renamed from: p  reason: collision with root package name */
    private final String f5805p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jb\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u0005*\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u0016*\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u0016*\u00020\u0005H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$*\u00020#H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001e*\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010 J\u0017\u0010(\u001a\u00020\u001e*\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00020#*\u00020$H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u0019*\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001a\u0010,\u001a\u00020\u0019*\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010+J\u001a\u0010-\u001a\u00020\u0019*\u00020\u0005H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J-\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u00100\u001a\u0004\u0018\u00010/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r01H\u0016¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010?\u001a\u00020<8VX\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"LE1/D$b;", "LE1/m0;", "LE1/K;", "<init>", "(LE1/D;)V", "", "width", "height", "", "LE1/a;", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "LXH/N;", "rulers", "LE1/a0$a;", "placementBlock", "LE1/J;", "F0", "(IILjava/util/Map;LnI/l;LnI/l;)LE1/J;", "I0", "(IILjava/util/Map;LnI/l;)LE1/J;", "Lc2/h;", "K0", "(F)I", "Lc2/v;", "K1", "(J)I", "q", "(J)F", "", "x1", "(F)F", "H", "(I)F", "Lo1/m;", "Lc2/k;", "X", "(J)J", "H1", "O0", "O", "W", "(F)J", "t", "l0", "(I)J", "", "slotId", "Lkotlin/Function0;", "content", "", "LE1/H;", "S0", "(Ljava/lang/Object;LnI/p;)Ljava/util/List;", "getDensity", "()F", "density", "D1", "fontScale", "", "A0", "()Z", "isLookingAhead", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b implements m0, K {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ c f5812a;

        public b() {
            this.f5812a = D.this.f5797h;
        }

        public boolean A0() {
            return this.f5812a.A0();
        }

        public float D1() {
            return this.f5812a.D1();
        }

        public J F0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2) {
            return this.f5812a.F0(i10, i11, map, lVar, lVar2);
        }

        public float H(int i10) {
            return this.f5812a.H(i10);
        }

        public float H1(float f10) {
            return this.f5812a.H1(f10);
        }

        public J I0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super a0.a, C16807N> lVar) {
            return this.f5812a.I0(i10, i11, map, lVar);
        }

        public int K0(float f10) {
            return this.f5812a.K0(f10);
        }

        public int K1(long j10) {
            return this.f5812a.K1(j10);
        }

        public long O(long j10) {
            return this.f5812a.O(j10);
        }

        public float O0(long j10) {
            return this.f5812a.O0(j10);
        }

        public List<H> S0(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
            G g10 = (G) D.this.f5796g.get(obj);
            List<H> J10 = g10 != null ? g10.J() : null;
            return J10 != null ? J10 : D.this.F(obj, pVar);
        }

        public long W(float f10) {
            return this.f5812a.W(f10);
        }

        public long X(long j10) {
            return this.f5812a.X(j10);
        }

        public float getDensity() {
            return this.f5812a.getDensity();
        }

        public t getLayoutDirection() {
            return this.f5812a.getLayoutDirection();
        }

        public long l0(int i10) {
            return this.f5812a.l0(i10);
        }

        public float q(long j10) {
            return this.f5812a.q(j10);
        }

        public long t(float f10) {
            return this.f5812a.t(f10);
        }

        public float x1(float f10) {
            return this.f5812a.x1(f10);
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b(\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u0014\u00101\u001a\u00020.8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LE1/D$c;", "LE1/m0;", "<init>", "(LE1/D;)V", "", "slotId", "Lkotlin/Function0;", "LXH/N;", "content", "", "LE1/H;", "S0", "(Ljava/lang/Object;LnI/p;)Ljava/util/List;", "", "width", "height", "", "LE1/a;", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "rulers", "LE1/a0$a;", "placementBlock", "LE1/J;", "F0", "(IILjava/util/Map;LnI/l;LnI/l;)LE1/J;", "Lc2/t;", "a", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "p", "(Lc2/t;)V", "layoutDirection", "", "b", "F", "getDensity", "()F", "c", "(F)V", "density", "D1", "h", "fontScale", "", "A0", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c implements m0 {

        /* renamed from: a  reason: collision with root package name */
        private t f5814a = t.Rtl;

        /* renamed from: b  reason: collision with root package name */
        private float f5815b;

        /* renamed from: c  reason: collision with root package name */
        private float f5816c;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"E1/D$c$a", "LE1/J;", "LXH/N;", "x", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "LE1/a;", "w", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "y", "()LnI/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements J {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f5818a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f5819b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Map<C4468a, Integer> f5820c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<g0, C16807N> f5821d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f5822e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ D f5823f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17642l<a0.a, C16807N> f5824g;

            a(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, c cVar, D d10, C17642l<? super a0.a, C16807N> lVar2) {
                this.f5818a = i10;
                this.f5819b = i11;
                this.f5820c = map;
                this.f5821d = lVar;
                this.f5822e = cVar;
                this.f5823f = d10;
                this.f5824g = lVar2;
            }

            public int getHeight() {
                return this.f5819b;
            }

            public int getWidth() {
                return this.f5818a;
            }

            public Map<C4468a, Integer> w() {
                return this.f5820c;
            }

            public void x() {
                Q E22;
                if (!this.f5822e.A0() || (E22 = this.f5823f.f5790a.S().E2()) == null) {
                    this.f5824g.invoke(this.f5823f.f5790a.S().u1());
                } else {
                    this.f5824g.invoke(E22.u1());
                }
            }

            public C17642l<g0, C16807N> y() {
                return this.f5821d;
            }
        }

        public c() {
        }

        public boolean A0() {
            return D.this.f5790a.Z() == G.e.LookaheadLayingOut || D.this.f5790a.Z() == G.e.LookaheadMeasuring;
        }

        public float D1() {
            return this.f5816c;
        }

        public J F0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2) {
            if (!((i10 & -16777216) == 0 && (-16777216 & i11) == 0)) {
                D1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i10, i11, map, lVar, this, D.this, lVar2);
        }

        public List<H> S0(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
            return D.this.K(obj, pVar);
        }

        public void c(float f10) {
            this.f5815b = f10;
        }

        public float getDensity() {
            return this.f5815b;
        }

        public t getLayoutDirection() {
            return this.f5814a;
        }

        public void h(float f10) {
            this.f5816c = f10;
        }

        public void p(t tVar) {
            this.f5814a = tVar;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"E1/D$d", "LG1/G$f;", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends G.f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ D f5825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<m0, C5267b, J> f5826c;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8VX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"E1/D$d$a", "LE1/J;", "LXH/N;", "x", "()V", "", "LE1/a;", "", "w", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "LE1/g0;", "y", "()LnI/l;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements J {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ J f5827a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ D f5828b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f5829c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ J f5830d;

            public a(J j10, D d10, int i10, J j11) {
                this.f5828b = d10;
                this.f5829c = i10;
                this.f5830d = j11;
                this.f5827a = j10;
            }

            public int getHeight() {
                return this.f5827a.getHeight();
            }

            public int getWidth() {
                return this.f5827a.getWidth();
            }

            public Map<C4468a, Integer> w() {
                return this.f5827a.w();
            }

            public void x() {
                this.f5828b.f5794e = this.f5829c;
                this.f5830d.x();
                this.f5828b.y();
            }

            public C17642l<g0, C16807N> y() {
                return this.f5827a.y();
            }
        }

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8VX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"E1/D$d$b", "LE1/J;", "LXH/N;", "x", "()V", "", "LE1/a;", "", "w", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "LE1/g0;", "y", "()LnI/l;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements J {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ J f5831a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ D f5832b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f5833c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ J f5834d;

            public b(J j10, D d10, int i10, J j11) {
                this.f5832b = d10;
                this.f5833c = i10;
                this.f5834d = j11;
                this.f5831a = j10;
            }

            public int getHeight() {
                return this.f5831a.getHeight();
            }

            public int getWidth() {
                return this.f5831a.getWidth();
            }

            public Map<C4468a, Integer> w() {
                return this.f5831a.w();
            }

            public void x() {
                this.f5832b.f5793d = this.f5833c;
                this.f5834d.x();
                D d10 = this.f5832b;
                d10.x(d10.f5793d);
            }

            public C17642l<g0, C16807N> y() {
                return this.f5831a.y();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(D d10, p<? super m0, ? super C5267b, ? extends J> pVar, String str) {
            super(str);
            this.f5825b = d10;
            this.f5826c = pVar;
        }

        public J i(K k10, List<? extends H> list, long j10) {
            this.f5825b.f5797h.p(k10.getLayoutDirection());
            this.f5825b.f5797h.c(k10.getDensity());
            this.f5825b.f5797h.h(k10.D1());
            if (k10.A0() || this.f5825b.f5790a.d0() == null) {
                this.f5825b.f5793d = 0;
                J invoke = this.f5826c.invoke(this.f5825b.f5797h, C5267b.a(j10));
                return new b(invoke, this.f5825b, this.f5825b.f5793d, invoke);
            }
            this.f5825b.f5794e = 0;
            J invoke2 = this.f5826c.invoke(this.f5825b.f5798i, C5267b.a(j10));
            return new a(invoke2, this.f5825b, this.f5825b.f5794e, invoke2);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "LE1/l0$a;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Map.Entry<Object, l0.a>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ D f5835c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(D d10) {
            super(1);
            this.f5835c = d10;
        }

        /* renamed from: a */
        public final Boolean invoke(Map.Entry<Object, l0.a> entry) {
            boolean z10;
            Object key = entry.getKey();
            l0.a value = entry.getValue();
            int s10 = this.f5835c.f5802m.s(key);
            if (s10 < 0 || s10 >= this.f5835c.f5794e) {
                value.b();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"E1/D$f", "LE1/l0$a;", "LXH/N;", "b", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements l0.a {
        f() {
        }

        public void b() {
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"E1/D$g", "LE1/l0$a;", "LXH/N;", "b", "()V", "", "index", "Lc2/b;", "constraints", "f", "(IJ)V", "", "key", "Lkotlin/Function1;", "LG1/B0;", "LG1/A0;", "block", "e", "(Ljava/lang/Object;LnI/l;)V", "d", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements l0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ D f5836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f5837b;

        g(D d10, Object obj) {
            this.f5836a = d10;
            this.f5837b = obj;
        }

        public void b() {
            this.f5836a.B();
            G g10 = (G) this.f5836a.f5799j.remove(this.f5837b);
            if (g10 == null) {
                return;
            }
            if (this.f5836a.f5804o > 0) {
                int indexOf = this.f5836a.f5790a.P().indexOf(g10);
                if (indexOf >= this.f5836a.f5790a.P().size() - this.f5836a.f5804o) {
                    D d10 = this.f5836a;
                    d10.f5803n = d10.f5803n + 1;
                    D d11 = this.f5836a;
                    d11.f5804o = d11.f5804o - 1;
                    int size = (this.f5836a.f5790a.P().size() - this.f5836a.f5804o) - this.f5836a.f5803n;
                    this.f5836a.D(indexOf, size, 1);
                    this.f5836a.x(size);
                    return;
                }
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            throw new IllegalStateException("No pre-composed items to dispose");
        }

        public int d() {
            List<G> K10;
            G g10 = (G) this.f5836a.f5799j.get(this.f5837b);
            if (g10 == null || (K10 = g10.K()) == null) {
                return 0;
            }
            return K10.size();
        }

        public void e(Object obj, C17642l<? super B0, ? extends A0> lVar) {
            C4494a0 m02;
            d.c k10;
            G g10 = (G) this.f5836a.f5799j.get(this.f5837b);
            if (g10 != null && (m02 = g10.m0()) != null && (k10 = m02.k()) != null) {
                C0.e(k10, obj, lVar);
            }
        }

        public void f(int i10, long j10) {
            G g10 = (G) this.f5836a.f5799j.get(this.f5837b);
            if (g10 != null && g10.c()) {
                int size = g10.K().size();
                if (i10 < 0 || i10 >= size) {
                    throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
                } else if (!g10.p()) {
                    G k10 = this.f5836a.f5790a;
                    k10.f6243n = true;
                    K.b(g10).D(g10.K().get(i10), j10);
                    k10.f6243n = false;
                } else {
                    throw new IllegalArgumentException("Pre-measure called on node that is not placed");
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f5838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f5839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f5838c = aVar;
            this.f5839d = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
                }
                boolean a10 = this.f5838c.a();
                p<C4889m, Integer, C16807N> pVar = this.f5839d;
                mVar.J(207, Boolean.valueOf(a10));
                boolean b10 = mVar.b(a10);
                mVar.W(-869707859);
                if (a10) {
                    pVar.invoke(mVar, 0);
                } else {
                    mVar.j(b10);
                }
                mVar.P();
                mVar.B();
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

    public D(G g10, n0 n0Var) {
        this.f5790a = g10;
        this.f5792c = n0Var;
    }

    private final Object A(int i10) {
        a aVar = this.f5795f.get(this.f5790a.P().get(i10));
        C17542s.g(aVar);
        return aVar.f();
    }

    private final void C(boolean z10) {
        this.f5804o = 0;
        this.f5799j.clear();
        int size = this.f5790a.P().size();
        if (this.f5803n != size) {
            this.f5803n = size;
            C5342k.a aVar = C5342k.f23395e;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f10 = aVar.f(d10);
            int i10 = 0;
            while (i10 < size) {
                try {
                    G g10 = this.f5790a.P().get(i10);
                    a aVar2 = this.f5795f.get(g10);
                    if (aVar2 != null && aVar2.a()) {
                        H(g10);
                        if (z10) {
                            V0 b10 = aVar2.b();
                            if (b10 != null) {
                                b10.deactivate();
                            }
                            aVar2.h(u1.e(Boolean.FALSE, (o1) null, 2, (Object) null));
                        } else {
                            aVar2.g(false);
                        }
                        aVar2.m(k0.f5924a);
                    }
                    i10++;
                } catch (Throwable th2) {
                    aVar.n(d10, f10, h10);
                    throw th2;
                }
            }
            C16807N n10 = C16807N.f139792a;
            aVar.n(d10, f10, h10);
            this.f5796g.clear();
        }
        B();
    }

    /* access modifiers changed from: private */
    public final void D(int i10, int i11, int i12) {
        G g10 = this.f5790a;
        g10.f6243n = true;
        this.f5790a.e1(i10, i11, i12);
        g10.f6243n = false;
    }

    static /* synthetic */ void E(D d10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        d10.D(i10, i11, i12);
    }

    /* access modifiers changed from: private */
    public final List<H> F(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (this.f5802m.r() >= this.f5794e) {
            int r10 = this.f5802m.r();
            int i10 = this.f5794e;
            if (r10 == i10) {
                this.f5802m.b(obj);
            } else {
                this.f5802m.E(i10, obj);
            }
            this.f5794e++;
            if (!this.f5799j.containsKey(obj)) {
                this.f5801l.put(obj, G(obj, pVar));
                if (this.f5790a.Z() == G.e.LayingOut) {
                    this.f5790a.q1(true);
                } else {
                    G.t1(this.f5790a, true, false, false, 6, (Object) null);
                }
            }
            G g10 = this.f5799j.get(obj);
            if (g10 == null) {
                return C16877v.n();
            }
            List<L.b> r12 = g10.f0().r1();
            int size = r12.size();
            for (int i11 = 0; i11 < size; i11++) {
                r12.get(i11).S1();
            }
            return r12;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    private final void H(G g10) {
        L.b f02 = g10.f0();
        G.g gVar = G.g.NotUsed;
        f02.h2(gVar);
        L.a c02 = g10.c0();
        if (c02 != null) {
            c02.a2(gVar);
        }
    }

    private final void L(G g10, a aVar) {
        C5342k.a aVar2 = C5342k.f23395e;
        C5342k d10 = aVar2.d();
        C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
        C5342k f10 = aVar2.f(d10);
        try {
            G g11 = this.f5790a;
            g11.f6243n = true;
            p<C4889m, Integer, C16807N> c10 = aVar.c();
            V0 b10 = aVar.b();
            r rVar = this.f5791b;
            if (rVar != null) {
                aVar.i(N(b10, g10, aVar.e(), rVar, c1.c.c(-1750409193, true, new h(aVar, c10))));
                aVar.l(false);
                g11.f6243n = false;
                C16807N n10 = C16807N.f139792a;
                return;
            }
            throw new IllegalStateException("parent composition reference not set");
        } finally {
            aVar2.n(d10, f10, h10);
        }
    }

    private final void M(G g10, Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
        HashMap<G, a> hashMap = this.f5795f;
        a aVar = hashMap.get(g10);
        if (aVar == null) {
            aVar = new a(obj, C4477j.f5910a.a(), (V0) null, 4, (DefaultConstructorMarker) null);
            hashMap.put(g10, aVar);
        }
        a aVar2 = aVar;
        V0 b10 = aVar2.b();
        boolean s10 = b10 != null ? b10.s() : true;
        if (aVar2.c() != pVar || s10 || aVar2.d()) {
            aVar2.j(pVar);
            L(g10, aVar2);
            aVar2.k(false);
        }
    }

    private final V0 N(V0 v02, G g10, boolean z10, r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (v02 == null || v02.f()) {
            v02 = K1.a(g10, rVar);
        }
        if (!z10) {
            v02.m(pVar);
        } else {
            v02.x(pVar);
        }
        return v02;
    }

    private final G O(Object obj) {
        int i10;
        if (this.f5803n == 0) {
            return null;
        }
        int size = this.f5790a.P().size() - this.f5804o;
        int i11 = size - this.f5803n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            } else if (C17542s.e(A(i13), obj)) {
                i10 = i13;
                break;
            } else {
                i13--;
            }
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                a aVar = this.f5795f.get(this.f5790a.P().get(i12));
                C17542s.g(aVar);
                a aVar2 = aVar;
                if (aVar2.f() == k0.f5924a || this.f5792c.b(obj, aVar2.f())) {
                    aVar2.m(obj);
                    i13 = i12;
                    i10 = i13;
                } else {
                    i12--;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.f5803n--;
        G g10 = this.f5790a.P().get(i11);
        a aVar3 = this.f5795f.get(g10);
        C17542s.g(aVar3);
        a aVar4 = aVar3;
        aVar4.h(u1.e(Boolean.TRUE, (o1) null, 2, (Object) null));
        aVar4.l(true);
        aVar4.k(true);
        return g10;
    }

    private final G v(int i10) {
        G g10 = new G(true, 0, 2, (DefaultConstructorMarker) null);
        G g11 = this.f5790a;
        g11.f6243n = true;
        this.f5790a.C0(i10, g10);
        g11.f6243n = false;
        return g10;
    }

    private final void w() {
        G g10 = this.f5790a;
        g10.f6243n = true;
        for (a b10 : this.f5795f.values()) {
            V0 b11 = b10.b();
            if (b11 != null) {
                b11.b();
            }
        }
        this.f5790a.n1();
        g10.f6243n = false;
        this.f5795f.clear();
        this.f5796g.clear();
        this.f5804o = 0;
        this.f5803n = 0;
        this.f5799j.clear();
        B();
    }

    /* access modifiers changed from: private */
    public final void y() {
        C16877v.J(this.f5801l.entrySet(), new e(this));
    }

    public final void B() {
        int size = this.f5790a.P().size();
        if (this.f5795f.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f5795f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        } else if ((size - this.f5803n) - this.f5804o < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f5803n + ". Precomposed children " + this.f5804o).toString());
        } else if (this.f5799j.size() != this.f5804o) {
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f5804o + ". Map size " + this.f5799j.size()).toString());
        }
    }

    public final l0.a G(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (!this.f5790a.c()) {
            return new f();
        }
        B();
        if (!this.f5796g.containsKey(obj)) {
            this.f5801l.remove(obj);
            HashMap<Object, G> hashMap = this.f5799j;
            G g10 = hashMap.get(obj);
            if (g10 == null) {
                g10 = O(obj);
                if (g10 != null) {
                    D(this.f5790a.P().indexOf(g10), this.f5790a.P().size(), 1);
                    this.f5804o++;
                } else {
                    g10 = v(this.f5790a.P().size());
                    this.f5804o++;
                }
                hashMap.put(obj, g10);
            }
            M(g10, obj, pVar);
        }
        return new g(this, obj);
    }

    public final void I(r rVar) {
        this.f5791b = rVar;
    }

    public final void J(n0 n0Var) {
        if (this.f5792c != n0Var) {
            this.f5792c = n0Var;
            C(false);
            G.x1(this.f5790a, false, false, false, 7, (Object) null);
        }
    }

    public final List<H> K(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar) {
        B();
        G.e Z10 = this.f5790a.Z();
        G.e eVar = G.e.Measuring;
        boolean z10 = false;
        if (!(Z10 == eVar || Z10 == G.e.LayingOut || Z10 == G.e.LookaheadMeasuring || Z10 == G.e.LookaheadLayingOut)) {
            D1.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap<Object, G> hashMap = this.f5796g;
        G g10 = hashMap.get(obj);
        if (g10 == null) {
            g10 = this.f5799j.remove(obj);
            if (g10 != null) {
                if (this.f5804o > 0) {
                    z10 = true;
                }
                if (!z10) {
                    D1.a.b("Check failed.");
                }
                this.f5804o--;
            } else {
                G O10 = O(obj);
                if (O10 == null) {
                    O10 = v(this.f5793d);
                }
                g10 = O10;
            }
            hashMap.put(obj, g10);
        }
        G g11 = g10;
        if (C16877v.z0(this.f5790a.P(), this.f5793d) != g11) {
            int indexOf = this.f5790a.P().indexOf(g11);
            int i10 = this.f5793d;
            if (indexOf < i10) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            } else if (i10 != indexOf) {
                E(this, indexOf, i10, 0, 4, (Object) null);
            }
        }
        this.f5793d++;
        M(g11, obj, pVar);
        return (Z10 == eVar || Z10 == G.e.LayingOut) ? g11.J() : g11.I();
    }

    public void b() {
        w();
    }

    public void f() {
        C(true);
    }

    public void l() {
        C(false);
    }

    public final I u(p<? super m0, ? super C5267b, ? extends J> pVar) {
        return new d(this, pVar, this.f5805p);
    }

    public final void x(int i10) {
        boolean z10 = false;
        this.f5803n = 0;
        int size = (this.f5790a.P().size() - this.f5804o) - 1;
        if (i10 <= size) {
            this.f5800k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f5800k.add(A(i11));
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.f5792c.a(this.f5800k);
            C5342k.a aVar = C5342k.f23395e;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f10 = aVar.f(d10);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    G g10 = this.f5790a.P().get(size);
                    a aVar2 = this.f5795f.get(g10);
                    C17542s.g(aVar2);
                    a aVar3 = aVar2;
                    Object f11 = aVar3.f();
                    if (this.f5800k.contains(f11)) {
                        this.f5803n++;
                        if (aVar3.a()) {
                            H(g10);
                            aVar3.g(false);
                            z11 = true;
                        }
                    } else {
                        G g11 = this.f5790a;
                        g11.f6243n = true;
                        this.f5795f.remove(g10);
                        V0 b10 = aVar3.b();
                        if (b10 != null) {
                            b10.b();
                        }
                        this.f5790a.o1(size, 1);
                        g11.f6243n = false;
                    }
                    this.f5796g.remove(f11);
                    size--;
                } catch (Throwable th2) {
                    aVar.n(d10, f10, h10);
                    throw th2;
                }
            }
            C16807N n10 = C16807N.f139792a;
            aVar.n(d10, f10, h10);
            z10 = z11;
        }
        if (z10) {
            C5342k.f23395e.o();
        }
        B();
    }

    public final void z() {
        if (this.f5803n != this.f5790a.P().size()) {
            for (Map.Entry<G, a> value : this.f5795f.entrySet()) {
                ((a) value.getValue()).k(true);
            }
            if (!this.f5790a.g0()) {
                G.x1(this.f5790a, false, false, false, 7, (Object) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u001d\"\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"LE1/D$a;", "", "slotId", "Lkotlin/Function0;", "LXH/N;", "content", "LU0/V0;", "composition", "<init>", "(Ljava/lang/Object;LnI/p;LU0/V0;)V", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "b", "LnI/p;", "c", "()LnI/p;", "j", "(LnI/p;)V", "LU0/V0;", "()LU0/V0;", "i", "(LU0/V0;)V", "", "d", "Z", "()Z", "k", "(Z)V", "forceRecompose", "e", "l", "forceReuse", "LU0/r0;", "LU0/r0;", "getActiveState", "()LU0/r0;", "h", "(LU0/r0;)V", "activeState", "value", "g", "active", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Object f5806a;

        /* renamed from: b  reason: collision with root package name */
        private p<? super C4889m, ? super Integer, C16807N> f5807b;

        /* renamed from: c  reason: collision with root package name */
        private V0 f5808c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5809d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5810e;

        /* renamed from: f  reason: collision with root package name */
        private C4899r0<Boolean> f5811f;

        public a(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar, V0 v02) {
            this.f5806a = obj;
            this.f5807b = pVar;
            this.f5808c = v02;
            this.f5811f = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
        }

        public final boolean a() {
            return this.f5811f.getValue().booleanValue();
        }

        public final V0 b() {
            return this.f5808c;
        }

        public final p<C4889m, Integer, C16807N> c() {
            return this.f5807b;
        }

        public final boolean d() {
            return this.f5809d;
        }

        public final boolean e() {
            return this.f5810e;
        }

        public final Object f() {
            return this.f5806a;
        }

        public final void g(boolean z10) {
            this.f5811f.setValue(Boolean.valueOf(z10));
        }

        public final void h(C4899r0<Boolean> r0Var) {
            this.f5811f = r0Var;
        }

        public final void i(V0 v02) {
            this.f5808c = v02;
        }

        public final void j(p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f5807b = pVar;
        }

        public final void k(boolean z10) {
            this.f5809d = z10;
        }

        public final void l(boolean z10) {
            this.f5810e = z10;
        }

        public final void m(Object obj) {
            this.f5806a = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, p pVar, V0 v02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, pVar, (i10 & 4) != 0 ? null : v02);
        }
    }
}
