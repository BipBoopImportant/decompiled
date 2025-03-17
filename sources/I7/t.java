package I7;

import C7.i;
import I7.o;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

public class t<Data> implements o<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final o<Uri, Data> f37062a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f37063b;

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f37064a;

        public a(Resources resources) {
            this.f37064a = resources;
        }

        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f37064a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class b implements p<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f37065a;

        public b(Resources resources) {
            this.f37065a = resources;
        }

        public o<Integer, InputStream> d(s sVar) {
            return new t(this.f37065a, sVar.d(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public static class c implements p<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f37066a;

        public c(Resources resources) {
            this.f37066a = resources;
        }

        public o<Integer, Uri> d(s sVar) {
            return new t(this.f37066a, x.c());
        }

        public void teardown() {
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f37063b = resources;
        this.f37062a = oVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f37063b.getResourcePackageName(num.intValue()) + '/' + this.f37063b.getResourceTypeName(num.intValue()) + '/' + this.f37063b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    /* renamed from: c */
    public o.a<Data> b(Integer num, int i10, int i11, i iVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f37062a.b(d10, i10, i11, iVar);
    }

    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
