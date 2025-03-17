package cF;

import HJ.C15854t;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0017\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "c", "(Landroid/net/Uri;)Landroid/net/Uri;", "Landroid/net/Uri$Builder;", "a", "(Ljava/lang/String;)Landroid/net/Uri$Builder;", "Landroidx/fragment/app/o;", "b", "(Landroidx/fragment/app/o;)Landroid/net/Uri;", "deeplinkUri", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.c  reason: case insensitive filesystem */
public final class C14041c {
    public static final Uri.Builder a(String str) {
        C17542s.j(str, "<this>");
        Uri.Builder buildUpon = Uri.parse(d(str.toString())).buildUpon();
        C17542s.i(buildUpon, "buildUpon(...)");
        return buildUpon;
    }

    public static final Uri b(C5187o oVar) {
        String str;
        Intent intent;
        Uri data;
        Uri data2;
        C17542s.j(oVar, "<this>");
        Bundle arguments = oVar.getArguments();
        Intent intent2 = (Intent) (arguments != null ? arguments.get("android-support-nav:controller:deepLinkIntent") : null);
        if (intent2 == null || (data2 = intent2.getData()) == null || (str = data2.toString()) == null) {
            C5191t activity = oVar.getActivity();
            str = (activity == null || (intent = activity.getIntent()) == null || (data = intent.getData()) == null) ? null : data.toString();
        }
        if (str == null) {
            return null;
        }
        if (!C15854t.W(str, "ikea://", false, 2, (Object) null)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public static final Uri c(Uri uri) {
        C17542s.j(uri, "<this>");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        Uri parse = Uri.parse(d(uri2));
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    public static final String d(String str) {
        C17542s.j(str, "<this>");
        return C15854t.t1(str, "?", (String) null, 2, (Object) null);
    }
}
