package ug;

import Zj.a;
import Zj.h;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import qI.C17787d;
import uI.C18064m;
import ug.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014RG\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lug/i;", "Lug/h;", "LZj/h;", "hlpFeatureStorage", "<init>", "(LZj/h;)V", "", "<set-?>", "a", "LqI/d;", "getHlpOverride", "()Z", "setHlpOverride", "(Z)V", "hlpOverride", "", "b", "getHlpTenant", "()Ljava/lang/String;", "setHlpTenant", "(Ljava/lang/String;)V", "hlpTenant", "c", "getHlpAppId", "setHlpAppId", "hlpAppId", "", "d", "getHlpParameters", "()Ljava/util/Map;", "setHlpParameters", "(Ljava/util/Map;)V", "hlpParameters", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f77028e;

    /* renamed from: a  reason: collision with root package name */
    private final C17787d f77029a;

    /* renamed from: b  reason: collision with root package name */
    private final C17787d f77030b;

    /* renamed from: c  reason: collision with root package name */
    private final C17787d f77031c;

    /* renamed from: d  reason: collision with root package name */
    private final C17787d f77032d;

    static {
        Class<i> cls = i.class;
        f77028e = new C18064m[]{P.e(new A(cls, "hlpOverride", "getHlpOverride()Z", 0)), P.e(new A(cls, "hlpTenant", "getHlpTenant()Ljava/lang/String;", 0)), P.e(new A(cls, "hlpAppId", "getHlpAppId()Ljava/lang/String;", 0)), P.e(new A(cls, "hlpParameters", "getHlpParameters()Ljava/util/Map;", 0))};
    }

    public i(h hVar) {
        C17542s.j(hVar, "hlpFeatureStorage");
        this.f77029a = a.b(hVar, h.a.HLP_OVERRIDE, false, 2, (Object) null);
        this.f77030b = a.d(hVar, h.a.HLP_TENANT);
        this.f77031c = a.d(hVar, h.a.HLP_APP_ID);
        this.f77032d = a.c(hVar, h.a.HLP_PARAMETERS);
    }
}
