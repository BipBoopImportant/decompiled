package yy;

import KJ.C15988d;
import Op.d1;
import TJ.C16519P;
import TJ.C16534i;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import ip.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ty.C15098a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B!\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lyy/r;", "Landroidx/lifecycle/f0;", "", "", "itemNos", "Lty/a;", "getProductsByItemNumbersUseCase", "<init>", "(Ljava/util/List;Lty/a;)V", "LTJ/P;", "LKJ/d;", "LOp/d1;", "m", "LTJ/P;", "C", "()LTJ/P;", "productsByItemNo", "a", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16519P<C15988d<String, d1>> f132350m;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyy/r$a;", "", "", "", "itemNos", "Lyy/r;", "a", "(Ljava/util/List;)Lyy/r;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        r a(List<String> list);
    }

    public r(List<String> list, C15098a aVar) {
        C17542s.j(list, "itemNos");
        C17542s.j(aVar, "getProductsByItemNumbersUseCase");
        this.f132350m = C16534i.c0(aVar.a(list), g0.a(this), f.a(), null);
    }

    public final C16519P<C15988d<String, d1>> C() {
        return this.f132350m;
    }
}
