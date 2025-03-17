package N9;

import K9.C6612j;
import android.util.Log;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f39183a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39184b;

    /* renamed from: c  reason: collision with root package name */
    private final C6612j f39185c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39186d;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f39184b = str2;
        this.f39183a = str;
        this.f39185c = new C6612j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f39183a, i10)) {
            i10++;
        }
        this.f39186d = i10;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f39183a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f39183a, c(str, objArr));
    }

    /* access modifiers changed from: protected */
    public String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f39184b.concat(str);
    }

    public boolean d(int i10) {
        return this.f39186d <= i10;
    }
}
