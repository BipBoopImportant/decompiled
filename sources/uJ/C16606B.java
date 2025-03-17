package UJ;

import SJ.C16428d;
import TJ.C16510G;
import TJ.C16519P;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LUJ/B;", "LTJ/P;", "", "LTJ/G;", "initialValue", "<init>", "(I)V", "delta", "", "a0", "(I)Z", "Z", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.B  reason: case insensitive filesystem */
final class C16606B extends C16510G<Integer> implements C16519P<Integer> {
    public C16606B(int i10) {
        super(1, Integer.MAX_VALUE, C16428d.DROP_OLDEST);
        a(Integer.valueOf(i10));
    }

    /* renamed from: Z */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) M()).intValue());
        }
        return valueOf;
    }

    public final boolean a0(int i10) {
        boolean a10;
        synchronized (this) {
            a10 = a(Integer.valueOf(((Number) M()).intValue() + i10));
        }
        return a10;
    }
}
