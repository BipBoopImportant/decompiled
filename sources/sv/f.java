package Sv;

import Bv.m;
import KJ.C15985a;
import KJ.C15987c;
import Sv.b;
import Sv.e;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import Yv.C6737e;
import Yv.k;
import Yv.o;
import Yv.s;
import Yv.u;
import Yv.w;
import Yv.y;
import aA.C13910b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010(\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"LSv/f;", "", "<init>", "()V", "LYv/o$a;", "kreativState", "LSv/b;", "h", "(LYv/o$a;)LSv/b;", "LYv/w$a;", "latestListState", "f", "(LYv/w$a;)LSv/b;", "LYv/s$a;", "purchaseHistoryState", "LSv/e$f;", "g", "(LYv/s$a;)LSv/e$f;", "LYv/e$a;", "benefitsContent", "LYv/y$a;", "discountProducts", "LKJ/c;", "LSv/e;", "b", "(LYv/e$a;LYv/y$a;)LKJ/c;", "LYv/k$a;", "familyRewards", "kreativ", "latestList", "purchaseHistory", "LaA/b;", "userState", "c", "(LYv/e$a;LYv/k$a;LYv/o$a;LYv/w$a;LYv/s$a;LYv/y$a;LaA/b;)LKJ/c;", "", "i", "(LYv/o$a;LYv/w$a;LYv/s$a;)Ljava/util/List;", "e", "(LYv/k$a;)Ljava/util/List;", "discounts", "j", "(LYv/y$a;)Ljava/util/List;", "a", "(LYv/e$a;LaA/b;)Ljava/util/List;", "", "isFamily", "d", "(Z)Ljava/util/List;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39977a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSv/f$a;", "", "<init>", "()V", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f39978a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39978a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sv.f.b.<clinit>():void");
        }
    }

    private final b f(w.a aVar) {
        if (aVar instanceof w.a.c) {
            return null;
        }
        if (aVar instanceof w.a.b) {
            return new b.d("latest list loading id");
        }
        if (aVar instanceof w.a.C0718a) {
            c a10 = ((w.a.C0718a) aVar).a();
            return d.f39955a.a(a10.a(), a10.c(), a10.b());
        }
        throw new t();
    }

    private final e.f g(s.a aVar) {
        if ((aVar instanceof Yv.t) || (aVar instanceof s.a.C0716a)) {
            return null;
        }
        if (aVar instanceof s.a.b) {
            return e.f.b.f39974b;
        }
        if (aVar instanceof u) {
            s.b a10 = ((u) aVar).a();
            return new e.f.a(new m(a10.a(), a10.e(), a10.c(), a10.d(), C15985a.l(a10.b())));
        }
        throw new t();
    }

    private final b h(o.a aVar) {
        if ((aVar instanceof o.a.b) || (aVar instanceof o.a.C0711a)) {
            return null;
        }
        if (aVar instanceof o.a.d) {
            return new b.d("latest space loading id");
        }
        if (aVar instanceof o.a.c) {
            o.a.c cVar = (o.a.c) aVar;
            return d.c(d.f39955a, cVar.b(), cVar.a(), (String) null, 4, (Object) null);
        }
        throw new t();
    }

    public final List<e> a(C6737e.a aVar, C13910b bVar) {
        e eVar;
        e.c cVar;
        C17542s.j(aVar, "benefitsContent");
        C17542s.j(bVar, "userState");
        if ((aVar instanceof C6737e.a.C0700a) || (aVar instanceof C6737e.a.b)) {
            return C16877v.n();
        }
        if (aVar instanceof C6737e.a.c) {
            eVar = ((C6737e.a.c) aVar).b();
        } else if (aVar instanceof C6737e.a.d) {
            eVar = ((C6737e.a.d) aVar).b();
        } else {
            throw new t();
        }
        int i10 = b.f39978a[bVar.ordinal()];
        if (i10 == 1) {
            cVar = g.BenefitsGuest.b();
        } else if (i10 == 2) {
            cVar = g.BenefitsRegular.b();
        } else if (i10 == 3) {
            cVar = g.BenefitsFamily.b();
        } else {
            throw new t();
        }
        return C16877v.q(cVar, eVar);
    }

    public final C15987c<e> b(C6737e.a aVar, y.a aVar2) {
        C17542s.j(aVar, "benefitsContent");
        C17542s.j(aVar2, "discountProducts");
        List c10 = C16877v.c();
        c10.addAll(j(aVar2));
        c10.addAll(a(aVar, C13910b.GUEST));
        return C15985a.h(C16877v.a(c10));
    }

    public final C15987c<e> c(C6737e.a aVar, k.a aVar2, o.a aVar3, w.a aVar4, s.a aVar5, y.a aVar6, C13910b bVar) {
        C17542s.j(aVar, "benefitsContent");
        C17542s.j(aVar2, "familyRewards");
        C17542s.j(aVar3, "kreativ");
        C17542s.j(aVar4, "latestList");
        C17542s.j(aVar5, "purchaseHistory");
        C17542s.j(aVar6, "discountProducts");
        C17542s.j(bVar, "userState");
        List c10 = C16877v.c();
        c10.addAll(i(aVar3, aVar4, aVar5));
        c10.addAll(e(aVar2));
        c10.addAll(j(aVar6));
        c10.addAll(a(aVar, bVar));
        c10.addAll(d(bVar == C13910b.FAMILY));
        return C15985a.h(C16877v.a(c10));
    }

    public final List<e> d(boolean z10) {
        return z10 ? C16877v.e(e.b.f39959a) : C16877v.n();
    }

    public final List<e> e(k.a aVar) {
        C17542s.j(aVar, "familyRewards");
        if (aVar instanceof k.a.C0706a) {
            return C16877v.n();
        }
        if (aVar instanceof k.a.b) {
            return C16877v.q(g.FamilyRewards.b(), new e.g(((k.a.b) aVar).a()));
        }
        throw new t();
    }

    public final List<e> i(o.a aVar, w.a aVar2, s.a aVar3) {
        C17542s.j(aVar, "kreativState");
        C17542s.j(aVar2, "latestListState");
        C17542s.j(aVar3, "purchaseHistoryState");
        List c10 = C16877v.c();
        List c11 = C16877v.c();
        b f10 = f(aVar2);
        if (f10 != null) {
            c11.add(f10);
        }
        b h10 = h(aVar);
        if (h10 != null) {
            c11.add(h10);
        }
        List a10 = C16877v.a(c11);
        e.f g10 = g(aVar3);
        Collection collection = a10;
        if (!collection.isEmpty() || g10 != null) {
            c10.add(g.Latest.b());
        }
        if (!collection.isEmpty()) {
            c10.add(new e.d(C15985a.l(a10)));
        }
        if (g10 != null) {
            c10.add(g10);
        }
        return C15985a.l(C16877v.a(c10));
    }

    public final List<e> j(y.a aVar) {
        v<A, B> vVar;
        C17542s.j(aVar, "discounts");
        if (aVar instanceof y.a.C0721a) {
            return C16877v.n();
        }
        if (aVar instanceof y.a.b) {
            vVar = C16796C.a(C16877v.n(), Boolean.TRUE);
        } else if (aVar instanceof y.a.c) {
            vVar = C16796C.a(((y.a.c) aVar).a(), Boolean.FALSE);
        } else {
            throw new t();
        }
        boolean booleanValue = ((Boolean) vVar.b()).booleanValue();
        return C16877v.q(g.MemberDiscounts.b(), new e.C0654e(C15985a.l((List) vVar.a()), booleanValue));
    }
}
