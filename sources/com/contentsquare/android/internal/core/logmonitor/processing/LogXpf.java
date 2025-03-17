package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16814e;
import fK.p;
import kotlinx.serialization.KSerializer;

@p
public final class LogXpf {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46802a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46803b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46804c;

    public static final class a {
        public final KSerializer<LogXpf> serializer() {
            return LogXpf$$serializer.INSTANCE;
        }
    }

    public LogXpf() {
        this.f46802a = null;
        this.f46803b = null;
        this.f46804c = null;
    }

    @C16814e
    public LogXpf(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f46802a = null;
        } else {
            this.f46802a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46803b = null;
        } else {
            this.f46803b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f46804c = null;
        } else {
            this.f46804c = str3;
        }
    }

    public LogXpf(String str, String str2, String str3) {
        this.f46802a = str;
        this.f46803b = str2;
        this.f46804c = str3;
    }
}
