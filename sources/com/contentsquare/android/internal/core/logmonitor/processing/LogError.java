package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16814e;
import fK.p;
import jK.E0;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@p
public final class LogError {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46780a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46781b;

    public static final class a {
        public final KSerializer<LogError> serializer() {
            return LogError$$serializer.INSTANCE;
        }
    }

    @C16814e
    public LogError(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            LogError$$serializer.INSTANCE.getClass();
            E0.b(i10, 3, LogError$$serializer.f46782a);
        }
        this.f46780a = str;
        this.f46781b = str2;
    }

    public LogError(String str, String str2) {
        C17542s.j(str, "type");
        C17542s.j(str2, "content");
        this.f46780a = str;
        this.f46781b = str2;
    }
}
