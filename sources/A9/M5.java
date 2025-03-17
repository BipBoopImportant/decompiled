package a9;

import D8.c;
import G8.h;
import XH.C16807N;
import android.content.Context;
import com.contentsquare.android.internal.core.telemetry.event.StatisticRecord;
import dI.C17164e;
import java.io.File;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

public final class M5 implements T5<StatisticRecord> {

    /* renamed from: a  reason: collision with root package name */
    public final h f42143a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42144b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42145c = new c("TelemetryStatisticsStorage");

    /* renamed from: d  reason: collision with root package name */
    public final String f42146d;

    /* renamed from: e  reason: collision with root package name */
    public StatisticRecord f42147e;

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryStatisticsStorage", f = "TelemetryStatisticsStorage.kt", l = {80}, m = "fetch")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f42148c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ M5 f42149d;

        /* renamed from: e  reason: collision with root package name */
        public int f42150e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(M5 m52, C17164e<? super a> eVar) {
            super(eVar);
            this.f42149d = m52;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42148c = obj;
            this.f42150e |= Integer.MIN_VALUE;
            return this.f42149d.a(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryStatisticsStorage", f = "TelemetryStatisticsStorage.kt", l = {45}, m = "store")
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public M5 f42151c;

        /* renamed from: d  reason: collision with root package name */
        public StatisticRecord f42152d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f42153e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ M5 f42154f;

        /* renamed from: g  reason: collision with root package name */
        public int f42155g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(M5 m52, C17164e<? super b> eVar) {
            super(eVar);
            this.f42154f = m52;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42153e = obj;
            this.f42155g |= Integer.MIN_VALUE;
            return this.f42154f.b((StatisticRecord) null, this);
        }
    }

    public M5(h hVar, Context context, String str) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(context, "applicationContext");
        C17542s.j(str, "fileName");
        this.f42143a = hVar;
        this.f42144b = str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append("telemetry");
        this.f42146d = sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super com.contentsquare.android.internal.core.telemetry.event.StatisticRecord> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a9.M5.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            a9.M5$a r0 = (a9.M5.a) r0
            int r1 = r0.f42150e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42150e = r1
            goto L_0x0018
        L_0x0013:
            a9.M5$a r0 = new a9.M5$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f42148c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42150e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            XH.y.b(r7)
            goto L_0x00a6
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            XH.y.b(r7)
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r7 = r6.f42147e     // Catch:{ Exception -> 0x0093 }
            if (r7 == 0) goto L_0x003b
            return r7
        L_0x003b:
            G8.h r7 = r6.f42143a     // Catch:{ Exception -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r2.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r6.f42146d     // Catch:{ Exception -> 0x0093 }
            r2.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Exception -> 0x0093 }
            r2.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r6.f42144b     // Catch:{ Exception -> 0x0093 }
            r2.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0093 }
            java.util.List r7 = r7.q(r2)     // Catch:{ Exception -> 0x0093 }
            boolean r2 = r7.isEmpty()     // Catch:{ Exception -> 0x0093 }
            if (r2 != 0) goto L_0x0095
            r2 = 0
            java.lang.Object r5 = r7.get(r2)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0093 }
            java.lang.CharSequence r5 = HJ.C15854t.z1(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0093 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0093 }
            if (r5 <= 0) goto L_0x0095
            kK.c$a r5 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0093 }
            r5.a()     // Catch:{ Exception -> 0x0093 }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r2 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion     // Catch:{ Exception -> 0x0093 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ Exception -> 0x0093 }
            kotlinx.serialization.KSerializer r2 = gK.C17294a.u(r2)     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r7 = r5.c(r2, r7)     // Catch:{ Exception -> 0x0093 }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r7 = (com.contentsquare.android.internal.core.telemetry.event.StatisticRecord) r7     // Catch:{ Exception -> 0x0093 }
            r6.f42147e = r7     // Catch:{ Exception -> 0x0093 }
            r3 = r7
            goto L_0x0095
        L_0x0093:
            r7 = move-exception
            goto L_0x0096
        L_0x0095:
            return r3
        L_0x0096:
            D8.c r2 = r6.f42145c
            java.lang.String r5 = "Failed to decode JSON from file"
            a9.H1.a(r2, r5, r7)
            r0.f42150e = r4
            XH.N r7 = r6.clear()
            if (r7 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.M5.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a9.M5.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a9.M5$b r0 = (a9.M5.b) r0
            int r1 = r0.f42155g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42155g = r1
            goto L_0x0018
        L_0x0013:
            a9.M5$b r0 = new a9.M5$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f42153e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42155g
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r5 = r0.f42152d
            a9.M5 r0 = r0.f42151c
            XH.y.b(r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x0055
        L_0x002d:
            r5 = move-exception
            goto L_0x00ab
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            XH.y.b(r6)
            if (r5 != 0) goto L_0x0043
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0040 }
            return r5
        L_0x0040:
            r5 = move-exception
            r0 = r4
            goto L_0x00ab
        L_0x0043:
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r6 = r4.f42147e     // Catch:{ Exception -> 0x0040 }
            if (r6 != 0) goto L_0x0054
            r0.f42151c = r4     // Catch:{ Exception -> 0x0040 }
            r0.f42152d = r5     // Catch:{ Exception -> 0x0040 }
            r0.f42155g = r3     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r6 = r4.a(r0)     // Catch:{ Exception -> 0x0040 }
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r4
        L_0x0055:
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r6 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r1 = r0.f42147e     // Catch:{ Exception -> 0x002d }
            r6.getClass()     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r5 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.a.a(r5, r1)     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r1 = r0.f42147e     // Catch:{ Exception -> 0x002d }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r5, r1)     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x006b
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x002d }
            return r5
        L_0x006b:
            G8.h r1 = r0.f42143a     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r0.f42146d     // Catch:{ Exception -> 0x002d }
            r1.o(r2)     // Catch:{ Exception -> 0x002d }
            G8.h r1 = r0.f42143a     // Catch:{ Exception -> 0x002d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
            r2.<init>()     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = r0.f42146d     // Catch:{ Exception -> 0x002d }
            r2.append(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x002d }
            r2.append(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = r0.f42144b     // Catch:{ Exception -> 0x002d }
            r2.append(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x002d }
            kK.c$a r3 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x002d }
            r3.a()     // Catch:{ Exception -> 0x002d }
            kotlinx.serialization.KSerializer r6 = r6.serializer()     // Catch:{ Exception -> 0x002d }
            java.lang.String r6 = r3.b(r6, r5)     // Catch:{ Exception -> 0x002d }
            java.nio.charset.Charset r3 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x002d }
            byte[] r6 = r6.getBytes(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C17542s.i(r6, r3)     // Catch:{ Exception -> 0x002d }
            r3 = 0
            r1.s(r2, r6, r3)     // Catch:{ Exception -> 0x002d }
            r0.f42147e = r5     // Catch:{ Exception -> 0x002d }
            goto L_0x00b2
        L_0x00ab:
            D8.c r6 = r0.f42145c
            java.lang.String r0 = "Failed to store Telemetry statistics event to file"
            a9.H1.a(r6, r0, r5)
        L_0x00b2:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.M5.b(com.contentsquare.android.internal.core.telemetry.event.StatisticRecord, dI.e):java.lang.Object");
    }

    public final C16807N clear() {
        try {
            this.f42147e = null;
            h hVar = this.f42143a;
            hVar.b(this.f42146d + File.separator + this.f42144b);
        } catch (Exception e10) {
            c cVar = this.f42145c;
            StringBuilder sb2 = new StringBuilder("Failed to delete file from path:");
            sb2.append(this.f42146d + File.separator + this.f42144b);
            H1.a(cVar, sb2.toString(), e10);
        }
        return C16807N.f139792a;
    }
}
