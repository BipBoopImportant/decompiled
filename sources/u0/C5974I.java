package u0;

import E1.c0;
import E1.d0;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.v;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import c2.C5267b;
import dI.C17164e;
import eI.C17187b;
import f1.C5299a;
import f1.C5309k;
import g1.C5342k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5589L;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.C5682E;
import pI.C17752b;
import r0.m;
import tI.C17974j;
import v0.C6131E;
import v0.C6136b;
import v0.C6141g;
import v0.C6144j;
import v0.K;
import v0.L;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u00018B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001bH@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010#J$\u0010&\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H@¢\u0006\u0004\b&\u0010\u0014J!\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020'078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010E\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n8\u0000@BX\u000e¢\u0006\f\n\u0004\b\"\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010FR$\u0010K\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00028\u0000@BX\u000e¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010JR\"\u0010R\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010X\u001a\u0004\u0018\u00010S2\b\u0010A\u001a\u0004\u0018\u00010S8\u0000@BX\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0000X\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010c\u001a\u00020_8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010`\u001a\u0004\ba\u0010bR \u0010j\u001a\b\u0012\u0004\u0012\u00020e0d8\u0000X\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010o\u001a\u00020k8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010u\u001a\u00020p8\u0000X\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020v8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010zR\u001c\u0010\u0001\u001a\u00020|8\u0000X\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u0010\u0001R%\u0010\u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0001\u00109\u001a\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0001\u00109\u001a\u0006\b\u0001\u0010\u0001R-\u0010\u0001\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158V@RX\u0002¢\u0006\u0013\n\u0004\b>\u00109\u001a\u0004\b<\u0010O\"\u0005\b\u0001\u0010QR-\u0010\u0001\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158V@RX\u0002¢\u0006\u0013\n\u0004\bh\u00109\u001a\u0004\b8\u0010O\"\u0005\b\u0001\u0010QR\u0016\u0010\u0001\u001a\u00020\u00028BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010JR\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0001\u0010JR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0001\u0010JR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0001\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010JR\u0017\u0010\u0001\u001a\u00030\u00018@X\u0004¢\u0006\u0007\u001a\u0005\b}\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018@X\u0002¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001*\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0001\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010O\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Lu0/I;", "Lp0/D;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lu0/A;", "prefetchStrategy", "<init>", "(IILu0/A;)V", "(II)V", "", "delta", "Lu0/s;", "layoutInfo", "LXH/N;", "G", "(FLu0/s;)V", "index", "scrollOffset", "I", "(IILdI/e;)Ljava/lang/Object;", "", "forceRemeasure", "M", "(IIZ)V", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "e", "(F)F", "distance", "H", "k", "Lu0/u;", "result", "visibleItemsStayedTheSame", "m", "(Lu0/u;Z)V", "Lu0/l;", "itemProvider", "firstItemIndex", "N", "(Lu0/l;I)I", "a", "Lu0/A;", "Lu0/D;", "b", "Lu0/D;", "scrollPosition", "LU0/r0;", "c", "LU0/r0;", "layoutInfoState", "Lr0/m;", "d", "Lr0/m;", "t", "()Lr0/m;", "internalInteractionSource", "<set-?>", "F", "E", "()F", "scrollToBeConsumed", "Lp0/D;", "scrollableState", "g", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "h", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "LE1/c0;", "i", "LE1/c0;", "C", "()LE1/c0;", "remeasurement", "LE1/d0;", "j", "LE1/d0;", "D", "()LE1/d0;", "remeasurementModifier", "Lv0/b;", "Lv0/b;", "o", "()Lv0/b;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lu0/v;", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "u", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Lv0/j;", "Lv0/j;", "p", "()Lv0/j;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "n", "Landroidx/compose/foundation/lazy/layout/d;", "B", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lu0/z;", "Lu0/z;", "prefetchScope", "Lu0/e;", "Lu0/e;", "animateScrollScope", "Lv0/E;", "q", "Lv0/E;", "z", "()Lv0/E;", "pinnedItems", "Lv0/L;", "r", "A", "()LU0/r0;", "placementScopeInvalidator", "s", "w", "measurementScopeInvalidator", "L", "canScrollForward", "K", "canScrollBackward", "y", "numOfItemsToTeleport", "v", "()Lu0/s;", "slotsPerLine", "Lc2/d;", "()Lc2/d;", "density", "LtI/j;", "x", "()LtI/j;", "getNearestRange$foundation_release$delegate", "(Lu0/I;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.I  reason: case insensitive filesystem */
public final class C5974I implements C5681D {

