package ym;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"Lym/g;", "", "", "showItf", "", "code", "title", "description", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "d", "e", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f106505e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f106506a;

    /* renamed from: b  reason: collision with root package name */
    private final String f106507b;

    /* renamed from: c  reason: collision with root package name */
    private final String f106508c;

    /* renamed from: d  reason: collision with root package name */
    private final String f106509d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lym/g$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lym/g;", "a", "(Landroid/os/Bundle;)Lym/g;", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Bundle bundle) {
            C17542s.j(bundle, "bundle");
            boolean z10 = bundle.getBoolean("showItf");
            String string = bundle.getString("code");
            if (string != null) {
                String string2 = bundle.getString("title");
                if (string2 != null) {
                    String string3 = bundle.getString("description");
                    if (string3 != null) {
                        return new g(z10, string, string2, string3);
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

    public g(boolean z10, String str, String str2, String str3) {
        C17542s.j(str, "code");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
        this.f106506a = z10;
        this.f106507b = str;
        this.f106508c = str2;
        this.f106509d = str3;
    }

    public final String a() {
        return this.f106507b;
    }

    public final String b() {
        return this.f106509d;
    }

    public final boolean c() {
        return this.f106506a;
    }

    public final String d() {
        return this.f106508c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f106506a == gVar.f106506a && C17542s.e(this.f106507b, gVar.f106507b) && C17542s.e(this.f106508c, gVar.f106508c) && C17542s.e(this.f106509d, gVar.f106509d);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f106506a) * 31) + this.f106507b.hashCode()) * 31) + this.f106508c.hashCode()) * 31) + this.f106509d.hashCode();
    }

    public String toString() {
        boolean z10 = this.f106506a;
        String str = this.f106507b;
        String str2 = this.f106508c;
        String str3 = this.f106509d;
        return "DataMatrixBottomSheetArgs(showItf=" + z10 + ", code=" + str + ", title=" + str2 + ", description=" + str3 + ")";
    }
}
