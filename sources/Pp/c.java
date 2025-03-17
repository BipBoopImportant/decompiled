package Pp;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Op.C10828d;
import Pp.d;
import XH.t;
import YH.C16877v;
import ep.C11256b;
import ip.o;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import np.C11664a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000  2\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LPp/c;", "", "Lep/b;", "dateFormatter", "LPp/h;", "unitPriceTextMapper", "LPp/f;", "previousPriceMapper", "LPp/g;", "priceMapper", "LPp/b;", "feeMapper", "<init>", "(Lep/b;LPp/h;LPp/f;LPp/g;LPp/b;)V", "LPp/d$a;", "LOp/d$i;", "b", "(LPp/d$a;)LOp/d$i;", "", "a", "(LPp/d$a;)Ljava/lang/String;", "itemToMap", "LOp/d$h;", "c", "(LPp/d$a;)LOp/d$h;", "Lep/b;", "LPp/h;", "LPp/f;", "d", "LPp/g;", "e", "LPp/b;", "f", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f85641f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f85642g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f85643a;

    /* renamed from: b  reason: collision with root package name */
    private final h f85644b;

    /* renamed from: c  reason: collision with root package name */
    private final f f85645c;

    /* renamed from: d  reason: collision with root package name */
    private final g f85646d;

    /* renamed from: e  reason: collision with root package name */
    private final b f85647e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp/c$a;", "", "<init>", "()V", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85648a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f85649b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Pp.d$a$b[] r0 = Pp.d.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Pp.d$a$b r2 = Pp.d.a.b.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Pp.d$a$b r2 = Pp.d.a.b.TRO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f85648a = r0
                Pp.d$a$c$a$a[] r0 = Pp.d.a.c.C1734a.C1735a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Pp.d$a$c$a$a r2 = Pp.d.a.c.C1734a.C1735a.MULTIPACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                f85649b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pp.c.b.<clinit>():void");
        }
    }

    public c(C11256b bVar, h hVar, f fVar, g gVar, b bVar2) {
        C17542s.j(bVar, "dateFormatter");
        C17542s.j(hVar, "unitPriceTextMapper");
        C17542s.j(fVar, "previousPriceMapper");
        C17542s.j(gVar, "priceMapper");
        C17542s.j(bVar2, "feeMapper");
        this.f85643a = bVar;
        this.f85644b = hVar;
        this.f85645c = fVar;
        this.f85646d = gVar;
        this.f85647e = bVar2;
    }

    private final String a(d.a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.i().g());
        String f10 = aVar.i().f();
        if (f10 != null && !C15854t.v0(f10)) {
            sb2.append(", ");
            sb2.append(aVar.i().f());
        }
        return o.a(sb2.toString());
    }

    private final C10828d.i b(d.a aVar) {
        if (aVar.o()) {
            return new C10828d.i(C10828d.k.FAMILY_PRICE);
        }
        d.a.b h10 = aVar.h();
        int i10 = h10 == null ? -1 : b.f85648a[h10.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return new C10828d.i(C10828d.k.NEW_LOWER_PRICE);
        }
        if (i10 == 2) {
            return new C10828d.i(C10828d.k.TIME_RESTRICTED_OFFER);
        }
        throw new t();
    }

    public final C10828d.h c(d.a aVar) {
        C13023e eVar;
        C17542s.j(aVar, "itemToMap");
        C10828d.i b10 = b(aVar);
        List<C11664a> c10 = aVar.i().c();
        List<C13023e> a10 = c10 != null ? this.f85647e.a(c10, aVar.l()) : null;
        C13023e a11 = this.f85644b.a(aVar);
        C10828d.l a12 = this.f85646d.a(aVar.o(), aVar.h(), aVar.e(), aVar.c());
        List<C13023e> a13 = this.f85645c.a(a12, aVar.c(), aVar.d(), aVar.g());
        String n10 = aVar.n();
        if (n10 != null) {
            int i10 = Oo.b.f84609c9;
            C11256b bVar = this.f85643a;
            LocalDate parse = LocalDate.parse(n10);
            C17542s.i(parse, "parse(...)");
            eVar = C13026h.b(i10, bVar.e(parse, "d MMM, yyyy"));
        } else {
            eVar = null;
        }
        String h10 = aVar.i().h();
        String a14 = a(aVar);
        aVar.i().a();
        List c11 = C16877v.c();
        if (a10 != null) {
            c11.addAll(a10);
        }
        if (a11 != null) {
            c11.add(a11);
        }
        c11.addAll(a13);
        if (eVar != null) {
            c11.add(eVar);
        }
        C15987c h11 = C15985a.h(C16877v.a(c11));
        String b11 = aVar.b();
        String b12 = aVar.i().b();
        if (b12 == null || C15854t.v0(b12)) {
            b12 = null;
        }
        return new C10828d.h(b10, (C13023e) null, h10, a14, (C13023e) null, a12, b12 != null ? new C10828d.c(new C10828d.C1720d(b12, (String) null)) : null, h11, b11, 2, (DefaultConstructorMarker) null);
    }
}
