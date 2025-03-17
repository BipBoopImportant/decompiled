package x0;

import E1.c0;
import E1.d0;
import U0.A1;
import U0.C4877g1;
import U0.C4894o0;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.d;
import dI.C17164e;
import eI.C17187b;
import g1.C5342k;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import m0.C5548j;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import p0.C5678A;
import p0.C5681D;
import p0.C5682E;
import p0.v;
import pI.C17752b;
import r0.m;
import tI.C17974j;
import tI.C17978n;
import v0.C6131E;
import v0.C6136b;
import v0.C6142h;
import v0.C6144j;
import v0.L;
import v0.P;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\"\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u0004H@¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u000e*\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0007¢\u0006\u0004\b)\u0010*J'\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010.J2\u00101\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u00042\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040/H@¢\u0006\u0004\b1\u00102J<\u00109\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e06\u0012\u0006\u0012\u0004\u0018\u00010705H@¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\rJ!\u0010=\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010<\u001a\u00020\u0018H\u0000¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bC\u0010DR1\u0010M\u001a\u00020E2\u0006\u0010F\u001a\u00020E8@@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Z\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR$\u0010\\\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u000e¢\u0006\f\n\u0004\b;\u0010W\u001a\u0004\b[\u0010YR\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010^R\u0016\u0010a\u001a\u00020]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010?R\u0016\u0010e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010?R\u0014\u0010h\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010k\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u000e¢\u0006\f\n\u0004\bi\u0010W\u001a\u0004\bj\u0010YR\u0016\u0010m\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010WR\"\u0010q\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010\f\u001a\u0004\bn\u0010\u001c\"\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010WR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010uR\u0016\u0010x\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010\fR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00110y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010HR$\u0010\u0001\u001a\u00020{8\u0000@\u0000X\u000e¢\u0006\u0013\n\u0004\b!\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b\u0015\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R1\u0010\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0002¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010Y\"\u0006\b\u0001\u0010\u0001R1\u0010\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0002¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010Y\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020\u00028FX\u0002¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010YR\u001e\u0010(\u001a\u00020\u00028FX\u0002¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010YR\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b}\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\bX\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010£\u0001\u001a\u00030 \u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b[\u0010¡\u0001\u001a\u0006\b\u0001\u0010¢\u0001R7\u0010©\u0001\u001a\u0005\u0018\u00010¤\u00012\t\u0010F\u001a\u0005\u0018\u00010¤\u00018@@BX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010H\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R \u0010¯\u0001\u001a\u00030ª\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001R-\u0010´\u0001\u001a\u00030°\u00018\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b±\u0001\u0010^\u001a\u0005\b²\u0001\u0010J\"\u0005\b³\u0001\u0010LR \u0010º\u0001\u001a\u00030µ\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R%\u0010¿\u0001\u001a\u00030»\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b¼\u0001\u0010H\u001a\u0006\b½\u0001\u0010¾\u0001R$\u0010À\u0001\u001a\u00030»\u00018\u0000X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\b?\u0010H\u001a\u0006\b¶\u0001\u0010¾\u0001R.\u0010Ã\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0002¢\u0006\u0014\n\u0005\bÁ\u0001\u0010H\u001a\u0004\bV\u0010\u001c\"\u0005\bÂ\u0001\u0010pR.\u0010Æ\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0002¢\u0006\u0014\n\u0005\bÄ\u0001\u0010H\u001a\u0004\bS\u0010\u001c\"\u0005\bÅ\u0001\u0010pR\u001b\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180y8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010HR\u001b\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180y8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010HR\u0016\u0010É\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010YR\u0014\u0010Ë\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b±\u0001\u0010Ê\u0001R\u0015\u0010Ì\u0001\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b^\u0010YR\u0016\u0010Í\u0001\u001a\u00020\u00028@X\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010YR\u0015\u0010Î\u0001\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\bW\u0010YR\u0017\u0010Ñ\u0001\u001a\u00020\u00048@X\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0001\u0010YR\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0001\u0010Ð\u0001R!\u0010Ö\u0001\u001a\u00030Ò\u00018@X\u0002¢\u0006\u0010\u001a\u0006\b¼\u0001\u0010Ó\u0001*\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010×\u0001\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001cR\u0016\u0010Ø\u0001\u001a\u00020\u00188VX\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u001c\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ù\u0001"}, d2 = {"Lx0/C;", "Lp0/D;", "", "currentPage", "", "currentPageOffsetFraction", "Lv0/P;", "prefetchScheduler", "<init>", "(IFLv0/P;)V", "(IF)V", "delta", "Z", "(F)F", "LXH/N;", "q", "(LdI/e;)Ljava/lang/Object;", "Lx0/u;", "result", "m0", "(Lx0/u;)V", "s", "(I)I", "scrollDelta", "", "V", "(F)Z", "W", "()Z", "Lx0/n;", "info", "Y", "(FLx0/n;)V", "r", "(Lx0/n;)V", "page", "pageOffsetFraction", "b0", "(IFLdI/e;)Ljava/lang/Object;", "Lp0/A;", "targetPage", "n0", "(Lp0/A;I)V", "offsetFraction", "forceRemeasure", "l0", "(IFZ)V", "Lm0/i;", "animationSpec", "m", "(IFLm0/i;LdI/e;)Ljava/lang/Object;", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "LdI/e;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "e", "visibleItemsStayedTheSame", "o", "(Lx0/u;Z)V", "F", "(I)F", "Lx0/r;", "itemProvider", "X", "(Lx0/r;I)I", "Lo1/g;", "<set-?>", "a", "LU0/r0;", "U", "()J", "k0", "(J)V", "upDownDifference", "Lv0/h;", "b", "Lv0/h;", "animatedScrollScope", "Lx0/x;", "c", "Lx0/x;", "scrollPosition", "d", "I", "y", "()I", "firstVisiblePage", "z", "firstVisiblePageOffset", "", "J", "maxScrollOffset", "g", "minScrollOffset", "h", "accumulator", "i", "previousPassDelta", "j", "Lp0/D;", "scrollableState", "k", "getLayoutWithMeasurement$foundation_release", "layoutWithMeasurement", "l", "layoutWithoutMeasurement", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "n", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "p", "wasPrefetchingForward", "LU0/r0;", "pagerLayoutInfoState", "Lc2/d;", "Lc2/d;", "x", "()Lc2/d;", "f0", "(Lc2/d;)V", "density", "Lr0/m;", "Lr0/m;", "A", "()Lr0/m;", "internalInteractionSource", "t", "LU0/o0;", "O", "h0", "(I)V", "programmaticScrollTargetPage", "u", "S", "j0", "settledPageState", "v", "LU0/A1;", "R", "settledPage", "w", "T", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "N", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lv0/j;", "Lv0/j;", "()Lv0/j;", "beyondBoundsInfo", "Lv0/b;", "Lv0/b;", "()Lv0/b;", "awaitLayoutModifier", "LE1/c0;", "P", "()LE1/c0;", "i0", "(LE1/c0;)V", "remeasurement", "LE1/d0;", "B", "LE1/d0;", "Q", "()LE1/d0;", "remeasurementModifier", "Lc2/b;", "C", "getPremeasureConstraints-msEJaDk$foundation_release", "g0", "premeasureConstraints", "Lv0/E;", "D", "Lv0/E;", "K", "()Lv0/E;", "pinnedPages", "Lv0/L;", "E", "L", "()LU0/r0;", "placementScopeInvalidator", "measurementScopeInvalidator", "G", "e0", "canScrollForward", "H", "d0", "canScrollBackward", "isLastScrollForwardState", "isLastScrollBackwardState", "pageCount", "()Lx0/n;", "layoutInfo", "pageSpacing", "pageSize", "pageSizeWithSpacing", "M", "()F", "positionThresholdFraction", "LtI/j;", "()LtI/j;", "getNearestRange$foundation_release$delegate", "(Lx0/C;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.C  reason: case insensitive filesystem */
public abstract class C6230C implements C5681D {

    /* renamed from: A  reason: collision with root package name */
    private final C4899r0 f31556A;

    /* renamed from: B  reason: collision with root package name */
    private final d0 f31557B;

    /* renamed from: C  reason: collision with root package name */
    private long f31558C;

    /* renamed from: D  reason: collision with root package name */
    private final C6131E f31559D;

    /* renamed from: E  reason: collision with root package name */
    private final C4899r0<C16807N> f31560E;

    /* renamed from: F  reason: collision with root package name */
    private final C4899r0<C16807N> f31561F;

    /* renamed from: G  reason: collision with root package name */
    private final C4899r0 f31562G;

    /* renamed from: H  reason: collision with root package name */
    private final C4899r0 f31563H;

    /* renamed from: I  reason: collision with root package name */
    private final C4899r0<Boolean> f31564I;

    /* renamed from: J  reason: collision with root package name */
    private final C4899r0<Boolean> f31565J;

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f31566a;

    /* renamed from: b  reason: collision with root package name */
    private final C6142h f31567b;

    /* renamed from: c  reason: collision with root package name */
    private final x f31568c;

    /* renamed from: d  reason: collision with root package name */
    private int f31569d;

    /* renamed from: e  reason: collision with root package name */
    private int f31570e;

    /* renamed from: f  reason: collision with root package name */
    private long f31571f;

    /* renamed from: g  reason: collision with root package name */
    private long f31572g;

    /* renamed from: h  reason: collision with root package name */
    private float f31573h;

    /* renamed from: i  reason: collision with root package name */
    private float f31574i;

    /* renamed from: j  reason: collision with root package name */
    private final C5681D f31575j;

    /* renamed from: k  reason: collision with root package name */
    private int f31576k;

    /* renamed from: l  reason: collision with root package name */
    private int f31577l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f31578m;

    /* renamed from: n  reason: collision with root package name */
    private int f31579n;

    /* renamed from: o  reason: collision with root package name */
    private d.b f31580o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f31581p;

    /* renamed from: q  reason: collision with root package name */
    private C4899r0<u> f31582q;

    /* renamed from: r  reason: collision with root package name */
    private c2.d f31583r;

    /* renamed from: s  reason: collision with root package name */
    private final m f31584s;

    /* renamed from: t  reason: collision with root package name */
    private final C4894o0 f31585t;

    /* renamed from: u  reason: collision with root package name */
    private final C4894o0 f31586u;

    /* renamed from: v  reason: collision with root package name */
    private final A1 f31587v;

    /* renamed from: w  reason: collision with root package name */
    private final A1 f31588w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f31589x;

    /* renamed from: y  reason: collision with root package name */
    private final C6144j f31590y;

    /* renamed from: z  reason: collision with root package name */
    private final C6136b f31591z;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {605, 613}, m = "animateScrollToPage")
    /* renamed from: x0.C$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f31592c;

        /* renamed from: d  reason: collision with root package name */
        Object f31593d;

        /* renamed from: e  reason: collision with root package name */
        int f31594e;

        /* renamed from: f  reason: collision with root package name */
        float f31595f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31596g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6230C f31597h;

        /* renamed from: i  reason: collision with root package name */
        int f31598i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6230C c10, C17164e<? super a> eVar) {
            super(eVar);
            this.f31597h = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31596g = obj;
            this.f31598i |= Integer.MIN_VALUE;
            return this.f31597h.m(0, 0.0f, (C5546i<Float>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp0/A;", "", "it", "LXH/N;", "a", "(Lp0/A;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.C$b */
    static final class b extends C17544u implements p<C5678A, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6230C c10) {
            super(2);
            this.f31599c = c10;
        }

        public final void a(C5678A a10, int i10) {
            this.f31599c.n0(a10, i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C5678A) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x0/C$c", "LE1/d0;", "LE1/c0;", "remeasurement", "LXH/N;", "m", "(LE1/c0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.C$c */
    public static final class c implements d0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f31600d;

        c(C6230C c10) {
            this.f31600d = c10;
        }

        public void m(c0 c0Var) {
            this.f31600d.i0(c0Var);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {629, 634}, m = "scroll$suspendImpl")
    /* renamed from: x0.C$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f31601c;

        /* renamed from: d  reason: collision with root package name */
        Object f31602d;

        /* renamed from: e  reason: collision with root package name */
        Object f31603e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f31604f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6230C f31605g;

        /* renamed from: h  reason: collision with root package name */
        int f31606h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6230C c10, C17164e<? super d> eVar) {
            super(eVar);
            this.f31605g = c10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31604f = obj;
            this.f31606h |= Integer.MIN_VALUE;
            return C6230C.a0(this.f31605g, (C5589L) null, (p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {498}, m = "invokeSuspend")
    /* renamed from: x0.C$e */
    static final class e extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f31607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f31608d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f31609e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31610f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6230C c10, float f10, int i10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f31608d = c10;
            this.f31609e = f10;
            this.f31610f = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f31608d, this.f31609e, this.f31610f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((e) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f31607c;
            if (i10 == 0) {
                y.b(obj);
                C6230C c10 = this.f31608d;
                this.f31607c = 1;
                if (c10.q(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f11 = this.f31609e;
            double d10 = (double) f11;
            boolean z10 = false;
            if (-0.5d <= d10 && d10 <= 0.5d) {
                z10 = true;
            }
            if (z10) {
                this.f31608d.l0(this.f31608d.s(this.f31610f), this.f31609e, true);
                return C16807N.f139792a;
            }
            throw new IllegalArgumentException(("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.C$f */
    static final class f extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31611c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C6230C c10) {
            super(1);
            this.f31611c = c10;
        }

        public final Float a(float f10) {
            return Float.valueOf(this.f31611c.Z(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.C$g */
    static final class g extends C17544u implements C17631a<Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C6230C c10) {
            super(0);
            this.f31612c = c10;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(this.f31612c.b() ? this.f31612c.S() : this.f31612c.v());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.C$h */
    static final class h extends C17544u implements C17631a<Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31613c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C6230C c10) {
            super(0);
            this.f31613c = c10;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(this.f31613c.s(!this.f31613c.b() ? this.f31613c.v() : this.f31613c.O() != -1 ? this.f31613c.O() : Math.abs(this.f31613c.w()) >= Math.abs(this.f31613c.M()) ? this.f31613c.B() ? this.f31613c.y() + 1 : this.f31613c.y() : this.f31613c.v()));
        }
    }

    public C6230C() {
        this(0, 0.0f, (P) null, 7, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final int O() {
        return this.f31585t.e();
    }

    /* access modifiers changed from: private */
    public final int S() {
        return this.f31586u.e();
    }

    private final boolean V(float f10) {
        if (C().a() != v.Vertical ? Math.signum(f10) != Math.signum(-C5667g.m(U())) : Math.signum(f10) != Math.signum(-C5667g.n(U()))) {
            return W();
        }
    }

    private final boolean W() {
        return ((int) C5667g.m(U())) == 0 && ((int) C5667g.n(U())) == 0;
    }

    private final void Y(float f10, n nVar) {
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (this.f31578m && !nVar.i().isEmpty()) {
            boolean z10 = f10 > 0.0f;
            int index = z10 ? ((C6238f) C16877v.I0(nVar.i())).getIndex() + nVar.k() + 1 : (((C6238f) C16877v.w0(nVar.i())).getIndex() - nVar.k()) - 1;
            if (index >= 0 && index < G()) {
                if (index != this.f31579n) {
                    if (!(this.f31581p == z10 || (bVar3 = this.f31580o) == null)) {
                        bVar3.cancel();
                    }
                    this.f31581p = z10;
                    this.f31579n = index;
                    this.f31580o = this.f31589x.e(index, this.f31558C);
                }
                if (z10) {
                    if (((float) ((((C6238f) C16877v.I0(nVar.i())).c() + (nVar.g() + nVar.j())) - nVar.e())) < f10 && (bVar2 = this.f31580o) != null) {
                        bVar2.a();
                    }
                } else if (((float) (nVar.h() - ((C6238f) C16877v.w0(nVar.i())).c())) < (-f10) && (bVar = this.f31580o) != null) {
                    bVar.a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final float Z(float f10) {
        long a10 = y.a(this);
        float f11 = this.f31573h + f10;
        long g10 = C17752b.g(f11);
        this.f31573h = f11 - ((float) g10);
        if (Math.abs(f10) < 1.0E-4f) {
            return f10;
        }
        long j10 = g10 + a10;
        long o10 = C17978n.o(j10, this.f31572g, this.f31571f);
        int i10 = (j10 > o10 ? 1 : (j10 == o10 ? 0 : -1));
        boolean z10 = false;
        boolean z11 = i10 != 0;
        long j11 = o10 - a10;
        float f12 = (float) j11;
        this.f31574i = f12;
        if (Math.abs(j11) != 0) {
            this.f31564I.setValue(Boolean.valueOf(f12 > 0.0f));
            C4899r0<Boolean> r0Var = this.f31565J;
            if (f12 < 0.0f) {
                z10 = true;
            }
            r0Var.setValue(Boolean.valueOf(z10));
        }
        u value = this.f31582q.getValue();
        int i11 = (int) j11;
        if (value.s(-i11)) {
            o(value, true);
            L.d(this.f31560E);
            this.f31577l++;
        } else {
            this.f31568c.a(i11);
            c0 P10 = P();
            if (P10 != null) {
                P10.g();
            }
            this.f31576k++;
        }
        return (z11 ? Long.valueOf(j11) : Float.valueOf(f10)).floatValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.p<? super p0.A, ? super dI.e<? super XH.N>, ? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: n0.L} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object a0(x0.C6230C r5, n0.C5589L r6, nI.p<? super p0.C5678A, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            boolean r0 = r8 instanceof x0.C6230C.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            x0.C$d r0 = (x0.C6230C.d) r0
            int r1 = r0.f31606h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31606h = r1
            goto L_0x0018
        L_0x0013:
            x0.C$d r0 = new x0.C$d
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31604f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f31606h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r5 = r0.f31601c
            x0.C r5 = (x0.C6230C) r5
            XH.y.b(r8)
            goto L_0x007b
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            java.lang.Object r5 = r0.f31603e
            r7 = r5
            nI.p r7 = (nI.p) r7
            java.lang.Object r5 = r0.f31602d
            r6 = r5
            n0.L r6 = (n0.C5589L) r6
            java.lang.Object r5 = r0.f31601c
            x0.C r5 = (x0.C6230C) r5
            XH.y.b(r8)
            goto L_0x005c
        L_0x004a:
            XH.y.b(r8)
            r0.f31601c = r5
            r0.f31602d = r6
            r0.f31603e = r7
            r0.f31606h = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            boolean r8 = r5.b()
            if (r8 != 0) goto L_0x0069
            int r8 = r5.v()
            r5.j0(r8)
        L_0x0069:
            p0.D r8 = r5.f31575j
            r0.f31601c = r5
            r2 = 0
            r0.f31602d = r2
            r0.f31603e = r2
            r0.f31606h = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r6 = -1
            r5.h0(r6)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C6230C.a0(x0.C, n0.L, nI.p, dI.e):java.lang.Object");
    }

    public static /* synthetic */ Object c0(C6230C c10, int i10, float f10, C17164e eVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            return c10.b0(i10, f10, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    private final void d0(boolean z10) {
        this.f31563H.setValue(Boolean.valueOf(z10));
    }

    private final void e0(boolean z10) {
        this.f31562G.setValue(Boolean.valueOf(z10));
    }

    private final void h0(int i10) {
        this.f31585t.g(i10);
    }

    /* access modifiers changed from: private */
    public final void i0(c0 c0Var) {
        this.f31556A.setValue(c0Var);
    }

    private final void j0(int i10) {
        this.f31586u.g(i10);
    }

    private final void m0(u uVar) {
        C5342k.a aVar = C5342k.f23395e;
        C5342k d10 = aVar.d();
        C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
        C5342k f10 = aVar.f(d10);
        try {
            if (Math.abs(this.f31574i) > 0.5f && this.f31578m && V(this.f31574i)) {
                Y(this.f31574i, uVar);
            }
            C16807N n10 = C16807N.f139792a;
            aVar.n(d10, f10, h10);
        } catch (Throwable th2) {
            aVar.n(d10, f10, h10);
            throw th2;
        }
    }

    public static /* synthetic */ Object n(C6230C c10, int i10, float f10, C5546i iVar, C17164e eVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                iVar = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
            }
            return c10.m(i10, f10, iVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    public static /* synthetic */ void p(C6230C c10, u uVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            c10.o(uVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
    }

    /* access modifiers changed from: private */
    public final Object q(C17164e<? super C16807N> eVar) {
        Object a10 = this.f31591z.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    private final void r(n nVar) {
        if (this.f31579n != -1 && !nVar.i().isEmpty()) {
            if (this.f31579n != (this.f31581p ? ((C6238f) C16877v.I0(nVar.i())).getIndex() + nVar.k() + 1 : (((C6238f) C16877v.w0(nVar.i())).getIndex() - nVar.k()) - 1)) {
                this.f31579n = -1;
                d.b bVar = this.f31580o;
                if (bVar != null) {
                    bVar.cancel();
                }
                this.f31580o = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final int s(int i10) {
        if (G() > 0) {
            return C17978n.m(i10, 0, G() - 1);
        }
        return 0;
    }

    public final m A() {
        return this.f31584s;
    }

    public boolean B() {
        return this.f31564I.getValue().booleanValue();
    }

    public final n C() {
        return this.f31582q.getValue();
    }

    public final C4899r0<C16807N> D() {
        return this.f31561F;
    }

    public final C17974j E() {
        return (C17974j) this.f31568c.d().getValue();
    }

    public final float F(int i10) {
        if (i10 >= 0 && i10 <= G()) {
            return ((float) (i10 - v())) - w();
        }
        throw new IllegalArgumentException(("page " + i10 + " is not within the range 0 to " + G()).toString());
    }

    public abstract int G();

    public final int H() {
        return this.f31582q.getValue().g();
    }

    public final int I() {
        return H() + J();
    }

    public final int J() {
        return this.f31582q.getValue().j();
    }

    public final C6131E K() {
        return this.f31559D;
    }

    public final C4899r0<C16807N> L() {
        return this.f31560E;
    }

    public final float M() {
        return Math.min(this.f31583r.H1(C6231D.i()), ((float) H()) / 2.0f) / ((float) H());
    }

    public final androidx.compose.foundation.lazy.layout.d N() {
        return this.f31589x;
    }

    public final c0 P() {
        return (c0) this.f31556A.getValue();
    }

    public final d0 Q() {
        return this.f31557B;
    }

    public final int R() {
        return ((Number) this.f31587v.getValue()).intValue();
    }

    public final int T() {
        return ((Number) this.f31588w.getValue()).intValue();
    }

    public final long U() {
        return ((C5667g) this.f31566a.getValue()).v();
    }

    public final int X(r rVar, int i10) {
        return this.f31568c.e(rVar, i10);
    }

    public boolean b() {
        return this.f31575j.b();
    }

    public final Object b0(int i10, float f10, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this, (C5589L) null, new e(this, f10, i10, (C17164e<? super e>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final boolean c() {
        return ((Boolean) this.f31563H.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.f31562G.getValue()).booleanValue();
    }

    public float e(float f10) {
        return this.f31575j.e(f10);
    }

    public Object f(C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        return a0(this, l10, pVar, eVar);
    }

    public final void f0(c2.d dVar) {
        this.f31583r = dVar;
    }

    public final void g0(long j10) {
        this.f31558C = j10;
    }

    public final void k0(long j10) {
        this.f31566a.setValue(C5667g.d(j10));
    }

    public final void l0(int i10, float f10, boolean z10) {
        this.f31568c.f(i10, f10);
        if (z10) {
            c0 P10 = P();
            if (P10 != null) {
                P10.g();
                return;
            }
            return;
        }
        L.d(this.f31561F);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(int r10, float r11, m0.C5546i<java.lang.Float> r12, dI.C17164e<? super XH.C16807N> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof x0.C6230C.a
            if (r0 == 0) goto L_0x0014
            r0 = r13
            x0.C$a r0 = (x0.C6230C.a) r0
            int r1 = r0.f31598i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f31598i = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            x0.C$a r0 = new x0.C$a
            r0.<init>(r9, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r6.f31596g
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r6.f31598i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            XH.y.b(r13)
            goto L_0x00a5
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            float r11 = r6.f31595f
            int r10 = r6.f31594e
            java.lang.Object r12 = r6.f31593d
            m0.i r12 = (m0.C5546i) r12
            java.lang.Object r1 = r6.f31592c
            x0.C r1 = (x0.C6230C) r1
            XH.y.b(r13)
        L_0x0046:
            r4 = r12
            goto L_0x0076
        L_0x0048:
            XH.y.b(r13)
            int r13 = r9.v()
            if (r10 != r13) goto L_0x005a
            float r13 = r9.w()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            int r13 = r9.G()
            if (r13 != 0) goto L_0x0063
        L_0x0060:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x0063:
            r6.f31592c = r9
            r6.f31593d = r12
            r6.f31594e = r10
            r6.f31595f = r11
            r6.f31598i = r3
            java.lang.Object r13 = r9.q(r6)
            if (r13 != r0) goto L_0x0074
            return r0
        L_0x0074:
            r1 = r9
            goto L_0x0046
        L_0x0076:
            double r12 = (double) r11
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x00a8
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x00a8
            int r10 = r1.s(r10)
            int r12 = r1.I()
            float r12 = (float) r12
            float r3 = r11 * r12
            v0.h r11 = r1.f31567b
            x0.C$b r5 = new x0.C$b
            r5.<init>(r1)
            r12 = 0
            r6.f31592c = r12
            r6.f31593d = r12
            r6.f31598i = r2
            r1 = r11
            r2 = r10
            java.lang.Object r10 = x0.C6231D.d(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00a8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "pageOffsetFraction "
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = " is not within the range -0.5 to 0.5"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C6230C.m(int, float, m0.i, dI.e):java.lang.Object");
    }

    public final void n0(C5678A a10, int i10) {
        h0(s(i10));
    }

    public final void o(u uVar, boolean z10) {
        if (z10) {
            this.f31568c.j(uVar.p());
        } else {
            this.f31568c.k(uVar);
            r(uVar);
        }
        this.f31582q.setValue(uVar);
        e0(uVar.n());
        d0(uVar.m());
        C6237e q10 = uVar.q();
        if (q10 != null) {
            this.f31569d = q10.getIndex();
        }
        this.f31570e = uVar.r();
        m0(uVar);
        this.f31571f = C6231D.g(uVar, G());
        this.f31572g = C6231D.h(uVar, G());
    }

    public final C6136b t() {
        return this.f31591z;
    }

    public final C6144j u() {
        return this.f31590y;
    }

    public final int v() {
        return this.f31568c.b();
    }

    public final float w() {
        return this.f31568c.c();
    }

    public final c2.d x() {
        return this.f31583r;
    }

    public final int y() {
        return this.f31569d;
    }

    public final int z() {
        return this.f31570e;
    }

    public C6230C(int i10, float f10, P p10) {
        double d10 = (double) f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        this.f31566a = u1.e(C5667g.d(C5667g.f26701b.c()), (o1) null, 2, (Object) null);
        this.f31567b = q.a(this);
        x xVar = new x(i10, f10, this);
        this.f31568c = xVar;
        this.f31569d = i10;
        this.f31571f = Long.MAX_VALUE;
        this.f31575j = C5682E.a(new f(this));
        this.f31578m = true;
        this.f31579n = -1;
        this.f31582q = p1.i(C6231D.j(), p1.k());
        this.f31583r = C6231D.f31616c;
        this.f31584s = r0.l.a();
        this.f31585t = C4877g1.a(-1);
        this.f31586u = C4877g1.a(i10);
        this.f31587v = p1.d(p1.s(), new g(this));
        this.f31588w = p1.d(p1.s(), new h(this));
        this.f31589x = new androidx.compose.foundation.lazy.layout.d(p10, (C17642l) null, 2, (DefaultConstructorMarker) null);
        this.f31590y = new C6144j();
        this.f31591z = new C6136b();
        this.f31556A = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f31557B = new c(this);
        this.f31558C = c2.c.b(0, 0, 0, 0, 15, (Object) null);
        this.f31559D = new C6131E();
        xVar.d();
        this.f31560E = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        this.f31561F = L.c((C4899r0) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f31562G = u1.e(bool, (o1) null, 2, (Object) null);
        this.f31563H = u1.e(bool, (o1) null, 2, (Object) null);
        this.f31564I = u1.e(bool, (o1) null, 2, (Object) null);
        this.f31565J = u1.e(bool, (o1) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6230C(int i10, float f10, P p10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? null : p10);
    }

    public C6230C(int i10, float f10) {
        this(i10, f10, (P) null);
    }
}
