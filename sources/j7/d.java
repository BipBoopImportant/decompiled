package J7;

import C7.i;
import I7.o;
import I7.p;
import I7.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37385a;

    /* renamed from: b  reason: collision with root package name */
    private final o<File, DataT> f37386b;

    /* renamed from: c  reason: collision with root package name */
    private final o<Uri, DataT> f37387c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<DataT> f37388d;

    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37389a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<DataT> f37390b;

        a(Context context, Class<DataT> cls) {
            this.f37389a = context;
            this.f37390b = cls;
        }

        public final o<Uri, DataT> d(s sVar) {
            return new d(this.f37389a, sVar.d(File.class, this.f37390b), sVar.d(Uri.class, this.f37390b), this.f37390b);
        }

        public final void teardown() {
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: J7.d$d  reason: collision with other inner class name */
    private static final class C0594d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k  reason: collision with root package name */
        private static final String[] f37391k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f37392a;

        /* renamed from: b  reason: collision with root package name */
        private final o<File, DataT> f37393b;

        /* renamed from: c  reason: collision with root package name */
        private final o<Uri, DataT> f37394c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f37395d;

        /* renamed from: e  reason: collision with root package name */
        private final int f37396e;

        /* renamed from: f  reason: collision with root package name */
        private final int f37397f;

        /* renamed from: g  reason: collision with root package name */
        private final i f37398g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<DataT> f37399h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f37400i;

        /* renamed from: j  reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f37401j;

        C0594d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, i iVar, Class<DataT> cls) {
            this.f37392a = context.getApplicationContext();
            this.f37393b = oVar;
            this.f37394c = oVar2;
            this.f37395d = uri;
            this.f37396e = i10;
            this.f37397f = i11;
            this.f37398g = iVar;
            this.f37399h = cls;
        }

        private o.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f37393b.b(h(this.f37395d), this.f37396e, this.f37397f, this.f37398g);
            }
            if (D7.b.a(this.f37395d)) {
                return this.f37394c.b(this.f37395d, this.f37396e, this.f37397f, this.f37398g);
            }
            return this.f37394c.b(g() ? MediaStore.setRequireOriginal(this.f37395d) : this.f37395d, this.f37396e, this.f37397f, this.f37398g);
        }

        private com.bumptech.glide.load.data.d<DataT> e() {
            o.a c10 = c();
            if (c10 != null) {
                return c10.f37039c;
            }
            return null;
        }

        private boolean g() {
            return this.f37392a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f37392a.getContentResolver().query(uri, f37391k, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }

        public Class<DataT> a() {
            return this.f37399h;
        }

        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f37401j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void cancel() {
            this.f37400i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f37401j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> e10 = e();
                if (e10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f37395d));
                    return;
                }
                this.f37401j = e10;
                if (this.f37400i) {
                    cancel();
                } else {
                    e10.f(gVar, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.c(e11);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f37385a = context.getApplicationContext();
        this.f37386b = oVar;
        this.f37387c = oVar2;
        this.f37388d = cls;
    }

    /* renamed from: c */
    public o.a<DataT> b(Uri uri, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(uri), new C0594d(this.f37385a, this.f37386b, this.f37387c, uri, i10, i11, iVar, this.f37388d));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && D7.b.c(uri);
    }
}
