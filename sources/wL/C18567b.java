package wL;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: wL.b  reason: case insensitive filesystem */
public class C18567b {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f152029a;

    /* renamed from: b  reason: collision with root package name */
    private String f152030b;

    public Bitmap a() {
        Bitmap.Config config;
        Bitmap bitmap = this.f152029a;
        if (!(bitmap == null || bitmap.getConfig() == (config = Bitmap.Config.ARGB_8888))) {
            this.f152029a = this.f152029a.copy(config, false);
        }
        return this.f152029a;
    }

    public String b() {
        return this.f152030b;
    }

    public float c() {
        Bitmap bitmap = this.f152029a;
        if (bitmap != null) {
            float density = (float) bitmap.getDensity();
            if (density == 0.0f) {
                density = 160.0f;
            }
            return density / 160.0f;
        }
        throw new IllegalStateException("Required to set a Icon before calling getScale");
    }

    public byte[] d() {
        Bitmap bitmap = this.f152029a;
        if (bitmap != null) {
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * this.f152029a.getHeight());
            this.f152029a.copyPixelsToBuffer(allocate);
            return allocate.array();
        }
        throw new IllegalStateException("Required to set a Icon before calling toBytes");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18567b bVar = (C18567b) obj;
        return this.f152029a.equals(bVar.f152029a) && this.f152030b.equals(bVar.f152030b);
    }

    public int hashCode() {
        Bitmap bitmap = this.f152029a;
        int hashCode = bitmap != null ? bitmap.hashCode() : 0;
        String str = this.f152030b;
        return str != null ? (hashCode * 31) + str.hashCode() : hashCode;
    }
}
