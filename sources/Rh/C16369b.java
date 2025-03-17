package RH;

import PH.C16189c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LRH/a;", "other", "", "maxSize", "a", "(LRH/a;LRH/a;I)I", "c", "(LRH/a;LRH/a;)I", "writeSize", "LXH/N;", "b", "(LRH/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.b  reason: case insensitive filesystem */
public final class C16369b {
    public static final int a(C16368a aVar, C16368a aVar2, int i10) {
        C17542s.j(aVar, "<this>");
        C17542s.j(aVar2, "other");
        int min = Math.min(aVar2.k() - aVar2.i(), i10);
        if (aVar.g() - aVar.k() <= min) {
            b(aVar, min);
        }
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        aVar.g();
        ByteBuffer h11 = aVar2.h();
        int i11 = aVar2.i();
        aVar2.k();
        C16189c.c(h11, h10, i11, min, k10);
        aVar2.c(min);
        aVar.a(min);
        return min;
    }

    private static final void b(C16368a aVar, int i10) {
        if ((aVar.g() - aVar.k()) + (aVar.f() - aVar.g()) < i10) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        } else if ((aVar.k() + i10) - aVar.g() > 0) {
            aVar.m();
        }
    }

    public static final int c(C16368a aVar, C16368a aVar2) {
        C17542s.j(aVar, "<this>");
        C17542s.j(aVar2, "other");
        int k10 = aVar2.k() - aVar2.i();
        int i10 = aVar.i();
        if (i10 >= k10) {
            int i11 = i10 - k10;
            C16189c.c(aVar2.h(), aVar.h(), aVar2.i(), k10, i11);
            aVar2.c(k10);
            aVar.o(i11);
            return k10;
        }
        throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
    }
}
