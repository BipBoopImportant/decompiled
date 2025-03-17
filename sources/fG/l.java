package FG;

import OE.q;
import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFG/l;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "<init>", "(LOE/q;)V", "", "price", "LlF/a;", "getFormattedPrice", "(F)LlF/a;", "m", "LOE/q;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends f0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int f134364n = q.f113516m;

    /* renamed from: m  reason: collision with root package name */
    private final q f134365m;

    public l(q qVar) {
        C17542s.j(qVar, "sugarcube");
        this.f134365m = qVar;
    }

    public final C14768a getFormattedPrice(float f10) {
        return new C14768a(String.valueOf(f10), this.f134365m.getCountry(), this.f134365m.getLanguage(), true, true);
    }
}
