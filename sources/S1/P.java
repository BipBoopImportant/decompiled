package S1;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LS1/L;", "a", "()LS1/L;", "Landroid/graphics/Typeface;", "LS1/B;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Landroid/graphics/Typeface;LS1/B;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "LS1/C;", "fontWeight", "b", "(Ljava/lang/String;LS1/C;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class P {
    public static final L a() {
        return Build.VERSION.SDK_INT >= 28 ? new N() : new O();
    }

    public static final String b(String str, C c10) {
        int F10 = c10.F() / 100;
        if (F10 >= 0 && F10 < 2) {
            return str + "-thin";
        } else if (2 <= F10 && F10 < 4) {
            return str + "-light";
        } else if (F10 == 4) {
            return str;
        } else {
            if (F10 == 5) {
                return str + "-medium";
            } else if ((6 <= F10 && F10 < 8) || 8 > F10 || F10 >= 11) {
                return str;
            } else {
                return str + "-black";
            }
        }
    }

    public static final Typeface c(Typeface typeface, B b10, Context context) {
        return U.f13351a.a(typeface, b10, context);
    }
}
