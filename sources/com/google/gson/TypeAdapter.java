package com.google.gson;

import Tc.a;
import Tc.b;
import Tc.c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return read(new a(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new com.google.gson.internal.bind.a(jsonElement));
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() {
            public T read(a aVar) {
                if (aVar.F() != b.NULL) {
                    return TypeAdapter.this.read(aVar);
                }
                aVar.x();
                return null;
            }

            public void write(c cVar, T t10) {
                if (t10 == null) {
                    cVar.v();
                } else {
                    TypeAdapter.this.write(cVar, t10);
                }
            }
        };
    }

    public abstract T read(a aVar);

    public final void toJson(Writer writer, T t10) {
        write(new c(writer), t10);
    }

    public final JsonElement toJsonTree(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t10);
            return bVar.t0();
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        }
    }

    public abstract void write(c cVar, T t10);

    public final T fromJson(String str) {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        }
    }
}
