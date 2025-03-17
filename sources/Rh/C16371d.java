package RH;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"", "count", "readRemaining", "", "b", "(II)Ljava/lang/Void;", "writeRemaining", "a", "LRH/a;", "startGap", "h", "(LRH/a;I)Ljava/lang/Void;", "g", "endGap", "LXH/N;", "c", "(LRH/a;I)V", "e", "d", "size", "f", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.d  reason: case insensitive filesystem */
public final class C16371d {
    public static final Void a(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for writing");
    }

    public static final Void b(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for reading");
    }

    public static final void c(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: capacity is " + aVar.f());
    }

    public static final void d(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i10 + ": there are already " + (aVar.k() - aVar.i()) + " content bytes at offset " + aVar.i());
    }

    public static final void e(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: there are already " + aVar.j() + " bytes reserved in the beginning");
    }

    public static final void f(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        aVar.o(aVar.i() - i10);
    }

    public static final Void g(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (aVar.k() - aVar.i()) + " content bytes starting at offset " + aVar.i());
    }

    public static final Void h(C16368a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        if (i10 > aVar.f()) {
            throw new IllegalArgumentException("Start gap " + i10 + " is bigger than the capacity " + aVar.f());
        }
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (aVar.f() - aVar.g()) + " bytes reserved in the end");
    }
}
