package Sw;

import HJ.C15854t;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "token", "Landroid/content/Context;", "context", "Landroid/content/pm/PackageManager;", "packageManager", "shopperResultUrlString", "", "b", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/pm/PackageManager;Ljava/lang/String;)Z", "a", "(Landroid/content/pm/PackageManager;)Z", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sw.b  reason: case insensitive filesystem */
public final class C13670b {
    public static final boolean a(PackageManager packageManager) {
        C17542s.j(packageManager, "packageManager");
        try {
            packageManager.getPackageInfo("se.bankgirot.swish", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final boolean b(String str, Context context, PackageManager packageManager, String str2) {
        C17542s.j(str, "token");
        C17542s.j(context, "context");
        C17542s.j(packageManager, "packageManager");
        C17542s.j(str2, "shopperResultUrlString");
        if (!a(packageManager)) {
            IllegalStateException illegalStateException = new IllegalStateException("Swish should be installed. It has already been checked.");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "startSwish";
                }
                bVar.a(eVar, str4, false, illegalStateException, str3);
            }
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("swish").authority("paymentrequest").appendQueryParameter("token", str).appendQueryParameter("callbackurl", str2).build());
        intent.setPackage("se.bankgirot.swish");
        try {
            C6012a.o(context, intent, (Bundle) null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
