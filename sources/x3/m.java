package x3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t3.C5950a;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f31941a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f31942b = new ArrayList();

    private m a(String str, Object obj) {
        this.f31941a.put((String) C5950a.e(str), C5950a.e(obj));
        this.f31942b.remove(str);
        return this;
    }

    public static m g(m mVar, long j10) {
        return mVar.e("exo_len", j10);
    }

    public static m h(m mVar, Uri uri) {
        return uri == null ? mVar.d("exo_redir") : mVar.f("exo_redir", uri.toString());
    }

    public Map<String, Object> b() {
        HashMap hashMap = new HashMap(this.f31941a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f31942b));
    }

    public m d(String str) {
        this.f31942b.add(str);
        this.f31941a.remove(str);
        return this;
    }

    public m e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public m f(String str, String str2) {
        return a(str, str2);
    }
}
