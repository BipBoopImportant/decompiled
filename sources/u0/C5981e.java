package u0;

import XH.C16807N;
import YH.C16877v;
import c2.n;
import c2.r;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n0.C5589L;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.v;
import v0.C6142h;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0019\u001a\u00020\u000e2\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010$\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001e¨\u0006%"}, d2 = {"Lu0/e;", "Lv0/h;", "Lu0/I;", "state", "<init>", "(Lu0/I;)V", "Lu0/s;", "layoutInfo", "", "h", "(Lu0/s;)I", "Lp0/A;", "index", "scrollOffset", "LXH/N;", "e", "(Lp0/A;II)V", "targetIndex", "", "c", "(I)F", "Lkotlin/Function2;", "LdI/e;", "", "block", "d", "(LnI/p;LdI/e;)Ljava/lang/Object;", "a", "Lu0/I;", "g", "()I", "firstVisibleItemIndex", "f", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.e  reason: case insensitive filesystem */
public final class C5981e implements C6142h {

    /* renamed from: a  reason: collision with root package name */
    private final C5974I f29650a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.e$a */
    static final class a extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<C5987k> f29652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, List<? extends C5987k> list) {
            super(1);
            this.f29651c = z10;
            this.f29652d = list;
        }

        public final Integer a(int i10) {
            return Integer.valueOf(this.f29651c ? this.f29652d.get(i10).g() : this.f29652d.get(i10).i());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public C5981e(C5974I i10) {
        this.f29650a = i10;
    }

    private final int h(C5995s sVar) {
        boolean z10 = sVar.a() == v.Vertical;
        List<C5987k> i10 = sVar.i();
        a aVar = new a(z10, i10);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10.size()) {
            int intValue = ((Number) aVar.invoke(Integer.valueOf(i11))).intValue();
            if (intValue == -1) {
                i11++;
            } else {
                int i14 = 0;
                while (i11 < i10.size() && ((Number) aVar.invoke(Integer.valueOf(i11))).intValue() == intValue) {
                    i14 = Math.max(i14, z10 ? r.g(i10.get(i11).a()) : r.h(i10.get(i11).a()));
                    i11++;
                }
                i12 += i14;
                i13++;
            }
        }
        return (i12 / i13) + sVar.g();
    }

    public int a() {
        return this.f29650a.v().f();
    }

    public int b() {
        C5987k kVar = (C5987k) C16877v.K0(this.f29650a.v().i());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    public float c(int i10) {
        C5987k kVar;
        C5995s v10 = this.f29650a.v();
        if (v10.i().isEmpty()) {
            return 0.0f;
        }
        List<C5987k> i11 = v10.i();
        int size = i11.size();
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                kVar = null;
                break;
            }
            kVar = i11.get(i12);
            if (kVar.getIndex() == i10) {
                break;
            }
            i12++;
        }
        C5987k kVar2 = kVar;
        if (kVar2 == null) {
            int F10 = this.f29650a.F();
            int h10 = h(v10);
            int i13 = 1;
            if (i10 < g()) {
                z10 = true;
            }
            int g10 = i10 - g();
            int i14 = F10 - 1;
            if (z10) {
                i13 = -1;
            }
            return ((float) (h10 * ((g10 + (i14 * i13)) / F10))) - ((float) f());
        }
        return (float) (v10.a() == v.Vertical ? n.i(kVar2.c()) : n.h(kVar2.c()));
    }

    public Object d(p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this.f29650a, (C5589L) null, pVar, eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public void e(C5678A a10, int i10, int i11) {
        this.f29650a.M(i10, i11, true);
    }

    public int f() {
        return this.f29650a.s();
    }

    public int g() {
        return this.f29650a.r();
    }
}
