package com.auth0.android.request.internal;

import Tc.a;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Field;

class JsonRequiredTypeAdapterFactory implements v {
    JsonRequiredTypeAdapterFactory() {
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final TypeAdapter<T> r10 = gson.r(this, typeToken);
        return new TypeAdapter<T>() {
            public T read(a aVar) {
                T read = r10.read(aVar);
                for (Field field : read.getClass().getDeclaredFields()) {
                    if (!(field == null || field.getAnnotation(h.class) == null)) {
                        try {
                            field.setAccessible(true);
                            if (field.get(read) == null) {
                                throw new l(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                            }
                        } catch (IllegalAccessException unused) {
                            throw new l(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                        }
                    }
                }
                return read;
            }

            public void write(c cVar, T t10) {
                r10.write(cVar, t10);
            }
        }.nullSafe();
    }
}
