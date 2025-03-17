package com.afterpay.android.view;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/afterpay/android/view/l;", "", "<init>", "()V", "Companion", "a", "b", "c", "Lcom/afterpay/android/view/l$a;", "Lcom/afterpay/android/view/l$c;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
abstract class l {
    public static final b Companion = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/afterpay/android/view/l$a;", "Lcom/afterpay/android/view/l;", "<init>", "()V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46079a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/afterpay/android/view/l$b;", "", "<init>", "()V", "Landroid/net/Uri;", "url", "Lcom/afterpay/android/view/l;", "a", "(Landroid/net/Uri;)Lcom/afterpay/android/view/l;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(Uri uri) {
            C17542s.j(uri, "url");
            String queryParameter = uri.getQueryParameter("status");
            if (queryParameter == null) {
                return null;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != -1149187101) {
                if (hashCode == -1031784143 && queryParameter.equals("CANCELLED")) {
                    return a.f46079a;
                }
                return null;
            } else if (!queryParameter.equals("SUCCESS")) {
                return null;
            } else {
                String queryParameter2 = uri.getQueryParameter("orderToken");
                if (queryParameter2 == null) {
                    queryParameter2 = uri.getQueryParameter("token");
                }
                if (queryParameter2 != null) {
                    return new c(queryParameter2);
                }
                return null;
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/afterpay/android/view/l$c;", "Lcom/afterpay/android/view/l;", "", "orderToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c extends l {

        /* renamed from: a  reason: collision with root package name */
        private final String f46080a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "orderToken");
            this.f46080a = str;
        }

        public final String a() {
            return this.f46080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f46080a, ((c) obj).f46080a);
        }

        public int hashCode() {
            return this.f46080a.hashCode();
        }

        public String toString() {
            return "Success(orderToken=" + this.f46080a + ')';
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private l() {
    }
}
