package Ww;

import YH.C16877v;
import YH.X;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;
import u2.C6012a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LWw/x;", "LWw/w;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "permissions", "", "", "a", "(Ljava/util/List;)Ljava/util/Map;", "Landroid/content/Context;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Context f117727a;

    public x(Context context) {
        C17542s.j(context, "context");
        this.f117727a = context;
    }

    public Map<String, Boolean> a(List<String> list) {
        C17542s.j(list, "permissions");
        Iterable iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, Boolean.valueOf(C6012a.a(this.f117727a, (String) next) == 0));
        }
        return linkedHashMap;
    }
}
