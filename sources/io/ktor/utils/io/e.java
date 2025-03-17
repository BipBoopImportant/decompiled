package io.ktor.utils.io;

import TH.C16492f;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "autoFlush", "Lio/ktor/utils/io/c;", "a", "(Z)Lio/ktor/utils/io/c;", "", "content", "", "offset", "length", "Lio/ktor/utils/io/g;", "c", "([BII)Lio/ktor/utils/io/g;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final c a(boolean z10) {
        return new a(z10, (C16492f) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ c b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    public static final g c(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "content");
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i10, i11);
        C17542s.i(wrap, "wrap(content, offset, length)");
        return new a(wrap);
    }
}
