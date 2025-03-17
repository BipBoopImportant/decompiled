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
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/sugarcube/core/network/models/CreateUploadSetRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CreateUploadSetRequest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "Lcom/sugarcube/core/network/models/UploadURL;", "listOfUploadURLAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "", "booleanAdapter", "Lcom/sugarcube/core/network/models/UploadProperties;", "nullableUploadPropertiesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateUploadSetRequestJsonAdapter extends f<CreateUploadSetRequest> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<CreateUploadSetRequest> constructorRef;
    private final f<List<UploadURL>> listOfUploadURLAdapter;
    private final f<String> nullableStringAdapter;
    private final f<UploadProperties> nullableUploadPropertiesAdapter;
    private final k.a options;

    public CreateUploadSetRequestJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("urls", "clientIdentifier", "resumable", "properties");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<List<UploadURL>> f10 = tVar.f(w.j(List.class, UploadURL.class), g0.d(), "urls");
        C17542s.i(f10, "adapter(...)");
        this.listOfUploadURLAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "clientIdentifier");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Boolean> f12 = tVar.f(Boolean.TYPE, g0.d(), "resumable");
        C17542s.i(f12, "adapter(...)");
        this.booleanAdapter = f12;
        f<UploadProperties> f13 = tVar.f(UploadProperties.class, g0.d(), "properties");
        C17542s.i(f13, "adapter(...)");
        this.nullableUploadPropertiesAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateUploadSetRequest");
        sb2.append(')');
        return sb2.toString();
    }

    public CreateUploadSetRequest fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        Boolean bool = Boolean.FALSE;
        kVar.d();
        Boolean bool2 = bool;
        List list = null;
        String str = null;
        UploadProperties uploadProperties = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                list = this.listOfUploadURLAdapter.fromJson(kVar);
                if (list != null) {
                    i10 &= -2;
                } else {
                    throw c.w("urls", "urls", kVar);
                }
            } else if (s10 == 1) {
                str = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -3;
            } else if (s10 == 2) {
                bool2 = this.booleanAdapter.fromJson(kVar);
                if (bool2 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("resumable", "resumable", kVar);
                }
            } else if (s10 == 3) {
                uploadProperties = this.nullableUploadPropertiesAdapter.fromJson(kVar);
                i10 &= -9;
            }
        }
        kVar.f();
        if (i10 == -16) {
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.core.network.models.UploadURL>");
            return new CreateUploadSetRequest(list, str, bool2.booleanValue(), uploadProperties);
        }
        Constructor<CreateUploadSetRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreateUploadSetRequest.class.getDeclaredConstructor(new Class[]{List.class, String.class, Boolean.TYPE, UploadProperties.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CreateUploadSetRequest newInstance = constructor.newInstance(new Object[]{list, str, bool2, uploadProperties, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CreateUploadSetRequest createUploadSetRequest) {
        C17542s.j(qVar, "writer");
        if (createUploadSetRequest != null) {
            qVar.d();
            qVar.n("urls");
            this.listOfUploadURLAdapter.toJson(qVar, createUploadSetRequest.getUrls());
            qVar.n("clientIdentifier");
            this.nullableStringAdapter.toJson(qVar, createUploadSetRequest.getClientIdentifier());
            qVar.n("resumable");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(createUploadSetRequest.getResumable()));
            qVar.n("properties");
            this.nullableUploadPropertiesAdapter.toJson(qVar, createUploadSetRequest.getProperties());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
