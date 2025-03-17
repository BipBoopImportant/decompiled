package tg;

import Zj.a;
import Zj.h;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import qI.C17787d;
import tg.d;
import uI.C18064m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ltg/e;", "Ltg/d;", "LZj/h;", "labsStorage", "<init>", "(LZj/h;)V", "", "<set-?>", "a", "LqI/d;", "getUseFakeFamilyRewardsRepository", "()Z", "setUseFakeFamilyRewardsRepository", "(Z)V", "useFakeFamilyRewardsRepository", "b", "getFakeFoodMobile", "setFakeFoodMobile", "fakeFoodMobile", "", "c", "getFakeMobileUrl", "()Ljava/lang/String;", "setFakeMobileUrl", "(Ljava/lang/String;)V", "fakeMobileUrl", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f76793d;

    /* renamed from: a  reason: collision with root package name */
    private final C17787d f76794a;

    /* renamed from: b  reason: collision with root package name */
    private final C17787d f76795b;

    /* renamed from: c  reason: collision with root package name */
    private final C17787d f76796c;

    static {
        Class<e> cls = e.class;
        f76793d = new C18064m[]{P.e(new A(cls, "useFakeFamilyRewardsRepository", "getUseFakeFamilyRewardsRepository()Z", 0)), P.e(new A(cls, "fakeFoodMobile", "getFakeFoodMobile()Z", 0)), P.e(new A(cls, "fakeMobileUrl", "getFakeMobileUrl()Ljava/lang/String;", 0))};
    }

    public e(h hVar) {
        C17542s.j(hVar, "labsStorage");
        this.f76794a = a.b(hVar, d.a.FAKE_FAMILY_REWARDS_REPOSITORY, false, 2, (Object) null);
        this.f76795b = a.b(hVar, d.a.FAKE_FOOD_MOBILE, false, 2, (Object) null);
        this.f76796c = a.d(hVar, d.a.FAKE_FOOD_MOBILE_URL);
    }

    public boolean getFakeFoodMobile() {
        return ((Boolean) this.f76795b.a(this, f76793d[1])).booleanValue();
    }

    public String getFakeMobileUrl() {
        return (String) this.f76796c.a(this, f76793d[2]);
    }
}
