package w6;

import java.io.InputStream;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f57265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57266b;

    public /* synthetic */ k(InputStream inputStream, String str) {
        this.f57265a = inputStream;
        this.f57266b = str;
    }

    public final Object call() {
        return r.p(this.f57265a, this.f57266b);
    }
}
