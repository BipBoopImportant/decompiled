package xq;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxq/f;", "Lxq/c;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "a", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xq.f  reason: case insensitive filesystem */
public final class C12337f implements C12334c {
    public String a() {
        String str = Build.MODEL;
        C17542s.i(str, "MODEL");
        return str;
    }

    public String b() {
        String str = Build.BRAND;
        C17542s.i(str, "BRAND");
        return str;
    }
}
