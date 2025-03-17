package a9;

import D8.c;
import G8.g;
import HJ.C15838d;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import a9.C1;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

/* renamed from: a9.t1  reason: case insensitive filesystem */
public final class C6934t1 {

    /* renamed from: c  reason: collision with root package name */
    public static final c f42863c = new c("CssProcessor");

    /* renamed from: a  reason: collision with root package name */
    public final C1 f42864a;

    /* renamed from: b  reason: collision with root package name */
    public final C6879m1 f42865b;

    public C6934t1(C1 c12, C6879m1 m1Var) {
        C17542s.j(c12, "cssUtil");
        C17542s.j(m1Var, "cssDependencyResolver");
        this.f42864a = c12;
        this.f42865b = m1Var;
    }

    public final ArrayList a(ArrayList arrayList, ArrayList arrayList2) {
        Object obj;
        List<String> list;
        Object obj2;
        String str;
        List<C1.a> list2;
        C1.a a10;
        byte[] bArr;
        ArrayList arrayList3 = arrayList2;
        C17542s.j(arrayList, "cssAssets");
        C17542s.j(arrayList3, "processedDataAssets");
        Map c10 = X.c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WebViewAsset webViewAsset = (WebViewAsset) it.next();
            String str2 = webViewAsset.f46859b;
            WebViewAssetContent webViewAssetContent = webViewAsset.f46861d;
            if (!(webViewAssetContent == null || (bArr = webViewAssetContent.f46875c) == null)) {
                c10.put(str2, new String(bArr, C15838d.f135279b));
            }
        }
        Map b10 = X.b(c10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(b10.size()));
        Iterator it2 = b10.entrySet().iterator();
        while (true) {
            int i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            String str3 = (String) entry.getValue();
            this.f42864a.getClass();
            C17542s.j(str3, "css");
            ArrayList arrayList4 = new ArrayList();
            while (i10 < str3.length() && ((a10 = C1.a(i10, str3, "@import ", ";")) != null || (a10 = C1.a(i10, str3, "url(", ")")) != null)) {
                arrayList4.add(a10);
                i10 = a10.f41943c;
            }
            linkedHashMap.put(key, arrayList4);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(X.e(linkedHashMap.size()));
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            obj = null;
            if (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                Object key2 = entry2.getKey();
                ArrayList arrayList5 = new ArrayList();
                for (Object next : (List) entry2.getValue()) {
                    if (C15854t.G(((C1.a) next).f41941a, ".css", false, 2, (Object) null)) {
                        arrayList5.add(next);
                    }
                    ArrayList arrayList6 = arrayList;
                }
                ArrayList arrayList7 = new ArrayList(C16877v.y(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((C1.a) it4.next()).f41941a);
                }
                linkedHashMap2.put(key2, arrayList7);
                ArrayList arrayList8 = arrayList;
            } else {
                try {
                    break;
                } catch (IllegalArgumentException e10) {
                    c cVar = f42863c;
                    H1.a(cVar, "Failed to process CSS assets", e10);
                    cVar.f("Failed to process CSS assets, a circular dependency has been detected.");
                    list = C16877v.n();
                }
            }
        }
        this.f42865b.getClass();
        C17542s.j(linkedHashMap2, "dependencyMap");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList9 = new ArrayList();
        for (String str4 : linkedHashMap2.keySet()) {
            if (!linkedHashSet.contains(str4)) {
                C6879m1.a(linkedHashSet, linkedHashMap2, arrayList9, str4);
            }
        }
        list = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        for (String str5 : list) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = obj;
                    break;
                }
                obj2 = it5.next();
                if (C17542s.e(((WebViewAsset) obj2).f46859b, str5)) {
                    break;
                }
            }
            WebViewAsset webViewAsset2 = (WebViewAsset) obj2;
            if (!(webViewAsset2 == null || (str = (String) b10.get(str5)) == null || (list2 = (List) linkedHashMap.get(str5)) == null)) {
                String str6 = webViewAsset2.f46858a;
                List V02 = C16877v.V0(arrayList3, arrayList10);
                ArrayList arrayList11 = new ArrayList();
                for (Object next2 : V02) {
                    if (C17542s.e(((WebViewAsset) next2).f46860c, str6)) {
                        arrayList11.add(next2);
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList11, 10)), 16));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    WebViewAsset webViewAsset3 = (WebViewAsset) it6.next();
                    String str7 = webViewAsset3.f46859b;
                    v a11 = C16796C.a(str7, "cs://resources/" + webViewAsset3.f46862e);
                    linkedHashMap3.put(a11.c(), a11.d());
                }
                this.f42864a.getClass();
                C17542s.j(str, "css");
                C17542s.j(linkedHashMap3, "replacements");
                C17542s.j(list2, "urls");
                if (!list2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    for (C1.a aVar : list2) {
                        String str8 = (String) linkedHashMap3.get(aVar.f41941a);
                        if (str8 == null) {
                            str8 = aVar.f41941a;
                        }
                        String substring = str.substring(i11, aVar.f41942b);
                        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append(str8);
                        i11 = aVar.f41943c;
                    }
                    String substring2 = str.substring(i11);
                    C17542s.i(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    str = sb2.toString();
                    C17542s.i(str, "replacedCss.toString()");
                }
                WebViewAssetContent webViewAssetContent2 = new WebViewAssetContent(g.n(str));
                WebViewAsset webViewAsset4 = new WebViewAsset(webViewAsset2.f46858a + '#' + webViewAsset2.f46864g, webViewAsset2.f46859b, webViewAsset2.f46860c, webViewAssetContent2);
                webViewAsset4.f46864g = webViewAsset2.f46864g;
                arrayList10.add(webViewAsset4);
                obj = null;
            }
        }
        return arrayList10;
    }
}
