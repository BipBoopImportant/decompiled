package w0;

import E1.c0;
import E1.d0;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import YH.C16870n;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import c2.C5267b;
import c2.n;
import dI.C17164e;
import eI.C17187b;
import f1.C5299a;
import f1.C5309k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5589L;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.C5682E;
import p0.v;
import pI.C17752b;
import r0.m;
import tI.C17974j;
import v0.C6131E;
import v0.C6136b;
import v0.C6144j;
import v0.L;
import v0.P;
import v0.t;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ¥\u00012\u00020\u0001:\u0001HB#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J<\u0010)\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140&\u0012\u0006\u0012\u0004\u0018\u00010'0$H@¢\u0006\u0004\b)\u0010*J\"\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\tH@¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b8\u0010\u0010J!\u0010;\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020/H\u0000¢\u0006\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020=8\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010L\u001a\u00020G8\u0000X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR+\u0010R\u001a\u00020/2\u0006\u0010M\u001a\u00020/8V@RX\u0002¢\u0006\u0012\n\u0004\bN\u0010E\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010T\u001a\u00020/2\u0006\u0010M\u001a\u00020/8V@RX\u0002¢\u0006\u0012\n\u0004\b8\u0010E\u001a\u0004\bH\u0010O\"\u0004\bS\u0010QR\u0014\u0010W\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010VR(\u0010]\u001a\u0004\u0018\u00010X2\b\u0010M\u001a\u0004\u0018\u00010X8\u0000@BX\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0000X\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0000X\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0000X\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010s\u001a\u00020/8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010p\u001a\u0004\bq\u0010O\"\u0004\br\u0010QR\u001a\u0010y\u001a\u00020t8\u0000X\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010zR$\u0010~\u001a\u00020\r2\u0006\u0010M\u001a\u00020\r8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\b|\u0010}R'\u0010\u0001\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0004\b \u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010R$\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u00010\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bm\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R%\u0010 \u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0001\u0010E\u001a\u0006\b\u0001\u0010\u0001R$\u0010¢\u0001\u001a\u00030\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bJ\u0010E\u001a\u0006\b¡\u0001\u0010\u0001R\u0014\u0010£\u0001\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010¤\u0001\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010§\u0001\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\u001f\u001a\u00020\t8@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R!\u0010­\u0001\u001a\u00030¨\u00018@X\u0002¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001*\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010®\u0001\u001a\u00020/8VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010O\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¯\u0001"}, d2 = {"Lw0/E;", "Lp0/D;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "Lv0/P;", "prefetchScheduler", "<init>", "([I[ILv0/P;)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "", "distance", "J", "(F)F", "delta", "Lw0/v;", "info", "LXH/N;", "H", "(FLw0/v;)V", "", "prefetchHandlesUsed", "n", "(Ljava/util/Set;)V", "Lw0/q;", "m", "(Lw0/q;)V", "itemIndex", "laneCount", "o", "(II)[I", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "index", "scrollOffset", "K", "(IILdI/e;)Ljava/lang/Object;", "", "forceRemeasure", "O", "(IIZ)V", "Lv0/t;", "itemProvider", "firstItemIndex", "P", "(Lv0/t;[I)[I", "e", "result", "visibleItemsStayedTheSame", "k", "(Lw0/v;Z)V", "Lw0/z;", "a", "Lw0/z;", "F", "()Lw0/z;", "scrollPosition", "LU0/r0;", "b", "LU0/r0;", "layoutInfoState", "Lw0/p;", "c", "Lw0/p;", "v", "()Lw0/p;", "laneInfo", "<set-?>", "d", "()Z", "N", "(Z)V", "canScrollForward", "M", "canScrollBackward", "Lw0/b;", "Lw0/b;", "animateScrollScope", "LE1/c0;", "g", "LE1/c0;", "D", "()LE1/c0;", "remeasurement", "LE1/d0;", "h", "LE1/d0;", "E", "()LE1/d0;", "remeasurementModifier", "Lv0/b;", "i", "Lv0/b;", "p", "()Lv0/b;", "awaitLayoutModifier", "Lv0/j;", "j", "Lv0/j;", "q", "()Lv0/j;", "beyondBoundsInfo", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/d;", "l", "Landroidx/compose/foundation/lazy/layout/d;", "C", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lp0/D;", "scrollableState", "G", "()F", "scrollToBeConsumed", "I", "getMeasurePassCount$foundation_release", "()I", "setMeasurePassCount$foundation_release", "(I)V", "measurePassCount", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/d$b;", "Ljava/util/Map;", "currentItemPrefetchHandles", "Lr0/m;", "r", "Lr0/m;", "y", "()Lr0/m;", "mutableInteractionSource", "Lv0/E;", "s", "Lv0/E;", "A", "()Lv0/E;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lw0/x;", "t", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Lv0/L;", "u", "B", "()LU0/r0;", "placementScopeInvalidator", "x", "measurementScopeInvalidator", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "w", "()Lw0/q;", "layoutInfo", "LtI/j;", "z", "()LtI/j;", "getNearestRange$foundation_release$delegate", "(Lw0/E;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.E  reason: case insensitive filesystem */
public final class C6192E implements C5681D {

