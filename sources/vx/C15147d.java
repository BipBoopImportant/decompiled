package vx;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import rx.C15004a;
import rx.C15005b;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvx/d;", "Lrx/b;", "<init>", "()V", "Lx4/o;", "navController", "", "itemNo", "Lrx/a;", "mode", "LXH/N;", "h", "(Lx4/o;Ljava/lang/String;Lrx/a;)V", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vx.d  reason: case insensitive filesystem */
public final class C15147d implements C15005b {
    public void h(C8951o oVar, String str, C15004a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "mode");
        Uri build = Uri.parse(c.b("ikea://navigation/productConfigurator?itemNo={itemNo}&productConfiguratorMode={productConfiguratorMode}")).buildUpon().appendQueryParameter("itemNo", str).appendQueryParameter("productConfiguratorMode", aVar.j()).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
