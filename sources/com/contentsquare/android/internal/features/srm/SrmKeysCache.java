package com.contentsquare.android.internal.features.srm;

import D8.c;
import G8.h;
import G8.t;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.f1;
import XH.C16814e;
import YH.C16877v;
import a9.F;
import dI.C17164e;
import dI.C17168i;
import fK.p;
import jK.E0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

public final class SrmKeysCache {

    /* renamed from: a  reason: collision with root package name */
    public final h f46842a;

    /* renamed from: b  reason: collision with root package name */
    public final t f46843b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46844c = 10;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f46845d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final String f46846e;

    /* renamed from: f  reason: collision with root package name */
    public final String f46847f;

    /* renamed from: g  reason: collision with root package name */
    public int f46848g;

    /* renamed from: h  reason: collision with root package name */
    public final Q f46849h;

    /* renamed from: i  reason: collision with root package name */
    public final c f46850i;

    public SrmKeysCache(h hVar, String str) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(str, "filesLocation");
        t tVar = new t();
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(str, "filesLocation");
        C17542s.j(tVar, "systemInstantiable");
        this.f46842a = hVar;
        this.f46843b = tVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append("srm");
        String sb3 = sb2.toString();
        this.f46846e = sb3;
        this.f46847f = sb3 + str2 + "SrmCachedKeys.json";
        this.f46849h = S.a(f1.b("SrmKeysCache-BackgroundThread"));
        this.f46850i = new c("SrmKeysCache");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.contentsquare.android.internal.features.srm.SrmKeysCache r8) {
        /*
            monitor-enter(r8)
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0031 }
            G8.h r1 = r8.f46842a     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r8.f46847f     // Catch:{ all -> 0x0031 }
            byte[] r1 = r1.p(r2)     // Catch:{ all -> 0x0031 }
            java.nio.charset.Charset r2 = HJ.C15838d.f135279b     // Catch:{ all -> 0x0031 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0031 }
            int r1 = r0.length()     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 != 0) goto L_0x0019
        L_0x0017:
            monitor-exit(r8)
            goto L_0x0048
        L_0x0019:
            kK.c$a r1 = kK.C17514c.f144280d     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            r1.a()     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            jK.f r3 = new jK.f     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            com.contentsquare.android.internal.features.srm.SrmKeysCache$Key$a r4 = com.contentsquare.android.internal.features.srm.SrmKeysCache.Key.Companion     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            r3.<init>(r4)     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            java.lang.Object r0 = r1.c(r3, r0)     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ q -> 0x0035, IllegalArgumentException -> 0x0033 }
            r2 = r0
            goto L_0x0017
        L_0x0031:
            r0 = move-exception
            goto L_0x009a
        L_0x0033:
            r0 = move-exception
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            goto L_0x003f
        L_0x0037:
            D8.c r1 = r8.f46850i     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Failed to parse keys from storage"
        L_0x003b:
            a9.H1.a(r1, r3, r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0044
        L_0x003f:
            D8.c r1 = r8.f46850i     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Failed to parse keys from storage"
            goto L_0x003b
        L_0x0044:
            r8.a()     // Catch:{ all -> 0x0031 }
            goto L_0x0017
        L_0x0048:
            if (r2 == 0) goto L_0x0099
            G8.t r0 = r8.f46843b
            long r0 = r0.a()
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r0 = r0 - r3
            java.util.LinkedHashSet r3 = r8.f46845d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0061:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0078
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.contentsquare.android.internal.features.srm.SrmKeysCache$Key r6 = (com.contentsquare.android.internal.features.srm.SrmKeysCache.Key) r6
            long r6 = r6.f46853b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0061
            r4.add(r5)
            goto L_0x0061
        L_0x0078:
            YH.C16877v.E(r3, r4)
            D8.c r0 = r8.f46850i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Loaded "
            r1.<init>(r2)
            java.util.LinkedHashSet r8 = r8.f46845d
            int r8 = r8.size()
            r1.append(r8)
            java.lang.String r8 = " keys from disk."
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.f(r8)
        L_0x0099:
            return
        L_0x009a:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.srm.SrmKeysCache.b(com.contentsquare.android.internal.features.srm.SrmKeysCache):void");
    }

    public final synchronized void a() {
        c cVar;
        String str;
        try {
            if (this.f46842a.b(this.f46847f)) {
                cVar = this.f46850i;
                str = this.f46847f + " deleted from disk successfully";
            } else {
                cVar = this.f46850i;
                str = this.f46847f + " deletion failed";
            }
            cVar.f(str);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void c(ArrayList arrayList) {
        try {
            C17542s.j(arrayList, "keysToAdd");
            int size = this.f46845d.size();
            LinkedHashSet linkedHashSet = this.f46845d;
            ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Key((String) it.next(), this.f46843b.a()));
            }
            C16877v.E(linkedHashSet, arrayList2);
            c cVar = this.f46850i;
            cVar.f("Added " + arrayList.size() + " new keys.");
            int size2 = (this.f46845d.size() - size) + this.f46848g;
            this.f46848g = size2;
            if (size2 >= this.f46844c) {
                this.f46848g = 0;
                F0 unused = C16314k.d(this.f46849h, (C17168i) null, (T) null, new F(this, (C17164e<? super F>) null), 3, (Object) null);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    @p
    public static final class Key {
        public static final a Companion = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f46852a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46853b;

        public static final class a {
            public final KSerializer<Key> serializer() {
                return SrmKeysCache$Key$$serializer.INSTANCE;
            }
        }

        @C16814e
        public Key(int i10, String str, long j10) {
            if (3 != (i10 & 3)) {
                SrmKeysCache$Key$$serializer.INSTANCE.getClass();
                E0.b(i10, 3, SrmKeysCache$Key$$serializer.f46851a);
            }
            this.f46852a = str;
            this.f46853b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C17542s.e(Key.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C17542s.h(obj, "null cannot be cast to non-null type com.contentsquare.android.internal.features.srm.SrmKeysCache.Key");
            return C17542s.e(this.f46852a, ((Key) obj).f46852a);
        }

        public final int hashCode() {
            return this.f46852a.hashCode();
        }

        public final String toString() {
            return "Key(key=" + this.f46852a + ", additionTime=" + this.f46853b + ')';
        }

        public Key(String str, long j10) {
            C17542s.j(str, "key");
            this.f46852a = str;
            this.f46853b = j10;
        }
    }
}
