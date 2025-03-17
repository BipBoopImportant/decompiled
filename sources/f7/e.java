package F7;

import android.graphics.Bitmap;

public class e implements d {
    public void a(int i10) {
    }

    public void b() {
    }

    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