    /* renamed from: w  reason: collision with root package name */
    public static final c f31131w = new c((DefaultConstructorMarker) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f31132x = 8;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final C5309k<C6192E, Object> f31133y = C5299a.a(a.f31156c, b.f31157c);

    /* renamed from: a  reason: collision with root package name */
    private final z f31134a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0<v> f31135b;

    /* renamed from: c  reason: collision with root package name */
    private final p f31136c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f31137d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f31138e;

    /* renamed from: f  reason: collision with root package name */
    private final C6195b f31139f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public c0 f31140g;

    /* renamed from: h  reason: collision with root package name */
    private final d0 f31141h;

    /* renamed from: i  reason: collision with root package name */
    private final C6136b f31142i;

    /* renamed from: j  reason: collision with root package name */
    private final C6144j f31143j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f31144k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f31145l;

    /* renamed from: m  reason: collision with root package name */
    private final C5681D f31146m;

    /* renamed from: n  reason: collision with root package name */
    private float f31147n;

    /* renamed from: o  reason: collision with root package name */
    private int f31148o;

    /* renamed from: p  reason: collision with root package name */
    private int f31149p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<Integer, d.b> f31150q;

    /* renamed from: r  reason: collision with root package name */
    private final m f31151r;

    /* renamed from: s  reason: collision with root package name */
    private final C6131E f31152s;

    /* renamed from: t  reason: collision with root package name */
    private final LazyLayoutItemAnimator<x> f31153t;

    /* renamed from: u  reason: collision with root package name */
    private final C4899r0<C16807N> f31154u;

    /* renamed from: v  reason: collision with root package name */
    private final C4899r0<C16807N> f31155v;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf1/m;", "Lw0/E;", "state", "", "", "a", "(Lf1/m;Lw0/E;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w0.E$a */
    static final class a extends C17544u implements p<f1.m, C6192E, List<? extends int[]>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f31156c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List<int[]> invoke(f1.m mVar, C6192E e10) {
            return C16877v.q(e10.F().d(), e10.F().g());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lw0/E;", "a", "(Ljava/util/List;)Lw0/E;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w0.E$b */
    static final class b extends C17544u implements C17642l<List<? extends int[]>, C6192E> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f31157c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C6192E invoke(List<int[]> list) {
            return new C6192E(list.get(0), list.get(1), (P) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw0/E$c;", "", "<init>", "()V", "Lf1/k;", "Lw0/E;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w0.E$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<C6192E, Object> a() {
            return C6192E.f31133y;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"w0/E$d", "LE1/d0;", "LE1/c0;", "remeasurement", "LXH/N;", "m", "(LE1/c0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w0.E$d */
    public static final class d implements d0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6192E f31158d;

        d(C6192E e10) {
            this.f31158d = e10;
        }

        public void m(c0 c0Var) {
            this.f31158d.f31140g = c0Var;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", l = {235, 236}, m = "scroll")
    /* renamed from: w0.E$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f31159c;

        /* renamed from: d  reason: collision with root package name */
        Object f31160d;

        /* renamed from: e  reason: collision with root package name */
        Object f31161e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f31162f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6192E f31163g;

        /* renamed from: h  reason: collision with root package name */
        int f31164h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6192E e10, C17164e<? super e> eVar) {
            super(eVar);
            this.f31163g = e10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31162f = obj;
            this.f31164h |= Integer.MIN_VALUE;
            return this.f31163g.f((C5589L) null, (p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w0.E$f */
    /* synthetic */ class f extends C17540p implements p<Integer, Integer, int[]> {
        f(Object obj) {
            super(2, obj, C6192E.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final int[] t(int i10, int i11) {
            return ((C6192E) this.receiver).o(i10, i11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w0.E$g */
    static final class g extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f31165c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6192E f31166d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31167e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31168f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C6192E e10, int i10, int i11, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f31166d = e10;
            this.f31167e = i10;
            this.f31168f = i11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f31166d, this.f31167e, this.f31168f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((g) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f31165c == 0) {
                y.b(obj);
                this.f31166d.O(this.f31167e, this.f31168f, true);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w0.E$h */
    static final class h extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6192E f31169c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C6192E e10) {
            super(1);
            this.f31169c = e10;
        }

        public final Float a(float f10) {
            return Float.valueOf(-this.f31169c.J(-f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public C6192E(int[] iArr, int[] iArr2, P p10) {
        z zVar = new z(iArr, iArr2, new f(this));
        this.f31134a = zVar;
        this.f31135b = p1.i(w.b(), p1.k());
        this.f31136c = new p();
        Boolean bool = Boolean.FALSE;
        this.f31137d = u1.e(bool, (o1) null, 2, (Object) null);
        this.f31138e = u1.e(bool, (o1) null, 2, (Object) null);
        this.f31139f = new C6195b(this);
        this.f31141h = new d(this);
        this.f31142i = new C6136b();
        this.f31143j = new C6144j();
        this.f31144k = true;
        this.f31145l = new androidx.compose.foundation.lazy.layout.d(p10, (C17642l) null, 2, (DefaultConstructorMarker) null);
        this.f31146m = C5682E.a(new h(this));
        this.f31149p = -1;
        this.f31150q = new LinkedHashMap();
        this.f31151r = r0.l.a();
        this.f31152s = new C6131E();
        this.f31153t = new LazyLayoutItemAnimator<>();
        zVar.e();
        this.f31154u = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        this.f31155v = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
    }

    private final void H(float f10, v vVar) {
        int i10;
        if (this.f31144k && !vVar.i().isEmpty()) {
            boolean z10 = f10 < 0.0f;
            int index = z10 ? ((x) C16877v.I0(vVar.i())).getIndex() : ((x) C16877v.w0(vVar.i())).getIndex();
            if (index != this.f31149p) {
                this.f31149p = index;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C6190C m10 = vVar.m();
                int length = m10.b().length;
                for (int i11 = 0; i11 < length; i11++) {
                    index = z10 ? this.f31136c.e(index, i11) : this.f31136c.f(index, i11);
                    if (index < 0 || index >= vVar.f() || linkedHashSet.contains(Integer.valueOf(index))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(index));
                    if (!this.f31150q.containsKey(Integer.valueOf(index))) {
                        boolean a10 = vVar.n().a(index);
                        int i12 = a10 ? 0 : i11;
                        int i13 = a10 ? length : 1;
                        if (i13 == 1) {
                            i10 = m10.b()[i12];
                        } else {
                            int i14 = m10.a()[i12];
                            int i15 = (i12 + i13) - 1;
                            i10 = (m10.a()[i15] + m10.b()[i15]) - i14;
                        }
                        this.f31150q.put(Integer.valueOf(index), this.f31145l.e(index, vVar.a() == v.Vertical ? C5267b.f23024b.e(i10) : C5267b.f23024b.d(i10)));
                    }
                }
                n(linkedHashSet);
            }
        }
    }

    static /* synthetic */ void I(C6192E e10, float f10, v vVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vVar = e10.f31135b.getValue();
        }
        e10.H(f10, vVar);
    }

    /* access modifiers changed from: private */
    public final float J(float f10) {
        if ((f10 < 0.0f && !d()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f31147n) <= 0.5f) {
            float f11 = this.f31147n + f10;
            this.f31147n = f11;
            if (Math.abs(f11) > 0.5f) {
                v value = this.f31135b.getValue();
                float f12 = this.f31147n;
                if (value.q(C17752b.e(f12))) {
                    k(value, true);
                    L.d(this.f31154u);
                    H(f12 - this.f31147n, value);
                } else {
                    c0 c0Var = this.f31140g;
                    if (c0Var != null) {
                        c0Var.g();
                    }
                    I(this, f12 - this.f31147n, (v) null, 2, (Object) null);
                }
            }
            if (Math.abs(this.f31147n) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f31147n;
            this.f31147n = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f31147n).toString());
    }

    public static /* synthetic */ Object L(C6192E e10, int i10, int i11, C17164e eVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return e10.K(i10, i11, eVar);
    }

    private void M(boolean z10) {
        this.f31138e.setValue(Boolean.valueOf(z10));
    }

    private void N(boolean z10) {
        this.f31137d.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void l(C6192E e10, v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e10.k(vVar, z10);
    }

    private final void m(q qVar) {
        List<C6202i> i10 = qVar.i();
        if (this.f31149p != -1 && !i10.isEmpty()) {
            int index = ((C6202i) C16877v.w0(i10)).getIndex();
            int index2 = ((C6202i) C16877v.I0(i10)).getIndex();
            int i11 = this.f31149p;
            if (index > i11 || i11 > index2) {
                this.f31149p = -1;
                for (d.b cancel : this.f31150q.values()) {
                    cancel.cancel();
                }
                this.f31150q.clear();
            }
        }
    }

    private final void n(Set<Integer> set) {
        Iterator<Map.Entry<Integer, d.b>> it = this.f31150q.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!set.contains(next.getKey())) {
                ((d.b) next.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public final int[] o(int i10, int i11) {
        int i12;
        int[] iArr = new int[i11];
        if (this.f31135b.getValue().n().a(i10)) {
            C16870n.y(iArr, i10, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f31136c.d(i10 + i11);
        int h10 = this.f31136c.h(i10);
        if (h10 == -2 || h10 == -1) {
            i12 = 0;
        } else if (h10 >= 0) {
            i12 = Math.min(h10, i11);
        } else {
            throw new IllegalArgumentException(("Expected positive lane number, got " + h10 + " instead.").toString());
        }
        int i13 = i12;
        int i14 = i13 - 1;
        int i15 = i10;
        while (true) {
            if (-1 >= i14) {
                break;
            }
            i15 = this.f31136c.f(i15, i14);
            iArr[i14] = i15;
            if (i15 == -1) {
                C16870n.y(iArr, -1, 0, i14, 2, (Object) null);
                break;
            }
            i14--;
        }
        iArr[i13] = i10;
        while (true) {
            i13++;
            if (i13 >= i11) {
                return iArr;
            }
            i10 = this.f31136c.e(i10, i13);
            iArr[i13] = i10;
        }
    }

    public final C6131E A() {
        return this.f31152s;
    }

    public final C4899r0<C16807N> B() {
        return this.f31154u;
    }

    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f31145l;
    }

    public final c0 D() {
        return this.f31140g;
    }

    public final d0 E() {
        return this.f31141h;
    }

    public final z F() {
        return this.f31134a;
    }

    public final float G() {
        return this.f31147n;
    }

    public final Object K(int i10, int i11, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this, (C5589L) null, new g(this, i10, i11, (C17164e<? super g>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final void O(int i10, int i11, boolean z10) {
        boolean z11 = (this.f31134a.c() == i10 && this.f31134a.f() == i11) ? false : true;
        if (z11) {
            this.f31153t.o();
        }
        v value = this.f31135b.getValue();
        C6202i a10 = w.a(value, i10);
        if (a10 == null || !z11) {
            this.f31134a.h(i10, i11);
        } else {
            int i12 = (value.a() == v.Vertical ? n.i(a10.c()) : n.h(a10.c())) + i11;
            int length = value.l().length;
            int[] iArr = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = value.l()[i13] + i12;
            }
            this.f31134a.m(iArr);
        }
        if (z10) {
            c0 c0Var = this.f31140g;
            if (c0Var != null) {
                c0Var.g();
                return;
            }
            return;
        }
        L.d(this.f31155v);
    }

    public final int[] P(t tVar, int[] iArr) {
        return this.f31134a.n(tVar, iArr);
    }

    public boolean b() {
        return this.f31146m.b();
    }

    public boolean c() {
        return ((Boolean) this.f31138e.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f31137d.getValue()).booleanValue();
    }

    public float e(float f10) {
        return this.f31146m.e(f10);
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
            boolean r0 = r8 instanceof w0.C6192E.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            w0.E$e r0 = (w0.C6192E.e) r0
            int r1 = r0.f31164h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31164h = r1
            goto L_0x0018
        L_0x0013:
            w0.E$e r0 = new w0.E$e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31162f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f31164h
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
            java.lang.Object r6 = r0.f31161e
            r7 = r6
            nI.p r7 = (nI.p) r7
            java.lang.Object r6 = r0.f31160d
            n0.L r6 = (n0.C5589L) r6
            java.lang.Object r2 = r0.f31159c
            w0.E r2 = (w0.C6192E) r2
            XH.y.b(r8)
            goto L_0x005a
        L_0x0045:
            XH.y.b(r8)
            v0.b r8 = r5.f31142i
            r0.f31159c = r5
            r0.f31160d = r6
            r0.f31161e = r7
            r0.f31164h = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            p0.D r8 = r2.f31146m
            r2 = 0
            r0.f31159c = r2
            r0.f31160d = r2
            r0.f31161e = r2
            r0.f31164h = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C6192E.f(n0.L, nI.p, dI.e):java.lang.Object");
    }

    public final void k(v vVar, boolean z10) {
        this.f31147n -= vVar.j();
        this.f31135b.setValue(vVar);
        if (z10) {
            this.f31134a.m(vVar.l());
        } else {
            this.f31134a.l(vVar);
            m(vVar);
        }
        M(vVar.e());
        N(vVar.h());
        this.f31148o++;
    }

    public final C6136b p() {
        return this.f31142i;
    }

    public final C6144j q() {
        return this.f31143j;
    }

    public final int r() {
        return this.f31134a.c();
    }

    public final int s() {
        return this.f31134a.f();
    }

    public final LazyLayoutItemAnimator<x> t() {
        return this.f31153t;
    }

    public final int u() {
        return this.f31135b.getValue().m().b().length;
    }

    public final p v() {
        return this.f31136c;
    }

    public final q w() {
        return this.f31135b.getValue();
    }

    public final C4899r0<C16807N> x() {
        return this.f31155v;
    }

    public final m y() {
        return this.f31151r;
    }

    public final C17974j z() {
        return (C17974j) this.f31134a.e().getValue();
    }

    public C6192E(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11}, (P) null);
    }
}
