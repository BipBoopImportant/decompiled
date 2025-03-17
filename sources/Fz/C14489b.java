package fz;

import O4.b;
import TJ.C16532g;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import dI.C17164e;
import ez.C14437a;
import gz.C14523a;
import gz.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import rz.C15031y;

/* renamed from: fz.b  reason: case insensitive filesystem */
public final class C14489b implements C14488a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f127166a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<gz.c> f127167b;

    /* renamed from: c  reason: collision with root package name */
    private C14437a f127168c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C7013j<gz.c> f127169d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C7013j<c.C3133c> f127170e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C7013j<c.a> f127171f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C7013j<c.d> f127172g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C7013j<c.b> f127173h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final H f127174i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final H f127175j;

    /* renamed from: fz.b$a */
    class a implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gz.c f127176a;

        a(gz.c cVar) {
            this.f127176a = cVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127169d.handle(this.f127176a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    /* renamed from: fz.b$b  reason: collision with other inner class name */
    class C3112b implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.C3133c f127178a;

        C3112b(c.C3133c cVar) {
            this.f127178a = cVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127170e.handle(this.f127178a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    /* renamed from: fz.b$c */
    class c implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f127180a;

        c(c.a aVar) {
            this.f127180a = aVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127171f.handle(this.f127180a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    /* renamed from: fz.b$d */
    class d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f127182a;

        d(List list) {
            this.f127182a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127172g.handleMultiple(this.f127182a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    /* renamed from: fz.b$e */
    class e implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f127184a;

        e(List list) {
            this.f127184a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127173h.handleMultiple(this.f127184a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    /* renamed from: fz.b$f */
    class f implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f127186a;

        f(String str) {
            this.f127186a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C14489b.this.f127174i.acquire();
            acquire.H(1, this.f127186a);
            try {
                C14489b.this.f127166a.beginTransaction();
                acquire.b0();
                C14489b.this.f127166a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C14489b.this.f127166a.endTransaction();
                C14489b.this.f127174i.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C14489b.this.f127174i.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: fz.b$g */
    class g implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f127188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f127189b;

        g(boolean z10, String str) {
            this.f127188a = z10;
            this.f127189b = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C14489b.this.f127175j.acquire();
            acquire.i2(1, this.f127188a ? 1 : 0);
            acquire.H(2, this.f127189b);
            try {
                C14489b.this.f127166a.beginTransaction();
                acquire.b0();
                C14489b.this.f127166a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C14489b.this.f127166a.endTransaction();
                C14489b.this.f127175j.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C14489b.this.f127175j.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: fz.b$h */
    class h implements Callable<gz.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127191a;

        h(B b10) {
            this.f127191a = b10;
        }

        /* renamed from: a */
        public gz.c call() {
            gz.c cVar;
            QuantityPickerDataModel quantityPickerDataModel;
            Boolean bool;
            Cursor e10 = b.e(C14489b.this.f127166a, this.f127191a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "barcode");
                int d11 = O4.a.d(e10, "timeStamp");
                int d12 = O4.a.d(e10, "productLite");
                int d13 = O4.a.d(e10, "inclTax");
                int d14 = O4.a.d(e10, "exclTax");
                int d15 = O4.a.d(e10, "collected");
                int d16 = O4.a.d(e10, "type");
                int d17 = O4.a.d(e10, "isSkipped");
                int d18 = O4.a.d(e10, "enabled");
                int d19 = O4.a.d(e10, "min");
                int d20 = O4.a.d(e10, "max");
                int d21 = O4.a.d(e10, "selected");
                int d22 = O4.a.d(e10, "itemLocation_title");
                int d23 = O4.a.d(e10, "itemLocation_aisle");
                int d24 = O4.a.d(e10, "itemLocation_bin");
                int d25 = O4.a.d(e10, "itemLocation_department");
                if (e10.moveToFirst()) {
                    String string = e10.getString(d10);
                    long j10 = e10.getLong(d11);
                    String string2 = e10.isNull(d12) ? null : e10.getString(d12);
                    ProductLiteRemote h10 = string2 == null ? null : C14489b.this.A().h(string2);
                    double d26 = e10.getDouble(d13);
                    double d27 = e10.getDouble(d14);
                    boolean z10 = e10.getInt(d15) != 0;
                    C15031y w10 = C14489b.this.z(e10.getString(d16));
                    boolean z11 = e10.getInt(d17) != 0;
                    if (e10.isNull(d18) && e10.isNull(d19) && e10.isNull(d20)) {
                        if (e10.isNull(d21)) {
                            quantityPickerDataModel = null;
                            cVar = new gz.c(string, j10, h10, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(d22), e10.getString(d23), e10.getString(d24), e10.getString(d25)), z11);
                        }
                    }
                    Integer valueOf = e10.isNull(d18) ? null : Integer.valueOf(e10.getInt(d18));
                    if (valueOf == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                    }
                    quantityPickerDataModel = new QuantityPickerDataModel(bool, e10.isNull(d19) ? null : Integer.valueOf(e10.getInt(d19)), e10.isNull(d20) ? null : Integer.valueOf(e10.getInt(d20)), e10.isNull(d21) ? null : Integer.valueOf(e10.getInt(d21)));
                    cVar = new gz.c(string, j10, h10, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(d22), e10.getString(d23), e10.getString(d24), e10.getString(d25)), z11);
                } else {
                    cVar = null;
                }
                e10.close();
                this.f127191a.h();
                return cVar;
            } catch (Throwable th2) {
                e10.close();
                this.f127191a.h();
                throw th2;
            }
        }
    }

    /* renamed from: fz.b$i */
    class i implements Callable<List<gz.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127193a;

        i(B b10) {
            this.f127193a = b10;
        }

        /* renamed from: a */
        public List<gz.c> call() {
            int i10;
            ProductLiteRemote productLiteRemote;
            int i11;
            int i12;
            int i13;
            QuantityPickerDataModel quantityPickerDataModel;
            int i14;
            Boolean bool;
            Integer num;
            Integer num2;
            Cursor e10 = b.e(C14489b.this.f127166a, this.f127193a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "barcode");
                int d11 = O4.a.d(e10, "timeStamp");
                int d12 = O4.a.d(e10, "productLite");
                int d13 = O4.a.d(e10, "inclTax");
                int d14 = O4.a.d(e10, "exclTax");
                int d15 = O4.a.d(e10, "collected");
                int d16 = O4.a.d(e10, "type");
                int d17 = O4.a.d(e10, "isSkipped");
                int d18 = O4.a.d(e10, "enabled");
                int d19 = O4.a.d(e10, "min");
                int d20 = O4.a.d(e10, "max");
                int d21 = O4.a.d(e10, "selected");
                int d22 = O4.a.d(e10, "itemLocation_title");
                int d23 = O4.a.d(e10, "itemLocation_aisle");
                int d24 = O4.a.d(e10, "itemLocation_bin");
                int d25 = O4.a.d(e10, "itemLocation_department");
                int i15 = d22;
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    long j10 = e10.getLong(d11);
                    String string2 = e10.isNull(d12) ? null : e10.getString(d12);
                    if (string2 == null) {
                        i10 = d10;
                        productLiteRemote = null;
                    } else {
                        i10 = d10;
                        productLiteRemote = C14489b.this.A().h(string2);
                    }
                    double d26 = e10.getDouble(d13);
                    double d27 = e10.getDouble(d14);
                    boolean z10 = e10.getInt(d15) != 0;
                    C15031y w10 = C14489b.this.z(e10.getString(d16));
                    boolean z11 = e10.getInt(d17) != 0;
                    if (e10.isNull(d18) && e10.isNull(d19) && e10.isNull(d20)) {
                        if (e10.isNull(d21)) {
                            i13 = d11;
                            i12 = d12;
                            i11 = d13;
                            i14 = i15;
                            quantityPickerDataModel = null;
                            int i16 = d23;
                            i15 = i14;
                            int i17 = d24;
                            d23 = i16;
                            d24 = i17;
                            int i18 = d25;
                            d25 = i18;
                            arrayList.add(new gz.c(string, j10, productLiteRemote, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(i14), e10.getString(i16), e10.getString(i17), e10.getString(i18)), z11));
                            d10 = i10;
                            d11 = i13;
                            d12 = i12;
                            d13 = i11;
                        }
                    }
                    Integer valueOf = e10.isNull(d18) ? null : Integer.valueOf(e10.getInt(d18));
                    if (valueOf == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                    }
                    Integer valueOf2 = e10.isNull(d19) ? null : Integer.valueOf(e10.getInt(d19));
                    if (e10.isNull(d20)) {
                        i13 = d11;
                        num = null;
                    } else {
                        i13 = d11;
                        num = Integer.valueOf(e10.getInt(d20));
                    }
                    if (e10.isNull(d21)) {
                        i12 = d12;
                        i11 = d13;
                        num2 = null;
                    } else {
                        i12 = d12;
                        i11 = d13;
                        num2 = Integer.valueOf(e10.getInt(d21));
                    }
                    quantityPickerDataModel = new QuantityPickerDataModel(bool, valueOf2, num, num2);
                    i14 = i15;
                    int i162 = d23;
                    i15 = i14;
                    int i172 = d24;
                    d23 = i162;
                    d24 = i172;
                    int i182 = d25;
                    d25 = i182;
                    arrayList.add(new gz.c(string, j10, productLiteRemote, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(i14), e10.getString(i162), e10.getString(i172), e10.getString(i182)), z11));
                    d10 = i10;
                    d11 = i13;
                    d12 = i12;
                    d13 = i11;
                }
                e10.close();
                this.f127193a.h();
                return arrayList;
            } catch (Throwable th2) {
                e10.close();
                this.f127193a.h();
                throw th2;
            }
        }
    }

    /* renamed from: fz.b$j */
    class j implements Callable<List<gz.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127195a;

        j(B b10) {
            this.f127195a = b10;
        }

        /* renamed from: a */
        public List<gz.c> call() {
            int i10;
            ProductLiteRemote productLiteRemote;
            int i11;
            int i12;
            QuantityPickerDataModel quantityPickerDataModel;
            int i13;
            Boolean bool;
            Integer num;
            j jVar = this;
            Cursor e10 = b.e(C14489b.this.f127166a, jVar.f127195a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "barcode");
                int d11 = O4.a.d(e10, "timeStamp");
                int d12 = O4.a.d(e10, "productLite");
                int d13 = O4.a.d(e10, "inclTax");
                int d14 = O4.a.d(e10, "exclTax");
                int d15 = O4.a.d(e10, "collected");
                int d16 = O4.a.d(e10, "type");
                int d17 = O4.a.d(e10, "isSkipped");
                int d18 = O4.a.d(e10, "enabled");
                int d19 = O4.a.d(e10, "min");
                int d20 = O4.a.d(e10, "max");
                int d21 = O4.a.d(e10, "selected");
                int d22 = O4.a.d(e10, "itemLocation_title");
                int d23 = O4.a.d(e10, "itemLocation_aisle");
                int d24 = O4.a.d(e10, "itemLocation_bin");
                int d25 = O4.a.d(e10, "itemLocation_department");
                int i14 = d22;
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    long j10 = e10.getLong(d11);
                    String string2 = e10.isNull(d12) ? null : e10.getString(d12);
                    if (string2 == null) {
                        i10 = d10;
                        productLiteRemote = null;
                    } else {
                        i10 = d10;
                        productLiteRemote = C14489b.this.A().h(string2);
                    }
                    double d26 = e10.getDouble(d13);
                    double d27 = e10.getDouble(d14);
                    boolean z10 = e10.getInt(d15) != 0;
                    C15031y w10 = C14489b.this.z(e10.getString(d16));
                    boolean z11 = e10.getInt(d17) != 0;
                    if (e10.isNull(d18) && e10.isNull(d19) && e10.isNull(d20)) {
                        if (e10.isNull(d21)) {
                            i12 = d11;
                            i11 = d12;
                            i13 = i14;
                            quantityPickerDataModel = null;
                            int i15 = d23;
                            i14 = i13;
                            int i16 = d24;
                            d23 = i15;
                            d24 = i16;
                            int i17 = d25;
                            d25 = i17;
                            arrayList.add(new gz.c(string, j10, productLiteRemote, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(i13), e10.getString(i15), e10.getString(i16), e10.getString(i17)), z11));
                            jVar = this;
                            d10 = i10;
                            d11 = i12;
                            d12 = i11;
                        }
                    }
                    Integer valueOf = e10.isNull(d18) ? null : Integer.valueOf(e10.getInt(d18));
                    if (valueOf == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                    }
                    Integer valueOf2 = e10.isNull(d19) ? null : Integer.valueOf(e10.getInt(d19));
                    Integer valueOf3 = e10.isNull(d20) ? null : Integer.valueOf(e10.getInt(d20));
                    if (e10.isNull(d21)) {
                        i12 = d11;
                        i11 = d12;
                        num = null;
                    } else {
                        i12 = d11;
                        i11 = d12;
                        num = Integer.valueOf(e10.getInt(d21));
                    }
                    quantityPickerDataModel = new QuantityPickerDataModel(bool, valueOf2, valueOf3, num);
                    i13 = i14;
                    int i152 = d23;
                    i14 = i13;
                    int i162 = d24;
                    d23 = i152;
                    d24 = i162;
                    int i172 = d25;
                    d25 = i172;
                    arrayList.add(new gz.c(string, j10, productLiteRemote, d26, d27, z10, quantityPickerDataModel, w10, new C14523a(e10.getString(i13), e10.getString(i152), e10.getString(i162), e10.getString(i172)), z11));
                    jVar = this;
                    d10 = i10;
                    d11 = i12;
                    d12 = i11;
                }
                e10.close();
                return arrayList;
            } catch (Throwable th2) {
                e10.close();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f127195a.h();
        }
    }

    /* renamed from: fz.b$k */
    class k extends C7014k<gz.c> {
        k(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, gz.c cVar) {
            kVar.H(1, cVar.c());
            kVar.i2(2, cVar.j());
            Integer num = null;
            String b10 = cVar.h() == null ? null : C14489b.this.A().b(cVar.h());
            if (b10 == null) {
                kVar.I2(3);
            } else {
                kVar.H(3, b10);
            }
            kVar.g0(4, cVar.f());
            kVar.g0(5, cVar.e());
            kVar.i2(6, cVar.d() ? 1 : 0);
            kVar.H(7, C14489b.this.y(cVar.k()));
            kVar.i2(8, cVar.l() ? 1 : 0);
            QuantityPickerDataModel i10 = cVar.i();
            if (i10 != null) {
                if (i10.a() != null) {
                    num = Integer.valueOf(i10.a().booleanValue() ? 1 : 0);
                }
                if (num == null) {
                    kVar.I2(9);
                } else {
                    kVar.i2(9, (long) num.intValue());
                }
                if (i10.c() == null) {
                    kVar.I2(10);
                } else {
                    kVar.i2(10, (long) i10.c().intValue());
                }
                if (i10.b() == null) {
                    kVar.I2(11);
                } else {
                    kVar.i2(11, (long) i10.b().intValue());
                }
                if (i10.d() == null) {
                    kVar.I2(12);
                } else {
                    kVar.i2(12, (long) i10.d().intValue());
                }
            } else {
                kVar.I2(9);
                kVar.I2(10);
                kVar.I2(11);
                kVar.I2(12);
            }
            C14523a g10 = cVar.g();
            kVar.H(13, g10.e());
            kVar.H(14, g10.b());
            kVar.H(15, g10.c());
            kVar.H(16, g10.d());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scan_and_go_cart_products` (`barcode`,`timeStamp`,`productLite`,`inclTax`,`exclTax`,`collected`,`type`,`isSkipped`,`enabled`,`min`,`max`,`selected`,`itemLocation_title`,`itemLocation_aisle`,`itemLocation_bin`,`itemLocation_department`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: fz.b$l */
    class l implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127198a;

        l(B b10) {
            this.f127198a = b10;
        }

        /* renamed from: a */
        public Integer call() {
            Cursor e10 = b.e(C14489b.this.f127166a, this.f127198a, false, (CancellationSignal) null);
            try {
                return e10.moveToFirst() ? Integer.valueOf(e10.getInt(0)) : 0;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f127198a.h();
        }
    }

    /* renamed from: fz.b$m */
    static /* synthetic */ class m {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f127200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f127200a = r0
                rz.y r1 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f127200a     // Catch:{ NoSuchFieldError -> 0x001d }
                rz.y r1 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f127200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rz.y r1 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f127200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rz.y r1 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f127200a     // Catch:{ NoSuchFieldError -> 0x003e }
                rz.y r1 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fz.C14489b.m.<clinit>():void");
        }
    }

    /* renamed from: fz.b$n */
    class n extends C7013j<gz.c> {
        n(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, gz.c cVar) {
            kVar.H(1, cVar.c());
            kVar.i2(2, cVar.j());
            Integer num = null;
            String b10 = cVar.h() == null ? null : C14489b.this.A().b(cVar.h());
            if (b10 == null) {
                kVar.I2(3);
            } else {
                kVar.H(3, b10);
            }
            kVar.g0(4, cVar.f());
            kVar.g0(5, cVar.e());
            kVar.i2(6, cVar.d() ? 1 : 0);
            kVar.H(7, C14489b.this.y(cVar.k()));
            kVar.i2(8, cVar.l() ? 1 : 0);
            QuantityPickerDataModel i10 = cVar.i();
            if (i10 != null) {
                if (i10.a() != null) {
                    num = Integer.valueOf(i10.a().booleanValue() ? 1 : 0);
                }
                if (num == null) {
                    kVar.I2(9);
                } else {
                    kVar.i2(9, (long) num.intValue());
                }
                if (i10.c() == null) {
                    kVar.I2(10);
                } else {
                    kVar.i2(10, (long) i10.c().intValue());
                }
                if (i10.b() == null) {
                    kVar.I2(11);
                } else {
                    kVar.i2(11, (long) i10.b().intValue());
                }
                if (i10.d() == null) {
                    kVar.I2(12);
                } else {
                    kVar.i2(12, (long) i10.d().intValue());
                }
            } else {
                kVar.I2(9);
                kVar.I2(10);
                kVar.I2(11);
                kVar.I2(12);
            }
            C14523a g10 = cVar.g();
            kVar.H(13, g10.e());
            kVar.H(14, g10.b());
            kVar.H(15, g10.c());
            kVar.H(16, g10.d());
            kVar.H(17, cVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_cart_products` SET `barcode` = ?,`timeStamp` = ?,`productLite` = ?,`inclTax` = ?,`exclTax` = ?,`collected` = ?,`type` = ?,`isSkipped` = ?,`enabled` = ?,`min` = ?,`max` = ?,`selected` = ?,`itemLocation_title` = ?,`itemLocation_aisle` = ?,`itemLocation_bin` = ?,`itemLocation_department` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.b$o */
    class o extends C7013j<c.C3133c> {
        o(C14489b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, c.C3133c cVar) {
            kVar.H(1, cVar.a());
            kVar.i2(2, (long) cVar.b());
            kVar.H(3, cVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_cart_products` SET `barcode` = ?,`selected` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.b$p */
    class p extends C7013j<c.a> {
        p(C14489b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, c.a aVar) {
            kVar.H(1, aVar.a());
            kVar.i2(2, (long) aVar.d());
            kVar.i2(3, (long) aVar.c());
            kVar.i2(4, aVar.b() ? 1 : 0);
            kVar.H(5, aVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_cart_products` SET `barcode` = ?,`selected` = ?,`max` = ?,`collected` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.b$q */
    class q extends C7013j<c.d> {
        q(C14489b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, c.d dVar) {
            kVar.H(1, dVar.a());
            kVar.i2(2, dVar.b() ? 1 : 0);
            kVar.H(3, dVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_cart_products` SET `barcode` = ?,`isSkipped` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.b$r */
    class r extends C7013j<c.b> {
        r(C14489b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, c.b bVar) {
            kVar.H(1, bVar.a());
            kVar.g0(2, bVar.c());
            kVar.g0(3, bVar.b());
            kVar.i2(4, (long) bVar.e());
            kVar.i2(5, (long) bVar.d());
            kVar.H(6, bVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_cart_products` SET `barcode` = ?,`inclTax` = ?,`exclTax` = ?,`selected` = ?,`max` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.b$s */
    class s extends H {
        s(C14489b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM scan_and_go_cart_products WHERE barcode = ?";
        }
    }

    /* renamed from: fz.b$t */
    class t extends H {
        t(C14489b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE scan_and_go_cart_products SET collected = ? WHERE barcode = ?";
        }
    }

    /* renamed from: fz.b$u */
    class u implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gz.c f127202a;

        u(gz.c cVar) {
            this.f127202a = cVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14489b.this.f127166a.beginTransaction();
            try {
                C14489b.this.f127167b.insert(this.f127202a);
                C14489b.this.f127166a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14489b.this.f127166a.endTransaction();
            }
        }
    }

    public C14489b(x xVar) {
        this.f127166a = xVar;
        this.f127167b = new k(xVar);
        this.f127169d = new n(xVar);
        this.f127170e = new o(this, xVar);
        this.f127171f = new p(this, xVar);
        this.f127172g = new q(this, xVar);
        this.f127173h = new r(this, xVar);
        this.f127174i = new s(this, xVar);
        this.f127175j = new t(this, xVar);
    }

    /* access modifiers changed from: private */
    public synchronized C14437a A() {
        try {
            if (this.f127168c == null) {
                this.f127168c = (C14437a) this.f127166a.getTypeConverter(C14437a.class);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f127168c;
    }

    public static List<Class<?>> B() {
        return Arrays.asList(new Class[]{C14437a.class});
    }

    /* access modifiers changed from: private */
    public String y(C15031y yVar) {
        int i10 = m.f127200a[yVar.ordinal()];
        if (i10 == 1) {
            return "SELF_SERVE";
        }
        if (i10 == 2) {
            return "CASH_AND_CARRY";
        }
        if (i10 == 3) {
            return "COMBINATION";
        }
        if (i10 == 4) {
            return "FULL_SERVE";
        }
        if (i10 == 5) {
            return "UNKNOWN";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + yVar);
    }

    /* access modifiers changed from: private */
    public C15031y z(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1316276633:
                if (str.equals("CASH_AND_CARRY")) {
                    c10 = 0;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c10 = 1;
                    break;
                }
                break;
            case 517848124:
                if (str.equals("SELF_SERVE")) {
                    c10 = 2;
                    break;
                }
                break;
            case 953110847:
                if (str.equals("FULL_SERVE")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1503907503:
                if (str.equals("COMBINATION")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return C15031y.CASH_AND_CARRY;
            case 1:
                return C15031y.UNKNOWN;
            case 2:
                return C15031y.SELF_SERVE;
            case 3:
                return C15031y.FULL_SERVE;
            case 4:
                return C15031y.COMBINATION;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    public Object a(c.a aVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new c(aVar), eVar);
    }

    public Object b(String str, C17164e<? super gz.c> eVar) {
        B e10 = B.e("\n        SELECT * FROM scan_and_go_cart_products \n        WHERE barcode LIKE ? \n        ", 1);
        e10.H(1, str);
        return C7009f.b(this.f127166a, false, b.a(), new h(e10), eVar);
    }

    public Object c(String str, boolean z10, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new g(z10, str), eVar);
    }

    public Object d(List<c.d> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new d(list), eVar);
    }

    public Object e(gz.c cVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new a(cVar), eVar);
    }

    public Object f(gz.c cVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new u(cVar), eVar);
    }

    public Object g(List<c.b> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new e(list), eVar);
    }

    public Object h(c.C3133c cVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new C3112b(cVar), eVar);
    }

    public C16532g<Integer> i() {
        return C7009f.a(this.f127166a, false, new String[]{"scan_and_go_cart_products"}, new l(B.e("SELECT TOTAL(selected) FROM scan_and_go_cart_products", 0)));
    }

    public Object j(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127166a, true, new f(str), eVar);
    }

    public C16532g<List<gz.c>> k() {
        return C7009f.a(this.f127166a, false, new String[]{"scan_and_go_cart_products"}, new j(B.e("SELECT * FROM scan_and_go_cart_products ORDER BY timeStamp DESC", 0)));
    }

    public Object l(C17164e<? super List<gz.c>> eVar) {
        B e10 = B.e("SELECT * FROM scan_and_go_cart_products ORDER BY timeStamp DESC", 0);
        return C7009f.b(this.f127166a, false, b.a(), new i(e10), eVar);
    }
}
