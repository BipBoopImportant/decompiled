package EG;

import OE.n;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import com.sugarcube.core.network.models.StockLevel;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18148c;
import wK.W9;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0005\u000b\u001a\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LEG/b;", "", "<init>", "()V", "LwK/W9;", "a", "LXH/o;", "d", "()LwK/W9;", "buyOptionStatusVariant", "", "c", "()I", "buyOptionIcon", "h", "buyOptionTitle", "Lcom/sugarcube/core/network/models/StockLevel;", "e", "()Lcom/sugarcube/core/network/models/StockLevel;", "buyOptionStockLevel", "f", "buyOptionStockLevelText", "", "g", "()Ljava/lang/String;", "buyOptionStockLocation", "b", "LEG/b$b;", "LEG/b$c;", "LEG/b$d;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EG.b  reason: case insensitive filesystem */
public abstract class C15589b {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f133890a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LEG/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "HOME_DELIVERY", "CLICK_COLLECT", "IN_STORE", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EG.b$a */
    public enum a {
        HOME_DELIVERY,
        CLICK_COLLECT,
        IN_STORE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001 B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"LEG/b$b;", "LEG/b;", "Lcom/sugarcube/core/network/models/StockLevel;", "buyOptionStockLevel", "", "buyOptionStockLocation", "<init>", "(Lcom/sugarcube/core/network/models/StockLevel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sugarcube/core/network/models/StockLevel;", "e", "()Lcom/sugarcube/core/network/models/StockLevel;", "c", "Ljava/lang/String;", "g", "d", "I", "buyOptionIcon", "h", "buyOptionTitle", "f", "buyOptionStockLevelText", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EG.b$b  reason: collision with other inner class name */
    public static final class C3298b extends C15589b {

        /* renamed from: f  reason: collision with root package name */
        public static final a f133891f = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final StockLevel f133892b;

        /* renamed from: c  reason: collision with root package name */
        private final String f133893c;

        /* renamed from: d  reason: collision with root package name */
        private final int f133894d = C18148c.ClickAndCollect.m();

        /* renamed from: e  reason: collision with root package name */
        private final int f133895e = n.f113199F1;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEG/b$b$a;", "", "<init>", "()V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$b$b  reason: collision with other inner class name */
        public /* synthetic */ class C3299b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f133896a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.sugarcube.core.network.models.StockLevel[] r0 = com.sugarcube.core.network.models.StockLevel.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f133896a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: EG.C15589b.C3298b.C3299b.<clinit>():void");
            }
        }

        public C3298b(StockLevel stockLevel, String str) {
            super((DefaultConstructorMarker) null);
            this.f133892b = stockLevel;
            this.f133893c = str;
        }

        public int c() {
            return this.f133894d;
        }

