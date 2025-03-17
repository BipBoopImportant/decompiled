package ii;

import Ae.e;
import XH.C16796C;
import YH.X;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lii/A0;", "Lii/z0;", "Landroid/content/Context;", "context", "LAe/e;", "analytics", "<init>", "(Landroid/content/Context;LAe/e;)V", "", "urlFor3dModel", "itemNo", "errorString", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "Landroid/content/Context;", "c", "LAe/e;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class A0 implements z0 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f74677b;

    /* renamed from: c  reason: collision with root package name */
    private final e f74678c;

    public A0(Context context, e eVar) {
        C17542s.j(context, "context");
        C17542s.j(eVar, "analytics");
        this.f74677b = context;
        this.f74678c = eVar;
    }

    public void a(String str, String str2, String str3) {
        C17542s.j(str, "urlFor3dModel");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "errorString");
        Uri build = Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon().appendQueryParameter("file", str).appendQueryParameter("resizable", "false").build();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(build);
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setFlags(268435456);
        try {
            this.f74677b.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.f74677b, str3, 1).show();
        }
        e.c.b(this.f74678c, Interaction$Component.PIP_3D_BUTTON, (String) null, X.f(C16796C.a("item_id", str2)), (e.b) null, 10, (Object) null);
    }
}
