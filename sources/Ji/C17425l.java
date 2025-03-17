package jI;

import HJ.C15838d;
import java.io.File;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljava/io/File;", "", "g", "(Ljava/io/File;)[B", "array", "LXH/N;", "j", "(Ljava/io/File;[B)V", "Ljava/nio/charset/Charset;", "charset", "", "h", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "k", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "c", "Ljava/io/OutputStream;", "m", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "f", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "e", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* renamed from: jI.l  reason: case insensitive filesystem */
class C17425l extends C17424k {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        jI.C17416c.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.io.File r2, java.lang.String r3, java.nio.charset.Charset r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            m(r0, r3, r4)     // Catch:{ all -> 0x001f }
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x001f }
            r2 = 0
            jI.C17416c.a(r0, r2)
            return
        L_0x001f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r3 = move-exception
            jI.C17416c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17425l.c(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void d(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C15838d.f135279b;
        }
        c(file, str, charset);
    }

    public static final ByteBuffer e(int i10, CharsetEncoder charsetEncoder) {
        C17542s.j(charsetEncoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i10 * ((int) ((float) Math.ceil((double) charsetEncoder.maxBytesPerChar()))));
        C17542s.i(allocate, "allocate(...)");
        return allocate;
    }

    public static final CharsetEncoder f(Charset charset) {
        C17542s.j(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        jI.C17416c.a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] g(java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x0028 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0086
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x002b
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x0028 }
            if (r7 < 0) goto L_0x002b
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            r10 = move-exception
            goto L_0x00a8
        L_0x002b:
            java.lang.String r7 = "copyOf(...)"
            r8 = 0
            if (r5 <= 0) goto L_0x0038
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C17542s.i(r2, r7)     // Catch:{ all -> 0x0028 }
            goto L_0x0068
        L_0x0038:
            int r5 = r0.read()     // Catch:{ all -> 0x0028 }
            r6 = -1
            if (r5 != r6) goto L_0x0040
            goto L_0x0068
        L_0x0040:
            jI.e r6 = new jI.e     // Catch:{ all -> 0x0028 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x0028 }
            r6.write(r5)     // Catch:{ all -> 0x0028 }
            r5 = 2
            jI.C17415b.b(r0, r6, r3, r5, r8)     // Catch:{ all -> 0x0028 }
            int r5 = r6.size()     // Catch:{ all -> 0x0028 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x006c
            byte[] r10 = r6.c()     // Catch:{ all -> 0x0028 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C17542s.i(r2, r7)     // Catch:{ all -> 0x0028 }
            int r4 = r6.size()     // Catch:{ all -> 0x0028 }
            byte[] r2 = YH.C16870n.i(r10, r2, r1, r3, r4)     // Catch:{ all -> 0x0028 }
        L_0x0068:
            jI.C17416c.a(r0, r8)
            return r2
        L_0x006c:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            r2.append(r4)     // Catch:{ all -> 0x0028 }
            r2.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r10)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0086:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r5.<init>()     // Catch:{ all -> 0x0028 }
            r5.append(r4)     // Catch:{ all -> 0x0028 }
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            r5.append(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x0028 }
            r3.<init>(r10)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x00a8:
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            jI.C17416c.a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17425l.g(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        jI.C17416c.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String h(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = jI.C17431r.h(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            jI.C17416c.a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            jI.C17416c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17425l.h(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String i(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C15838d.f135279b;
        }
        return h(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        jI.C17416c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0019 }
            r1 = 0
            jI.C17416c.a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            jI.C17416c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17425l.j(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        jI.C17416c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(java.io.File r1, java.lang.String r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            m(r0, r2, r3)     // Catch:{ all -> 0x001e }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x001e }
            r1 = 0
            jI.C17416c.a(r0, r1)
            return
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            jI.C17416c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17425l.k(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void l(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C15838d.f135279b;
        }
        k(file, str, charset);
    }

    public static final void m(OutputStream outputStream, String str, Charset charset) {
        C17542s.j(outputStream, "<this>");
        C17542s.j(str, "text");
        C17542s.j(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            C17542s.i(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder f10 = f(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        C17542s.g(f10);
        ByteBuffer e10 = e(8192, f10);
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int min = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + min;
            char[] array = allocate.array();
            C17542s.i(array, "array(...)");
            str.getChars(i10, i12, array, i11);
            allocate.limit(min + i11);
            i11 = 1;
            if (f10.encode(allocate, e10, i12 == str.length()).isUnderflow()) {
                outputStream.write(e10.array(), 0, e10.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i11 = 0;
                }
                allocate.clear();
                e10.clear();
                i10 = i12;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}
