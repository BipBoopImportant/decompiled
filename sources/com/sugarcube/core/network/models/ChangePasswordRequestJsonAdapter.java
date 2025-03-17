package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/core/network/models/ChangePasswordRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/ChangePasswordRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/ChangePasswordRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/ChangePasswordRequest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePasswordRequestJsonAdapter extends f<ChangePasswordRequest> {
    private final k.a options;
    private final f<String> stringAdapter;

    public ChangePasswordRequestJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("password", "newPassword");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<String> f10 = tVar.f(String.class, g0.d(), "password");
        C17542s.i(f10, "adapter(...)");
        this.stringAdapter = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ChangePasswordRequest");
        sb2.append(')');
        return sb2.toString();
    }

    public ChangePasswordRequest fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        String str = null;
        String str2 = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                str = this.stringAdapter.fromJson(kVar);
                if (str == null) {
                    throw c.w("password", "password", kVar);
                }
            } else if (s10 == 1 && (str2 = this.stringAdapter.fromJson(kVar)) == null) {
                throw c.w("newPassword", "newPassword", kVar);
            }
        }
        kVar.f();
        if (str == null) {
            throw c.n("password", "password", kVar);
        } else if (str2 != null) {
            return new ChangePasswordRequest(str, str2);
        } else {
            throw c.n("newPassword", "newPassword", kVar);
        }
    }

    public void toJson(q qVar, ChangePasswordRequest changePasswordRequest) {
        C17542s.j(qVar, "writer");
        if (changePasswordRequest != null) {
            qVar.d();
            qVar.n("password");
            this.stringAdapter.toJson(qVar, changePasswordRequest.getPassword());
            qVar.n("newPassword");
            this.stringAdapter.toJson(qVar, changePasswordRequest.getNewPassword());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
