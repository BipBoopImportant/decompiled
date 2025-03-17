package T5;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0004¨\u0006\f"}, d2 = {"LT5/C;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "LT5/r;", "a", "(Landroid/content/Context;)LT5/r;", "c", "reference", "coil_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f40011a = new C();

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReference f40012b = new AtomicReference((Object) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LT5/C$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "LT5/r;", "a", "(Landroid/content/Context;)LT5/r;", "coil_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        r a(Context context);
    }

    private C() {
    }

    public static final r a(Context context) {
        C c10 = f40011a;
        Object obj = c10.b().get();
        r rVar = obj instanceof r ? (r) obj : null;
        return rVar == null ? c10.c(context) : rVar;
    }

    private final /* synthetic */ AtomicReference b() {
        return f40012b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: T5.C$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: T5.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final T5.r c(android.content.Context r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r6.b()
            r1 = 0
            r2 = r1
        L_0x0006:
            java.lang.Object r3 = r0.get()
            boolean r4 = r3 instanceof T5.r
            if (r4 == 0) goto L_0x0015
            r4 = r3
            T5.r r4 = (T5.r) r4
            r5 = r4
            r4 = r2
            r2 = r5
            goto L_0x003c
        L_0x0015:
            if (r2 != 0) goto L_0x003b
            boolean r2 = r3 instanceof T5.C.a
            if (r2 == 0) goto L_0x001f
            r2 = r3
            T5.C$a r2 = (T5.C.a) r2
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0028
            T5.r r2 = r2.a(r7)
            if (r2 != 0) goto L_0x003b
        L_0x0028:
            T5.C$a r2 = T5.F.a(r7)
            if (r2 == 0) goto L_0x0033
            T5.r r2 = r2.a(r7)
            goto L_0x003b
        L_0x0033:
            T5.C$a r2 = T5.E.f40013a
            T5.r r2 = r2.a(r7)
        L_0x003b:
            r4 = r2
        L_0x003c:
            boolean r3 = d0.i.a(r0, r3, r2)
            if (r3 == 0) goto L_0x0048
            java.lang.String r7 = "null cannot be cast to non-null type coil3.ImageLoader"
            kotlin.jvm.internal.C17542s.h(r2, r7)
            return r2
        L_0x0048:
            r2 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.C.c(android.content.Context):T5.r");
    }
}
