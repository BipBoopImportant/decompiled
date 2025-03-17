package RH;

import PH.C16189c;
import PH.C16190d;
import XH.C16807N;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LRH/a;", "", "c", "(LRH/a;)S", "value", "LXH/N;", "f", "(LRH/a;S)V", "", "destination", "", "offset", "length", "b", "(LRH/a;[BII)V", "source", "e", "dst", "a", "(LRH/a;LRH/a;I)I", "src", "d", "(LRH/a;LRH/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.f  reason: case insensitive filesystem */
public final class C16373f {
    public static final int a(C16368a aVar, C16368a aVar2, int i10) {
        C17542s.j(aVar, "<this>");
        C17542s.j(aVar2, "dst");
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i10 <= aVar2.g() - aVar2.k()) {
            ByteBuffer h10 = aVar.h();
            int i11 = aVar.i();
            if (aVar.k() - i11 >= i10) {
                C16189c.c(h10, aVar2.h(), i11, i10, aVar2.k());
                aVar2.a(i10);
                C16807N n10 = C16807N.f139792a;
                aVar.c(i10);
                return i10;
            }
            throw new EOFException("Not enough bytes to read a " + "buffer content" + " of size " + i10 + '.');
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static final void b(C16368a aVar, byte[] bArr, int i10, int i11) {
        C17542s.j(aVar, "<this>");
        C17542s.j(bArr, "destination");
        ByteBuffer h10 = aVar.h();
        int i12 = aVar.i();
        if (aVar.k() - i12 >= i11) {
            C16190d.b(h10, bArr, i12, i11, i10);
            C16807N n10 = C16807N.f139792a;
            aVar.c(i11);
            return;
        }
        throw new EOFException("Not enough bytes to read a " + "byte array" + " of size " + i11 + '.');
    }

    public static final short c(C16368a aVar) {
        C17542s.j(aVar, "<this>");
        ByteBuffer h10 = aVar.h();
        int i10 = aVar.i();
        if (aVar.k() - i10 >= 2) {
            Short valueOf = Short.valueOf(h10.getShort(i10));
            aVar.c(2);
            return valueOf.shortValue();
        }
        throw new EOFException("Not enough bytes to read a " + "short integer" + " of size " + 2 + '.');
    }

    public static final void d(C16368a aVar, C16368a aVar2, int i10) {
        C17542s.j(aVar, "<this>");
        C17542s.j(aVar2, "src");
        if (i10 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i10).toString());
        } else if (i10 > aVar2.k() - aVar2.i()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i10 + " > " + (aVar2.k() - aVar2.i())).toString());
        } else if (i10 <= aVar.g() - aVar.k()) {
            ByteBuffer h10 = aVar.h();
            int k10 = aVar.k();
            int g10 = aVar.g() - k10;
            if (g10 >= i10) {
                C16189c.c(aVar2.h(), h10, aVar2.i(), i10, k10);
                aVar2.c(i10);
                aVar.a(i10);
                return;
            }
            throw new r("buffer readable content", i10, g10);
        } else {
            throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i10 + " > " + (aVar.g() - aVar.k())).toString());
        }
    }

    public static final void e(C16368a aVar, byte[] bArr, int i10, int i11) {
        C17542s.j(aVar, "<this>");
        C17542s.j(bArr, "source");
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        int g10 = aVar.g() - k10;
        if (g10 >= i11) {
            ByteBuffer order = ByteBuffer.wrap(bArr, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
            C17542s.i(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            C16189c.c(C16189c.b(order), h10, 0, i11, k10);
            aVar.a(i11);
            return;
        }
        throw new r("byte array", i11, g10);
    }

    public static final void f(C16368a aVar, short s10) {
        C17542s.j(aVar, "<this>");
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        int g10 = aVar.g() - k10;
        if (g10 >= 2) {
            h10.putShort(k10, s10);
            aVar.a(2);
            return;
        }
        throw new r("short integer", 2, g10);
    }
}
