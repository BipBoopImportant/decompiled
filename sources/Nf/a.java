package Nf;

import Mn.b;
import Mn.c;
import android.content.Context;
import android.content.Intent;
import g.C5314c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LNf/a;", "LNf/d;", "LMn/b;", "checkoutApi", "<init>", "(LMn/b;)V", "Landroid/content/Context;", "context", "LMn/c;", "checkoutData", "Lg/c;", "Landroid/content/Intent;", "launchCheckoutActivity", "LXH/N;", "a", "(Landroid/content/Context;LMn/c;Lg/c;)V", "LMn/b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f62019a;

    public a(b bVar) {
        C17542s.j(bVar, "checkoutApi");
        this.f62019a = bVar;
    }

    public void a(Context context, c cVar, C5314c<Intent> cVar2) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "checkoutData");
        C17542s.j(cVar2, "launchCheckoutActivity");
        cVar2.a(this.f62019a.a(context, cVar));
    }
}
