package Yo;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LYo/a;", "", "<init>", "()V", "", "phoneNumber", "Landroid/content/Intent;", "a", "(Ljava/lang/String;)Landroid/content/Intent;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f89546a = new a();

    private a() {
    }

    public final Intent a(String str) {
        C17542s.j(str, "phoneNumber");
        return new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
    }
}
