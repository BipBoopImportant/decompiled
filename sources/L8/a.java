package L8;

import D8.c;
import G8.i;
import HJ.C15838d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y8.C8993b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"LL8/a;", "", "<init>", "()V", "", "value", "b", "([B)[B", "", "maxSize", "", "defaultValue", "c", "([BJLjava/lang/String;)[B", "Ly8/b;", "event", "a", "(Ly8/b;)Ly8/b;", "Ljava/io/ByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "os", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0605a f38454b = new C0605a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f38455a = new ByteArrayOutputStream();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LL8/a$a;", "", "<init>", "()V", "", "SUPPRESSED_MESSAGE_EMPTY", "Ljava/lang/String;", "SUPPRESSED_MESSAGE_MARKER", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L8.a$a  reason: collision with other inner class name */
    public static final class C0605a {
        private C0605a() {
        }

        public /* synthetic */ C0605a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final byte[] b(byte[] bArr) {
        Charset charset = C15838d.f135279b;
        byte[] bytes = "…".getBytes(charset);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        if (!Arrays.equals(bArr, bytes)) {
            byte[] bytes2 = "".getBytes(charset);
            C17542s.i(bytes2, "this as java.lang.String).getBytes(charset)");
            if (!Arrays.equals(bArr, bytes2)) {
                byte[] bArr2 = null;
                if (bArr != null) {
                    try {
                        bArr2 = i.f36274a.a(bArr, this.f38455a);
                    } catch (IOException e10) {
                        c cVar = new c("NetworkEventCompressor");
                        cVar.h("Error while gzipping api error details : " + e10);
                    } catch (Throwable th2) {
                        this.f38455a.reset();
                        throw th2;
                    }
                }
                this.f38455a.reset();
                return bArr2;
            }
        }
        return bArr;
    }

    private final byte[] c(byte[] bArr, long j10, String str) {
        if (bArr == null) {
            return null;
        }
        if (((long) bArr.length) <= j10) {
            return bArr;
        }
        byte[] bytes = str.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final C8993b a(C8993b bVar) {
        C17542s.j(bVar, "event");
        byte[] b10 = b(c(bVar.p(), 64000, "…"));
        byte[] u10 = bVar.u();
        return C8993b.b(bVar, 0, (String) null, (String) null, 0, 0, 0, b10, (Integer) null, b(c(u10 != null ? R8.a.d(u10) : null, 5000, "…")), (Integer) null, (Map) null, (Map) null, c(bVar.d(), 8000, ""), c(bVar.e(), 8000, ""), b(c(bVar.o(), 2000, "…")), (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 268406463, (Object) null);
    }
}
