package rb;

import Eb.a;
import Eb.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.C10197A;

public final class y extends C10204b {

    /* renamed from: a  reason: collision with root package name */
    private final C10197A f76375a;

    /* renamed from: b  reason: collision with root package name */
    private final b f76376b;

    /* renamed from: c  reason: collision with root package name */
    private final a f76377c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f76378d;

    private y(C10197A a10, b bVar, a aVar, Integer num) {
        this.f76375a = a10;
        this.f76376b = bVar;
        this.f76377c = aVar;
        this.f76378d = num;
    }

    public static y a(C10197A.a aVar, b bVar, Integer num) {
        C10197A.a aVar2 = C10197A.a.f76254d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        } else if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (bVar.b() == 32) {
            C10197A a10 = C10197A.a(aVar);
            return new y(a10, bVar, b(a10, num), num);
        } else {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
        }
    }

    private static a b(C10197A a10, Integer num) {
        if (a10.b() == C10197A.a.f76254d) {
            return a.a(new byte[0]);
        }
        if (a10.b() == C10197A.a.f76253c) {
            return a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a10.b() == C10197A.a.f76252b) {
            return a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a10.b());
    }
}
