package Ow;

import Lw.b;
import Uw.C13736a;
import android.content.Context;
import android.content.Intent;
import com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity;
import g.C5314c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LOw/c;", "LUw/a;", "<init>", "()V", "Lg/c;", "Landroid/content/Intent;", "launchActivity", "Landroid/content/Context;", "context", "", "checkoutId", "", "isExpressGooglePay", "LXH/N;", "a", "(Lg/c;Landroid/content/Context;Ljava/lang/String;Z)V", "b", "(Landroid/content/Context;)Ljava/lang/String;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ow.c  reason: case insensitive filesystem */
public final class C13325c implements C13736a {
    public void a(C5314c<Intent> cVar, Context context, String str, boolean z10) {
        C17542s.j(cVar, "launchActivity");
        C17542s.j(context, "context");
        C17542s.j(str, "checkoutId");
        cVar.a(PaymentOptionsActivity.f119304S.a(context, str, z10));
    }

    public String b(Context context) {
        C17542s.j(context, "context");
        String string = context.getString(b.f111929a);
        String string2 = context.getString(b.f111930b);
        return string + "://" + string2;
    }
}
