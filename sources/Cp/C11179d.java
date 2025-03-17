package cp;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcp/d;", "Lcp/c;", "<init>", "()V", "", "toEncode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cp.d  reason: case insensitive filesystem */
public final class C11179d implements C11178c {
    public String a(String str) {
        C17542s.j(str, "toEncode");
        String encode = Uri.encode(str);
        C17542s.i(encode, "encode(...)");
        return encode;
    }
}
