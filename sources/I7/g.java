package I7;

import C7.i;
import I7.o;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class g<Data> implements o<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f37004a;

    public static class a<Data> implements p<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f37005a;

        public a(d<Data> dVar) {
            this.f37005a = dVar;
        }

        public final o<File, Data> d(s sVar) {
            return new g(this.f37005a);
        }

        public final void teardown() {
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final File f37006a;

        /* renamed from: b  reason: collision with root package name */
        private final d<Data> f37007b;

        /* renamed from: c  reason: collision with root package name */
        private Data f37008c;

        c(File file, d<Data> dVar) {
            this.f37006a = file;
            this.f37007b = dVar;
        }

        public Class<Data> a() {
            return this.f37007b.a();
        }

        public void b() {
            Data data = this.f37008c;
            if (data != null) {
                try {
                    this.f37007b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f37007b.c(this.f37006a);
                this.f37008c = c10;
                aVar.e(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f37004a = dVar;
    }

    /* renamed from: c */
    public o.a<Data> b(File file, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(file), new c(file, this.f37004a));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
