package com.sugarcube.app.base.external.config;

import TJ.C16519P;
import TJ.C16521S;
import com.sugarcube.app.base.external.config.IConfig;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016XD¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016XD¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/app/base/external/config/a;", "Lcom/sugarcube/app/base/external/config/IConfig;", "<init>", "()V", "", "a", "Z", "getDebug", "()Z", "debug", "", "b", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "country", "c", "getLanguage", "language", "LTJ/P;", "d", "LTJ/P;", "()LTJ/P;", "trackingEnabledFlow", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements IConfig {

    /* renamed from: e  reason: collision with root package name */
    public static final int f123075e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f123076a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123077b = "us";

    /* renamed from: c  reason: collision with root package name */
    private final String f123078c = "en";

    /* renamed from: d  reason: collision with root package name */
    private final C16519P<Boolean> f123079d = C16521S.a(Boolean.FALSE);

    /* renamed from: a */
    public C16519P<Boolean> getTrackingEnabledFlow() {
        return this.f123079d;
    }

    public String getCountry() {
        return this.f123077b;
    }

    public boolean getDebug() {
        return this.f123076a;
    }

    public String getLanguage() {
        return this.f123078c;
    }

    public Locale getLocale() {
        return IConfig.a.a(this);
    }

    public String getRegion() {
        return IConfig.a.b(this);
    }
}
