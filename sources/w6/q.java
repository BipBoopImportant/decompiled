package w6;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f57276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f57277b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f57278c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f57279d;

    public /* synthetic */ q(WeakReference weakReference, Context context, int i10, String str) {
        this.f57276a = weakReference;
        this.f57277b = context;
        this.f57278c = i10;
        this.f57279d = str;
    }

    public final Object call() {
        return r.K(this.f57276a, this.f57277b, this.f57278c, this.f57279d);
    }
}
