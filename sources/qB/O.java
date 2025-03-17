package Qb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class O {
    private static void a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            C9251i.g(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        C9251i.g(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C9251i.g(gZIPOutputStream);
                throw th;
            }
        }
    }

    static void b(File file, List<N> list) {
        for (N next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.j();
                if (inputStream != null) {
                    a(inputStream, new File(file, next.l()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                C9251i.g(inputStream);
                throw th2;
            }
            C9251i.g(inputStream);
        }
    }
}
