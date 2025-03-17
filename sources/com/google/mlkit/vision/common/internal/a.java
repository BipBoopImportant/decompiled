package com.google.mlkit.vision.common.internal;

import K9.C6620s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mc.C10036b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f69187a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a  reason: collision with other inner class name */
    public static class C1191a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f69188a;

        /* renamed from: b  reason: collision with root package name */
        private final C10036b f69189b;

        /* renamed from: c  reason: collision with root package name */
        private final int f69190c;

        /* access modifiers changed from: package-private */
        public final int a() {
            return this.f69190c;
        }

        /* access modifiers changed from: package-private */
        public final C10036b b() {
            return this.f69189b;
        }

        /* access modifiers changed from: package-private */
        public final Class c() {
            return this.f69188a;
        }
    }

    a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1191a aVar = (C1191a) it.next();
            Class c10 = aVar.c();
            if (!this.f69187a.containsKey(c10) || aVar.a() >= ((Integer) C6620s.l((Integer) hashMap.get(c10))).intValue()) {
                this.f69187a.put(c10, aVar.b());
                hashMap.put(c10, Integer.valueOf(aVar.a()));
            }
        }
    }
}
