package Nu;

import Su.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8951o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LNu/c;", "LSu/a;", "<init>", "()V", "Lx4/o;", "navController", "", "salesOrderId", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;)V", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {
    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "salesOrderId");
        Uri build = Uri.parse("ikea://navigation/inStorePurchasesStatus/status?orderId={orderId}").buildUpon().appendQueryParameter("orderId", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
