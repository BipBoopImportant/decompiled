package WK;

import XH.C16814e;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020(H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000205H&¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u0002052\u0006\u0010:\u001a\u00020\tH&¢\u0006\u0004\b;\u00107J\u0017\u0010>\u001a\u0002052\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\tH&¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020!H&¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020!H&¢\u0006\u0004\bI\u0010GJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\t2\u0006\u0010E\u001a\u00020!H&¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0000H&¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH&¢\u0006\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0005\u0001\u0002\u0003Tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"LWK/g;", "LWK/N;", "Ljava/nio/channels/ReadableByteChannel;", "LWK/e;", "S", "()LWK/e;", "", "Y1", "()Z", "", "byteCount", "LXH/N;", "t1", "(J)V", "V0", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "i1", "", "readInt", "()I", "K2", "readLong", "()J", "l1", "g2", "p3", "M", "LWK/h;", "E1", "(J)LWK/h;", "LWK/C;", "options", "z1", "(LWK/C;)I", "", "R1", "()[B", "c1", "(J)[B", "sink", "readFully", "([B)V", "n1", "(LWK/e;J)V", "LWK/L;", "L2", "(LWK/L;)J", "", "B1", "(J)Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "limit", "r0", "Ljava/nio/charset/Charset;", "charset", "w2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "b", "fromIndex", "toIndex", "m0", "(BJJ)J", "bytes", "S1", "(LWK/h;)J", "targetBytes", "b3", "offset", "h3", "(JLWK/h;)Z", "O", "()LWK/g;", "Ljava/io/InputStream;", "q3", "()Ljava/io/InputStream;", "p", "buffer", "LWK/H;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.g  reason: case insensitive filesystem */
public interface C16772g extends N, ReadableByteChannel {
    String B1(long j10);

    C16773h E1(long j10);

    int K2();

    long L2(L l10);

    void M(long j10);

    C16772g O();

    byte[] R1();

    @C16814e
    C16770e S();

    long S1(C16773h hVar);

    boolean V0(long j10);

    boolean Y1();

    String Z0();

    long b3(C16773h hVar);

    byte[] c1(long j10);

    long g2();

    boolean h3(long j10, C16773h hVar);

    short i1();

    long l1();

    long m0(byte b10, long j10, long j11);

    void n1(C16770e eVar, long j10);

    C16770e p();

    long p3();

    InputStream q3();

    String r0(long j10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void t1(long j10);

    String w2(Charset charset);

    int z1(C16760C c10);
}
