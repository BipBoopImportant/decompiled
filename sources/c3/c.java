package c3;

import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lc3/c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/o;", "fragment", "", "violationMessage", "<init>", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "a", "Landroidx/fragment/app/o;", "()Landroidx/fragment/app/o;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final C5187o f23077a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(C5187o oVar, String str) {
        super(str);
        C17542s.j(oVar, "fragment");
        this.f23077a = oVar;
    }

    public final C5187o a() {
        return this.f23077a;
    }
}
