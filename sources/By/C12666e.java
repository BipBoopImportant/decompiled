package By;

import Dw.C12792a;
import HJ.C15854t;
import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import JC.C13068a;
import Jy.g;
import Jy.j;
import Jy.k;
import Jy.l;
import Jy.n;
import Jy.o;
import Jy.p;
import Jy.q;
import Md.b;
import My.i;
import Ny.f;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.C16877v;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dl.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import qx.C14956a;
import rz.C15014g;
import rz.C15026t;
import rz.C15031y;
import rz.E;
import rz.K;
import rz.r;
import tK.C18010a;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J%\u0010)\u001a\u0004\u0018\u00010(2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u0004\u0018\u00010(2\u0006\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u00101J#\u00106\u001a\u0004\u0018\u00010&2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J9\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000f*\b\u0012\u0004\u0012\u0002080\u000f2\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010\u00182\u0006\u0010<\u001a\u00020\nH\u0002¢\u0006\u0004\b>\u0010?J5\u0010A\u001a\b\u0012\u0004\u0012\u00020=0\u000f2\f\u0010@\u001a\b\u0012\u0004\u0012\u0002080\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u00182\u0006\u0010<\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\b\u0012\u0004\u0012\u00020=0\u000f2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002080\u000fH\u0002¢\u0006\u0004\bD\u0010EJ#\u0010G\u001a\b\u0012\u0004\u0012\u00020=0\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002080\u000fH\u0002¢\u0006\u0004\bG\u0010EJ?\u0010K\u001a\u00020I2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002080\u000f2\u0006\u0010:\u001a\u0002092\u0018\u0010J\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u000f\u0012\u0004\u0012\u00020I0HH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ!\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bW\u0010XJ+\u0010\\\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010Y*\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0010[\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\\\u0010]J}\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010:\u001a\u0002092\u0006\u0010U\u001a\u00020T2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u000f2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010a\u001a\u0004\u0018\u00010RH\u0000¢\u0006\u0004\bb\u0010cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006h"}, d2 = {"LBy/e;", "", "LNy/f;", "cartPresentationToCartModelMapper", "LBy/a;", "cartDisclaimerBuilder", "<init>", "(LNy/f;LBy/a;)V", "Lrz/E;", "totalPricing", "", "showTotalPricesInclVat", "LJy/r;", "j", "(Lrz/E;Z)LJy/r;", "", "Lrz/r;", "discounts", "Lkp/d;", "currencyConfig", "LJy/k;", "h", "(Ljava/util/List;Lkp/d;)Ljava/util/List;", "isCouponEnabled", "", "numberOfCoupons", "LJy/a;", "q", "(ZI)LJy/a;", "isEnabled", "isCoWorkerDiscountApplied", "LMd/b;", "f", "(ZZ)LMd/b;", "e", "(I)LJy/a;", "", "storeName", "LJy/n;", "familyHeader", "Ldl/r;", "v", "(Ljava/lang/String;LJy/n;)Ldl/r;", "showPriceDisclaimer", "Ldl/r$a;", "u", "(Z)Ldl/r$a;", "shownInCombinedCart", "r", "(Z)Ldl/r;", "", "totalFamilySavings", "Lrz/K;", "profileState", "s", "(Ljava/lang/Double;Lrz/K;)LJy/n;", "LJy/o$a;", "LJy/j$a;", "sortBy", "estimatedWaitingTime", "isTimeSlotManagementEnabled", "LJy/o;", "w", "(Ljava/util/List;LJy/j$a;Ljava/lang/Integer;Z)Ljava/util/List;", "fullserveNonCollectedProducts", "g", "(Ljava/util/List;Ljava/lang/Integer;Z)Ljava/util/List;", "unavailableProducts", "k", "(Ljava/util/List;)Ljava/util/List;", "uncollectedProducts", "l", "Lkotlin/Function1;", "LXH/N;", "addSections", "n", "(Ljava/util/List;LJy/j$a;LnI/l;)V", "Lrz/y;", "productPickupType", "LJy/o$b;", "m", "(Lrz/y;)LJy/o$b;", "LDw/a;", "order", "LMy/i;", "settings", "LJy/p;", "t", "(LDw/a;LMy/i;)LJy/p;", "E", "", "item", "d", "(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Boolean;", "Lrz/g;", "cartItems", "itemsUpdateQuantity", "ongoingOrder", "i", "(LJy/j$a;LMy/i;Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;Lrz/E;ZLjava/util/List;LDw/a;)Ljava/util/List;", "a", "LNy/f;", "b", "LBy/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: By.e  reason: case insensitive filesystem */
public final class C12666e {

    /* renamed from: a  reason: collision with root package name */
    private final f f108216a;

    /* renamed from: b  reason: collision with root package name */
    private final C12662a f108217b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: By.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f108218a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f108219b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f108220c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        static {
            /*
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                rz.y r2 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                rz.y r3 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                rz.y r4 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                rz.y r5 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f108218a = r0
                Jy.j$a[] r0 = Jy.j.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Jy.j$a r5 = Jy.j.a.AISLE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                Jy.j$a r5 = Jy.j.a.RECENTLY_ADDED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f108219b = r0
                Dw.c[] r0 = Dw.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Dw.c r5 = Dw.c.PREPARING     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                Dw.c r1 = Dw.c.READY_FOR_PICKUP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                Dw.c r1 = Dw.c.COLLECTED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                Dw.c r1 = Dw.c.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f108220c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: By.C12666e.a.<clinit>():void");
        }
    }

    public C12666e(f fVar, C12662a aVar) {
        C17542s.j(fVar, "cartPresentationToCartModelMapper");
        C17542s.j(aVar, "cartDisclaimerBuilder");
        this.f108216a = fVar;
        this.f108217b = aVar;
    }

    private final <E> Boolean d(List<E> list, E e10) {
        if (e10 != null) {
            return Boolean.valueOf(list.add(e10));
        }
        return null;
    }

    private final Jy.a e(int i10) {
        C13023e.c cVar = null;
        if (i10 > 0) {
            cVar = new C13023e.c(Oo.a.f84308c, C13020b.a(i10), C16877v.e(Integer.valueOf(i10)), (DefaultConstructorMarker) null);
        }
        return new Jy.a(cVar);
    }

    private final b f(boolean z10, boolean z11) {
        if (z10) {
            return new b(z11, C13026h.a(C13068a.f111213j), C13026h.a(C13068a.f111211h));
        }
        return null;
    }

    private final List<o> g(List<? extends o.a> list, Integer num, boolean z10) {
        List c10 = C16877v.c();
        if (!list.isEmpty()) {
            if (z10) {
                o.b bVar = new o.b(C13026h.a(C12674m.f108297p), C13026h.a(C12674m.f108295o), C13026h.a(C12674m.f108273d), o.b.a.C2710b.f111454a);
                double d10 = 0.0d;
                for (o.a g10 : list) {
                    d10 += g10.g().e();
                }
                c10.add(new g(bVar, list, d10));
            } else {
                c10.add(new o.b(C13026h.a(C12674m.f108296o0), (C13023e) null, C13026h.a(C12674m.f108273d), o.b.a.C2710b.f111454a, 2, (DefaultConstructorMarker) null));
                c10.add(new q(num));
                c10.addAll(list);
            }
        }
        return C16877v.a(c10);
    }

    private final List<k> h(List<r> list, C11522d dVar) {
        if (dVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Currency config needs to exist");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C12666e.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return C16877v.n();
        }
        Iterable iterable = list;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (Object next2 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            r rVar = (r) next2;
            double abs = Math.abs(rVar.b());
            arrayList2.add(new k(i10, rVar.c(), abs == 0.0d ? "" : C14956a.f130484a.a(abs, dVar)));
            i10 = i11;
        }
        return arrayList2;
    }

    private final Jy.r j(E e10, boolean z10) {
        double d10 = 0.0d;
        double c10 = e10 != null ? e10.c() : 0.0d;
        if (e10 != null) {
            d10 = e10.b();
        }
        return new Jy.r(c10, d10, z10);
    }

    private final List<o> k(List<? extends o.a> list) {
        List c10 = C16877v.c();
        if (!list.isEmpty()) {
            c10.add(new o.b(C13026h.a(C12674m.f108294n0), (C13023e) null, C13026h.a(C12674m.f108279g), o.b.a.d.f111456a, 2, (DefaultConstructorMarker) null));
            Iterable<o.a> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (o.a aVar : iterable) {
                arrayList.add(new o.a.e(aVar.g(), aVar.i(), false));
            }
            c10.addAll(arrayList);
            c10.add(new l("UnavailableProductsSectionDivider", 0, 2, (DefaultConstructorMarker) null));
        }
        return C16877v.a(c10);
    }

    private final List<o> l(List<? extends o.a> list) {
        List c10 = C16877v.c();
        Collection collection = list;
        if (!collection.isEmpty()) {
            c10.add(m(C15031y.CASH_AND_CARRY));
            c10.addAll(collection);
            c10.add(new l("UncollectedCashAndCarryProductsSectionDivider", 0, 2, (DefaultConstructorMarker) null));
        }
        return C16877v.a(c10);
    }

    private final o.b m(C15031y yVar) {
        return new o.b(C13026h.a(yVar == C15031y.CASH_AND_CARRY ? C12674m.f108256P : C12674m.f108281h), (C13023e) null, C13026h.a(C12674m.f108275e), new o.b.a.C2709a(yVar), 2, (DefaultConstructorMarker) null);
    }

    private final void n(List<? extends o.a> list, j.a aVar, C17642l<? super List<? extends o>, C16807N> lVar) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(m(C15031y.SELF_SERVE));
            arrayList.add(new j(aVar));
            int i10 = a.f108219b[aVar.ordinal()];
            if (i10 == 1) {
                list = C16877v.g1(list, C17035a.c(new C12664c(), new C12665d()));
            } else if (i10 != 2) {
                throw new t();
            }
            arrayList.addAll(list);
            arrayList.add(new l("UncollectedSelfServeProductsSectionDivider", 0, 2, (DefaultConstructorMarker) null));
            if (!arrayList.isEmpty()) {
                lVar.invoke(arrayList);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final Comparable o(o.a aVar) {
        C17542s.j(aVar, "it");
        C15026t c10 = aVar.g().c();
        C15026t.a aVar2 = c10 instanceof C15026t.a ? (C15026t.a) c10 : null;
        if (aVar2 != null) {
            return aVar2.a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final Comparable p(o.a aVar) {
        C17542s.j(aVar, "it");
        C15026t c10 = aVar.g().c();
        C15026t.a aVar2 = c10 instanceof C15026t.a ? (C15026t.a) c10 : null;
        if (aVar2 != null) {
            return aVar2.b();
        }
        return null;
    }

    private final Jy.a q(boolean z10, int i10) {
        if (z10) {
            return e(i10);
        }
        return null;
    }

    private final dl.r r(boolean z10) {
        return this.f108217b.a(z10);
    }

    private final n s(Double d10, K k10) {
        if (d10 == null || (k10 instanceof K.a.C3233a)) {
            return null;
        }
        return new n(d10.doubleValue(), k10);
    }

    private final p t(C12792a aVar, i iVar) {
        int i10 = a.f108220c[aVar.d().c().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return new p(aVar.c(), aVar.d(), iVar.i());
        }
        if (i10 == 3 || i10 == 4) {
            return null;
        }
        throw new t();
    }

    private final r.a u(boolean z10) {
        if (!z10) {
            return null;
        }
        return new r.a(C12674m.f108304s0, (String) null, (Integer) null, (Integer) null, r.c.BodyMedium, C18010a.f147428l, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1998, (DefaultConstructorMarker) null);
    }

    private final dl.r v(String str, n nVar) {
        int i10 = 0;
        String str2 = !(str == null || str.length() == 0) ? str : null;
        if (str2 == null) {
            return null;
        }
        r.c cVar = r.c.H2;
        if (nVar == null) {
            i10 = 16;
        }
        return new r.d(str2, (String) null, (Integer) null, (Integer) null, cVar, 0, 28, 16, 28, Integer.valueOf(i10), (Integer) null, 1070, (DefaultConstructorMarker) null);
    }

    private final List<o> w(List<? extends o.a> list, j.a aVar, Integer num, boolean z10) {
        Iterator it;
        Iterator it2;
        Iterator it3;
        Integer num2 = num;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (((o.a) next).g().j()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v vVar = new v(arrayList, arrayList2);
        List list2 = (List) vVar.a();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Object next2 : (List) vVar.b()) {
            if (((o.a) next2).g().b()) {
                arrayList6.add(next2);
            } else {
                arrayList7.add(next2);
            }
        }
        v vVar2 = new v(arrayList6, arrayList7);
        List list3 = (List) vVar2.a();
        Iterator it4 = ((List) vVar2.b()).iterator();
        while (it4.hasNext()) {
            o.a aVar2 = (o.a) it4.next();
            int i10 = a.f108218a[aVar2.g().i().ordinal()];
            if (i10 == 1) {
                it = it4;
                arrayList4.add(aVar2);
            } else if (i10 == 2 || i10 == 3) {
                it = it4;
                arrayList5.add(aVar2);
            } else if (i10 != 4) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Other product types are not presented in cart");
                e eVar = e.ERROR;
                ArrayList arrayList8 = new ArrayList();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar, false)) {
                        arrayList8.add(next3);
                    }
                }
                Iterator it5 = arrayList8.iterator();
                String str = null;
                String str2 = null;
                while (it5.hasNext()) {
                    C11819b bVar = (C11819b) it5.next();
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = list.getClass().getName();
                        C17542s.g(name);
                        it2 = it4;
                        it3 = it5;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it2 = it4;
                        it3 = it5;
                    }
                    String str3 = str2;
                    bVar.a(eVar, str3, false, illegalArgumentException, str);
                    str2 = str3;
                    it4 = it2;
                    it5 = it3;
                }
                it = it4;
            } else {
                it = it4;
                arrayList3.add(aVar2);
            }
            it4 = it;
        }
        ArrayList arrayList9 = new ArrayList();
        if (z10) {
            arrayList9.addAll(g(arrayList3, num2, true));
            arrayList9.add(new l("FullServeProductsSectionDivider", 0, 2, (DefaultConstructorMarker) null));
        }
        arrayList9.addAll(k(list2));
        arrayList9.addAll(l(arrayList5));
        n(arrayList4, aVar, new C12663b(arrayList9));
        Collection collection = list3;
        boolean isEmpty = collection.isEmpty();
        boolean isEmpty2 = C16877v.V0(C16877v.V0(C16877v.V0(arrayList4, arrayList5), list2), arrayList3).isEmpty();
        if (!isEmpty && !isEmpty2) {
            arrayList9.add(new o.b(C13026h.a(C12674m.f108292m0), (C13023e) null, C13026h.a(C12674m.f108277f), o.b.a.c.f111455a, 2, (DefaultConstructorMarker) null));
        }
        if (!isEmpty) {
            arrayList9.addAll(collection);
            arrayList9.add(new l("CollectedProductsSectionDivider", 0, 2, (DefaultConstructorMarker) null));
        }
        if (!z10) {
            arrayList9.addAll(g(arrayList3, num2, false));
        }
        return arrayList9;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(List list, List list2) {
        C17542s.j(list2, "it");
        list.addAll(list2);
        return C16807N.f139792a;
    }

    public final List<Object> i(j.a aVar, i iVar, List<C15014g> list, List<C15014g> list2, int i10, Integer num, E e10, boolean z10, List<rz.r> list3, C12792a aVar2) {
        C17542s.j(aVar, "sortBy");
        C17542s.j(iVar, "settings");
        C17542s.j(list, "cartItems");
        C17542s.j(list2, "itemsUpdateQuantity");
        C17542s.j(list3, "discounts");
        Iterable<C15014g> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15014g a10 : iterable) {
            arrayList.add(this.f108216a.a(a10, list2));
        }
        List<o> w10 = w(arrayList, aVar, num, iVar.j());
        n s10 = s(e10 != null ? e10.a() : null, iVar.b());
        List c10 = C16877v.c();
        d(c10, v(iVar.f(), s10));
        if (aVar2 != null) {
            d(c10, t(aVar2, iVar));
        }
        d(c10, s10);
        c10.addAll(w10);
        d(c10, q(iVar.h(), i10));
        d(c10, f(iVar.g(), z10));
        c10.addAll(h(list3, iVar.a()));
        d(c10, j(e10, iVar.d()));
        d(c10, u(iVar.c()));
        d(c10, r(iVar.e()));
        return C16877v.a(c10);
    }
}
