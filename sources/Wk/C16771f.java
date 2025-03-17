package WK;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH&¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&¢\u0006\u0004\b&\u0010%J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0000H&¢\u0006\u0004\b,\u0010+J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0001\u000204ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"LWK/f;", "LWK/L;", "Ljava/nio/channels/WritableByteChannel;", "LWK/h;", "byteString", "j2", "(LWK/h;)LWK/f;", "", "source", "f1", "([B)LWK/f;", "", "offset", "byteCount", "L", "([BII)LWK/f;", "LWK/N;", "", "Y", "(LWK/N;)J", "", "string", "D0", "(Ljava/lang/String;)LWK/f;", "beginIndex", "endIndex", "M0", "(Ljava/lang/String;II)LWK/f;", "b", "Z1", "(I)LWK/f;", "s", "J1", "i", "d0", "v", "u1", "(J)LWK/f;", "D2", "LXH/N;", "flush", "()V", "Z", "()LWK/f;", "n0", "Ljava/io/OutputStream;", "o3", "()Ljava/io/OutputStream;", "LWK/e;", "p", "()LWK/e;", "buffer", "LWK/G;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.f  reason: case insensitive filesystem */
public interface C16771f extends L, WritableByteChannel {
    C16771f D0(String str);

    C16771f D2(long j10);

    C16771f J1(int i10);

    C16771f L(byte[] bArr, int i10, int i11);

    C16771f M0(String str, int i10, int i11);

    long Y(N n10);

    C16771f Z();

    C16771f Z1(int i10);

    C16771f d0(int i10);

    C16771f f1(byte[] bArr);

    void flush();

    C16771f j2(C16773h hVar);

    C16771f n0();

    OutputStream o3();

    C16770e p();

    C16771f u1(long j10);
}
