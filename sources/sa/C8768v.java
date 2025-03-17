package sa;

import G9.f;
import K9.C6620s;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.optimizely.ab.config.FeatureVariable;

/* renamed from: sa.v  reason: case insensitive filesystem */
public final class C8768v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f56138a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56139b;

    public C8768v(Context context, String str) {
        C6620s.l(context);
        this.f56138a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f56139b = str;
        } else {
            this.f56139b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(f.f36319a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f56138a.getIdentifier(str, FeatureVariable.STRING_TYPE, this.f56139b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f56138a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
