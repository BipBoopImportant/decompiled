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

/* renamed from: s5.p  reason: case insensitive filesystem */
public final class C8734p implements C8733o {

    /* renamed from: a  reason: collision with root package name */
    private final x f55895a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8732n> f55896b;

    /* renamed from: s5.p$a */
    class a extends C7014k<C8732n> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8732n nVar) {
            kVar.H(1, nVar.a());
            kVar.H(2, nVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C8734p(x xVar) {
        this.f55895a = xVar;
        this.f55896b = new a(xVar);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    public void a(C8732n nVar) {
        this.f55895a.assertNotSuspendingTransaction();
        this.f55895a.beginTransaction();
        try {
            this.f55896b.insert(nVar);
            this.f55895a.setTransactionSuccessful();
        } finally {
            this.f55895a.endTransaction();
        }
    }

    public List<String> b(String str) {
        B e10 = B.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        e10.H(1, str);
        this.f55895a.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.f55895a, e10, false, (CancellationSignal) null);
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
}
