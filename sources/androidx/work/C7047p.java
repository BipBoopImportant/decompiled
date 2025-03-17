package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "className", "Landroidx/work/n;", "a", "(Ljava/lang/String;)Landroidx/work/n;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.p  reason: case insensitive filesystem */
public final class C7047p {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45307a;

    static {
        String i10 = C7055y.i("InputMerger");
        C17542s.i(i10, "tagWithPrefix(\"InputMerger\")");
        f45307a = i10;
    }

    public static final C7045n a(String str) {
        C17542s.j(str, "className");
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C17542s.h(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (C7045n) newInstance;
        } catch (Exception e10) {
            C7055y e11 = C7055y.e();
            String str2 = f45307a;
            e11.d(str2, "Trouble instantiating " + str, e10);
            return null;
        }
    }
}
