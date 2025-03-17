package V1;

import U0.A1;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"LV1/u;", "", "LU0/A1;", "resolveResult", "next", "<init>", "(LU0/A1;LV1/u;)V", "a", "LU0/A1;", "b", "LV1/u;", "c", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final A1<Object> f14592a;

    /* renamed from: b  reason: collision with root package name */
    private final u f14593b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14594c;

    public u(A1<? extends Object> a12, u uVar) {
        this.f14592a = a12;
        this.f14593b = uVar;
        this.f14594c = a12.getValue();
    }

    public final Typeface a() {
        Object obj = this.f14594c;
        C17542s.h(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f14593b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            U0.A1<java.lang.Object> r0 = r2.f14592a
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.f14594c
            if (r0 != r1) goto L_0x0017
            V1.u r0 = r2.f14593b
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.u.b():boolean");
    }
}
