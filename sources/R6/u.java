package r6;

import HJ.C15854t;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lr6/u;", "", "<init>", "()V", "", "url", "b", "(Ljava/lang/String;)Ljava/lang/String;", "extension", "a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f55715a = new u();

    private u() {
    }

    public final String a(String str) {
        if (C15854t.v0(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        String str2 = (String) v.f55716a.get(lowerCase);
        return str2 == null ? w.a(lowerCase) : str2;
    }

    public final String b(String str) {
        if (C15854t.v0(str)) {
            return null;
        }
        return a(C15854t.m1(C15854t.o1(C15854t.w1(C15854t.w1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }
}
