package G8;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"LG8/e;", "", "<init>", "()V", "", "androidAPI", "", "e", "(I)Z", "", "c", "()Ljava/lang/String;", "model", "b", "manufacturer", "a", "()I", "androidSdkVersion", "d", "osReleaseVersion", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {
    public final int a() {
        return Build.VERSION.SDK_INT;
    }

    public final String b() {
        return Build.MANUFACTURER;
    }

    public final String c() {
        return Build.MODEL;
    }

    public final String d() {
        String str = Build.VERSION.RELEASE;
        C17542s.i(str, "RELEASE");
        return str;
    }

    public final boolean e(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }
}
