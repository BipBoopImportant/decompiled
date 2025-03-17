package bk;

import android.content.Context;
import androidx.security.crypto.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lbk/a;", "Lbk/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/security/crypto/b;", "a", "()Landroidx/security/crypto/b;", "Landroid/content/Context;", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bk.a  reason: case insensitive filesystem */
public final class C11100a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f90460a;

    public C11100a(Context context) {
        C17542s.j(context, "context");
        this.f90460a = context;
    }

    public b a() {
        b a10 = new b.C0765b(this.f90460a).b(b.c.AES256_GCM).a();
        C17542s.i(a10, "build(...)");
        return a10;
    }
}
