package O8;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.optimizely.ab.config.FeatureVariable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001c"}, d2 = {"LO8/a;", "", "", "packageName", "versionName", "", "versionCode", "nativeMappingVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "J", "getVersionCode", "()J", "d", "e", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0619a f39265e = new C0619a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39266a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39267b;

    /* renamed from: c  reason: collision with root package name */
    private final long f39268c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39269d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LO8/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LO8/a;", "a", "(Landroid/content/Context;)LO8/a;", "", "MAPPING_ID_RESOURCE_IDENTIFIER", "Ljava/lang/String;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O8.a$a  reason: collision with other inner class name */
    public static final class C0619a {
        private C0619a() {
        }

        public final a a(Context context) {
            String str;
            C17542s.j(context, "context");
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            C17542s.i(packageInfo, "context.packageManager.g…ckageInfo(packageName, 0)");
            int identifier = context.getResources().getIdentifier("contentsquare_mapping_id", FeatureVariable.STRING_TYPE, packageName);
            if (identifier == 0) {
                str = "";
            } else {
                String string = context.getResources().getString(identifier);
                C17542s.i(string, "{\n                contex…ppingIdRes)\n            }");
                str = string;
            }
            String str2 = packageName == null ? "" : packageName;
            String str3 = packageInfo.versionName;
            return new a(str2, str3 == null ? "" : str3, (long) packageInfo.versionCode, str);
        }

        public /* synthetic */ C0619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(String str, String str2, long j10, String str3) {
        C17542s.j(str, "packageName");
        C17542s.j(str2, "versionName");
        C17542s.j(str3, "nativeMappingVersion");
        this.f39266a = str;
        this.f39267b = str2;
        this.f39268c = j10;
        this.f39269d = str3;
    }

    public final String a() {
        return this.f39269d;
    }

    public final String b() {
        return this.f39266a;
    }

    public final String c() {
        return this.f39267b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f39266a, aVar.f39266a) && C17542s.e(this.f39267b, aVar.f39267b) && this.f39268c == aVar.f39268c && C17542s.e(this.f39269d, aVar.f39269d);
    }

    public int hashCode() {
        int hashCode = this.f39267b.hashCode();
        int hashCode2 = Long.hashCode(this.f39268c);
        return this.f39269d.hashCode() + ((hashCode2 + ((hashCode + (this.f39266a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ApplicationData(packageName=" + this.f39266a + ", versionName=" + this.f39267b + ", versionCode=" + this.f39268c + ", nativeMappingVersion=" + this.f39269d + ')';
    }
}
