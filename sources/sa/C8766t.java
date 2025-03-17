package sa;

import com.google.android.gms.internal.measurement.K7;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.E2;
import java.util.concurrent.Callable;

/* renamed from: sa.t  reason: case insensitive filesystem */
public final /* synthetic */ class C8766t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C2 f56135a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f56136b;

    public /* synthetic */ C8766t(C2 c22, String str) {
        this.f56135a = c22;
        this.f56136b = str;
    }

    public final Object call() {
        return new K7("internal.appMetadata", new E2(this.f56135a, this.f56136b));
    }
}
