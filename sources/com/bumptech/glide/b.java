package com.bumptech.glide;

import E7.k;
import F7.d;
import G7.h;
import R7.c;
import R7.o;
import U7.f;
import U7.g;
import V7.i;
import Y7.l;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements ComponentCallbacks2 {

    /* renamed from: k  reason: collision with root package name */
    private static volatile b f46464k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f46465l;

    /* renamed from: a  reason: collision with root package name */
    private final k f46466a;

    /* renamed from: b  reason: collision with root package name */
    private final d f46467b;

    /* renamed from: c  reason: collision with root package name */
    private final h f46468c;

    /* renamed from: d  reason: collision with root package name */
    private final d f46469d;

    /* renamed from: e  reason: collision with root package name */
    private final F7.b f46470e;

    /* renamed from: f  reason: collision with root package name */
    private final o f46471f;

    /* renamed from: g  reason: collision with root package name */
    private final c f46472g;

    /* renamed from: h  reason: collision with root package name */
    private final List<l> f46473h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final a f46474i;

    /* renamed from: j  reason: collision with root package name */
    private f f46475j = f.NORMAL;

    public interface a {
        g g();
    }

    b(Context context, k kVar, h hVar, d dVar, F7.b bVar, o oVar, c cVar, int i10, a aVar, Map<Class<?>, m<?, ?>> map, List<f<Object>> list, List<S7.b> list2, S7.a aVar2, e eVar) {
        this.f46466a = kVar;
        this.f46467b = dVar;
        F7.b bVar2 = bVar;
        this.f46470e = bVar2;
        this.f46468c = hVar;
        this.f46471f = oVar;
        this.f46472g = cVar;
        a aVar3 = aVar;
        this.f46474i = aVar3;
        this.f46469d = new d(context, bVar2, j.d(this, list2, aVar2), new V7.g(), aVar3, map, list, kVar, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f46465l) {
            f46465l = true;
            try {
                m(context, generatedAppGlideModule);
            } finally {
                f46465l = false;
            }
        } else {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
    }

    public static b c(Context context) {
        if (f46464k == null) {
            GeneratedAppGlideModule d10 = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f46464k == null) {
                        a(context, d10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46464k;
    }

    private static GeneratedAppGlideModule d(Context context) {
        Class<GeneratedAppGlideModuleImpl> cls = GeneratedAppGlideModuleImpl.class;
        try {
            int i10 = GeneratedAppGlideModuleImpl.f46462b;
            return cls.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e10) {
            q(e10);
        } catch (IllegalAccessException e11) {
            q(e11);
        } catch (NoSuchMethodException e12) {
            q(e12);
        } catch (InvocationTargetException e13) {
            q(e13);
        }
        return null;
    }

    private static o l(Context context) {
        Y7.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<S7.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new S7.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d10 = generatedAppGlideModule.d();
            Iterator<S7.b> it = emptyList.iterator();
            while (it.hasNext()) {
                S7.b next = it.next();
                if (d10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (S7.b bVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar.getClass());
            }
        }
        cVar.c(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (S7.b a10 : emptyList) {
            a10.a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a11 = cVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a11);
        f46464k = a11;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l t(Context context) {
        return l(context).f(context);
    }

    public static l u(View view) {
        return l(view.getContext()).g(view);
    }

    public void b() {
        l.a();
        this.f46468c.b();
        this.f46467b.b();
        this.f46470e.b();
    }

    public F7.b e() {
        return this.f46470e;
    }

    public d f() {
        return this.f46467b;
    }

    /* access modifiers changed from: package-private */
    public c g() {
        return this.f46472g;
    }

    public Context h() {
        return this.f46469d.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public d i() {
        return this.f46469d;
    }

    public i j() {
        return this.f46469d.i();
    }

    public o k() {
        return this.f46471f;
    }

    /* access modifiers changed from: package-private */
    public void o(l lVar) {
        synchronized (this.f46473h) {
            try {
                if (!this.f46473h.contains(lVar)) {
                    this.f46473h.add(lVar);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        b();
    }

    public void onTrimMemory(int i10) {
        r(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean p(i<?> iVar) {
        synchronized (this.f46473h) {
            try {
                for (l C10 : this.f46473h) {
                    if (C10.C(iVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(int i10) {
        l.a();
        synchronized (this.f46473h) {
            try {
                for (l onTrimMemory : this.f46473h) {
                    onTrimMemory.onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f46468c.a(i10);
        this.f46467b.a(i10);
        this.f46470e.a(i10);
    }

    /* access modifiers changed from: package-private */
    public void s(l lVar) {
        synchronized (this.f46473h) {
            try {
                if (this.f46473h.contains(lVar)) {
                    this.f46473h.remove(lVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
