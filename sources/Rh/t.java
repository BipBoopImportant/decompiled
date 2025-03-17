package RH;

import SH.C16416a;
import SH.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LRH/s;", "", "src", "", "offset", "length", "LXH/N;", "b", "(LRH/s;[BII)V", "LRH/a;", "a", "(LRH/s;LRH/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final void a(s sVar, C16368a aVar, int i10) {
        C17542s.j(sVar, "<this>");
        C17542s.j(aVar, "src");
        C16416a d10 = g.d(sVar, 1, (C16416a) null);
        while (true) {
            try {
                int min = Math.min(i10, d10.g() - d10.k());
                C16373f.d(d10, aVar, min);
                i10 -= min;
                if (i10 > 0) {
                    d10 = g.d(sVar, 1, d10);
                } else {
                    return;
                }
            } finally {
                sVar.d();
            }
        }
    }

    public static final void b(s sVar, byte[] bArr, int i10, int i11) {
        C17542s.j(sVar, "<this>");
        C17542s.j(bArr, "src");
        C16416a d10 = g.d(sVar, 1, (C16416a) null);
        while (true) {
            try {
                int min = Math.min(i11, d10.g() - d10.k());
                C16373f.e(d10, bArr, i10, min);
                i10 += min;
                i11 -= min;
                if (i11 > 0) {
                    d10 = g.d(sVar, 1, d10);
                } else {
                    return;
                }
            } finally {
                sVar.d();
            }
        }
    }

    public static /* synthetic */ void c(s sVar, C16368a aVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = aVar.k() - aVar.i();
        }
        a(sVar, aVar, i10);
    }

    public static /* synthetic */ void d(s sVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        b(sVar, bArr, i10, i11);
    }
}
