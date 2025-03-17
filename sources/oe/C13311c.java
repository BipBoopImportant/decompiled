package OE;

import android.content.Context;
import com.google.ar.core.ArCoreApk;
import com.sugarcube.app.base.ui.hybrid.HybridActivity;
import com.sugarcube.app.base.ui.ultrawide.UltrawideActivity;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LOE/c;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/google/ar/core/ArCoreApk$Availability;", "a", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "", "b", "()Z", "c", "(Landroid/content/Context;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OE.c  reason: case insensitive filesystem */
public final class C13311c {
    public final Object a(Context context, C17164e<? super ArCoreApk.Availability> eVar) {
        return HybridActivity.f124750H.a(context, eVar);
    }

    public final boolean b() {
        return HybridActivity.f124750H.b();
    }

    public final boolean c(Context context) {
        C17542s.j(context, "appContext");
        return UltrawideActivity.f125419I.a(context);
    }
}
