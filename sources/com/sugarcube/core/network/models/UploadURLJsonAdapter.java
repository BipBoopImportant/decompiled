package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/UploadURLJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/UploadURL;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/UploadURL;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/UploadURL;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadURLJsonAdapter extends f<UploadURL> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<UploadURL> constructorRef;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public UploadURLJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("path", "contentType", "contentMd5", "url", "completed", "isUploaded", "resumable");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<String> cls = String.class;
        f<String> f10 = tVar.f(cls, g0.d(), "path");
        C17542s.i(f10, "adapter(...)");
        this.stringAdapter = f10;
        f<String> f11 = tVar.f(cls, g0.d(), "contentType");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Boolean> f12 = tVar.f(Boolean.TYPE, g0.d(), "completed");
        C17542s.i(f12, "adapter(...)");
        this.booleanAdapter = f12;
        f<Boolean> f13 = tVar.f(Boolean.class, g0.d(), "isUploaded");
        C17542s.i(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UploadURL");
        sb2.append(')');
        return sb2.toString();
    }

    public UploadURL fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Boolean bool = Boolean.FALSE;
        kVar.d();
        int i10 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(kVar2);
                    if (str != null) {
                        break;
                    } else {
                        throw c.w("path", "path", kVar2);
                    }
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw c.w("completed", "completed", kVar2);
                    }
                case 5:
                    bool3 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    bool4 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
            }
        }
        kVar.f();
        if (i10 != -127) {
            Constructor<UploadURL> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = UploadURL.class.getDeclaredConstructor(new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.class, Boolean.class, Integer.TYPE, c.f112014c});
                this.constructorRef = constructor;
                C17542s.i(constructor, "also(...)");
            }
            if (str != null) {
                UploadURL newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, bool2, bool3, bool4, Integer.valueOf(i10), null});
                C17542s.i(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw c.n("path", "path", kVar2);
        } else if (str != null) {
            return new UploadURL(str, str2, str3, str4, bool2.booleanValue(), bool3, bool4);
        } else {
            throw c.n("path", "path", kVar2);
        }
    }

    public void toJson(q qVar, UploadURL uploadURL) {
        C17542s.j(qVar, "writer");
        if (uploadURL != null) {
            qVar.d();
            qVar.n("path");
            this.stringAdapter.toJson(qVar, uploadURL.getPath());
            qVar.n("contentType");
            this.nullableStringAdapter.toJson(qVar, uploadURL.getContentType());
            qVar.n("contentMd5");
            this.nullableStringAdapter.toJson(qVar, uploadURL.getContentMd5());
            qVar.n("url");
            this.nullableStringAdapter.toJson(qVar, uploadURL.getUrl());
            qVar.n("completed");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(uploadURL.getCompleted()));
            qVar.n("isUploaded");
            this.nullableBooleanAdapter.toJson(qVar, uploadURL.isUploaded());
            qVar.n("resumable");
            this.nullableBooleanAdapter.toJson(qVar, uploadURL.getResumable());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
