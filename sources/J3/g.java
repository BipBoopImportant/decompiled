package j3;

import U0.I0;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\b"}, d2 = {"LU0/I0;", "Landroidx/lifecycle/y;", "a", "LU0/I0;", "()LU0/I0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5221y> f24866a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/y;", "b", "()Landroidx/lifecycle/y;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C5221y> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f24867c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5221y invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r1 = null;
     */
    static {
        /*
            r0 = 0
            XH.x$a r1 = XH.x.f139812b     // Catch:{ all -> 0x002b }
            java.lang.Class<androidx.lifecycle.y> r1 = androidx.lifecycle.C5221y.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ all -> 0x002b }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch:{ all -> 0x002b }
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch:{ all -> 0x002b }
            int r3 = r2.length     // Catch:{ all -> 0x002b }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x002d
            r5 = r2[r4]     // Catch:{ all -> 0x002b }
            boolean r5 = r5 instanceof XH.C16814e     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x0028
        L_0x0026:
            r1 = r0
            goto L_0x0037
        L_0x0028:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002b:
            r1 = move-exception
            goto L_0x003c
        L_0x002d:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch:{ all -> 0x002b }
            boolean r2 = r1 instanceof U0.I0     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0026
            U0.I0 r1 = (U0.I0) r1     // Catch:{ all -> 0x002b }
        L_0x0037:
            java.lang.Object r1 = XH.x.b(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0046
        L_0x003c:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
        L_0x0046:
            boolean r2 = XH.x.g(r1)
            if (r2 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            U0.I0 r0 = (U0.I0) r0
            if (r0 != 0) goto L_0x0058
            j3.g$a r0 = j3.g.a.f24867c
            U0.I0 r0 = U0.C4910x.f(r0)
        L_0x0058:
            f24866a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.<clinit>():void");
    }

    public static final I0<C5221y> a() {
        return f24866a;
    }
}
