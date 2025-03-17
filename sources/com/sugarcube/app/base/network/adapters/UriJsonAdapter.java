package com.sugarcube.app.base.network.adapters;

import android.net.Uri;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/network/adapters/UriJsonAdapter;", "Lcom/squareup/moshi/f;", "Landroid/net/Uri;", "<init>", "()V", "Lcom/squareup/moshi/q;", "writer", "value", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Landroid/net/Uri;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Landroid/net/Uri;", "", "toString", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UriJsonAdapter extends f<Uri> {
    public static final int $stable = 0;

    public String toString() {
        return "JsonAdapter(Uri)";
    }

    public Uri fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        return Uri.parse(kVar.C1());
    }

    public void toJson(q qVar, Uri uri) {
        C17542s.j(qVar, "writer");
        qVar.N(uri != null ? uri.toString() : null);
    }
}
