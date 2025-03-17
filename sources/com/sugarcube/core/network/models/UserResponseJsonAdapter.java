package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/sugarcube/core/network/models/UserResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/UserResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/UserResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/UserResponse;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "", "booleanAdapter", "", "nullableMutableMapOfStringBooleanAdapter", "Lcom/sugarcube/core/network/models/MobileDevice;", "nullableMobileDeviceAdapter", "", "nullableListOfStringAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserResponseJsonAdapter extends f<UserResponse> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<UserResponse> constructorRef;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<String>> nullableListOfStringAdapter;
    private final f<MobileDevice> nullableMobileDeviceAdapter;
    private final f<Map<String, Boolean>> nullableMutableMapOfStringBooleanAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public UserResponseJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("wid", "firstName", "lastName", "email", "profilePictureUrl", "isStaff", "featureFlags", "metricsId", "deviceId", "mobileDevice", "loginType", "lastCountry", "lastLanguage", "isFirstTime", "isLoggedIn", "emailVerified", "vip", "acceptedKreativPrivacyPolicy", "acceptedKreativPrivacyPolicyAt");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.class, g0.d(), "wid");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar2.f(cls, g0.d(), "firstName");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Boolean> f12 = tVar2.f(Boolean.TYPE, g0.d(), "isStaff");
        C17542s.i(f12, "adapter(...)");
        this.booleanAdapter = f12;
        Class<Boolean> cls2 = Boolean.class;
        f<Map<String, Boolean>> f13 = tVar2.f(w.j(Map.class, cls, cls2), g0.d(), "featureFlags");
        C17542s.i(f13, "adapter(...)");
        this.nullableMutableMapOfStringBooleanAdapter = f13;
        f<MobileDevice> f14 = tVar2.f(MobileDevice.class, g0.d(), "mobileDevice");
        C17542s.i(f14, "adapter(...)");
        this.nullableMobileDeviceAdapter = f14;
        f<List<String>> f15 = tVar2.f(w.j(List.class, cls), g0.d(), "loginType");
        C17542s.i(f15, "adapter(...)");
        this.nullableListOfStringAdapter = f15;
        f<Boolean> f16 = tVar2.f(cls2, g0.d(), "acceptedKreativPrivacyPolicy");
        C17542s.i(f16, "adapter(...)");
        this.nullableBooleanAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UserResponse");
        sb2.append(')');
        return sb2.toString();
    }

    public UserResponse fromJson(k kVar) {
        int i10;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Boolean bool = Boolean.FALSE;
        kVar.d();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        String str5 = null;
        String str6 = null;
        MobileDevice mobileDevice = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        Boolean bool5 = null;
        String str9 = null;
        Boolean bool6 = bool4;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    continue;
                case 0:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i11 &= -2;
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -3;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -5;
                    continue;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -9;
                    continue;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -17;
                    continue;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i11 &= -33;
                        continue;
                    } else {
                        throw c.w("isStaff", "isStaff", kVar2);
                    }
                case 6:
                    map = this.nullableMutableMapOfStringBooleanAdapter.fromJson(kVar2);
                    i11 &= -65;
                    continue;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -129;
                    continue;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -257;
                    continue;
                case 9:
                    mobileDevice = this.nullableMobileDeviceAdapter.fromJson(kVar2);
                    i11 &= -513;
                    continue;
                case 10:
                    list = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i11 &= -1025;
                    continue;
                case 11:
                    str7 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -2049;
                    continue;
                case 12:
                    str8 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -4097;
                    continue;
                case 13:
                    bool = this.booleanAdapter.fromJson(kVar2);
                    if (bool != null) {
                        i11 &= -8193;
                        continue;
                    } else {
                        throw c.w("isFirstTime", "isFirstTime", kVar2);
                    }
                case 14:
                    bool6 = this.booleanAdapter.fromJson(kVar2);
                    if (bool6 != null) {
                        i11 &= -16385;
                        continue;
                    } else {
                        throw c.w("isLoggedIn", "isLoggedIn", kVar2);
                    }
                case 15:
                    bool3 = this.booleanAdapter.fromJson(kVar2);
                    if (bool3 != null) {
                        i10 = -32769;
                        break;
                    } else {
                        throw c.w("emailVerified", "emailVerified", kVar2);
                    }
                case 16:
                    bool4 = this.booleanAdapter.fromJson(kVar2);
                    if (bool4 != null) {
                        i10 = -65537;
                        break;
                    } else {
                        throw c.w("vip", "vip", kVar2);
                    }
                case 17:
                    bool5 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 = -131073;
                    break;
                case 18:
                    str9 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -262145;
                    break;
            }
            i11 &= i10;
        }
        kVar.f();
        if (i11 == -524288) {
            return new UserResponse(num, str, str2, str3, str4, bool2.booleanValue(), map, str5, str6, mobileDevice, list, str7, str8, bool.booleanValue(), bool6.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5, str9);
        }
        Constructor<UserResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            Class<UserResponse> cls2 = UserResponse.class;
            constructor = cls2.getDeclaredConstructor(new Class[]{Integer.class, String.class, String.class, String.class, String.class, cls, Map.class, String.class, String.class, MobileDevice.class, List.class, String.class, String.class, cls, cls, cls, cls, Boolean.class, String.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        UserResponse newInstance = constructor.newInstance(new Object[]{num, str, str2, str3, str4, bool2, map, str5, str6, mobileDevice, list, str7, str8, bool, bool6, bool3, bool4, bool5, str9, Integer.valueOf(i11), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, UserResponse userResponse) {
        C17542s.j(qVar, "writer");
        if (userResponse != null) {
            qVar.d();
            qVar.n("wid");
            this.nullableIntAdapter.toJson(qVar, userResponse.getWid());
            qVar.n("firstName");
            this.nullableStringAdapter.toJson(qVar, userResponse.getFirstName());
            qVar.n("lastName");
            this.nullableStringAdapter.toJson(qVar, userResponse.getLastName());
            qVar.n("email");
            this.nullableStringAdapter.toJson(qVar, userResponse.getEmail());
            qVar.n("profilePictureUrl");
            this.nullableStringAdapter.toJson(qVar, userResponse.getProfilePictureUrl());
            qVar.n("isStaff");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(userResponse.isStaff()));
            qVar.n("featureFlags");
            this.nullableMutableMapOfStringBooleanAdapter.toJson(qVar, userResponse.getFeatureFlags());
            qVar.n("metricsId");
            this.nullableStringAdapter.toJson(qVar, userResponse.getMetricsId());
            qVar.n("deviceId");
            this.nullableStringAdapter.toJson(qVar, userResponse.getDeviceId());
            qVar.n("mobileDevice");
            this.nullableMobileDeviceAdapter.toJson(qVar, userResponse.getMobileDevice());
            qVar.n("loginType");
            this.nullableListOfStringAdapter.toJson(qVar, userResponse.getLoginType());
            qVar.n("lastCountry");
            this.nullableStringAdapter.toJson(qVar, userResponse.getLastCountry());
            qVar.n("lastLanguage");
            this.nullableStringAdapter.toJson(qVar, userResponse.getLastLanguage());
            qVar.n("isFirstTime");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(userResponse.isFirstTime()));
            qVar.n("isLoggedIn");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(userResponse.isLoggedIn()));
            qVar.n("emailVerified");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(userResponse.getEmailVerified()));
            qVar.n("vip");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(userResponse.getVip()));
            qVar.n("acceptedKreativPrivacyPolicy");
            this.nullableBooleanAdapter.toJson(qVar, userResponse.getAcceptedKreativPrivacyPolicy());
            qVar.n("acceptedKreativPrivacyPolicyAt");
            this.nullableStringAdapter.toJson(qVar, userResponse.getAcceptedKreativPrivacyPolicyAt());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
