package androidx.compose.foundation.lazy.layout;

import G1.C4515s;
import G1.V;
import G1.r;
import QJ.Q;
import XH.C16807N;
import androidx.compose.ui.d;
import bI.C17035a;
import c2.C5267b;
import c2.n;
import c2.s;
import j0.N;
import j0.O;
import j0.Y;
import j0.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import p1.H0;
import r1.C5817c;
import s1.C5905c;
import s1.C5906d;
import v0.C6143i;
import v0.C6151q;
import v0.z;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003X36B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\b\u0002\u0010\u000e\u001a\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0005J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b0\u00101R*\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020/0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0017\u0010P\u001a\u00020M8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bJ\u0010OR\u0018\u0010R\u001a\u00020\u0011*\u00028\u00008BX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010QR\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010SR\u0018\u0010T\u001a\u00020\u000b*\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010SR\u0017\u0010W\u001a\u00020U8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010V\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lv0/z;", "T", "", "<init>", "()V", "key", "LXH/N;", "n", "(Ljava/lang/Object;)V", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "itemInfo", "k", "(Lv0/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V", "", "isMovingAway", "p", "(Lv0/z;Z)V", "", "r", "([ILv0/z;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "Lv0/A;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "LQJ/Q;", "coroutineScope", "Lp1/H0;", "graphicsContext", "m", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;Lv0/A;ZZIZIILQJ/Q;Lp1/H0;)V", "o", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/b;", "e", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;", "Lj0/N;", "a", "Lj0/N;", "keyToItemInfoMap", "b", "Landroidx/compose/foundation/lazy/layout/c;", "c", "I", "firstVisibleIndex", "Lj0/O;", "d", "Lj0/O;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", "i", "disappearingItems", "LG1/r;", "j", "LG1/r;", "displayingNode", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "(Lv0/z;)Z", "hasAnimations", "(Lv0/z;)I", "crossAxisOffset", "Lc2/r;", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutItemAnimator<T extends z> {

    /* renamed from: a  reason: collision with root package name */
    private final N<Object, LazyLayoutItemAnimator<T>.defpackage.b> f18259a = Y.d();

    /* renamed from: b  reason: collision with root package name */
    private c f18260b;

    /* renamed from: c  reason: collision with root package name */
    private int f18261c;

    /* renamed from: d  reason: collision with root package name */
    private final O<Object> f18262d = a0.a();

    /* renamed from: e  reason: collision with root package name */
    private final List<T> f18263e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<T> f18264f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<T> f18265g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<T> f18266h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final List<b> f18267i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r f18268j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.compose.ui.d f18269k = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LG1/V;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "c", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DisplayingDisappearingItemsElement extends V<a> {

        /* renamed from: d  reason: collision with root package name */
        private final LazyLayoutItemAnimator<?> f18270d;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f18270d = lazyLayoutItemAnimator;
        }

        /* renamed from: c */
        public a a() {
            return new a(this.f18270d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && C17542s.e(this.f18270d, ((DisplayingDisappearingItemsElement) obj).f18270d);
        }

        /* renamed from: f */
        public void b(a aVar) {
            aVar.C2(this.f18270d);
        }

        public int hashCode() {
            return this.f18270d.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f18270d + ')';
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/ui/d$c;", "LG1/r;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "Lr1/c;", "LXH/N;", "z", "(Lr1/c;)V", "m2", "()V", "n2", "C2", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends d.c implements r {

        /* renamed from: n  reason: collision with root package name */
        private LazyLayoutItemAnimator<?> f18271n;

        public a(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f18271n = lazyLayoutItemAnimator;
        }

        public final void C2(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (!C17542s.e(this.f18271n, lazyLayoutItemAnimator) && E0().j2()) {
                this.f18271n.o();
                lazyLayoutItemAnimator.f18268j = this;
                this.f18271n = lazyLayoutItemAnimator;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f18271n, ((a) obj).f18271n);
        }

        public int hashCode() {
            return this.f18271n.hashCode();
        }

        public void m2() {
            this.f18271n.f18268j = this;
        }

        public void n2() {
            this.f18271n.o();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f18271n + ')';
        }

        public void z(C5817c cVar) {
            List b10 = this.f18271n.f18267i;
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) b10.get(i10);
                C5905c p10 = bVar.p();
                if (p10 != null) {
                    float h10 = ((float) n.h(bVar.o())) - ((float) n.h(p10.w()));
                    float i11 = ((float) n.i(bVar.o())) - ((float) n.i(p10.w()));
                    cVar.I1().c().d(h10, i11);
                    try {
                        C5906d.a(cVar, p10);
                    } finally {
                        cVar.I1().c().d(-h10, -i11);
                    }
                }
            }
            cVar.V1();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010.\u001a\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "LQJ/Q;", "coroutineScope", "Lp1/H0;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "LXH/N;", "k", "(Lv0/z;LQJ/Q;Lp1/H0;III)V", "", "Landroidx/compose/foundation/lazy/layout/b;", "<set-?>", "a", "[Landroidx/compose/foundation/lazy/layout/b;", "()[Landroidx/compose/foundation/lazy/layout/b;", "animations", "Lc2/b;", "b", "Lc2/b;", "()Lc2/b;", "setConstraints-_Sx5XlM", "(Lc2/b;)V", "constraints", "c", "I", "()I", "setCrossAxisOffset", "(I)V", "d", "i", "lane", "e", "g", "j", "span", "f", "", "h", "()Z", "isRunningPlacement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private b[] f18272a = C6151q.f30916a;

        /* renamed from: b  reason: collision with root package name */
        private C5267b f18273b;

        /* renamed from: c  reason: collision with root package name */
        private int f18274c;

        /* renamed from: d  reason: collision with root package name */
        private int f18275d;

        /* renamed from: e  reason: collision with root package name */
        private int f18276e = 1;

        /* renamed from: f  reason: collision with root package name */
        private int f18277f;

        /* renamed from: g  reason: collision with root package name */
        private int f18278g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv0/z;", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator<T> f18280c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f18280c = lazyLayoutItemAnimator;
            }

            public final void invoke() {
                r c10 = this.f18280c.f18268j;
                if (c10 != null) {
                    C4515s.a(c10);
                }
            }
        }

        public b() {
        }

        private final boolean h() {
            for (b bVar : this.f18272a) {
                if (bVar != null && bVar.x()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, z zVar, Q q10, H0 h02, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.f(zVar);
            }
            bVar.k(zVar, q10, h02, i10, i11, i12);
        }

        public final b[] a() {
            return this.f18272a;
        }

        public final C5267b b() {
            return this.f18273b;
        }

        public final int c() {
            return this.f18274c;
        }

        public final int d() {
            return this.f18275d;
        }

        public final int e() {
            return this.f18278g;
        }

        public final int f() {
            return this.f18277f;
        }

        public final int g() {
            return this.f18276e;
        }

        public final void i(int i10) {
            this.f18275d = i10;
        }

        public final void j(int i10) {
            this.f18276e = i10;
        }

        public final void k(T t10, Q q10, H0 h02, int i10, int i11, int i12) {
            if (!h()) {
                this.f18277f = i10;
                this.f18278g = i11;
            }
            int length = this.f18272a.length;
            for (int d10 = t10.d(); d10 < length; d10++) {
                b bVar = this.f18272a[d10];
                if (bVar != null) {
                    bVar.y();
                }
            }
            if (this.f18272a.length != t10.d()) {
                Object[] copyOf = Arrays.copyOf(this.f18272a, t10.d());
                C17542s.i(copyOf, "copyOf(this, newSize)");
                this.f18272a = (b[]) copyOf;
            }
            this.f18273b = C5267b.a(t10.b());
            this.f18274c = i12;
            this.f18275d = t10.n();
            this.f18276e = t10.f();
            int d11 = t10.d();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i13 = 0; i13 < d11; i13++) {
                C6143i b10 = C6151q.c(t10.l(i13));
                if (b10 == null) {
                    b bVar2 = this.f18272a[i13];
                    if (bVar2 != null) {
                        bVar2.y();
                    }
                    this.f18272a[i13] = null;
                } else {
                    b bVar3 = this.f18272a[i13];
                    if (bVar3 == null) {
                        bVar3 = new b(q10, h02, new a(lazyLayoutItemAnimator));
                        this.f18272a[i13] = bVar3;
                    }
                    bVar3.C(b10.C2());
                    bVar3.I(b10.E2());
                    bVar3.D(b10.D2());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18281a;

        public c(c cVar) {
            this.f18281a = cVar;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(this.f18281a.c(((z) t10).getKey())), Integer.valueOf(this.f18281a.c(((z) t11).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18282a;

        public d(c cVar) {
            this.f18282a = cVar;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(this.f18282a.c(((z) t10).getKey())), Integer.valueOf(this.f18282a.c(((z) t11).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18283a;

        public e(c cVar) {
            this.f18283a = cVar;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(this.f18283a.c(((z) t11).getKey())), Integer.valueOf(this.f18283a.c(((z) t10).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18284a;

        public f(c cVar) {
            this.f18284a = cVar;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(this.f18284a.c(((z) t11).getKey())), Integer.valueOf(this.f18284a.c(((z) t10).getKey())));
        }
    }

    /* access modifiers changed from: private */
    public final int f(z zVar) {
        long m10 = zVar.m(0);
        return !zVar.h() ? n.i(m10) : n.h(m10);
    }

    private final boolean g(T t10) {
        int d10 = t10.d();
        for (int i10 = 0; i10 < d10; i10++) {
            if (C6151q.c(t10.l(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(z zVar) {
        long m10 = zVar.m(0);
        return zVar.h() ? n.i(m10) : n.h(m10);
    }

    private final void k(T t10, int i10, LazyLayoutItemAnimator<T>.defpackage.b bVar) {
        int i11 = 0;
        long m10 = t10.m(0);
        long e10 = t10.h() ? n.e(m10, 0, i10, 1, (Object) null) : n.e(m10, i10, 0, 2, (Object) null);
        b[] a10 = bVar.a();
        int length = a10.length;
        int i12 = 0;
        while (i11 < length) {
            b bVar2 = a10[i11];
            int i13 = i12 + 1;
            if (bVar2 != null) {
                bVar2.J(n.l(e10, n.k(t10.m(i12), m10)));
            }
            i11++;
            i12 = i13;
        }
    }

    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.defpackage.b c10 = lazyLayoutItemAnimator.f18259a.c(zVar.getKey());
            C17542s.g(c10);
            bVar = c10;
        }
        lazyLayoutItemAnimator.k(zVar, i10, bVar);
    }

    private final void n(Object obj) {
        b[] a10;
        b p10 = this.f18259a.p(obj);
        if (p10 != null && (a10 = p10.a()) != null) {
            for (b bVar : a10) {
                if (bVar != null) {
                    bVar.y();
                }
            }
        }
    }

    private final void p(T t10, boolean z10) {
        LazyLayoutItemAnimator<T>.defpackage.b c10 = this.f18259a.c(t10.getKey());
        C17542s.g(c10);
        b[] a10 = c10.a();
        int length = a10.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b bVar = a10[i10];
            int i12 = i11 + 1;
            if (bVar != null) {
                long m10 = t10.m(i11);
                long s10 = bVar.s();
                if (!n.g(s10, b.f18292s.a()) && !n.g(s10, m10)) {
                    bVar.m(n.k(m10, s10), z10);
                }
                bVar.J(m10);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void q(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.p(zVar, z10);
    }

    private final int r(int[] iArr, T t10) {
        int n10 = t10.n();
        int f10 = t10.f() + n10;
        int i10 = 0;
        while (n10 < f10) {
            int k10 = iArr[n10] + t10.k();
            iArr[n10] = k10;
            i10 = Math.max(i10, k10);
            n10++;
        }
        return i10;
    }

    public final b e(Object obj, int i10) {
        b[] a10;
        b c10 = this.f18259a.c(obj);
        if (c10 == null || (a10 = c10.a()) == null) {
            return null;
        }
        return a10[i10];
    }

    public final long i() {
        long a10 = c2.r.f23053b.a();
        List<b> list = this.f18267i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            C5905c p10 = bVar.p();
            if (p10 != null) {
                a10 = s.a(Math.max(c2.r.h(a10), n.h(bVar.s()) + c2.r.h(p10.v())), Math.max(c2.r.g(a10), n.i(bVar.s()) + c2.r.g(p10.v())));
            }
        }
        return a10;
    }

    public final androidx.compose.ui.d j() {
        return this.f18269k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0416, code lost:
        r12.k(r0, r48, r49, r46, r47, r12.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x042b, code lost:
        if (r13 >= r6.f18261c) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042d, code lost:
        r6.f18265g.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0433, code lost:
        r6.f18266h.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r36, int r37, int r38, java.util.List<T> r39, androidx.compose.foundation.lazy.layout.c r40, v0.C6127A<T> r41, boolean r42, boolean r43, int r44, boolean r45, int r46, int r47, QJ.Q r48, p1.H0 r49) {
        /*
            r35 = this;
            r6 = r35
            r0 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r44
            r12 = 1
            androidx.compose.foundation.lazy.layout.c r13 = r6.f18260b
            r6.f18260b = r10
            int r1 = r39.size()
            r14 = 0
            r2 = r14
        L_0x0019:
            if (r2 >= r1) goto L_0x002a
            java.lang.Object r3 = r9.get(r2)
            v0.z r3 = (v0.z) r3
            boolean r3 = r6.g(r3)
            if (r3 == 0) goto L_0x0028
            goto L_0x0036
        L_0x0028:
            int r2 = r2 + r12
            goto L_0x0019
        L_0x002a:
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r1 = r6.f18259a
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0036
            r35.o()
            return
        L_0x0036:
            int r1 = r6.f18261c
            java.lang.Object r2 = YH.C16877v.y0(r39)
            v0.z r2 = (v0.z) r2
            if (r2 == 0) goto L_0x0045
            int r2 = r2.getIndex()
            goto L_0x0046
        L_0x0045:
            r2 = r14
        L_0x0046:
            r6.f18261c = r2
            if (r42 == 0) goto L_0x004f
            long r2 = c2.o.a(r14, r0)
            goto L_0x0053
        L_0x004f:
            long r2 = c2.o.a(r0, r14)
        L_0x0053:
            if (r43 != 0) goto L_0x005a
            if (r45 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r15 = r14
            goto L_0x005b
        L_0x005a:
            r15 = r12
        L_0x005b:
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r6.f18259a
            java.lang.Object[] r4 = r0.f24569b
            long[] r0 = r0.f24568a
            int r5 = r0.length
            r14 = 2
            int r5 = r5 - r14
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r42 = r15
            if (r5 < 0) goto L_0x00cc
            r12 = 0
        L_0x0074:
            r14 = r0[r12]
            long r7 = ~r14
            long r7 = r7 << r20
            long r7 = r7 & r14
            long r7 = r7 & r21
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L_0x00bb
            int r7 = r12 - r5
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L_0x008a:
            if (r8 >= r7) goto L_0x00b1
            long r24 = r14 & r18
            int r24 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r24 >= 0) goto L_0x00a4
            int r24 = r12 << 3
            int r24 = r24 + r8
            r25 = r0
            r0 = r4[r24]
            r24 = r4
            j0.O<java.lang.Object> r4 = r6.f18262d
            r4.h(r0)
        L_0x00a1:
            r0 = 8
            goto L_0x00a9
        L_0x00a4:
            r25 = r0
            r24 = r4
            goto L_0x00a1
        L_0x00a9:
            long r14 = r14 >> r0
            r4 = 1
            int r8 = r8 + r4
            r4 = r24
            r0 = r25
            goto L_0x008a
        L_0x00b1:
            r25 = r0
            r24 = r4
            r0 = 8
            r4 = 1
            if (r7 != r0) goto L_0x00cc
            goto L_0x00c0
        L_0x00bb:
            r25 = r0
            r24 = r4
            r4 = 1
        L_0x00c0:
            if (r12 == r5) goto L_0x00cc
            int r12 = r12 + r4
            r7 = r37
            r8 = r38
            r4 = r24
            r0 = r25
            goto L_0x0074
        L_0x00cc:
            int r0 = r39.size()
            r4 = 0
        L_0x00d1:
            r7 = -1
            if (r4 >= r0) goto L_0x021b
            java.lang.Object r5 = r9.get(r4)
            v0.z r5 = (v0.z) r5
            j0.O<java.lang.Object> r12 = r6.f18262d
            java.lang.Object r14 = r5.getKey()
            r12.x(r14)
            boolean r12 = r6.g(r5)
            if (r12 == 0) goto L_0x0203
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r12 = r6.f18259a
            java.lang.Object r14 = r5.getKey()
            java.lang.Object r12 = r12.c(r14)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r12 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r12
            if (r13 == 0) goto L_0x0100
            java.lang.Object r14 = r5.getKey()
            int r14 = r13.c(r14)
            goto L_0x0101
        L_0x0100:
            r14 = r7
        L_0x0101:
            if (r14 != r7) goto L_0x0107
            if (r13 == 0) goto L_0x0107
            r15 = 1
            goto L_0x0108
        L_0x0107:
            r15 = 0
        L_0x0108:
            if (r12 != 0) goto L_0x0178
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b
            r8.<init>()
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r8
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r12 = r6.f18259a
            java.lang.Object r7 = r5.getKey()
            r12.s(r7, r8)
            int r7 = r5.getIndex()
            if (r7 == r14) goto L_0x014b
            r7 = -1
            if (r14 == r7) goto L_0x014b
            if (r14 >= r1) goto L_0x0145
            java.util.List<T> r7 = r6.f18263e
            r7.add(r5)
        L_0x013d:
            r26 = r0
            r27 = r13
            r0 = 0
            r9 = 1
            goto L_0x0210
        L_0x0145:
            java.util.List<T> r7 = r6.f18264f
            r7.add(r5)
            goto L_0x013d
        L_0x014b:
            r7 = 0
            long r24 = r5.m(r7)
            boolean r7 = r5.h()
            if (r7 == 0) goto L_0x015b
            int r7 = c2.n.i(r24)
            goto L_0x015f
        L_0x015b:
            int r7 = c2.n.h(r24)
        L_0x015f:
            r6.k(r5, r7, r8)
            if (r15 == 0) goto L_0x013d
            androidx.compose.foundation.lazy.layout.b[] r5 = r8.a()
            int r7 = r5.length
            r8 = 0
        L_0x016a:
            if (r8 >= r7) goto L_0x013d
            r12 = r5[r8]
            if (r12 == 0) goto L_0x0175
            r12.k()
            XH.N r12 = XH.C16807N.f139792a
        L_0x0175:
            r12 = 1
            int r8 = r8 + r12
            goto L_0x016a
        L_0x0178:
            if (r42 == 0) goto L_0x013d
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r12
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.foundation.lazy.layout.b[] r7 = r12.a()
            int r14 = r7.length
            r8 = 0
        L_0x0195:
            if (r8 >= r14) goto L_0x01cf
            r26 = r0
            r0 = r7[r8]
            if (r0 == 0) goto L_0x01be
            long r9 = r0.s()
            androidx.compose.foundation.lazy.layout.b$a r24 = androidx.compose.foundation.lazy.layout.b.f18292s
            r27 = r13
            r28 = r14
            long r13 = r24.a()
            boolean r9 = c2.n.g(r9, r13)
            if (r9 != 0) goto L_0x01bc
            long r9 = r0.s()
            long r9 = c2.n.l(r9, r2)
            r0.J(r9)
        L_0x01bc:
            r0 = 1
            goto L_0x01c3
        L_0x01be:
            r27 = r13
            r28 = r14
            goto L_0x01bc
        L_0x01c3:
            int r8 = r8 + r0
            r9 = r39
            r10 = r40
            r0 = r26
            r13 = r27
            r14 = r28
            goto L_0x0195
        L_0x01cf:
            r26 = r0
            r27 = r13
            if (r15 == 0) goto L_0x01fb
            androidx.compose.foundation.lazy.layout.b[] r0 = r12.a()
            int r7 = r0.length
            r8 = 0
        L_0x01db:
            if (r8 >= r7) goto L_0x01fb
            r9 = r0[r8]
            if (r9 == 0) goto L_0x01f8
            boolean r10 = r9.v()
            if (r10 == 0) goto L_0x01f5
            java.util.List<androidx.compose.foundation.lazy.layout.b> r10 = r6.f18267i
            r10.remove(r9)
            G1.r r10 = r6.f18268j
            if (r10 == 0) goto L_0x01f5
            G1.C4515s.a(r10)
            XH.N r10 = XH.C16807N.f139792a
        L_0x01f5:
            r9.k()
        L_0x01f8:
            r9 = 1
            int r8 = r8 + r9
            goto L_0x01db
        L_0x01fb:
            r9 = 1
            r0 = 0
            r7 = 2
            r8 = 0
            q(r6, r5, r0, r7, r8)
            goto L_0x0210
        L_0x0203:
            r26 = r0
            r27 = r13
            r0 = 0
            r9 = 1
            java.lang.Object r5 = r5.getKey()
            r6.n(r5)
        L_0x0210:
            int r4 = r4 + r9
            r9 = r39
            r10 = r40
            r0 = r26
            r13 = r27
            goto L_0x00d1
        L_0x021b:
            r27 = r13
            r0 = 0
            r9 = 1
            int[] r7 = new int[r11]
            r1 = r0
        L_0x0222:
            if (r1 >= r11) goto L_0x0229
            r7[r1] = r0
            int r1 = r1 + r9
            r0 = 0
            goto L_0x0222
        L_0x0229:
            if (r42 == 0) goto L_0x02df
            if (r27 == 0) goto L_0x02df
            java.util.List<T> r0 = r6.f18263e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0284
            java.util.List<T> r0 = r6.f18263e
            int r1 = r0.size()
            if (r1 <= r9) goto L_0x024a
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$e r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$e
            r8 = r27
            r1.<init>(r8)
            YH.C16877v.C(r0, r1)
            goto L_0x024c
        L_0x024a:
            r8 = r27
        L_0x024c:
            java.util.List<T> r9 = r6.f18263e
            int r10 = r9.size()
            r12 = 0
        L_0x0253:
            if (r12 >= r10) goto L_0x0274
            java.lang.Object r0 = r9.get(r12)
            r13 = r0
            v0.z r13 = (v0.z) r13
            int r0 = r6.r(r7, r13)
            int r2 = r46 - r0
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r35
            r1 = r13
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            q(r6, r13, r0, r1, r2)
            r0 = 1
            int r12 = r12 + r0
            goto L_0x0253
        L_0x0274:
            r32 = 6
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r7
            YH.C16870n.y(r28, r29, r30, r31, r32, r33)
            goto L_0x0286
        L_0x0284:
            r8 = r27
        L_0x0286:
            java.util.List<T> r0 = r6.f18264f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e1
            java.util.List<T> r0 = r6.f18264f
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x02a1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$c r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$c
            r1.<init>(r8)
            YH.C16877v.C(r0, r1)
        L_0x02a1:
            java.util.List<T> r9 = r6.f18264f
            int r10 = r9.size()
            r12 = 0
        L_0x02a8:
            if (r12 >= r10) goto L_0x02cf
            java.lang.Object r0 = r9.get(r12)
            r13 = r0
            v0.z r13 = (v0.z) r13
            int r0 = r6.r(r7, r13)
            int r0 = r47 + r0
            int r1 = r13.k()
            int r2 = r0 - r1
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r35
            r1 = r13
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            q(r6, r13, r0, r1, r2)
            r0 = 1
            int r12 = r12 + r0
            goto L_0x02a8
        L_0x02cf:
            r32 = 6
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r7
            YH.C16870n.y(r28, r29, r30, r31, r32, r33)
            goto L_0x02e1
        L_0x02df:
            r8 = r27
        L_0x02e1:
            j0.O<java.lang.Object> r0 = r6.f18262d
            java.lang.Object[] r1 = r0.f24576b
            long[] r0 = r0.f24575a
            int r2 = r0.length
            r3 = 2
            int r2 = r2 - r3
            if (r2 < 0) goto L_0x0477
            r3 = 0
        L_0x02ed:
            r4 = r0[r3]
            long r9 = ~r4
            long r9 = r9 << r20
            long r9 = r9 & r4
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L_0x045f
            int r9 = r3 - r2
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r14 = 8 - r9
            r9 = 0
        L_0x0303:
            if (r9 >= r14) goto L_0x0451
            long r12 = r4 & r18
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x043b
            int r10 = r3 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r12 = r6.f18259a
            java.lang.Object r12 = r12.c(r10)
            kotlin.jvm.internal.C17542s.g(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r12 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r12
            r15 = r40
            int r13 = r15.c(r10)
            r33 = r0
            int r0 = r12.g()
            int r0 = java.lang.Math.min(r11, r0)
            r12.j(r0)
            int r0 = r12.g()
            int r0 = r11 - r0
            r36 = r1
            int r1 = r12.d()
            int r0 = java.lang.Math.min(r0, r1)
            r12.i(r0)
            r0 = -1
            if (r13 != r0) goto L_0x03c7
            androidx.compose.foundation.lazy.layout.b[] r1 = r12.a()
            int r13 = r1.length
            r0 = 0
            r26 = 0
            r27 = 0
        L_0x034e:
            if (r0 >= r13) goto L_0x03bf
            r11 = r1[r0]
            r23 = 1
            int r28 = r26 + 1
            if (r11 == 0) goto L_0x03b3
            boolean r29 = r11.v()
            if (r29 == 0) goto L_0x0365
            r29 = r1
        L_0x0360:
            r1 = 1
            r11 = 0
            r27 = 1
            goto L_0x03b7
        L_0x0365:
            boolean r29 = r11.u()
            if (r29 == 0) goto L_0x0388
            r11.y()
            androidx.compose.foundation.lazy.layout.b[] r29 = r12.a()
            r25 = 0
            r29[r26] = r25
            r29 = r1
            java.util.List<androidx.compose.foundation.lazy.layout.b> r1 = r6.f18267i
            r1.remove(r11)
            G1.r r1 = r6.f18268j
            if (r1 == 0) goto L_0x0386
            G1.C4515s.a(r1)
            XH.N r1 = XH.C16807N.f139792a
        L_0x0386:
            r11 = 0
            goto L_0x03b6
        L_0x0388:
            r29 = r1
            s1.c r1 = r11.p()
            if (r1 == 0) goto L_0x0393
            r11.l()
        L_0x0393:
            boolean r1 = r11.v()
            if (r1 == 0) goto L_0x03a8
            java.util.List<androidx.compose.foundation.lazy.layout.b> r1 = r6.f18267i
            r1.add(r11)
            G1.r r1 = r6.f18268j
            if (r1 == 0) goto L_0x0360
            G1.C4515s.a(r1)
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x0360
        L_0x03a8:
            r11.y()
            androidx.compose.foundation.lazy.layout.b[] r1 = r12.a()
            r11 = 0
            r1[r26] = r11
            goto L_0x03b6
        L_0x03b3:
            r29 = r1
            goto L_0x0386
        L_0x03b6:
            r1 = 1
        L_0x03b7:
            int r0 = r0 + r1
            r11 = r44
            r26 = r28
            r1 = r29
            goto L_0x034e
        L_0x03bf:
            r11 = 0
            if (r27 != 0) goto L_0x0441
            r6.n(r10)
            goto L_0x0441
        L_0x03c7:
            r11 = 0
            c2.b r0 = r12.b()
            kotlin.jvm.internal.C17542s.g(r0)
            long r30 = r0.r()
            int r28 = r12.d()
            int r29 = r12.g()
            r26 = r41
            r27 = r13
            v0.z r0 = r26.a(r27, r28, r29, r30)
            r1 = 1
            r0.e(r1)
            androidx.compose.foundation.lazy.layout.b[] r11 = r12.a()
            int r1 = r11.length
            r34 = r7
            r7 = 0
        L_0x03ef:
            if (r7 >= r1) goto L_0x040a
            r26 = r11[r7]
            r27 = r1
            if (r26 == 0) goto L_0x0401
            boolean r1 = r26.w()
            r26 = r11
            r11 = 1
            if (r1 != r11) goto L_0x0404
            goto L_0x0416
        L_0x0401:
            r26 = r11
            r11 = 1
        L_0x0404:
            int r7 = r7 + r11
            r11 = r26
            r1 = r27
            goto L_0x03ef
        L_0x040a:
            if (r8 == 0) goto L_0x0416
            int r1 = r8.c(r10)
            if (r13 != r1) goto L_0x0416
            r6.n(r10)
            goto L_0x0438
        L_0x0416:
            int r32 = r12.c()
            r26 = r12
            r27 = r0
            r28 = r48
            r29 = r49
            r30 = r46
            r31 = r47
            r26.k(r27, r28, r29, r30, r31, r32)
            int r1 = r6.f18261c
            if (r13 >= r1) goto L_0x0433
            java.util.List<T> r1 = r6.f18265g
            r1.add(r0)
            goto L_0x0438
        L_0x0433:
            java.util.List<T> r1 = r6.f18266h
            r1.add(r0)
        L_0x0438:
            r0 = 8
            goto L_0x0444
        L_0x043b:
            r15 = r40
            r33 = r0
            r36 = r1
        L_0x0441:
            r34 = r7
            goto L_0x0438
        L_0x0444:
            long r4 = r4 >> r0
            r1 = 1
            int r9 = r9 + r1
            r1 = r36
            r11 = r44
            r0 = r33
            r7 = r34
            goto L_0x0303
        L_0x0451:
            r15 = r40
            r33 = r0
            r36 = r1
            r34 = r7
            r0 = 8
            r1 = 1
            if (r14 != r0) goto L_0x047b
            goto L_0x046a
        L_0x045f:
            r15 = r40
            r33 = r0
            r36 = r1
            r34 = r7
            r0 = 8
            r1 = 1
        L_0x046a:
            if (r3 == r2) goto L_0x047b
            int r3 = r3 + r1
            r1 = r36
            r11 = r44
            r0 = r33
            r7 = r34
            goto L_0x02ed
        L_0x0477:
            r15 = r40
            r34 = r7
        L_0x047b:
            java.util.List<T> r0 = r6.f18265g
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04f3
            java.util.List<T> r0 = r6.f18265g
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0496
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$f r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$f
            r1.<init>(r15)
            YH.C16877v.C(r0, r1)
        L_0x0496:
            java.util.List<T> r0 = r6.f18265g
            int r1 = r0.size()
            r7 = 0
        L_0x049d:
            if (r7 >= r1) goto L_0x04e1
            java.lang.Object r2 = r0.get(r7)
            v0.z r2 = (v0.z) r2
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r3 = r6.f18259a
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.c(r4)
            kotlin.jvm.internal.C17542s.g(r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3
            r4 = r34
            int r5 = r6.r(r4, r2)
            if (r43 == 0) goto L_0x04c7
            java.lang.Object r8 = YH.C16877v.w0(r39)
            v0.z r8 = (v0.z) r8
            int r8 = r6.h(r8)
            goto L_0x04cb
        L_0x04c7:
            int r8 = r3.f()
        L_0x04cb:
            int r8 = r8 - r5
            int r3 = r3.c()
            r5 = r37
            r9 = r38
            r2.j(r8, r3, r5, r9)
            r3 = 1
            if (r42 == 0) goto L_0x04dd
            r6.p(r2, r3)
        L_0x04dd:
            int r7 = r7 + r3
            r34 = r4
            goto L_0x049d
        L_0x04e1:
            r5 = r37
            r9 = r38
            r4 = r34
            r14 = 6
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = r4
            r1 = r15
            r15 = r0
            YH.C16870n.y(r10, r11, r12, r13, r14, r15)
            goto L_0x04fa
        L_0x04f3:
            r5 = r37
            r9 = r38
            r1 = r15
            r4 = r34
        L_0x04fa:
            java.util.List<T> r0 = r6.f18266h
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x055d
            java.util.List<T> r0 = r6.f18266h
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0515
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$d r2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$d
            r2.<init>(r1)
            YH.C16877v.C(r0, r2)
        L_0x0515:
            java.util.List<T> r0 = r6.f18266h
            int r1 = r0.size()
            r7 = 0
        L_0x051c:
            if (r7 >= r1) goto L_0x055d
            java.lang.Object r2 = r0.get(r7)
            v0.z r2 = (v0.z) r2
            j0.N<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r3 = r6.f18259a
            java.lang.Object r8 = r2.getKey()
            java.lang.Object r3 = r3.c(r8)
            kotlin.jvm.internal.C17542s.g(r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3
            int r8 = r6.r(r4, r2)
            if (r43 == 0) goto L_0x0544
            java.lang.Object r10 = YH.C16877v.I0(r39)
            v0.z r10 = (v0.z) r10
            int r10 = r6.h(r10)
            goto L_0x054d
        L_0x0544:
            int r10 = r3.e()
            int r11 = r2.k()
            int r10 = r10 - r11
        L_0x054d:
            int r10 = r10 + r8
            int r3 = r3.c()
            r2.j(r10, r3, r5, r9)
            r3 = 1
            if (r42 == 0) goto L_0x055b
            r6.p(r2, r3)
        L_0x055b:
            int r7 = r7 + r3
            goto L_0x051c
        L_0x055d:
            java.util.List<T> r0 = r6.f18265g
            YH.C16877v.c0(r0)
            XH.N r1 = XH.C16807N.f139792a
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r39
            r2 = 0
            r1.addAll(r2, r0)
            java.util.List<T> r0 = r6.f18266h
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List<T> r0 = r6.f18263e
            r0.clear()
            java.util.List<T> r0 = r6.f18264f
            r0.clear()
            java.util.List<T> r0 = r6.f18265g
            r0.clear()
            java.util.List<T> r0 = r6.f18266h
            r0.clear()
            j0.O<java.lang.Object> r0 = r6.f18262d
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.m(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.c, v0.A, boolean, boolean, int, boolean, int, int, QJ.Q, p1.H0):void");
    }

    public final void o() {
        if (this.f18259a.g()) {
            N<Object, LazyLayoutItemAnimator<T>.defpackage.b> n10 = this.f18259a;
            Object[] objArr = n10.f24570c;
            long[] jArr = n10.f24568a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (b bVar : ((b) objArr[(i10 << 3) + i12]).a()) {
                                    if (bVar != null) {
                                        bVar.y();
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            this.f18259a.i();
        }
        this.f18260b = c.f18343a;
        this.f18261c = -1;
    }
}
