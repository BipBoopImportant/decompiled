package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.a;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Excluder f68914a = Excluder.f68934g;

    /* renamed from: b  reason: collision with root package name */
    private q f68915b = q.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private d f68916c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, g<?>> f68917d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<v> f68918e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<v> f68919f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f68920g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f68921h = Gson.f68872B;

    /* renamed from: i  reason: collision with root package name */
    private int f68922i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f68923j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f68924k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f68925l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f68926m = true;

    /* renamed from: n  reason: collision with root package name */
    private e f68927n = Gson.f68871A;

    /* renamed from: o  reason: collision with root package name */
    private boolean f68928o = false;

    /* renamed from: p  reason: collision with root package name */
    private s f68929p = Gson.f68876z;

    /* renamed from: q  reason: collision with root package name */
    private boolean f68930q = true;

    /* renamed from: r  reason: collision with root package name */
    private u f68931r = Gson.f68874D;

    /* renamed from: s  reason: collision with root package name */
    private u f68932s = Gson.f68875E;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayDeque<r> f68933t = new ArrayDeque<>();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r4, int r5, int r6, java.util.List<com.google.gson.v> r7) {
        /*
            boolean r0 = com.google.gson.internal.sql.a.f69178a
            r1 = 0
            if (r4 == 0) goto L_0x0026
            java.lang.String r2 = r4.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<java.util.Date> r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.a.f68963b
            com.google.gson.v r5 = r5.b(r4)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<? extends java.util.Date> r6 = com.google.gson.internal.sql.a.f69180c
            com.google.gson.v r1 = r6.b(r4)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<? extends java.util.Date> r6 = com.google.gson.internal.sql.a.f69179b
            com.google.gson.v r4 = r6.b(r4)
            goto L_0x0047
        L_0x0024:
            r4 = r1
            goto L_0x0047
        L_0x0026:
            r4 = 2
            if (r5 != r4) goto L_0x002d
            if (r6 == r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            return
        L_0x002d:
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<java.util.Date> r4 = com.google.gson.internal.bind.DefaultDateTypeAdapter.a.f68963b
            com.google.gson.v r4 = r4.a(r5, r6)
            if (r0 == 0) goto L_0x0045
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<? extends java.util.Date> r1 = com.google.gson.internal.sql.a.f69180c
            com.google.gson.v r1 = r1.a(r5, r6)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$a<? extends java.util.Date> r2 = com.google.gson.internal.sql.a.f69179b
            com.google.gson.v r5 = r2.a(r5, r6)
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0047
        L_0x0045:
            r5 = r4
            goto L_0x0024
        L_0x0047:
            r7.add(r5)
            if (r0 == 0) goto L_0x0052
            r7.add(r1)
            r7.add(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.f.a(java.lang.String, int, int, java.util.List):void");
    }

    private static boolean c(Type type) {
        return (type instanceof Class) && (type == Object.class || JsonElement.class.isAssignableFrom((Class) type));
    }

    public Gson b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f68918e.size() + this.f68919f.size() + 3);
        arrayList2.addAll(this.f68918e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f68919f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f68921h, this.f68922i, this.f68923j, arrayList2);
        Excluder excluder = this.f68914a;
        d dVar = this.f68916c;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.f68917d);
        boolean z10 = this.f68920g;
        boolean z11 = this.f68924k;
        boolean z12 = this.f68928o;
        boolean z13 = this.f68926m;
        e eVar = this.f68927n;
        s sVar = this.f68929p;
        boolean z14 = this.f68925l;
        boolean z15 = this.f68930q;
        q qVar = this.f68915b;
        String str = this.f68921h;
        int i10 = this.f68922i;
        int i11 = this.f68923j;
        ArrayList arrayList4 = r1;
        Excluder excluder2 = excluder;
        ArrayList arrayList5 = new ArrayList(this.f68918e);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.f68919f);
        u uVar = this.f68931r;
        u uVar2 = this.f68932s;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.f68933t);
        return new Gson(excluder2, dVar, hashMap, z10, z11, z12, z13, eVar, sVar, z14, z15, qVar, str, i10, i11, arrayList4, arrayList6, arrayList, uVar, uVar2, arrayList8);
    }

    public f d(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z10 = obj instanceof o;
        a.a(z10 || (obj instanceof i) || (obj instanceof g) || (obj instanceof TypeAdapter));
        if (!c(type)) {
            if (obj instanceof g) {
                this.f68917d.put(type, (g) obj);
            }
            if (z10 || (obj instanceof i)) {
                this.f68918e.add(TreeTypeAdapter.c(TypeToken.get(type), obj));
            }
            if (obj instanceof TypeAdapter) {
                this.f68918e.add(TypeAdapters.a(TypeToken.get(type), (TypeAdapter) obj));
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
    }

    public f e(v vVar) {
        Objects.requireNonNull(vVar);
        this.f68918e.add(vVar);
        return this;
    }

    public f f(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e10);
            }
        }
        this.f68921h = str;
        return this;
    }

    public f g(c cVar) {
        return h(cVar);
    }

    public f h(d dVar) {
        Objects.requireNonNull(dVar);
        this.f68916c = dVar;
        return this;
    }
}
