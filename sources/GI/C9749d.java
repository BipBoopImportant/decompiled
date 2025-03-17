package gi;

import EB.C12832d;
import IC.C13023e;
import IC.C13026h;
import Ph.e;
import SC.L2;
import U0.A1;
import U0.C4899r0;
import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import di.i;
import di.u;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import uK.C18146a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004&!\r\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0014\u0010$\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0001\u0003)*+¨\u0006,"}, d2 = {"Lgi/d;", "Lgi/N;", "<init>", "()V", "Ldi/i;", "k", "()Ldi/i;", "", "i", "()Ljava/lang/String;", "testTag", "LU0/A1;", "", "c", "()LU0/A1;", "expand", "", "d", "()I", "leadingIcon", "LIC/e;", "j", "()LIC/e;", "title", "e", "()Z", "showTrailingIcon", "LSC/L2;", "g", "()LSC/L2;", "statusVariant", "f", "statusText", "a", "availabilityDescription", "h", "supportExpanded", "Lcom/ingka/ikea/analytics/Interaction$Component;", "b", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "Lgi/d$a;", "Lgi/d$b;", "Lgi/d$c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.d  reason: case insensitive filesystem */
public abstract class C9749d implements N {

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001a\u0010)\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001a\u0010(R\u001a\u0010,\u001a\u00020\u00068\u0016XD¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010\rR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001e\u00100R\u001a\u00103\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b!\u0010\u0010R\u001a\u00108\u001a\u0002048\u0016X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001c\u0010>\u001a\u0004\u0018\u0001098\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\u00020\u00138\u0016XD¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\b.\u0010@R\u001a\u0010C\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b#\u0010@R\u0016\u0010F\u001a\u0004\u0018\u00010D8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010ER\u0014\u0010G\u001a\u0002048VX\u0004¢\u0006\u0006\u001a\u0004\b&\u00107R\u0016\u0010J\u001a\u0004\u0018\u00010H8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010I¨\u0006K"}, d2 = {"Lgi/d$a;", "Lgi/d;", "Lgi/d$d;", "onlineAvailabilityStatus", "LEB/d;", "storeSelection", "", "deliveryPrice", "itemNo", "itemType", "<init>", "(Lgi/d$d;LEB/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/d$d;", "getOnlineAvailabilityStatus", "()Lgi/d$d;", "b", "LEB/d;", "getStoreSelection", "()LEB/d;", "c", "Ljava/lang/String;", "getDeliveryPrice", "d", "getItemNo", "e", "getItemType", "Lcom/ingka/ikea/analytics/Interaction$Component;", "f", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "g", "i", "testTag", "LU0/A1;", "h", "LU0/A1;", "()LU0/A1;", "expand", "I", "leadingIcon", "LIC/e;", "j", "LIC/e;", "()LIC/e;", "title", "LIC/e$d;", "k", "LIC/e$d;", "l", "()LIC/e$d;", "availabilityDescription", "Z", "()Z", "supportExpanded", "m", "showTrailingIcon", "LSC/L2;", "()LSC/L2;", "statusVariant", "statusText", "Llm/a$c;", "()Llm/a$c;", "backInStockFulfilment", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.d$a */
    public static final class a extends C9749d {

        /* renamed from: a  reason: collision with root package name */
        private final C1283d f73359a;

        /* renamed from: b  reason: collision with root package name */
        private final C12832d f73360b;

        /* renamed from: c  reason: collision with root package name */
        private final String f73361c;

        /* renamed from: d  reason: collision with root package name */
        private final String f73362d;

        /* renamed from: e  reason: collision with root package name */
        private final String f73363e;

        /* renamed from: f  reason: collision with root package name */
        private final Interaction$Component f73364f = Interaction$Component.PIP_CLICK_COLLECT_AVAILABILITY;

        /* renamed from: g  reason: collision with root package name */
        private final String f73365g = "ONLINE_AVAILABILITY_VIEW_CC";

        /* renamed from: h  reason: collision with root package name */
        private final A1<Boolean> f73366h = new b();

        /* renamed from: i  reason: collision with root package name */
        private final int f73367i = C18146a.f148352a2;

        /* renamed from: j  reason: collision with root package name */
        private final C13023e f73368j = C13026h.a(e.f62853e);

        /* renamed from: k  reason: collision with root package name */
        private final C13023e.d f73369k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f73370l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f73371m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gi.d$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1282a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f73372a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    gi.d$d[] r0 = gi.C9749d.C1283d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gi.d$d r1 = gi.C9749d.C1283d.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gi.d$d r1 = gi.C9749d.C1283d.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    gi.d$d r1 = gi.C9749d.C1283d.MISSING_INPUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    gi.d$d r1 = gi.C9749d.C1283d.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    gi.d$d r1 = gi.C9749d.C1283d.LIMITED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    gi.d$d r1 = gi.C9749d.C1283d.FEATURE_TURNED_OFF     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f73372a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gi.C9749d.a.C1282a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"gi/d$a$b", "LU0/A1;", "", "a", "Z", "d", "()Ljava/lang/Boolean;", "value", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gi.d$a$b */
        public static final class b implements A1<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f73373a;

            b() {
            }

            /* renamed from: d */
            public Boolean getValue() {
                return Boolean.valueOf(this.f73373a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C1283d dVar, C12832d dVar2, String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            Integer num;
            C17542s.j(dVar, "onlineAvailabilityStatus");
            C17542s.j(str2, "itemNo");
            C17542s.j(str3, "itemType");
            C13023e.d dVar3 = null;
            this.f73359a = dVar;
            this.f73360b = dVar2;
            this.f73361c = str;
            this.f73362d = str2;
            this.f73363e = str3;
            switch (C1282a.f73372a[dVar.ordinal()]) {
                case 1:
                    num = Integer.valueOf(e.f62846D);
                    break;
                case 2:
                case 3:
                    num = null;
                    break;
                case 4:
                case 5:
                case 6:
                    num = Integer.valueOf(e.f62847E);
                    break;
                default:
                    throw new t();
            }
            this.f73369k = num != null ? new C13023e.d(num.intValue(), (List) null, 2, (DefaultConstructorMarker) null) : dVar3;
            this.f73371m = !h();
        }

        public Interaction$Component b() {
            return this.f73364f;
        }

        public A1<Boolean> c() {
            return this.f73366h;
        }

        public int d() {
            return this.f73367i;
        }

        public boolean e() {
            return this.f73371m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f73359a == aVar.f73359a && C17542s.e(this.f73360b, aVar.f73360b) && C17542s.e(this.f73361c, aVar.f73361c) && C17542s.e(this.f73362d, aVar.f73362d) && C17542s.e(this.f73363e, aVar.f73363e);
        }

        public C13023e f() {
            return C9750e.e(m(), this.f73359a, this.f73361c, false);
        }

        public L2 g() {
            if (m() != null) {
                return C9750e.f(this.f73359a);
            }
            if (this.f73359a == C1283d.FEATURE_TURNED_OFF) {
                return L2.Indeterminate;
            }
            return null;
        }

        public boolean h() {
            return this.f73370l;
        }

        public int hashCode() {
            int hashCode = this.f73359a.hashCode() * 31;
            C12832d dVar = this.f73360b;
            int i10 = 0;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str = this.f73361c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return ((((hashCode2 + i10) * 31) + this.f73362d.hashCode()) * 31) + this.f73363e.hashCode();
        }

        public String i() {
            return this.f73365g;
        }

        public C13023e j() {
            return this.f73368j;
        }

        /* renamed from: l */
        public C13023e.d a() {
            return this.f73369k;
        }

        public C11550a.c m() {
            C12832d dVar = this.f73360b;
            if (dVar == null || dVar.e().length() == 0) {
                return null;
            }
            return new C11550a.c.b(dVar.e(), dVar.getName());
        }

        public String toString() {
            C1283d dVar = this.f73359a;
            C12832d dVar2 = this.f73360b;
            String str = this.f73361c;
            String str2 = this.f73362d;
            String str3 = this.f73363e;
            return "ClickCollect(onlineAvailabilityStatus=" + dVar + ", storeSelection=" + dVar2 + ", deliveryPrice=" + str + ", itemNo=" + str2 + ", itemType=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\r\u00101R\u001a\u0010\u000e\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00101R\u001a\u0010<\u001a\u0002088\u0016X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b \u0010;R\u001a\u0010>\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b4\u0010\u0014R\u001a\u0010@\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b'\u0010\u0017R\u001a\u0010A\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010B\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b\u001c\u0010.R\u001a\u0010C\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b2\u00101R\u001a\u0010E\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\b)\u00101R\u0016\u0010H\u001a\u0004\u0018\u00010F8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010GR\u0014\u0010I\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010.R\u0016\u0010L\u001a\u0004\u0018\u00010J8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010K¨\u0006M"}, d2 = {"Lgi/d$b;", "Lgi/d;", "LU0/r0;", "", "expand", "Lgi/d$d;", "onlineAvailabilityStatus", "", "postalCode", "areaCode", "deliveryPrice", "LIC/e;", "deliveryTime", "isPupIncludedInDeliveryPrice", "itemNo", "itemType", "isBackInStockEnabled", "<init>", "(LU0/r0;Lgi/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LIC/e;ZLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LU0/r0;", "m", "()LU0/r0;", "b", "Lgi/d$d;", "getOnlineAvailabilityStatus", "()Lgi/d$d;", "c", "Ljava/lang/String;", "getPostalCode", "d", "getAreaCode", "e", "getDeliveryPrice", "f", "LIC/e;", "getDeliveryTime", "()LIC/e;", "g", "Z", "()Z", "h", "n", "i", "o", "j", "p", "Lcom/ingka/ikea/analytics/Interaction$Component;", "k", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "l", "testTag", "I", "leadingIcon", "title", "availabilityDescription", "supportExpanded", "q", "showTrailingIcon", "LSC/L2;", "()LSC/L2;", "statusVariant", "statusText", "Llm/a$c;", "()Llm/a$c;", "backInStockFulfilment", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.d$b */
    public static final class b extends C9749d {

        /* renamed from: r  reason: collision with root package name */
        public static final int f73374r = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C4899r0<Boolean> f73375a;

        /* renamed from: b  reason: collision with root package name */
        private final C1283d f73376b;

        /* renamed from: c  reason: collision with root package name */
        private final String f73377c;

        /* renamed from: d  reason: collision with root package name */
        private final String f73378d;

        /* renamed from: e  reason: collision with root package name */
        private final String f73379e;

        /* renamed from: f  reason: collision with root package name */
        private final C13023e f73380f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f73381g;

        /* renamed from: h  reason: collision with root package name */
        private final String f73382h;

        /* renamed from: i  reason: collision with root package name */
        private final String f73383i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f73384j;

        /* renamed from: k  reason: collision with root package name */
        private final Interaction$Component f73385k = Interaction$Component.PIP_ONLINE_AVAILABILITY;

        /* renamed from: l  reason: collision with root package name */
        private final String f73386l = "ONLINE_AVAILABILITY_VIEW_HD";

        /* renamed from: m  reason: collision with root package name */
        private final int f73387m = C18146a.f148385c3;

        /* renamed from: n  reason: collision with root package name */
        private final C13023e f73388n = C13026h.a(e.f62855g);

        /* renamed from: o  reason: collision with root package name */
        private final C13023e f73389o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f73390p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f73391q;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gi.d$b$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f73392a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    gi.d$d[] r0 = gi.C9749d.C1283d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gi.d$d r1 = gi.C9749d.C1283d.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gi.d$d r1 = gi.C9749d.C1283d.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    gi.d$d r1 = gi.C9749d.C1283d.MISSING_INPUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    gi.d$d r1 = gi.C9749d.C1283d.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    gi.d$d r1 = gi.C9749d.C1283d.LIMITED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    gi.d$d r1 = gi.C9749d.C1283d.FEATURE_TURNED_OFF     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f73392a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gi.C9749d.b.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C4899r0<Boolean> r0Var, C1283d dVar, String str, String str2, String str3, C13023e eVar, boolean z10, String str4, String str5, boolean z11) {
            super((DefaultConstructorMarker) null);
            boolean z12;
            C17542s.j(r0Var, "expand");
            C17542s.j(dVar, "onlineAvailabilityStatus");
            C17542s.j(str4, "itemNo");
            C17542s.j(str5, "itemType");
            this.f73375a = r0Var;
            this.f73376b = dVar;
            this.f73377c = str;
            this.f73378d = str2;
            this.f73379e = str3;
            this.f73380f = eVar;
            this.f73381g = z10;
            this.f73382h = str4;
            this.f73383i = str5;
            this.f73384j = z11;
            int[] iArr = a.f73392a;
            switch (iArr[dVar.ordinal()]) {
                case 1:
                    eVar = C13026h.a(e.f62848F);
                    break;
                case 2:
                    break;
                case 3:
                    eVar = null;
                    break;
                case 4:
                case 5:
                case 6:
                    eVar = C13026h.a(e.f62847E);
                    break;
                default:
                    throw new t();
            }
            this.f73389o = eVar;
            switch (iArr[dVar.ordinal()]) {
                case 1:
                    if (l() != null) {
                        z12 = true;
                        break;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z12 = false;
                    break;
                default:
                    throw new t();
            }
            this.f73390p = z12;
            this.f73391q = !h();
        }

        public C13023e a() {
            return this.f73389o;
        }

        public Interaction$Component b() {
            return this.f73385k;
        }

        public int d() {
            return this.f73387m;
        }

        public boolean e() {
            return this.f73391q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f73375a, bVar.f73375a) && this.f73376b == bVar.f73376b && C17542s.e(this.f73377c, bVar.f73377c) && C17542s.e(this.f73378d, bVar.f73378d) && C17542s.e(this.f73379e, bVar.f73379e) && C17542s.e(this.f73380f, bVar.f73380f) && this.f73381g == bVar.f73381g && C17542s.e(this.f73382h, bVar.f73382h) && C17542s.e(this.f73383i, bVar.f73383i) && this.f73384j == bVar.f73384j;
        }

        public C13023e f() {
            return C9750e.e(l(), this.f73376b, this.f73379e, this.f73381g);
        }

        public L2 g() {
            if (l() != null) {
                return C9750e.f(this.f73376b);
            }
            if (this.f73376b == C1283d.FEATURE_TURNED_OFF) {
                return L2.Indeterminate;
            }
            return null;
        }

        public boolean h() {
            return this.f73390p;
        }

        public int hashCode() {
            int hashCode = ((this.f73375a.hashCode() * 31) + this.f73376b.hashCode()) * 31;
            String str = this.f73377c;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f73378d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f73379e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            C13023e eVar = this.f73380f;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            return ((((((((hashCode4 + i10) * 31) + Boolean.hashCode(this.f73381g)) * 31) + this.f73382h.hashCode()) * 31) + this.f73383i.hashCode()) * 31) + Boolean.hashCode(this.f73384j);
        }

        public String i() {
            return this.f73386l;
        }

        public C13023e j() {
            return this.f73388n;
        }

        public C11550a.c l() {
            String str = this.f73377c;
            if (str != null) {
                return new C11550a.c.C2258c(str, this.f73378d);
            }
            return null;
        }

        /* renamed from: m */
        public C4899r0<Boolean> c() {
            return this.f73375a;
        }

        public String n() {
            return this.f73382h;
        }

        public String o() {
            return this.f73383i;
        }

        public boolean p() {
            return this.f73384j;
        }

        public String toString() {
            C4899r0<Boolean> r0Var = this.f73375a;
            C1283d dVar = this.f73376b;
            String str = this.f73377c;
            String str2 = this.f73378d;
            String str3 = this.f73379e;
            C13023e eVar = this.f73380f;
            boolean z10 = this.f73381g;
            String str4 = this.f73382h;
            String str5 = this.f73383i;
            boolean z11 = this.f73384j;
            return "HomeDelivery(expand=" + r0Var + ", onlineAvailabilityStatus=" + dVar + ", postalCode=" + str + ", areaCode=" + str2 + ", deliveryPrice=" + str3 + ", deliveryTime=" + eVar + ", isPupIncludedInDeliveryPrice=" + z10 + ", itemNo=" + str4 + ", itemType=" + str5 + ", isBackInStockEnabled=" + z11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001$B\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b9\u0010=R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b5\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u0010@R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\b;\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\u00020L8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\b(\u0010NR\u001a\u0010P\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\b>\u0010\u001cR\u001a\u0010R\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010Q\u001a\u0004\b/\u0010\u001fR\u001a\u0010S\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\bA\u0010@R\u001c\u0010W\u001a\u0004\u0018\u00010T8\u0016X\u0004¢\u0006\f\n\u0004\bE\u0010U\u001a\u0004\bG\u0010VR\u001a\u0010Y\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bX\u00102\u001a\u0004\b1\u00104R\u0017\u0010\\\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bZ\u00102\u001a\u0004\b[\u00104R\u0017\u0010]\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\b]\u00104R\u0017\u0010^\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\bX\u00104R\u0017\u0010_\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\bZ\u00104R\u0016\u0010b\u001a\u0004\u0018\u00010`8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010a¨\u0006c"}, d2 = {"Lgi/d$c;", "Lgi/d;", "LU0/r0;", "", "expand", "LEB/d;", "storeSelection", "", "itemNo", "itemType", "isBackInStockEnabled", "Lgi/d$c$a;", "status", "isLongTermShortage", "LSC/L2;", "statusVariant", "LIC/e;", "statusText", "stockQuantityDetails", "", "Ldi/u;", "listOfArticleLocations", "supportExpanded", "Lgi/l;", "inStoreNavigationModel", "<init>", "(LU0/r0;LEB/d;Ljava/lang/String;Ljava/lang/String;ZLgi/d$c$a;ZLSC/L2;LIC/e;LIC/e;Ljava/util/List;ZLgi/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LU0/r0;", "n", "()LU0/r0;", "b", "LEB/d;", "v", "()LEB/d;", "c", "Ljava/lang/String;", "p", "d", "q", "e", "Z", "w", "()Z", "f", "Lgi/d$c$a;", "getStatus", "()Lgi/d$c$a;", "g", "y", "h", "LSC/L2;", "()LSC/L2;", "i", "LIC/e;", "()LIC/e;", "j", "u", "k", "Ljava/util/List;", "r", "()Ljava/util/List;", "l", "m", "Lgi/l;", "o", "()Lgi/l;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "testTag", "I", "leadingIcon", "title", "", "Ljava/lang/Void;", "()Ljava/lang/Void;", "availabilityDescription", "s", "showTrailingIcon", "t", "x", "isInStock", "isOutOfStock", "showNotifyMeButton", "showStoreDetailsButton", "Llm/a$c;", "()Llm/a$c;", "backInStockFulfilment", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.d$c */
    public static final class c extends C9749d {

        /* renamed from: a  reason: collision with root package name */
        private final C4899r0<Boolean> f73393a;

        /* renamed from: b  reason: collision with root package name */
        private final C12832d f73394b;

        /* renamed from: c  reason: collision with root package name */
        private final String f73395c;

        /* renamed from: d  reason: collision with root package name */
        private final String f73396d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f73397e;

        /* renamed from: f  reason: collision with root package name */
        private final a f73398f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f73399g;

        /* renamed from: h  reason: collision with root package name */
        private final L2 f73400h;

        /* renamed from: i  reason: collision with root package name */
        private final C13023e f73401i;

        /* renamed from: j  reason: collision with root package name */
        private final C13023e f73402j;

        /* renamed from: k  reason: collision with root package name */
        private final List<u> f73403k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f73404l;

        /* renamed from: m  reason: collision with root package name */
        private final C9757l f73405m;

        /* renamed from: n  reason: collision with root package name */
        private final Interaction$Component f73406n = Interaction$Component.IN_STOCK;

        /* renamed from: o  reason: collision with root package name */
        private final String f73407o = "STORE_AVAILABILITY_VIEW";

        /* renamed from: p  reason: collision with root package name */
        private final int f73408p = C18146a.f148378bc;

        /* renamed from: q  reason: collision with root package name */
        private final C13023e f73409q = C13026h.a(e.f62856h);

        /* renamed from: r  reason: collision with root package name */
        private final Void f73410r;

        /* renamed from: s  reason: collision with root package name */
        private final boolean f73411s;

        /* renamed from: t  reason: collision with root package name */
        private final boolean f73412t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f73413u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f73414v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f73415w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgi/d$c$a;", "", "<init>", "(Ljava/lang/String;I)V", "IS_IN_STOCK", "OUT_OF_STOCK", "UNDEFINED", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gi.d$c$a */
        public enum a {
            IS_IN_STOCK,
            OUT_OF_STOCK,
            UNDEFINED;

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C4899r0<Boolean> r0Var, C12832d dVar, String str, String str2, boolean z10, a aVar, boolean z11, L2 l22, C13023e eVar, C13023e eVar2, List<u> list, boolean z12, C9757l lVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(r0Var, "expand");
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            C17542s.j(aVar, "status");
            C17542s.j(eVar, "statusText");
            C17542s.j(list, "listOfArticleLocations");
            this.f73393a = r0Var;
            this.f73394b = dVar;
            this.f73395c = str;
            this.f73396d = str2;
            this.f73397e = z10;
            this.f73398f = aVar;
            this.f73399g = z11;
            this.f73400h = l22;
            this.f73401i = eVar;
            this.f73402j = eVar2;
            this.f73403k = list;
            this.f73404l = z12;
            this.f73405m = lVar;
            boolean z13 = false;
            this.f73411s = dVar == null;
            this.f73412t = aVar == a.IS_IN_STOCK;
            boolean z14 = aVar == a.OUT_OF_STOCK;
            this.f73413u = z14;
            this.f73414v = z14 && w();
            this.f73415w = (!z14 || !w()) ? true : z13;
        }

        public /* bridge */ /* synthetic */ C13023e a() {
            return (C13023e) l();
        }

        public Interaction$Component b() {
            return this.f73406n;
        }

        public int d() {
            return this.f73408p;
        }

        public boolean e() {
            return this.f73411s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f73393a, cVar.f73393a) && C17542s.e(this.f73394b, cVar.f73394b) && C17542s.e(this.f73395c, cVar.f73395c) && C17542s.e(this.f73396d, cVar.f73396d) && this.f73397e == cVar.f73397e && this.f73398f == cVar.f73398f && this.f73399g == cVar.f73399g && this.f73400h == cVar.f73400h && C17542s.e(this.f73401i, cVar.f73401i) && C17542s.e(this.f73402j, cVar.f73402j) && C17542s.e(this.f73403k, cVar.f73403k) && this.f73404l == cVar.f73404l && C17542s.e(this.f73405m, cVar.f73405m);
        }

        public C13023e f() {
            return this.f73401i;
        }

        public L2 g() {
            return this.f73400h;
        }

        public boolean h() {
            return this.f73404l;
        }

        public int hashCode() {
            int hashCode = this.f73393a.hashCode() * 31;
            C12832d dVar = this.f73394b;
            int i10 = 0;
            int hashCode2 = (((((((((((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f73395c.hashCode()) * 31) + this.f73396d.hashCode()) * 31) + Boolean.hashCode(this.f73397e)) * 31) + this.f73398f.hashCode()) * 31) + Boolean.hashCode(this.f73399g)) * 31;
            L2 l22 = this.f73400h;
            int hashCode3 = (((hashCode2 + (l22 == null ? 0 : l22.hashCode())) * 31) + this.f73401i.hashCode()) * 31;
            C13023e eVar = this.f73402j;
            int hashCode4 = (((((hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f73403k.hashCode()) * 31) + Boolean.hashCode(this.f73404l)) * 31;
            C9757l lVar = this.f73405m;
            if (lVar != null) {
                i10 = lVar.hashCode();
            }
            return hashCode4 + i10;
        }

        public String i() {
            return this.f73407o;
        }

        public C13023e j() {
            return this.f73409q;
        }

        public Void l() {
            return this.f73410r;
        }

        public C11550a.c m() {
            C12832d dVar = this.f73394b;
            if (dVar == null || dVar.e().length() == 0) {
                return null;
            }
            return new C11550a.c.C2255a(dVar.e(), dVar.getName());
        }

        /* renamed from: n */
        public C4899r0<Boolean> c() {
            return this.f73393a;
        }

        public final C9757l o() {
            return this.f73405m;
        }

        public String p() {
            return this.f73395c;
        }

        public String q() {
            return this.f73396d;
        }

        public final List<u> r() {
            return this.f73403k;
        }

        public final boolean s() {
            return this.f73414v;
        }

        public final boolean t() {
            return this.f73415w;
        }

        public String toString() {
            C4899r0<Boolean> r0Var = this.f73393a;
            C12832d dVar = this.f73394b;
            String str = this.f73395c;
            String str2 = this.f73396d;
            boolean z10 = this.f73397e;
            a aVar = this.f73398f;
            boolean z11 = this.f73399g;
            L2 l22 = this.f73400h;
            C13023e eVar = this.f73401i;
            C13023e eVar2 = this.f73402j;
            List<u> list = this.f73403k;
            boolean z12 = this.f73404l;
            C9757l lVar = this.f73405m;
            return "InStore(expand=" + r0Var + ", storeSelection=" + dVar + ", itemNo=" + str + ", itemType=" + str2 + ", isBackInStockEnabled=" + z10 + ", status=" + aVar + ", isLongTermShortage=" + z11 + ", statusVariant=" + l22 + ", statusText=" + eVar + ", stockQuantityDetails=" + eVar2 + ", listOfArticleLocations=" + list + ", supportExpanded=" + z12 + ", inStoreNavigationModel=" + lVar + ")";
        }

        public final C13023e u() {
            return this.f73402j;
        }

        public final C12832d v() {
            return this.f73394b;
        }

        public boolean w() {
            return this.f73397e;
        }

        public final boolean x() {
            return this.f73412t;
        }

        public final boolean y() {
            return this.f73399g;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lgi/d$d;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "UNAVAILABLE", "LIMITED", "NOT_SUPPORTED", "FEATURE_TURNED_OFF", "MISSING_INPUT", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.d$d  reason: collision with other inner class name */
    public enum C1283d {
        AVAILABLE,
        UNAVAILABLE,
        LIMITED,
        NOT_SUPPORTED,
        FEATURE_TURNED_OFF,
        MISSING_INPUT;

        static {
            C1283d[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public /* synthetic */ C9749d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C13023e a();

    public abstract Interaction$Component b();

    public abstract A1<Boolean> c();

    public abstract int d();

    public abstract boolean e();

    public abstract C13023e f();

    public abstract L2 g();

    public abstract boolean h();

    public abstract String i();

    public abstract C13023e j();

    public final i k() {
        return new i(d(), j(), e(), g(), f(), a(), h());
    }

    private C9749d() {
    }
}
