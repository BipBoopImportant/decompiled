package w6;

import android.content.Context;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57269b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f57270c;

    public /* synthetic */ m(Context context, String str, String str2) {
        this.f57268a = context;
        this.f57269b = str;
        this.f57270c = str2;
    }

    public final Object call() {
        return r.n(this.f57268a, this.f57269b, this.f57270c);
    }
}
