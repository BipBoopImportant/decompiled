package L2;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final b f9061a;

    private static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f9062a;

        a(Object obj) {
            this.f9062a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f9062a;
        }

        public Uri b() {
            return this.f9062a.getContentUri();
        }

        public void c() {
            this.f9062a.requestPermission();
        }

        public Uri d() {
            return this.f9062a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f9062a.getDescription();
        }
    }

    private interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    private d(b bVar) {
        this.f9061a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f9061a.b();
    }

    public ClipDescription b() {
        return this.f9061a.getDescription();
    }

    public Uri c() {
        return this.f9061a.d();
    }

    public void d() {
        this.f9061a.c();
    }

    public Object e() {
        return this.f9061a.a();
    }
}
