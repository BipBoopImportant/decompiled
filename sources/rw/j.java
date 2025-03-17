package Rw;

import Uw.C13736a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRw/j;", "LRw/i;", "Landroid/content/Context;", "context", "LUw/a;", "onlinePaymentNavigation", "<init>", "(Landroid/content/Context;LUw/a;)V", "", "invoke", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "LUw/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f115626a;

    /* renamed from: b  reason: collision with root package name */
    private final C13736a f115627b;

    public j(Context context, C13736a aVar) {
        C17542s.j(context, "context");
        C17542s.j(aVar, "onlinePaymentNavigation");
        this.f115626a = context;
        this.f115627b = aVar;
    }

    public String invoke() {
        return this.f115627b.b(this.f115626a);
    }
}
