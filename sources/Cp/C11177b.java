package cp;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcp/b;", "Lcp/a;", "<init>", "()V", "", "toDecode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cp.b  reason: case insensitive filesystem */
public final class C11177b implements C11176a {
    public String a(String str) {
        C17542s.j(str, "toDecode");
        String decode = Uri.decode(str);
        C17542s.i(decode, "decode(...)");
        return decode;
    }
}
