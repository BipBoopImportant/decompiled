package w3;

import java.io.IOException;

public final class j {
    public static void a(g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