    /* renamed from: v  reason: collision with root package name */
    public static final c f29592v = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final C5309k<C5974I, ?> f29593w = C5299a.a(a.f29615c, b.f29616c);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5966A f29594a;

    /* renamed from: b  reason: collision with root package name */
    private final C5969D f29595b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C4899r0<C5997u> f29596c;

    /* renamed from: d  reason: collision with root package name */
    private final m f29597d;

    /* renamed from: e  reason: collision with root package name */
    private float f29598e;

    /* renamed from: f  reason: collision with root package name */
    private final C5681D f29599f;

    /* renamed from: g  reason: collision with root package name */
    private int f29600g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29601h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public c0 f29602i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f29603j;

    /* renamed from: k  reason: collision with root package name */
    private final C6136b f29604k;

    /* renamed from: l  reason: collision with root package name */
    private final LazyLayoutItemAnimator<C5998v> f29605l;

    /* renamed from: m  reason: collision with root package name */
    private final C6144j f29606m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f29607n;

    /* renamed from: o  reason: collision with root package name */
    private final C6002z f29608o;

    /* renamed from: p  reason: collision with root package name */
    private final C5981e f29609p;

    /* renamed from: q  reason: collision with root package name */
    private final C6131E f29610q;

    /* renamed from: r  reason: collision with root package name */
    private final C4899r0<C16807N> f29611r;

    /* renamed from: s  reason: collision with root package name */
    private final C4899r0<C16807N> f29612s;

    /* renamed from: t  reason: collision with root package name */
    private final C4899r0 f29613t;

