package a9;

import D8.c;
import k8.g;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.n2  reason: case insensitive filesystem */
public final class C6888n2 {

    /* renamed from: a  reason: collision with root package name */
    public final E f42732a;

    /* renamed from: b  reason: collision with root package name */
    public final K6 f42733b;

    /* renamed from: c  reason: collision with root package name */
    public final g f42734c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42735d = new c("ForceMaskingResolver");

    public C6888n2(E e10, K6 k62) {
        g gVar = g.f54363a;
        C17542s.j(e10, "sessionReplayConfiguration");
        C17542s.j(gVar, "xpfMasker");
        this.f42732a = e10;
        this.f42733b = k62;
        this.f42734c = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            a9.E r0 = r10.f42732a
            A8.b r1 = r0.f41974b
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r1 = r1.b()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0098
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r1 = r1.o()
            if (r1 != 0) goto L_0x001a
            goto L_0x0098
        L_0x001a:
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules r1 = r1.e()
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRulesFullMasking r1 = r1.a()
            G8.d r5 = r0.f41975c
            java.lang.String r5 = r5.d()
            G8.d r6 = r0.f41975c
            java.lang.String r6 = r6.i()
            int r7 = r1.hashCode()
            a9.E$a r8 = r0.f41976d
            if (r8 == 0) goto L_0x0041
            int r9 = r8.f41978b
            if (r9 != r7) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r8 = r2
        L_0x003c:
            if (r8 == 0) goto L_0x0041
            boolean r0 = r8.f41977a
            goto L_0x0099
        L_0x0041:
            java.util.List r8 = r1.b()
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0050
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0050
            goto L_0x0067
        L_0x0050:
            java.util.Iterator r8 = r8.iterator()
        L_0x0054:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0067
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = G8.y.a(r9, r5)
            if (r9 == 0) goto L_0x0054
            goto L_0x008c
        L_0x0067:
            java.util.List r1 = r1.c()
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0076
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0076
            goto L_0x008e
        L_0x0076:
            java.util.Iterator r1 = r1.iterator()
        L_0x007a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = G8.y.a(r5, r6)
            if (r5 == 0) goto L_0x007a
        L_0x008c:
            r1 = r4
            goto L_0x008f
        L_0x008e:
            r1 = r3
        L_0x008f:
            a9.E$a r5 = new a9.E$a
            r5.<init>(r7, r1)
            r0.f41976d = r5
            r0 = r1
            goto L_0x0099
        L_0x0098:
            r0 = r3
        L_0x0099:
            r1 = 2
            r5 = 3
            r6 = 4
            if (r0 == 0) goto L_0x00a0
            r11 = r6
            goto L_0x00ba
        L_0x00a0:
            k8.g r0 = r10.f42734c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00aa
            r11 = r5
            goto L_0x00ba
        L_0x00aa:
            a9.K6 r0 = r10.f42733b
            if (r0 == 0) goto L_0x00b5
            boolean r11 = r0.b(r11)
            if (r11 != r4) goto L_0x00b5
            r3 = r4
        L_0x00b5:
            if (r3 == 0) goto L_0x00b9
            r11 = r1
            goto L_0x00ba
        L_0x00b9:
            r11 = r4
        L_0x00ba:
            if (r11 == r4) goto L_0x00db
            D8.c r0 = r10.f42735d
            if (r11 == r4) goto L_0x00d0
            if (r11 == r1) goto L_0x00cd
            if (r11 == r5) goto L_0x00ca
            if (r11 != r6) goto L_0x00c9
            java.lang.String r1 = "Remote Force Masking"
            goto L_0x00d2
        L_0x00c9:
            throw r2
        L_0x00ca:
            java.lang.String r1 = "XPF Bridge force masking"
            goto L_0x00d2
        L_0x00cd:
            java.lang.String r1 = "Animation Detected"
            goto L_0x00d2
        L_0x00d0:
            java.lang.String r1 = "No force masking detected"
        L_0x00d2:
            java.lang.String r2 = "Force Masking is enabled. Reason: "
            java.lang.String r1 = r2.concat(r1)
            r0.j(r1)
        L_0x00db:
            if (r11 != r6) goto L_0x00e6
            U8.a r0 = U8.a.f40370a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "remote_force_masking"
            r0.d(r2, r1)
        L_0x00e6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6888n2.a(android.view.View):int");
    }
}
