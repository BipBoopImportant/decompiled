package Zj;

import android.content.Context;
import androidx.security.crypto.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZj/e;", "LZj/d;", "Landroid/content/Context;", "context", "Landroidx/security/crypto/b;", "masterKey", "<init>", "(Landroid/content/Context;Landroidx/security/crypto/b;)V", "", "fileName", "LZj/h;", "a", "(Ljava/lang/String;)LZj/h;", "Landroid/content/Context;", "b", "Landroidx/security/crypto/b;", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89917a;

    /* renamed from: b  reason: collision with root package name */
    private final b f89918b;

    public e(Context context, b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "masterKey");
        this.f89917a = context;
        this.f89918b = bVar;
    }

    public h a(String str) {
        C17542s.j(str, "fileName");
        return new c(this.f89917a, str, this.f89918b);
    }
}
