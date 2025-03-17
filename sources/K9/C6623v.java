package K9;

import G9.f;
import android.content.Context;
import android.content.res.Resources;
import com.optimizely.ab.config.FeatureVariable;

/* renamed from: K9.v  reason: case insensitive filesystem */
public class C6623v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f37927a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37928b;

    public C6623v(Context context) {
        C6620s.l(context);
        Resources resources = context.getResources();
        this.f37927a = resources;
        this.f37928b = resources.getResourcePackageName(f.f36319a);
    }

    public String a(String str) {
        int identifier = this.f37927a.getIdentifier(str, FeatureVariable.STRING_TYPE, this.f37928b);
        if (identifier == 0) {
            return null;
        }
        return this.f37927a.getString(identifier);
    }
}
