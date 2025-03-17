package a9;

import YH.C16877v;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset;
import d9.C7753A;
import d9.C7756b;
import d9.C7757c;
import d9.C7761g;
import d9.C7779z;
import d9.F;
import java.util.ArrayList;
import java.util.List;
import jd.C9898a;
import kotlin.jvm.internal.C17542s;

public final class U0 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final List<WebViewAsset> f42317b;

    public U0(ArrayList arrayList) {
        C17542s.j(arrayList, "assets");
        this.f42317b = arrayList;
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7757c.a aVar = C7757c.f50776b;
        C7753A.a m10 = C7753A.m();
        C17542s.i(m10, "newBuilder()");
        C7757c a11 = aVar.a(m10);
        C9898a c10 = a11.c();
        List<WebViewAsset> list = this.f42317b;
        ArrayList arrayList = new ArrayList(C16877v.y(list, 10));
        for (WebViewAsset webViewAsset : list) {
            C7756b.a aVar2 = C7756b.f50774b;
            C7779z.a k10 = C7779z.k();
            C17542s.i(k10, "newBuilder()");
            C7756b a12 = aVar2.a(k10);
            a12.b(webViewAsset.f46858a);
            String str = webViewAsset.f46862e;
            C17542s.g(str);
            a12.c(str);
            arrayList.add(a12.a());
        }
        a11.b(c10, arrayList);
        a10.c(a11.a());
        return a10.a();
    }
}
