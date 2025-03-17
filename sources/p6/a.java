package P6;

import M6.d;
import M6.g;
import M6.k;
import M6.o;
import M6.w;
import Q6.f;
import XH.C16816g;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0013\u0010\u000e\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LP6/a;", "", "<init>", "()V", "LQ6/f;", "", "LM6/o;", "e", "(LQ6/f;)Ljava/util/List;", "b", "(LQ6/f;)LM6/o;", "f", "LM6/o$a;", "d", "c", "(LQ6/f;)LM6/o$a;", "LM6/w$a;", "D", "jsonReader", "LM6/w;", "operation", "LM6/k;", "customScalarAdapters", "LM6/g;", "a", "(LQ6/f;LM6/w;LM6/k;)LM6/g;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39384a = new a();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: P6.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0622a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39385a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Q6.f$a[] r0 = Q6.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Q6.f$a r1 = Q6.f.a.NUMBER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Q6.f$a r1 = Q6.f.a.LONG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f39385a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P6.a.C0622a.<clinit>():void");
        }
    }

    private a() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final M6.o b(Q6.f r10) {
        /*
            r9 = this;
            r10.C()
            java.lang.String r0 = ""
            r1 = 0
            r3 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = r10.B0()
            int r8 = r2.hashCode()
            switch(r8) {
                case -1809421292: goto L_0x004b;
                case -1197189282: goto L_0x003d;
                case 3433509: goto L_0x002f;
                case 954925063: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0053
        L_0x001d:
            java.lang.String r8 = "message"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x0053
            java.lang.String r2 = r10.C1()
            if (r2 != 0) goto L_0x002d
            r3 = r0
            goto L_0x000b
        L_0x002d:
            r3 = r2
            goto L_0x000b
        L_0x002f:
            java.lang.String r8 = "path"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0038
            goto L_0x0053
        L_0x0038:
            java.util.List r5 = r9.f(r10)
            goto L_0x000b
        L_0x003d:
            java.lang.String r8 = "locations"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            java.util.List r4 = r9.d(r10)
            goto L_0x000b
        L_0x004b:
            java.lang.String r8 = "extensions"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0062
        L_0x0053:
            if (r7 != 0) goto L_0x005a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
        L_0x005a:
            java.lang.Object r8 = Q6.a.d(r10)
            r7.put(r2, r8)
            goto L_0x000b
        L_0x0062:
            java.lang.Object r2 = Q6.a.d(r10)
            boolean r6 = r2 instanceof java.util.Map
            if (r6 == 0) goto L_0x006e
            java.util.Map r2 = (java.util.Map) r2
            r6 = r2
            goto L_0x000b
        L_0x006e:
            r6 = r1
            goto L_0x000b
        L_0x0070:
            r10.K()
            M6.o r10 = new M6.o
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: P6.a.b(Q6.f):M6.o");
    }

    private final o.a c(f fVar) {
        fVar.C();
        int i10 = -1;
        int i11 = -1;
        while (fVar.hasNext()) {
            String B02 = fVar.B0();
            if (C17542s.e(B02, "line")) {
                i10 = fVar.G0();
            } else if (C17542s.e(B02, "column")) {
                i11 = fVar.G0();
            } else {
                fVar.a0();
            }
        }
        fVar.K();
        return new o.a(i10, i11);
    }

    private final List<o.a> d(f fVar) {
        if (fVar.O() == f.a.NULL) {
            return (List) fVar.v2();
        }
        ArrayList arrayList = new ArrayList();
        fVar.G();
        while (fVar.hasNext()) {
            arrayList.add(c(fVar));
        }
        fVar.E();
        return arrayList;
    }

    private final List<o> e(f fVar) {
        if (fVar.O() == f.a.NULL) {
            fVar.v2();
            return C16877v.n();
        }
        fVar.G();
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(b(fVar));
        }
        fVar.E();
        return arrayList;
    }

    private final List<Object> f(f fVar) {
        if (fVar.O() == f.a.NULL) {
            return (List) fVar.v2();
        }
        ArrayList arrayList = new ArrayList();
        fVar.G();
        while (fVar.hasNext()) {
            int i10 = C0622a.f39385a[fVar.O().ordinal()];
            if (i10 == 1 || i10 == 2) {
                arrayList.add(Integer.valueOf(fVar.G0()));
            } else {
                String C12 = fVar.C1();
                C17542s.g(C12);
                arrayList.add(C12);
            }
        }
        fVar.E();
        return arrayList;
    }

    public final <D extends w.a> g<D> a(f fVar, w<D> wVar, k kVar) {
        g<D> gVar;
        C17542s.j(fVar, "jsonReader");
        C17542s.j(wVar, "operation");
        C17542s.j(kVar, "customScalarAdapters");
        Throwable th2 = null;
        try {
            fVar.C();
            w.a aVar = null;
            List<o> list = null;
            Map map = null;
            while (fVar.hasNext()) {
                String B02 = fVar.B0();
                int hashCode = B02.hashCode();
                if (hashCode != -1809421292) {
                    if (hashCode != -1294635157) {
                        if (hashCode == 3076010) {
                            if (B02.equals("data")) {
                                aVar = (w.a) d.b(wVar.b()).a(fVar, kVar);
                            }
                        }
                    } else if (B02.equals("errors")) {
                        list = f39384a.e(fVar);
                    }
                } else if (B02.equals("extensions")) {
                    Object d10 = Q6.a.d(fVar);
                    map = d10 instanceof Map ? (Map) d10 : null;
                }
                fVar.a0();
            }
            fVar.K();
            UUID randomUUID = UUID.randomUUID();
            C17542s.i(randomUUID, "randomUUID()");
            gVar = new g.a(wVar, randomUUID, aVar).c(list).d(map).b();
        } catch (Throwable th3) {
            th2 = th3;
            gVar = null;
        }
        try {
            fVar.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            } else {
                C16816g.a(th2, th4);
            }
        }
        if (th2 == null) {
            C17542s.g(gVar);
            return gVar;
        }
        throw th2;
    }
}
