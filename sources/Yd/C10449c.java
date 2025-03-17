package yd;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.gson.m;
import jI.C17431r;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "Lyd/b;", "a", "(Landroid/content/Context;)Lyd/b;", "", "Ljava/lang/String;", "getConfigFileName", "()Ljava/lang/String;", "configFileName", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.c  reason: case insensitive filesystem */
public final class C10449c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f77916a = "config_release.json";

    public static final C10448b a(Context context) {
        C17542s.j(context, "context");
        try {
            AssetManager assets = context.getAssets();
            InputStream open = assets.open("config/" + f77916a);
            C17542s.i(open, "open(...)");
            String asString = m.d(C17431r.h(new InputStreamReader(open))).getAsJsonObject().get("supportedStatus").getAsString();
            C17542s.g(asString);
            return new C10448b(asString);
        } catch (Exception e10) {
            Log.e("Config", "Failed to serialize config file", e10);
            return null;
        }
    }
}
