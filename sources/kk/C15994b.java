package KK;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKK/a;", "task", "LKK/d;", "queue", "", "message", "LXH/N;", "c", "(LKK/a;LKK/d;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: KK.b  reason: case insensitive filesystem */
public final class C15994b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        V v10 = V.f144353a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C17542s.i(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void c(C15993a aVar, C15996d dVar, String str) {
        Logger a10 = e.f135926h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        V v10 = V.f144353a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C17542s.i(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}
