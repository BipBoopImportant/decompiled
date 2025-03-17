package P7;

import C7.c;
import C7.i;
import C7.l;
import E7.v;
import Y7.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public class d implements l<c> {
    public c a(i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean b(v<c> vVar, File file, i iVar) {
        try {
            a.f(vVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
