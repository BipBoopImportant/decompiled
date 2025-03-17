package a4;

import W3.C6712b;
import W3.C6713c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.C9892c;
import q3.z;

/* renamed from: a4.a  reason: case insensitive filesystem */
public final class C6740a extends C6713c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f41427c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f41428a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f41429b = StandardCharsets.ISO_8859_1.newDecoder();

    /* JADX INFO: finally extract failed */
    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f41428a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f41429b.decode(byteBuffer).toString();
                this.f41429b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f41429b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f41429b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f41428a.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    public z b(C6712b bVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new z(new C6742c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f41427c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = C9892c.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new z(new C6742c(bArr, str, str2));
    }
}
