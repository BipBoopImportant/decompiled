package com.google.gson.internal;

import Qc.d;
import Qc.e;
import Tc.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class Excluder implements v, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Excluder f68934g = new Excluder();

    /* renamed from: a  reason: collision with root package name */
    private double f68935a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private int f68936b = ModuleDescriptor.MODULE_VERSION;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68937c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68938d;

    /* renamed from: e  reason: collision with root package name */
    private List<a> f68939e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List<a> f68940f = Collections.emptyList();

    private static boolean d(Class<?> cls) {
        return cls.isMemberClass() && !Sc.a.n(cls);
    }

    private boolean e(d dVar) {
        if (dVar == null) {
            return true;
        }
        return this.f68935a >= dVar.value();
    }

    private boolean f(e eVar) {
        if (eVar == null) {
            return true;
        }
        return this.f68935a < eVar.value();
    }

    private boolean j(d dVar, e eVar) {
        return e(dVar) && f(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean b(Class<?> cls, boolean z10) {
        if (this.f68935a != -1.0d && !j((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return true;
        }
        if (!this.f68937c && d(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && Sc.a.l(cls)) {
            return true;
        }
        for (a b10 : z10 ? this.f68939e : this.f68940f) {
            if (b10.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Field field, boolean z10) {
        Qc.a aVar;
        if ((this.f68936b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f68935a != -1.0d && !j((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f68938d && ((aVar = (Qc.a) field.getAnnotation(Qc.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) || b(field.getType(), z10)) {
            return true;
        }
        List<a> list = z10 ? this.f68939e : this.f68940f;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (a a10 : list) {
            if (a10.a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean b10 = b(rawType, true);
        final boolean b11 = b(rawType, false);
        if (!b10 && !b11) {
            return null;
        }
        final Gson gson2 = gson;
        final TypeToken<T> typeToken2 = typeToken;
        return new TypeAdapter<T>() {

            /* renamed from: a  reason: collision with root package name */
            private volatile TypeAdapter<T> f68941a;

            private TypeAdapter<T> a() {
                TypeAdapter<T> typeAdapter = this.f68941a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> r10 = gson2.r(Excluder.this, typeToken2);
                this.f68941a = r10;
                return r10;
            }

            public T read(Tc.a aVar) {
                if (!b11) {
                    return a().read(aVar);
                }
                aVar.a0();
                return null;
            }

            public void write(c cVar, T t10) {
                if (b10) {
                    cVar.v();
                } else {
                    a().write(cVar, t10);
                }
            }
        };
    }
}
