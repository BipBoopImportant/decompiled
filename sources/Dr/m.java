package dr;

import Iq.a;
import KJ.C15987c;
import QJ.C16297b0;
import QJ.Q;
import SC.C13575d;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kr.C11527a;
import kr.C11528b;
import kr.c;
import m0.K;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import p0.s;
import s0.C5834E;
import s0.C5848T;
import s0.C5850V;
import s0.C5853Y;
import s0.a0;
import t0.C5934A;
import t0.C5935B;
import t0.C5937b;
import t0.C5938c;
import t0.k;
import t0.x;
import tI.C17978n;
import uI.C18059h;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b$\u0010%¨\u0006*²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002²\u0006\u000e\u0010&\u001a\u00020\u00048\n@\nX\u0002²\u0006\u0012\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u0002²\u0006\u000e\u0010(\u001a\u00020\u00048\n@\nX\u0002²\u0006\f\u0010)\u001a\u00020 8\nX\u0002²\u0006\u0018\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00028\nX\u0002"}, d2 = {"Lor/i;", "viewModel", "Lkotlin/Function1;", "Lkr/a;", "", "consumeNavigation", "Lkotlin/Function0;", "LXH/N;", "onReady", "s", "(Lor/i;LnI/l;LnI/a;LU0/m;I)V", "Lkr/d;", "uiState", "Lkr/b;", "onEvent", "r", "(Lkr/d;LnI/l;LU0/m;I)V", "", "balance", "LKJ/c;", "Lkr/c;", "listContent", "LIq/a$a;", "onAction", "onHistoryClicked", "onOpaqueToolbarChanged", "onCollectPointsFocused", "focusCollectPoints", "l", "(ILKJ/c;LnI/l;LnI/l;LnI/l;LnI/a;ZLU0/m;II)V", "Lt0/A;", "lazyListState", "", "toolbarHeight", "K", "(Lt0/A;F)F", "J", "(F)F", "ready", "callback", "opaqueToolbar", "toolbarFraction", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsScreenKt$FamilyRewardsContent$1$1", f = "FamilyRewardsScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97033c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f97034d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<Boolean, C16807N>> f97035e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, A1<? extends C17642l<? super Boolean, C16807N>> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f97034d = z10;
            this.f97035e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f97034d, this.f97035e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f97033c == 0) {
                y.b(obj);
                m.o(this.f97035e).invoke(kotlin.coroutines.jvm.internal.b.a(this.f97034d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsScreenKt$FamilyRewardsContent$2$1", f = "FamilyRewardsScreen.kt", l = {191, 192}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97036c;

        /* renamed from: d  reason: collision with root package name */
        int f97037d;

        /* renamed from: e  reason: collision with root package name */
        int f97038e;

        /* renamed from: f  reason: collision with root package name */
        Object f97039f;

        /* renamed from: g  reason: collision with root package name */
        Object f97040g;

        /* renamed from: h  reason: collision with root package name */
        int f97041h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f97042i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C15987c<kr.c> f97043j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5934A f97044k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97045l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C15987c<? extends kr.c> cVar, C5934A a10, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f97042i = z10;
            this.f97043j = cVar;
            this.f97044k = a10;
            this.f97045l = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f97042i, this.f97043j, this.f97044k, this.f97045l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            int i10;
            int i11;
            int i12;
            Object f10 = C17187b.f();
            int i13 = this.f97041h;
            if (i13 == 0) {
                y.b(obj);
                if (this.f97042i) {
                    list = this.f97043j;
                    it = list.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (((kr.c) it.next()) instanceof c.e) {
                            i11 = i10;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i11 >= 0) {
                        this.f97039f = list;
                        this.f97040g = it;
                        this.f97036c = i11;
                        this.f97037d = 0;
                        this.f97038e = i10;
                        this.f97041h = 1;
                        if (C16297b0.b(500, this) == f10) {
                            return f10;
                        }
                        i12 = 0;
                    }
                }
                return C16807N.f139792a;
            } else if (i13 == 1) {
                i10 = this.f97038e;
                i12 = this.f97037d;
                i11 = this.f97036c;
                it = (Iterator) this.f97040g;
                list = (List) this.f97039f;
                y.b(obj);
            } else if (i13 == 2) {
                Iterator it2 = (Iterator) this.f97040g;
                List list2 = (List) this.f97039f;
                y.b(obj);
                this.f97045l.invoke();
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it3 = it;
            int i14 = i11;
            C5934A a10 = this.f97044k;
            this.f97039f = list;
            this.f97040g = it3;
            this.f97036c = i14;
            this.f97037d = i12;
            this.f97038e = i10;
            this.f97041h = 2;
            if (C5934A.m(a10, i14, 0, this, 2, (Object) null) == f10) {
                return f10;
            }
            this.f97045l.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17631a<Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1<Float> f97046a;

        c(A1<Float> a12) {
            this.f97046a = a12;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(1.0f - m.n(this.f97046a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f97047a = new d();

        /* renamed from: a */
        public final Void invoke(kr.c cVar) {
            C17542s.j(cVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C17642l<kr.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97048a;

        public e(String str) {
            this.f97048a = str;
        }

        /* renamed from: a */
        public final Object invoke(kr.c cVar) {
            C17542s.j(cVar, "item");
            String str = this.f97048a;
            if (str != null) {
                String str2 = str + ":" + cVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(cVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17642l lVar, List list) {
            super(1);
            this.f97049c = lVar;
            this.f97050d = list;
        }

        public final Object a(int i10) {
            return this.f97049c.invoke(this.f97050d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17642l lVar, List list) {
            super(1);
            this.f97051c = lVar;
            this.f97052d = list;
        }

        public final Object a(int i10) {
            return this.f97051c.invoke(this.f97052d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f97053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f97054d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f97055e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f97056f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f97057g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f97058h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5848T f97059i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List list, int i10, A1 a12, C17642l lVar, C17642l lVar2, long j10, C5848T t10) {
            super(4);
            this.f97053c = list;
            this.f97054d = i10;
            this.f97055e = a12;
            this.f97056f = lVar;
            this.f97057g = lVar2;
            this.f97058h = j10;
            this.f97059i = t10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r24, int r25, U0.C4889m r26, int r27) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                r9 = r26
                r2 = r27 & 6
                if (r2 != 0) goto L_0x0018
                r2 = r24
                boolean r2 = r9.V(r2)
                if (r2 == 0) goto L_0x0014
                r2 = 4
                goto L_0x0015
            L_0x0014:
                r2 = 2
            L_0x0015:
                r2 = r27 | r2
                goto L_0x001a
            L_0x0018:
                r2 = r27
            L_0x001a:
                r8 = 48
                r3 = r27 & 48
                r4 = 32
                if (r3 != 0) goto L_0x002d
                boolean r3 = r9.d(r1)
                if (r3 == 0) goto L_0x002a
                r3 = r4
                goto L_0x002c
            L_0x002a:
                r3 = 16
            L_0x002c:
                r2 = r2 | r3
            L_0x002d:
                r3 = r2 & 147(0x93, float:2.06E-43)
                r5 = 146(0x92, float:2.05E-43)
                if (r3 != r5) goto L_0x003f
                boolean r3 = r26.l()
                if (r3 != 0) goto L_0x003a
                goto L_0x003f
            L_0x003a:
                r26.L()
                goto L_0x01d3
            L_0x003f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x004e
                r3 = -1
                java.lang.String r5 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r6 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r6, r2, r3, r5)
            L_0x004e:
                java.util.List r2 = r0.f97053c
                java.lang.Object r1 = r2.get(r1)
                kr.c r1 = (kr.c) r1
                r2 = 1579122335(0x5e1f7e9f, float:2.87319953E18)
                r9.W(r2)
                boolean r2 = r1 instanceof kr.c.g
                r10 = 6
                if (r2 == 0) goto L_0x00b4
                r1 = 1579123264(0x5e1f8240, float:2.87345489E18)
                r9.W(r1)
                int r1 = r0.f97054d
                r2 = 2129151605(0x7ee84675, float:1.5437336E38)
                r9.W(r2)
                U0.A1 r2 = r0.f97055e
                boolean r2 = r9.V(r2)
                java.lang.Object r3 = r26.D()
                if (r2 != 0) goto L_0x0083
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x008d
            L_0x0083:
                dr.m$c r3 = new dr.m$c
                U0.A1 r2 = r0.f97055e
                r3.<init>(r2)
                r9.u(r3)
            L_0x008d:
                r2 = r3
                nI.a r2 = (nI.C17631a) r2
                r26.P()
                nI.l r3 = r0.f97056f
                r7 = 0
                r8 = 24
                r4 = 0
                r5 = 0
                r6 = r26
                dr.C11224D.t(r1, r2, r3, r4, r5, r6, r7, r8)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r2 = 24
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r1, r2)
                s0.C5844O.a(r1, r9, r10)
                r26.P()
                goto L_0x01c7
            L_0x00b4:
                boolean r2 = r1 instanceof kr.c.f
                if (r2 == 0) goto L_0x00eb
                r2 = 1579465163(0x5e24b9cb, float:2.96743537E18)
                r9.W(r2)
                kr.c$f r1 = (kr.c.f) r1
                KJ.c r2 = r1.d()
                IC.e r3 = r1.getTitle()
                nI.l r4 = r0.f97057g
                int r1 = IC.C13023e.f110931a
                int r6 = r1 << 3
                r7 = 4
                r5 = 0
                r1 = r2
                r2 = r3
                r3 = r5
                r5 = r26
                dr.t.c(r1, r2, r3, r4, r5, r6, r7)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                float r2 = (float) r8
                float r2 = c2.h.B(r2)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r1, r2)
                s0.C5844O.a(r1, r9, r10)
                r26.P()
                goto L_0x01c7
            L_0x00eb:
                boolean r2 = r1 instanceof kr.c.e
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 0
                if (r2 == 0) goto L_0x0130
                r1 = 1579819214(0x5e2a20ce, float:3.06475617E18)
                r9.W(r1)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r1, r6, r5, r3)
                long r11 = r0.f97058h
                r14 = 2
                r15 = 0
                r13 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.b.d(r10, r11, r13, r14, r15)
                float r1 = (float) r8
                float r18 = c2.h.B(r1)
                float r1 = (float) r4
                float r20 = c2.h.B(r1)
                r21 = 5
                r22 = 0
                r17 = 0
                r19 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
                androidx.compose.ui.d r1 = TC.e.i(r1)
                s0.T r2 = r0.f97059i
                androidx.compose.ui.d r1 = s0.C5851W.d(r1, r2)
                er.e.e(r1, r9, r7, r7)
                r26.P()
                goto L_0x01c7
            L_0x0130:
                boolean r2 = r1 instanceof kr.c.C2246c
                if (r2 == 0) goto L_0x0187
                r2 = 1580290817(0x5e315301, float:3.19438942E18)
                r9.W(r2)
                kr.c$c r1 = (kr.c.C2246c) r1
                Qq.q r2 = r1.g()
                com.ingka.ikea.core.model.Image r2 = r2.k()
                Qq.q r1 = r1.g()
                java.lang.String r4 = r1.g()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r1, r6, r5, r3)
                long r11 = r0.f97058h
                r14 = 2
                r15 = 0
                r13 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.b.d(r10, r11, r13, r14, r15)
                r1 = 20
                float r1 = (float) r1
                float r20 = c2.h.B(r1)
                r21 = 7
                r22 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
                androidx.compose.ui.d r1 = TC.e.i(r1)
                s0.T r3 = r0.f97059i
                androidx.compose.ui.d r3 = s0.C5851W.d(r1, r3)
                r5 = 0
                r6 = 0
                r1 = r2
                r2 = r4
                r4 = r26
                fr.d.b(r1, r2, r3, r4, r5, r6)
                r26.P()
                goto L_0x01c7
            L_0x0187:
                boolean r2 = r1 instanceof kr.c.d
                if (r2 == 0) goto L_0x01d4
                r2 = 1580857466(0x5e39f87a, float:3.35014871E18)
                r9.W(r2)
                kr.c$d r1 = (kr.c.d) r1
                KJ.c r1 = r1.g()
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r2, r6, r5, r3)
                long r11 = r0.f97058h
                r14 = 2
                r15 = 0
                r13 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.b.d(r10, r11, r13, r14, r15)
                r2 = 40
                float r2 = (float) r2
                float r20 = c2.h.B(r2)
                r21 = 7
                r22 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
                s0.T r3 = r0.f97059i
                androidx.compose.ui.d r2 = s0.C5851W.d(r2, r3)
                er.e.g(r1, r2, r9, r7, r7)
                r26.P()
            L_0x01c7:
                r26.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x01d3
                U0.C4895p.R()
            L_0x01d3:
                return
            L_0x01d4:
                r1 = 2129149412(0x7ee83de4, float:1.5435112E38)
                r9.W(r1)
                r26.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: dr.m.h.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsScreenKt$FamilyRewardsScreen$2$1", f = "FamilyRewardsScreen.kt", l = {}, m = "invokeSuspend")
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C11527a, Boolean> f97061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11527a f97062e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ or.i f97063f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C17642l<? super C11527a, Boolean> lVar, C11527a aVar, or.i iVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f97061d = lVar;
            this.f97062e = aVar;
            this.f97063f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f97061d, this.f97062e, this.f97063f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f97060c == 0) {
                y.b(obj);
                if (this.f97061d.invoke(this.f97062e).booleanValue()) {
                    this.f97063f.j(C11528b.e.f99091a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements C17642l<C11528b, C16807N> {
        j(Object obj) {
            super(1, obj, or.i.class, "event", "event(Lcom/ingka/ikea/familyrewards/implementation/model/FamilyRewards$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C11528b) obj);
            return C16807N.f139792a;
        }

        public final void t(C11528b bVar) {
            C17542s.j(bVar, "p0");
            ((or.i) this.receiver).j(bVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C4899r0 r0Var, boolean z10) {
        x(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar) {
        lVar.invoke(C11528b.C2245b.f99088a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(kr.d dVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        r(dVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void D(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final C17631a<C16807N> E(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C4899r0 r0Var, A1 a12) {
        if (!u(r0Var)) {
            D(r0Var, true);
            E(a12).invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(or.i iVar, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        s(iVar, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final float J(float f10) {
        return ((Number) C17978n.q(Float.valueOf(K.n().a(f10 * 1.5f)), C17978n.c(0.0f, 1.0f))).floatValue();
    }

    private static final float K(C5934A a10, float f10) {
        if (a10.s() != 0) {
            return 1.0f;
        }
        k kVar = (k) C16877v.y0(a10.x().i());
        if (kVar == null) {
            return 0.0f;
        }
        return ((float) a10.t()) / (((float) kVar.a()) - f10);
    }

    private static final void l(int i10, C15987c<? extends kr.c> cVar, C17642l<? super a.C1605a, C16807N> lVar, C17642l<? super Integer, C16807N> lVar2, C17642l<? super Boolean, C16807N> lVar3, C17631a<C16807N> aVar, boolean z10, C4889m mVar, int i11, int i12) {
        int i13;
        boolean z11;
        boolean z12;
        C4889m mVar2;
        A1 a12;
        int i14;
        C15987c<? extends kr.c> cVar2 = cVar;
        C17642l<? super Boolean, C16807N> lVar4 = lVar3;
        int i15 = i11;
        C4889m k10 = mVar.k(67690048);
        if ((i12 & 1) != 0) {
            i13 = i15 | 6;
            int i16 = i10;
        } else {
            int i17 = i10;
            if ((i15 & 6) == 0) {
                i13 = (k10.d(i17) ? 4 : 2) | i15;
            } else {
                i13 = i15;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i15 & 48) == 0) {
            i13 |= (i15 & 64) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
            C17642l<? super a.C1605a, C16807N> lVar5 = lVar;
        } else {
            C17642l<? super a.C1605a, C16807N> lVar6 = lVar;
            if ((i15 & 384) == 0) {
                i13 |= k10.F(lVar6) ? 256 : 128;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            C17642l<? super Integer, C16807N> lVar7 = lVar2;
        } else {
            C17642l<? super Integer, C16807N> lVar8 = lVar2;
            if ((i15 & 3072) == 0) {
                i13 |= k10.F(lVar8) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i15 & 24576) == 0) {
            i13 |= k10.F(lVar4) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= ImageMetadata.EDGE_MODE;
            C17631a<C16807N> aVar2 = aVar;
        } else {
            C17631a<C16807N> aVar3 = aVar;
            if ((i15 & ImageMetadata.EDGE_MODE) == 0) {
                i13 |= k10.F(aVar3) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            }
        }
        int i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i15 & 1572864) == 0) {
                i13 |= k10.b(z11) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
            }
        }
        if ((i13 & 599187) != 599186 || !k10.l()) {
            boolean z13 = i18 != 0 ? false : z11;
            if (C4895p.J()) {
                C4895p.S(67690048, i13, -1, "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsContent (FamilyRewardsScreen.kt:166)");
            }
            C5934A c10 = C5935B.c(0, 0, k10, 0, 3);
            float H12 = ((c2.d) k10.Q(C5100f0.e())).H1(c2.h.B(ol.m.f100559a.a() + c2.h.B((float) 24)));
            k10.W(1217916183);
            boolean V10 = k10.V(c10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = p1.e(new C11235k(c10, H12));
                k10.u(D10);
            }
            A1 a13 = (A1) D10;
            k10.P();
            A1<T> q10 = p1.q(lVar4, k10, (i13 >> 12) & 14);
            boolean z14 = n(a13) == 1.0f;
            Boolean valueOf = Boolean.valueOf(z14);
            k10.W(1217926599);
            boolean V11 = k10.V(q10) | k10.b(z14);
            Object D11 = k10.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new a(z14, q10, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(valueOf, (p) D11, k10, 0);
            Boolean valueOf2 = Boolean.valueOf(z13);
            k10.W(1217929477);
            int i19 = i13 & 112;
            boolean V12 = ((3670016 & i13) == 1048576) | (i19 == 32 || ((i13 & 64) != 0 && k10.F(cVar2))) | k10.V(c10) | ((458752 & i13) == 131072);
            Object D12 = k10.D();
            if (V12 || D12 == C4889m.f14007a.a()) {
                i14 = i13;
                a12 = a13;
                b bVar = new b(z13, cVar, c10, aVar, (C17164e<? super b>) null);
                k10.u(bVar);
                D12 = bVar;
            } else {
                i14 = i13;
                a12 = a13;
            }
            k10.P();
            int i20 = i14;
            P.g(valueOf2, (p) D12, k10, (i20 >> 18) & 14);
            C5848T i21 = C5850V.i(a0.c(C5848T.f28733a, k10, 6), C5853Y.f28774a.f());
            boolean z15 = false;
            long l02 = C13575d.a(k10, 0).l0();
            androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "FamilyRewardsScreenTestTag-List");
            k10.W(1217950982);
            A1 a14 = a12;
            boolean V13 = (i19 == 32 || ((i20 & 64) != 0 && k10.F(cVar2))) | ((i20 & 14) == 4) | k10.V(a14) | ((i20 & 7168) == 2048);
            if ((i20 & 896) == 256) {
                z15 = true;
            }
            boolean e10 = z15 | V13 | k10.e(l02) | k10.V(i21);
            Object D13 = k10.D();
            if (e10 || D13 == C4889m.f14007a.a()) {
                C11236l lVar9 = r0;
                C11236l lVar10 = new C11236l(cVar, i10, a14, lVar2, lVar, l02, i21);
                k10.u(lVar9);
                D13 = lVar9;
            }
            k10.P();
            mVar2 = k10;
            C5937b.a(a10, c10, (C5834E) null, false, (C5073d.m) null, (C5437c.b) null, (s) null, false, (C17642l) D13, mVar2, 6, 252);
            if (C4895p.J()) {
                C4895p.R();
            }
            z12 = z13;
        } else {
            k10.L();
            z12 = z11;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11227c(i10, cVar, lVar, lVar2, lVar3, aVar, z12, i11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final float m(C5934A a10, float f10) {
        return J(K(a10, f10));
    }

    /* access modifiers changed from: private */
    public static final float n(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C17642l<Boolean, C16807N> o(A1<? extends C17642l<? super Boolean, C16807N>> a12) {
        return (C17642l) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C15987c cVar, int i10, A1 a12, C17642l lVar, C17642l lVar2, long j10, C5848T t10, x xVar) {
        x xVar2 = xVar;
        C17542s.j(xVar2, "$this$LazyColumn");
        d dVar = d.f97047a;
        xVar2.e(cVar.size(), new f(new e((String) null), cVar), new g(dVar, cVar), c1.c.c(-632812321, true, new h(cVar, i10, a12, lVar, lVar2, j10, t10)));
        x.i(xVar, (Object) null, (Object) null, C11225a.f96998a.a(), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(int i10, C15987c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar, boolean z10, int i11, int i12, C4889m mVar, int i13) {
        l(i10, cVar, lVar, lVar2, lVar3, aVar, z10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(kr.d r23, nI.C17642l<? super kr.C11528b, XH.C16807N> r24, U0.C4889m r25, int r26) {
        /*
            r0 = r23
            r10 = r24
            r11 = r26
            java.lang.String r1 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r10, r1)
            r1 = -331893231(0xffffffffec37b611, float:-8.8837284E26)
            r2 = r25
            U0.m r15 = r2.k(r1)
            r2 = r11 & 6
            r3 = 2
            if (r2 != 0) goto L_0x0032
            r2 = r11 & 8
            if (r2 != 0) goto L_0x0027
            boolean r2 = r15.V(r0)
            goto L_0x002b
        L_0x0027:
            boolean r2 = r15.F(r0)
        L_0x002b:
            if (r2 == 0) goto L_0x002f
            r2 = 4
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            r2 = r2 | r11
            goto L_0x0033
        L_0x0032:
            r2 = r11
        L_0x0033:
            r4 = r11 & 48
            r5 = 32
            if (r4 != 0) goto L_0x0044
            boolean r4 = r15.F(r10)
            if (r4 == 0) goto L_0x0041
            r4 = r5
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r2 = r2 | r4
        L_0x0044:
            r4 = r2 & 19
            r6 = 18
            if (r4 != r6) goto L_0x0056
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r15.L()
            goto L_0x0281
        L_0x0056:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0062
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsScreen (FamilyRewardsScreen.kt:95)"
            U0.C4895p.S(r1, r2, r4, r6)
        L_0x0062:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c$a r22 = i1.C5437c.f24302a
            i1.c r1 = r22.o()
            r8 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r8)
            int r4 = U0.C4883j.a(r15, r8)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r9)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x008a
            U0.C4883j.c()
        L_0x008a:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x0097
            r15.p(r13)
            goto L_0x009a
        L_0x0097:
            r15.t()
        L_0x009a:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r1, r14)
            nI.p r1 = r12.e()
            U0.F1.c(r13, r6, r1)
            nI.p r1 = r12.b()
            boolean r6 = r13.i()
            if (r6 != 0) goto L_0x00c4
            java.lang.Object r6 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r14)
            if (r6 != 0) goto L_0x00d2
        L_0x00c4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r13.u(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.w(r4, r1)
        L_0x00d2:
            nI.p r1 = r12.d()
            U0.F1.c(r13, r7, r1)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r1 = r0 instanceof kr.d.c
            if (r1 == 0) goto L_0x0105
            r1 = 1769518353(0x6978b511, float:1.8791792E25)
            r15.W(r1)
            java.lang.String r1 = "FamilyRewardsScreenTestTag-Loading"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r9, r1)
            r3 = 6
            dr.q.d(r1, r15, r3, r8)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r8 = r1 | 24582(0x6006, float:3.4447E-41)
            r9 = 12
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 1
            r2 = r24
            r7 = r15
            dr.J.d(r1, r2, r3, r4, r6, r7, r8, r9)
            r15.P()
            goto L_0x0275
        L_0x0105:
            boolean r1 = r0 instanceof kr.d.b
            if (r1 == 0) goto L_0x0160
            r1 = 1769868932(0x697e0e84, float:1.9195982E25)
            r15.W(r1)
            int r1 = Oo.b.f84536V8
            java.lang.String r1 = J1.j.b(r1, r15, r8)
            int r3 = Oo.b.f84526U8
            java.lang.String r3 = J1.j.b(r3, r15, r8)
            int r6 = Oo.b.f84616d5
            java.lang.String r6 = J1.j.b(r6, r15, r8)
            java.lang.String r7 = "FamilyRewardsScreenTestTag-Error"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r9, r7)
            r9 = -81445726(0xfffffffffb253ca2, float:-8.579588E35)
            r15.W(r9)
            r2 = r2 & 112(0x70, float:1.57E-43)
            if (r2 != r5) goto L_0x0132
            r8 = 1
        L_0x0132:
            java.lang.Object r2 = r15.D()
            if (r8 != 0) goto L_0x0140
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0148
        L_0x0140:
            dr.e r2 = new dr.e
            r2.<init>(r10)
            r15.u(r2)
        L_0x0148:
            r8 = r2
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r9 = 3072(0xc00, float:4.305E-42)
            r12 = 0
            r2 = r1
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r15
            r8 = r9
            r9 = r12
            sl.C11865e.i(r2, r3, r4, r5, r6, r7, r8, r9)
            r15.P()
            goto L_0x0275
        L_0x0160:
            boolean r1 = r0 instanceof kr.d.a
            if (r1 == 0) goto L_0x0290
            r1 = 1770388058(0x6985fa5a, float:2.0246173E25)
            r15.W(r1)
            r1 = -81438202(0xfffffffffb255a06, float:-8.585549E35)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r12 = r6.a()
            if (r1 != r12) goto L_0x0186
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r12 = 0
            U0.r0 r1 = U0.u1.e(r1, r12, r3, r12)
            r15.u(r1)
        L_0x0186:
            U0.r0 r1 = (U0.C4899r0) r1
            r15.P()
            r3 = r0
            kr.d$a r3 = (kr.d.a) r3
            int r12 = r3.b()
            KJ.c r13 = r3.c()
            boolean r18 = r3.d()
            r3 = -81429104(0xfffffffffb257d90, float:-8.592757E35)
            r15.W(r3)
            r2 = r2 & 112(0x70, float:1.57E-43)
            if (r2 != r5) goto L_0x01a6
            r3 = 1
            goto L_0x01a7
        L_0x01a6:
            r3 = r8
        L_0x01a7:
            java.lang.Object r14 = r15.D()
            if (r3 != 0) goto L_0x01b3
            java.lang.Object r3 = r6.a()
            if (r14 != r3) goto L_0x01bb
        L_0x01b3:
            dr.f r14 = new dr.f
            r14.<init>(r10)
            r15.u(r14)
        L_0x01bb:
            nI.l r14 = (nI.C17642l) r14
            r15.P()
            r3 = -81413495(0xfffffffffb25ba89, float:-8.605124E35)
            r15.W(r3)
            if (r2 != r5) goto L_0x01ca
            r3 = 1
            goto L_0x01cb
        L_0x01ca:
            r3 = r8
        L_0x01cb:
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x01d7
            java.lang.Object r3 = r6.a()
            if (r4 != r3) goto L_0x01df
        L_0x01d7:
            dr.g r4 = new dr.g
            r4.<init>(r10)
            r15.u(r4)
        L_0x01df:
            r3 = r4
            nI.l r3 = (nI.C17642l) r3
            r15.P()
            r4 = -81410822(0xfffffffffb25c4fa, float:-8.6072414E35)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            java.lang.Object r8 = r6.a()
            if (r4 != r8) goto L_0x01fd
            dr.h r4 = new dr.h
            r4.<init>(r1)
            r15.u(r4)
        L_0x01fd:
            r16 = r4
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            r4 = -81408599(0xfffffffffb25cda9, float:-8.609003E35)
            r15.W(r4)
            if (r2 != r5) goto L_0x020e
            r4 = 1
            goto L_0x020f
        L_0x020e:
            r4 = 0
        L_0x020f:
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x021b
            java.lang.Object r4 = r6.a()
            if (r5 != r4) goto L_0x0223
        L_0x021b:
            dr.i r5 = new dr.i
            r5.<init>(r10)
            r15.u(r5)
        L_0x0223:
            r17 = r5
            nI.a r17 = (nI.C17631a) r17
            r15.P()
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 0
            r8 = r15
            r15 = r3
            r19 = r8
            l(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = w(r1)
            r12 = r2 | 24576(0x6000, float:3.4438E-41)
            r13 = 12
            r3 = 0
            r4 = 0
            r6 = 0
            r2 = r24
            r14 = r7
            r7 = r8
            r15 = r8
            r8 = r12
            r12 = r9
            r9 = r13
            dr.J.d(r1, r2, r3, r4, r6, r7, r8, r9)
            r1 = 0
            tK.h r1 = SC.C13575d.a(r15, r1)
            long r2 = r1.k0()
            r8 = 14
            r9 = 0
            r4 = 1062836634(0x3f59999a, float:0.85)
            r5 = 0
            r6 = 0
            r7 = 0
            long r3 = p1.C5747v0.o(r2, r4, r5, r6, r7, r8, r9)
            i1.c r1 = r22.b()
            androidx.compose.ui.d r2 = r14.a(r12, r1)
            r7 = 384(0x180, float:5.38E-43)
            r8 = 0
            r5 = 0
            r6 = r15
            kC.C14671b.b(r2, r3, r5, r6, r7, r8)
            r15.P()
        L_0x0275:
            r15.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0281
            U0.C4895p.R()
        L_0x0281:
            U0.Y0 r1 = r15.n()
            if (r1 == 0) goto L_0x028f
            dr.j r2 = new dr.j
            r2.<init>(r0, r10, r11)
            r1.a(r2)
        L_0x028f:
            return
        L_0x0290:
            r0 = -81466116(0xfffffffffb24ecfc, float:-8.563433E35)
            r15.W(r0)
            r15.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.m.r(kr.d, nI.l, U0.m, int):void");
    }

    public static final void s(or.i iVar, C17642l<? super C11527a, Boolean> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(iVar, "viewModel");
        C17542s.j(lVar, "consumeNavigation");
        C17542s.j(aVar, "onReady");
        C4889m k10 = mVar.k(-2109261654);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2109261654, i12, -1, "com.ingka.ikea.familyrewards.implementation.compose.rewards.FamilyRewardsScreen (FamilyRewardsScreen.kt:65)");
            }
            A1<kr.d> c10 = j3.a.c(iVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            k10.W(1857667655);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            A1<T> q10 = p1.q(aVar, k10, (i12 >> 6) & 14);
            k10.W(1857670940);
            boolean V10 = k10.V(q10);
            Object D11 = k10.D();
            if (V10 || D11 == aVar2.a()) {
                D11 = new C11226b(r0Var, q10);
                k10.u(D11);
            }
            k10.P();
            P.i((C17631a) D11, k10, 0);
            C11527a a10 = t(c10).a();
            k10.W(1857676155);
            boolean F10 = ((i12 & 112) == 32) | k10.F(a10) | k10.F(iVar);
            Object D12 = k10.D();
            if (F10 || D12 == aVar2.a()) {
                D12 = new i(lVar, a10, iVar, (C17164e<? super i>) null);
                k10.u(D12);
            }
            k10.P();
            P.g(a10, (p) D12, k10, 0);
            kr.d t10 = t(c10);
            k10.W(1857682133);
            boolean F11 = k10.F(iVar);
            Object D13 = k10.D();
            if (F11 || D13 == aVar2.a()) {
                D13 = new j(iVar);
                k10.u(D13);
            }
            k10.P();
            r(t10, (C17642l) ((C18059h) D13), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11228d(iVar, lVar, aVar, i10));
        }
    }

    private static final kr.d t(A1<? extends kr.d> a12) {
        return (kr.d) a12.getValue();
    }

    private static final boolean u(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C17642l lVar) {
        lVar.invoke(C11528b.a.f99087a);
        return C16807N.f139792a;
    }

    private static final boolean w(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void x(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, a.C1605a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C1605a.C1606a) {
            lVar.invoke(new C11528b.f(((a.C1605a.C1606a) aVar).a()));
        } else if (aVar instanceof a.C1605a.b) {
            lVar.invoke(new C11528b.h(((a.C1605a.b) aVar).a()));
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C17642l lVar, int i10) {
        lVar.invoke(new C11528b.d(i10));
        return C16807N.f139792a;
    }
}
