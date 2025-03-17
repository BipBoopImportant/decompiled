package com.contentsquare.android.internal.core.logmonitor.processing;

import X8.b;
import XH.C16814e;
import a9.D4;
import fK.p;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

@p
public final class LogContext {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46775a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonElement f46776b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46777c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46778d;

    public static final class a {
        public final KSerializer<LogContext> serializer() {
            return LogContext$$serializer.INSTANCE;
        }
    }

    public LogContext() {
        this("", (JsonElement) null);
    }

    @C16814e
    public LogContext(int i10, String str, JsonElement jsonElement, String str2, String str3) {
        String str4 = "";
        if ((i10 & 1) == 0) {
            this.f46775a = str4;
        } else {
            this.f46775a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46776b = null;
        } else {
            this.f46776b = jsonElement;
        }
        if ((i10 & 4) == 0) {
            this.f46777c = str4;
        } else {
            this.f46777c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f46778d = str4;
        } else {
            this.f46778d = str3;
        }
        b i11 = b.i();
        if (i11 != null) {
            String str5 = ((D4) i11.h()).f41961e;
            this.f46777c = str5 == null ? str4 : str5;
            String str6 = ((D4) i11.h()).f41960d;
            this.f46778d = str6 != null ? str6 : str4;
        }
    }

    public LogContext(String str, JsonElement jsonElement) {
        C17542s.j(str, "description");
        this.f46775a = str;
        this.f46776b = jsonElement;
        String str2 = "";
        this.f46777c = str2;
        this.f46778d = str2;
        b i10 = b.i();
        if (i10 != null) {
            String str3 = ((D4) i10.h()).f41961e;
            this.f46777c = str3 == null ? str2 : str3;
            String str4 = ((D4) i10.h()).f41960d;
            this.f46778d = str4 != null ? str4 : str2;
        }
    }
}
