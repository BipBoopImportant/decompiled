package s5;

import O4.b;
import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7014k;
import androidx.room.x;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.f  reason: case insensitive filesystem */
public final class C8724f implements C8723e {

    /* renamed from: a  reason: collision with root package name */
    private final x f55878a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8722d> f55879b;

    /* renamed from: s5.f$a */
    class a extends C7014k<C8722d> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8722d dVar) {
            kVar.H(1, dVar.a());
            if (dVar.b() == null) {
                kVar.I2(2);
            } else {
                kVar.i2(2, dVar.b().longValue());
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public C8724f(x xVar) {
        this.f55878a = xVar;
        this.f55879b = new a(xVar);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    public void a(C8722d dVar) {
        this.f55878a.assertNotSuspendingTransaction();
        this.f55878a.beginTransaction();
        try {
            this.f55879b.insert(dVar);
            this.f55878a.setTransactionSuccessful();
        } finally {
            this.f55878a.endTransaction();
        }
    }

    public Long b(String str) {
        B e10 = B.e("SELECT long_value FROM Preference where `key`=?", 1);
        e10.H(1, str);
        this.f55878a.assertNotSuspendingTransaction();
        Long l10 = null;
        Cursor e11 = b.e(this.f55878a, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                if (!e11.isNull(0)) {
                    l10 = Long.valueOf(e11.getLong(0));
                }
            }
            return l10;
        } finally {
            e11.close();
            e10.h();
        }
    }
}
