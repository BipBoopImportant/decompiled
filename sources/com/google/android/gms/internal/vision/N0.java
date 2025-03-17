package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class N0<T extends C0> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f49231a = Logger.getLogger(C7547x0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f49232b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    N0() {
    }

    static <T extends C0> T b(Class<T> cls) {
        String str;
        Class<N0> cls2 = N0.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C0.class)) {
            str = f49232b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C0) cls.cast(((N0) Class.forName(str, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null)).a());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((N0) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = f49231a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C0) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();
}
