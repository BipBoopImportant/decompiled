package lK;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"LlK/m;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "", "array", "", "offset", "length", "a", "([CII)I", "b", "()I", "c", "d", "Ljava/io/InputStream;", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "decoder", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "e", "Z", "hasLeftoverPotentiallySurrogateChar", "", "f", "C", "leftoverChar", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.m  reason: case insensitive filesystem */
public final class C17582m {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f144528a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f144529b;

    /* renamed from: c  reason: collision with root package name */
    private final CharsetDecoder f144530c;

    /* renamed from: d  reason: collision with root package name */
    private final ByteBuffer f144531d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f144532e;

    /* renamed from: f  reason: collision with root package name */
    private char f144533f;

    public C17582m(InputStream inputStream, Charset charset) {
        C17542s.j(inputStream, "inputStream");
        C17542s.j(charset, "charset");
        this.f144528a = inputStream;
        this.f144529b = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f144530c = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer wrap = ByteBuffer.wrap(C17577h.f144518c.b());
        this.f144531d = wrap;
        wrap.flip();
    }

    private final int a(char[] cArr, int i10, int i11) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i10, i11);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult decode = this.f144530c.decode(this.f144531d, wrap, z10);
            if (decode.isUnderflow()) {
                if (!z10 && wrap.hasRemaining()) {
                    if (b() < 0) {
                        if (wrap.position() == 0 && !this.f144531d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f144530c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else if (decode.isOverflow()) {
                wrap.position();
                break;
            } else {
                decode.throwException();
            }
        }
        if (z10) {
            this.f144530c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    private final int b() {
        this.f144531d.compact();
        try {
            int limit = this.f144531d.limit();
            int position = this.f144531d.position();
            int read = this.f144528a.read(this.f144531d.array(), this.f144531d.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.f144531d;
            C17542s.h(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.f144531d.flip();
            return this.f144531d.remaining();
        } finally {
            this.f144531d.flip();
        }
    }

    private final int c() {
        if (this.f144532e) {
            this.f144532e = false;
            return this.f144533f;
        }
        char[] cArr = new char[2];
        int d10 = d(cArr, 0, 2);
        if (d10 == -1) {
            return -1;
        }
        if (d10 == 1) {
            return cArr[0];
        }
        if (d10 == 2) {
            this.f144533f = cArr[1];
            this.f144532e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + d10).toString());
    }

    public final int d(char[] cArr, int i10, int i11) {
        C17542s.j(cArr, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= cArr.length || i11 < 0 || i10 + i11 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + cArr.length).toString());
        }
        if (this.f144532e) {
            cArr[i10] = this.f144533f;
            i10++;
            i11--;
            this.f144532e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(cArr, i10, i11) + i12;
        }
        int c10 = c();
        if (c10 != -1) {
            cArr[i10] = (char) c10;
            return i12 + 1;
        } else if (i12 == 0) {
            return -1;
        } else {
            return i12;
        }
    }
}
