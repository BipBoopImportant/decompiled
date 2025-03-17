package I7;

import C7.i;
import I7.o;
import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f36988a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    private static final class b<Data> implements d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final String f36989a;

        /* renamed from: b  reason: collision with root package name */
        private final a<Data> f36990b;

        /* renamed from: c  reason: collision with root package name */
        private Data f36991c;

        b(String str, a<Data> aVar) {
            this.f36989a = str;
            this.f36990b = aVar;
        }

        public Class<Data> a() {
            return this.f36990b.a();
        }

        public void b() {
            try {
                this.f36990b.b(this.f36991c);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f36990b.c(this.f36989a);
                this.f36991c = c10;
                aVar.e(c10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f36992a = new a();

        class a implements a<InputStream> {
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
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public o<Model, InputStream> d(s sVar) {
            return new e(this.f36992a);
        }

        public void teardown() {
        }
    }

    public e(a<Data> aVar) {
        this.f36988a = aVar;
    }

    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    public o.a<Data> b(Model model, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(model), new b(model.toString(), this.f36988a));
    }
}
