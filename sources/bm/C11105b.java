package bm;

import am.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbm/b;", "Lam/d;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "c", "()Landroid/content/Intent;", "b", "", "channelId", "a", "(Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/Context;", "appservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bm.b  reason: case insensitive filesystem */
public final class C11105b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f90484b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f90485a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbm/b$a;", "", "<init>", "()V", "", "PACKAGE", "Ljava/lang/String;", "appservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bm.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11105b(Context context) {
        C17542s.j(context, "context");
        this.f90485a = context;
    }

    public Intent a(String str) {
        C17542s.j(str, "channelId");
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", this.f90485a.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", str);
        return intent;
    }

    public Intent b() {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", this.f90485a.getPackageName());
        return intent;
    }

    public Intent c() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f90485a.getPackageName(), (String) null));
        return intent;
    }
}
