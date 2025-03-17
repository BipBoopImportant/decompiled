package com.contentsquare.android.analytics.internal.features.clientmode.ui.developer;

import E8.c;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import kotlin.jvm.internal.C17542s;

public final class a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    public final c f46616m;

    /* renamed from: com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.a$a  reason: collision with other inner class name */
    public static final class C0811a implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        public final c f46617a;

        public C0811a(c cVar) {
            C17542s.j(cVar, "preferencesStore");
            this.f46617a = cVar;
        }

        public final <T extends f0> T create(Class<T> cls) {
            C17542s.j(cls, "modelClass");
            if (C17542s.e(cls, a.class)) {
                return new a(this.f46617a);
            }
            T newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C17542s.i(newInstance, "{\n                    mo…tance()\n                }");
            return (f0) newInstance;
        }
    }

    public a(c cVar) {
        C17542s.j(cVar, "preferencesStore");
        this.f46616m = cVar;
    }
}
