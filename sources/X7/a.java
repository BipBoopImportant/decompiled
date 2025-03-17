package X7;

import C7.f;
import Y7.l;
import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class a implements f {

    /* renamed from: b  reason: collision with root package name */
    private final int f40760b;

    /* renamed from: c  reason: collision with root package name */
    private final f f40761c;

    private a(int i10, f fVar) {
        this.f40760b = i10;
        this.f40761c = fVar;
    }

    public static f c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    public void b(MessageDigest messageDigest) {
        this.f40761c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f40760b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f40760b == aVar.f40760b && this.f40761c.equals(aVar.f40761c);
    }

    public int hashCode() {
        return l.p(this.f40761c, this.f40760b);
    }
}
