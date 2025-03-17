package bz;

import Ae.e;
import Ae.j;
import Ae.l;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import Nd.c;
import Sy.a;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import ne.C10089a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00152.\u0010\u0014\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00110\u0010\"\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001fJ1\u0010&\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b)\u0010*J-\u00100\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b7\u00103J\u001f\u0010:\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J?\u0010?\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020+2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b?\u0010@J1\u0010E\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ7\u0010I\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010=\u001a\u00020+2\u0006\u0010H\u001a\u00020#H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001dH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020+H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020#H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020#H\u0016¢\u0006\u0004\bS\u0010RJ\u001f\u0010V\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001dH\u0016¢\u0006\u0004\bX\u0010LJ\u000f\u0010Y\u001a\u00020\u001dH\u0016¢\u0006\u0004\bY\u0010LJ\u000f\u0010Z\u001a\u00020\u001dH\u0016¢\u0006\u0004\bZ\u0010LJ\u000f\u0010[\u001a\u00020\u001dH\u0016¢\u0006\u0004\b[\u0010LJ\u000f\u0010\\\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\\\u0010LJ\u000f\u0010]\u001a\u00020\u001dH\u0016¢\u0006\u0004\b]\u0010LJ\u0017\u0010_\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u0012H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u001dH\u0016¢\u0006\u0004\ba\u0010LJ\u000f\u0010b\u001a\u00020\u001dH\u0016¢\u0006\u0004\bb\u0010LJ\u0017\u0010c\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bc\u0010dJ/\u0010f\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020A2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u001dH\u0016¢\u0006\u0004\bh\u0010LJ\u0017\u0010j\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020\u00122\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020\u0012H\u0016¢\u0006\u0004\bq\u0010`J\u0017\u0010r\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020\u0012H\u0016¢\u0006\u0004\br\u0010`J\u001f\u0010t\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u0012H\u0016¢\u0006\u0004\bt\u0010WJ\u000f\u0010u\u001a\u00020\u001dH\u0016¢\u0006\u0004\bu\u0010LJ\u0017\u0010v\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020\u0012H\u0016¢\u0006\u0004\bv\u0010`JG\u0010z\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010=\u001a\u00020+2\u0006\u0010x\u001a\u00020w2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010y\u001a\u00020+2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bz\u0010{J\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b|\u0010WJ\u001f\u0010}\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b}\u0010WJ\u001f\u0010~\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b~\u0010WJ\u001f\u0010\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010WJ\"\u0010\u0001\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010e\u001a\u00020iH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LJ\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LJ\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LJ\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LJ\u001a\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020AH\u0016¢\u0006\u0005\b\u0001\u0010dJ\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LJ\u001a\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010`J\u0011\u0010\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u0001\u0010LR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\bj\u0010\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0007\n\u0005\b}\u0010\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0007\n\u0005\bQ\u0010\u0001¨\u0006\u0001"}, d2 = {"Lbz/a;", "LSy/a;", "LAe/e;", "analytics", "Lne/a;", "adjustTracker", "LNd/c;", "abTesting", "LaA/a;", "sessionManager", "LHl/a;", "wifiConnector", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LAe/e;Lne/a;LNd/c;LaA/a;LHl/a;LFB/a;)V", "", "LXH/v;", "", "", "pairs", "", "Y", "([LXH/v;)Ljava/util/Map;", "Z", "()Ljava/lang/String;", "a0", "LAe/l;", "entryPoint", "LXH/N;", "C", "(LAe/l;)V", "E", "itemId", "productType", "", "manualEntry", "scanType", "r", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "listId", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "numOfSupportedProducts", "numOfUnSupportedProducts", "", "unSupportedProductsId", "T", "(IILjava/util/List;)V", "V", "(II)V", "reason", "x", "(Ljava/lang/String;II)V", "X", "LSy/a$c;", "productAssortmentType", "O", "(Ljava/lang/String;LSy/a$c;)V", "currency", "quantity", "qtyInStock", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILSy/a$c;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LSy/a$d;", "errorSource", "s", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;LSy/a$d;)V", "fullserve", "isFromCart", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "k", "()V", "numberOfItemsInCart", "Q", "(I)V", "hasFullServeItems", "f", "(Z)V", "F", "code", "message", "t", "(Ljava/lang/String;Ljava/lang/String;)V", "W", "w", "I", "a", "g", "L", "itemNo", "A", "(Ljava/lang/String;)V", "p", "d", "e", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "appLocation", "q", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;LSy/a$c;)V", "B", "LSy/a$e;", "b", "(LSy/a$e;)V", "discountCode", "LSy/a$a;", "discountSource", "R", "(Ljava/lang/String;LSy/a$a;)V", "i", "h", "reasonCode", "J", "j", "m", "", "value", "stockQty", "S", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ILSy/a$c;)V", "z", "c", "G", "P", "o", "(Ljava/lang/String;LSy/a$e;)V", "U", "M", "D", "N", "section", "v", "H", "productNo", "u", "n", "LAe/e;", "Lne/a;", "LNd/c;", "LaA/a;", "LHl/a;", "LFB/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bz.a  reason: case insensitive filesystem */
public final class C14015a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f119010a;

    /* renamed from: b  reason: collision with root package name */
    private final C10089a f119011b;

    /* renamed from: c  reason: collision with root package name */
    private final c f119012c;

    /* renamed from: d  reason: collision with root package name */
    private final C13909a f119013d;

    /* renamed from: e  reason: collision with root package name */
    private final Hl.a f119014e;

    /* renamed from: f  reason: collision with root package name */
    private final C12860a f119015f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bz.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C2976a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119016a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Hl.a$a[] r0 = Hl.a.C1585a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hl.a$a r1 = Hl.a.C1585a.CELLULAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Hl.a$a r1 = Hl.a.C1585a.WIFI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Hl.a$a r1 = Hl.a.C1585a.OTHER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f119016a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bz.C14015a.C2976a.<clinit>():void");
        }
    }

    public C14015a(e eVar, C10089a aVar, c cVar, C13909a aVar2, Hl.a aVar3, C12860a aVar4) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "adjustTracker");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar2, "sessionManager");
        C17542s.j(aVar3, "wifiConnector");
        C17542s.j(aVar4, "localStoreSelectionRepository");
        this.f119010a = eVar;
        this.f119011b = aVar;
        this.f119012c = cVar;
        this.f119013d = aVar2;
        this.f119014e = aVar3;
        this.f119015f = aVar4;
    }

    private final Map<String, Object> Y(v<String, ? extends Object>... vVarArr) {
        Map<String, Object> p10 = X.p(C16796C.a("store_id", a0()));
        X.u(p10, vVarArr);
        return p10;
    }

    private final String Z() {
        int i10 = C2976a.f119016a[this.f119014e.a().ordinal()];
        if (i10 == 1) {
            return "Mobile";
        }
        if (i10 == 2) {
            return "Wi-Fi";
        }
        if (i10 == 3) {
            return "Other";
        }
        throw new t();
    }

    private final String a0() {
        C12832d c10 = this.f119015f.c();
        if (c10 != null) {
            return c10.e();
        }
        return null;
    }

    public void A(String str) {
        C17542s.j(str, "itemNo");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", "shopgo_pip")), Interaction$Component.REVIEWS, (e.b) null, 8, (Object) null);
    }

    public void B() {
        this.f119010a.track(j.ACTION_FAIL.b(), X.m(C16796C.a("component", Interaction$Component.FAMILY_MEMBER_NO_FAMILY_CARD.getValue()), C16796C.a("app_location", a.e.SHOP_GO_CART.b())));
    }

    public void C(l lVar) {
        C17542s.j(lVar, "entryPoint");
        if (!C16877v.q(l.CART_BUTTON, l.PROFILE_TOGGLE, l.PTAG, l.QR, l.SEARCH_AND_BROWSE_BUTTON, l.SEARCH_VIEW_BUTTON, l.STORE_PAGE_MENU, l.STORE_PAGE_BUTTON, l.STORE_PAGE_BANNER, l.STORE_PAGE_SHORTCUT, l.LIST_DETAIL).contains(lVar)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a(lVar.b() + " is not a valid EntryPoint", illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C14015a.class.getName();
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
            return;
        }
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", lVar.b())), Interaction$Component.ENABLE_SHOP_AND_GO, (e.b) null, 8, (Object) null);
    }

    public void D() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_FAIL.b(), Y(C16796C.a("connection_type", Z())), Interaction$Component.PRODUCT_DETAILS, (e.b) null, 8, (Object) null);
    }

    public void E(l lVar) {
        C17542s.j(lVar, "entryPoint");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("component_value", lVar.b())), Interaction$Component.START_SHOP_AND_GO, (e.b) null, 8, (Object) null);
    }

    public void F(boolean z10) {
        String b10 = j.SHOP_AND_GO_NOTIFICATION_RECEIVED.b();
        Map<String, Object> Y10 = Y(C16796C.a("connection_type", Z()));
        if (z10) {
            e.c.c(this.f119010a, b10, Y10, Interaction$Component.SHOP_AND_GO_FULLSERVE, (e.b) null, 8, (Object) null);
        } else {
            this.f119010a.track(b10, Y10);
        }
    }

    public void G(String str, String str2) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", a0()), C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("app_location", a.e.SHOP_GO_PIP.b())), Interaction$Component.SHOP_AND_GO_ADD_TO_CART, (e.b) null, 8, (Object) null);
    }

    public void H() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", Interaction$Component.MEASUREMENTS.getValue())), Interaction$Component.PACKAGE_DIMENSIONS, (e.b) null, 8, (Object) null);
    }

    public void I() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_EMAIL_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void J(String str, String str2) {
        C17542s.j(str, "discountCode");
        C17542s.j(str2, "reasonCode");
        e.c.c(this.f119010a, j.SHOP_AND_GO_ACTION_FAIL.b(), Y(C16796C.a("id", str), C16796C.a("reason_code", str2)), Interaction$Component.APPLY_DISCOUNT, (e.b) null, 8, (Object) null);
    }

    public void K(String str, String str2, String str3, int i10, int i11, a.c cVar) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        C17542s.j(str3, "currency");
        C17542s.j(cVar, "productAssortmentType");
        v a10 = C16796C.a("item_id", str);
        v a11 = C16796C.a("product_type", str2);
        v a12 = C16796C.a("quantity", Integer.valueOf(i10));
        v a13 = C16796C.a("currency", str3);
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(a10, a11, a12, a13, C16796C.a("stock_quantity", Integer.valueOf(i11)), C16796C.a("product_assortment_type", cVar.j())), Interaction$Component.SHOP_AND_GO_ADD_TO_CART, (e.b) null, 8, (Object) null);
        c.a.a(this.f119012c, "shopgo_tap_add_to_cart", (Map) null, (Map) null, 6, (Object) null);
    }

    public void L() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_CHECKOUT_CONFIRMATION_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void M() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", "shopgo_pip")), Interaction$Component.PRODUCT_DETAILS, (e.b) null, 8, (Object) null);
    }

    public void N() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("component_value", "retry")), Interaction$Component.PRODUCT_DETAILS, (e.b) null, 8, (Object) null);
    }

    public void O(String str, a.c cVar) {
        C17542s.j(str, "itemId");
        C17542s.j(cVar, "productAssortmentType");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("item_id", str), C16796C.a("product_assortment_type", cVar.j()), C16796C.a("app_location", a.e.PICKING_LIST.b())), Interaction$Component.SHOP_AND_GO_START_PRODUCT_COLLECT_SCANNER, (e.b) null, 8, (Object) null);
        c.a.a(this.f119012c, "start_product_collect_scanner", (Map) null, (Map) null, 6, (Object) null);
    }

    public void P(String str, String str2) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", a0()), C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("app_location", a.e.SHOP_GO_COLLECT_PIP.b())), Interaction$Component.SHOP_AND_GO_COLLECT_ITEM, (e.b) null, 8, (Object) null);
    }

    public void Q(int i10) {
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(C16796C.a("shopgo_article_amt", Integer.valueOf(i10)), C16796C.a("connection_type", Z())), Interaction$Component.SHOP_AND_GO_CHECKOUT_CODE, (e.b) null, 8, (Object) null);
        this.f119011b.a(C14016b.f119017e);
    }

    public void R(String str, a.C2850a aVar) {
        C17542s.j(str, "discountCode");
        C17542s.j(aVar, "discountSource");
        this.f119010a.track(j.SHOP_AND_GO_SCAN_DISCOUNT.b(), Y(C16796C.a("id", str), C16796C.a("barcode_type", aVar.a())));
    }

    public void S(String str, String str2, int i10, double d10, String str3, int i11, a.c cVar) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        C17542s.j(str3, "currency");
        C17542s.j(cVar, "productAssortmentType");
        e eVar = this.f119010a;
        String b10 = j.SHOP_AND_GO_TAP.b();
        e eVar2 = eVar;
        String str4 = b10;
        e.c.c(eVar2, str4, Y(C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("value", Double.valueOf(d10)), C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("currency", str3), C16796C.a("stock_quantity", Integer.valueOf(i11)), C16796C.a("product_assortment_type", cVar.j())), Interaction$Component.SHOP_AND_GO_ADD_TO_CART, (e.b) null, 8, (Object) null);
    }

    public void T(int i10, int i11, List<String> list) {
        C17542s.j(list, "unSupportedProductsId");
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("quanity_not_possible", Integer.valueOf(i11)), C16796C.a("item_id_not_possible", C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null))), Interaction$Component.SHOP_AND_GO_UPPTACKA_TRANSFER_PRODUCTS, (e.b) null, 8, (Object) null);
    }

    public void U() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", a0()), C16796C.a("app_location", a.e.PICKING_LIST.b())), Interaction$Component.SHOP_AND_GO_MARK_ITEM_AS_COLLECTED, (e.b) null, 8, (Object) null);
        c.a.a(this.f119012c, "shopgo_mark_item_as_collected", (Map) null, (Map) null, 6, (Object) null);
    }

    public void V(int i10, int i11) {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("quanity_not_possible", Integer.valueOf(i11))), Interaction$Component.SHOP_AND_GO_UPPTACKA_TRANSFER_PRODUCTS, (e.b) null, 8, (Object) null);
    }

    public void W() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_PICK_UP_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void X(int i10, int i11) {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("quanity_not_possible", Integer.valueOf(i11))), Interaction$Component.SHOP_AND_GO_UPPTACKA_CANCEL_TRANSFER_PRODUCTS, (e.b) null, 8, (Object) null);
    }

    public void a() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_EMAIL_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void b(a.e eVar) {
        C17542s.j(eVar, "appLocation");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", eVar.b())), Interaction$Component.ADD_DISCOUNT_CODE, (e.b) null, 8, (Object) null);
    }

    public void c(String str, String str2) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN.b(), X.m(C16796C.a("store_id", a0()), C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("app_location", a.e.PICKING_LIST.b())), Interaction$Component.SHOP_AND_GO_SCANNER, (e.b) null, 8, (Object) null);
    }

    public void d() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void e(Interaction$Component interaction$Component) {
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(interaction$Component2, "component");
        if (!C16877v.q(Interaction$Component.SCANNER, Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_PROMPT).contains(interaction$Component2)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a(interaction$Component2 + " is not supported.", illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C14015a.class.getName();
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
            return;
        }
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("component_value", interaction$Component.getValue())), Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_BUTTON, (e.b) null, 8, (Object) null);
    }

    public void f(boolean z10) {
        this.f119010a.track(j.SHOP_AND_GO_CHECKOUT_SCANNED.b(), Y(C16796C.a("connection_type", Z())));
    }

    public void g() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_CHECKOUT_CONFIRMATION_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void h(String str) {
        C17542s.j(str, "discountCode");
        e.c.c(this.f119010a, j.SHOP_AND_GO_ACTION_SUCCESS.b(), Y(C16796C.a("id", str)), Interaction$Component.APPLY_DISCOUNT, (e.b) null, 8, (Object) null);
    }

    public void i(String str) {
        C17542s.j(str, "discountCode");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("id", str)), Interaction$Component.APPLY_DISCOUNT, (e.b) null, 8, (Object) null);
    }

    public void j() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(new v[0]), Interaction$Component.ACTIVE_DISCOUNT, (e.b) null, 8, (Object) null);
    }

    public void k() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("is_coworker", Boolean.valueOf(this.f119013d.d()))), Interaction$Component.SHOP_AND_GO_GO_TO_BAG, (e.b) null, 8, (Object) null);
    }

    public void l(String str, String str2, String str3, int i10, boolean z10) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "fullserve");
        C17542s.j(str3, "productType");
        Map<String, Object> Y10 = Y(C16796C.a("item_id", str), C16796C.a("fullserve", str2), C16796C.a("product_type", str3), C16796C.a("quantity", Integer.valueOf(i10)));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : Y10.entrySet()) {
            String str4 = (String) next.getKey();
            Object value = next.getValue();
            v a10 = value != null ? C16796C.a(str4, value) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        Map v10 = X.v(arrayList);
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), v10, z10 ? Interaction$Component.SHOP_AND_GO_ADJUST_QTY_IN_CART : Interaction$Component.SHOP_AND_GO_ADJUST_QTY_IN_SCANNER, (e.b) null, 8, (Object) null);
        if (z10) {
            c.a.a(this.f119012c, "modify_quantity_in_cart", v10, (Map) null, 4, (Object) null);
        } else {
            c.a.a(this.f119012c, "modify_quantity_in_scanner", v10, (Map) null, 4, (Object) null);
        }
    }

    public void m(String str) {
        C17542s.j(str, "discountCode");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("id", str)), Interaction$Component.REMOVE_DISCOUNT, (e.b) null, 8, (Object) null);
    }

    public void n() {
        e.c.c(this.f119010a, j.ACTION_TAP.b(), (Map) null, Interaction$Component.SHOP_AND_GO_STORE_SELECTION, (e.b) null, 10, (Object) null);
    }

    public void o(String str, a.e eVar) {
        C17542s.j(str, "itemId");
        C17542s.j(eVar, "appLocation");
        e.c.c(this.f119010a, j.SHOP_AND_GO_VIEWED.b(), Y(C16796C.a("item_id", str), C16796C.a("app_location", eVar.b())), Interaction$Component.SHOP_AND_GO_ADD_TO_ONLINE_CART, (e.b) null, 8, (Object) null);
    }

    public void p() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_PROMPT_CANCEL, (e.b) null, 8, (Object) null);
    }

    public void q(Interaction$Component interaction$Component, String str, String str2, a.c cVar) {
        C17542s.j(interaction$Component, "appLocation");
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        C17542s.j(cVar, "productAssortmentType");
        this.f119010a.track(j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("component", "add_to_wishlist"), C16796C.a("app_location", interaction$Component.getValue()), C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("product_assortment_type", cVar.j())));
    }

    public void r(String str, String str2, boolean z10, String str3) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        Map<String, Object> Y10 = Y(C16796C.a("connection_type", Z()), C16796C.a("item_id", str), C16796C.a("product_type", str2));
        if (!z10 && str3 != null) {
            Y10.put("barcode_type", str3);
        }
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN.b(), Y10, z10 ? Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY : Interaction$Component.SHOP_AND_GO_SCANNER, (e.b) null, 8, (Object) null);
        this.f119011b.a(new C14017c(str));
    }

    public void s(String str, String str2, Interaction$Component interaction$Component, a.d dVar) {
        C17542s.j(str, "itemId");
        C17542s.j(interaction$Component, "component");
        C17542s.j(dVar, "errorSource");
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN_FAIL.b(), Y(C16796C.a("item_id", str), C16796C.a("connection_type", Z()), C16796C.a("barcode_type", str2), C16796C.a("error_source", dVar.b())), interaction$Component, (e.b) null, 8, (Object) null);
    }

    public void t(String str, String str2) {
        C17542s.j(str, "code");
        C17542s.j(str2, "message");
        this.f119010a.track(j.ACTION_FAIL.b(), Y(C16796C.a("action_name", "transaction"), C16796C.a("response_message", str2), C16796C.a("reason_code", str)));
    }

    public void u(String str) {
        C17542s.j(str, "productNo");
        e eVar = this.f119010a;
        String b10 = j.SHOP_AND_GO_TAP.b();
        Map c10 = X.c();
        c10.put("item_id", str);
        c10.put("app_location", "shopgo_pip");
        C16807N n10 = C16807N.f139792a;
        e.c.c(eVar, b10, X.b(c10), Interaction$Component.CHILD_ITEM, (e.b) null, 8, (Object) null);
    }

    public void v(Interaction$Component interaction$Component) {
        C17542s.j(interaction$Component, "section");
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(C16796C.a("app_location", Interaction$Component.PRODUCT_DETAILS.getValue())), interaction$Component, (e.b) null, 8, (Object) null);
    }

    public void w() {
        e.c.c(this.f119010a, j.SHOP_AND_GO_TAP.b(), Y(new v[0]), Interaction$Component.SHOP_AND_GO_PICK_UP_PROMPT, (e.b) null, 8, (Object) null);
    }

    public void x(String str, int i10, int i11) {
        C17542s.j(str, "reason");
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN_FAIL.b(), Y(C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("quanity_not_possible", Integer.valueOf(i11)), C16796C.a("reason_code", str)), Interaction$Component.SHOP_AND_GO_UPPTACKA_TRANSFER_PRODUCTS, (e.b) null, 8, (Object) null);
    }

    public void y(String str, String str2, String str3) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "productType");
        Map<String, Object> Y10 = Y(C16796C.a("connection_type", Z()), C16796C.a("item_list_id", str), C16796C.a("product_type", str2));
        if (str3 != null) {
            Y10.put("barcode_type", str3);
        }
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN.b(), Y10, Interaction$Component.SHOP_AND_GO_UPPTACKA_HANDOVER, (e.b) null, 8, (Object) null);
    }

    public void z(String str, String str2) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        e.c.c(this.f119010a, j.SHOP_AND_GO_SCAN.b(), X.m(C16796C.a("store_id", a0()), C16796C.a("item_id", str), C16796C.a("product_type", str2), C16796C.a("app_location", a.e.PICKING_LIST.b())), Interaction$Component.SHOP_AND_GO_WRONG_PRODUCT_SCANNED, (e.b) null, 8, (Object) null);
    }
}
