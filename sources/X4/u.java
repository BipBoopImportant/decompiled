package x4;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"Lx4/u;", "", "Landroid/net/Uri;", "uri", "", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f57668a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57669b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57670c;

    public u(Uri uri, String str, String str2) {
        this.f57668a = uri;
        this.f57669b = str;
        this.f57670c = str2;
    }

    public String a() {
        return this.f57669b;
    }

    public String b() {
        return this.f57670c;
    }

    public Uri c() {
        return this.f57668a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        C17542s.j(intent, "intent");
    }
}
