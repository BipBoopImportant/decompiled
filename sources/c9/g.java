package C9;

import H9.C6543q;
import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import o3.a;

public final class g extends a implements C6543q {

    /* renamed from: o  reason: collision with root package name */
    private final Semaphore f33785o = new Semaphore(0);

    /* renamed from: p  reason: collision with root package name */
    private final Set f33786p;

    public g(Context context, Set set) {
        super(context);
        this.f33786p = set;
    }

    public final /* bridge */ /* synthetic */ Object C() {
        int i10 = 0;
        for (com.google.android.gms.common.api.g d10 : this.f33786p) {
            if (d10.d(this)) {
                i10++;
            }
        }
        try {
            this.f33785o.tryAcquire(i10, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void p() {
        this.f33785o.drainPermits();
        h();
    }
}
