package Zj;

import XH.C16814e;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZj/c;", "LZj/g;", "Landroid/content/Context;", "context", "", "fileName", "Landroidx/security/crypto/b;", "masterKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/security/crypto/b;)V", "Landroid/content/SharedPreferences;", "j", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;", "c", "Landroidx/security/crypto/b;", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public final class c extends g {

    /* renamed from: c  reason: collision with root package name */
    private final b f89916c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, b bVar) {
        super(context, str);
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        C17542s.j(bVar, "masterKey");
        this.f89916c = bVar;
    }

    public SharedPreferences j(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        SharedPreferences a10 = a.a(context, str, this.f89916c, a.d.AES256_SIV, a.e.AES256_GCM);
        C17542s.i(a10, "create(...)");
        return a10;
    }
}
