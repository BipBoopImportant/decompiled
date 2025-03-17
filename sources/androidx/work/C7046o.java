package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/work/o;", "", "<init>", "()V", "", "className", "Landroidx/work/n;", "a", "(Ljava/lang/String;)Landroidx/work/n;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.o  reason: case insensitive filesystem */
public abstract class C7046o {
    public abstract C7045n a(String str);

    public final C7045n b(String str) {
        C17542s.j(str, "className");
        C7045n a10 = a(str);
        return a10 == null ? C7047p.a(str) : a10;
    }
}
