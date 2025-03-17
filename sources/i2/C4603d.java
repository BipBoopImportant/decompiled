package I2;

import H2.i;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: I2.d  reason: case insensitive filesystem */
public final class C4603d {

    /* renamed from: a  reason: collision with root package name */
    private final f f8653a;

    /* renamed from: I2.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f8654a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f8654a = new b(clipData, i10);
            } else {
                this.f8654a = new C0120d(clipData, i10);
            }
        }

        public C4603d a() {
            return this.f8654a.g();
        }

        public a b(Bundle bundle) {
            this.f8654a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f8654a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f8654a.a(uri);
            return this;
        }
    }

    /* renamed from: I2.d$b */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f8655a;

        b(ClipData clipData, int i10) {
            this.f8655a = C4613i.a(clipData, i10);
        }

        public void a(Uri uri) {
            ContentInfo.Builder unused = this.f8655a.setLinkUri(uri);
        }

        public void b(int i10) {
            ContentInfo.Builder unused = this.f8655a.setFlags(i10);
        }

        public C4603d g() {
            return new C4603d(new e(this.f8655a.build()));
        }

        public void setExtras(Bundle bundle) {
            ContentInfo.Builder unused = this.f8655a.setExtras(bundle);
        }
    }

    /* renamed from: I2.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C4603d g();

        void setExtras(Bundle bundle);
    }

    /* renamed from: I2.d$d  reason: collision with other inner class name */
    private static final class C0120d implements c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f8656a;

        /* renamed from: b  reason: collision with root package name */
        int f8657b;

        /* renamed from: c  reason: collision with root package name */
        int f8658c;

        /* renamed from: d  reason: collision with root package name */
        Uri f8659d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f8660e;

        C0120d(ClipData clipData, int i10) {
            this.f8656a = clipData;
            this.f8657b = i10;
        }

        public void a(Uri uri) {
            this.f8659d = uri;
        }

        public void b(int i10) {
            this.f8658c = i10;
        }

        public C4603d g() {
            return new C4603d(new g(this));
        }

        public void setExtras(Bundle bundle) {
            this.f8660e = bundle;
        }
    }

    /* renamed from: I2.d$e */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f8661a;

        e(ContentInfo contentInfo) {
            this.f8661a = C4601c.a(i.g(contentInfo));
        }

        public ClipData a() {
            return this.f8661a.getClip();
        }

        public ContentInfo b() {
            return this.f8661a;
        }

        public int c() {
            return this.f8661a.getFlags();
        }

        public int i() {
            return this.f8661a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f8661a + "}";
        }
    }

    /* renamed from: I2.d$f */
    private interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int i();
    }

    /* renamed from: I2.d$g */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f8662a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8663b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8664c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f8665d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f8666e;

        g(C0120d dVar) {
            this.f8662a = (ClipData) i.g(dVar.f8656a);
            this.f8663b = i.c(dVar.f8657b, 0, 5, "source");
            this.f8664c = i.f(dVar.f8658c, 1);
            this.f8665d = dVar.f8659d;
            this.f8666e = dVar.f8660e;
        }

        public ClipData a() {
            return this.f8662a;
        }

        public ContentInfo b() {
            return null;
        }

        public int c() {
            return this.f8664c;
        }

        public int i() {
            return this.f8663b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f8662a.getDescription());
            sb2.append(", source=");
            sb2.append(C4603d.e(this.f8663b));
            sb2.append(", flags=");
            sb2.append(C4603d.a(this.f8664c));
            String str2 = "";
            if (this.f8665d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f8665d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f8666e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C4603d(f fVar) {
        this.f8653a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C4603d g(ContentInfo contentInfo) {
        return new C4603d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f8653a.a();
    }

    public int c() {
        return this.f8653a.c();
    }

    public int d() {
        return this.f8653a.i();
    }

    public ContentInfo f() {
        ContentInfo b10 = this.f8653a.b();
        Objects.requireNonNull(b10);
        return C4601c.a(b10);
    }

    public String toString() {
        return this.f8653a.toString();
    }
}
