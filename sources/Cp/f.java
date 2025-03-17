package cp;

import XH.x;
import XH.y;
import android.net.Uri;
import cp.e;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcp/f;", "Lcp/e;", "<init>", "()V", "", "uriString", "LXH/x;", "Lcp/e$a;", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    public Object a(String str) {
        C17542s.j(str, "uriString");
        Uri parse = Uri.parse(str);
        String str2 = null;
        String path = parse != null ? parse.getPath() : null;
        if (parse != null) {
            str2 = parse.getAuthority();
        }
        if (parse == null || path == null || path.length() == 0 || str2 == null || str2.length() == 0) {
            x.a aVar = x.f139812b;
            return x.b(y.a(new IllegalStateException("Parsing " + str + " to uri failed")));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C17542s.i(queryParameterNames, "getQueryParameterNames(...)");
        for (String str3 : queryParameterNames) {
            String queryParameter = parse.getQueryParameter(str3);
            if (queryParameter != null) {
                linkedHashMap.put(str3, queryParameter);
            }
        }
        x.a aVar2 = x.f139812b;
        return x.b(new e.a(str, path, str2, linkedHashMap));
    }
}
