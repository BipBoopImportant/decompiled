package H9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import xa.C8972m;

/* renamed from: H9.y  reason: case insensitive filesystem */
public final class C6550y {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f36654a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f36655b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f36654a) {
            hashMap = new HashMap(this.f36654a);
        }
        synchronized (this.f36655b) {
            hashMap2 = new HashMap(this.f36655b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C8972m) entry2.getKey()).d(new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f36654a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.a(new C6548w(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final void d(C8972m mVar, boolean z10) {
        this.f36655b.put(mVar, Boolean.valueOf(z10));
        mVar.a().c(new C6549x(this, mVar));
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C6531e.f36556p);
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return !this.f36654a.isEmpty() || !this.f36655b.isEmpty();
    }
}
