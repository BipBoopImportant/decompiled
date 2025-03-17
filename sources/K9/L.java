package K9;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f37769a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private b f37770b;

    public L(b bVar) {
        C6620s.l(bVar);
        this.f37770b = bVar;
    }

    public final int a(Context context, int i10) {
        return this.f37769a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f fVar) {
        C6620s.l(context);
        C6620s.l(fVar);
        int i10 = 0;
        if (!fVar.f()) {
            return 0;
        }
        int m10 = fVar.m();
        int a10 = a(context, m10);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f37769a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f37769a.keyAt(i11);
                if (keyAt > m10 && this.f37769a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f37770b.h(context, m10) : i10;
            this.f37769a.put(m10, a10);
        }
        return a10;
    }

    public final void c() {
        this.f37769a.clear();
    }
}
