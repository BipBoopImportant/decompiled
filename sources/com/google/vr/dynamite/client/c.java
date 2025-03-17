package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f69436a;

    /* renamed from: b  reason: collision with root package name */
    private ILoadedInstanceCreator f69437b;

    /* renamed from: c  reason: collision with root package name */
    private final d f69438c;

    public c(d dVar) {
        this.f69438c = dVar;
    }

    private static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e11);
        } catch (ClassNotFoundException e12) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e12);
        } catch (InstantiationException e13) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e13);
        } catch (IllegalAccessException e14) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e14);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.vr.dynamite.client.ILoadedInstanceCreator a(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r0 = r2.f69437b     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x002d
            android.content.Context r3 = r2.b(r3)     // Catch:{ all -> 0x0023 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ all -> 0x0023 }
            android.os.IBinder r3 = c(r3)     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0015
            r3 = 0
            goto L_0x002b
        L_0x0015:
            java.lang.String r0 = "com.google.vr.dynamite.client.ILoadedInstanceCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)     // Catch:{ all -> 0x0023 }
            boolean r1 = r0 instanceof com.google.vr.dynamite.client.ILoadedInstanceCreator     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0025
            r3 = r0
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = (com.google.vr.dynamite.client.ILoadedInstanceCreator) r3     // Catch:{ all -> 0x0023 }
            goto L_0x002b
        L_0x0023:
            r3 = move-exception
            goto L_0x0031
        L_0x0025:
            com.google.vr.dynamite.client.a r0 = new com.google.vr.dynamite.client.a     // Catch:{ all -> 0x0023 }
            r0.<init>(r3)     // Catch:{ all -> 0x0023 }
            r3 = r0
        L_0x002b:
            r2.f69437b = r3     // Catch:{ all -> 0x0023 }
        L_0x002d:
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = r2.f69437b     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.dynamite.client.c.a(android.content.Context):com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context b(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f69436a     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x001b
            com.google.vr.dynamite.client.d r0 = r2.f69438c     // Catch:{ NameNotFoundException -> 0x0015 }
            java.lang.String r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x0015 }
            r1 = 3
            android.content.Context r3 = r3.createPackageContext(r0, r1)     // Catch:{ NameNotFoundException -> 0x0015 }
            r2.f69436a = r3     // Catch:{ NameNotFoundException -> 0x0015 }
            goto L_0x001b
        L_0x0013:
            r3 = move-exception
            goto L_0x001f
        L_0x0015:
            kd.b r3 = new kd.b     // Catch:{ all -> 0x0013 }
            r3.<init>()     // Catch:{ all -> 0x0013 }
            throw r3     // Catch:{ all -> 0x0013 }
        L_0x001b:
            android.content.Context r3 = r2.f69436a     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.dynamite.client.c.b(android.content.Context):android.content.Context");
    }
}
