package Sb;

import java.util.List;
import java.util.Map;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f63311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f63312b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f63313c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f63314d;

    public /* synthetic */ l(p pVar, String str, Map map, List list) {
        this.f63311a = pVar;
        this.f63312b = str;
        this.f63313c = map;
        this.f63314d = list;
    }

    public final void run() {
        this.f63311a.k(this.f63312b, this.f63313c, this.f63314d);
    }
}
