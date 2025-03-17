package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/sugarcube/core/network/models/UploadSetStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/UploadSetState;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/UploadSetState;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/UploadSetState;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/sugarcube/core/network/models/UploadURL;", "listOfUploadURLAdapter", "", "booleanAdapter", "Ljava/time/Instant;", "instantAdapter", "", "nullableIntAdapter", "nullableBooleanAdapter", "Lcom/sugarcube/core/network/models/UploadProperties;", "nullableUploadPropertiesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadSetStateJsonAdapter extends f<UploadSetState> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<UploadSetState> constructorRef;
    private final f<Instant> instantAdapter;
    private final f<List<UploadURL>> listOfUploadURLAdapter;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<UploadProperties> nullableUploadPropertiesAdapter;
    private final k.a options;
    private final f<UUID> uUIDAdapter;

    public UploadSetStateJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("uuid", "urls", "completed", "createdAt", "lastModifiedTs", "user", "resumable", "properties");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<UUID> f10 = tVar.f(UUID.class, g0.d(), "uuid");
        C17542s.i(f10, "adapter(...)");
        this.uUIDAdapter = f10;
        f<List<UploadURL>> f11 = tVar.f(w.j(List.class, UploadURL.class), g0.d(), "urls");
        C17542s.i(f11, "adapter(...)");
        this.listOfUploadURLAdapter = f11;
        f<Boolean> f12 = tVar.f(Boolean.TYPE, g0.d(), "completed");
        C17542s.i(f12, "adapter(...)");
        this.booleanAdapter = f12;
        f<Instant> f13 = tVar.f(Instant.class, g0.d(), "createdAt");
        C17542s.i(f13, "adapter(...)");
        this.instantAdapter = f13;
        f<Integer> f14 = tVar.f(Integer.class, g0.d(), "user");
        C17542s.i(f14, "adapter(...)");
        this.nullableIntAdapter = f14;
        f<Boolean> f15 = tVar.f(Boolean.class, g0.d(), "resumable");
        C17542s.i(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
        f<UploadProperties> f16 = tVar.f(UploadProperties.class, g0.d(), "properties");
        C17542s.i(f16, "adapter(...)");
        this.nullableUploadPropertiesAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UploadSetState");
        sb2.append(')');
        return sb2.toString();
    }

    public UploadSetState fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Boolean bool = Boolean.FALSE;
        kVar.d();
        int i10 = -1;
        Boolean bool2 = bool;
        UUID uuid = null;
        List list = null;
        Instant instant = null;
        Instant instant2 = null;
        Integer num = null;
        Boolean bool3 = null;
        UploadProperties uploadProperties = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    uuid = this.uUIDAdapter.fromJson(kVar2);
                    if (uuid != null) {
                        i10 &= -2;
                        break;
                    } else {
                        throw c.w("uuid", "uuid", kVar2);
                    }
                case 1:
                    list = this.listOfUploadURLAdapter.fromJson(kVar2);
                    if (list != null) {
                        i10 &= -3;
                        break;
                    } else {
                        throw c.w("urls", "urls", kVar2);
                    }
                case 2:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i10 &= -5;
                        break;
                    } else {
                        throw c.w("completed", "completed", kVar2);
                    }
                case 3:
                    instant = this.instantAdapter.fromJson(kVar2);
                    if (instant != null) {
                        i10 &= -9;
                        break;
                    } else {
                        throw c.w("createdAt", "createdAt", kVar2);
                    }
                case 4:
                    instant2 = this.instantAdapter.fromJson(kVar2);
                    if (instant2 != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw c.w("lastModifiedTs", "lastModifiedTs", kVar2);
                    }
                case 5:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
                case 7:
                    uploadProperties = this.nullableUploadPropertiesAdapter.fromJson(kVar2);
                    i10 &= -129;
                    break;
            }
        }
        kVar.f();
        if (i10 == -256) {
            C17542s.h(uuid, "null cannot be cast to non-null type java.util.UUID");
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.core.network.models.UploadURL>");
            boolean booleanValue = bool2.booleanValue();
            C17542s.h(instant, "null cannot be cast to non-null type java.time.Instant");
            C17542s.h(instant2, "null cannot be cast to non-null type java.time.Instant");
            return new UploadSetState(uuid, list, booleanValue, instant, instant2, num, bool3, uploadProperties);
        }
        Constructor<UploadSetState> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UploadSetState.class.getDeclaredConstructor(new Class[]{UUID.class, List.class, Boolean.TYPE, Instant.class, Instant.class, Integer.class, Boolean.class, UploadProperties.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        UploadSetState newInstance = constructor.newInstance(new Object[]{uuid, list, bool2, instant, instant2, num, bool3, uploadProperties, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, UploadSetState uploadSetState) {
        C17542s.j(qVar, "writer");
        if (uploadSetState != null) {
            qVar.d();
            qVar.n("uuid");
            this.uUIDAdapter.toJson(qVar, uploadSetState.getUuid());
            qVar.n("urls");
            this.listOfUploadURLAdapter.toJson(qVar, uploadSetState.getUrls());
            qVar.n("completed");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(uploadSetState.getCompleted()));
            qVar.n("createdAt");
            this.instantAdapter.toJson(qVar, uploadSetState.getCreatedAt());
            qVar.n("lastModifiedTs");
            this.instantAdapter.toJson(qVar, uploadSetState.getLastModifiedTs());
            qVar.n("user");
            this.nullableIntAdapter.toJson(qVar, uploadSetState.getUser());
            qVar.n("resumable");
            this.nullableBooleanAdapter.toJson(qVar, uploadSetState.getResumable());
            qVar.n("properties");
            this.nullableUploadPropertiesAdapter.toJson(qVar, uploadSetState.getProperties());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
