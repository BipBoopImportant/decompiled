package I7;

import C7.d;
import C7.i;
import Y7.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements d<ByteBuffer> {
    /* renamed from: c */
    public boolean b(ByteBuffer byteBuffer, File file, i iVar) {
        try {
            a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
