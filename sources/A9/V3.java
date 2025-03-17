package a9;

import D8.c;
import G8.h;
import XH.C16807N;
import android.content.Context;
import dI.C17164e;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

public final class V3 implements T5<List<? extends com.contentsquare.android.internal.core.telemetry.event.a>> {

    /* renamed from: a  reason: collision with root package name */
    public final h f42340a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42341b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42342c = new c("TelemetryEventStorage");

    /* renamed from: d  reason: collision with root package name */
    public final String f42343d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f42344e;

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryEventStorage", f = "TelemetryEventStorage.kt", l = {85}, m = "fetch")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f42345c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ V3 f42346d;

        /* renamed from: e  reason: collision with root package name */
        public int f42347e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(V3 v32, C17164e<? super a> eVar) {
            super(eVar);
            this.f42346d = v32;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42345c = obj;
            this.f42347e |= Integer.MIN_VALUE;
            return this.f42346d.a(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.storage.TelemetryEventStorage", f = "TelemetryEventStorage.kt", l = {46}, m = "store")
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public V3 f42348c;

        /* renamed from: d  reason: collision with root package name */
        public List f42349d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f42350e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ V3 f42351f;

        /* renamed from: g  reason: collision with root package name */
        public int f42352g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(V3 v32, C17164e<? super b> eVar) {
            super(eVar);
            this.f42351f = v32;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42350e = obj;
            this.f42352g |= Integer.MIN_VALUE;
            return this.f42351f.b((List<? extends com.contentsquare.android.internal.core.telemetry.event.a>) null, this);
        }
    }

    public V3(h hVar, Context context, String str) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        this.f42340a = hVar;
        this.f42341b = str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append("telemetry");
        this.f42343d = sb2.toString();
        this.f42344e = new LinkedHashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super java.util.List<? extends com.contentsquare.android.internal.core.telemetry.event.a>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a9.V3.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a9.V3$a r0 = (a9.V3.a) r0
            int r1 = r0.f42347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42347e = r1
            goto L_0x0018
        L_0x0013:
            a9.V3$a r0 = new a9.V3$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f42345c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42347e
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            XH.y.b(r8)
            goto L_0x00cb
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            XH.y.b(r8)
            java.util.LinkedHashMap r8 = r7.f42344e     // Catch:{ Exception -> 0x0048 }
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x0048 }
            if (r8 != 0) goto L_0x004a
            java.util.LinkedHashMap r8 = r7.f42344e     // Catch:{ Exception -> 0x0048 }
            java.util.Collection r8 = r8.values()     // Catch:{ Exception -> 0x0048 }
            java.util.List r8 = YH.C16877v.t1(r8)     // Catch:{ Exception -> 0x0048 }
            return r8
        L_0x0048:
            r8 = move-exception
            goto L_0x00bb
        L_0x004a:
            G8.h r8 = r7.f42340a     // Catch:{ Exception -> 0x0048 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0048 }
            r2.<init>()     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = r7.f42343d     // Catch:{ Exception -> 0x0048 }
            r2.append(r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x0048 }
            r2.append(r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = r7.f42341b     // Catch:{ Exception -> 0x0048 }
            r2.append(r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0048 }
            java.util.List r8 = r8.q(r2)     // Catch:{ Exception -> 0x0048 }
            boolean r2 = r8.isEmpty()     // Catch:{ Exception -> 0x0048 }
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0048 }
            java.lang.CharSequence r8 = HJ.C15854t.z1(r8)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0048 }
            int r2 = r8.length()     // Catch:{ Exception -> 0x0048 }
            if (r2 <= 0) goto L_0x00b6
            kK.c$a r2 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x0048 }
            r2.a()     // Catch:{ Exception -> 0x0048 }
            jK.f r4 = new jK.f     // Catch:{ Exception -> 0x0048 }
            com.contentsquare.android.internal.core.telemetry.event.a$a r5 = com.contentsquare.android.internal.core.telemetry.event.a.Companion     // Catch:{ Exception -> 0x0048 }
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch:{ Exception -> 0x0048 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r8 = r2.c(r4, r8)     // Catch:{ Exception -> 0x0048 }
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ Exception -> 0x0048 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ Exception -> 0x0048 }
        L_0x009d:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x0048 }
            com.contentsquare.android.internal.core.telemetry.event.a r4 = (com.contentsquare.android.internal.core.telemetry.event.a) r4     // Catch:{ Exception -> 0x0048 }
            java.util.LinkedHashMap r5 = r7.f42344e     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = r4.getKey()     // Catch:{ Exception -> 0x0048 }
            r5.put(r6, r4)     // Catch:{ Exception -> 0x0048 }
            goto L_0x009d
        L_0x00b3:
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x0048 }
            goto L_0x00ba
        L_0x00b6:
            java.util.List r8 = YH.C16877v.n()     // Catch:{ Exception -> 0x0048 }
        L_0x00ba:
            return r8
        L_0x00bb:
            D8.c r2 = r7.f42342c
            java.lang.String r4 = "Failed to decode JSON from file"
            a9.H1.a(r2, r4, r8)
            r0.f42347e = r3
            XH.N r8 = r7.clear()
            if (r8 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            java.util.List r8 = YH.C16877v.n()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.V3.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.List<? extends com.contentsquare.android.internal.core.telemetry.event.a> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a9.V3.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a9.V3$b r0 = (a9.V3.b) r0
            int r1 = r0.f42352g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42352g = r1
            goto L_0x0018
        L_0x0013:
            a9.V3$b r0 = new a9.V3$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f42350e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42352g
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.util.List r5 = r0.f42349d
            a9.V3 r0 = r0.f42348c
            XH.y.b(r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x005e
        L_0x002d:
            r5 = move-exception
            goto L_0x00e8
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            XH.y.b(r6)
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0044 }
            if (r6 == 0) goto L_0x0048
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0044 }
            return r5
        L_0x0044:
            r5 = move-exception
            r0 = r4
            goto L_0x00e8
        L_0x0048:
            java.util.LinkedHashMap r6 = r4.f42344e     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0044 }
            if (r6 == 0) goto L_0x005d
            r0.f42348c = r4     // Catch:{ Exception -> 0x0044 }
            r0.f42349d = r5     // Catch:{ Exception -> 0x0044 }
            r0.f42352g = r3     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r6 = r4.a(r0)     // Catch:{ Exception -> 0x0044 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r4
        L_0x005e:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x002d }
        L_0x0062:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x002d }
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.a r6 = (com.contentsquare.android.internal.core.telemetry.event.a) r6     // Catch:{ Exception -> 0x002d }
            java.util.LinkedHashMap r1 = r0.f42344e     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r6.getKey()     // Catch:{ Exception -> 0x002d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.a r1 = (com.contentsquare.android.internal.core.telemetry.event.a) r1     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x008c
            java.util.LinkedHashMap r2 = r0.f42344e     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = r6.getKey()     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.a r1 = r1.b(r6)     // Catch:{ Exception -> 0x002d }
            r2.put(r3, r1)     // Catch:{ Exception -> 0x002d }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x002d }
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 != 0) goto L_0x0062
            java.util.LinkedHashMap r1 = r0.f42344e     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r6.getKey()     // Catch:{ Exception -> 0x002d }
            r1.put(r2, r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x0062
        L_0x0099:
            G8.h r5 = r0.f42340a     // Catch:{ Exception -> 0x002d }
            java.lang.String r6 = r0.f42343d     // Catch:{ Exception -> 0x002d }
            r5.o(r6)     // Catch:{ Exception -> 0x002d }
            kK.c$a r5 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x002d }
            java.util.LinkedHashMap r6 = r0.f42344e     // Catch:{ Exception -> 0x002d }
            java.util.Collection r6 = r6.values()     // Catch:{ Exception -> 0x002d }
            java.util.List r6 = YH.C16877v.t1(r6)     // Catch:{ Exception -> 0x002d }
            r5.a()     // Catch:{ Exception -> 0x002d }
            jK.f r1 = new jK.f     // Catch:{ Exception -> 0x002d }
            com.contentsquare.android.internal.core.telemetry.event.a$a r2 = com.contentsquare.android.internal.core.telemetry.event.a.Companion     // Catch:{ Exception -> 0x002d }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ Exception -> 0x002d }
            r1.<init>(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r5 = r5.b(r1, r6)     // Catch:{ Exception -> 0x002d }
            G8.h r6 = r0.f42340a     // Catch:{ Exception -> 0x002d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r0.f42343d     // Catch:{ Exception -> 0x002d }
            r1.append(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x002d }
            r1.append(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = r0.f42341b     // Catch:{ Exception -> 0x002d }
            r1.append(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x002d }
            java.nio.charset.Charset r2 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x002d }
            byte[] r5 = r5.getBytes(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C17542s.i(r5, r2)     // Catch:{ Exception -> 0x002d }
            r2 = 0
            r6.s(r1, r5, r2)     // Catch:{ Exception -> 0x002d }
            goto L_0x00ef
        L_0x00e8:
            D8.c r6 = r0.f42342c
            java.lang.String r0 = "Failed to store Telemetry event to file"
            a9.H1.a(r6, r0, r5)
        L_0x00ef:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.V3.b(java.util.List, dI.e):java.lang.Object");
    }

    public final C16807N clear() {
        try {
            this.f42344e.clear();
            h hVar = this.f42340a;
            hVar.b(this.f42343d + File.separator + this.f42341b);
        } catch (Exception e10) {
            c cVar = this.f42342c;
            StringBuilder sb2 = new StringBuilder("Failed to delete file from path:");
            sb2.append(this.f42343d + File.separator + this.f42341b);
            H1.a(cVar, sb2.toString(), e10);
        }
        return C16807N.f139792a;
    }
}