        public StockLevel e() {
            return this.f133892b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3298b)) {
                return false;
            }
            C3298b bVar = (C3298b) obj;
            return this.f133892b == bVar.f133892b && C17542s.e(this.f133893c, bVar.f133893c);
        }

        public int f() {
            StockLevel e10 = e();
            int i10 = e10 == null ? -1 : C3299b.f133896a[e10.ordinal()];
            return i10 != 1 ? i10 != 2 ? n.f113217I1 : n.f113211H1 : n.f113205G1;
        }

        public String g() {
            return this.f133893c;
        }

        public int h() {
            return this.f133895e;
        }

        public int hashCode() {
            StockLevel stockLevel = this.f133892b;
            int i10 = 0;
            int hashCode = (stockLevel == null ? 0 : stockLevel.hashCode()) * 31;
            String str = this.f133893c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            StockLevel stockLevel = this.f133892b;
            String str = this.f133893c;
            return "ClickCollectStockUIState(buyOptionStockLevel=" + stockLevel + ", buyOptionStockLocation=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001 B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"LEG/b$c;", "LEG/b;", "Lcom/sugarcube/core/network/models/StockLevel;", "buyOptionStockLevel", "", "buyOptionStockLocation", "<init>", "(Lcom/sugarcube/core/network/models/StockLevel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sugarcube/core/network/models/StockLevel;", "e", "()Lcom/sugarcube/core/network/models/StockLevel;", "c", "Ljava/lang/String;", "g", "d", "I", "buyOptionIcon", "h", "buyOptionTitle", "f", "buyOptionStockLevelText", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EG.b$c */
    public static final class c extends C15589b {

        /* renamed from: f  reason: collision with root package name */
        public static final a f133897f = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final StockLevel f133898b;

        /* renamed from: c  reason: collision with root package name */
        private final String f133899c;

        /* renamed from: d  reason: collision with root package name */
        private final int f133900d = C18148c.DeliveryTruck.m();

        /* renamed from: e  reason: collision with root package name */
        private final int f133901e = n.f113229K1;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEG/b$c$a;", "", "<init>", "()V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$c$b  reason: collision with other inner class name */
        public /* synthetic */ class C3300b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f133902a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    com.sugarcube.core.network.models.StockLevel[] r0 = com.sugarcube.core.network.models.StockLevel.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f133902a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: EG.C15589b.c.C3300b.<clinit>():void");
            }
        }

        public c(StockLevel stockLevel, String str) {
            super((DefaultConstructorMarker) null);
            this.f133898b = stockLevel;
            this.f133899c = str;
        }

        public int c() {
            return this.f133900d;
        }

        public StockLevel e() {
            return this.f133898b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f133898b == cVar.f133898b && C17542s.e(this.f133899c, cVar.f133899c);
        }

        public int f() {
            StockLevel e10 = e();
            if (e10 == null) {
                return n.f113247N1;
            }
            int i10 = C3300b.f133902a[e10.ordinal()];
            if (i10 == 1) {
                return n.f113235L1;
            }
            if (i10 == 2) {
                return n.f113241M1;
            }
            if (i10 == 3) {
                return n.f113247N1;
            }
            throw new t();
        }

        public String g() {
            return this.f133899c;
        }

        public int h() {
            return this.f133901e;
        }

        public int hashCode() {
            StockLevel stockLevel = this.f133898b;
            int i10 = 0;
            int hashCode = (stockLevel == null ? 0 : stockLevel.hashCode()) * 31;
            String str = this.f133899c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            StockLevel stockLevel = this.f133898b;
            String str = this.f133899c;
            return "HomeDeliveryStockUIState(buyOptionStockLevel=" + stockLevel + ", buyOptionStockLocation=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001 B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"LEG/b$d;", "LEG/b;", "Lcom/sugarcube/core/network/models/StockLevel;", "buyOptionStockLevel", "", "buyOptionStockLocation", "<init>", "(Lcom/sugarcube/core/network/models/StockLevel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sugarcube/core/network/models/StockLevel;", "e", "()Lcom/sugarcube/core/network/models/StockLevel;", "c", "Ljava/lang/String;", "g", "d", "I", "buyOptionIcon", "h", "buyOptionTitle", "f", "buyOptionStockLevelText", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EG.b$d */
    public static final class d extends C15589b {

        /* renamed from: f  reason: collision with root package name */
        public static final a f133903f = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final StockLevel f133904b;

        /* renamed from: c  reason: collision with root package name */
        private final String f133905c;

        /* renamed from: d  reason: collision with root package name */
        private final int f133906d = C18148c.Store.m();

        /* renamed from: e  reason: collision with root package name */
        private final int f133907e = n.f113265Q1;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEG/b$d$a;", "", "<init>", "()V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: EG.b$d$b  reason: collision with other inner class name */
        public /* synthetic */ class C3301b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f133908a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.sugarcube.core.network.models.StockLevel[] r0 = com.sugarcube.core.network.models.StockLevel.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f133908a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: EG.C15589b.d.C3301b.<clinit>():void");
            }
        }

        public d(StockLevel stockLevel, String str) {
            super((DefaultConstructorMarker) null);
            this.f133904b = stockLevel;
            this.f133905c = str;
        }

        public int c() {
            return this.f133906d;
        }

        public StockLevel e() {
            return this.f133904b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f133904b == dVar.f133904b && C17542s.e(this.f133905c, dVar.f133905c);
        }

        public int f() {
            StockLevel e10 = e();
            int i10 = e10 == null ? -1 : C3301b.f133908a[e10.ordinal()];
            return i10 != 1 ? i10 != 2 ? n.f113283T1 : n.f113277S1 : n.f113271R1;
        }

        public String g() {
            return this.f133905c;
        }

        public int h() {
            return this.f133907e;
        }

        public int hashCode() {
            StockLevel stockLevel = this.f133904b;
            int i10 = 0;
            int hashCode = (stockLevel == null ? 0 : stockLevel.hashCode()) * 31;
            String str = this.f133905c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            StockLevel stockLevel = this.f133904b;
            String str = this.f133905c;
            return "ShopInStoreStockUIState(buyOptionStockLevel=" + stockLevel + ", buyOptionStockLocation=" + str + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EG.b$e */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f133909a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.sugarcube.core.network.models.StockLevel[] r0 = com.sugarcube.core.network.models.StockLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.core.network.models.StockLevel r1 = com.sugarcube.core.network.models.StockLevel.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f133909a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: EG.C15589b.e.<clinit>():void");
        }
    }

    public /* synthetic */ C15589b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public static final W9 b(C15589b bVar) {
        StockLevel e10 = bVar.e();
        int i10 = e10 == null ? -1 : e.f133909a[e10.ordinal()];
        return i10 != 1 ? i10 != 2 ? W9.Unavailable : W9.Low : W9.Available;
    }

    public abstract int c();

    public final W9 d() {
        return (W9) this.f133890a.getValue();
    }

    public abstract StockLevel e();

    public abstract int f();

    public abstract String g();

    public abstract int h();

    private C15589b() {
        this.f133890a = C16825p.b(new C15588a(this));
    }
}
