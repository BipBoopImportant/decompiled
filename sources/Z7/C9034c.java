package z7;

import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: z7.c  reason: case insensitive filesystem */
final class C9034c {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f58521a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f58522b = Charset.forName(Constants.ENCODING);

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    static void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file2 = listFiles[i10];
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (file2.delete()) {
                    i10++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