    /* renamed from: u  reason: collision with root package name */
    private final C4899r0 f29614u;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf1/m;", "Lu0/I;", "it", "", "", "a", "(Lf1/m;Lu0/I;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.I$a */
    static final class a extends C17544u implements p<f1.m, C5974I, List<? extends Integer>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f29615c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List<Integer> invoke(f1.m mVar, C5974I i10) {
            return C16877v.q(Integer.valueOf(i10.r()), Integer.valueOf(i10.s()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lu0/I;", "a", "(Ljava/util/List;)Lu0/I;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.I$b */
    static final class b extends C17544u implements C17642l<List<? extends Integer>, C5974I> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f29616c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C5974I invoke(List<Integer> list) {
            return new C5974I(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu0/I$c;", "", "<init>", "()V", "Lf1/k;", "Lu0/I;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.I$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<C5974I, ?> a() {
            return C5974I.f29593w;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"u0/I$d", "Lu0/z;", "", "lineIndex", "", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.I$d */
    public static final class d implements C6002z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5974I f29617a;

        d(C5974I i10) {
            this.f29617a = i10;
        }

        public List<d.b> a(int i10) {
            ArrayList arrayList = new ArrayList();
            C5342k.a aVar = C5342k.f23395e;
            C5974I i11 = this.f29617a;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f10 = aVar.f(d10);
            try {
                List invoke = ((C5997u) i11.f29596c.getValue()).p().invoke(Integer.valueOf(i10));
                int size = invoke.size();
                for (int i12 = 0; i12 < size; i12++) {
                    v vVar = (v) invoke.get(i12);
                    arrayList.add(i11.B().e(((Number) vVar.c()).intValue(), ((C5267b) vVar.d()).r()));
                }
                C16807N n10 = C16807N.f139792a;
                aVar.n(d10, f10, h10);
                return arrayList;
            } catch (Throwable th2) {
                aVar.n(d10, f10, h10);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/K;", "LXH/N;", "a", "(Lv0/K;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.I$e */
    static final class e extends C17544u implements C17642l<K, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5974I f29618c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5974I i10, int i11) {
            super(1);
            this.f29618c = i10;
            this.f29619d = i11;
        }

        public final void a(K k10) {
            C5966A h10 = this.f29618c.f29594a;
            int i10 = this.f29619d;
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"u0/I$f", "LE1/d0;", "LE1/c0;", "remeasurement", "LXH/N;", "m", "(LE1/c0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.I$f */
    public static final class f implements d0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f29620d;

        f(C5974I i10) {
            this.f29620d = i10;
        }

        public void m(c0 c0Var) {
            this.f29620d.f29602i = c0Var;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {370, 371}, m = "scroll")
    /* renamed from: u0.I$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f29621c;

        /* renamed from: d  reason: collision with root package name */
        Object f29622d;

        /* renamed from: e  reason: collision with root package name */
        Object f29623e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f29624f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5974I f29625g;

        /* renamed from: h  reason: collision with root package name */
        int f29626h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5974I i10, C17164e<? super g> eVar) {
            super(eVar);
            this.f29625g = i10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29624f = obj;
            this.f29626h |= Integer.MIN_VALUE;
            return this.f29625g.f((C5589L) null, (p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: u0.I$h */
    static final class h extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f29627c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f29628d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29629e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f29630f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C5974I i10, int i11, int i12, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f29628d = i10;
            this.f29629e = i11;
            this.f29630f = i12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f29628d, this.f29629e, this.f29630f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((h) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f29627c == 0) {
                y.b(obj);
                this.f29628d.M(this.f29629e, this.f29630f, true);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.I$i */
    static final class i extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5974I f29631c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C5974I i10) {
            super(1);
            this.f29631c = i10;
        }

        public final Float a(float f10) {
            return Float.valueOf(-this.f29631c.H(-f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public C5974I() {
        this(0, 0, (C5966A) null, 7, (DefaultConstructorMarker) null);
    }

    private final void G(float f10, C5995s sVar) {
        if (this.f29601h) {
            this.f29594a.d(this.f29608o, f10, sVar);
        }
    }

    public static /* synthetic */ Object J(C5974I i10, int i11, int i12, C17164e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i10.I(i11, i12, eVar);
    }

    private void K(boolean z10) {
        this.f29614u.setValue(Boolean.valueOf(z10));
    }

    private void L(boolean z10) {
        this.f29613t.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ Object l(C5974I i10, int i11, int i12, C17164e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i10.k(i11, i12, eVar);
    }

    public static /* synthetic */ void n(C5974I i10, C5997u uVar, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        i10.m(uVar, z10);
    }

    private final int y() {
        return F() * 100;
    }

    public final C4899r0<C16807N> A() {
        return this.f29611r;
    }

    public final androidx.compose.foundation.lazy.layout.d B() {
        return this.f29607n;
    }

    public final c0 C() {
        return this.f29602i;
    }

    public final d0 D() {
        return this.f29603j;
    }

    public final float E() {
        return this.f29598e;
    }

    public final int F() {
        return this.f29596c.getValue().q();
    }

    public final float H(float f10) {
        if ((f10 < 0.0f && !d()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f29598e) <= 0.5f) {
            float f11 = this.f29598e + f10;
            this.f29598e = f11;
            if (Math.abs(f11) > 0.5f) {
                C5997u value = this.f29596c.getValue();
                float f12 = this.f29598e;
                if (value.r(C17752b.e(f12))) {
                    m(value, true);
                    L.d(this.f29611r);
                    G(f12 - this.f29598e, value);
                } else {
                    c0 c0Var = this.f29602i;
                    if (c0Var != null) {
                        c0Var.g();
                    }
                    G(f12 - this.f29598e, v());
                }
            }
            if (Math.abs(this.f29598e) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f29598e;
            this.f29598e = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f29598e).toString());
    }

    public final Object I(int i10, int i11, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this, (C5589L) null, new h(this, i10, i11, (C17164e<? super h>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final void M(int i10, int i11, boolean z10) {
        if (!(this.f29595b.a() == i10 && this.f29595b.c() == i11)) {
            this.f29605l.o();
        }
        this.f29595b.d(i10, i11);
        if (z10) {
            c0 c0Var = this.f29602i;
            if (c0Var != null) {
                c0Var.g();
                return;
            }
            return;
        }
        L.d(this.f29612s);
    }

    public final int N(C5988l lVar, int i10) {
        return this.f29595b.j(lVar, i10);
    }

    public boolean b() {
        return this.f29599f.b();
    }

    public boolean c() {
        return ((Boolean) this.f29614u.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f29613t.getValue()).booleanValue();
    }

    public float e(float f10) {
        return this.f29599f.e(f10);
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
            boolean r0 = r8 instanceof u0.C5974I.g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            u0.I$g r0 = (u0.C5974I.g) r0
            int r1 = r0.f29626h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29626h = r1
            goto L_0x0018
        L_0x0013:
            u0.I$g r0 = new u0.I$g
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f29624f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f29626h
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
            java.lang.Object r6 = r0.f29623e
            r7 = r6
            nI.p r7 = (nI.p) r7
            java.lang.Object r6 = r0.f29622d
            n0.L r6 = (n0.C5589L) r6
            java.lang.Object r2 = r0.f29621c
            u0.I r2 = (u0.C5974I) r2
            XH.y.b(r8)
            goto L_0x005a
        L_0x0045:
            XH.y.b(r8)
            v0.b r8 = r5.f29604k
            r0.f29621c = r5
            r0.f29622d = r6
            r0.f29623e = r7
            r0.f29626h = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            p0.D r8 = r2.f29599f
            r2 = 0
            r0.f29621c = r2
            r0.f29622d = r2
            r0.f29623e = r2
            r0.f29626h = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C5974I.f(n0.L, nI.p, dI.e):java.lang.Object");
    }

    public final Object k(int i10, int i11, C17164e<? super C16807N> eVar) {
        Object d10 = C6141g.d(this.f29609p, i10, i11, y(), q(), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public final void m(C5997u uVar, boolean z10) {
        this.f29598e -= uVar.l();
        this.f29596c.setValue(uVar);
        K(uVar.j());
        L(uVar.k());
        if (z10) {
            this.f29595b.i(uVar.o());
        } else {
            this.f29595b.h(uVar);
            if (this.f29601h) {
                this.f29594a.c(this.f29608o, uVar);
            }
        }
        this.f29600g++;
    }

    public final C6136b o() {
        return this.f29604k;
    }

    public final C6144j p() {
        return this.f29606m;
    }

    public final c2.d q() {
        return this.f29596c.getValue().m();
    }

    public final int r() {
        return this.f29595b.a();
    }

    public final int s() {
        return this.f29595b.c();
    }

    public final m t() {
        return this.f29597d;
    }

    public final LazyLayoutItemAnimator<C5998v> u() {
        return this.f29605l;
    }

    public final C5995s v() {
        return this.f29596c.getValue();
    }

    public final C4899r0<C16807N> w() {
        return this.f29612s;
    }

    public final C17974j x() {
        return (C17974j) this.f29595b.b().getValue();
    }

    public final C6131E z() {
        return this.f29610q;
    }

    public C5974I(int i10, int i11, C5966A a10) {
        this.f29594a = a10;
        C5969D d10 = new C5969D(i10, i11);
        this.f29595b = d10;
        this.f29596c = p1.i(C5975J.f29632a, p1.k());
        this.f29597d = r0.l.a();
        this.f29599f = C5682E.a(new i(this));
        this.f29601h = true;
        this.f29603j = new f(this);
        this.f29604k = new C6136b();
        this.f29605l = new LazyLayoutItemAnimator<>();
        this.f29606m = new C6144j();
        this.f29607n = new androidx.compose.foundation.lazy.layout.d(a10.b(), new e(this, i10));
        this.f29608o = new d(this);
        this.f29609p = new C5981e(this);
        this.f29610q = new C6131E();
        d10.b();
        this.f29611r = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        this.f29612s = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f29613t = u1.e(bool, (o1) null, 2, (Object) null);
        this.f29614u = u1.e(bool, (o1) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5974I(int i10, int i11, C5966A a10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C5967B.b(0, 1, (Object) null) : a10);
    }

    public C5974I(int i10, int i11) {
        this(i10, i11, C5967B.b(0, 1, (Object) null));
    }
}
