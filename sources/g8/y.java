package G8;

import HJ.C15854t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LG8/y;", "", "<init>", "()V", "", "pattern", "version", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f36303a = new y();

    private y() {
    }

    public static final boolean a(String str, String str2) {
        C17542s.j(str, "pattern");
        C17542s.j(str2, "version");
        if (!C17542s.e(str, "**")) {
            if (C15854t.d0(str, "&&", false, 2, (Object) null)) {
                List<String> Y02 = C15854t.Y0(str, new String[]{"&&"}, false, 0, 6, (Object) null);
                ArrayList<String> arrayList = new ArrayList<>(C16877v.y(Y02, 10));
                for (String z12 : Y02) {
                    arrayList.add(C15854t.z1(z12).toString());
                }
                if (!arrayList.isEmpty()) {
                    for (String a10 : arrayList) {
                        if (!s.a(a10, str2)) {
                            return false;
                        }
                    }
                }
            } else if (!C15854t.d0(str, "||", false, 2, (Object) null)) {
                return (C15854t.d0(str, ">", false, 2, (Object) null) || C15854t.d0(str, "<", false, 2, (Object) null)) ? s.a(str, str2) : n.a(str, str2);
            } else {
                List<String> Y03 = C15854t.Y0(str, new String[]{"||"}, false, 0, 6, (Object) null);
                ArrayList<String> arrayList2 = new ArrayList<>(C16877v.y(Y03, 10));
                for (String z13 : Y03) {
                    arrayList2.add(C15854t.z1(z13).toString());
                }
                if (arrayList2.isEmpty()) {
                    return false;
                }
                for (String a11 : arrayList2) {
                    if (s.a(a11, str2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
