package dz;

import TJ.C16532g;
import XH.C16807N;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import dI.C17164e;
import eI.C17187b;
import fz.C14488a;
import fz.C14494g;
import fz.C14496i;
import gz.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15026t;
import rz.C15031y;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJN\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b#\u0010$J\"\u0010'\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H@¢\u0006\u0004\b'\u0010(J(\u0010)\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b)\u0010*J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H@¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0/H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b2\u0010$J \u00105\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u000203H@¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b7\u0010$J \u00108\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u001aH@¢\u0006\u0004\b:\u0010.J \u0010<\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0018H@¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0/H\u0016¢\u0006\u0004\b>\u00101J\u001a\u0010?\u001a\u0004\u0018\u00010,2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b?\u0010$J\u0018\u0010@\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020,H@¢\u0006\u0004\b@\u0010AJ\u001e\u0010C\u001a\u00020\u001a2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0+H@¢\u0006\u0004\bC\u0010DR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Ldz/b;", "Ldz/a;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "database", "Lfz/g;", "productDao", "Lfz/a;", "cartDao", "Lfz/i;", "scanTypeDao", "<init>", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;Lfz/g;Lfz/a;Lfz/i;)V", "", "barcode", "", "quantity", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productLiteRemote", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "quantityPickerDataModel", "Lrz/y;", "type", "Lrz/t;", "itemLocation", "", "collect", "LXH/N;", "t", "(Ljava/lang/String;ILcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;Lrz/y;Lrz/t;ZLdI/e;)Ljava/lang/Object;", "Lgz/e;", "scannedItem", "s", "(Ljava/lang/String;ILrz/y;Lrz/t;Lgz/e;ZLdI/e;)Ljava/lang/Object;", "r", "(Lgz/e;IZLdI/e;)Ljava/lang/Object;", "j", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "item", "h", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;LdI/e;)Ljava/lang/Object;", "g", "(Ljava/lang/String;IZLdI/e;)Ljava/lang/Object;", "", "Lgz/c;", "o", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "n", "()LTJ/g;", "e", "", "inclTax", "l", "(Ljava/lang/String;DLdI/e;)Ljava/lang/Object;", "k", "m", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "f", "collected", "c", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "i", "b", "p", "(Lgz/c;LdI/e;)Ljava/lang/Object;", "barcodes", "d", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "a", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "getDatabase", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "getDatabase$annotations", "()V", "Lfz/g;", "getProductDao", "()Lfz/g;", "Lfz/a;", "getCartDao", "()Lfz/a;", "Lfz/i;", "getScanTypeDao", "()Lfz/i;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dz.b  reason: case insensitive filesystem */
public final class C14370b implements C14369a {

    /* renamed from: a  reason: collision with root package name */
    private final ScanAndGoRoomDatabase f126254a;

    /* renamed from: b  reason: collision with root package name */
    private final C14494g f126255b;

    /* renamed from: c  reason: collision with root package name */
    private final C14488a f126256c;

