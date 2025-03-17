package com.contentsquare.android.internal.core.logmonitor.processing;

import A8.b;
import XH.C16814e;
import androidx.recyclerview.widget.RecyclerView;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.google.ar.core.ImageMetadata;
import fK.p;
import kotlinx.serialization.KSerializer;
import u8.C8886a;

@p
public final class LogMessage {
    public static final a Companion = new a();

    /* renamed from: r  reason: collision with root package name */
    public static final KSerializer<Object>[] f46783r = {a.Companion.serializer(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public final a f46784a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46785b;

    /* renamed from: c  reason: collision with root package name */
    public final LogContext f46786c;

    /* renamed from: d  reason: collision with root package name */
    public final LogError f46787d;

    /* renamed from: e  reason: collision with root package name */
    public final LogXpf f46788e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f46789f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46790g;

    /* renamed from: h  reason: collision with root package name */
    public final String f46791h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f46792i;

    /* renamed from: j  reason: collision with root package name */
    public final String f46793j;

    /* renamed from: k  reason: collision with root package name */
    public final String f46794k;

    /* renamed from: l  reason: collision with root package name */
    public final String f46795l;

    /* renamed from: m  reason: collision with root package name */
    public final String f46796m;

    /* renamed from: n  reason: collision with root package name */
    public final String f46797n;

    /* renamed from: o  reason: collision with root package name */
    public final String f46798o;

    /* renamed from: p  reason: collision with root package name */
    public final String f46799p;

    /* renamed from: q  reason: collision with root package name */
    public final String f46800q;

    public static final class a {
        public final KSerializer<LogMessage> serializer() {
            return LogMessage$$serializer.INSTANCE;
        }
    }

    public LogMessage() {
        this((a) null, (String) null, (LogContext) null, (LogXpf) null, 31);
    }

    @C16814e
    public LogMessage(int i10, a aVar, String str, LogContext logContext, LogError logError, LogXpf logXpf, Integer num, String str2, String str3, Long l10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        b c10;
        JsonConfig.ProjectConfiguration b10;
        int i11 = i10;
        Integer num2 = null;
        if ((i11 & 1) == 0) {
            this.f46784a = null;
        } else {
            this.f46784a = aVar;
        }
        if ((i11 & 2) == 0) {
            this.f46785b = "";
        } else {
            this.f46785b = str;
        }
        if ((i11 & 4) == 0) {
            this.f46786c = null;
        } else {
            this.f46786c = logContext;
        }
        if ((i11 & 8) == 0) {
            this.f46787d = null;
        } else {
            this.f46787d = logError;
        }
        if ((i11 & 16) == 0) {
            this.f46788e = null;
        } else {
            this.f46788e = logXpf;
        }
        if ((i11 & 32) == 0) {
            this.f46789f = null;
        } else {
            this.f46789f = num;
        }
        if ((i11 & 64) == 0) {
            this.f46790g = "";
        } else {
            this.f46790g = str2;
        }
        if ((i11 & 128) == 0) {
            this.f46791h = "";
        } else {
            this.f46791h = str3;
        }
        if ((i11 & 256) == 0) {
            this.f46792i = null;
        } else {
            this.f46792i = l10;
        }
        if ((i11 & 512) == 0) {
            this.f46793j = "";
        } else {
            this.f46793j = str4;
        }
        this.f46794k = (i11 & 1024) == 0 ? "android" : str5;
        if ((i11 & RecyclerView.n.FLAG_MOVED) == 0) {
            this.f46795l = "";
        } else {
            this.f46795l = str6;
        }
        if ((i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.f46796m = "";
        } else {
            this.f46796m = str7;
        }
        if ((i11 & 8192) == 0) {
            this.f46797n = "";
        } else {
            this.f46797n = str8;
        }
        if ((i11 & 16384) == 0) {
            this.f46798o = "";
        } else {
            this.f46798o = str9;
        }
        if ((32768 & i11) == 0) {
            this.f46799p = "";
        } else {
            this.f46799p = str10;
        }
        if ((i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            this.f46800q = "";
        } else {
            this.f46800q = str11;
        }
        C8886a.C0914a aVar2 = C8886a.f56874d;
        C8886a a10 = aVar2.a();
        if (!(a10 == null || (c10 = a10.c()) == null || (b10 = c10.b()) == null)) {
            num2 = Integer.valueOf(b10.g());
        }
        this.f46789f = num2;
        C8886a a11 = aVar2.a();
        if (a11 != null) {
            this.f46790g = a11.d().c().c();
            this.f46799p = a11.d().c().d();
            this.f46800q = String.valueOf(a11.d().c().e());
            this.f46797n = a11.d().c().b();
            this.f46791h = a11.d().c().i();
            this.f46798o = String.valueOf(a11.d().c().h());
            this.f46793j = a11.d().e() + ' ' + a11.d().f();
            this.f46795l = a11.d().g();
            this.f46796m = String.valueOf(a11.d().h());
        }
        this.f46792i = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        r3 = (r3 = r3.c()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LogMessage(com.contentsquare.android.internal.core.logmonitor.processing.a r2, java.lang.String r3, com.contentsquare.android.internal.core.logmonitor.processing.LogContext r4, com.contentsquare.android.internal.core.logmonitor.processing.LogError r5, com.contentsquare.android.internal.core.logmonitor.processing.LogXpf r6) {
        /*
            r1 = this;
            java.lang.String r0 = "stacktrace"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r1.<init>()
            r1.f46784a = r2
            r1.f46785b = r3
            r1.f46786c = r4
            r1.f46787d = r5
            r1.f46788e = r6
            java.lang.String r2 = ""
            r1.f46790g = r2
            r1.f46791h = r2
            r1.f46793j = r2
            java.lang.String r3 = "android"
            r1.f46794k = r3
            r1.f46795l = r2
            r1.f46796m = r2
            r1.f46797n = r2
            r1.f46798o = r2
            r1.f46799p = r2
            r1.f46800q = r2
            u8.a$a r2 = u8.C8886a.f56874d
            u8.a r3 = r2.a()
            if (r3 == 0) goto L_0x0047
            A8.b r3 = r3.c()
            if (r3 == 0) goto L_0x0047
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r3 = r3.b()
            if (r3 == 0) goto L_0x0047
            int r3 = r3.g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            r1.f46789f = r3
            u8.a r2 = r2.a()
            if (r2 == 0) goto L_0x00ea
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            java.lang.String r3 = r3.c()
            r1.f46790g = r3
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            java.lang.String r3 = r3.d()
            r1.f46799p = r3
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            long r3 = r3.e()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.f46800q = r3
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            java.lang.String r3 = r3.b()
            r1.f46797n = r3
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            java.lang.String r3 = r3.i()
            r1.f46791h = r3
            F8.g r3 = r2.d()
            G8.d r3 = r3.c()
            int r3 = r3.h()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.f46798o = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            F8.g r4 = r2.d()
            java.lang.String r4 = r4.e()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            F8.g r4 = r2.d()
            java.lang.String r4 = r4.f()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.f46793j = r3
            F8.g r3 = r2.d()
            java.lang.String r3 = r3.g()
            r1.f46795l = r3
            F8.g r2 = r2.d()
            int r2 = r2.h()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.f46796m = r2
        L_0x00ea:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f46792i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.core.logmonitor.processing.LogMessage.<init>(com.contentsquare.android.internal.core.logmonitor.processing.a, java.lang.String, com.contentsquare.android.internal.core.logmonitor.processing.LogContext, com.contentsquare.android.internal.core.logmonitor.processing.LogError, com.contentsquare.android.internal.core.logmonitor.processing.LogXpf):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogMessage(a aVar, String str, LogContext logContext, LogXpf logXpf, int i10) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : logContext, (LogError) null, (i10 & 16) != 0 ? null : logXpf);
    }
}
