package D2;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"LD2/a;", "", "<init>", "()V", "", "codename", "buildCodename", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "b", "()Z", "", "I", "R_EXTENSION_INT", "c", "S_EXTENSION_INT", "d", "T_EXTENSION_INT", "e", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5498a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f5499b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5500c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5501d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5502e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LD2/a$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D2.a$a  reason: collision with other inner class name */
    private static final class C0036a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0036a f5503a = new C0036a();

        private C0036a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f5499b = i10 >= 30 ? C0036a.f5503a.a(30) : 0;
        f5500c = i10 >= 30 ? C0036a.f5503a.a(31) : 0;
        f5501d = i10 >= 30 ? C0036a.f5503a.a(33) : 0;
        if (i10 >= 30) {
            i11 = C0036a.f5503a.a(1000000);
        }
        f5502e = i11;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        C17542s.j(str, "codename");
        C17542s.j(str2, "buildCodename");
        if (C17542s.e("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        C17542s.i(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 35) {
            if (i10 >= 34) {
                String str = Build.VERSION.CODENAME;
                C17542s.i(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
