package a0;

import a0.C4959c;
import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.h1;

public abstract class i0 implements C4967k {

    public static abstract class a {
        a() {
        }

        public abstract i0 a();

        public abstract a b(int i10);

        public abstract a c(int i10);

        public abstract a d(j0 j0Var);

        public abstract a e(int i10);

        public abstract a f(int i10);

        public abstract a g(h1 h1Var);

        public abstract a h(String str);

        public abstract a i(int i10);

        public abstract a j(Size size);
    }

    i0() {
    }

    public static a d() {
        return new C4959c.b().i(-1).f(1).c(2130708361).d(j0.f15111a);
    }

    public abstract String a();

    public MediaFormat b() {
        Size k10 = k();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(a(), k10.getWidth(), k10.getHeight());
        createVideoFormat.setInteger("color-format", f());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", h());
        createVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            createVideoFormat.setInteger("profile", j());
        }
        j0 g10 = g();
        if (g10.c() != 0) {
            createVideoFormat.setInteger("color-standard", g10.c());
        }
        if (g10.d() != 0) {
            createVideoFormat.setInteger("color-transfer", g10.d());
        }
        if (g10.b() != 0) {
            createVideoFormat.setInteger("color-range", g10.b());
        }
        return createVideoFormat;
    }

    public abstract h1 c();

    public abstract int e();

    public abstract int f();

    public abstract j0 g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
