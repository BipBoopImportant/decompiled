package dc;

import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* renamed from: dc.c  reason: case insensitive filesystem */
public class C9617c {

    /* renamed from: a  reason: collision with root package name */
    private final C9615a f72377a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f72378b;

    public C9617c(C9615a aVar) {
        this.f72377a = aVar;
        this.f72378b = b(aVar);
    }

    private static void a(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    private static Bundle b(C9615a aVar) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (aVar == null || aVar.J() == null || (bundle = aVar.J().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        a(Constants.MEDIUM, "utm_medium", bundle2, bundle3);
        a("source", "utm_source", bundle2, bundle3);
        a("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }
}
