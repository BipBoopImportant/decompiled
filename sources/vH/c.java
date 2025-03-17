package Vh;

import Yz.b;
import android.os.Bundle;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.F;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LVh/c;", "Lx4/F;", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "value", "l", "(Ljava/lang/String;)Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "LXH/N;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningMoreInfo;)V", "LkK/c;", "u", "LkK/c;", "json", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends F<WarningMoreInfo> {

    /* renamed from: t  reason: collision with root package name */
    public static final c f64608t = new c();

    /* renamed from: u  reason: collision with root package name */
    private static final C17514c f64609u = b.f118278a.b();

    /* renamed from: v  reason: collision with root package name */
    public static final int f64610v = 8;

    private c() {
        super(false);
    }

    /* renamed from: k */
    public WarningMoreInfo a(Bundle bundle, String str) {
        C17542s.j(bundle, "bundle");
        C17542s.j(str, "key");
        String string = bundle.getString(str);
        if (string != null) {
            return f64608t.f(string);
        }
        return null;
    }

    /* renamed from: l */
    public WarningMoreInfo f(String str) {
        C17542s.j(str, "value");
        C17514c cVar = f64609u;
        cVar.a();
        return (WarningMoreInfo) cVar.c(WarningMoreInfo.Companion.serializer(), str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, WarningMoreInfo warningMoreInfo) {
        C17542s.j(bundle, "bundle");
        C17542s.j(str, "key");
        C17542s.j(warningMoreInfo, "value");
        bundle.putString(str, f64609u.b(WarningMoreInfo.Companion.serializer(), warningMoreInfo));
    }
}
