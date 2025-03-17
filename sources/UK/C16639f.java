package UK;

import WK.C16770e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LUK/f;", "", "<init>", "()V", "LWK/e$a;", "cursor", "", "key", "LXH/N;", "b", "(LWK/e$a;[B)V", "", "code", "", "a", "(I)Ljava/lang/String;", "c", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.f  reason: case insensitive filesystem */
public final class C16639f {

    /* renamed from: a  reason: collision with root package name */
    public static final C16639f f139232a = new C16639f();

    private C16639f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        } else if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        } else {
            return "Code " + i10 + " is reserved and may not be used.";
        }
    }

    public final void b(C16770e.a aVar, byte[] bArr) {
        C17542s.j(aVar, "cursor");
        C17542s.j(bArr, "key");
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f139659e;
            int i11 = aVar.f139660f;
            int i12 = aVar.f139661g;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (aVar.d() != -1);
    }

    public final void c(int i10) {
        String a10 = a(i10);
        if (a10 != null) {
            C17542s.g(a10);
            throw new IllegalArgumentException(a10.toString());
        }
    }
}
