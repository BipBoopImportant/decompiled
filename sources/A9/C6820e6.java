package a9;

import D8.c;
import G8.h;
import XH.C16807N;
import android.content.Context;
import com.contentsquare.android.internal.core.telemetry.event.StatisticRecord;
import dI.C17164e;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.e6  reason: case insensitive filesystem */
public final class C6820e6 implements T5<Map<String, ? extends StatisticRecord>> {

    /* renamed from: a  reason: collision with root package name */
    public final h f42530a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42531b = new c("TelemetryTimeStorage");

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f42532c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f42533d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42534e;

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryTimeStorage", f = "TelemetryTimeStorage.kt", l = {63}, m = "fetch")
    /* renamed from: a9.e6$a */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f42535c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C6820e6 f42536d;

        /* renamed from: e  reason: collision with root package name */
        public int f42537e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6820e6 e6Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f42536d = e6Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42535c = obj;
            this.f42537e |= Integer.MIN_VALUE;
            return this.f42536d.a(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryTimeStorage", f = "TelemetryTimeStorage.kt", l = {31}, m = "store")
    /* renamed from: a9.e6$b */
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public C6820e6 f42538c;

        /* renamed from: d  reason: collision with root package name */
        public Map f42539d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f42540e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C6820e6 f42541f;

        /* renamed from: g  reason: collision with root package name */
        public int f42542g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6820e6 e6Var, C17164e<? super b> eVar) {
            super(eVar);
            this.f42541f = e6Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42540e = obj;
            this.f42542g |= Integer.MIN_VALUE;
            return this.f42541f.b((Map<String, StatisticRecord>) null, this);
        }
    }

    public C6820e6(Context context, h hVar) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(context, "applicationContext");
        this.f42530a = hVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("cs");
        sb2.append(str);
        sb2.append("telemetry");
        String sb3 = sb2.toString();
        this.f42533d = sb3;
        this.f42534e = sb3 + str + "time";
    }

    public static void d(LinkedHashMap linkedHashMap, Map map) {
        C16807N n10;
        for (Map.Entry entry : map.entrySet()) {
            StatisticRecord statisticRecord = (StatisticRecord) linkedHashMap.get(entry.getKey());
            if (statisticRecord != null) {
                Object key = entry.getKey();
                StatisticRecord.Companion.getClass();
                linkedHashMap.put(key, StatisticRecord.a.a((StatisticRecord) entry.getValue(), statisticRecord));
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super java.util.Map<java.lang.String, com.contentsquare.android.internal.core.telemetry.event.StatisticRecord>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a9.C6820e6.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a9.e6$a r0 = (a9.C6820e6.a) r0
            int r1 = r0.f42537e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42537e = r1
            goto L_0x0018
        L_0x0013:
            a9.e6$a r0 = new a9.e6$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f42535c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42537e
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            XH.y.b(r8)
            goto L_0x00a0
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            XH.y.b(r8)
            java.util.LinkedHashMap r8 = r7.f42532c     // Catch:{ Exception -> 0x0040 }
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x0040 }
            if (r8 != 0) goto L_0x0042
            java.util.LinkedHashMap r8 = r7.f42532c     // Catch:{ Exception -> 0x0040 }
            return r8
        L_0x0040:
            r8 = move-exception
            goto L_0x0090
        L_0x0042:
            G8.h r8 = r7.f42530a     // Catch:{ Exception -> 0x0040 }
            java.lang.String r2 = r7.f42534e     // Catch:{ Exception -> 0x0040 }
            java.util.List r8 = r8.q(r2)     // Catch:{ Exception -> 0x0040 }
            boolean r2 = r8.isEmpty()     // Catch:{ Exception -> 0x0040 }
            if (r2 != 0) goto L_0x008b
            r2 = 0
            java.lang.Object r4 = r8.get(r2)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0040 }
            java.lang.CharSequence r4 = HJ.C15854t.z1(r4)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0040 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0040 }
            if (r4 <= 0) goto L_0x008b
            kK.c$a r4 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r8 = r8.get(r2)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0040 }
            r4.a()     // Catch:{ Exception -> 0x0040 }
            jK.c0 r2 = new jK.c0     // Catch:{ Exception -> 0x0040 }
            jK.Y0 r5 = jK.Y0.f144077a     // Catch:{ Exception -> 0x0040 }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r6 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion     // Catch:{ Exception -> 0x0040 }
            kotlinx.serialization.KSerializer r6 = r6.serializer()     // Catch:{ Exception -> 0x0040 }
            r2.<init>(r5, r6)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r8 = r4.c(r2, r8)     // Catch:{ Exception -> 0x0040 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ Exception -> 0x0040 }
            java.util.LinkedHashMap r2 = r7.f42532c     // Catch:{ Exception -> 0x0040 }
            r2.putAll(r8)     // Catch:{ Exception -> 0x0040 }
            java.util.LinkedHashMap r8 = r7.f42532c     // Catch:{ Exception -> 0x0040 }
            goto L_0x008f
        L_0x008b:
            java.util.Map r8 = YH.X.j()     // Catch:{ Exception -> 0x0040 }
        L_0x008f:
            return r8
        L_0x0090:
            D8.c r2 = r7.f42531b
            java.lang.String r4 = "Failed to decode JSON from file"
            a9.H1.a(r2, r4, r8)
            r0.f42537e = r3
            XH.N r8 = r7.clear()
            if (r8 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            java.util.Map r8 = YH.X.j()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6820e6.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.Map<java.lang.String, com.contentsquare.android.internal.core.telemetry.event.StatisticRecord> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a9.C6820e6.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a9.e6$b r0 = (a9.C6820e6.b) r0
            int r1 = r0.f42542g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42542g = r1
            goto L_0x0018
        L_0x0013:
            a9.e6$b r0 = new a9.e6$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f42540e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42542g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.util.Map r5 = r0.f42539d
            a9.e6 r0 = r0.f42538c
            XH.y.b(r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x005c
        L_0x002d:
            r5 = move-exception
            goto L_0x008d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            XH.y.b(r6)
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0043 }
            if (r6 == 0) goto L_0x0046
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0043 }
            return r5
        L_0x0043:
            r5 = move-exception
            r0 = r4
            goto L_0x008d
        L_0x0046:
            java.util.LinkedHashMap r6 = r4.f42532c     // Catch:{ Exception -> 0x0043 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0043 }
            if (r6 == 0) goto L_0x005b
            r0.f42538c = r4     // Catch:{ Exception -> 0x0043 }
            r0.f42539d = r5     // Catch:{ Exception -> 0x0043 }
            r0.f42542g = r3     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r6 = r4.a(r0)     // Catch:{ Exception -> 0x0043 }
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r0 = r4
        L_0x005c:
            java.util.LinkedHashMap r6 = r0.f42532c     // Catch:{ Exception -> 0x002d }
            d(r6, r5)     // Catch:{ Exception -> 0x002d }
            G8.h r5 = r0.f42530a     // Catch:{ Exception -> 0x002d }
            java.lang.String r6 = r0.f42533d     // Catch:{ Exception -> 0x002d }
            r5.o(r6)     // Catch:{ Exception -> 0x002d }
            kK.c$a r5 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x002d }
            java.util.LinkedHashMap r6 = r0.f42532c     // Catch:{ Exception -> 0x002d }
            r5.a()     // Catch:{ Exception -> 0x002d }
            jK.c0 r1 = new jK.c0     // Catch:{ Exception -> 0x002d }
            jK.Y0 r2 = jK.Y0.f144077a     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r3 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion     // Catch:{ Exception -> 0x002d }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ Exception -> 0x002d }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x002d }
            java.lang.String r5 = r5.b(r1, r6)     // Catch:{ Exception -> 0x002d }
            G8.h r6 = r0.f42530a     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r0.f42534e     // Catch:{ Exception -> 0x002d }
            byte[] r5 = HJ.C15854t.E(r5)     // Catch:{ Exception -> 0x002d }
            r2 = 0
            r6.s(r1, r5, r2)     // Catch:{ Exception -> 0x002d }
            goto L_0x0094
        L_0x008d:
            D8.c r6 = r0.f42531b
            java.lang.String r0 = "Failed to store Telemetry time event to file"
            a9.H1.a(r6, r0, r5)
        L_0x0094:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6820e6.b(java.util.Map, dI.e):java.lang.Object");
    }

    public final C16807N clear() {
        try {
            this.f42532c.clear();
            this.f42530a.b(this.f42534e);
        } catch (Exception e10) {
            c cVar = this.f42531b;
            H1.a(cVar, "Failed to delete file from path:" + this.f42534e, e10);
        }
        return C16807N.f139792a;
    }
}
