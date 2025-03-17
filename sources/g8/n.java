package G8;

import G8.x;
import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LG8/n;", "", "<init>", "()V", "", "patternStr", "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f36281a = new n();

    private n() {
    }

    public static final boolean a(String str, String str2) {
        C17542s.j(str, "patternStr");
        C17542s.j(str2, "value");
        x.a aVar = x.f36297c;
        x a10 = aVar.a(C15854t.z1(str).toString());
        x a11 = aVar.a(C15854t.z1(str2).toString());
        boolean e10 = C17542s.e(a10, a11);
        aVar.c(a10);
        aVar.c(a11);
        return e10;
    }
}
