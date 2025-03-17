package Gp;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"LGp/g;", "", "", "image", "title", "message", "privacyPolicyLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "e", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f81184e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f81185a;

    /* renamed from: b  reason: collision with root package name */
    private final String f81186b;

    /* renamed from: c  reason: collision with root package name */
    private final String f81187c;

    /* renamed from: d  reason: collision with root package name */
    private final String f81188d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LGp/g$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "LGp/g;", "a", "(Landroid/os/Bundle;)LGp/g;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Bundle bundle) {
            C17542s.j(bundle, "bundle");
            String string = bundle.getString("image");
            if (string != null) {
                String string2 = bundle.getString("title");
                if (string2 != null) {
                    String string3 = bundle.getString("message");
                    if (string3 != null) {
                        String string4 = bundle.getString("privacyPolicyLink");
                        if (string4 != null) {
                            return new g(string, string2, string3, string4);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private a() {
        }
    }

    public g(String str, String str2, String str3, String str4) {
        C17542s.j(str, "image");
        C17542s.j(str2, "title");
        C17542s.j(str3, "message");
        C17542s.j(str4, "privacyPolicyLink");
        this.f81185a = str;
        this.f81186b = str2;
        this.f81187c = str3;
        this.f81188d = str4;
    }

    public final String a() {
        return this.f81185a;
    }

    public final String b() {
        return this.f81187c;
    }

    public final String c() {
        return this.f81188d;
    }

    public final String d() {
        return this.f81186b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f81185a, gVar.f81185a) && C17542s.e(this.f81186b, gVar.f81186b) && C17542s.e(this.f81187c, gVar.f81187c) && C17542s.e(this.f81188d, gVar.f81188d);
    }

    public int hashCode() {
        return (((((this.f81185a.hashCode() * 31) + this.f81186b.hashCode()) * 31) + this.f81187c.hashCode()) * 31) + this.f81188d.hashCode();
    }

    public String toString() {
        String str = this.f81185a;
        String str2 = this.f81186b;
        String str3 = this.f81187c;
        String str4 = this.f81188d;
        return "EthicsDetailsArgs(image=" + str + ", title=" + str2 + ", message=" + str3 + ", privacyPolicyLink=" + str4 + ")";
    }
}
