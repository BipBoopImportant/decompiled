package H0;

import XH.C16807N;
import XH.t;
import j0.C5462s;
import j0.C5464u;
import j0.C5465v;
import j0.H;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0+2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b5\u0010@R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010<R\u0014\u0010H\u001a\u00020E8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010N\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010JR\u0014\u0010O\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010JR\u0014\u0010Q\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006R"}, d2 = {"LH0/j;", "LH0/C;", "Lj0/s;", "selectableIdToInfoListIndex", "", "LH0/o;", "infoList", "", "startSlot", "endSlot", "", "isStartHandle", "LH0/p;", "previousSelection", "<init>", "(Lj0/s;Ljava/util/List;IIZLH0/p;)V", "other", "r", "(LH0/j;)Z", "Lj0/H;", "selection", "info", "minOffset", "maxOffset", "LXH/N;", "o", "(Lj0/H;LH0/p;LH0/o;II)V", "slot", "isStartSlot", "t", "(IZ)I", "isMinimumSlot", "s", "", "id", "p", "(J)I", "Lkotlin/Function1;", "block", "f", "(LnI/l;)V", "d", "(LH0/C;)Z", "Lj0/u;", "k", "(LH0/p;)Lj0/u;", "", "toString", "()Ljava/lang/String;", "a", "Lj0/s;", "getSelectableIdToInfoListIndex", "()Lj0/s;", "b", "Ljava/util/List;", "getInfoList", "()Ljava/util/List;", "c", "I", "m", "()I", "g", "e", "Z", "()Z", "LH0/p;", "i", "()LH0/p;", "size", "LH0/e;", "h", "()LH0/e;", "crossStatus", "l", "()LH0/o;", "startInfo", "j", "endInfo", "currentInfo", "firstInfo", "q", "lastInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.j  reason: case insensitive filesystem */
final class C4532j implements C {

    /* renamed from: a  reason: collision with root package name */
    private final C5462s f6944a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C4537o> f6945b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6946c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6947d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6948e;

    /* renamed from: f  reason: collision with root package name */
    private final C4538p f6949f;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.j$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6950a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                H0.e[] r0 = H0.C4527e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                H0.e r1 = H0.C4527e.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                H0.e r1 = H0.C4527e.NOT_CROSSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                H0.e r1 = H0.C4527e.CROSSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6950a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: H0.C4532j.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/o;", "info", "LXH/N;", "a", "(LH0/o;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.j$b */
    static final class b extends C17544u implements C17642l<C4537o, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4532j f6951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H<C4538p> f6952d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4538p f6953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4532j jVar, H<C4538p> h10, C4538p pVar) {
            super(1);
            this.f6951c = jVar;
            this.f6952d = h10;
            this.f6953e = pVar;
        }

        public final void a(C4537o oVar) {
            this.f6951c.o(this.f6952d, this.f6953e, oVar, 0, oVar.l());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4537o) obj);
            return C16807N.f139792a;
        }
    }

    public C4532j(C5462s sVar, List<C4537o> list, int i10, int i11, boolean z10, C4538p pVar) {
        this.f6944a = sVar;
        this.f6945b = list;
        this.f6946c = i10;
        this.f6947d = i11;
        this.f6948e = z10;
        this.f6949f = pVar;
        if (list.size() <= 1) {
            throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.').toString());
        }
    }

    /* access modifiers changed from: private */
    public final void o(H<C4538p> h10, C4538p pVar, C4537o oVar, int i10, int i11) {
        C4538p m10 = pVar.d() ? oVar.m(i11, i10) : oVar.m(i10, i11);
        if (i10 <= i11) {
            h10.o(oVar.h(), m10);
            return;
        }
        throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + m10).toString());
    }

    private final int p(long j10) {
        try {
            return this.f6944a.b(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException("Invalid selectableId: " + j10, e10);
        }
    }

    private final boolean r(C4532j jVar) {
        if (a() != jVar.a()) {
            return true;
        }
        int size = this.f6945b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f6945b.get(i10).n(jVar.f6945b.get(i10))) {
                return true;
            }
        }
        return false;
    }

    private final int s(int i10, boolean z10) {
        return (i10 - (z10 ^ true ? 1 : 0)) / 2;
    }

    private final int t(int i10, boolean z10) {
        int i11 = a.f6950a[h().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new t();
                } else if (z10) {
                    z10 = false;
                }
            }
            return s(i10, z10);
        }
        z10 = true;
        return s(i10, z10);
    }

    public int a() {
        return this.f6945b.size();
    }

    public boolean b() {
        return this.f6948e;
    }

    public C4537o c() {
        return b() ? l() : j();
    }

    public boolean d(C c10) {
        if (!(i() == null || c10 == null || !(c10 instanceof C4532j))) {
            C4532j jVar = (C4532j) c10;
            return (b() == jVar.b() && m() == jVar.m() && g() == jVar.g() && !r(jVar)) ? false : true;
        }
    }

    public C4537o e() {
        return h() == C4527e.CROSSED ? j() : l();
    }

    public void f(C17642l<? super C4537o, C16807N> lVar) {
        int p10 = p(e().h());
        int p11 = p(q().h());
        int i10 = p10 + 1;
        if (i10 < p11) {
            while (i10 < p11) {
                lVar.invoke(this.f6945b.get(i10));
                i10++;
            }
        }
    }

    public int g() {
        return this.f6947d;
    }

    public C4527e h() {
        return m() < g() ? C4527e.NOT_CROSSED : m() > g() ? C4527e.CROSSED : this.f6945b.get(m() / 2).d();
    }

    public C4538p i() {
        return this.f6949f;
    }

    public C4537o j() {
        return this.f6945b.get(t(g(), false));
    }

    public C5464u<C4538p> k(C4538p pVar) {
        if (pVar.e().e() != pVar.c().e()) {
            H c10 = C5465v.c();
            o(c10, pVar, e(), (pVar.d() ? pVar.c() : pVar.e()).d(), e().l());
            f(new b(this, c10, pVar));
            o(c10, pVar, q(), 0, (pVar.d() ? pVar.e() : pVar.c()).d());
            return c10;
        } else if ((pVar.d() && pVar.e().d() >= pVar.c().d()) || (!pVar.d() && pVar.e().d() <= pVar.c().d())) {
            return C5465v.b(pVar.e().e(), pVar);
        } else {
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + pVar).toString());
        }
    }

    public C4537o l() {
        return this.f6945b.get(t(m(), true));
    }

    public int m() {
        return this.f6946c;
    }

    public C4537o q() {
        return h() == C4527e.CROSSED ? l() : j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiSelectionLayout(isStartHandle=");
        sb2.append(b());
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = (float) 2;
        sb2.append(((float) (m() + 1)) / f10);
        sb2.append(", endPosition=");
        sb2.append(((float) (g() + 1)) / f10);
        sb2.append(", crossed=");
        sb2.append(h());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[\n\t");
        List<C4537o> list = this.f6945b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C4537o oVar = list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(oVar);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String sb5 = sb3.toString();
        C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb5);
        sb2.append(')');
        return sb2.toString();
    }
}
