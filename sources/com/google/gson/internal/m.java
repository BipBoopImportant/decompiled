package com.google.gson.internal;

import com.google.gson.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;

public class m {

    private static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69160a;

        class a extends b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Method f69161b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f69161b = method;
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f69161b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: com.google.gson.internal.m$b$b  reason: collision with other inner class name */
        class C1188b extends b {
            C1188b() {
                super();
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        static {
            /*
                boolean r0 = com.google.gson.internal.d.c()
                if (r0 == 0) goto L_0x001a
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ NoSuchMethodException -> 0x001a }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x001a }
                com.google.gson.internal.m$b$a r1 = new com.google.gson.internal.m$b$a     // Catch:{ NoSuchMethodException -> 0x001a }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x001a }
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r1 != 0) goto L_0x0022
                com.google.gson.internal.m$b$b r1 = new com.google.gson.internal.m$b$b
                r1.<init>()
            L_0x0022:
                f69160a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.b.<clinit>():void");
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f69160a.a(accessibleObject, obj);
    }

    public static r.a b(List<r> list, Class<?> cls) {
        for (r a10 : list) {
            r.a a11 = a10.a(cls);
            if (a11 != r.a.INDECISIVE) {
                return a11;
            }
        }
        return r.a.ALLOW;
    }
}
