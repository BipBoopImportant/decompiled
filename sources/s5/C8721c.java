package s5;

import O4.b;
import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7014k;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.c  reason: case insensitive filesystem */
public final class C8721c implements C8720b {

    /* renamed from: a  reason: collision with root package name */
    private final x f55873a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8719a> f55874b;

    /* renamed from: s5.c$a */
    class a extends C7014k<C8719a> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8719a aVar) {
            kVar.H(1, aVar.b());
            kVar.H(2, aVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C8721c(x xVar) {
        this.f55873a = xVar;
        this.f55874b = new a(xVar);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public List<String> a(String str) {
        B e10 = B.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        e10.H(1, str);
        this.f55873a.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.f55873a, e10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(e11.getString(0));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public boolean b(String str) {
        boolean z10 = true;
        B e10 = B.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        e10.H(1, str);
        this.f55873a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor e11 = b.e(this.f55873a, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                if (e11.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public void c(C8719a aVar) {
        this.f55873a.assertNotSuspendingTransaction();
        this.f55873a.beginTransaction();
        try {
            this.f55874b.insert(aVar);
            this.f55873a.setTransactionSuccessful();
        } finally {
            this.f55873a.endTransaction();
        }
    }

    public boolean d(String str) {
        boolean z10 = true;
        B e10 = B.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        e10.H(1, str);
        this.f55873a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor e11 = b.e(this.f55873a, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                if (e11.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            e11.close();
            e10.h();
        }
    }
}
