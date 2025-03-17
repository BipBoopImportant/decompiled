package rb;

import Eb.a;
import Eb.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.I;

public final class G extends C10204b {

    /* renamed from: a  reason: collision with root package name */
    private final I f76267a;

    /* renamed from: b  reason: collision with root package name */
    private final b f76268b;

    /* renamed from: c  reason: collision with root package name */
    private final a f76269c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f76270d;

    private G(I i10, b bVar, a aVar, Integer num) {
        this.f76267a = i10;
        this.f76268b = bVar;
        this.f76269c = aVar;
        this.f76270d = num;
    }

    public static G a(I.a aVar, b bVar, Integer num) {
        I.a aVar2 = I.a.f76275d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        } else if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (bVar.b() == 32) {
            I a10 = I.a(aVar);
            return new G(a10, bVar, b(a10, num), num);
        } else {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
        }
    }

    private static a b(I i10, Integer num) {
        if (i10.b() == I.a.f76275d) {
            return a.a(new byte[0]);
        }
        if (i10.b() == I.a.f76274c) {
            return a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i10.b() == I.a.f76273b) {
            return a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i10.b());
    }
}
