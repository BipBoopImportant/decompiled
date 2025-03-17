package jI;

import HJ.C15854t;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljava/io/File;", "target", "", "overwrite", "", "bufferSize", "p", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "r", "(Ljava/io/File;)Z", "relative", "u", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "", "v", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "s", "(Ljava/io/File;)Ljava/lang/String;", "extension", "t", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* renamed from: jI.n  reason: case insensitive filesystem */
class C17427n extends C17426m {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        jI.C17416c.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
        jI.C17416c.a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File p(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            jI.f r8 = new jI.f
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            jI.f r8 = new jI.f
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            jI.g r8 = new jI.g
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0062 }
            r6.<init>(r7)     // Catch:{ all -> 0x0062 }
            jI.C17415b.a(r8, r6, r9)     // Catch:{ all -> 0x0064 }
            r9 = 0
            jI.C17416c.a(r6, r9)     // Catch:{ all -> 0x0062 }
            jI.C17416c.a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r6 = move-exception
            goto L_0x006b
        L_0x0064:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r9 = move-exception
            jI.C17416c.a(r6, r7)     // Catch:{ all -> 0x0062 }
            throw r9     // Catch:{ all -> 0x0062 }
        L_0x006b:
            throw r6     // Catch:{ all -> 0x006c }
        L_0x006c:
            r7 = move-exception
            jI.C17416c.a(r8, r6)
            throw r7
        L_0x0071:
            jI.p r7 = new jI.p
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jI.C17427n.p(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    public static /* synthetic */ File q(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return p(file, file2, z10, i10);
    }

    public static boolean r(File file) {
        C17542s.j(file, "<this>");
        Iterator it = C17426m.o(file).iterator();
        while (true) {
            boolean z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
        }
    }

    public static String s(File file) {
        C17542s.j(file, "<this>");
        String name = file.getName();
        C17542s.i(name, "getName(...)");
        return C15854t.m1(name, '.', "");
    }

    public static String t(File file) {
        C17542s.j(file, "<this>");
        String name = file.getName();
        C17542s.i(name, "getName(...)");
        return C15854t.x1(name, ".", (String) null, 2, (Object) null);
    }

    public static final File u(File file, File file2) {
        C17542s.j(file, "<this>");
        C17542s.j(file2, "relative");
        if (C17424k.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C17542s.i(file3, "toString(...)");
        if (file3.length() != 0) {
            char c10 = File.separatorChar;
            if (!C15854t.i0(file3, c10, false, 2, (Object) null)) {
                return new File(file3 + c10 + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File v(File file, String str) {
        C17542s.j(file, "<this>");
        C17542s.j(str, "relative");
        return u(file, new File(str));
    }
}
