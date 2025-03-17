package WK;

import HJ.C15838d;
import XK.C16834a;
import YH.C16870n;
import com.google.ar.core.ImageMetadata;
import com.optimizely.ab.config.FeatureVariable;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002·\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b2\u0010-J\u000f\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010$J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020FH\u0016¢\u0006\u0004\bQ\u0010HJ\u0017\u0010S\u001a\u00020F2\u0006\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010JJ\u000f\u0010T\u001a\u00020.H\u0016¢\u0006\u0004\bT\u00100J\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020U2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010@\u001a\u00020UH\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020.2\u0006\u0010@\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0013¢\u0006\u0004\ba\u0010\u0006J\u0017\u0010b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bb\u0010\u0015J\u0017\u0010d\u001a\u00020\u00002\u0006\u0010c\u001a\u000207H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020FH\u0016¢\u0006\u0004\bg\u0010hJ'\u0010k\u001a\u00020\u00002\u0006\u0010f\u001a\u00020F2\u0006\u0010i\u001a\u00020.2\u0006\u0010j\u001a\u00020.H\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020.H\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010p\u001a\u00020\u00002\u0006\u0010f\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bp\u0010qJ/\u0010r\u001a\u00020\u00002\u0006\u0010f\u001a\u00020F2\u0006\u0010i\u001a\u00020.2\u0006\u0010j\u001a\u00020.2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00002\u0006\u0010t\u001a\u00020UH\u0016¢\u0006\u0004\bu\u0010vJ'\u0010w\u001a\u00020\u00002\u0006\u0010t\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020.2\u0006\u0010t\u001a\u00020^H\u0016¢\u0006\u0004\by\u0010`J\u0017\u0010{\u001a\u00020\u00112\u0006\u0010t\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020.H\u0016¢\u0006\u0004\b~\u0010oJ\u0019\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u00020.H\u0016¢\u0006\u0005\b\u0001\u0010oJ\u001a\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0001\u0010oJ\u001a\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0001\u0010oJ\u001b\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J!\u0010\u0001\u001a\u00020\u00132\u0006\u0010t\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u0001\u0010BJ\"\u0010\u0001\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020%2\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020%2\u0007\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J4\u0010 \u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¢\u0001\u0010\u0006J\u0011\u0010£\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b£\u0001\u0010\u0010J\u0011\u0010¤\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0006J\u0013\u0010¦\u0001\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001f\u0010ª\u0001\u001a\u00020\u000e2\n\u0010©\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0011\u0010¬\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b¬\u0001\u00100J\u0011\u0010­\u0001\u001a\u00020FH\u0016¢\u0006\u0005\b­\u0001\u0010HJ\u000f\u0010®\u0001\u001a\u00020\u0000¢\u0006\u0005\b®\u0001\u0010\bJ\u0011\u0010¯\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b¯\u0001\u0010\bJ\u000f\u0010°\u0001\u001a\u000207¢\u0006\u0005\b°\u0001\u00109J\u0018\u0010±\u0001\u001a\u0002072\u0006\u0010\u0012\u001a\u00020.¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001f\u0010µ\u0001\u001a\u00030³\u00012\n\b\u0002\u0010´\u0001\u001a\u00030³\u0001H\u0007¢\u0006\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010¹\u0001\u001a\u0005\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R/\u0010¼\u0001\u001a\u00020\u00112\u0007\u0010º\u0001\u001a\u00020\u00118G@@X\u000e¢\u0006\u0015\n\u0005\b}\u0010»\u0001\u001a\u0005\b¼\u0001\u0010$\"\u0005\b½\u0001\u0010\u0015R\u0016\u0010¿\u0001\u001a\u00020\u00008VX\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\b¨\u0006À\u0001"}, d2 = {"LWK/e;", "LWK/g;", "LWK/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "S", "()LWK/e;", "Ljava/io/OutputStream;", "o3", "()Ljava/io/OutputStream;", "o", "n", "", "Y1", "()Z", "", "byteCount", "LXH/N;", "t1", "(J)V", "V0", "(J)Z", "O", "()LWK/g;", "Ljava/io/InputStream;", "q3", "()Ljava/io/InputStream;", "out", "offset", "l", "(LWK/e;JJ)LWK/e;", "D1", "(Ljava/io/OutputStream;J)LWK/e;", "e", "()J", "", "readByte", "()B", "pos", "u", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "i1", "K2", "l1", "g2", "p3", "LWK/h;", "i0", "()LWK/h;", "E1", "(J)LWK/h;", "LWK/C;", "options", "z1", "(LWK/C;)I", "sink", "n1", "(LWK/e;J)V", "LWK/L;", "L2", "(LWK/L;)J", "", "l0", "()Ljava/lang/String;", "B1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "w2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "j0", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "Z0", "limit", "r0", "o0", "", "R1", "()[B", "c1", "(J)[B", "readFully", "([B)V", "e0", "([BII)I", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "c", "M", "byteString", "K0", "(LWK/h;)LWK/e;", "string", "I1", "(Ljava/lang/String;)LWK/e;", "beginIndex", "endIndex", "L1", "(Ljava/lang/String;II)LWK/e;", "codePoint", "N1", "(I)LWK/e;", "y1", "(Ljava/lang/String;Ljava/nio/charset/Charset;)LWK/e;", "k1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)LWK/e;", "source", "O0", "([B)LWK/e;", "P0", "([BII)LWK/e;", "write", "LWK/N;", "Y", "(LWK/N;)J", "b", "Q0", "s", "h1", "i", "W0", "Y0", "v", "b1", "(J)LWK/e;", "R0", "T0", "minimumCapacity", "LWK/I;", "I0", "(I)LWK/I;", "s3", "u0", "(LWK/e;J)J", "fromIndex", "(BJ)J", "toIndex", "m0", "(BJJ)J", "bytes", "S1", "(LWK/h;)J", "w", "(LWK/h;J)J", "targetBytes", "b3", "z", "h3", "(JLWK/h;)Z", "bytesOffset", "N", "(JLWK/h;II)Z", "flush", "isOpen", "close", "LWK/O;", "y", "()LWK/O;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "d", "A0", "F0", "(I)LWK/h;", "LWK/e$a;", "unsafeCursor", "f0", "(LWK/e$a;)LWK/e$a;", "a", "LWK/I;", "head", "value", "J", "size", "p0", "p", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.e  reason: case insensitive filesystem */
public final class C16770e implements C16772g, C16771f, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public I f139653a;

    /* renamed from: b  reason: collision with root package name */
    private long f139654b;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006&"}, d2 = {"LWK/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "d", "()I", "", "offset", "f", "(J)I", "newSize", "e", "(J)J", "LXH/N;", "close", "LWK/e;", "a", "LWK/e;", "buffer", "", "b", "Z", "readWrite", "LWK/I;", "c", "LWK/I;", "()LWK/I;", "g", "(LWK/I;)V", "segment", "J", "", "[B", "data", "I", "start", "end", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.e$a */
    public static final class a implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public C16770e f139655a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f139656b;

        /* renamed from: c  reason: collision with root package name */
        private I f139657c;

        /* renamed from: d  reason: collision with root package name */
        public long f139658d = -1;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f139659e;

        /* renamed from: f  reason: collision with root package name */
        public int f139660f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f139661g = -1;

        public final I c() {
            return this.f139657c;
        }

        public void close() {
            if (this.f139655a != null) {
                this.f139655a = null;
                g((I) null);
                this.f139658d = -1;
                this.f139659e = null;
                this.f139660f = -1;
                this.f139661g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int d() {
            long j10 = this.f139658d;
            C16770e eVar = this.f139655a;
            C17542s.g(eVar);
            if (j10 != eVar.size()) {
                long j11 = this.f139658d;
                return f(j11 == -1 ? 0 : j11 + ((long) (this.f139661g - this.f139660f)));
            }
            throw new IllegalStateException("no more bytes");
        }

        public final long e(long j10) {
            C16770e eVar = this.f139655a;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.f139656b) {
                long size = eVar.size();
                int i10 = (j10 > size ? 1 : (j10 == size ? 0 : -1));
                if (i10 <= 0) {
                    if (j10 >= 0) {
                        long j11 = size - j10;
                        while (true) {
                            if (j11 <= 0) {
                                break;
                            }
                            I i11 = eVar.f139653a;
                            C17542s.g(i11);
                            I i12 = i11.f139616g;
                            C17542s.g(i12);
                            int i13 = i12.f139612c;
                            long j12 = (long) (i13 - i12.f139611b);
                            if (j12 > j11) {
                                i12.f139612c = i13 - ((int) j11);
                                break;
                            }
                            eVar.f139653a = i12.b();
                            J.b(i12);
                            j11 -= j12;
                        }
                        g((I) null);
                        this.f139658d = j10;
                        this.f139659e = null;
                        this.f139660f = -1;
                        this.f139661g = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                    }
                } else if (i10 > 0) {
                    long j13 = j10 - size;
                    boolean z10 = true;
                    while (j13 > 0) {
                        I I02 = eVar.I0(1);
                        int min = (int) Math.min(j13, (long) (8192 - I02.f139612c));
                        I02.f139612c += min;
                        j13 -= (long) min;
                        if (z10) {
                            g(I02);
                            this.f139658d = size;
                            this.f139659e = I02.f139610a;
                            int i14 = I02.f139612c;
                            this.f139660f = i14 - min;
                            this.f139661g = i14;
                            z10 = false;
                        }
                    }
                }
                eVar.p0(j10);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        public final int f(long j10) {
            I i10;
            C16770e eVar = this.f139655a;
            if (eVar != null) {
                int i11 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
                if (i11 < 0 || j10 > eVar.size()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + eVar.size());
                } else if (i11 == 0 || j10 == eVar.size()) {
                    g((I) null);
                    this.f139658d = j10;
                    this.f139659e = null;
                    this.f139660f = -1;
                    this.f139661g = -1;
                    return -1;
                } else {
                    long size = eVar.size();
                    I i12 = eVar.f139653a;
                    long j11 = 0;
                    if (c() != null) {
                        long j12 = this.f139658d;
                        int i13 = this.f139660f;
                        I c10 = c();
                        C17542s.g(c10);
                        long j13 = j12 - ((long) (i13 - c10.f139611b));
                        if (j13 > j10) {
                            i10 = i12;
                            i12 = c();
                            size = j13;
                        } else {
                            i10 = c();
                            j11 = j13;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (size - j10 > j10 - j11) {
                        while (true) {
                            C17542s.g(i10);
                            int i14 = i10.f139612c;
                            int i15 = i10.f139611b;
                            if (j10 < ((long) (i14 - i15)) + j11) {
                                break;
                            }
                            j11 += (long) (i14 - i15);
                            i10 = i10.f139615f;
                        }
                    } else {
                        while (size > j10) {
                            C17542s.g(i12);
                            i12 = i12.f139616g;
                            C17542s.g(i12);
                            size -= (long) (i12.f139612c - i12.f139611b);
                        }
                        j11 = size;
                        i10 = i12;
                    }
                    if (this.f139656b) {
                        C17542s.g(i10);
                        if (i10.f139613d) {
                            I f10 = i10.f();
                            if (eVar.f139653a == i10) {
                                eVar.f139653a = f10;
                            }
                            i10 = i10.c(f10);
                            I i16 = i10.f139616g;
                            C17542s.g(i16);
                            i16.b();
                        }
                    }
                    g(i10);
                    this.f139658d = j10;
                    C17542s.g(i10);
                    this.f139659e = i10.f139610a;
                    int i17 = i10.f139611b + ((int) (j10 - j11));
                    this.f139660f = i17;
                    int i18 = i10.f139612c;
                    this.f139661g = i18;
                    return i18 - i17;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer");
            }
        }

        public final void g(I i10) {
            this.f139657c = i10;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"WK/e$c", "Ljava/io/OutputStream;", "", "b", "LXH/N;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.e$c */
    public static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16770e f139663a;

        c(C16770e eVar) {
            this.f139663a = eVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f139663a + ".outputStream()";
        }

        public void write(int i10) {
            this.f139663a.Z1(i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "data");
            this.f139663a.L(bArr, i10, i11);
        }
    }

    public static /* synthetic */ C16770e F1(C16770e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.f139654b;
        }
        return eVar.D1(outputStream, j10);
    }

    public static /* synthetic */ a h0(C16770e eVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = C16767b.d();
        }
        return eVar.f0(aVar);
    }

    public final C16773h A0() {
        if (size() <= 2147483647L) {
            return F0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public String B1(long j10) {
        return j0(j10, C15838d.f135279b);
    }

    public final C16770e D1(OutputStream outputStream, long j10) {
        C17542s.j(outputStream, "out");
        C16767b.b(this.f139654b, 0, j10);
        I i10 = this.f139653a;
        while (j10 > 0) {
            C17542s.g(i10);
            int min = (int) Math.min(j10, (long) (i10.f139612c - i10.f139611b));
            outputStream.write(i10.f139610a, i10.f139611b, min);
            int i11 = i10.f139611b + min;
            i10.f139611b = i11;
            long j11 = (long) min;
            this.f139654b -= j11;
            j10 -= j11;
            if (i11 == i10.f139612c) {
                I b10 = i10.b();
                this.f139653a = b10;
                J.b(i10);
                i10 = b10;
            }
        }
        return this;
    }

    public C16773h E1(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (size() < j10) {
            throw new EOFException();
        } else if (j10 < 4096) {
            return new C16773h(c1(j10));
        } else {
            C16773h F02 = F0((int) j10);
            M(j10);
            return F02;
        }
    }

    public final C16773h F0(int i10) {
        if (i10 == 0) {
            return C16773h.f139665e;
        }
        C16767b.b(size(), 0, (long) i10);
        I i11 = this.f139653a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            C17542s.g(i11);
            int i15 = i11.f139612c;
            int i16 = i11.f139611b;
            if (i15 != i16) {
                i13 += i15 - i16;
                i14++;
                i11 = i11.f139615f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[(i14 * 2)];
        I i17 = this.f139653a;
        int i18 = 0;
        while (i12 < i10) {
            C17542s.g(i17);
            bArr[i18] = i17.f139610a;
            i12 += i17.f139612c - i17.f139611b;
            iArr[i18] = Math.min(i12, i10);
            iArr[i18 + i14] = i17.f139611b;
            i17.f139613d = true;
            i18++;
            i17 = i17.f139615f;
        }
        return new K(bArr, iArr);
    }

    public final I I0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        I i11 = this.f139653a;
        if (i11 == null) {
            I c10 = J.c();
            this.f139653a = c10;
            c10.f139616g = c10;
            c10.f139615f = c10;
            return c10;
        }
        C17542s.g(i11);
        I i12 = i11.f139616g;
        C17542s.g(i12);
        return (i12.f139612c + i10 > 8192 || !i12.f139614e) ? i12.c(J.c()) : i12;
    }

    /* renamed from: I1 */
    public C16770e D0(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        return M0(str, 0, str.length());
    }

    /* renamed from: K0 */
    public C16770e j2(C16773h hVar) {
        C17542s.j(hVar, "byteString");
        hVar.d0(this, 0, hVar.W());
        return this;
    }

    public int K2() {
        return C16767b.h(readInt());
    }

    /* renamed from: L1 */
    public C16770e M0(String str, int i10, int i11) {
        char charAt;
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    I I02 = I0(1);
                    byte[] bArr = I02.f139610a;
                    int i12 = I02.f139612c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            int i14 = I02.f139612c;
                            int i15 = (i12 + i10) - i14;
                            I02.f139612c = i14 + i15;
                            p0(size() + ((long) i15));
                        } else {
                            i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                        }
                    }
                    int i142 = I02.f139612c;
                    int i152 = (i12 + i10) - i142;
                    I02.f139612c = i142 + i152;
                    p0(size() + ((long) i152));
                } else {
                    if (charAt2 < 2048) {
                        I I03 = I0(2);
                        byte[] bArr2 = I03.f139610a;
                        int i16 = I03.f139612c;
                        bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                        I03.f139612c = i16 + 2;
                        p0(size() + 2);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        I I04 = I0(3);
                        byte[] bArr3 = I04.f139610a;
                        int i17 = I04.f139612c;
                        bArr3[i17] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                        I04.f139612c = i17 + 3;
                        p0(size() + 3);
                    } else {
                        int i18 = i10 + 1;
                        char charAt3 = i18 < i11 ? str.charAt(i18) : 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                            Z1(63);
                            i10 = i18;
                        } else {
                            int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            I I05 = I0(4);
                            byte[] bArr4 = I05.f139610a;
                            int i20 = I05.f139612c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            I05.f139612c = i20 + 4;
                            p0(size() + 4);
                            i10 += 2;
                        }
                    }
                    i10++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
    }

    public long L2(L l10) {
        C17542s.j(l10, "sink");
        long size = size();
        if (size > 0) {
            l10.s3(this, size);
        }
        return size;
    }

    public void M(long j10) {
        while (j10 > 0) {
            I i10 = this.f139653a;
            if (i10 != null) {
                int min = (int) Math.min(j10, (long) (i10.f139612c - i10.f139611b));
                long j11 = (long) min;
                p0(size() - j11);
                j10 -= j11;
                int i11 = i10.f139611b + min;
                i10.f139611b = i11;
                if (i11 == i10.f139612c) {
                    this.f139653a = i10.b();
                    J.b(i10);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public boolean N(long j10, C16773h hVar, int i10, int i11) {
        C17542s.j(hVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < ((long) i11) || hVar.W() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (u(((long) i12) + j10) != hVar.B(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public C16770e N1(int i10) {
        if (i10 < 128) {
            Z1(i10);
        } else if (i10 < 2048) {
            I I02 = I0(2);
            byte[] bArr = I02.f139610a;
            int i11 = I02.f139612c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            I02.f139612c = i11 + 2;
            p0(size() + 2);
        } else if (55296 <= i10 && i10 < 57344) {
            Z1(63);
        } else if (i10 < 65536) {
            I I03 = I0(3);
            byte[] bArr2 = I03.f139610a;
            int i12 = I03.f139612c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            I03.f139612c = i12 + 3;
            p0(size() + 3);
        } else if (i10 <= 1114111) {
            I I04 = I0(4);
            byte[] bArr3 = I04.f139610a;
            int i13 = I04.f139612c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            I04.f139612c = i13 + 4;
            p0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C16767b.l(i10));
        }
        return this;
    }

    public C16772g O() {
        return y.d(new C16763F(this));
    }

    /* renamed from: O0 */
    public C16770e f1(byte[] bArr) {
        C17542s.j(bArr, "source");
        return L(bArr, 0, bArr.length);
    }

    /* renamed from: P0 */
    public C16770e L(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        long j10 = (long) i11;
        C16767b.b((long) bArr.length, (long) i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            I I02 = I0(1);
            int min = Math.min(i12 - i10, 8192 - I02.f139612c);
            int i13 = i10 + min;
            C16870n.i(bArr, I02.f139610a, I02.f139612c, i10, i13);
            I02.f139612c += min;
            i10 = i13;
        }
        p0(size() + j10);
        return this;
    }

    /* renamed from: Q0 */
    public C16770e Z1(int i10) {
        I I02 = I0(1);
        byte[] bArr = I02.f139610a;
        int i11 = I02.f139612c;
        I02.f139612c = i11 + 1;
        bArr[i11] = (byte) i10;
        p0(size() + 1);
        return this;
    }

    /* renamed from: R0 */
    public C16770e u1(long j10) {
        boolean z10;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return Z1(48);
        }
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return D0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int a10 = C16834a.c(j10);
        if (z10) {
            a10++;
        }
        I I02 = I0(a10);
        byte[] bArr = I02.f139610a;
        int i11 = I02.f139612c + a10;
        while (j10 != 0) {
            long j11 = (long) 10;
            i11--;
            bArr[i11] = C16834a.d()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        I02.f139612c += a10;
        p0(size() + ((long) a10));
        return this;
    }

    public byte[] R1() {
        return c1(size());
    }

    public C16770e S() {
        return this;
    }

    public long S1(C16773h hVar) {
        C17542s.j(hVar, "bytes");
        return w(hVar, 0);
    }

    /* renamed from: T0 */
    public C16770e D2(long j10) {
        if (j10 == 0) {
            return Z1(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        I I02 = I0(i10);
        byte[] bArr = I02.f139610a;
        int i11 = I02.f139612c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = C16834a.d()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        I02.f139612c += i10;
        p0(size() + ((long) i10));
        return this;
    }

    public boolean V0(long j10) {
        return this.f139654b >= j10;
    }

    /* renamed from: W0 */
    public C16770e d0(int i10) {
        I I02 = I0(4);
        byte[] bArr = I02.f139610a;
        int i11 = I02.f139612c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        I02.f139612c = i11 + 4;
        p0(size() + 4);
        return this;
    }

    public long Y(N n10) {
        C17542s.j(n10, "source");
        long j10 = 0;
        while (true) {
            long u02 = n10.u0(this, 8192);
            if (u02 == -1) {
                return j10;
            }
            j10 += u02;
        }
    }

    public C16770e Y0(int i10) {
        return d0(C16767b.h(i10));
    }

    public boolean Y1() {
        return this.f139654b == 0;
    }

    public String Z0() {
        return r0(Long.MAX_VALUE);
    }

    public C16770e b1(long j10) {
        I I02 = I0(8);
        byte[] bArr = I02.f139610a;
        int i10 = I02.f139612c;
        bArr[i10] = (byte) ((int) ((j10 >>> 56) & 255));
        bArr[i10 + 1] = (byte) ((int) ((j10 >>> 48) & 255));
        bArr[i10 + 2] = (byte) ((int) ((j10 >>> 40) & 255));
        bArr[i10 + 3] = (byte) ((int) ((j10 >>> 32) & 255));
        bArr[i10 + 4] = (byte) ((int) ((j10 >>> 24) & 255));
        bArr[i10 + 5] = (byte) ((int) ((j10 >>> 16) & 255));
        bArr[i10 + 6] = (byte) ((int) ((j10 >>> 8) & 255));
        bArr[i10 + 7] = (byte) ((int) (j10 & 255));
        I02.f139612c = i10 + 8;
        p0(size() + 8);
        return this;
    }

    public long b3(C16773h hVar) {
        C17542s.j(hVar, "targetBytes");
        return z(hVar, 0);
    }

    public final void c() {
        M(size());
    }

    public byte[] c1(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (size() >= j10) {
            byte[] bArr = new byte[((int) j10)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public C16770e clone() {
        return f();
    }

    public final long e() {
        long size = size();
        if (size == 0) {
            return 0;
        }
        I i10 = this.f139653a;
        C17542s.g(i10);
        I i11 = i10.f139616g;
        C17542s.g(i11);
        int i12 = i11.f139612c;
        if (i12 < 8192 && i11.f139614e) {
            size -= (long) (i12 - i11.f139611b);
        }
        return size;
    }

    public int e0(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "sink");
        C16767b.b((long) bArr.length, (long) i10, (long) i11);
        I i12 = this.f139653a;
        if (i12 == null) {
            return -1;
        }
        int min = Math.min(i11, i12.f139612c - i12.f139611b);
        byte[] bArr2 = i12.f139610a;
        int i13 = i12.f139611b;
        C16870n.i(bArr2, bArr, i10, i13, i13 + min);
        i12.f139611b += min;
        p0(size() - ((long) min));
        if (i12.f139611b == i12.f139612c) {
            this.f139653a = i12.b();
            J.b(i12);
        }
        return min;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof WK.C16770e
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.size()
            WK.e r1 = (WK.C16770e) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            WK.I r3 = r0.f139653a
            kotlin.jvm.internal.C17542s.g(r3)
            WK.I r1 = r1.f139653a
            kotlin.jvm.internal.C17542s.g(r1)
            int r5 = r3.f139611b
            int r6 = r1.f139611b
            r9 = r7
        L_0x003a:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f139612c
            int r11 = r11 - r5
            int r12 = r1.f139612c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f139610a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f139610a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f139612c
            if (r5 != r13) goto L_0x0074
            WK.I r3 = r3.f139615f
            kotlin.jvm.internal.C17542s.g(r3)
            int r5 = r3.f139611b
        L_0x0074:
            int r13 = r1.f139612c
            if (r6 != r13) goto L_0x007f
            WK.I r1 = r1.f139615f
            kotlin.jvm.internal.C17542s.g(r1)
            int r6 = r1.f139611b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16770e.equals(java.lang.Object):boolean");
    }

    public final C16770e f() {
        C16770e eVar = new C16770e();
        if (size() != 0) {
            I i10 = this.f139653a;
            C17542s.g(i10);
            I d10 = i10.d();
            eVar.f139653a = d10;
            d10.f139616g = d10;
            d10.f139615f = d10;
            for (I i11 = i10.f139615f; i11 != i10; i11 = i11.f139615f) {
                I i12 = d10.f139616g;
                C17542s.g(i12);
                C17542s.g(i11);
                i12.c(i11.d());
            }
            eVar.p0(size());
        }
        return eVar;
    }

    public final a f0(a aVar) {
        C17542s.j(aVar, "unsafeCursor");
        return C16834a.b(this, aVar);
    }

    public void flush() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r2 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 >= r14) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (size() == 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + WK.C16767b.k(u(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long g2() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r18.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00eb
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L_0x0013:
            WK.I r10 = r0.f139653a
            kotlin.jvm.internal.C17542s.g(r10)
            byte[] r11 = r10.f139610a
            int r12 = r10.f139611b
            int r13 = r10.f139612c
        L_0x001e:
            if (r12 >= r13) goto L_0x0082
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0070
            r14 = 57
            if (r15 > r14) goto L_0x0070
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L_0x0043
            if (r16 != 0) goto L_0x003d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L_0x007a
        L_0x0043:
            WK.e r1 = new WK.e
            r1.<init>()
            WK.e r1 = r1.u1(r8)
            WK.e r1 = r1.Z1(r15)
            if (r2 != 0) goto L_0x0055
            r1.readByte()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.l0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0070:
            r3 = 45
            if (r15 != r3) goto L_0x0081
            if (r1 != 0) goto L_0x0081
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L_0x007a:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L_0x001e
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r12 != r13) goto L_0x008e
            WK.I r3 = r10.b()
            r0.f139653a = r3
            WK.J.b(r10)
            goto L_0x0090
        L_0x008e:
            r10.f139611b = r12
        L_0x0090:
            if (r5 != 0) goto L_0x009b
            WK.I r3 = r0.f139653a
            if (r3 != 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            r3 = 0
            goto L_0x0013
        L_0x009b:
            long r3 = r18.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.p0(r3)
            if (r2 == 0) goto L_0x00a8
            r14 = 2
            goto L_0x00a9
        L_0x00a8:
            r14 = 1
        L_0x00a9:
            if (r1 >= r14) goto L_0x00e6
            long r3 = r18.size()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = "Expected a digit"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = "Expected a digit or '-'"
        L_0x00bc:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r1 = r0.u(r4)
            java.lang.String r1 = WK.C16767b.k(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00e0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00e6:
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            long r8 = -r8
        L_0x00ea:
            return r8
        L_0x00eb:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16770e.g2():long");
    }

    /* renamed from: h1 */
    public C16770e J1(int i10) {
        I I02 = I0(2);
        byte[] bArr = I02.f139610a;
        int i11 = I02.f139612c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        I02.f139612c = i11 + 2;
        p0(size() + 2);
        return this;
    }

    public boolean h3(long j10, C16773h hVar) {
        C17542s.j(hVar, "bytes");
        return N(j10, hVar, 0, hVar.W());
    }

    public int hashCode() {
        I i10 = this.f139653a;
        if (i10 == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = i10.f139612c;
            for (int i13 = i10.f139611b; i13 < i12; i13++) {
                i11 = (i11 * 31) + i10.f139610a[i13];
            }
            i10 = i10.f139615f;
            C17542s.g(i10);
        } while (i10 != this.f139653a);
        return i11;
    }

    public C16773h i0() {
        return E1(size());
    }

    public short i1() {
        return C16767b.j(readShort());
    }

    public boolean isOpen() {
        return true;
    }

    public String j0(long j10, Charset charset) {
        C17542s.j(charset, "charset");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f139654b < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            I i11 = this.f139653a;
            C17542s.g(i11);
            int i12 = i11.f139611b;
            if (((long) i12) + j10 > ((long) i11.f139612c)) {
                return new String(c1(j10), charset);
            }
            int i13 = (int) j10;
            String str = new String(i11.f139610a, i12, i13, charset);
            int i14 = i11.f139611b + i13;
            i11.f139611b = i14;
            this.f139654b -= j10;
            if (i14 == i11.f139612c) {
                this.f139653a = i11.b();
                J.b(i11);
            }
            return str;
        }
    }

    public C16770e k1(String str, int i10, int i11, Charset charset) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        C17542s.j(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        } else if (C17542s.e(charset, C15838d.f135279b)) {
            return M0(str, i10, i11);
        } else {
            String substring = str.substring(i10, i11);
            C17542s.i(substring, "substring(...)");
            byte[] bytes = substring.getBytes(charset);
            C17542s.i(bytes, "getBytes(...)");
            return L(bytes, 0, bytes.length);
        }
    }

    public final C16770e l(C16770e eVar, long j10, long j11) {
        C17542s.j(eVar, "out");
        C16767b.b(size(), j10, j11);
        if (j11 != 0) {
            eVar.p0(eVar.size() + j11);
            I i10 = this.f139653a;
            while (true) {
                C17542s.g(i10);
                int i11 = i10.f139612c;
                int i12 = i10.f139611b;
                if (j10 < ((long) (i11 - i12))) {
                    break;
                }
                j10 -= (long) (i11 - i12);
                i10 = i10.f139615f;
            }
            while (j11 > 0) {
                C17542s.g(i10);
                I d10 = i10.d();
                int i13 = d10.f139611b + ((int) j10);
                d10.f139611b = i13;
                d10.f139612c = Math.min(i13 + ((int) j11), d10.f139612c);
                I i14 = eVar.f139653a;
                if (i14 == null) {
                    d10.f139616g = d10;
                    d10.f139615f = d10;
                    eVar.f139653a = d10;
                } else {
                    C17542s.g(i14);
                    I i15 = i14.f139616g;
                    C17542s.g(i15);
                    i15.c(d10);
                }
                j11 -= (long) (d10.f139612c - d10.f139611b);
                i10 = i10.f139615f;
                j10 = 0;
            }
        }
        return this;
    }

    public String l0() {
        return j0(this.f139654b, C15838d.f135279b);
    }

    public long l1() {
        return C16767b.i(readLong());
    }

    public long m0(byte b10, long j10, long j11) {
        I i10;
        long j12;
        int i11;
        long j13 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (i10 = this.f139653a) == null) {
            return -1;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                i10 = i10.f139616g;
                C17542s.g(i10);
                j12 -= (long) (i10.f139612c - i10.f139611b);
            }
            while (j12 < j11) {
                byte[] bArr = i10.f139610a;
                int min = (int) Math.min((long) i10.f139612c, (((long) i10.f139611b) + j11) - j12);
                i11 = (int) ((((long) i10.f139611b) + j10) - j12);
                while (i11 < min) {
                    if (bArr[i11] != b10) {
                        i11++;
                    }
                }
                j12 += (long) (i10.f139612c - i10.f139611b);
                i10 = i10.f139615f;
                C17542s.g(i10);
                j10 = j12;
            }
            return -1;
        }
        while (true) {
            long j14 = ((long) (i10.f139612c - i10.f139611b)) + j13;
            if (j14 > j10) {
                break;
            }
            i10 = i10.f139615f;
            C17542s.g(i10);
            j13 = j14;
        }
        while (j12 < j11) {
            byte[] bArr2 = i10.f139610a;
            int min2 = (int) Math.min((long) i10.f139612c, (((long) i10.f139611b) + j11) - j12);
            int i12 = (int) ((((long) i10.f139611b) + j10) - j12);
            while (i11 < min2) {
                if (bArr2[i11] != b10) {
                    i12 = i11 + 1;
                }
            }
            j13 = j12 + ((long) (i10.f139612c - i10.f139611b));
            i10 = i10.f139615f;
            C17542s.g(i10);
            j10 = j13;
        }
        return -1;
        return ((long) (i11 - i10.f139611b)) + j12;
    }

    /* renamed from: n */
    public C16770e Z() {
        return this;
    }

    public void n1(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        if (size() >= j10) {
            eVar.s3(this, j10);
        } else {
            eVar.s3(this, size());
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public C16770e n0() {
        return this;
    }

    public int o0() {
        byte b10;
        int i10;
        byte b11;
        if (size() != 0) {
            byte u10 = u(0);
            int i11 = 1;
            if ((u10 & 128) == 0) {
                b11 = u10 & Byte.MAX_VALUE;
                b10 = 0;
                i10 = 1;
            } else if ((u10 & 224) == 192) {
                b11 = u10 & 31;
                i10 = 2;
                b10 = 128;
            } else if ((u10 & 240) == 224) {
                b11 = u10 & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((u10 & 248) == 240) {
                b11 = u10 & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                M(1);
                return 65533;
            }
            long j10 = (long) i10;
            if (size() >= j10) {
                while (i11 < i10) {
                    long j11 = (long) i11;
                    byte u11 = u(j11);
                    if ((u11 & 192) == 128) {
                        b11 = (b11 << 6) | (u11 & 63);
                        i11++;
                    } else {
                        M(j11);
                        return 65533;
                    }
                }
                M(j10);
                if (b11 > 1114111) {
                    return 65533;
                }
                if ((55296 > b11 || b11 >= 57344) && b11 >= b10) {
                    return b11;
                }
                return 65533;
            }
            throw new EOFException("size < " + i10 + ": " + size() + " (to read code point prefixed 0x" + C16767b.k(u10) + ')');
        }
        throw new EOFException();
    }

    public OutputStream o3() {
        return new c(this);
    }

    public C16770e p() {
        return this;
    }

    public final void p0(long j10) {
        this.f139654b = j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r8 != r9) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r14.f139653a = r6.b();
        WK.J.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r6.f139611b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r1 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long p3() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            WK.I r6 = r14.f139653a
            kotlin.jvm.internal.C17542s.g(r6)
            byte[] r7 = r6.f139610a
            int r8 = r6.f139611b
            int r9 = r6.f139612c
        L_0x0018:
            if (r8 >= r9) goto L_0x0093
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x003c
        L_0x0027:
            r11 = 97
            if (r10 < r11) goto L_0x0032
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0032
            int r11 = r10 + -87
            goto L_0x003c
        L_0x0032:
            r11 = 65
            if (r10 < r11) goto L_0x0074
            r11 = 70
            if (r10 > r11) goto L_0x0074
            int r11 = r10 + -55
        L_0x003c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x004c:
            WK.e r0 = new WK.e
            r0.<init>()
            WK.e r0 = r0.D2(r4)
            WK.e r0 = r0.Z1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.l0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0074:
            if (r0 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0093
        L_0x0078:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = WK.C16767b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            if (r8 != r9) goto L_0x009f
            WK.I r7 = r6.b()
            r14.f139653a = r7
            WK.J.b(r6)
            goto L_0x00a1
        L_0x009f:
            r6.f139611b = r8
        L_0x00a1:
            if (r1 != 0) goto L_0x00a7
            WK.I r6 = r14.f139653a
            if (r6 != 0) goto L_0x000d
        L_0x00a7:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.p0(r1)
            return r4
        L_0x00b1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16770e.p3():long");
    }

    public InputStream q3() {
        return new b(this);
    }

    public String r0(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long m02 = m0((byte) 10, 0, j11);
            if (m02 != -1) {
                return C16834a.f(this, m02);
            }
            if (j11 < size() && u(j11 - 1) == 13 && u(j11) == 10) {
                return C16834a.f(this, j11);
            }
            C16770e eVar = new C16770e();
            l(eVar, 0, Math.min((long) 32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + eVar.i0().G() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public int read(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "sink");
        I i10 = this.f139653a;
        if (i10 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), i10.f139612c - i10.f139611b);
        byteBuffer.put(i10.f139610a, i10.f139611b, min);
        int i11 = i10.f139611b + min;
        i10.f139611b = i11;
        this.f139654b -= (long) min;
        if (i11 == i10.f139612c) {
            this.f139653a = i10.b();
            J.b(i10);
        }
        return min;
    }

    public byte readByte() {
        if (size() != 0) {
            I i10 = this.f139653a;
            C17542s.g(i10);
            int i11 = i10.f139611b;
            int i12 = i10.f139612c;
            int i13 = i11 + 1;
            byte b10 = i10.f139610a[i11];
            p0(size() - 1);
            if (i13 == i12) {
                this.f139653a = i10.b();
                J.b(i10);
            } else {
                i10.f139611b = i13;
            }
            return b10;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        C17542s.j(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int e02 = e0(bArr, i10, bArr.length - i10);
            if (e02 != -1) {
                i10 += e02;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (size() >= 4) {
            I i10 = this.f139653a;
            C17542s.g(i10);
            int i11 = i10.f139611b;
            int i12 = i10.f139612c;
            if (((long) (i12 - i11)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = i10.f139610a;
            byte b10 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
            int i13 = i11 + 3;
            int i14 = i11 + 4;
            byte b11 = (bArr[i13] & 255) | b10 | ((bArr[i11 + 2] & 255) << 8);
            p0(size() - 4);
            if (i14 == i12) {
                this.f139653a = i10.b();
                J.b(i10);
            } else {
                i10.f139611b = i14;
            }
            return b11;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (size() >= 8) {
            I i10 = this.f139653a;
            C17542s.g(i10);
            int i11 = i10.f139611b;
            int i12 = i10.f139612c;
            if (((long) (i12 - i11)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = i10.f139610a;
            long j10 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40);
            int i13 = i11 + 7;
            int i14 = i11 + 8;
            long j11 = j10 | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8) | (((long) bArr[i13]) & 255);
            p0(size() - 8);
            if (i14 == i12) {
                this.f139653a = i10.b();
                J.b(i10);
            } else {
                i10.f139611b = i14;
            }
            return j11;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (size() >= 2) {
            I i10 = this.f139653a;
            C17542s.g(i10);
            int i11 = i10.f139611b;
            int i12 = i10.f139612c;
            if (i12 - i11 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = i10.f139610a;
            int i13 = i11 + 1;
            int i14 = i11 + 2;
            byte b10 = (bArr[i13] & 255) | ((bArr[i11] & 255) << 8);
            p0(size() - 2);
            if (i14 == i12) {
                this.f139653a = i10.b();
                J.b(i10);
            } else {
                i10.f139611b = i14;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public void s3(C16770e eVar, long j10) {
        I i10;
        C17542s.j(eVar, "source");
        if (eVar != this) {
            C16767b.b(eVar.size(), 0, j10);
            while (j10 > 0) {
                I i11 = eVar.f139653a;
                C17542s.g(i11);
                int i12 = i11.f139612c;
                I i13 = eVar.f139653a;
                C17542s.g(i13);
                if (j10 < ((long) (i12 - i13.f139611b))) {
                    I i14 = this.f139653a;
                    if (i14 != null) {
                        C17542s.g(i14);
                        i10 = i14.f139616g;
                    } else {
                        i10 = null;
                    }
                    if (i10 != null && i10.f139614e) {
                        if ((((long) i10.f139612c) + j10) - ((long) (i10.f139613d ? 0 : i10.f139611b)) <= 8192) {
                            I i15 = eVar.f139653a;
                            C17542s.g(i15);
                            i15.g(i10, (int) j10);
                            eVar.p0(eVar.size() - j10);
                            p0(size() + j10);
                            return;
                        }
                    }
                    I i16 = eVar.f139653a;
                    C17542s.g(i16);
                    eVar.f139653a = i16.e((int) j10);
                }
                I i17 = eVar.f139653a;
                C17542s.g(i17);
                long j11 = (long) (i17.f139612c - i17.f139611b);
                eVar.f139653a = i17.b();
                I i18 = this.f139653a;
                if (i18 == null) {
                    this.f139653a = i17;
                    i17.f139616g = i17;
                    i17.f139615f = i17;
                } else {
                    C17542s.g(i18);
                    I i19 = i18.f139616g;
                    C17542s.g(i19);
                    i19.c(i17).a();
                }
                eVar.p0(eVar.size() - j11);
                p0(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final long size() {
        return this.f139654b;
    }

    public void t1(long j10) {
        if (this.f139654b < j10) {
            throw new EOFException();
        }
    }

    public String toString() {
        return A0().toString();
    }

    public final byte u(long j10) {
        C16767b.b(size(), j10, 1);
        I i10 = this.f139653a;
        if (i10 == null) {
            C17542s.g((Object) null);
            throw null;
        } else if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                i10 = i10.f139616g;
                C17542s.g(i10);
                size -= (long) (i10.f139612c - i10.f139611b);
            }
            C17542s.g(i10);
            return i10.f139610a[(int) ((((long) i10.f139611b) + j10) - size)];
        } else {
            long j11 = 0;
            while (true) {
                long j12 = ((long) (i10.f139612c - i10.f139611b)) + j11;
                if (j12 <= j10) {
                    i10 = i10.f139615f;
                    C17542s.g(i10);
                    j11 = j12;
                } else {
                    C17542s.g(i10);
                    return i10.f139610a[(int) ((((long) i10.f139611b) + j10) - j11)];
                }
            }
        }
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (size() == 0) {
            return -1;
        } else {
            if (j10 > size()) {
                j10 = size();
            }
            eVar.s3(this, j10);
            return j10;
        }
    }

    public long v(byte b10, long j10) {
        return m0(b10, j10, Long.MAX_VALUE);
    }

    public long w(C16773h hVar, long j10) {
        long j11;
        int i10;
        long j12 = j10;
        C17542s.j(hVar, "bytes");
        if (hVar.W() > 0) {
            long j13 = 0;
            if (j12 >= 0) {
                I i11 = this.f139653a;
                if (i11 != null) {
                    if (size() - j12 < j12) {
                        j11 = size();
                        while (j11 > j12) {
                            i11 = i11.f139616g;
                            C17542s.g(i11);
                            j11 -= (long) (i11.f139612c - i11.f139611b);
                        }
                        byte[] K10 = hVar.K();
                        byte b10 = K10[0];
                        int W10 = hVar.W();
                        long size = (size() - ((long) W10)) + 1;
                        while (j11 < size) {
                            byte[] bArr = i11.f139610a;
                            long j14 = size;
                            int min = (int) Math.min((long) i11.f139612c, (((long) i11.f139611b) + size) - j11);
                            i10 = (int) ((((long) i11.f139611b) + j12) - j11);
                            while (i10 < min) {
                                if (bArr[i10] != b10 || !C16834a.e(i11, i10 + 1, K10, 1, W10)) {
                                    i10++;
                                }
                            }
                            j11 += (long) (i11.f139612c - i11.f139611b);
                            i11 = i11.f139615f;
                            C17542s.g(i11);
                            j12 = j11;
                            size = j14;
                        }
                    } else {
                        while (true) {
                            long j15 = ((long) (i11.f139612c - i11.f139611b)) + j13;
                            if (j15 > j12) {
                                break;
                            }
                            i11 = i11.f139615f;
                            C17542s.g(i11);
                            j13 = j15;
                        }
                        byte[] K11 = hVar.K();
                        byte b11 = K11[0];
                        int W11 = hVar.W();
                        long size2 = (size() - ((long) W11)) + 1;
                        while (j11 < size2) {
                            byte[] bArr2 = i11.f139610a;
                            int min2 = (int) Math.min((long) i11.f139612c, (((long) i11.f139611b) + size2) - j11);
                            int i12 = (int) ((((long) i11.f139611b) + j12) - j11);
                            while (i10 < min2) {
                                if (bArr2[i10] == b11) {
                                    if (C16834a.e(i11, i10 + 1, K11, 1, W11)) {
                                    }
                                }
                                i12 = i10 + 1;
                            }
                            j13 = j11 + ((long) (i11.f139612c - i11.f139611b));
                            i11 = i11.f139615f;
                            C17542s.g(i11);
                            j12 = j13;
                        }
                    }
                    return ((long) (i10 - i11.f139611b)) + j11;
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public String w2(Charset charset) {
        C17542s.j(charset, "charset");
        return j0(this.f139654b, charset);
    }

    public int write(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            I I02 = I0(1);
            int min = Math.min(i10, 8192 - I02.f139612c);
            byteBuffer.get(I02.f139610a, I02.f139612c, min);
            i10 -= min;
            I02.f139612c += min;
        }
        this.f139654b += (long) remaining;
        return remaining;
    }

    public O y() {
        return O.f139626e;
    }

    public C16770e y1(String str, Charset charset) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        C17542s.j(charset, "charset");
        return k1(str, 0, str.length(), charset);
    }

    public long z(C16773h hVar, long j10) {
        long j11;
        int i10;
        int i11;
        int i12;
        C17542s.j(hVar, "targetBytes");
        long j12 = 0;
        if (j10 >= 0) {
            I i13 = this.f139653a;
            if (i13 == null) {
                return -1;
            }
            if (size() - j10 < j10) {
                j11 = size();
                while (j11 > j10) {
                    i13 = i13.f139616g;
                    C17542s.g(i13);
                    j11 -= (long) (i13.f139612c - i13.f139611b);
                }
                if (hVar.W() == 2) {
                    byte B10 = hVar.B(0);
                    byte B11 = hVar.B(1);
                    while (j11 < size()) {
                        byte[] bArr = i13.f139610a;
                        i11 = (int) ((((long) i13.f139611b) + j10) - j11);
                        int i14 = i13.f139612c;
                        while (i11 < i14) {
                            byte b10 = bArr[i11];
                            if (!(b10 == B10 || b10 == B11)) {
                                i11++;
                            }
                        }
                        j11 += (long) (i13.f139612c - i13.f139611b);
                        i13 = i13.f139615f;
                        C17542s.g(i13);
                        j10 = j11;
                    }
                    return -1;
                }
                byte[] K10 = hVar.K();
                while (j11 < size()) {
                    byte[] bArr2 = i13.f139610a;
                    i10 = (int) ((((long) i13.f139611b) + j10) - j11);
                    int i15 = i13.f139612c;
                    while (i10 < i15) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : K10) {
                            if (b11 == b12) {
                                i12 = i13.f139611b;
                                return ((long) (i11 - i12)) + j11;
                            }
                        }
                        i10++;
                    }
                    j11 += (long) (i13.f139612c - i13.f139611b);
                    i13 = i13.f139615f;
                    C17542s.g(i13);
                    j10 = j11;
                }
                return -1;
            }
            while (true) {
                long j13 = ((long) (i13.f139612c - i13.f139611b)) + j12;
                if (j13 > j10) {
                    break;
                }
                i13 = i13.f139615f;
                C17542s.g(i13);
                j12 = j13;
            }
            if (hVar.W() == 2) {
                byte B12 = hVar.B(0);
                byte B13 = hVar.B(1);
                while (j11 < size()) {
                    byte[] bArr3 = i13.f139610a;
                    int i16 = (int) ((((long) i13.f139611b) + j10) - j11);
                    int i17 = i13.f139612c;
                    while (i11 < i17) {
                        byte b13 = bArr3[i11];
                        if (!(b13 == B12 || b13 == B13)) {
                            i16 = i11 + 1;
                        }
                    }
                    j12 = j11 + ((long) (i13.f139612c - i13.f139611b));
                    i13 = i13.f139615f;
                    C17542s.g(i13);
                    j10 = j12;
                }
                return -1;
            }
            byte[] K11 = hVar.K();
            while (j11 < size()) {
                byte[] bArr4 = i13.f139610a;
                int i18 = (int) ((((long) i13.f139611b) + j10) - j11);
                int i19 = i13.f139612c;
                while (i10 < i19) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : K11) {
                        if (b14 == b15) {
                            i12 = i13.f139611b;
                            return ((long) (i11 - i12)) + j11;
                        }
                    }
                    i18 = i10 + 1;
                }
                j12 = j11 + ((long) (i13.f139612c - i13.f139611b));
                i13 = i13.f139615f;
                C17542s.g(i13);
                j10 = j12;
            }
            return -1;
            i12 = i13.f139611b;
            return ((long) (i11 - i12)) + j11;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    public int z1(C16760C c10) {
        C17542s.j(c10, "options");
        int h10 = C16834a.h(this, c10, false, 2, (Object) null);
        if (h10 == -1) {
            return -1;
        }
        M((long) c10.p()[h10].W());
        return h10;
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"WK/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "LXH/N;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.e$b */
    public static final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16770e f139662a;

        b(C16770e eVar) {
            this.f139662a = eVar;
        }

        public int available() {
            return (int) Math.min(this.f139662a.size(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f139662a.size() > 0) {
                return this.f139662a.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f139662a + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "sink");
            return this.f139662a.e0(bArr, i10, i11);
        }
    }
}
