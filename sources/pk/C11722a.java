package pk;

import EB.C12832d;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import Op.C10828d;
import Op.i1;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import bI.C17035a;
import ep.C11256b;
import gB.C14499a;
import gB.C14500b;
import gB.C14501c;
import gB.C14502d;
import gB.C14505g;
import gB.C14506h;
import gB.C14507i;
import ip.o;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.q;
import np.C11664a;
import pk.i;
import pk.l;
import pk.r;
import qx.C14956a;
import qx.C14957b;
import tf.C10253a;
import ug.k;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!*\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020$0\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u001f*\b\u0012\u0004\u0012\u00020$0\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u0004\u0018\u00010\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0012H\u0002¢\u0006\u0004\b+\u0010,JG\u0010/\u001a\"\u0012\u0004\u0012\u00020\u001d\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100-0\u00120.*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100-0\u0012H\u0002¢\u0006\u0004\b/\u00100Jo\u00104\u001a>\u0012\u0004\u0012\u000202\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100- 3*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100-\u0018\u00010\u00120\u001201*\"\u0012\u0004\u0012\u00020\u001d\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100-0\u00120.H\u0002¢\u0006\u0004\b4\u00105JU\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0012*\"\u0012\u0004\u0012\u000202\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100-0\u0012012\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0002¢\u0006\u0004\b9\u0010:JS\u0010F\u001a\u00020D2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010@\u001a\u00020?2\"\u0010E\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020D0A¢\u0006\u0004\bF\u0010GJG\u0010J\u001a\u00020D2\u0006\u0010H\u001a\u00020\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00122\"\u0010E\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020D0A¢\u0006\u0004\bJ\u0010KJ=\u0010L\u001a\b\u0012\u0004\u0012\u0002080\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012¢\u0006\u0004\bL\u0010MJ!\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\bP\u0010QJ+\u0010T\u001a\u00020\u00192\u0006\u0010R\u001a\u00020)2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\bT\u0010UJ)\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010V\u001a\u00020\u00142\u0006\u0010W\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020XH\u0001¢\u0006\u0004\b[\u0010\\J7\u0010`\u001a\u0004\u0018\u00010_2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u001c2\u0006\u0010]\u001a\u00020\u00142\b\u0010^\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\b`\u0010aJ-\u0010g\u001a\u0004\u0018\u00010f2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010c\u001a\u00020\u00142\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bg\u0010hJ+\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u00122\u0006\u0010l\u001a\u00020kH\u0001¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010sR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010e\u001a\u00020d8BX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010w¨\u0006x"}, d2 = {"Lpk/a;", "", "Lep/b;", "localizedDateTimeFormatter", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "LPp/f;", "previousPriceMapper", "Lug/k;", "labsFeatures", "<init>", "(Lep/b;Ltf/a;LIl/a;LPp/f;Lug/k;)V", "LgB/i;", "itemWithDetails", "LWk/f;", "itemAvailability", "", "allAvailabilities", "", "availableInOtherStores", "Lpk/l;", "c", "(LgB/i;LWk/f;Ljava/util/List;Z)Lpk/l;", "Lpk/p;", "d", "()Lpk/p;", "LgB/d;", "", "unit", "", "regularPrice", "LOp/d$l$e;", "q", "(LgB/d;Ljava/lang/String;Ljava/lang/Double;)LOp/d$l$e;", "LgB/h;", "b", "(Ljava/util/List;)D", "a", "(Ljava/util/List;)Ljava/lang/Double;", "LgB/g;", "items", "f", "(Ljava/util/List;)Ljava/lang/String;", "LXH/v;", "Ljava/util/SortedMap;", "g", "(Ljava/util/List;)Ljava/util/SortedMap;", "", "Lpk/i$a;", "kotlin.jvm.PlatformType", "o", "(Ljava/util/SortedMap;)Ljava/util/Map;", "availabilities", "itemsAvailableInOtherStores", "Lpk/i;", "l", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "inStoreModeEnabled", "hasItemsInList", "LEB/d;", "store", "Lpk/r;", "shoppingListMode", "Lkotlin/Function3;", "Lpk/n;", "Lpk/o;", "LXH/N;", "result", "r", "(ZZLEB/d;Lpk/r;LnI/q;)V", "listName", "Lpk/k;", "m", "(Ljava/lang/String;Ljava/util/List;LnI/q;)V", "n", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "stockAvailability", "Lpk/l$a;", "h", "(LWk/f;Z)Lpk/l$a;", "item", "familyPrice", "p", "(LgB/g;LgB/d;LgB/d;)Lpk/p;", "hasFamilyPrice", "isNewItem", "LgB/c;", "priceType", "LOp/d$k;", "j", "(ZZLgB/c;)LOp/d$k;", "isBreathtakingItem", "priceUnitText", "LOp/d$l;", "k", "(LgB/d;LgB/d;ZLjava/lang/String;)LOp/d$l;", "listItemsWithPrices", "isFamilyMember", "Lkp/d;", "currencyConfig", "Lpk/m;", "s", "(Ljava/util/List;ZLkp/d;)Lpk/m;", "Lnp/a;", "environmentalFees", "", "quantity", "LKJ/c;", "LIC/e;", "i", "(Ljava/util/List;I)LKJ/c;", "Lep/b;", "Ltf/a;", "LIl/a;", "LPp/f;", "e", "Lug/k;", "()Lkp/d;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.a  reason: case insensitive filesystem */
public final class C11722a {

    /* renamed from: f  reason: collision with root package name */
    public static final C2369a f100858f = new C2369a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f100859g = 8;

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<v<C14507i, Wk.f>> f100860h = new g(new f(new d(), C17035a.h(C17035a.g())), C17035a.h(C17035a.g()));

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<l.b> f100861i = new i(new h(new e(), C17035a.h(C17035a.g())));

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f100862a;

    /* renamed from: b  reason: collision with root package name */
    private final C10253a f100863b;

    /* renamed from: c  reason: collision with root package name */
    private final a f100864c;

    /* renamed from: d  reason: collision with root package name */
    private final Pp.f f100865d;

    /* renamed from: e  reason: collision with root package name */
    private final k f100866e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpk/a$a;", "", "<init>", "()V", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$a  reason: collision with other inner class name */
    public static final class C2369a {
        public /* synthetic */ C2369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2369a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f100867a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f100868b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f100869c;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|37) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0077 */
        static {
            /*
                com.ingka.ikea.app.stockinfo.network.d[] r0 = com.ingka.ikea.app.stockinfo.network.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.ingka.ikea.app.stockinfo.network.d r3 = com.ingka.ikea.app.stockinfo.network.d.LOW_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.ingka.ikea.app.stockinfo.network.d r4 = com.ingka.ikea.app.stockinfo.network.d.MEDIUM_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                com.ingka.ikea.app.stockinfo.network.d r5 = com.ingka.ikea.app.stockinfo.network.d.HIGH_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.app.stockinfo.network.d r5 = com.ingka.ikea.app.stockinfo.network.d.OTHER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r6 = 5
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.app.stockinfo.network.d r5 = com.ingka.ikea.app.stockinfo.network.d.EMPTY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r6 = 6
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f100867a = r0
                gB.c[] r0 = gB.C14501c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gB.c r5 = gB.C14501c.TRO     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                gB.c r5 = gB.C14501c.NLP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                gB.c r5 = gB.C14501c.FAMILY     // Catch:{ NoSuchFieldError -> 0x005e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                gB.c r3 = gB.C14501c.REGULAR     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f100868b = r0
                np.a$a[] r0 = np.C11664a.C2303a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                np.a$a r3 = np.C11664a.C2303a.ECO     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                np.a$a r1 = np.C11664a.C2303a.WEEE     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                f100869c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.C11722a.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$c */
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e((String) t10, (String) t11);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$d */
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            Wk.f fVar = (Wk.f) ((v) t10).d();
            String str = null;
            String a10 = fVar != null ? fVar.a() : null;
            Wk.f fVar2 = (Wk.f) ((v) t11).d();
            if (fVar2 != null) {
                str = fVar2.a();
            }
            return C17035a.e(a10, str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$e */
    public static final class e<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((l.b) t10).a().b(), ((l.b) t11).a().b());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$f */
    public static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f100870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comparator f100871b;

        public f(Comparator comparator, Comparator comparator2) {
            this.f100870a = comparator;
            this.f100871b = comparator2;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f100870a.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            Comparator comparator = this.f100871b;
            Wk.f fVar = (Wk.f) ((v) t10).d();
            String str = null;
            String b10 = fVar != null ? fVar.b() : null;
            Wk.f fVar2 = (Wk.f) ((v) t11).d();
            if (fVar2 != null) {
                str = fVar2.b();
            }
            return comparator.compare(b10, str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$g */
    public static final class g<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f100872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comparator f100873b;

        public g(Comparator comparator, Comparator comparator2) {
            this.f100872a = comparator;
            this.f100873b = comparator2;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f100872a.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            Comparator comparator = this.f100873b;
            C14500b f10 = ((C14507i) ((v) t10).c()).b().a().f();
            String str = null;
            String f11 = f10 != null ? f10.f() : null;
            C14500b f12 = ((C14507i) ((v) t11).c()).b().a().f();
            if (f12 != null) {
                str = f12.f();
            }
            return comparator.compare(f11, str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$h */
    public static final class h<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f100874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comparator f100875b;

        public h(Comparator comparator, Comparator comparator2) {
            this.f100874a = comparator;
            this.f100875b = comparator2;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f100874a.compare(t10, t11);
            return compare != 0 ? compare : this.f100875b.compare(((l.b) t10).a().c(), ((l.b) t11).a().c());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.a$i */
    public static final class i<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f100876a;

        public i(Comparator comparator) {
            this.f100876a = comparator;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f100876a.compare(t10, t11);
            return compare != 0 ? compare : C17035a.e(((l.b) t10).d(), ((l.b) t11).d());
        }
    }

    public C11722a(C11256b bVar, C10253a aVar, a aVar2, Pp.f fVar, k kVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(fVar, "previousPriceMapper");
        C17542s.j(kVar, "labsFeatures");
        this.f100862a = bVar;
        this.f100863b = aVar;
        this.f100864c = aVar2;
        this.f100865d = fVar;
        this.f100866e = kVar;
    }

    private final Double a(List<C14506h> list) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Double d10 = null;
            if (!it.hasNext()) {
                break;
            }
            C14506h hVar = (C14506h) it.next();
            Iterator it2 = hVar.b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((C14502d) obj).d() != C14501c.FAMILY) {
                    break;
                }
            }
            C14502d dVar = (C14502d) obj;
            Double valueOf = dVar != null ? Double.valueOf(dVar.c()) : null;
            Iterator it3 = hVar.b().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((C14502d) obj2).d() == C14501c.FAMILY) {
                    break;
                }
            }
            C14502d dVar2 = (C14502d) obj2;
            Double valueOf2 = dVar2 != null ? Double.valueOf(dVar2.c()) : null;
            Double valueOf3 = (valueOf == null || valueOf2 == null) ? null : Double.valueOf(valueOf.doubleValue() - valueOf2.doubleValue());
            if (valueOf3 != null) {
                d10 = Double.valueOf(valueOf3.doubleValue() * ((double) hVar.a().g()));
            }
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        Double valueOf4 = Double.valueOf(C16877v.i1(arrayList));
        if (valueOf4.doubleValue() > 0.0d) {
            return valueOf4;
        }
        return null;
    }

    private final double b(List<C14506h> list) {
        Object obj;
        double d10 = 0.0d;
        for (C14506h hVar : list) {
            Iterator it = hVar.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C14502d) obj).d() != C14501c.FAMILY) {
                    break;
                }
            }
            C14502d dVar = (C14502d) obj;
            d10 += (dVar != null ? dVar.c() : 0.0d) * ((double) hVar.a().g());
        }
        return d10;
    }

    private final l c(C14507i iVar, Wk.f fVar, List<Wk.f> list, boolean z10) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterable b10 = iVar.b().b();
        Iterator it = b10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C14502d) obj).d() != C14501c.FAMILY) {
                break;
            }
        }
        C14502d dVar = (C14502d) obj;
        Iterator it2 = b10.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C14502d) obj2).d() == C14501c.FAMILY) {
                break;
            }
        }
        C14502d dVar2 = (C14502d) obj2;
        C14505g a10 = iVar.b().a();
        String b11 = a10.b();
        C14500b f10 = a10.f();
        String f11 = f10 != null ? f10.f() : null;
        C14500b f12 = a10.f();
        String b12 = f12 != null ? f12.b() : null;
        if (b12 == null) {
            b12 = "";
        }
        String a11 = o.a(b12);
        p p10 = p(a10, dVar, dVar2);
        C14500b f13 = a10.f();
        String d10 = f13 != null ? f13.d() : null;
        int g10 = a10.g();
        int h10 = a10.h();
        Iterable<C14499a> a12 = iVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a12, 10));
        for (C14499a aVar : a12) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (C17542s.e(((Wk.f) obj3).f(), aVar.a())) {
                    break;
                }
            }
            Wk.f fVar2 = (Wk.f) obj3;
            String a13 = aVar.a();
            C14500b c10 = aVar.c();
            String f14 = c10 != null ? c10.f() : null;
            String str = f14 == null ? "" : f14;
            C14500b c11 = aVar.c();
            String b13 = c11 != null ? c11.b() : null;
            arrayList.add(new l.b(a13, str, b13 == null ? "" : b13, aVar.d(), aVar.b(), h(fVar2, false)));
        }
        C15990f l10 = C15985a.l(C16877v.g1(arrayList, f100861i));
        l.a h11 = h(fVar, z10);
        boolean z11 = !a10.k();
        boolean z12 = a10.f() == null || (a10.k() && a10.e());
        C15987c<C13023e> i10 = i(a10.a(), a10.g());
        boolean w10 = this.f100864c.w();
        C14500b f15 = a10.f();
        String e10 = f15 != null ? f15.e() : null;
        return new l(b11, f11, a11, p10, d10, g10, h10, l10, h11, z11, z12, i10, w10, e10 == null ? "" : e10);
    }

    private final p d() {
        return new p(0.0d, (List<? extends C13023e>) null, new i1(e()), (C10828d.k) null, (C10828d.l) null, (C13023e) null, (C10828d.c) null);
    }

    private final C11522d e() {
        return this.f100864c.s();
    }

    private final String f(List<C14505g> list) {
        Object obj;
        C14500b f10;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Instant i10 = ((C14505g) obj).i();
                do {
                    Object next = it.next();
                    Instant i11 = ((C14505g) next).i();
                    if (i10.compareTo(i11) < 0) {
                        obj = next;
                        i10 = i11;
                    }
                } while (it.hasNext());
            }
        }
        C14505g gVar = (C14505g) obj;
        if (gVar == null || (f10 = gVar.f()) == null) {
            return null;
        }
        return f10.a();
    }

    private final SortedMap<String, List<v<C14507i, Wk.f>>> g(List<v<C14507i, Wk.f>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Wk.f fVar = (Wk.f) ((v) next).d();
            String i10 = fVar != null ? fVar.i() : null;
            if (i10 == null) {
                i10 = "";
            }
            Object obj = linkedHashMap.get(i10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(i10, obj);
            }
            ((List) obj).add(next);
        }
        return X.i(linkedHashMap, new c());
    }

    private final List<i> l(Map<i.a, ? extends List<v<C14507i, Wk.f>>> map, List<Wk.f> list, List<String> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterable<v> g12 = C16877v.g1((List) entry.getValue(), f100860h);
            ArrayList arrayList = new ArrayList(C16877v.y(g12, 10));
            for (v vVar : g12) {
                C14507i iVar = (C14507i) vVar.a();
                arrayList.add(c(iVar, (Wk.f) vVar.b(), list, list2.contains(iVar.b().a().b())));
            }
            linkedHashMap.put(key, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList2.add(new i((i.a) entry2.getKey(), C15985a.h((List) entry2.getValue())));
        }
        return arrayList2;
    }

    private final Map<i.a, List<v<C14507i, Wk.f>>> o(SortedMap<String, List<v<C14507i, Wk.f>>> sortedMap) {
        C13023e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(sortedMap.size()));
        for (Map.Entry entry : sortedMap.entrySet()) {
            String str = (String) entry.getKey();
            C17542s.g(str);
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null || (eVar = C13026h.c(str)) == null) {
                eVar = C13026h.a(Oo.b.f84349D1);
            }
            linkedHashMap.put(new i.a(eVar), entry.getValue());
        }
        return linkedHashMap;
    }

    private final C10828d.l.e q(C14502d dVar, String str, Double d10) {
        qx.c a10 = C14957b.a(dVar.c(), e());
        String str2 = null;
        qx.c a11 = d10 != null ? C14957b.a(d10.doubleValue(), e()) : null;
        List n10 = C16877v.n();
        if (str != null) {
            str2 = " / " + str;
        }
        return new C10828d.l.e(a11, a10, n10, str2);
    }

    public final l.a h(Wk.f fVar, boolean z10) {
        C13023e eVar;
        String h10;
        com.ingka.ikea.app.stockinfo.network.d dVar = null;
        String b10 = fVar != null ? fVar.b() : null;
        String a10 = fVar != null ? fVar.a() : null;
        if (fVar != null) {
            dVar = fVar.k();
        }
        switch (dVar == null ? -1 : b.f100867a[dVar.ordinal()]) {
            case -1:
            case 5:
            case 6:
                if (fVar == null || (h10 = fVar.h()) == null || (eVar = C13026h.c(h10)) == null) {
                    eVar = C13026h.a(ik.c.f98331W);
                }
                return new l.a.e(eVar);
            case 1:
                return new l.a.c(C13026h.c(fVar.n()), this.f100863b.d(), z10, C13026h.c(fVar.m()), this.f100866e.o(), b10, a10, fVar.i());
            case 2:
                String h11 = fVar.h();
                String m10 = fVar.m();
                return new l.a.d(C13026h.c(h11 + ": " + m10), b10, a10, fVar.i());
            case 3:
            case 4:
                return new l.a.C2375a(C13026h.c(fVar.m()), b10, a10, fVar.i());
            default:
                throw new t();
        }
    }

    public final C15987c<C13023e> i(List<C11664a> list, int i10) {
        int i11;
        C17542s.j(list, "environmentalFees");
        if (!this.f100864c.n()) {
            return C15985a.a();
        }
        Iterable<C11664a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C11664a aVar : iterable) {
            int i12 = b.f100869c[aVar.b().ordinal()];
            if (i12 == 1) {
                i11 = Oo.b.f84778s2;
            } else if (i12 == 2) {
                i11 = Oo.b.f84343C5;
            } else {
                throw new t();
            }
            arrayList.add(C13026h.b(i11, C14956a.f130484a.b(aVar.a() * ((double) i10), this.f100864c.s())));
        }
        return C15985a.l(arrayList);
    }

    public final C10828d.k j(boolean z10, boolean z11, C14501c cVar) {
        C17542s.j(cVar, "priceType");
        if (z10) {
            return C10828d.k.FAMILY_PRICE;
        }
        if (z11) {
            return C10828d.k.NEW_PRODUCT;
        }
        int i10 = b.f100868b[cVar.ordinal()];
        if (i10 == 1) {
            return C10828d.k.TIME_RESTRICTED_OFFER;
        }
        if (i10 == 2) {
            return C10828d.k.NEW_LOWER_PRICE;
        }
        if (i10 == 3 || i10 == 4) {
            return null;
        }
        throw new t();
    }

    public final C10828d.l k(C14502d dVar, C14502d dVar2, boolean z10, String str) {
        Double d10 = null;
        if (dVar2 != null) {
            if (dVar != null) {
                d10 = Double.valueOf(dVar.c());
            }
            return new C10828d.l.b(q(dVar2, str, d10));
        } else if (dVar == null) {
            return null;
        } else {
            if (z10) {
                return new C10828d.l.a(q(dVar, str, Double.valueOf(dVar.c())));
            }
            int i10 = b.f100868b[dVar.d().ordinal()];
            if (i10 == 1) {
                return new C10828d.l.g(q(dVar, str, dVar.b()));
            }
            if (i10 == 2) {
                return new C10828d.l.c(q(dVar, str, Double.valueOf(dVar.c())));
            }
            if (i10 == 3 || i10 == 4) {
                return new C10828d.l.f(q(dVar, str, Double.valueOf(dVar.c())));
            }
            throw new t();
        }
    }

    public final void m(String str, List<C14505g> list, q<? super String, ? super k, ? super Boolean, C16807N> qVar) {
        C17542s.j(str, "listName");
        C17542s.j(list, "items");
        C17542s.j(qVar, "result");
        Collection collection = list;
        qVar.invoke(f(list), new k(str, collection.size()), Boolean.valueOf(!collection.isEmpty()));
    }

    public final List<i> n(List<C14507i> list, List<Wk.f> list2, List<String> list3) {
        Object obj;
        C17542s.j(list, "items");
        C17542s.j(list2, "availabilities");
        C17542s.j(list3, "itemsAvailableInOtherStores");
        Iterable<C14507i> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C14507i iVar : iterable) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((Wk.f) obj).f(), iVar.b().a().b())) {
                    break;
                }
            }
            arrayList.add(C16796C.a(iVar, obj));
        }
        return l(o(g(arrayList)), list2, list3);
    }

    public final p p(C14505g gVar, C14502d dVar, C14502d dVar2) {
        C14502d dVar3;
        List<C13023e> list;
        String c10;
        C14502d dVar4 = dVar;
        C14502d dVar5 = dVar2;
        C17542s.j(gVar, "item");
        if (dVar5 != null) {
            dVar3 = dVar5;
        } else if (dVar4 == null) {
            return d();
        } else {
            dVar3 = dVar4;
        }
        boolean j10 = gVar.j();
        C14500b f10 = gVar.f();
        C10828d.l k10 = k(dVar4, dVar5, j10, f10 != null ? f10.g() : null);
        if (k10 != null) {
            Pp.f fVar = this.f100865d;
            Double b10 = dVar3.b();
            if (b10 == null) {
                b10 = (dVar5 == null || dVar4 == null) ? null : Double.valueOf(dVar.c());
            }
            list = fVar.a(k10, b10, (Double) null, dVar3.a());
        } else {
            list = null;
        }
        double c11 = dVar3.c();
        i1 i1Var = new i1(e());
        C10828d.k j11 = j(dVar5 != null, gVar.l(), dVar3.d());
        LocalDate e10 = dVar3.e();
        C13023e b11 = e10 != null ? C13026h.b(Oo.b.f84609c9, this.f100862a.e(e10, "dd MMM yyyy")) : null;
        C14500b f11 = gVar.f();
        return new p(c11, list, i1Var, j11, k10, b11, (f11 == null || (c10 = f11.c()) == null) ? null : new C10828d.c(new C10828d.C1720d(c10, (String) null)));
    }

    public final void r(boolean z10, boolean z11, C12832d dVar, r rVar, q<? super n, ? super o, ? super Boolean, C16807N> qVar) {
        Object obj;
        C17542s.j(rVar, "shoppingListMode");
        C17542s.j(qVar, "result");
        Object obj2 = null;
        boolean z12 = false;
        if (z11) {
            Object nVar = new n(dVar != null ? dVar.getName() : null, z10);
            if (z10 && dVar != null) {
                obj2 = new o(dVar.getName());
            }
            if (z10 && dVar != null && dVar.f() && C17542s.e(rVar, r.b.f101025a)) {
                z12 = true;
            }
            obj = obj2;
            obj2 = nVar;
        } else {
            obj = null;
        }
        qVar.invoke(obj2, obj, Boolean.valueOf(z12));
    }

    public final m s(List<C14506h> list, boolean z10, C11522d dVar) {
        C17542s.j(list, "listItemsWithPrices");
        C17542s.j(dVar, "currencyConfig");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((C14506h) next).b().isEmpty()) {
                arrayList.add(next);
            }
        }
        double b10 = b(arrayList);
        Double a10 = a(arrayList);
        if (z10) {
            b10 -= a10 != null ? a10.doubleValue() : 0.0d;
        }
        return new m(b10, a10, new i1(dVar), z10, list.size() == arrayList.size());
    }
}
