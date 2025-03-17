package j7;

import HJ.C15854t;
import kI.C17500a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000f"}, d2 = {"Lj7/a;", "", "<init>", "()V", "", "data", "", "a", "(Ljava/lang/String;)[B", "b", "([B)Ljava/lang/String;", "LkI/a;", "LkI/a;", "getBase64WithPadding$annotations", "base64WithPadding", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.a  reason: case insensitive filesystem */
public final class C8407a {

    /* renamed from: a  reason: collision with root package name */
    public static final C8407a f54060a = new C8407a();

    /* renamed from: b  reason: collision with root package name */
    private static final C17500a f54061b = C17500a.f144250d.s(C17500a.b.PRESENT_OPTIONAL);

    private C8407a() {
    }

    public final byte[] a(String str) {
        C17542s.j(str, "data");
        return C17500a.h(f54061b, C15854t.E(str), 0, 0, 6, (Object) null);
    }

    public final String b(byte[] bArr) {
        C17542s.j(bArr, "data");
        return C17500a.l(f54061b, bArr, 0, 0, 6, (Object) null);
    }
}
