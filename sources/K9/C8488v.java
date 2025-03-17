package k9;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: k9.v  reason: case insensitive filesystem */
public abstract class C8488v {
    static C8488v a(long j10) {
        return new C8478l(j10);
    }

    public static C8488v b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C8488v a10 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return a10;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
