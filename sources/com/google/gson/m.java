package com.google.gson;

import Tc.a;
import Tc.b;
import Tc.d;
import com.google.gson.internal.n;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class m {
    public static JsonElement b(a aVar) {
        s s10 = aVar.s();
        if (s10 == s.LEGACY_STRICT) {
            aVar.f0(s.LENIENT);
        }
        try {
            JsonElement a10 = n.a(aVar);
            aVar.f0(s10);
            return a10;
        } catch (StackOverflowError e10) {
            throw new l("Failed parsing JSON source: " + aVar + " to Json", e10);
        } catch (OutOfMemoryError e11) {
            throw new l("Failed parsing JSON source: " + aVar + " to Json", e11);
        } catch (Throwable th2) {
            aVar.f0(s10);
            throw th2;
        }
    }

    public static JsonElement c(Reader reader) {
        try {
            a aVar = new a(reader);
            JsonElement b10 = b(aVar);
            if (!b10.isJsonNull()) {
                if (aVar.F() != b.END_DOCUMENT) {
                    throw new p("Did not consume the entire document.");
                }
            }
            return b10;
        } catch (d e10) {
            throw new p((Throwable) e10);
        } catch (IOException e11) {
            throw new j((Throwable) e11);
        } catch (NumberFormatException e12) {
            throw new p((Throwable) e12);
        }
    }

    public static JsonElement d(String str) {
        return c(new StringReader(str));
    }

    @Deprecated
    public JsonElement a(String str) {
        return d(str);
    }
}
