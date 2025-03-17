package Tk;

import O4.e;
import Q4.k;
import TJ.C16532g;
import Wk.f;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class c extends b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f87722a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<f> f87723b;

    /* renamed from: c  reason: collision with root package name */
    private final H f87724c;

    /* renamed from: d  reason: collision with root package name */
    private final H f87725d;

    class a extends C7014k<f> {
        a(c cVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, f fVar) {
            kVar.i2(1, fVar.c());
            kVar.H(2, fVar.o());
            kVar.H(3, fVar.f());
            kVar.H(4, fVar.g());
            if (fVar.i() == null) {
                kVar.I2(5);
            } else {
                kVar.H(5, fVar.i());
            }
            d dVar = d.f87728a;
            kVar.i2(6, (long) d.b(fVar.k()));
            kVar.H(7, fVar.n());
            kVar.H(8, fVar.h());
            if (fVar.e() == null) {
                kVar.I2(9);
            } else {
                kVar.H(9, fVar.e());
            }
            if (fVar.p() == null) {
                kVar.I2(10);
            } else {
                kVar.H(10, fVar.p());
            }
            if (fVar.d() == null) {
                kVar.I2(11);
            } else {
                kVar.H(11, fVar.d());
            }
            if (fVar.a() == null) {
                kVar.I2(12);
            } else {
                kVar.H(12, fVar.a());
            }
            if (fVar.b() == null) {
                kVar.I2(13);
            } else {
                kVar.H(13, fVar.b());
            }
            a aVar = a.f87721a;
            kVar.i2(14, (long) a.b(fVar.j()));
            kVar.H(15, fVar.m());
            kVar.H(16, fVar.l());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `StockInfo` (`DateCreated`,`StoreId`,`itemNo`,`itemType`,`ProductLocation`,`StockStatus`,`StockText`,`Label`,`Heading`,`Title`,`Description`,`Aisle`,`Bin`,`SalePoint`,`StockQuantityDetails`,`StockQuantityChecked`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends H {
        b(c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM StockInfo WHERE itemNo = ?";
        }
    }

    /* renamed from: Tk.c$c  reason: collision with other inner class name */
    class C1830c extends H {
        C1830c(c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM StockInfo";
        }
    }

    class d implements Callable<List<f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f87726a;

        d(B b10) {
            this.f87726a = b10;
        }

        /* renamed from: a */
        public List<f> call() {
            String str;
            int i10;
            Cursor e10 = O4.b.e(c.this.f87722a, this.f87726a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "DateCreated");
                int d11 = O4.a.d(e10, "StoreId");
                int d12 = O4.a.d(e10, "itemNo");
                int d13 = O4.a.d(e10, "itemType");
                int d14 = O4.a.d(e10, "ProductLocation");
                int d15 = O4.a.d(e10, "StockStatus");
                int d16 = O4.a.d(e10, "StockText");
                int d17 = O4.a.d(e10, "Label");
                int d18 = O4.a.d(e10, "Heading");
                int d19 = O4.a.d(e10, "Title");
                int d20 = O4.a.d(e10, "Description");
                int d21 = O4.a.d(e10, "Aisle");
                int d22 = O4.a.d(e10, "Bin");
                int d23 = O4.a.d(e10, "SalePoint");
                int d24 = O4.a.d(e10, "StockQuantityDetails");
                int d25 = O4.a.d(e10, "StockQuantityChecked");
                int i11 = d23;
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    long j10 = e10.getLong(d10);
                    String string = e10.getString(d11);
                    String string2 = e10.getString(d12);
                    String string3 = e10.getString(d13);
                    String string4 = e10.isNull(d14) ? null : e10.getString(d14);
                    com.ingka.ikea.app.stockinfo.network.d a10 = d.a(e10.getInt(d15));
                    String string5 = e10.getString(d16);
                    String string6 = e10.getString(d17);
                    String string7 = e10.isNull(d18) ? null : e10.getString(d18);
                    String string8 = e10.isNull(d19) ? null : e10.getString(d19);
                    String string9 = e10.isNull(d20) ? null : e10.getString(d20);
                    String string10 = e10.isNull(d21) ? null : e10.getString(d21);
                    if (e10.isNull(d22)) {
                        i10 = i11;
                        str = null;
                    } else {
                        str = e10.getString(d22);
                        i10 = i11;
                    }
                    com.ingka.ikea.app.stockinfo.network.c a11 = a.a(e10.getInt(i10));
                    int i12 = d10;
                    int i13 = d24;
                    String string11 = e10.getString(i13);
                    d24 = i13;
                    int i14 = d25;
                    d25 = i14;
                    arrayList.add(new f(j10, string, string2, string3, string4, a10, string5, string6, string7, string8, string9, string10, str, a11, string11, e10.getString(i14)));
                    d10 = i12;
                    i11 = i10;
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f87726a.h();
        }
    }

    public c(x xVar) {
        this.f87722a = xVar;
        this.f87723b = new a(this, xVar);
        this.f87724c = new b(this, xVar);
        this.f87725d = new C1830c(this, xVar);
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public void a() {
        this.f87722a.assertNotSuspendingTransaction();
        k acquire = this.f87725d.acquire();
        try {
            this.f87722a.beginTransaction();
            acquire.b0();
            this.f87722a.setTransactionSuccessful();
            this.f87722a.endTransaction();
            this.f87725d.release(acquire);
        } catch (Throwable th2) {
            this.f87725d.release(acquire);
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void b(String str, List<String> list) {
        this.f87722a.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM StockInfo WHERE StoreId = ");
        b10.append("?");
        b10.append(" AND itemNo IN (");
        e.a(b10, list.size());
        b10.append(")");
        k compileStatement = this.f87722a.compileStatement(b10.toString());
        compileStatement.H(1, str);
        int i10 = 2;
        for (String H10 : list) {
            compileStatement.H(i10, H10);
            i10++;
        }
        this.f87722a.beginTransaction();
        try {
            compileStatement.b0();
            this.f87722a.setTransactionSuccessful();
        } finally {
            this.f87722a.endTransaction();
        }
    }

    public void c(String str, List<String> list) {
        this.f87722a.beginTransaction();
        try {
            super.c(str, list);
            this.f87722a.setTransactionSuccessful();
        } finally {
            this.f87722a.endTransaction();
        }
    }

    public void d(String str) {
        this.f87722a.assertNotSuspendingTransaction();
        k acquire = this.f87724c.acquire();
        acquire.H(1, str);
        try {
            this.f87722a.beginTransaction();
            acquire.b0();
            this.f87722a.setTransactionSuccessful();
            this.f87722a.endTransaction();
            this.f87724c.release(acquire);
        } catch (Throwable th2) {
            this.f87724c.release(acquire);
            throw th2;
        }
    }

    public C16532g<List<f>> e(String str) {
        B e10 = B.e("SELECT * FROM StockInfo WHERE StoreId = ?", 1);
        e10.H(1, str);
        return C7009f.a(this.f87722a, false, new String[]{"StockInfo"}, new d(e10));
    }

    public f f(String str, String str2) {
        B b10;
        f fVar;
        B e10 = B.e("SELECT * FROM StockInfo WHERE StoreId = ? AND itemNo = ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        this.f87722a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f87722a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "DateCreated");
            int d11 = O4.a.d(e11, "StoreId");
            int d12 = O4.a.d(e11, "itemNo");
            int d13 = O4.a.d(e11, "itemType");
            int d14 = O4.a.d(e11, "ProductLocation");
            int d15 = O4.a.d(e11, "StockStatus");
            int d16 = O4.a.d(e11, "StockText");
            int d17 = O4.a.d(e11, "Label");
            int d18 = O4.a.d(e11, "Heading");
            int d19 = O4.a.d(e11, "Title");
            int d20 = O4.a.d(e11, "Description");
            int d21 = O4.a.d(e11, "Aisle");
            int d22 = O4.a.d(e11, "Bin");
            int d23 = O4.a.d(e11, "SalePoint");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "StockQuantityDetails");
                int d25 = O4.a.d(e11, "StockQuantityChecked");
                if (e11.moveToFirst()) {
                    fVar = new f(e11.getLong(d10), e11.getString(d11), e11.getString(d12), e11.getString(d13), e11.isNull(d14) ? null : e11.getString(d14), d.a(e11.getInt(d15)), e11.getString(d16), e11.getString(d17), e11.isNull(d18) ? null : e11.getString(d18), e11.isNull(d19) ? null : e11.getString(d19), e11.isNull(d20) ? null : e11.getString(d20), e11.isNull(d21) ? null : e11.getString(d21), e11.isNull(d22) ? null : e11.getString(d22), a.a(e11.getInt(d23)), e11.getString(d24), e11.getString(d25));
                } else {
                    fVar = null;
                }
                e11.close();
                b10.h();
                return fVar;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public void g(List<f> list) {
        this.f87722a.assertNotSuspendingTransaction();
        this.f87722a.beginTransaction();
        try {
            this.f87723b.insert(list);
            this.f87722a.setTransactionSuccessful();
        } finally {
            this.f87722a.endTransaction();
        }
    }
}
