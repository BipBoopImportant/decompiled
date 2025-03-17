package m7;

import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll7/b;", "Lm7/c;", "tag", "Lk7/h;", "logger", "Lm7/a;", "a", "(Ll7/b;Lm7/c;Lk7/h;)Lm7/a;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: m7.b  reason: case insensitive filesystem */
public final class C8559b {
    public static final C8558a a(C8533b bVar, c cVar, h hVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(cVar, "tag");
        C17542s.j(hVar, "logger");
        int a10 = cVar.a();
        if (a10 < bVar.a()) {
            byte b10 = bVar.get(a10);
            byte b11 = b10 & 255;
            int i10 = a10 + 1;
            if (b11 == 255) {
                throw new IllegalStateException("Length block 0xFF is reserved by standard");
            } else if (b11 != 128) {
                if ((b10 & 128) == 128) {
                    byte b12 = b10 & Byte.MAX_VALUE;
                    if (b12 > 8) {
                        throw new IllegalStateException("Too big integer");
                    } else if (b12 + 1 <= bVar.a()) {
                        if ((bVar.get(i10) & 255) == 0) {
                            hVar.a("ASN1HeaderLength", "Needlessly long encoded length");
                        }
                        int i11 = 0;
                        for (int i12 = 0; i12 < b12; i12++) {
                            i11 = (i11 << 8) + (bVar.get(i10 + i12) & 255);
                        }
                        i10 += b12;
                        if (i11 <= 127) {
                            hVar.a("ASN1HeaderLength", "Unnecessary usage of long length form");
                        }
                        b11 = i11;
                    } else {
                        throw new IllegalStateException("End of input reached before message was fully decoded");
                    }
                }
                return new C8558a(b11, i10);
            } else {
                throw new IllegalStateException("Indefinite length encoding not supported");
            }
        } else {
            throw new IllegalStateException("No length block encoded");
        }
    }
}
