package s;

import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* renamed from: s.b  reason: case insensitive filesystem */
public final class C5823b {

    /* renamed from: a  reason: collision with root package name */
    private final C5825d f28699a;

    private C5823b(C5825d dVar) {
        this.f28699a = dVar;
    }

    public static C5823b a(String str, PackageManager packageManager) {
        List<byte[]> b10 = C5822a.b(str, packageManager);
        if (b10 == null) {
            return null;
        }
        try {
            return new C5823b(C5825d.c(str, b10));
        } catch (IOException e10) {
            Log.e("Token", "Exception when creating token.", e10);
            return null;
        }
    }

    public byte[] b() {
        return this.f28699a.e();
    }
}
