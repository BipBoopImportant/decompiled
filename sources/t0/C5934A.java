package t0;

import E1.c0;
import E1.d0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import f1.C5299a;
import f1.C5309k;
import g1.C5342k;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C5548j;
import m0.C5550k;
import m0.C5552l;
import m0.C5554m;
import m0.C5559o0;
import m0.C5562q;
import m0.t0;
import m0.z0;
import n0.C5589L;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.C5682E;
import r0.m;
import tI.C17974j;
import v0.C6131E;
import v0.C6136b;
import v0.C6141g;
import v0.C6144j;
import v0.K;
import v0.L;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0001@B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H@¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010$0!H@¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010)J$\u0010,\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H@¢\u0006\u0004\b,\u0010\u001aJ)\u00101\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010?\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8\u0000@BX\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010D\u001a\u0004\u0018\u00010-2\b\u0010:\u001a\u0004\u0018\u00010-8\u0000@BX\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010JR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020-0L8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010Y\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0000@BX\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010`\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u000e¢\u0006\f\n\u0004\b]\u0010\u000f\u001a\u0004\b^\u0010_R\"\u0010e\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\ba\u0010<\u001a\u0004\bb\u0010>\"\u0004\bc\u0010dR(\u0010j\u001a\u0004\u0018\u00010f2\b\u0010:\u001a\u0004\u0018\u00010f8\u0000@BX\u000e¢\u0006\f\n\u0004\b,\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010o\u001a\u00020k8\u0000X\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bV\u0010nR\u001a\u0010t\u001a\u00020p8\u0000X\u0004¢\u0006\f\n\u0004\b1\u0010q\u001a\u0004\br\u0010sR \u0010{\u001a\b\u0012\u0004\u0012\u00020v0u8\u0000X\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001b\u0010\u0001\u001a\u00020|8\u0000X\u0004¢\u0006\f\n\u0004\br\u0010}\u001a\u0004\b~\u0010R\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b~\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0001\u0010M\u001a\u0006\b\u0001\u0010\u0001R-\u0010\u0001\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8V@RX\u0002¢\u0006\u0013\n\u0004\b=\u0010M\u001a\u0004\bF\u0010>\"\u0005\b\u0001\u0010dR-\u0010\u0001\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8V@RX\u0002¢\u0006\u0013\n\u0004\bR\u0010M\u001a\u0004\b@\u0010>\"\u0005\b\u0001\u0010dR$\u0010\u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\by\u0010M\u001a\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0001\u0010_R\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0001\u0010_R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0001\u0010 \u0001R\u0016\u0010\u0012\u001a\u00020\u00118@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030¢\u00018@X\u0002¢\u0006\u0010\u001a\u0006\b£\u0001\u0010¤\u0001*\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010¨\u0001\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010>R\u0016\u0010ª\u0001\u001a\u00020\n8@X\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010X\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006«\u0001"}, d2 = {"Lt0/A;", "Lp0/D;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lt0/v;", "prefetchStrategy", "<init>", "(IILt0/v;)V", "(II)V", "", "delta", "Lt0/p;", "layoutInfo", "LXH/N;", "I", "(FLt0/p;)V", "Lc2/d;", "density", "LQJ/Q;", "coroutineScope", "P", "(FLc2/d;LQJ/Q;)V", "index", "scrollOffset", "K", "(IILdI/e;)Ljava/lang/Object;", "", "forceRemeasure", "O", "(IIZ)V", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "e", "(F)F", "distance", "J", "l", "Lt0/r;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "n", "(Lt0/r;ZZ)V", "Lt0/l;", "itemProvider", "firstItemIndex", "Q", "(Lt0/l;I)I", "a", "Lt0/v;", "<set-?>", "b", "Z", "u", "()Z", "hasLookaheadPassOccurred", "c", "Lt0/r;", "C", "()Lt0/r;", "postLookaheadLayoutInfo", "Lt0/y;", "d", "Lt0/y;", "scrollPosition", "Lt0/e;", "Lt0/e;", "animateScrollScope", "LU0/r0;", "LU0/r0;", "layoutInfoState", "Lr0/m;", "g", "Lr0/m;", "v", "()Lr0/m;", "internalInteractionSource", "h", "F", "H", "()F", "scrollToBeConsumed", "i", "Lp0/D;", "scrollableState", "j", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "k", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "LE1/c0;", "LE1/c0;", "E", "()LE1/c0;", "remeasurement", "LE1/d0;", "m", "LE1/d0;", "()LE1/d0;", "remeasurementModifier", "Lv0/b;", "Lv0/b;", "p", "()Lv0/b;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lt0/s;", "o", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "w", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Lv0/j;", "Lv0/j;", "q", "()Lv0/j;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "D", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lt0/u;", "r", "Lt0/u;", "prefetchScope", "Lv0/E;", "s", "Lv0/E;", "A", "()Lv0/E;", "pinnedItems", "Lv0/L;", "t", "y", "()LU0/r0;", "measurementScopeInvalidator", "N", "canScrollForward", "M", "canScrollBackward", "B", "placementScopeInvalidator", "Lm0/k;", "Lm0/m;", "x", "Lm0/k;", "_scrollDeltaBetweenPasses", "()Lt0/p;", "()Lc2/d;", "LtI/j;", "z", "()LtI/j;", "getNearestRange$foundation_release$delegate", "(Lt0/A;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "G", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t0.A  reason: case insensitive filesystem */
public final class C5934A implements C5681D {

    /* renamed from: y  reason: collision with root package name */
    public static final c f29106y = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C5309k<C5934A, ?> f29107z = C5299a.a(a.f29132c, b.f29133c);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f29108a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29109b;

    /* renamed from: c  reason: collision with root package name */
    private r f29110c;

    /* renamed from: d  reason: collision with root package name */
    private final y f29111d;

    /* renamed from: e  reason: collision with root package name */
    private final e f29112e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4899r0<r> f29113f;

    /* renamed from: g  reason: collision with root package name */
    private final m f29114g;

    /* renamed from: h  reason: collision with root package name */
    private float f29115h;

    /* renamed from: i  reason: collision with root package name */
    private final C5681D f29116i;

    /* renamed from: j  reason: collision with root package name */
    private int f29117j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29118k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public c0 f29119l;

    /* renamed from: m  reason: collision with root package name */
    private final d0 f29120m;

    /* renamed from: n  reason: collision with root package name */
    private final C6136b f29121n;

    /* renamed from: o  reason: collision with root package name */
    private final LazyLayoutItemAnimator<s> f29122o;

    /* renamed from: p  reason: collision with root package name */
    private final C6144j f29123p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f29124q;

    /* renamed from: r  reason: collision with root package name */
    private final u f29125r;

    /* renamed from: s  reason: collision with root package name */
    private final C6131E f29126s;

    /* renamed from: t  reason: collision with root package name */
    private final C4899r0<C16807N> f29127t;

    /* renamed from: u  reason: collision with root package name */
    private final C4899r0 f29128u;

    /* renamed from: v  reason: collision with root package name */
    private final C4899r0 f29129v;

    /* renamed from: w  reason: collision with root package name */
    private final C4899r0<C16807N> f29130w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public C5550k<Float, C5554m> f29131x;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf1/m;", "Lt0/A;", "it", "", "", "a", "(Lf1/m;Lt0/A;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t0.A$a */
    static final class a extends C17544u implements p<f1.m, C5934A, List<? extends Integer>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f29132c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List<Integer> invoke(f1.m mVar, C5934A a10) {
            return C16877v.q(Integer.valueOf(a10.s()), Integer.valueOf(a10.t()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lt0/A;", "a", "(Ljava/util/List;)Lt0/A;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t0.A$b */
    static final class b extends C17544u implements C17642l<List<? extends Integer>, C5934A> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f29133c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C5934A invoke(List<Integer> list) {
            return new C5934A(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt0/A$c;", "", "<init>", "()V", "Lf1/k;", "Lt0/A;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t0.A$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<C5934A, ?> a() {
            return C5934A.f29107z;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"t0/A$d", "Lt0/u;", "", "index", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Landroidx/compose/foundation/lazy/layout/d$b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t0.A$d */
    public static final class d implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5934A f29134a;

        d(C5934A a10) {
            this.f29134a = a10;
        }

        /* JADX INFO: finally extract failed */
        public d.b a(int i10) {
            C5342k.a aVar = C5342k.f23395e;
            C5934A a10 = this.f29134a;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f10 = aVar.f(d10);
            try {
                long l10 = ((r) a10.f29113f.getValue()).l();
                aVar.n(d10, f10, h10);
                return this.f29134a.D().e(i10, l10);
            } catch (Throwable th2) {
                aVar.n(d10, f10, h10);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/K;", "LXH/N;", "a", "(Lv0/K;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t0.A$e */
    static final class e extends C17544u implements C17642l<K, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5934A f29135c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5934A a10, int i10) {
            super(1);
            this.f29135c = a10;
            this.f29136d = i10;
        }

        public final void a(K k10) {
            v h10 = this.f29135c.f29108a;
            int i10 = this.f29136d;
            C5342k.a aVar = C5342k.f23395e;
            C5342k d10 = aVar.d();
            aVar.n(d10, aVar.f(d10), d10 != null ? d10.h() : null);
            h10.a(k10, i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((K) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"t0/A$f", "LE1/d0;", "LE1/c0;", "remeasurement", "LXH/N;", "m", "(LE1/c0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t0.A$f */
    public static final class f implements d0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f29137d;

        f(C5934A a10) {
            this.f29137d = a10;
        }

        public void m(c0 c0Var) {
            this.f29137d.f29119l = c0Var;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {388, 389}, m = "scroll")
    /* renamed from: t0.A$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f29138c;

        /* renamed from: d  reason: collision with root package name */
        Object f29139d;

        /* renamed from: e  reason: collision with root package name */
        Object f29140e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f29141f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5934A f29142g;

        /* renamed from: h  reason: collision with root package name */
        int f29143h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5934A a10, C17164e<? super g> eVar) {
            super(eVar);
            this.f29142g = a10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29141f = obj;
            this.f29143h |= Integer.MIN_VALUE;
            return this.f29142g.f((C5589L) null, (p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: t0.A$h */
    static final class h extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f29144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f29145d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29146e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f29147f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C5934A a10, int i10, int i11, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f29145d = a10;
            this.f29146e = i10;
            this.f29147f = i11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f29145d, this.f29146e, this.f29147f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((h) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f29144c == 0) {
                y.b(obj);
                this.f29145d.O(this.f29146e, this.f29147f, true);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t0.A$i */
    static final class i extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5934A f29148c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C5934A a10) {
            super(1);
            this.f29148c = a10;
        }

        public final Float a(float f10) {
            return Float.valueOf(-this.f29148c.J(-f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", l = {578}, m = "invokeSuspend")
    /* renamed from: t0.A$j */
    static final class j extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f29149c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f29150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C5934A a10, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f29150d = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f29150d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f29149c;
            if (i10 == 0) {
                y.b(obj);
                C5550k j10 = this.f29150d.f29131x;
                Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                C5559o0 h10 = C5548j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.d(0.5f), 1, (Object) null);
                this.f29149c = 1;
                if (t0.j(j10, d10, h10, true, (C17642l) null, this, 8, (Object) null) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend")
    /* renamed from: t0.A$k */
    static final class k extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f29151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f29152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5934A a10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f29152d = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f29152d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f29151c;
            if (i10 == 0) {
                y.b(obj);
                C5550k j10 = this.f29152d.f29131x;
                Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                C5559o0 h10 = C5548j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.d(0.5f), 1, (Object) null);
                this.f29151c = 1;
                if (t0.j(j10, d10, h10, true, (C17642l) null, this, 8, (Object) null) == f10) {
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

    public C5934A() {
        this(0, 0, (v) null, 7, (DefaultConstructorMarker) null);
    }

    private final void I(float f10, p pVar) {
        if (this.f29118k) {
            this.f29108a.c(this.f29125r, f10, pVar);
        }
    }

    public static /* synthetic */ Object L(C5934A a10, int i10, int i11, C17164e eVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a10.K(i10, i11, eVar);
    }

    private void M(boolean z10) {
        this.f29129v.setValue(Boolean.valueOf(z10));
    }

    private void N(boolean z10) {
        this.f29128u.setValue(Boolean.valueOf(z10));
    }

    private final void P(float f10, c2.d dVar, Q q10) {
        float f11 = f10;
        if (f11 > dVar.H1(C5935B.f29153a)) {
            C5342k.a aVar = C5342k.f23395e;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f12 = aVar.f(d10);
            try {
                float floatValue = this.f29131x.getValue().floatValue();
                if (this.f29131x.t()) {
                    this.f29131x = C5552l.g(this.f29131x, floatValue - f11, 0.0f, 0, 0, false, 30, (Object) null);
                    F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new j(this, (C17164e<? super j>) null), 3, (Object) null);
                } else {
                    this.f29131x = new C5550k(B0.f(C17536l.f144385a), Float.valueOf(-f11), (C5562q) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
                    F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new k(this, (C17164e<? super k>) null), 3, (Object) null);
                }
            } finally {
                aVar.n(d10, f12, h10);
            }
        }
    }

    public static /* synthetic */ Object m(C5934A a10, int i10, int i11, C17164e eVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a10.l(i10, i11, eVar);
    }

    public static /* synthetic */ void o(C5934A a10, r rVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        a10.n(rVar, z10, z11);
    }

    public final C6131E A() {
        return this.f29126s;
    }

    public final C4899r0<C16807N> B() {
        return this.f29130w;
    }

    public final r C() {
        return this.f29110c;
    }

    public final androidx.compose.foundation.lazy.layout.d D() {
        return this.f29124q;
    }

    public final c0 E() {
        return this.f29119l;
    }

    public final d0 F() {
        return this.f29120m;
    }

    public final float G() {
        return this.f29131x.getValue().floatValue();
    }

    public final float H() {
        return this.f29115h;
    }

    public final float J(float f10) {
        if ((f10 < 0.0f && !d()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f29115h) <= 0.5f) {
            float f11 = this.f29115h + f10;
            this.f29115h = f11;
            if (Math.abs(f11) > 0.5f) {
                r value = this.f29113f.getValue();
                float f12 = this.f29115h;
                int round = Math.round(f12);
                r rVar = this.f29110c;
                boolean s10 = value.s(round, !this.f29109b);
                if (s10 && rVar != null) {
                    s10 = rVar.s(round, true);
                }
                if (s10) {
                    n(value, this.f29109b, true);
                    L.d(this.f29130w);
                    I(f12 - this.f29115h, value);
                } else {
                    c0 c0Var = this.f29119l;
                    if (c0Var != null) {
                        c0Var.g();
                    }
                    I(f12 - this.f29115h, x());
                }
            }
            if (Math.abs(this.f29115h) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f29115h;
            this.f29115h = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f29115h).toString());
    }

    public final Object K(int i10, int i11, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this, (C5589L) null, new h(this, i10, i11, (C17164e<? super h>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final void O(int i10, int i11, boolean z10) {
        if (!(this.f29111d.a() == i10 && this.f29111d.c() == i11)) {
            this.f29122o.o();
        }
        this.f29111d.d(i10, i11);
        if (z10) {
            c0 c0Var = this.f29119l;
            if (c0Var != null) {
                c0Var.g();
                return;
            }
            return;
        }
        L.d(this.f29127t);
    }

    public final int Q(l lVar, int i10) {
        return this.f29111d.j(lVar, i10);
    }

    public boolean b() {
        return this.f29116i.b();
    }

    public boolean c() {
        return ((Boolean) this.f29129v.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f29128u.getValue()).booleanValue();
    }

    public float e(float f10) {
        return this.f29116i.e(f10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.p<? super p0.A, ? super dI.e<? super XH.N>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(n0.C5589L r6, nI.p<? super p0.C5678A, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t0.C5934A.g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            t0.A$g r0 = (t0.C5934A.g) r0
            int r1 = r0.f29143h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29143h = r1
            goto L_0x0018
        L_0x0013:
            t0.A$g r0 = new t0.A$g
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f29141f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f29143h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f29140e
            r7 = r6
            nI.p r7 = (nI.p) r7
            java.lang.Object r6 = r0.f29139d
            n0.L r6 = (n0.C5589L) r6
            java.lang.Object r2 = r0.f29138c
            t0.A r2 = (t0.C5934A) r2
            XH.y.b(r8)
            goto L_0x005a
        L_0x0045:
            XH.y.b(r8)
            v0.b r8 = r5.f29121n
            r0.f29138c = r5
            r0.f29139d = r6
            r0.f29140e = r7
            r0.f29143h = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            p0.D r8 = r2.f29116i
            r2 = 0
            r0.f29138c = r2
            r0.f29139d = r2
            r0.f29140e = r2
            r0.f29143h = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C5934A.f(n0.L, nI.p, dI.e):java.lang.Object");
    }

    public final Object l(int i10, int i11, C17164e<? super C16807N> eVar) {
        Object d10 = C6141g.d(this.f29112e, i10, i11, 100, r(), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public final void n(r rVar, boolean z10, boolean z11) {
        if (z10 || !this.f29109b) {
            if (z10) {
                this.f29109b = true;
            }
            M(rVar.j());
            N(rVar.k());
            this.f29115h -= rVar.m();
            this.f29113f.setValue(rVar);
            if (z11) {
                this.f29111d.i(rVar.q());
            } else {
                this.f29111d.h(rVar);
                if (this.f29118k) {
                    this.f29108a.d(this.f29125r, rVar);
                }
            }
            if (z10) {
                P(rVar.r(), rVar.o(), rVar.n());
            }
            this.f29117j++;
            return;
        }
        this.f29110c = rVar;
    }

    public final C6136b p() {
        return this.f29121n;
    }

    public final C6144j q() {
        return this.f29123p;
    }

    public final c2.d r() {
        return this.f29113f.getValue().o();
    }

    public final int s() {
        return this.f29111d.a();
    }

    public final int t() {
        return this.f29111d.c();
    }

    public final boolean u() {
        return this.f29109b;
    }

    public final m v() {
        return this.f29114g;
    }

    public final LazyLayoutItemAnimator<s> w() {
        return this.f29122o;
    }

    public final p x() {
        return this.f29113f.getValue();
    }

    public final C4899r0<C16807N> y() {
        return this.f29127t;
    }

    public final C17974j z() {
        return (C17974j) this.f29111d.b().getValue();
    }

    public C5934A(int i10, int i11, v vVar) {
        this.f29108a = vVar;
        y yVar = new y(i10, i11);
        this.f29111d = yVar;
        this.f29112e = new e(this);
        this.f29113f = p1.i(C5935B.f29154b, p1.k());
        this.f29114g = r0.l.a();
        this.f29116i = C5682E.a(new i(this));
        this.f29118k = true;
        this.f29120m = new f(this);
        this.f29121n = new C6136b();
        this.f29122o = new LazyLayoutItemAnimator<>();
        this.f29123p = new C6144j();
        this.f29124q = new androidx.compose.foundation.lazy.layout.d(vVar.b(), new e(this, i10));
        this.f29125r = new d(this);
        this.f29126s = new C6131E();
        yVar.b();
        this.f29127t = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f29128u = u1.e(bool, (o1) null, 2, (Object) null);
        this.f29129v = u1.e(bool, (o1) null, 2, (Object) null);
        this.f29130w = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        z0<Float, C5554m> f10 = B0.f(C17536l.f144385a);
        Float valueOf = Float.valueOf(0.0f);
        this.f29131x = C5552l.d(f10, valueOf, valueOf, 0, 0, false, 56, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5934A(int i10, int i11, v vVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? w.b(0, 1, (Object) null) : vVar);
    }

    public C5934A(int i10, int i11) {
        this(i10, i11, w.b(0, 1, (Object) null));
    }
}
