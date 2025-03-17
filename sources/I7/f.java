package I7;

import C7.i;
import I7.o;
import N7.j;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f36994a;

    /* renamed from: b  reason: collision with root package name */
    private final e<DataT> f36995b;

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36996a;

        a(Context context) {
            this.f36996a = context;
        }

        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f36996a, this);
        }

        /* renamed from: e */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        /* renamed from: f */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        public void teardown() {
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36997a;

        b(Context context) {
            this.f36997a = context;
        }

        public Class<Drawable> a() {
            return Drawable.class;
        }

        public o<Integer, Drawable> d(s sVar) {
            return new f(this.f36997a, this);
        }

        /* renamed from: e */
        public void b(Drawable drawable) {
        }

        /* renamed from: f */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return N7.f.a(this.f36997a, i10, theme);
        }

        public void teardown() {
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36998a;

        c(Context context) {
            this.f36998a = context;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        public o<Integer, InputStream> d(s sVar) {
            return new f(this.f36998a, this);
        }

        /* renamed from: e */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        /* renamed from: f */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        public void teardown() {
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f36999a;

        /* renamed from: b  reason: collision with root package name */
        private final Resources f37000b;

        /* renamed from: c  reason: collision with root package name */
        private final e<DataT> f37001c;

        /* renamed from: d  reason: collision with root package name */
        private final int f37002d;

        /* renamed from: e  reason: collision with root package name */
        private DataT f37003e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f36999a = theme;
            this.f37000b = resources;
            this.f37001c = eVar;
            this.f37002d = i10;
        }

        public Class<DataT> a() {
            return this.f37001c.a();
        }

        public void b() {
            DataT datat = this.f37003e;
            if (datat != null) {
                try {
                    this.f37001c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super DataT> aVar) {
            try {
                DataT c10 = this.f37001c.c(this.f36999a, this.f37000b, this.f37002d);
                this.f37003e = c10;
                aVar.e(c10);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        DataT c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e<DataT> eVar) {
        this.f36994a = context.getApplicationContext();
        this.f36995b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    /* renamed from: d */
    public o.a<DataT> b(Integer num, int i10, int i11, i iVar) {
        Resources.Theme theme = (Resources.Theme) iVar.c(j.f39162b);
        return new o.a<>(new X7.d(num), new d(theme, theme != null ? theme.getResources() : this.f36994a.getResources(), this.f36995b, num.intValue()));
    }

    /* renamed from: f */
    public boolean a(Integer num) {
        return true;
    }
}
