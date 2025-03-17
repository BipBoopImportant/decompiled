package jI;

import HJ.C15854t;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "", "b", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* renamed from: jI.k  reason: case insensitive filesystem */
class C17424k {
    private static final int a(String str) {
        int r02;
        char c10 = File.separatorChar;
        int r03 = C15854t.r0(str, c10, 0, false, 4, (Object) null);
        if (r03 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (r02 = C15854t.r0(str, c10, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int r04 = C15854t.r0(str, c10, r02 + 1, false, 4, (Object) null);
            return r04 >= 0 ? r04 + 1 : str.length();
        } else if (r03 > 0 && str.charAt(r03 - 1) == ':') {
            return r03 + 1;
        } else {
            if (r03 != -1 || !C15854t.i0(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    public static final boolean b(File file) {
        C17542s.j(file, "<this>");
        String path = file.getPath();
        C17542s.i(path, "getPath(...)");
        return a(path) > 0;
    }
}
