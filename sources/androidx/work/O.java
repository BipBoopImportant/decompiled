package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.C17541q;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\b"}, d2 = {"T", "Landroidx/work/N;", "", "label", "Lkotlin/Function0;", "block", "a", "(Landroidx/work/N;Ljava/lang/String;LnI/a;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O {
    public static final <T> T a(N n10, String str, C17631a<? extends T> aVar) {
        C17542s.j(n10, "<this>");
        C17542s.j(str, "label");
        C17542s.j(aVar, "block");
        boolean isEnabled = n10.isEnabled();
        if (isEnabled) {
            try {
                n10.a(str);
            } catch (Throwable th2) {
                C17541q.b(1);
                if (isEnabled) {
                    n10.d();
                }
                C17541q.a(1);
                throw th2;
            }
        }
        T invoke = aVar.invoke();
        C17541q.b(1);
        if (isEnabled) {
            n10.d();
        }
        C17541q.a(1);
        return invoke;
    }
}
