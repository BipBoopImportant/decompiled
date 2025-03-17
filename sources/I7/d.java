package I7;

import C7.i;
import I7.o;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements o<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        private final File f36987a;

        a(File file) {
            this.f36987a = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(Y7.a.a(this.f36987a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements p<File, ByteBuffer> {
        public o<File, ByteBuffer> d(s sVar) {
            return new d();
        }

        public void teardown() {
        }
    }

    /* renamed from: c */
    public o.a<ByteBuffer> b(File file, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(file), new a(file));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
