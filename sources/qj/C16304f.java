package QJ;

import YH.C16877v;
import dI.C17164e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H@¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\n0\u0007H@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"T", "", "LQJ/Y;", "deferreds", "", "b", "([LQJ/Y;LdI/e;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;LdI/e;)Ljava/lang/Object;", "LQJ/F0;", "LXH/N;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.f  reason: case insensitive filesystem */
public final class C16304f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
    /* renamed from: QJ.f$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f137626c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f137627d;

        /* renamed from: e  reason: collision with root package name */
        int f137628e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f137627d = obj;
            this.f137628e |= Integer.MIN_VALUE;
            return C16304f.c((Collection<? extends F0>) null, this);
        }
    }

    public static final <T> Object a(Collection<? extends Y<? extends T>> collection, C17164e<? super List<? extends T>> eVar) {
        return collection.isEmpty() ? C16877v.n() : new C16302e((Y[]) collection.toArray(new Y[0])).c(eVar);
    }

    public static final <T> Object b(Y<? extends T>[] yArr, C17164e<? super List<? extends T>> eVar) {
        return yArr.length == 0 ? C16877v.n() : new C16302e(yArr).c(eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(java.util.Collection<? extends QJ.F0> r4, dI.C17164e<? super XH.C16807N> r5) {
        /*
            boolean r0 = r5 instanceof QJ.C16304f.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            QJ.f$a r0 = (QJ.C16304f.a) r0
            int r1 = r0.f137628e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f137628e = r1
            goto L_0x0018
        L_0x0013:
            QJ.f$a r0 = new QJ.f$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f137627d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f137628e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f137626c
            java.util.Iterator r4 = (java.util.Iterator) r4
            XH.y.b(r5)
            goto L_0x003e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            XH.y.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r4.next()
            QJ.F0 r5 = (QJ.F0) r5
            r0.f137626c = r4
            r0.f137628e = r3
            java.lang.Object r5 = r5.j0(r0)
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x0055:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.C16304f.c(java.util.Collection, dI.e):java.lang.Object");
    }
}