    /* renamed from: d  reason: collision with root package name */
    private final C14496i f126257d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dz.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f126258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.y r1 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rz.y r1 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rz.y r1 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                rz.y r1 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                rz.y r1 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f126258a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {315}, m = "addChildItemsToCart")
    /* renamed from: dz.b$b  reason: collision with other inner class name */
    static final class C3085b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126259c;

        /* renamed from: d  reason: collision with root package name */
        Object f126260d;

        /* renamed from: e  reason: collision with root package name */
        Object f126261e;

        /* renamed from: f  reason: collision with root package name */
        Object f126262f;

        /* renamed from: g  reason: collision with root package name */
        Object f126263g;

        /* renamed from: h  reason: collision with root package name */
        Object f126264h;

        /* renamed from: i  reason: collision with root package name */
        Object f126265i;

        /* renamed from: j  reason: collision with root package name */
        Object f126266j;

        /* renamed from: k  reason: collision with root package name */
        Object f126267k;

        /* renamed from: l  reason: collision with root package name */
        Object f126268l;

        /* renamed from: m  reason: collision with root package name */
        Object f126269m;

        /* renamed from: n  reason: collision with root package name */
        Object f126270n;

        /* renamed from: o  reason: collision with root package name */
        Object f126271o;

        /* renamed from: p  reason: collision with root package name */
        int f126272p;

        /* renamed from: q  reason: collision with root package name */
        int f126273q;

        /* renamed from: r  reason: collision with root package name */
        int f126274r;

        /* renamed from: s  reason: collision with root package name */
        int f126275s;

        /* renamed from: t  reason: collision with root package name */
        int f126276t;

        /* renamed from: u  reason: collision with root package name */
        int f126277u;

        /* renamed from: v  reason: collision with root package name */
        boolean f126278v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f126279w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ C14370b f126280x;

        /* renamed from: y  reason: collision with root package name */
        int f126281y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3085b(C14370b bVar, C17164e<? super C3085b> eVar) {
            super(eVar);
            this.f126280x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126279w = obj;
            this.f126281y |= Integer.MIN_VALUE;
            return this.f126280x.r((gz.e) null, 0, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {62, 79, 91, 102}, m = "addItemToCart")
    /* renamed from: dz.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126282c;

        /* renamed from: d  reason: collision with root package name */
        Object f126283d;

        /* renamed from: e  reason: collision with root package name */
        Object f126284e;

        /* renamed from: f  reason: collision with root package name */
        Object f126285f;

        /* renamed from: g  reason: collision with root package name */
        Object f126286g;

        /* renamed from: h  reason: collision with root package name */
        Object f126287h;

        /* renamed from: i  reason: collision with root package name */
        Object f126288i;

        /* renamed from: j  reason: collision with root package name */
        int f126289j;

        /* renamed from: k  reason: collision with root package name */
        int f126290k;

        /* renamed from: l  reason: collision with root package name */
        boolean f126291l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f126292m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C14370b f126293n;

        /* renamed from: o  reason: collision with root package name */
        int f126294o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14370b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f126293n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126292m = obj;
            this.f126294o |= Integer.MIN_VALUE;
            return this.f126293n.g((String) null, 0, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {217, 234, 245}, m = "addProductToCartOrUpdateQuantity")
    /* renamed from: dz.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126295c;

        /* renamed from: d  reason: collision with root package name */
        Object f126296d;

        /* renamed from: e  reason: collision with root package name */
        Object f126297e;

        /* renamed from: f  reason: collision with root package name */
        Object f126298f;

        /* renamed from: g  reason: collision with root package name */
        Object f126299g;

        /* renamed from: h  reason: collision with root package name */
        Object f126300h;

        /* renamed from: i  reason: collision with root package name */
        Object f126301i;

        /* renamed from: j  reason: collision with root package name */
        Object f126302j;

        /* renamed from: k  reason: collision with root package name */
        Object f126303k;

        /* renamed from: l  reason: collision with root package name */
        int f126304l;

        /* renamed from: m  reason: collision with root package name */
        int f126305m;

        /* renamed from: n  reason: collision with root package name */
        int f126306n;

        /* renamed from: o  reason: collision with root package name */
        int f126307o;

        /* renamed from: p  reason: collision with root package name */
        boolean f126308p;

        /* renamed from: q  reason: collision with root package name */
        long f126309q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f126310r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C14370b f126311s;

        /* renamed from: t  reason: collision with root package name */
        int f126312t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14370b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f126311s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126310r = obj;
            this.f126312t |= Integer.MIN_VALUE;
            return this.f126311s.t((String) null, 0, (ProductLiteRemote) null, (QuantityPickerDataModel) null, (C15031y) null, (C15026t) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {39}, m = "getScannedItem")
    /* renamed from: dz.b$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126313c;

        /* renamed from: d  reason: collision with root package name */
        Object f126314d;

        /* renamed from: e  reason: collision with root package name */
        Object f126315e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126316f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14370b f126317g;

        /* renamed from: h  reason: collision with root package name */
        int f126318h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14370b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f126317g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126316f = obj;
            this.f126318h |= Integer.MIN_VALUE;
            return this.f126317g.j((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {143}, m = "quantityAlreadyInCart")
    /* renamed from: dz.b$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126319c;

        /* renamed from: d  reason: collision with root package name */
        Object f126320d;

        /* renamed from: e  reason: collision with root package name */
        Object f126321e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126322f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14370b f126323g;

        /* renamed from: h  reason: collision with root package name */
        int f126324h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14370b bVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f126323g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126322f = obj;
            this.f126324h |= Integer.MIN_VALUE;
            return this.f126323g.k((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {132, 135}, m = "updateCartItemPrice")
    /* renamed from: dz.b$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126325c;

        /* renamed from: d  reason: collision with root package name */
        Object f126326d;

        /* renamed from: e  reason: collision with root package name */
        Object f126327e;

        /* renamed from: f  reason: collision with root package name */
        Object f126328f;

        /* renamed from: g  reason: collision with root package name */
        double f126329g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f126330h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14370b f126331i;

        /* renamed from: j  reason: collision with root package name */
        int f126332j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14370b bVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f126331i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126330h = obj;
            this.f126332j |= Integer.MIN_VALUE;
            return this.f126331i.l((String) null, 0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoDatabaseImpl", f = "ScanAndGoDatabaseImpl.kt", l = {192, 200}, m = "updateSkippedStatus")
    /* renamed from: dz.b$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126333c;

        /* renamed from: d  reason: collision with root package name */
        Object f126334d;

        /* renamed from: e  reason: collision with root package name */
        Object f126335e;

        /* renamed from: f  reason: collision with root package name */
        Object f126336f;

        /* renamed from: g  reason: collision with root package name */
        Object f126337g;

        /* renamed from: h  reason: collision with root package name */
        Object f126338h;

        /* renamed from: i  reason: collision with root package name */
        Object f126339i;

        /* renamed from: j  reason: collision with root package name */
        Object f126340j;

        /* renamed from: k  reason: collision with root package name */
        int f126341k;

        /* renamed from: l  reason: collision with root package name */
        int f126342l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f126343m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C14370b f126344n;

        /* renamed from: o  reason: collision with root package name */
        int f126345o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C14370b bVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f126344n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126343m = obj;
            this.f126345o |= Integer.MIN_VALUE;
            return this.f126344n.d((List<String>) null, this);
        }
    }

    public C14370b(ScanAndGoRoomDatabase scanAndGoRoomDatabase, C14494g gVar, C14488a aVar, C14496i iVar) {
        C17542s.j(scanAndGoRoomDatabase, "database");
        C17542s.j(gVar, "productDao");
        C17542s.j(aVar, "cartDao");
        C17542s.j(iVar, "scanTypeDao");
        this.f126254a = scanAndGoRoomDatabase;
        this.f126255b = gVar;
        this.f126256c = aVar;
        this.f126257d = iVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(gz.e r24, int r25, boolean r26, dI.C17164e<? super XH.C16807N> r27) {
        /*
            r23 = this;
            r0 = r27
            boolean r1 = r0 instanceof dz.C14370b.C3085b
            if (r1 == 0) goto L_0x0017
            r1 = r0
            dz.b$b r1 = (dz.C14370b.C3085b) r1
            int r2 = r1.f126281y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f126281y = r2
            r2 = r23
            goto L_0x001e
        L_0x0017:
            dz.b$b r1 = new dz.b$b
            r2 = r23
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f126279w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f126281y
            r7 = 1
            if (r5 == 0) goto L_0x0079
            if (r5 != r7) goto L_0x0071
            int r0 = r1.f126273q
            boolean r5 = r1.f126278v
            int r8 = r1.f126272p
            java.lang.Object r9 = r1.f126271o
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel) r9
            java.lang.Object r9 = r1.f126270n
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel) r9
            java.lang.Object r9 = r1.f126269m
            rz.t r9 = (rz.C15026t) r9
            java.lang.Object r9 = r1.f126268l
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel) r9
            java.lang.Object r9 = r1.f126267k
            rz.y r9 = (rz.C15031y) r9
            java.lang.Object r9 = r1.f126266j
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel) r9
            java.lang.Object r9 = r1.f126264h
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r1.f126263g
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r1.f126262f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r1.f126261e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r1.f126260d
            gz.e r13 = (gz.e) r13
            java.lang.Object r14 = r1.f126259c
            dz.b r14 = (dz.C14370b) r14
            XH.y.b(r3)
            r15 = r0
            r3 = r5
            r2 = r9
            r5 = r12
            r0 = 0
            r9 = r4
            r4 = r7
            r12 = r10
            r10 = r14
            r14 = r1
            r1 = r8
            goto L_0x01d3
        L_0x0071:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0079:
            XH.y.b(r3)
            java.util.List r3 = r24.c()
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x01e7
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x008d
            goto L_0x01e7
        L_0x008d:
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r8 = r5.iterator()
            r14 = r1
            r10 = r2
            r11 = r3
            r12 = r5
            r13 = r8
            r15 = 0
            r1 = r25
            r3 = r26
            r5 = r0
            r0 = r24
        L_0x00a1:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r8 = r13.next()
            r9 = r8
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel) r9
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r16 = r9.a()
            r17 = 0
            if (r16 == 0) goto L_0x00bd
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r16 = r16.h()
            r6 = r16
            goto L_0x00bf
        L_0x00bd:
            r6 = r17
        L_0x00bf:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r16 = r9.a()
            if (r16 == 0) goto L_0x00ca
            java.lang.String r16 = r16.f()
            goto L_0x00cc
        L_0x00ca:
            r16 = r17
        L_0x00cc:
            rz.y r7 = iz.C14590d.c(r16)
            if (r6 == 0) goto L_0x00dc
            rz.t r16 = iz.C14590d.a(r6)
            if (r16 != 0) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            r2 = r16
            goto L_0x00df
        L_0x00dc:
            rz.t$c r16 = rz.C15026t.c.f130895a
            goto L_0x00d9
        L_0x00df:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r16 = r9.a()
            if (r16 == 0) goto L_0x00f2
            java.lang.Integer r16 = r16.g()
            if (r16 == 0) goto L_0x00f2
            int r16 = r16.intValue()
            r20 = r4
            goto L_0x00f6
        L_0x00f2:
            r20 = r4
            r16 = 1
        L_0x00f6:
            int r4 = r1 * r16
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r16 = r9.a()
            if (r16 == 0) goto L_0x010d
            java.lang.Integer r16 = r16.d()
            if (r16 == 0) goto L_0x010d
            int r16 = r16.intValue()
            r24 = r16
        L_0x010a:
            r16 = r15
            goto L_0x0110
        L_0x010d:
            r24 = r4
            goto L_0x010a
        L_0x0110:
            rz.y r15 = rz.C15031y.SELF_SERVE
            r25 = r3
            if (r7 != r15) goto L_0x0118
            r15 = 1
            goto L_0x0119
        L_0x0118:
            r15 = 0
        L_0x0119:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r3 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel
            r26 = r1
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r15)
            r27 = r15
            r19 = 1
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.b.e(r19)
            r21 = r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.e(r24)
            r22 = r6
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r4)
            r3.<init>(r1, r15, r2, r6)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r1 = r9.a()
            if (r1 == 0) goto L_0x0143
            java.lang.String r1 = r1.c()
            goto L_0x0145
        L_0x0143:
            r1 = r17
        L_0x0145:
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x01e1
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r6 = r9.a()
            if (r6 == 0) goto L_0x0154
            java.lang.Integer r6 = r6.g()
            goto L_0x0156
        L_0x0154:
            r6 = r17
        L_0x0156:
            if (r6 == 0) goto L_0x01db
            int r2 = r6.intValue()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r6 = r9.a()
            if (r6 == 0) goto L_0x0167
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r15 = r6.e()
            goto L_0x0169
        L_0x0167:
            r15 = r17
        L_0x0169:
            r14.f126259c = r10
            r14.f126260d = r0
            r14.f126261e = r5
            r14.f126262f = r11
            r14.f126263g = r12
            r14.f126264h = r13
            r14.f126265i = r8
            r14.f126266j = r9
            r14.f126267k = r7
            r8 = r22
            r14.f126268l = r8
            r9 = r21
            r14.f126269m = r9
            r14.f126270n = r3
            r14.f126271o = r6
            r6 = r26
            r14.f126272p = r6
            r8 = r25
            r14.f126278v = r8
            r17 = r0
            r0 = r16
            r14.f126273q = r0
            r0 = 0
            r14.f126274r = r0
            r14.f126275s = r4
            r4 = r24
            r14.f126276t = r4
            r4 = r27
            r14.f126277u = r4
            r4 = 1
            r14.f126281y = r4
            r18 = r8
            r8 = r10
            r19 = r9
            r9 = r1
            r1 = r10
            r10 = r2
            r2 = r11
            r11 = r15
            r21 = r12
            r12 = r3
            r3 = r13
            r13 = r7
            r7 = r14
            r14 = r19
            r19 = r16
            r15 = r18
            r16 = r7
            java.lang.Object r8 = r8.t(r9, r10, r11, r12, r13, r14, r15, r16)
            r9 = r20
            if (r8 != r9) goto L_0x01c6
            return r9
        L_0x01c6:
            r10 = r1
            r11 = r2
            r2 = r3
            r1 = r6
            r14 = r7
            r13 = r17
            r3 = r18
            r15 = r19
            r12 = r21
        L_0x01d3:
            r7 = r4
            r4 = r9
            r0 = r13
            r13 = r2
            r2 = r23
            goto L_0x00a1
        L_0x01db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x01e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x01e7:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.r(gz.e, int, boolean, dI.e):java.lang.Object");
    }

    private final Object s(String str, int i10, C15031y yVar, C15026t tVar, gz.e eVar, boolean z10, C17164e<? super C16807N> eVar2) {
        if (eVar.b()) {
            int i11 = i10;
            Object r10 = r(eVar, i10, false, eVar2);
            return r10 == C17187b.f() ? r10 : C16807N.f139792a;
        }
        gz.e eVar3 = eVar;
        Object t10 = t(str, i10, eVar.e(), eVar.f(), yVar, tVar, z10, eVar2);
        return t10 == C17187b.f() ? t10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0108, code lost:
        r7 = r7.d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.lang.String r32, int r33, com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r34, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r35, rz.C15031y r36, rz.C15026t r37, boolean r38, dI.C17164e<? super XH.C16807N> r39) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r39
            boolean r3 = r2 instanceof dz.C14370b.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            dz.b$d r3 = (dz.C14370b.d) r3
            int r4 = r3.f126312t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f126312t = r4
            goto L_0x001e
        L_0x0019:
            dz.b$d r3 = new dz.b$d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f126310r
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f126312t
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00c1
            if (r6 == r9) goto L_0x008b
            if (r6 == r8) goto L_0x0062
            if (r6 != r7) goto L_0x005a
            java.lang.Object r1 = r3.f126303k
            gz.a r1 = (gz.C14523a) r1
            java.lang.Object r1 = r3.f126302j
            gz.c r1 = (gz.c) r1
            java.lang.Object r1 = r3.f126301i
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126300h
            rz.t r1 = (rz.C15026t) r1
            java.lang.Object r1 = r3.f126299g
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126298f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r1 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel) r1
            java.lang.Object r1 = r3.f126297e
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r1 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r1
            java.lang.Object r1 = r3.f126296d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126295c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x01d9
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            java.lang.Object r1 = r3.f126303k
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r1 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel) r1
            java.lang.Object r1 = r3.f126302j
            gz.c r1 = (gz.c) r1
            java.lang.Object r1 = r3.f126301i
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126300h
            rz.t r1 = (rz.C15026t) r1
            java.lang.Object r1 = r3.f126299g
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126298f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r1 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel) r1
            java.lang.Object r1 = r3.f126297e
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r1 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r1
            java.lang.Object r1 = r3.f126296d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126295c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x016d
        L_0x008b:
            boolean r1 = r3.f126308p
            int r2 = r3.f126304l
            java.lang.Object r6 = r3.f126301i
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r10 = r3.f126300h
            rz.t r10 = (rz.C15026t) r10
            java.lang.Object r11 = r3.f126299g
            rz.y r11 = (rz.C15031y) r11
            java.lang.Object r12 = r3.f126298f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel) r12
            java.lang.Object r13 = r3.f126297e
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r13 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r13
            java.lang.Object r14 = r3.f126296d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.f126295c
            dz.b r15 = (dz.C14370b) r15
            XH.y.b(r4)
            r28 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r4
            r4 = r28
            r29 = r13
            r13 = r6
            r6 = r29
            r30 = r15
            r15 = r11
            r11 = r30
            goto L_0x00fe
        L_0x00c1:
            XH.y.b(r4)
            fz.a r4 = r0.f126256c
            r3.f126295c = r0
            r3.f126296d = r1
            r6 = r34
            r3.f126297e = r6
            r10 = r35
            r3.f126298f = r10
            r11 = r36
            r3.f126299g = r11
            r12 = r37
            r3.f126300h = r12
            r3.f126301i = r2
            r13 = r33
            r3.f126304l = r13
            r14 = r38
            r3.f126308p = r14
            r3.f126312t = r9
            java.lang.Object r4 = r4.b(r1, r3)
            if (r4 != r5) goto L_0x00ed
            return r5
        L_0x00ed:
            r15 = r11
            r11 = r0
            r28 = r13
            r13 = r2
            r2 = r28
            r29 = r10
            r10 = r4
            r4 = r29
            r30 = r14
            r14 = r12
            r12 = r30
        L_0x00fe:
            gz.c r10 = (gz.c) r10
            if (r10 == 0) goto L_0x0170
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r7 = r10.i()
            if (r7 == 0) goto L_0x0113
            java.lang.Integer r7 = r7.d()
            if (r7 == 0) goto L_0x0113
            int r7 = r7.intValue()
            goto L_0x0114
        L_0x0113:
            r7 = 0
        L_0x0114:
            if (r12 == 0) goto L_0x011e
            boolean r16 = r10.d()
            if (r16 != 0) goto L_0x011e
            r9 = r2
            goto L_0x0122
        L_0x011e:
            int r16 = r7 + r2
            r9 = r16
        L_0x0122:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r8 = r10.i()
            if (r8 == 0) goto L_0x0137
            java.lang.Integer r18 = r8.b()
            if (r18 == 0) goto L_0x0137
            int r17 = r18.intValue()
            r24 = r5
            r0 = r17
            goto L_0x013a
        L_0x0137:
            r24 = r5
            r0 = 1
        L_0x013a:
            fz.a r5 = r11.f126256c
            r17 = r5
            gz.c$a r5 = new gz.c$a
            r5.<init>(r1, r9, r0, r12)
            r3.f126295c = r11
            r3.f126296d = r1
            r3.f126297e = r6
            r3.f126298f = r4
            r3.f126299g = r15
            r3.f126300h = r14
            r3.f126301i = r13
            r3.f126302j = r10
            r3.f126303k = r8
            r3.f126304l = r2
            r3.f126308p = r12
            r3.f126305m = r7
            r3.f126306n = r9
            r3.f126307o = r0
            r0 = 2
            r3.f126312t = r0
            r0 = r17
            java.lang.Object r0 = r0.a(r5, r3)
            r5 = r24
            if (r0 != r5) goto L_0x016d
            return r5
        L_0x016d:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0170:
            fz.a r0 = r11.f126256c
            long r8 = java.lang.System.currentTimeMillis()
            gz.a$a r7 = gz.C14523a.f127378e
            gz.a r7 = r7.a(r14)
            r16 = r15
            gz.c r15 = new gz.c
            r23 = 0
            r17 = 0
            r19 = 0
            r32 = r5
            r5 = r10
            r10 = r15
            r25 = r11
            r11 = r1
            r33 = r12
            r26 = r13
            r12 = r8
            r34 = r0
            r0 = r14
            r14 = r6
            r27 = r15
            r35 = r16
            r15 = r17
            r17 = r19
            r19 = r33
            r20 = r4
            r21 = r35
            r22 = r7
            r10.<init>(r11, r12, r14, r15, r17, r19, r20, r21, r22, r23)
            r15 = r25
            r3.f126295c = r15
            r3.f126296d = r1
            r3.f126297e = r6
            r3.f126298f = r4
            r11 = r35
            r3.f126299g = r11
            r3.f126300h = r0
            r6 = r26
            r3.f126301i = r6
            r3.f126302j = r5
            r3.f126303k = r7
            r3.f126304l = r2
            r14 = r33
            r3.f126308p = r14
            r3.f126309q = r8
            r0 = 3
            r3.f126312t = r0
            r0 = r34
            r1 = r27
            java.lang.Object r0 = r0.f(r1, r3)
            r1 = r32
            if (r0 != r1) goto L_0x01d9
            return r1
        L_0x01d9:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.t(java.lang.String, int, com.ingka.ikea.core.remotemodel.product.ProductLiteRemote, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel, rz.y, rz.t, boolean, dI.e):java.lang.Object");
    }

    public Object b(String str, C17164e<? super gz.c> eVar) {
        return this.f126256c.b(str, eVar);
    }

    public Object c(String str, boolean z10, C17164e<? super C16807N> eVar) {
        Object c10 = this.f126256c.c(str, z10, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092 A[LOOP:0: B:19:0x008c->B:21:0x0092, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3 A[LOOP:1: B:23:0x00ad->B:25:0x00b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.util.List<java.lang.String> r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof dz.C14370b.h
            if (r0 == 0) goto L_0x0013
            r0 = r12
            dz.b$h r0 = (dz.C14370b.h) r0
            int r1 = r0.f126345o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126345o = r1
            goto L_0x0018
        L_0x0013:
            dz.b$h r0 = new dz.b$h
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f126343m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126345o
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0066
            if (r3 == r5) goto L_0x0055
            if (r3 != r4) goto L_0x004d
            java.lang.Object r11 = r0.f126340j
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r0.f126339i
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r0.f126338h
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f126337g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f126336f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f126335e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f126334d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f126333c
            dz.b r11 = (dz.C14370b) r11
            XH.y.b(r1)
            goto L_0x00e6
        L_0x004d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0055:
            java.lang.Object r11 = r0.f126335e
            r12 = r11
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r11 = r0.f126334d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r3 = r0.f126333c
            dz.b r3 = (dz.C14370b) r3
            XH.y.b(r1)
            goto L_0x007b
        L_0x0066:
            XH.y.b(r1)
            fz.a r1 = r10.f126256c
            r0.f126333c = r10
            r0.f126334d = r11
            r0.f126335e = r12
            r0.f126345o = r5
            java.lang.Object r1 = r1.l(r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            r3 = r10
        L_0x007b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = YH.C16877v.y(r1, r6)
            r5.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x008c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r7 = r1.next()
            gz.c r7 = (gz.c) r7
            java.lang.String r7 = r7.c()
            r5.add(r7)
            goto L_0x008c
        L_0x00a0:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r5, r6)
            r1.<init>(r6)
            java.util.Iterator r6 = r5.iterator()
        L_0x00ad:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c6
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            gz.c$d r8 = new gz.c$d
            boolean r9 = r11.contains(r7)
            r8.<init>(r7, r9)
            r1.add(r8)
            goto L_0x00ad
        L_0x00c6:
            fz.a r7 = r3.f126256c
            r0.f126333c = r3
            r0.f126334d = r11
            r0.f126335e = r12
            r0.f126336f = r1
            r0.f126337g = r5
            r0.f126338h = r5
            r0.f126339i = r1
            r0.f126340j = r6
            r11 = 0
            r0.f126341k = r11
            r0.f126342l = r11
            r0.f126345o = r4
            java.lang.Object r11 = r7.d(r1, r0)
            if (r11 != r2) goto L_0x00e6
            return r2
        L_0x00e6:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.d(java.util.List, dI.e):java.lang.Object");
    }

    public Object e(String str, C17164e<? super C16807N> eVar) {
        Object j10 = this.f126256c.j(str, eVar);
        return j10 == C17187b.f() ? j10 : C16807N.f139792a;
    }

    public Object f(C17164e<? super C16807N> eVar) {
        this.f126254a.clearAllTables();
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        r4 = (r4 = (r4 = r4.h()).a()).c();
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.lang.String r19, int r20, boolean r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r22
            boolean r3 = r2 instanceof dz.C14370b.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            dz.b$c r3 = (dz.C14370b.c) r3
            int r4 = r3.f126294o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f126294o = r4
            goto L_0x001e
        L_0x0019:
            dz.b$c r3 = new dz.b$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f126292m
            java.lang.Object r13 = eI.C17187b.f()
            int r5 = r3.f126294o
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x00b7
            if (r5 == r9) goto L_0x009f
            if (r5 == r8) goto L_0x007e
            if (r5 == r7) goto L_0x005d
            if (r5 != r6) goto L_0x0055
            java.lang.Object r1 = r3.f126288i
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126287h
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126286g
            rz.t r1 = (rz.C15026t) r1
            java.lang.Object r1 = r3.f126285f
            gz.e r1 = (gz.e) r1
            java.lang.Object r1 = r3.f126284e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126283d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126282c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x0171
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            java.lang.Object r1 = r3.f126288i
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126287h
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126286g
            rz.t r1 = (rz.C15026t) r1
            java.lang.Object r1 = r3.f126285f
            gz.e r1 = (gz.e) r1
            java.lang.Object r1 = r3.f126284e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126283d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126282c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x0192
        L_0x007e:
            java.lang.Object r1 = r3.f126288i
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126287h
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r3.f126286g
            rz.t r1 = (rz.C15026t) r1
            java.lang.Object r1 = r3.f126285f
            gz.e r1 = (gz.e) r1
            java.lang.Object r1 = r3.f126284e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126283d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126282c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x01b9
        L_0x009f:
            boolean r1 = r3.f126291l
            int r2 = r3.f126289j
            java.lang.Object r5 = r3.f126284e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r10 = r3.f126283d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.f126282c
            dz.b r11 = (dz.C14370b) r11
            XH.y.b(r4)
            r12 = r1
            r1 = r2
            r2 = r5
            r5 = r10
            goto L_0x00da
        L_0x00b7:
            XH.y.b(r4)
            fz.g r4 = r0.f126255b
            r3.f126282c = r0
            r3.f126283d = r1
            r3.f126284e = r2
            r5 = r20
            r3.f126289j = r5
            r10 = r21
            r3.f126291l = r10
            r3.f126294o = r9
            java.lang.Object r4 = r4.j(r1, r3)
            if (r4 != r13) goto L_0x00d3
            return r13
        L_0x00d3:
            r11 = r0
            r12 = r10
            r17 = r5
            r5 = r1
            r1 = r17
        L_0x00da:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = YH.C16877v.b1(r4)
            r10 = r4
            gz.e r10 = (gz.e) r10
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r4 = r10.d()
            if (r4 == 0) goto L_0x0103
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r4 = r4.h()
            if (r4 == 0) goto L_0x0103
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r4 = r4.a()
            if (r4 == 0) goto L_0x0103
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r4 = r4.d()
            if (r4 == 0) goto L_0x0103
            rz.t r4 = iz.C14590d.a(r4)
            if (r4 == 0) goto L_0x0103
        L_0x0101:
            r14 = r4
            goto L_0x0106
        L_0x0103:
            rz.t$c r4 = rz.C15026t.c.f130895a
            goto L_0x0101
        L_0x0106:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r4 = r10.d()
            if (r4 == 0) goto L_0x0124
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r4 = r4.h()
            if (r4 == 0) goto L_0x0124
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r4 = r4.a()
            if (r4 == 0) goto L_0x0124
            java.lang.String r4 = r4.c()
            if (r4 == 0) goto L_0x0124
            rz.y r4 = iz.C14590d.c(r4)
        L_0x0122:
            r15 = r4
            goto L_0x0126
        L_0x0124:
            r4 = 0
            goto L_0x0122
        L_0x0126:
            if (r15 != 0) goto L_0x012a
            r4 = -1
            goto L_0x0132
        L_0x012a:
            int[] r4 = dz.C14370b.a.f126258a
            int r16 = r15.ordinal()
            r4 = r4[r16]
        L_0x0132:
            if (r4 == r9) goto L_0x0195
            if (r4 == r8) goto L_0x0174
            if (r4 == r7) goto L_0x0146
            if (r4 == r6) goto L_0x0146
            r7 = 5
            if (r4 != r7) goto L_0x013e
            goto L_0x0146
        L_0x013e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Trying to add an unknown item type to cart"
            r1.<init>(r2)
            throw r1
        L_0x0146:
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r7 = r10.e()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r8 = r10.f()
            r3.f126282c = r11
            r3.f126283d = r5
            r3.f126284e = r2
            r3.f126285f = r10
            r3.f126286g = r14
            r3.f126287h = r15
            r3.f126288i = r15
            r3.f126289j = r1
            r3.f126291l = r12
            r3.f126290k = r4
            r3.f126294o = r6
            r4 = r11
            r6 = r1
            r9 = r15
            r10 = r14
            r11 = r12
            r12 = r3
            java.lang.Object r1 = r4.t(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r13) goto L_0x0171
            return r13
        L_0x0171:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0174:
            r3.f126282c = r11
            r3.f126283d = r5
            r3.f126284e = r2
            r3.f126285f = r10
            r3.f126286g = r14
            r3.f126287h = r15
            r3.f126288i = r15
            r3.f126289j = r1
            r3.f126291l = r12
            r3.f126290k = r4
            r3.f126294o = r7
            r2 = 0
            java.lang.Object r1 = r11.r(r10, r1, r2, r3)
            if (r1 != r13) goto L_0x0192
            return r13
        L_0x0192:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0195:
            r3.f126282c = r11
            r3.f126283d = r5
            r3.f126284e = r2
            r3.f126285f = r10
            r3.f126286g = r14
            r3.f126287h = r15
            r3.f126288i = r15
            r3.f126289j = r1
            r3.f126291l = r12
            r3.f126290k = r4
            r3.f126294o = r8
            r4 = r11
            r6 = r1
            r7 = r15
            r8 = r14
            r9 = r10
            r10 = r12
            r11 = r3
            java.lang.Object r1 = r4.s(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r13) goto L_0x01b9
            return r13
        L_0x01b9:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.g(java.lang.String, int, boolean, dI.e):java.lang.Object");
    }

    public Object h(String str, ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel, C17164e<? super C16807N> eVar) {
        Object a10 = this.f126255b.a(new gz.e(str, scanAndGoProductResponseDataModel), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<Integer> i() {
        return this.f126256c.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(java.lang.String r6, dI.C17164e<? super gz.e> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dz.C14370b.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dz.b$e r0 = (dz.C14370b.e) r0
            int r1 = r0.f126318h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126318h = r1
            goto L_0x0018
        L_0x0013:
            dz.b$e r0 = new dz.b$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f126316f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126318h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f126315e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126314d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f126313c
            dz.b r6 = (dz.C14370b) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            fz.g r1 = r5.f126255b
            r0.f126313c = r5
            r0.f126314d = r6
            r0.f126315e = r7
            r0.f126318h = r4
            java.lang.Object r1 = r1.j(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = YH.C16877v.d1(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.j(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r6 = (r6 = r1.i()).d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(java.lang.String r6, dI.C17164e<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dz.C14370b.f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dz.b$f r0 = (dz.C14370b.f) r0
            int r1 = r0.f126324h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126324h = r1
            goto L_0x0018
        L_0x0013:
            dz.b$f r0 = new dz.b$f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f126322f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126324h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f126321e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126320d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f126319c
            dz.b r6 = (dz.C14370b) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            fz.a r1 = r5.f126256c
            r0.f126319c = r5
            r0.f126320d = r6
            r0.f126321e = r7
            r0.f126324h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            gz.c r1 = (gz.c) r1
            if (r1 == 0) goto L_0x0066
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r6 = r1.i()
            if (r6 == 0) goto L_0x0066
            java.lang.Integer r6 = r6.d()
            if (r6 == 0) goto L_0x0066
            int r6 = r6.intValue()
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.k(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object l(java.lang.String r27, double r28, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r30
            boolean r3 = r2 instanceof dz.C14370b.g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            dz.b$g r3 = (dz.C14370b.g) r3
            int r4 = r3.f126332j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f126332j = r4
            goto L_0x001e
        L_0x0019:
            dz.b$g r3 = new dz.b$g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f126330h
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f126332j
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x0061
            if (r6 == r8) goto L_0x004b
            if (r6 != r7) goto L_0x0043
            java.lang.Object r1 = r3.f126328f
            gz.c r1 = (gz.c) r1
            java.lang.Object r1 = r3.f126327e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126326d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126325c
            dz.b r1 = (dz.C14370b) r1
            XH.y.b(r4)
            goto L_0x00c5
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            double r1 = r3.f126329g
            java.lang.Object r6 = r3.f126327e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r3.f126326d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f126325c
            dz.b r9 = (dz.C14370b) r9
            XH.y.b(r4)
            r12 = r1
            r2 = r6
            r1 = r8
            r6 = r9
            goto L_0x007b
        L_0x0061:
            XH.y.b(r4)
            fz.a r4 = r0.f126256c
            r3.f126325c = r0
            r3.f126326d = r1
            r3.f126327e = r2
            r9 = r28
            r3.f126329g = r9
            r3.f126332j = r8
            java.lang.Object r4 = r4.b(r1, r3)
            if (r4 != r5) goto L_0x0079
            return r5
        L_0x0079:
            r6 = r0
            r12 = r9
        L_0x007b:
            kotlin.jvm.internal.C17542s.g(r4)
            gz.c r4 = (gz.c) r4
            fz.a r15 = r6.f126256c
            r22 = 1015(0x3f7, float:1.422E-42)
            r23 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r8 = r4
            r27 = r12
            r12 = r14
            r13 = r27
            r25 = r15
            r15 = r16
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r24
            gz.c r8 = gz.c.b(r8, r9, r10, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            r3.f126325c = r6
            r3.f126326d = r1
            r3.f126327e = r2
            r3.f126328f = r4
            r1 = r27
            r3.f126329g = r1
            r3.f126332j = r7
            r1 = r25
            java.lang.Object r1 = r1.e(r8, r3)
            if (r1 != r5) goto L_0x00c5
            return r5
        L_0x00c5:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.l(java.lang.String, double, dI.e):java.lang.Object");
    }

    public Object m(String str, int i10, C17164e<? super C16807N> eVar) {
        Object h10 = this.f126256c.h(new c.C3133c(str, i10), eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public C16532g<List<gz.c>> n() {
        return this.f126256c.k();
    }

    public Object o(C17164e<? super List<gz.c>> eVar) {
        return this.f126256c.l(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object p(gz.c r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r9 = this;
            java.lang.String r1 = r10.c()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r0 = r10.i()
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r0 = r0.d()
            if (r0 == 0) goto L_0x0016
            int r0 = r0.intValue()
        L_0x0014:
            r2 = r0
            goto L_0x0018
        L_0x0016:
            r0 = 1
            goto L_0x0014
        L_0x0018:
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r3 = r10.h()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r4 = r10.i()
            rz.y r5 = r10.k()
            gz.a r0 = r10.g()
            rz.t r6 = r0.a()
            boolean r7 = r10.d()
            r0 = r9
            r8 = r11
            java.lang.Object r10 = r0.t(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = eI.C17187b.f()
            if (r10 != r11) goto L_0x003d
            return r10
        L_0x003d:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dz.C14370b.p(gz.c, dI.e):java.lang.Object");
    }
}
