package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/MobileDeviceJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/MobileDevice;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/MobileDevice;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/MobileDevice;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Ljava/time/Instant;", "instantAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MobileDeviceJsonAdapter extends f<MobileDevice> {
    private volatile Constructor<MobileDevice> constructorRef;
    private final f<Instant> instantAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public MobileDeviceJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("fcmToken", "appEnv", "fcmProject", "uuid", "token", "name", "createdAt", "lastModifiedTs", "platform");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<String> cls = String.class;
        f<String> f10 = tVar.f(cls, g0.d(), "fcmToken");
        C17542s.i(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        f<String> f11 = tVar.f(cls, g0.d(), "name");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<Instant> f12 = tVar.f(Instant.class, g0.d(), "createdAt");
        C17542s.i(f12, "adapter(...)");
        this.instantAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("MobileDevice");
        sb2.append(')');
        return sb2.toString();
    }

    public MobileDevice fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        String str = null;
        int i10 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Instant instant = null;
        Instant instant2 = null;
        String str7 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    str6 = this.stringAdapter.fromJson(kVar2);
                    if (str6 != null) {
                        i10 &= -33;
                        break;
                    } else {
                        throw c.w("name", "name", kVar2);
                    }
                case 6:
                    instant = this.instantAdapter.fromJson(kVar2);
                    if (instant != null) {
                        i10 &= -65;
                        break;
                    } else {
                        throw c.w("createdAt", "createdAt", kVar2);
                    }
                case 7:
                    instant2 = this.instantAdapter.fromJson(kVar2);
                    if (instant2 != null) {
                        i10 &= -129;
                        break;
                    } else {
                        throw c.w("lastModifiedTs", "lastModifiedTs", kVar2);
                    }
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -257;
                    break;
            }
        }
        kVar.f();
        if (i10 == -505) {
            C17542s.h(str6, "null cannot be cast to non-null type kotlin.String");
            C17542s.h(instant, "null cannot be cast to non-null type java.time.Instant");
            C17542s.h(instant2, "null cannot be cast to non-null type java.time.Instant");
            return new MobileDevice(str, str2, str3, str4, str5, str6, instant, instant2, str7);
        }
        Constructor<MobileDevice> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MobileDevice.class.getDeclaredConstructor(new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Instant.class, Instant.class, String.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        MobileDevice newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, str6, instant, instant2, str7, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, MobileDevice mobileDevice) {
        C17542s.j(qVar, "writer");
        if (mobileDevice != null) {
            qVar.d();
            qVar.n("fcmToken");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getFcmToken());
            qVar.n("appEnv");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getAppEnv());
            qVar.n("fcmProject");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getFcmProject());
            qVar.n("uuid");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getUuid());
            qVar.n("token");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getToken());
            qVar.n("name");
            this.stringAdapter.toJson(qVar, mobileDevice.getName());
            qVar.n("createdAt");
            this.instantAdapter.toJson(qVar, mobileDevice.getCreatedAt());
            qVar.n("lastModifiedTs");
            this.instantAdapter.toJson(qVar, mobileDevice.getLastModifiedTs());
            qVar.n("platform");
            this.nullableStringAdapter.toJson(qVar, mobileDevice.getPlatform());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
