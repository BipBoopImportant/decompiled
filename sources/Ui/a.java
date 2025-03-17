package ui;

import Fn.a;
import Fn.b;
import Fn.c;
import Fn.h;
import Ln.d;
import Ln.e;
import Ln.f;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11523e;
import np.C11664a;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000b*\b\u0012\u0004\u0012\u00020 0\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.¨\u00060"}, d2 = {"Lui/a;", "Lpp/c;", "Lsi/a;", "LFn/b$b;", "<init>", "()V", "LFn/a$b;", "LLn/d;", "b", "(LFn/a$b;)LLn/d;", "LFn/a$c;", "", "LFn/a$c$b;", "fees", "LLn/f;", "i", "(LFn/a$c;Ljava/util/List;)LLn/f;", "LFn/a$c$g;", "LLn/f$b;", "j", "(LFn/a$c$g;)LLn/f$b;", "LFn/a$c$d;", "Lnp/b;", "g", "(LFn/a$c$d;)Lnp/b;", "Lnp/a;", "f", "(LFn/a$c$b;)Lnp/a;", "LFn/h;", "LLn/e;", "c", "(LFn/h;)LLn/e;", "LFn/h$b;", "Lkp/e;", "d", "(Ljava/util/List;)Ljava/util/List;", "LFn/h$c;", "LLn/e$b;", "h", "(LFn/h$c;)LLn/e$b;", "LFn/a$c$a;", "LLn/f$a;", "e", "(LFn/a$c$a;)LLn/f$a;", "remote", "k", "(LFn/b$b;)Lsi/a;", "a", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11769c<si.a, b.C1565b> {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lui/a$a;", "LLn/e;", "LLn/e$a;", "currentPrice", "", "totalSavings", "familySavings", "upsellFamilySavings", "<init>", "(LLn/e$a;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/e$a;", "b", "()LLn/e$a;", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "d", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ui.a$a  reason: collision with other inner class name */
    private static final class C1423a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final e.a f77136a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f77137b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f77138c;

        /* renamed from: d  reason: collision with root package name */
        private final Double f77139d;

        public C1423a(e.a aVar, Double d10, Double d11, Double d12) {
            C17542s.j(aVar, "currentPrice");
            this.f77136a = aVar;
            this.f77137b = d10;
            this.f77138c = d11;
            this.f77139d = d12;
        }

        public Double a() {
            return this.f77138c;
        }

        public e.a b() {
            return this.f77136a;
        }

        public Double c() {
            return this.f77137b;
        }

        public Double d() {
            return this.f77139d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1423a)) {
                return false;
            }
            C1423a aVar = (C1423a) obj;
            return C17542s.e(this.f77136a, aVar.f77136a) && C17542s.e(this.f77137b, aVar.f77137b) && C17542s.e(this.f77138c, aVar.f77138c) && C17542s.e(this.f77139d, aVar.f77139d);
        }

        public int hashCode() {
            int hashCode = this.f77136a.hashCode() * 31;
            Double d10 = this.f77137b;
            int i10 = 0;
            int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f77138c;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f77139d;
            if (d12 != null) {
                i10 = d12.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            e.a aVar = this.f77136a;
            Double d10 = this.f77137b;
            Double d11 = this.f77138c;
            Double d12 = this.f77139d;
            return "CaasCartPriceImpl(currentPrice=" + aVar + ", totalSavings=" + d10 + ", familySavings=" + d11 + ", upsellFamilySavings=" + d12 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f77140a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f77141b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f77142c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f77143d;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0076 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        static {
            /*
                Fn.a$c$e$a[] r0 = Fn.a.c.e.C1563a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Fn.a$c$e$a r2 = Fn.a.c.e.C1563a.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Fn.a$c$e$a r3 = Fn.a.c.e.C1563a.TRO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f77140a = r0
                Fn.a$c$g[] r0 = Fn.a.c.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fn.a$c$g r3 = Fn.a.c.g.METER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Fn.a$c$g r3 = Fn.a.c.g.PIECE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f77141b = r0
                Fn.a$c$b$a[] r0 = Fn.a.c.b.C1556a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fn.a$c$b$a r3 = Fn.a.c.b.C1556a.ECO     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                Fn.a$c$b$a r3 = Fn.a.c.b.C1556a.WEEE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                f77142c = r0
                Fn.a$c$a$a[] r0 = Fn.a.c.C1554a.C1555a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fn.a$c$a$a r3 = Fn.a.c.C1554a.C1555a.AREA     // Catch:{ NoSuchFieldError -> 0x005c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.METERWARE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.MULTIPACK     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.PIECE     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.VOLUME     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.WEIGHT     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                Fn.a$c$a$a r1 = Fn.a.c.C1554a.C1555a.WEIGHTWARE     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                f77143d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ui.a.b.<clinit>():void");
        }
    }

    private final d b(a.b bVar) {
        d.a aVar;
        String e10 = bVar.e();
        String f10 = bVar.f();
        int g10 = bVar.g();
        Integer b10 = bVar.b();
        a.c.e.C1563a e11 = bVar.c().e();
        int i10 = e11 == null ? -1 : b.f77140a[e11.ordinal()];
        if (i10 == -1) {
            aVar = null;
        } else if (i10 == 1) {
            aVar = d.a.NEW_LOWER_PRICE;
        } else if (i10 == 2) {
            aVar = d.a.TRO;
        } else {
            throw new t();
        }
        return new d(e10, f10, g10, aVar, bVar.c().h(), bVar.c().b(), bVar.c().c(), bVar.c().a(), bVar.c().f(), bVar.c().d(), bVar.c().g(), i(bVar.d(), bVar.a()), b10);
    }

    private final e c(h hVar) {
        e.b h10 = h(hVar.a().c());
        h.c d10 = hVar.a().d();
        e.b bVar = null;
        e.b h11 = d10 != null ? h(d10) : null;
        List<C11523e> d11 = d(hVar.a().b());
        h.c a10 = hVar.a().a();
        if (a10 != null) {
            bVar = h(a10);
        }
        return new C1423a(new e.a(h10, h11, d11, bVar), hVar.c(), hVar.b(), hVar.d());
    }

    private final List<C11523e> d(List<h.b> list) {
        Iterable<h.b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (h.b bVar : iterable) {
            arrayList.add(new C11523e(bVar.a(), bVar.b(), bVar.c()));
        }
        return arrayList;
    }

    private final f.a e(a.c.C1554a aVar) {
        f.a.C1666a aVar2;
        switch (b.f77143d[aVar.a().ordinal()]) {
            case 1:
                aVar2 = f.a.C1666a.AREA;
                break;
            case 2:
                aVar2 = f.a.C1666a.METERWARE;
                break;
            case 3:
                aVar2 = f.a.C1666a.MULTIPACK;
                break;
            case 4:
                aVar2 = f.a.C1666a.PIECE;
                break;
            case 5:
                aVar2 = f.a.C1666a.VOLUME;
                break;
            case 6:
                aVar2 = f.a.C1666a.WEIGHT;
                break;
            case 7:
                aVar2 = f.a.C1666a.WEIGHTWARE;
                break;
            default:
                throw new t();
        }
        return new f.a(aVar2, aVar.c(), aVar.b());
    }

    private final C11664a f(a.c.b bVar) {
        C11664a.C2303a aVar;
        int i10 = b.f77142c[bVar.b().ordinal()];
        if (i10 == 1) {
            aVar = C11664a.C2303a.ECO;
        } else if (i10 == 2) {
            aVar = C11664a.C2303a.WEEE;
        } else {
            throw new t();
        }
        return new C11664a(aVar, bVar.a());
    }

    private final np.b g(a.c.d dVar) {
        return new np.b(dVar.a(), dVar.b());
    }

    private final e.b h(h.c cVar) {
        return new e.b(cVar.b(), cVar.a(), cVar.c());
    }

    private final f i(a.c cVar, List<a.c.b> list) {
        ArrayList arrayList;
        String g10 = cVar.g();
        String f10 = cVar.f();
        String e10 = cVar.e();
        a.c.C1554a a10 = cVar.a();
        f.a e11 = a10 != null ? e(a10) : null;
        String c10 = cVar.c();
        String b10 = cVar.b();
        f.b j10 = j(cVar.h());
        Iterable<a.c.d> d10 = cVar.d();
        ArrayList arrayList2 = new ArrayList(C16877v.y(d10, 10));
        for (a.c.d g11 : d10) {
            arrayList2.add(g(g11));
        }
        if (list != null) {
            Iterable<a.c.b> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (a.c.b f11 : iterable) {
                arrayList.add(f(f11));
            }
        } else {
            arrayList = null;
        }
        return new f(g10, f10, e10, e11, arrayList, c10, b10, j10, arrayList2);
    }

    private final f.b j(a.c.g gVar) {
        int i10 = b.f77141b[gVar.ordinal()];
        if (i10 == 1) {
            return f.b.METER;
        }
        if (i10 == 2) {
            return f.b.PIECE;
        }
        throw new t();
    }

    /* renamed from: k */
    public si.a a(b.C1565b bVar) {
        C17542s.j(bVar, "remote");
        Ln.a aVar = new Ln.a(bVar.d().a(), bVar.d().b());
        Iterable<a.b> b10 = bVar.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (a.b b11 : b10) {
            arrayList.add(b(b11));
        }
        h c10 = bVar.c();
        e c11 = c10 != null ? c(c10) : null;
        Iterable<c> a10 = bVar.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a10, 10));
        for (c cVar : a10) {
            arrayList2.add(new Ln.c(cVar.a(), cVar.b(), cVar.c() == c.a.FAMILY_ONLY));
        }
        return new si.a(aVar, arrayList, c11, (Ln.c) C16877v.y0(arrayList2));
    }
}
