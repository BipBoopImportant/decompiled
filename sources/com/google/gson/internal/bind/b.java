package com.google.gson.internal.bind;

import Tc.c;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.k;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b extends c {

    /* renamed from: r  reason: collision with root package name */
    private static final Writer f69103r = new a();

    /* renamed from: s  reason: collision with root package name */
    private static final JsonPrimitive f69104s = new JsonPrimitive("closed");

    /* renamed from: o  reason: collision with root package name */
    private final List<JsonElement> f69105o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private String f69106p;

    /* renamed from: q  reason: collision with root package name */
    private JsonElement f69107q = k.f69184a;

    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f69103r);
    }

    private JsonElement A0() {
        List<JsonElement> list = this.f69105o;
        return list.get(list.size() - 1);
    }

    private void E0(JsonElement jsonElement) {
        if (this.f69106p != null) {
            if (!jsonElement.isJsonNull() || l()) {
                ((JsonObject) A0()).add(this.f69106p, jsonElement);
            }
            this.f69106p = null;
        } else if (this.f69105o.isEmpty()) {
            this.f69107q = jsonElement;
        } else {
            JsonElement A02 = A0();
            if (A02 instanceof JsonArray) {
                ((JsonArray) A02).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f69105o.isEmpty()) {
            this.f69105o.add(f69104s);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c e() {
        JsonArray jsonArray = new JsonArray();
        E0(jsonArray);
        this.f69105o.add(jsonArray);
        return this;
    }

    public c f() {
        JsonObject jsonObject = new JsonObject();
        E0(jsonObject);
        this.f69105o.add(jsonObject);
        return this;
    }

    public c f0(double d10) {
        if (q() || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            E0(new JsonPrimitive((Number) Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    public void flush() {
    }

    public c h() {
        if (this.f69105o.isEmpty() || this.f69106p != null) {
            throw new IllegalStateException();
        } else if (A0() instanceof JsonArray) {
            List<JsonElement> list = this.f69105o;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c h0(long j10) {
        E0(new JsonPrimitive((Number) Long.valueOf(j10)));
        return this;
    }

    public c i() {
        if (this.f69105o.isEmpty() || this.f69106p != null) {
            throw new IllegalStateException();
        } else if (A0() instanceof JsonObject) {
            List<JsonElement> list = this.f69105o;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c i0(Boolean bool) {
        if (bool == null) {
            return v();
        }
        E0(new JsonPrimitive(bool));
        return this;
    }

    public c j0(Number number) {
        if (number == null) {
            return v();
        }
        if (!q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        E0(new JsonPrimitive(number));
        return this;
    }

    public c l0(String str) {
        if (str == null) {
            return v();
        }
        E0(new JsonPrimitive(str));
        return this;
    }

    public c o0(boolean z10) {
        E0(new JsonPrimitive(Boolean.valueOf(z10)));
        return this;
    }

    public c t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f69105o.isEmpty() || this.f69106p != null) {
            throw new IllegalStateException("Did not expect a name");
        } else if (A0() instanceof JsonObject) {
            this.f69106p = str;
            return this;
        } else {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
    }

    public JsonElement t0() {
        if (this.f69105o.isEmpty()) {
            return this.f69107q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f69105o);
    }

    public c v() {
        E0(k.f69184a);
        return this;
    }
}
