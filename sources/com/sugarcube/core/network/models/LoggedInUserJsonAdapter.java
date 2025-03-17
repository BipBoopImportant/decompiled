package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sugarcube/core/network/models/LoggedInUserJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/LoggedInUser;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/LoggedInUser;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/LoggedInUser;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Lcom/sugarcube/core/network/models/AuthType;", "authTypeAdapter", "", "booleanAdapter", "", "nullableMutableMapOfStringBooleanAdapter", "Lcom/sugarcube/core/network/models/MobileDevice;", "nullableMobileDeviceAdapter", "nullableStringAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggedInUserJsonAdapter extends f<LoggedInUser> {
    private final f<AuthType> authTypeAdapter;
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<LoggedInUser> constructorRef;
    private final f<Integer> intAdapter;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<MobileDevice> nullableMobileDeviceAdapter;
    private final f<Map<String, Boolean>> nullableMutableMapOfStringBooleanAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public LoggedInUserJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("wid", "email", "server", "authMethod", "isLoggedIn", "featureFlags", "mobileDevice", "partyUid", "postalCode", "preferredStore", "hasScenes", "hasDesigns", "acceptedKreativPrivacyPolicy", "acceptedKreativPrivacyPolicyAt");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.TYPE, g0.d(), "wid");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar2.f(cls, g0.d(), "email");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<AuthType> f12 = tVar2.f(AuthType.class, g0.d(), "authMethod");
        C17542s.i(f12, "adapter(...)");
        this.authTypeAdapter = f12;
        f<Boolean> f13 = tVar2.f(Boolean.TYPE, g0.d(), "isLoggedIn");
        C17542s.i(f13, "adapter(...)");
        this.booleanAdapter = f13;
        Class<Boolean> cls2 = Boolean.class;
        f<Map<String, Boolean>> f14 = tVar2.f(w.j(Map.class, cls, cls2), g0.d(), "featureFlags");
        C17542s.i(f14, "adapter(...)");
        this.nullableMutableMapOfStringBooleanAdapter = f14;
        f<MobileDevice> f15 = tVar2.f(MobileDevice.class, g0.d(), "mobileDevice");
        C17542s.i(f15, "adapter(...)");
        this.nullableMobileDeviceAdapter = f15;
        f<String> f16 = tVar2.f(cls, g0.d(), "partyUid");
        C17542s.i(f16, "adapter(...)");
        this.nullableStringAdapter = f16;
        f<Boolean> f17 = tVar2.f(cls2, g0.d(), "acceptedKreativPrivacyPolicy");
        C17542s.i(f17, "adapter(...)");
        this.nullableBooleanAdapter = f17;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LoggedInUser");
        sb2.append(')');
        return sb2.toString();
    }

    public LoggedInUser fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Boolean bool = Boolean.FALSE;
        kVar.d();
        int i10 = -1;
        Integer num = 0;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        AuthType authType = null;
        Map map = null;
        MobileDevice mobileDevice = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool3 = null;
        String str6 = null;
        Boolean bool4 = bool2;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(kVar2);
                    if (num != null) {
                        i10 &= -2;
                        break;
                    } else {
                        throw c.w("wid", "wid", kVar2);
                    }
                case 1:
                    str = this.stringAdapter.fromJson(kVar2);
                    if (str != null) {
                        i10 &= -3;
                        break;
                    } else {
                        throw c.w("email", "email", kVar2);
                    }
                case 2:
                    str2 = this.stringAdapter.fromJson(kVar2);
                    if (str2 != null) {
                        i10 &= -5;
                        break;
                    } else {
                        throw c.w("server", "server", kVar2);
                    }
                case 3:
                    authType = this.authTypeAdapter.fromJson(kVar2);
                    if (authType != null) {
                        i10 &= -9;
                        break;
                    } else {
                        throw c.w("authMethod", "authMethod", kVar2);
                    }
                case 4:
                    bool = this.booleanAdapter.fromJson(kVar2);
                    if (bool != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw c.w("isLoggedIn", "isLoggedIn", kVar2);
                    }
                case 5:
                    map = this.nullableMutableMapOfStringBooleanAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    mobileDevice = this.nullableMobileDeviceAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -129;
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -257;
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -513;
                    break;
                case 10:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i10 &= -1025;
                        break;
                    } else {
                        throw c.w("hasScenes", "hasScenes", kVar2);
                    }
                case 11:
                    bool4 = this.booleanAdapter.fromJson(kVar2);
                    if (bool4 != null) {
                        i10 &= -2049;
                        break;
                    } else {
                        throw c.w("hasDesigns", "hasDesigns", kVar2);
                    }
                case 12:
                    bool3 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -4097;
                    break;
                case 13:
                    str6 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -8193;
                    break;
            }
        }
        kVar.f();
        if (i10 == -16384) {
            int intValue = num.intValue();
            C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
            C17542s.h(str2, "null cannot be cast to non-null type kotlin.String");
            C17542s.h(authType, "null cannot be cast to non-null type com.sugarcube.core.network.models.AuthType");
            return new LoggedInUser(intValue, str, str2, authType, bool.booleanValue(), map, mobileDevice, str3, str4, str5, bool2.booleanValue(), bool4.booleanValue(), bool3, str6);
        }
        Constructor<LoggedInUser> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class<LoggedInUser> cls3 = LoggedInUser.class;
            constructor = cls3.getDeclaredConstructor(new Class[]{cls, String.class, String.class, AuthType.class, cls2, Map.class, MobileDevice.class, String.class, String.class, String.class, cls2, cls2, Boolean.class, String.class, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        LoggedInUser newInstance = constructor.newInstance(new Object[]{num, str, str2, authType, bool, map, mobileDevice, str3, str4, str5, bool2, bool4, bool3, str6, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, LoggedInUser loggedInUser) {
        C17542s.j(qVar, "writer");
        if (loggedInUser != null) {
            qVar.d();
            qVar.n("wid");
            this.intAdapter.toJson(qVar, Integer.valueOf(loggedInUser.getWid()));
            qVar.n("email");
            this.stringAdapter.toJson(qVar, loggedInUser.getEmail());
            qVar.n("server");
            this.stringAdapter.toJson(qVar, loggedInUser.getServer());
            qVar.n("authMethod");
            this.authTypeAdapter.toJson(qVar, loggedInUser.getAuthMethod());
            qVar.n("isLoggedIn");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(loggedInUser.isLoggedIn()));
            qVar.n("featureFlags");
            this.nullableMutableMapOfStringBooleanAdapter.toJson(qVar, loggedInUser.getFeatureFlags());
            qVar.n("mobileDevice");
            this.nullableMobileDeviceAdapter.toJson(qVar, loggedInUser.getMobileDevice());
            qVar.n("partyUid");
            this.nullableStringAdapter.toJson(qVar, loggedInUser.getPartyUid());
            qVar.n("postalCode");
            this.nullableStringAdapter.toJson(qVar, loggedInUser.getPostalCode());
            qVar.n("preferredStore");
            this.nullableStringAdapter.toJson(qVar, loggedInUser.getPreferredStore());
            qVar.n("hasScenes");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(loggedInUser.getHasScenes()));
            qVar.n("hasDesigns");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(loggedInUser.getHasDesigns()));
            qVar.n("acceptedKreativPrivacyPolicy");
            this.nullableBooleanAdapter.toJson(qVar, loggedInUser.getAcceptedKreativPrivacyPolicy());
            qVar.n("acceptedKreativPrivacyPolicyAt");
            this.nullableStringAdapter.toJson(qVar, loggedInUser.getAcceptedKreativPrivacyPolicyAt());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
