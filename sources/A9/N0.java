package a9;

import HJ.C15854t;
import XH.C16807N;
import XH.v;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset;
import com.contentsquare.android.sdk.C7153u;
import com.contentsquare.android.sdk.E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17642l;
import org.json.JSONException;
import org.json.JSONObject;

public final class N0 extends C17544u implements C17642l<v<? extends String, ? extends String>, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f42157c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7153u f42158d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M f42159e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ M f42160f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N0(E e10, C7153u uVar, M m10, M m11) {
        super(1);
        this.f42157c = e10;
        this.f42158d = uVar;
        this.f42159e = m10;
        this.f42160f = m11;
    }

    public final Object invoke(Object obj) {
        M m10;
        int i10;
        v vVar = (v) obj;
        C17542s.j(vVar, "result");
        if (!C17542s.e(vVar, L0.f42117d)) {
            String str = (String) vVar.a();
            String str2 = (String) vVar.b();
            if (str != null) {
                H h10 = this.f42157c.f46946b;
                synchronized (h10) {
                    try {
                        C17542s.j(str, "serializationId");
                        C17542s.j(str2, "dom");
                        h10.f42028c.f("Start dom replacement for " + str + " serialization id.");
                        while (true) {
                            if (h10.f42027b >= 10) {
                                break;
                            }
                            M0 m02 = h10.f42026a;
                            m02.getClass();
                            C17542s.j(str, "serializationId");
                            Collection<WebViewAsset> values = m02.f42139a.values();
                            C17542s.i(values, "cache.values");
                            ArrayList arrayList = new ArrayList();
                            for (T next : values) {
                                if (C17542s.e(((WebViewAsset) next).f46864g, str)) {
                                    arrayList.add(next);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                if (!C15854t.G(((WebViewAsset) next2).f46860c, ".css", false, 2, (Object) null)) {
                                    arrayList2.add(next2);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                h10.f42028c.f("Assets in cache, replacement will start");
                                Iterator it2 = arrayList2.iterator();
                                String str3 = str2;
                                while (it2.hasNext()) {
                                    WebViewAsset webViewAsset = (WebViewAsset) it2.next();
                                    str3 = C15854t.Q(str3, webViewAsset.f46859b, "cs://resources/" + webViewAsset.f46862e, false, 4, (Object) null);
                                }
                                str2 = str3;
                            } else {
                                Thread.sleep(500);
                                h10.f42027b++;
                                h10.f42028c.f("Assets not in cache for " + str + ", wait and retry");
                            }
                        }
                        h10.f42027b = 0;
                    } finally {
                    }
                }
            }
            try {
                this.f42158d.f47642d = new JSONObject(str2);
                this.f42158d.f47645g = 2;
            } catch (JSONException e10) {
                H1.a(this.f42157c.f46947c, "Failed to serialize WebView result callback to JSON", e10);
                this.f42159e.f144346a++;
            }
            m10 = this.f42160f;
            i10 = m10.f144346a - 1;
        } else {
            M m11 = this.f42160f;
            m11.f144346a--;
            m10 = this.f42159e;
            i10 = m10.f144346a + 1;
        }
        m10.f144346a = i10;
        if (this.f42160f.f144346a == 0) {
            this.f42157c.b(this.f42159e.f144346a);
        }
        return C16807N.f139792a;
    }
}
