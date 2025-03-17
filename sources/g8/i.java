package G8;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LG8/i;", "", "<init>", "()V", "", "content", "Ljava/io/ByteArrayOutputStream;", "byteArrayOutputStream", "a", "([BLjava/io/ByteArrayOutputStream;)[B", "c", "([B)[B", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f36274a = new i();

    private i() {
    }

    public static /* synthetic */ byte[] b(i iVar, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        return iVar.a(bArr, byteArrayOutputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        jI.C17416c.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(byte[] r2, java.io.ByteArrayOutputStream r3) {
        /*
            r1 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "byteArrayOutputStream"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r3)
            r0.write(r2)     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ all -> 0x0023 }
            byte[] r2 = r3.toByteArray()     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "byteArrayOutputStream.toByteArray()"
            kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ all -> 0x0023 }
            r3 = 0
            jI.C17416c.a(r0, r3)
            return r2
        L_0x0023:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            jI.C17416c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.i.a(byte[], java.io.ByteArrayOutputStream):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        jI.C17416c.a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] c(byte[] r3) {
        /*
            r2 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            byte[] r3 = jI.C17415b.c(r0)     // Catch:{ all -> 0x0018 }
            r1 = 0
            jI.C17416c.a(r0, r1)
            return r3
        L_0x0018:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            jI.C17416c.a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.i.c(byte[]):byte[]");
    }
}
