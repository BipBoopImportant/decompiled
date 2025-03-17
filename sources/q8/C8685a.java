package q8;

import L1.j;
import QJ.Q;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import android.graphics.Rect;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C8560a;
import m8.C8563d;
import n8.C8589a;
import nI.C17642l;
import nI.p;
import nI.t;
import pI.C17752b;
import t8.C8840a;
import tI.C17974j;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001>BM\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010\u001f\u001a\u00020\u00122@\u0010\u001e\u001a<\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030)H\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\u00020\u00032\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030)2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030)2\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100J5\u00105\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u00106JU\u00107\u001a\u00020\u00122@\u0010\u001e\u001a<\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0019H@ø\u0001\u0000¢\u0006\u0004\b7\u0010 J\u001b\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b<\u0010=R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010ER\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020U0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010?\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lq8/a;", "Lw8/b;", "Lkotlin/Function1;", "", "", "scrollToIndex", "Lkotlin/Function2;", "", "scrollByAction", "LL1/j;", "scrollRange", "Landroid/graphics/Rect;", "scrollableRect", "Lm8/d;", "container", "<init>", "(LnI/l;LnI/p;LL1/j;Landroid/graphics/Rect;Lm8/d;)V", "containerHeight", "LXH/N;", "q", "(I)V", "Lq8/a$a;", "body", "u", "(LnI/l;)V", "Lkotlin/Function6;", "", "Lw8/e;", "LdI/e;", "", "scrollerCallback", "r", "(LnI/t;LdI/e;)Ljava/lang/Object;", "n", "()Ljava/util/List;", "node", "o", "(Lm8/d;)Z", "index", "p", "(I)Z", "", "k", "()Ljava/util/Map;", "previousItemTops", "currentItemTops", "default", "m", "(Ljava/util/Map;Ljava/util/Map;I)I", "scrollContainerRect", "scrolledBy", "itemRectangles", "isLastPage", "l", "(Landroid/graphics/Rect;ILjava/util/List;Z)Landroid/graphics/Rect;", "b", "targetIndex", "t", "(ILdI/e;)Ljava/lang/Object;", "scrollByPx", "s", "(FLdI/e;)Ljava/lang/Object;", "a", "LnI/l;", "LnI/p;", "c", "LL1/j;", "d", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "e", "Lm8/d;", "getContainer", "()Lm8/d;", "LD8/c;", "f", "LD8/c;", "logger", "Ln8/a;", "g", "Ln8/a;", "viewNodeProcessor", "h", "Lq8/a$a;", "state", "", "i", "emptyBitmapProvider", "compose_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: q8.a  reason: case insensitive filesystem */
public final class C8685a implements w8.b {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Integer, Boolean> f55581a;

    /* renamed from: b  reason: collision with root package name */
    private final p<Float, Float, Boolean> f55582b;

    /* renamed from: c  reason: collision with root package name */
    private final j f55583c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f55584d;

    /* renamed from: e  reason: collision with root package name */
    private final C8563d f55585e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final D8.c f55586f = new D8.c("VerticalLazyScroller");

    /* renamed from: g  reason: collision with root package name */
    private final C8589a f55587g = new C8589a((C8560a) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C0896a f55588h = new C0896a(0, (List) null, 0, 0.0f, 63);

    /* renamed from: i  reason: collision with root package name */
    private final C17642l<Rect, String> f55589i = b.f55596c;

    /* renamed from: q8.a$a  reason: collision with other inner class name */
    public static final class C0896a {

        /* renamed from: a  reason: collision with root package name */
        public final int f55590a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f55591b;

        /* renamed from: c  reason: collision with root package name */
        public final List<Integer> f55592c;

        /* renamed from: d  reason: collision with root package name */
        public final int f55593d;

        /* renamed from: e  reason: collision with root package name */
        public final float f55594e;

        /* renamed from: f  reason: collision with root package name */
        public final Map<Integer, Integer> f55595f;

        public C0896a() {
            this(0, (List) null, 0, 0.0f, 63);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0896a)) {
                return false;
            }
            C0896a aVar = (C0896a) obj;
            return this.f55590a == aVar.f55590a && C17542s.e(this.f55591b, aVar.f55591b) && C17542s.e(this.f55592c, aVar.f55592c) && this.f55593d == aVar.f55593d && Float.compare(this.f55594e, aVar.f55594e) == 0 && C17542s.e(this.f55595f, aVar.f55595f);
        }

