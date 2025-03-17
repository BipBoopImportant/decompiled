package Vx;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LVx/b;", "LVx/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "notificationId", "", "contentUri", "Landroid/app/PendingIntent;", "a", "(ILjava/lang/String;)Landroid/app/PendingIntent;", "Landroid/content/Context;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f117448a;

    public b(Context context) {
        C17542s.j(context, "context");
        this.f117448a = context;
    }

    public PendingIntent a(int i10, String str) {
        C17542s.j(str, "contentUri");
        PendingIntent activity = PendingIntent.getActivity(this.f117448a, i10, new Intent("android.intent.action.VIEW", Uri.parse(str)), 201326592);
        C17542s.i(activity, "getActivity(...)");
        return activity;
    }
}
