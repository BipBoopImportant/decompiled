package jK;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import nI.p;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LjK/z;", "T", "LjK/B0;", "Lkotlin/Function2;", "LuI/d;", "", "", "LuI/q;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(LnI/p;)V", "key", "types", "LXH/x;", "a", "(LuI/d;Ljava/util/List;)Ljava/lang/Object;", "LnI/p;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "LjK/A0;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.z  reason: case insensitive filesystem */
final class C17490z<T> implements B0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<C18055d<Object>, List<? extends C18068q>, KSerializer<T>> f144186a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, A0<T>> f144187b = new ConcurrentHashMap<>();

    public C17490z(p<? super C18055d<Object>, ? super List<? extends C18068q>, ? extends KSerializer<T>> pVar) {
        C17542s.j(pVar, "compute");
        this.f144186a = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r2 = new jK.A0<>();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(uI.C18055d<java.lang.Object> r6, java.util.List<? extends uI.C18068q> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "types"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, jK.A0<T>> r0 = r5.f144187b
            java.lang.Class r1 = mI.C17603a.b(r6)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x0023
            jK.A0 r2 = new jK.A0
            r2.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            if (r0 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            jK.A0 r2 = (jK.A0) r2
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r0.next()
            uI.q r3 = (uI.C18068q) r3
            jK.Z r4 = new jK.Z
            r4.<init>(r3)
            r1.add(r4)
            goto L_0x0037
        L_0x004c:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f144008a
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x007d
            XH.x$a r2 = XH.x.f139812b     // Catch:{ all -> 0x0065 }
            nI.p<uI.d<java.lang.Object>, java.util.List<? extends uI.q>, kotlinx.serialization.KSerializer<T>> r2 = r5.f144186a     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = r2.invoke(r6, r7)     // Catch:{ all -> 0x0065 }
            kotlinx.serialization.KSerializer r6 = (kotlinx.serialization.KSerializer) r6     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0070
        L_0x0065:
            r6 = move-exception
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0070:
            XH.x r6 = XH.x.a(r6)
            java.lang.Object r7 = r0.putIfAbsent(r1, r6)
            if (r7 != 0) goto L_0x007c
            r2 = r6
            goto L_0x007d
        L_0x007c:
            r2 = r7
        L_0x007d:
            java.lang.String r6 = "getOrPut(...)"
            kotlin.jvm.internal.C17542s.i(r2, r6)
            XH.x r2 = (XH.x) r2
            java.lang.Object r6 = r2.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.C17490z.a(uI.d, java.util.List):java.lang.Object");
    }
}
