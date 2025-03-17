package H0;

import E1.C4488v;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import YH.C16877v;
import bI.C17035a;
import f1.C5309k;
import f1.C5310l;
import f1.m;
import j0.C5464u;
import j0.C5465v;
import j0.H;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import nI.t;
import o1.C5667g;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 o2\u00020\u0001:\u00011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010#\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0005R\"\u0010,\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\u000604j\u0002`58\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u00106R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=RB\u0010E\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010?8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR6\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010F8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KRN\u0010S\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010M8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010T8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b[\u00109\u001a\u0004\b\\\u0010;\"\u0004\b]\u0010=R0\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b_\u00109\u001a\u0004\b`\u0010;\"\u0004\ba\u0010=R7\u0010k\u001a\b\u0012\u0004\u0012\u00020d0c2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c8V@VX\u0002¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\b1\u0010h\"\u0004\bi\u0010jR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070c8@X\u0004¢\u0006\u0006\u001a\u0004\bo\u0010h\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"LH0/L;", "LH0/J;", "", "initialIncrementId", "<init>", "(J)V", "()V", "LH0/n;", "selectable", "b", "(LH0/n;)LH0/n;", "LXH/N;", "d", "(LH0/n;)V", "a", "()J", "LE1/v;", "containerLayoutCoordinates", "", "w", "(LE1/v;)Ljava/util/List;", "selectableId", "f", "layoutCoordinates", "Lo1/g;", "startPosition", "LH0/v;", "adjustment", "", "isInTouchMode", "e", "(LE1/v;JLH0/v;Z)V", "newPosition", "previousPosition", "isStartHandle", "h", "(LE1/v;JJZLH0/v;Z)Z", "i", "g", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "sorted", "", "Ljava/util/List;", "_selectables", "Lj0/H;", "c", "Lj0/H;", "_selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "incrementId", "Lkotlin/Function1;", "LnI/l;", "getOnPositionChangeCallback$foundation_release", "()LnI/l;", "p", "(LnI/l;)V", "onPositionChangeCallback", "Lkotlin/Function4;", "LnI/r;", "getOnSelectionUpdateStartCallback$foundation_release", "()LnI/r;", "u", "(LnI/r;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function2;", "LnI/p;", "getOnSelectionUpdateSelectAll$foundation_release", "()LnI/p;", "t", "(LnI/p;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function6;", "LnI/t;", "getOnSelectionUpdateCallback$foundation_release", "()LnI/t;", "r", "(LnI/t;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "LnI/a;", "getOnSelectionUpdateEndCallback$foundation_release", "()LnI/a;", "s", "(LnI/a;)V", "onSelectionUpdateEndCallback", "j", "getOnSelectableChangeCallback$foundation_release", "q", "onSelectableChangeCallback", "k", "getAfterSelectableUnsubscribe$foundation_release", "o", "afterSelectableUnsubscribe", "Lj0/u;", "LH0/p;", "<set-?>", "l", "LU0/r0;", "()Lj0/u;", "v", "(Lj0/u;)V", "subselections", "n", "()Ljava/util/List;", "selectables", "m", "selectableMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L implements J {

    /* renamed from: m  reason: collision with root package name */
    public static final c f6785m = new c((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f6786n = 8;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C5309k<L, Long> f6787o = C5310l.a(a.f6800c, b.f6801c);

    /* renamed from: a  reason: collision with root package name */
    private boolean f6788a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C4536n> f6789b;

    /* renamed from: c  reason: collision with root package name */
    private final H<C4536n> f6790c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public AtomicLong f6791d;

    /* renamed from: e  reason: collision with root package name */
    private C17642l<? super Long, C16807N> f6792e;

    /* renamed from: f  reason: collision with root package name */
    private r<? super Boolean, ? super C4488v, ? super C5667g, ? super C4543v, C16807N> f6793f;

    /* renamed from: g  reason: collision with root package name */
    private p<? super Boolean, ? super Long, C16807N> f6794g;

    /* renamed from: h  reason: collision with root package name */
    private t<? super Boolean, ? super C4488v, ? super C5667g, ? super C5667g, ? super Boolean, ? super C4543v, Boolean> f6795h;

    /* renamed from: i  reason: collision with root package name */
    private C17631a<C16807N> f6796i;

    /* renamed from: j  reason: collision with root package name */
    private C17642l<? super Long, C16807N> f6797j;

    /* renamed from: k  reason: collision with root package name */
    private C17642l<? super Long, C16807N> f6798k;

    /* renamed from: l  reason: collision with root package name */
    private final C4899r0 f6799l;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf1/m;", "LH0/L;", "it", "", "a", "(Lf1/m;LH0/L;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<m, L, Long> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6800c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Long invoke(m mVar, L l10) {
            return Long.valueOf(l10.f6791d.get());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/L;", "a", "(J)LH0/L;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Long, L> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6801c = new b();

        b() {
            super(1);
        }

        public final L a(long j10) {
            return new L(j10, (DefaultConstructorMarker) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LH0/L$c;", "", "<init>", "()V", "Lf1/k;", "LH0/L;", "", "Saver", "Lf1/k;", "a", "()Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<L, Long> a() {
            return L.f6787o;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0004"}, d2 = {"LH0/n;", "a", "b", "", "(LH0/n;LH0/n;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<C4536n, C4536n, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4488v f6802c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4488v vVar) {
            super(2);
            this.f6802c = vVar;
        }

        /* renamed from: a */
        public final Integer invoke(C4536n nVar, C4536n nVar2) {
            C4488v x10 = nVar.x();
            C4488v x11 = nVar2.x();
            long E10 = x10 != null ? this.f6802c.E(x10, C5667g.f26701b.c()) : C5667g.f26701b.c();
            long E11 = x11 != null ? this.f6802c.E(x11, C5667g.f26701b.c()) : C5667g.f26701b.c();
            return Integer.valueOf(C5667g.n(E10) == C5667g.n(E11) ? C17035a.e(Float.valueOf(C5667g.m(E10)), Float.valueOf(C5667g.m(E11))) : C17035a.e(Float.valueOf(C5667g.n(E10)), Float.valueOf(C5667g.n(E11))));
        }
    }

    public /* synthetic */ L(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    /* access modifiers changed from: private */
    public static final int x(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public long a() {
        long andIncrement = this.f6791d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f6791d.getAndIncrement();
        }
        return andIncrement;
    }

    public C4536n b(C4536n nVar) {
        if (nVar.h() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + nVar.h()).toString());
        } else if (!this.f6790c.b(nVar.h())) {
            this.f6790c.s(nVar.h(), nVar);
            this.f6789b.add(nVar);
            this.f6788a = false;
            return nVar;
        } else {
            throw new IllegalArgumentException(("Another selectable with the id: " + nVar + ".selectableId has already subscribed.").toString());
        }
    }

    public C5464u<C4538p> c() {
        return (C5464u) this.f6799l.getValue();
    }

    public void d(C4536n nVar) {
        if (this.f6790c.b(nVar.h())) {
            this.f6789b.remove(nVar);
            this.f6790c.p(nVar.h());
            C17642l<? super Long, C16807N> lVar = this.f6798k;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(nVar.h()));
            }
        }
    }

    public void e(C4488v vVar, long j10, C4543v vVar2, boolean z10) {
        r<? super Boolean, ? super C4488v, ? super C5667g, ? super C4543v, C16807N> rVar = this.f6793f;
        if (rVar != null) {
            rVar.l(Boolean.valueOf(z10), vVar, C5667g.d(j10), vVar2);
        }
    }

    public void f(long j10) {
        this.f6788a = false;
        C17642l<? super Long, C16807N> lVar = this.f6792e;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    public void g(long j10) {
        C17642l<? super Long, C16807N> lVar = this.f6797j;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    public boolean h(C4488v vVar, long j10, long j11, boolean z10, C4543v vVar2, boolean z11) {
        t<? super Boolean, ? super C4488v, ? super C5667g, ? super C5667g, ? super Boolean, ? super C4543v, Boolean> tVar = this.f6795h;
        if (tVar == null) {
            return true;
        }
        return tVar.o(Boolean.valueOf(z11), vVar, C5667g.d(j10), C5667g.d(j11), Boolean.valueOf(z10), vVar2).booleanValue();
    }

    public void i() {
        C17631a<C16807N> aVar = this.f6796i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final C5464u<C4536n> m() {
        return this.f6790c;
    }

    public final List<C4536n> n() {
        return this.f6789b;
    }

    public final void o(C17642l<? super Long, C16807N> lVar) {
        this.f6798k = lVar;
    }

    public final void p(C17642l<? super Long, C16807N> lVar) {
        this.f6792e = lVar;
    }

    public final void q(C17642l<? super Long, C16807N> lVar) {
        this.f6797j = lVar;
    }

    public final void r(t<? super Boolean, ? super C4488v, ? super C5667g, ? super C5667g, ? super Boolean, ? super C4543v, Boolean> tVar) {
        this.f6795h = tVar;
    }

    public final void s(C17631a<C16807N> aVar) {
        this.f6796i = aVar;
    }

    public final void t(p<? super Boolean, ? super Long, C16807N> pVar) {
        this.f6794g = pVar;
    }

    public final void u(r<? super Boolean, ? super C4488v, ? super C5667g, ? super C4543v, C16807N> rVar) {
        this.f6793f = rVar;
    }

    public void v(C5464u<C4538p> uVar) {
        this.f6799l.setValue(uVar);
    }

    public final List<C4536n> w(C4488v vVar) {
        if (!this.f6788a) {
            C16877v.C(this.f6789b, new K(new d(vVar)));
            this.f6788a = true;
        }
        return n();
    }

    private L(long j10) {
        this.f6789b = new ArrayList();
        this.f6790c = C5465v.c();
        this.f6791d = new AtomicLong(j10);
        this.f6799l = u1.e(C5465v.a(), (o1) null, 2, (Object) null);
    }

    public L() {
        this(1);
    }
}
