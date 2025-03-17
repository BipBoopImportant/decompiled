package com.bumptech.glide;

import E7.k;
import F7.b;
import V7.g;
import V7.j;
import Y7.f;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final m<?, ?> f46494k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f46495a;

    /* renamed from: b  reason: collision with root package name */
    private final f.b<i> f46496b;

    /* renamed from: c  reason: collision with root package name */
    private final g f46497c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f46498d;

    /* renamed from: e  reason: collision with root package name */
    private final List<U7.f<Object>> f46499e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f46500f;

    /* renamed from: g  reason: collision with root package name */
    private final k f46501g;

    /* renamed from: h  reason: collision with root package name */
    private final e f46502h;

    /* renamed from: i  reason: collision with root package name */
    private final int f46503i;

    /* renamed from: j  reason: collision with root package name */
    private U7.g f46504j;

    public d(Context context, F7.b bVar, f.b<i> bVar2, g gVar, b.a aVar, Map<Class<?>, m<?, ?>> map, List<U7.f<Object>> list, k kVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f46495a = bVar;
        this.f46497c = gVar;
        this.f46498d = aVar;
        this.f46499e = list;
        this.f46500f = map;
        this.f46501g = kVar;
        this.f46502h = eVar;
        this.f46503i = i10;
        this.f46496b = f.a(bVar2);
    }

    public <X> j<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f46497c.a(imageView, cls);
    }

    public F7.b b() {
        return this.f46495a;
    }

    public List<U7.f<Object>> c() {
        return this.f46499e;
    }

    public synchronized U7.g d() {
        try {
            if (this.f46504j == null) {
                this.f46504j = (U7.g) this.f46498d.g().W();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f46504j;
    }

    public <T> m<?, T> e(Class<T> cls) {
        m<?, T> mVar = this.f46500f.get(cls);
        if (mVar == null) {
            for (Map.Entry next : this.f46500f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                }
            }
        }
        return mVar == null ? f46494k : mVar;
    }

    public k f() {
        return this.f46501g;
    }

    public e g() {
        return this.f46502h;
    }

    public int h() {
        return this.f46503i;
    }

    public i i() {
        return this.f46496b.get();
    }
}
