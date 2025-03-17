package C;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.J;
import java.io.Closeable;
import java.util.concurrent.Executor;

public interface v0 extends Closeable {

    public static abstract class a {
        public static a f(Size size, Rect rect, J j10, int i10, boolean z10) {
            return new C4392f(size, rect, j10, i10, z10);
        }

        public abstract J a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        public static b c(int i10, v0 v0Var) {
            return new C4394g(i10, v0Var);
        }

        public abstract int a();

        public abstract v0 b();
    }

    void G1(float[] fArr, float[] fArr2);

    void W(float[] fArr, float[] fArr2, boolean z10) {
    }

    Size a();

    void close();

    int getFormat() {
        return 34;
    }

    Surface i3(Executor executor, H2.a<b> aVar);
}
