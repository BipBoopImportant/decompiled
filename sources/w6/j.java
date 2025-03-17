package w6;

import android.content.Context;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57263b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f57264c;

    public /* synthetic */ j(Context context, String str, String str2) {
        this.f57262a = context;
        this.f57263b = str;
        this.f57264c = str2;
    }

    public final Object call() {
        return r.L(this.f57262a, this.f57263b, this.f57264c);
    }
}
