package U0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"LU0/p0;", "LU0/g0;", "LU0/r0;", "", "value", "getValue", "()Ljava/lang/Long;", "h", "(J)V", "b", "()J", "o", "longValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.p0  reason: case insensitive filesystem */
public interface C4896p0 extends C4876g0, C4899r0<Long> {
    long b();

    void h(long j10) {
        o(j10);
    }

    void o(long j10);

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    Long getValue() {
        return Long.valueOf(b());
    }
}
