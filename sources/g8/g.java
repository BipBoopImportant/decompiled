package G8;

import D8.c;
import HJ.C15838d;
import HJ.C15854t;
import XH.C16816g;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64;
import com.optimizely.ab.config.FeatureVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0011*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0011*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010 \u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b \u0010!\u001a\u001b\u0010$\u001a\u00020\u0011*\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020\u001f*\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110&¢\u0006\u0004\b(\u0010)\u001a#\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010**\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b,\u0010-\u001a\u001b\u00100\u001a\u0004\u0018\u00010\u0011*\u00020.2\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101\u001a\u001b\u00103\u001a\u0004\u0018\u000102*\u00020.2\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b3\u00104\u001a\u001b\u00105\u001a\u0004\u0018\u00010.*\u00020.2\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b5\u00106\u001a\u001b\u00107\u001a\u0004\u0018\u00010\u0010*\u00020.2\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Landroid/graphics/Bitmap;", "bmp", "", "posX", "posY", "LXH/N;", "c", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;FF)V", "Landroid/graphics/Bitmap$Config;", "j", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;", "Landroid/app/Application;", "Landroid/content/Intent;", "service", "m", "(Landroid/app/Application;Landroid/content/Intent;)V", "", "", "o", "(I)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "", "p", "([B)Ljava/lang/String;", "Landroid/content/Context;", "resourceName", "k", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "", "baseClassName", "", "h", "(Ljava/lang/Object;Ljava/lang/String;)Z", "", "maxLine", "a", "(Ljava/lang/Throwable;I)Ljava/lang/String;", "", "blockedVersions", "i", "(Ljava/lang/String;Ljava/util/List;)Z", "T", "", "l", "(Ljava/lang/Iterable;)Ljava/util/List;", "Lorg/json/JSONObject;", "name", "g", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "e", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;", "d", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final String a(Throwable th2, int i10) {
        C17542s.j(th2, "<this>");
        List<T> k12 = C16877v.k1(C15854t.C0(C16816g.b(th2)), i10);
        ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
        for (T t10 : k12) {
            arrayList.add(t10 + 10);
        }
        return C15854t.Q(arrayList.toString(), ",", "", false, 4, (Object) null);
    }

    public static /* synthetic */ String b(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 50;
        }
        return a(th2, i10);
    }

    public static final void c(Bitmap bitmap, Bitmap bitmap2, float f10, float f11) {
        C17542s.j(bitmap, "<this>");
        C17542s.j(bitmap2, "bmp");
        new Canvas(bitmap).drawBitmap(bitmap2, f10, f11, (Paint) null);
    }

    public static final Integer d(JSONObject jSONObject, String str) {
        C17542s.j(jSONObject, "<this>");
        C17542s.j(str, "name");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    public static final JSONObject e(JSONObject jSONObject, String str) {
        C17542s.j(jSONObject, "<this>");
        C17542s.j(str, "name");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static final Long f(JSONObject jSONObject, String str) {
        C17542s.j(jSONObject, "<this>");
        C17542s.j(str, "name");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.getLong(str));
    }

    public static final String g(JSONObject jSONObject, String str) {
        C17542s.j(jSONObject, "<this>");
        C17542s.j(str, "name");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static final boolean h(Object obj, String str) {
        C17542s.j(obj, "<this>");
        C17542s.j(str, "baseClassName");
        for (Class cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (C17542s.e(cls.getSimpleName(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean i(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "blockedVersions"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.util.Iterator r4 = r4.iterator()
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r0)
            r2 = 1
            if (r1 == 0) goto L_0x0022
            return r2
        L_0x0022:
            boolean r0 = G8.y.a(r0, r3)
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.g.i(java.lang.String, java.util.List):boolean");
    }

    public static final Bitmap.Config j(Bitmap.Config config) {
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    @SuppressLint({"DiscouragedApi"})
    public static final String k(Context context, String str) {
        C17542s.j(context, "<this>");
        C17542s.j(str, "resourceName");
        try {
            int identifier = context.getResources().getIdentifier(str, FeatureVariable.STRING_TYPE, context.getPackageName());
            String string = identifier != 0 ? context.getResources().getString(identifier) : "";
            C17542s.i(string, "{\n        val resourceId…       \"\"\n        }\n    }");
            return string;
        } catch (Resources.NotFoundException e10) {
            c cVar = new c("Extension");
            cVar.f("Resource not found: " + e10.getMessage());
            return "";
        }
    }

    public static final <T> List<T> l(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C16877v.t1(iterable);
        }
        List<T> v12 = C16877v.v1(iterable);
        C16877v.c0(v12);
        return v12;
    }

    public static final void m(Application application, Intent intent) {
        C17542s.j(application, "<this>");
        C17542s.j(intent, "service");
        try {
            application.startService(intent);
        } catch (IllegalStateException unused) {
            new c((String) null, 1, (DefaultConstructorMarker) null).j("Cannot open cs-in-app, please retry.");
        }
    }

    public static final String n(String str) {
        C17542s.j(str, "<this>");
        byte[] bytes = str.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        C17542s.i(encodeToString, "encodeToString(this.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    public static final String o(int i10) {
        V v10 = V.f144353a;
        String format = String.format(Locale.ROOT, "#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        C17542s.i(format, "format(locale, format, *args)");
        return format;
    }

    public static final String p(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append("0123456789ABCDEF".charAt((b10 >> 4) & 15));
            sb2.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "hash.toString()");
        return sb3;
    }
}
