package m7;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll7/b;", "Lm7/c;", "a", "(Ll7/b;)Lm7/c;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final c a(C8533b bVar) {
        e eVar;
        C17542s.j(bVar, "<this>");
        if (bVar.a() != 0) {
            byte b10 = bVar.get(0) & 192;
            if (b10 == 0) {
                eVar = e.Universal;
            } else if (b10 == 64) {
                eVar = e.Application;
            } else if (b10 == 128) {
                eVar = e.ContextSpecific;
            } else if (b10 == 192) {
                eVar = e.Private;
            } else {
                throw new IllegalStateException("Unknown tag class");
            }
            f fVar = (bVar.get(0) & 32) == 32 ? f.Constructed : f.Primitive;
            byte b11 = bVar.get(0) & 31;
            int i10 = 1;
            if (b11 != 31) {
                BigInteger valueOf = BigInteger.valueOf((long) b11);
                C17542s.i(valueOf, "valueOf(...)");
                return new c(eVar, fVar, valueOf, 1);
            }
            long j10 = 0;
            BigInteger bigInteger = null;
            while (i10 < bVar.a()) {
                if (j10 < 72057594037927808L) {
                    j10 = (j10 << 7) + (127 & ((long) bVar.get(i10)));
                } else {
                    if (bigInteger == null) {
                        bigInteger = BigInteger.valueOf(j10);
                        C17542s.i(bigInteger, "valueOf(...)");
                    }
                    BigInteger shiftLeft = bigInteger.shiftLeft(7);
                    C17542s.i(shiftLeft, "shiftLeft(...)");
                    BigInteger valueOf2 = BigInteger.valueOf(127 & ((long) bVar.get(i10)));
                    C17542s.i(valueOf2, "valueOf(...)");
                    bigInteger = shiftLeft.add(valueOf2);
                    C17542s.i(bigInteger, "add(...)");
                }
                int i11 = i10 + 1;
                if ((bVar.get(i10) & 128) != 0) {
                    i10 = i11;
                } else if (eVar == e.Universal && fVar == f.Constructed && (j10 == 1 || j10 == 2 || j10 == 5 || j10 == 6 || j10 == 9 || j10 == 13 || j10 == 14 || j10 == 23 || j10 == 24 || j10 == 31 || j10 == 33 || j10 == 34)) {
                    throw new IllegalStateException("Constructed encoding used for primitive type");
                } else {
                    if (bigInteger == null) {
                        bigInteger = BigInteger.valueOf(j10);
                        C17542s.i(bigInteger, "valueOf(...)");
                    }
                    return new c(eVar, fVar, bigInteger, i11);
                }
            }
            throw new IllegalStateException("End of input reached before message was fully decoded");
        }
        throw new IllegalStateException("Zero buffer length");
    }
}
