package com.google.firebase.abt.component;

import Gb.c;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import mc.C10036b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f68152a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f68153b;

    /* renamed from: c  reason: collision with root package name */
    private final C10036b<Ib.a> f68154c;

    protected a(Context context, C10036b<Ib.a> bVar) {
        this.f68153b = context;
        this.f68154c = bVar;
    }

    /* access modifiers changed from: protected */
    public c a(String str) {
        return new c(this.f68153b, this.f68154c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f68152a.containsKey(str)) {
                this.f68152a.put(str, a(str));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f68152a.get(str);
    }
}