        public final int hashCode() {
            int hashCode = this.f55591b.hashCode();
            int hashCode2 = this.f55592c.hashCode();
            int hashCode3 = Integer.hashCode(this.f55593d);
            int hashCode4 = Float.hashCode(this.f55594e);
            return this.f55595f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f55590a) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ScrollState(containerHeight=" + this.f55590a + ", notifiedItems=" + this.f55591b + ", itemsToNotify=" + this.f55592c + ", initialPositionItemIndex=" + this.f55593d + ", initialPositionItemOffset=" + this.f55594e + ", previousItemTops=" + this.f55595f + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0896a(int i10, List list, int i11, float f10, int i12) {
            this((i12 & 1) != 0 ? 0 : i10, C16877v.n(), (i12 & 4) != 0 ? C16877v.n() : list, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? 0.0f : f10, X.j());
        }

        public C0896a(int i10, List<Integer> list, List<Integer> list2, int i11, float f10, Map<Integer, Integer> map) {
            C17542s.j(list, "notifiedItems");
            C17542s.j(list2, "itemsToNotify");
            C17542s.j(map, "previousItemTops");
            this.f55590a = i10;
            this.f55591b = list;
            this.f55592c = list2;
            this.f55593d = i11;
            this.f55594e = f10;
            this.f55595f = map;
        }
    }

    /* renamed from: q8.a$b */
    public static final class b extends C17544u implements C17642l<Rect, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f55596c = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C17542s.j((Rect) obj, "it");
            return "";
        }
    }

    /* renamed from: q8.a$c */
    public static final class c extends C17544u implements C17642l<C0896a, C0896a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f55597c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f55598d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f55599e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f55600f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, int i12, float f10) {
            super(1);
            this.f55597c = i10;
            this.f55598d = i11;
            this.f55599e = i12;
            this.f55600f = f10;
        }

        public final Object invoke(Object obj) {
            C17542s.j((C0896a) obj, "$this$updateState");
            return new C0896a(this.f55597c, C16877v.t1(new C17974j(0, this.f55598d)), this.f55599e, -this.f55600f, 34);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalLazyScroller", f = "VerticalLazyScroller.kt", l = {108}, m = "processVisibleItems")
    /* renamed from: q8.a$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C8685a f55601c;

        /* renamed from: d  reason: collision with root package name */
        public Set f55602d;

        /* renamed from: e  reason: collision with root package name */
        public Map f55603e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f55604f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C8685a f55605g;

        /* renamed from: h  reason: collision with root package name */
        public int f55606h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C8685a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f55605g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55604f = obj;
            this.f55606h |= Integer.MIN_VALUE;
            return this.f55605g.r((t<? super Integer, ? super Integer, ? super List<w8.e>, ? super Rect, ? super Boolean, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    /* renamed from: q8.a$e */
    public static final class e extends C17544u implements C17642l<C0896a, C0896a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C8685a f55607c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Set<Integer> f55608d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Map<Integer, Integer> f55609e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C8685a aVar, Set<Integer> set, Map<Integer, Integer> map) {
            super(1);
            this.f55607c = aVar;
            this.f55608d = set;
            this.f55609e = map;
        }

        public final Object invoke(Object obj) {
            C0896a aVar = (C0896a) obj;
            C17542s.j(aVar, "$this$updateState");
            List<T> V02 = C16877v.V0(this.f55607c.f55588h.f55591b, this.f55608d);
            List<T> R02 = C16877v.R0(this.f55607c.f55588h.f55592c, this.f55608d);
            Map<Integer, Integer> map = this.f55609e;
            int i10 = aVar.f55590a;
            int i11 = aVar.f55593d;
            float f10 = aVar.f55594e;
            C17542s.j(V02, "notifiedItems");
            C17542s.j(R02, "itemsToNotify");
            C17542s.j(map, "previousItemTops");
            return new C0896a(i10, V02, R02, i11, f10, map);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalLazyScroller", f = "VerticalLazyScroller.kt", l = {226}, m = "scrollByAndWait")
    /* renamed from: q8.a$f */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C8685a f55610c;

        /* renamed from: d  reason: collision with root package name */
        public float f55611d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f55612e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C8685a f55613f;

        /* renamed from: g  reason: collision with root package name */
        public int f55614g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C8685a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f55613f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55612e = obj;
            this.f55614g |= Integer.MIN_VALUE;
            return this.f55613f.s(0.0f, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalLazyScroller", f = "VerticalLazyScroller.kt", l = {42, 43, 45, 46, 51, 51}, m = "scrollForCapture")
    /* renamed from: q8.a$g */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public Object f55615c;

        /* renamed from: d  reason: collision with root package name */
        public t f55616d;

        /* renamed from: e  reason: collision with root package name */
        public int f55617e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f55618f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C8685a f55619g;

        /* renamed from: h  reason: collision with root package name */
        public int f55620h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C8685a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f55619g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55618f = obj;
            this.f55620h |= Integer.MIN_VALUE;
            return this.f55619g.b((t<? super Integer, ? super Integer, ? super List<w8.e>, ? super Rect, ? super Boolean, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalLazyScroller$scrollForCapture$2", f = "VerticalLazyScroller.kt", l = {53, 54}, m = "invokeSuspend")
    /* renamed from: q8.a$h */
    public static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f55621c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C8685a f55622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C8685a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f55622d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f55622d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new h(this.f55622d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f55621c;
            if (i10 == 0) {
                y.b(obj);
                this.f55622d.f55586f.f("restoring initial state");
                C8685a aVar = this.f55622d;
                int i11 = aVar.f55588h.f55593d;
                this.f55621c = 1;
                if (aVar.t(i11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return this.f55622d.f55586f.f("end scroller");
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8685a aVar2 = this.f55622d;
            this.f55621c = 2;
            if (aVar2.s(-aVar2.f55588h.f55594e, this) == f10) {
                return f10;
            }
            return this.f55622d.f55586f.f("end scroller");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalLazyScroller", f = "VerticalLazyScroller.kt", l = {211}, m = "scrollToAndWait")
    /* renamed from: q8.a$i */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C8685a f55623c;

        /* renamed from: d  reason: collision with root package name */
        public float f55624d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f55625e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C8685a f55626f;

        /* renamed from: g  reason: collision with root package name */
        public int f55627g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C8685a aVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f55626f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55625e = obj;
            this.f55627g |= Integer.MIN_VALUE;
            return this.f55626f.t(0, this);
        }
    }

    public C8685a(C17642l<? super Integer, Boolean> lVar, p<? super Float, ? super Float, Boolean> pVar, j jVar, Rect rect, C8563d dVar) {
        C17542s.j(lVar, "scrollToIndex");
        C17542s.j(pVar, "scrollByAction");
        C17542s.j(jVar, "scrollRange");
        C17542s.j(rect, "scrollableRect");
        C17542s.j(dVar, "container");
        this.f55581a = lVar;
        this.f55582b = pVar;
        this.f55583c = jVar;
        this.f55584d = rect;
        this.f55585e = dVar;
    }

    private final Map<Integer, Integer> k() {
        List<C8563d> e10 = this.f55585e.e();
        ArrayList arrayList = new ArrayList(C16877v.y(e10, 10));
        int i10 = 0;
        for (T next : e10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            arrayList.add(C16796C.a(Integer.valueOf(C8840a.a(this.f55585e, i10)), Integer.valueOf(C17752b.e(((C8563d) next).getBounds().r()))));
            i10 = i11;
        }
        return X.v(arrayList);
    }

    private final Rect l(Rect rect, int i10, List<Rect> list, boolean z10) {
        Integer num;
        if (!z10) {
            return rect;
        }
        Rect rect2 = new Rect(rect);
        rect2.top = rect2.bottom - i10;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((Rect) it.next()).bottom);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((Rect) it.next()).bottom);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        }
        int min = Math.min(rect2.bottom, num != null ? num.intValue() : rect2.bottom);
        rect2.bottom = min;
        rect2.top = Math.min(rect2.top, min);
        return rect2;
    }

    private final int m(Map<Integer, Integer> map, Map<Integer, Integer> map2, int i10) {
        Integer num = (Integer) C16877v.x0(C16877v.C0(map2.keySet(), map.keySet()));
        if (num == null) {
            return i10;
        }
        Integer num2 = map.get(num);
        if (num2 != null) {
            i10 = num2.intValue();
        }
        Integer num3 = map2.get(num);
        return i10 - (num3 != null ? num3.intValue() : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r8 = r0.f55587g.g(r5, false, r0.f55589i);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<w8.e> n() {
        /*
            r26 = this;
            r0 = r26
            m8.d r1 = r0.f55585e
            java.util.List r1 = r1.e()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L_0x0013:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = r1.next()
            int r6 = r4 + 1
            if (r4 >= 0) goto L_0x0024
            YH.C16877v.x()
        L_0x0024:
            m8.d r5 = (m8.C8563d) r5
            m8.d r7 = r0.f55585e
            int r15 = t8.C8840a.a(r7, r4)
            boolean r4 = r0.p(r15)
            if (r4 != 0) goto L_0x0061
            boolean r4 = r0.o(r5)
            if (r4 == 0) goto L_0x0061
            n8.a r4 = r0.f55587g
            nI.l<android.graphics.Rect, java.lang.String> r7 = r0.f55589i
            w8.e r8 = r4.g(r5, r3, r7)
            if (r8 == 0) goto L_0x0061
            r24 = 32703(0x7fbf, float:4.5827E-41)
            r25 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            w8.e r4 = w8.e.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            r2.add(r4)
        L_0x0067:
            r4 = r6
            goto L_0x0013
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.n():java.util.List");
    }

    private final boolean o(C8563d dVar) {
        return dVar.getBounds().j() <= ((float) c().bottom);
    }

    private final boolean p(int i10) {
        return this.f55588h.f55591b.contains(Integer.valueOf(i10)) || i10 > ((Number) C16877v.O0(this.f55588h.f55592c)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r0 = r0.getBounds();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q(int r5) {
        /*
            r4 = this;
            m8.d r0 = r4.f55585e
            java.util.List r1 = r0.e()
            int r1 = YH.C16877v.p(r1)
            m8.d r2 = r4.f55585e
            int r1 = t8.C8840a.a(r2, r1)
            android.graphics.Rect r2 = r4.c()
            int r2 = r2.top
            float r2 = (float) r2
            java.util.List r0 = r0.e()
            java.lang.Object r0 = YH.C16877v.y0(r0)
            m8.d r0 = (m8.C8563d) r0
            if (r0 == 0) goto L_0x002e
            o1.i r0 = r0.getBounds()
            if (r0 == 0) goto L_0x002e
            float r0 = r0.r()
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            float r2 = r2 - r0
            m8.d r0 = r4.f55585e
            r3 = 0
            int r0 = t8.C8840a.a(r0, r3)
            q8.a$c r3 = new q8.a$c
            r3.<init>(r5, r1, r0, r2)
            r4.u(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.q(int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(nI.t<? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.List<w8.e>, ? super android.graphics.Rect, ? super java.lang.Boolean, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r12, dI.C17164e<? super XH.C16807N> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof q8.C8685a.d
            if (r0 == 0) goto L_0x0014
            r0 = r13
            q8.a$d r0 = (q8.C8685a.d) r0
            int r1 = r0.f55606h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f55606h = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            q8.a$d r0 = new q8.a$d
            r0.<init>(r11, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r7.f55604f
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r7.f55606h
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.util.Map r12 = r7.f55603e
            java.util.Set r0 = r7.f55602d
            q8.a r1 = r7.f55601c
            XH.y.b(r13)
            goto L_0x0178
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003a:
            XH.y.b(r13)
            java.util.List r4 = r11.n()
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r3 = YH.C16877v.y(r4, r1)
            r13.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0050:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r3.next()
            w8.e r5 = (w8.e) r5
            android.graphics.Rect r5 = r5.e()
            r13.add(r5)
            goto L_0x0050
        L_0x0064:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = YH.C16877v.y(r4, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x0071:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r1.next()
            w8.e r5 = (w8.e) r5
            int r5 = r5.f()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.e(r5)
            r3.add(r5)
            goto L_0x0071
        L_0x0089:
            java.util.Set r1 = YH.C16877v.y1(r3)
            D8.c r3 = r11.f55586f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "visible items on this page: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r3.f(r5)
            java.lang.Comparable r1 = YH.C16877v.M0(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x00ad
            int r1 = r1.intValue()
            goto L_0x00ae
        L_0x00ad:
            r1 = -1
        L_0x00ae:
            q8.a$a r3 = r11.f55588h
            java.util.List<java.lang.Integer> r3 = r3.f55592c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00bb:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r3.next()
            r8 = r6
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 > r1) goto L_0x00bb
            r5.add(r6)
            goto L_0x00bb
        L_0x00d2:
            java.util.Set r8 = YH.C16877v.y1(r5)
            D8.c r1 = r11.f55586f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "items being processed: "
            r3.<init>(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.f(r3)
            java.util.Map r9 = r11.k()
            q8.a$a r1 = r11.f55588h
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r1.f55595f
            int r1 = r1.f55590a
            int r1 = r11.m(r3, r9, r1)
            D8.c r3 = r11.f55586f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "scrolledBy: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r3.f(r5)
            if (r1 == 0) goto L_0x0183
            q8.a$a r3 = r11.f55588h
            java.util.List<java.lang.Integer> r5 = r3.f55591b
            int r5 = r5.size()
            java.util.List<java.lang.Integer> r3 = r3.f55592c
            int r3 = r3.size()
            int r3 = r3 + r5
            int r3 = r3 - r2
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.e(r3)
            boolean r3 = r8.contains(r3)
            android.graphics.Rect r5 = r11.c()
            android.graphics.Rect r5 = r11.l(r5, r1, r13, r3)
            D8.c r13 = r11.f55586f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "pageRect: "
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.f(r1)
            q8.a$a r13 = r11.f55588h
            java.util.List<java.lang.Integer> r1 = r13.f55591b
            int r1 = r1.size()
            java.util.List<java.lang.Integer> r13 = r13.f55592c
            int r13 = r13.size()
            int r13 = r13 + r1
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.e(r13)
            q8.a$a r1 = r11.f55588h
            java.util.List<java.lang.Integer> r1 = r1.f55591b
            int r1 = r1.size()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r1)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r3)
            r7.f55601c = r11
            r7.f55602d = r8
            r7.f55603e = r9
            r7.f55606h = r2
            r1 = r12
            r2 = r13
            r3 = r6
            r6 = r10
            java.lang.Object r12 = r1.o(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x0175
            return r0
        L_0x0175:
            r1 = r11
            r0 = r8
            r12 = r9
        L_0x0178:
            q8.a$e r13 = new q8.a$e
            r13.<init>(r1, r0, r12)
            r1.u(r13)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x0183:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Error during scroll"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.r(nI.t, dI.e):java.lang.Object");
    }

    private final void u(C17642l<? super C0896a, C0896a> lVar) {
        this.f55588h = lVar.invoke(this.f55588h);
        D8.c cVar = this.f55586f;
        cVar.f("new state: " + this.f55588h);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.f55615c = r4;
        r0.f55616d = r7;
        r0.f55617e = r8;
        r0.f55620h = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (r4.r(r7, r0) != r1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r2 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r4.f55588h.f55592c.isEmpty() != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r0.f55615c = r4;
        r0.f55616d = r2;
        r0.f55617e = r7;
        r0.f55620h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d1, code lost:
        if (r4.s((float) r7, r0) != r1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r0.f55615c = r4;
        r0.f55616d = r2;
        r0.f55617e = r7;
        r0.f55620h = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r4.r(r2, r0) != r1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r7 = QJ.R0.f137599a;
        r8 = new q8.C8685a.h(r4, (dI.C17164e<? super q8.C8685a.h>) null);
        r0.f55615c = null;
        r0.f55616d = null;
        r0.f55620h = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if (QJ.C16310i.g(r7, r8, r0) != r1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(nI.t<? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.List<w8.e>, ? super android.graphics.Rect, ? super java.lang.Boolean, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q8.C8685a.g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            q8.a$g r0 = (q8.C8685a.g) r0
            int r1 = r0.f55620h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55620h = r1
            goto L_0x0018
        L_0x0013:
            q8.a$g r0 = new q8.a$g
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f55618f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f55620h
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0054;
                case 2: goto L_0x003a;
                case 3: goto L_0x0043;
                case 4: goto L_0x003a;
                case 5: goto L_0x0035;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002c:
            java.lang.Object r7 = r0.f55615c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            XH.y.b(r8)
            goto L_0x0115
        L_0x0035:
            XH.y.b(r8)
            goto L_0x00fb
        L_0x003a:
            int r7 = r0.f55617e
            nI.t r2 = r0.f55616d
            java.lang.Object r4 = r0.f55615c
            q8.a r4 = (q8.C8685a) r4
            goto L_0x0050
        L_0x0043:
            int r7 = r0.f55617e
            nI.t r2 = r0.f55616d
            java.lang.Object r4 = r0.f55615c
            q8.a r4 = (q8.C8685a) r4
            XH.y.b(r8)     // Catch:{ all -> 0x00e4 }
            goto L_0x00d4
        L_0x0050:
            XH.y.b(r8)     // Catch:{ all -> 0x00e4 }
            goto L_0x00b9
        L_0x0054:
            int r7 = r0.f55617e
            nI.t r2 = r0.f55616d
            java.lang.Object r4 = r0.f55615c
            q8.a r4 = (q8.C8685a) r4
            XH.y.b(r8)     // Catch:{ all -> 0x00e4 }
            r8 = r7
            r7 = r2
            goto L_0x00a7
        L_0x0062:
            XH.y.b(r8)
            android.graphics.Rect r8 = r6.c()
            int r8 = r8.height()
            D8.c r2 = r6.f55586f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "start scroller, container height: "
            r4.<init>(r5)
            m8.d r5 = r6.f55585e
            o1.i r5 = r5.getBounds()
            float r5 = r5.n()
            r4.append(r5)
            java.lang.String r5 = ", inner without padding: "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.f(r4)
            r6.q(r8)
            r0.f55615c = r6     // Catch:{ all -> 0x00fe }
            r0.f55616d = r7     // Catch:{ all -> 0x00fe }
            r0.f55617e = r8     // Catch:{ all -> 0x00fe }
            r2 = 1
            r0.f55620h = r2     // Catch:{ all -> 0x00fe }
            r2 = 0
            java.lang.Object r2 = r6.t(r2, r0)     // Catch:{ all -> 0x00fe }
            if (r2 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r4 = r6
        L_0x00a7:
            r0.f55615c = r4     // Catch:{ all -> 0x00e4 }
            r0.f55616d = r7     // Catch:{ all -> 0x00e4 }
            r0.f55617e = r8     // Catch:{ all -> 0x00e4 }
            r2 = 2
            r0.f55620h = r2     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = r4.r(r7, r0)     // Catch:{ all -> 0x00e4 }
            if (r2 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r2 = r7
            r7 = r8
        L_0x00b9:
            q8.a$a r8 = r4.f55588h     // Catch:{ all -> 0x00e4 }
            java.util.List<java.lang.Integer> r8 = r8.f55592c     // Catch:{ all -> 0x00e4 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00e4 }
            if (r8 != 0) goto L_0x00e6
            float r8 = (float) r7     // Catch:{ all -> 0x00e4 }
            r0.f55615c = r4     // Catch:{ all -> 0x00e4 }
            r0.f55616d = r2     // Catch:{ all -> 0x00e4 }
            r0.f55617e = r7     // Catch:{ all -> 0x00e4 }
            r5 = 3
            r0.f55620h = r5     // Catch:{ all -> 0x00e4 }
            java.lang.Object r8 = r4.s(r8, r0)     // Catch:{ all -> 0x00e4 }
            if (r8 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            r0.f55615c = r4     // Catch:{ all -> 0x00e4 }
            r0.f55616d = r2     // Catch:{ all -> 0x00e4 }
            r0.f55617e = r7     // Catch:{ all -> 0x00e4 }
            r8 = 4
            r0.f55620h = r8     // Catch:{ all -> 0x00e4 }
            java.lang.Object r8 = r4.r(r2, r0)     // Catch:{ all -> 0x00e4 }
            if (r8 != r1) goto L_0x00b9
            return r1
        L_0x00e4:
            r7 = move-exception
            goto L_0x0100
        L_0x00e6:
            QJ.R0 r7 = QJ.R0.f137599a
            q8.a$h r8 = new q8.a$h
            r8.<init>(r4, r3)
            r0.f55615c = r3
            r0.f55616d = r3
            r2 = 5
            r0.f55620h = r2
            java.lang.Object r7 = QJ.C16310i.g(r7, r8, r0)
            if (r7 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x00fe:
            r7 = move-exception
            r4 = r6
        L_0x0100:
            QJ.R0 r8 = QJ.R0.f137599a
            q8.a$h r2 = new q8.a$h
            r2.<init>(r4, r3)
            r0.f55615c = r7
            r0.f55616d = r3
            r3 = 6
            r0.f55620h = r3
            java.lang.Object r8 = QJ.C16310i.g(r8, r2, r0)
            if (r8 != r1) goto L_0x0115
            return r1
        L_0x0115:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.b(nI.t, dI.e):java.lang.Object");
    }

    public Rect c() {
        return this.f55584d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096  */
    public final java.lang.Object s(float r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q8.C8685a.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            q8.a$f r0 = (q8.C8685a.f) r0
            int r1 = r0.f55614g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55614g = r1
            goto L_0x0018
        L_0x0013:
            q8.a$f r0 = new q8.a$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f55612e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f55614g
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            float r7 = r0.f55611d
            q8.a r2 = r0.f55610c
            XH.y.b(r8)
            goto L_0x0082
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            XH.y.b(r8)
            L1.j r8 = r6.f55583c
            nI.a r8 = r8.c()
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            D8.c r2 = r6.f55586f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "scrollBy: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = ", start pos: "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.f(r4)
            nI.p<java.lang.Float, java.lang.Float, java.lang.Boolean> r2 = r6.f55582b
            r4 = 0
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.d(r4)
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.d(r7)
            r2.invoke(r4, r7)
            r2 = r6
        L_0x0072:
            r7 = r8
            r0.f55610c = r2
            r0.f55611d = r7
            r0.f55614g = r3
            r4 = 60
            java.lang.Object r8 = QJ.C16297b0.b(r4, r0)
            if (r8 != r1) goto L_0x0082
            return r1
        L_0x0082:
            L1.j r8 = r2.f55583c
            nI.a r8 = r8.c()
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0072
            D8.c r7 = r2.f55586f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "scrollBy end pos: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.f(r8)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.s(float, dI.e):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    public final java.lang.Object t(int r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q8.C8685a.i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            q8.a$i r0 = (q8.C8685a.i) r0
            int r1 = r0.f55627g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55627g = r1
            goto L_0x0018
        L_0x0013:
            q8.a$i r0 = new q8.a$i
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f55625e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f55627g
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            float r7 = r0.f55624d
            q8.a r2 = r0.f55623c
            XH.y.b(r8)
            goto L_0x007d
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            XH.y.b(r8)
            L1.j r8 = r6.f55583c
            nI.a r8 = r8.c()
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            D8.c r2 = r6.f55586f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "scrollTo: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = ", start pos: "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.f(r4)
            nI.l<java.lang.Integer, java.lang.Boolean> r2 = r6.f55581a
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.e(r7)
            r2.invoke(r7)
            r2 = r6
        L_0x006d:
            r7 = r8
            r0.f55623c = r2
            r0.f55624d = r7
            r0.f55627g = r3
            r4 = 60
            java.lang.Object r8 = QJ.C16297b0.b(r4, r0)
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            L1.j r8 = r2.f55583c
            nI.a r8 = r8.c()
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            D8.c r7 = r2.f55586f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "scrollTo end pos: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.f(r8)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C8685a.t(int, dI.e):java.lang.Object");
    }
}
