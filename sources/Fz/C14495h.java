package fz;

import Q4.k;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import dI.C17164e;
import ez.C14437a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fz.h  reason: case insensitive filesystem */
public final class C14495h implements C14494g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f127232a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<gz.e> f127233b;

    /* renamed from: c  reason: collision with root package name */
    private C14437a f127234c;

    /* renamed from: d  reason: collision with root package name */
    private final C7013j<gz.e> f127235d;

    /* renamed from: e  reason: collision with root package name */
    private final H f127236e;

    /* renamed from: fz.h$a */
    class a extends C7014k<gz.e> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, gz.e eVar) {
            kVar.H(1, eVar.a());
            String c10 = C14495h.this.e().c(eVar.d());
            if (c10 == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, c10);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scan_and_go_scanned_products` (`barcode`,`product`) VALUES (?,?)";
        }
    }

    /* renamed from: fz.h$b */
    class b extends C7013j<gz.e> {
        b(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, gz.e eVar) {
            kVar.H(1, eVar.a());
            String c10 = C14495h.this.e().c(eVar.d());
            if (c10 == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, c10);
            }
            kVar.H(3, eVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `scan_and_go_scanned_products` SET `barcode` = ?,`product` = ? WHERE `barcode` = ?";
        }
    }

    /* renamed from: fz.h$c */
    class c extends H {
        c(C14495h hVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM scan_and_go_scanned_products WHERE barcode = ?";
        }
    }

    /* renamed from: fz.h$d */
    class d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gz.e f127239a;

        d(gz.e eVar) {
            this.f127239a = eVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14495h.this.f127232a.beginTransaction();
            try {
                C14495h.this.f127233b.insert(this.f127239a);
                C14495h.this.f127232a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14495h.this.f127232a.endTransaction();
            }
        }
    }

    /* renamed from: fz.h$e */
    class e implements Callable<List<gz.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127241a;

        e(B b10) {
            this.f127241a = b10;
        }

        /* renamed from: a */
        public List<gz.e> call() {
            Cursor e10 = O4.b.e(C14495h.this.f127232a, this.f127241a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "barcode");
                int d11 = O4.a.d(e10, "product");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new gz.e(e10.getString(d10), C14495h.this.e().f(e10.isNull(d11) ? null : e10.getString(d11))));
                }
                return arrayList;
            } finally {
                e10.close();
                this.f127241a.h();
            }
        }
    }

    public C14495h(x xVar) {
        this.f127232a = xVar;
        this.f127233b = new a(xVar);
        this.f127235d = new b(xVar);
        this.f127236e = new c(this, xVar);
    }

    /* access modifiers changed from: private */
    public synchronized C14437a e() {
        try {
            if (this.f127234c == null) {
                this.f127234c = (C14437a) this.f127232a.getTypeConverter(C14437a.class);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f127234c;
    }

    public static List<Class<?>> f() {
        return Arrays.asList(new Class[]{C14437a.class});
    }

    public Object a(gz.e eVar, C17164e<? super C16807N> eVar2) {
        return C7009f.c(this.f127232a, true, new d(eVar), eVar2);
    }

    public Object j(String str, C17164e<? super List<gz.e>> eVar) {
        B e10 = B.e("\n        SELECT * FROM scan_and_go_scanned_products \n        WHERE barcode LIKE ? \n    ", 1);
        e10.H(1, str);
        return C7009f.b(this.f127232a, false, O4.b.a(), new e(e10), eVar);
    }
}
