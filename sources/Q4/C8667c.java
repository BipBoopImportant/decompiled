package q4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import s3.a;
import t3.C5950a;

/* renamed from: q4.c  reason: case insensitive filesystem */
final class C8667c {

    /* renamed from: a  reason: collision with root package name */
    public final String f55454a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55455b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55456c;

    /* renamed from: d  reason: collision with root package name */
    public final long f55457d;

    /* renamed from: e  reason: collision with root package name */
    public final long f55458e;

    /* renamed from: f  reason: collision with root package name */
    public final C8671g f55459f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f55460g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55461h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55462i;

    /* renamed from: j  reason: collision with root package name */
    public final C8667c f55463j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f55464k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f55465l;

    /* renamed from: m  reason: collision with root package name */
    private List<C8667c> f55466m;

    private C8667c(String str, String str2, long j10, long j11, C8671g gVar, String[] strArr, String str3, String str4, C8667c cVar) {
        this.f55454a = str;
        this.f55455b = str2;
        this.f55462i = str4;
        this.f55459f = gVar;
        this.f55460g = strArr;
        this.f55456c = str2 != null;
        this.f55457d = j10;
        this.f55458e = j11;
        this.f55461h = (String) C5950a.e(str3);
        this.f55463j = cVar;
        this.f55464k = new HashMap<>();
        this.f55465l = new HashMap<>();
    }

    private void b(Map<String, C8671g> map, a.b bVar, int i10, int i11, int i12) {
        C8671g f10 = C8670f.f(this.f55459f, this.f55460g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            C8670f.a(spannableStringBuilder2, i10, i11, f10, this.f55463j, map, i12);
            if ("p".equals(this.f55454a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    bVar.m((f10.k() * -90.0f) / 100.0f);
                }
                if (f10.m() != null) {
                    bVar.p(f10.m());
                }
                if (f10.h() != null) {
                    bVar.j(f10.h());
                }
            }
        }
    }

    public static C8667c c(String str, long j10, long j11, C8671g gVar, String[] strArr, String str2, String str3, C8667c cVar) {
        return new C8667c(str, (String) null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static C8667c d(String str) {
        return new C8667c((String) null, C8670f.b(str), -9223372036854775807L, -9223372036854775807L, (C8671g) null, (String[]) null, "", (String) null, (C8667c) null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C8665a aVar : (C8665a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C8665a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == 10) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == 10) {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f55454a);
        boolean equals2 = "div".equals(this.f55454a);
        if (z10 || equals || (equals2 && this.f55462i != null)) {
            long j10 = this.f55457d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f55458e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f55466m != null) {
            for (int i10 = 0; i10 < this.f55466m.size(); i10++) {
                this.f55466m.get(i10).i(treeSet, z10 || equals);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C5950a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f55461h)) {
            str = this.f55461h;
        }
        if (!m(j10) || !"div".equals(this.f55454a) || this.f55462i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f55462i));
    }

    private void o(long j10, Map<String, C8671g> map, Map<String, C8669e> map2, String str, Map<String, a.b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f55461h) ? str : this.f55461h;
            Iterator<Map.Entry<String, Integer>> it = this.f55465l.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                if (this.f55464k.containsKey(str3)) {
                    i10 = this.f55464k.get(str3).intValue();
                }
                int i11 = i10;
                int intValue = ((Integer) next.getValue()).intValue();
                if (i11 != intValue) {
                    b(map, (a.b) C5950a.e(map3.get(str3)), i11, intValue, ((C8669e) C5950a.e(map2.get(str2))).f55490j);
                } else {
                    Map<String, C8669e> map4 = map2;
                    Map<String, a.b> map5 = map3;
                }
            }
            Map<String, C8669e> map6 = map2;
            Map<String, a.b> map7 = map3;
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
                Map<String, C8669e> map8 = map2;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, a.b> map) {
        this.f55464k.clear();
        this.f55465l.clear();
        if (!"metadata".equals(this.f55454a)) {
            if (!"".equals(this.f55461h)) {
                str = this.f55461h;
            }
            if (this.f55456c && z10) {
                k(str, map).append((CharSequence) C5950a.e(this.f55455b));
            } else if ("br".equals(this.f55454a) && z10) {
                k(str, map).append(10);
            } else if (m(j10)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f55464k.put((String) next.getKey(), Integer.valueOf(((CharSequence) C5950a.e(((a.b) next.getValue()).e())).length()));
                }
                boolean equals = "p".equals(this.f55454a);
                for (int i10 = 0; i10 < g(); i10++) {
                    f(i10).p(j10, z10 || equals, str, map);
                }
                if (equals) {
                    C8670f.c(k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f55465l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) C5950a.e(((a.b) next2.getValue()).e())).length()));
                }
            }
        }
    }

    public void a(C8667c cVar) {
        if (this.f55466m == null) {
            this.f55466m = new ArrayList();
        }
        this.f55466m.add(cVar);
    }

    public C8667c f(int i10) {
        List<C8667c> list = this.f55466m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<C8667c> list = this.f55466m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<a> h(long j10, Map<String, C8671g> map, Map<String, C8669e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        n(j10, this.f55461h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j11 = j10;
        p(j11, false, this.f55461h, treeMap);
        o(j11, map, map2, this.f55461h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C8669e eVar = (C8669e) C5950a.e(map2.get(pair.first));
                arrayList2.add(new a.b().f(decodeByteArray).k(eVar.f55482b).l(0).h(eVar.f55483c, 0).i(eVar.f55485e).n(eVar.f55486f).g(eVar.f55487g).r(eVar.f55490j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C8669e eVar2 = (C8669e) C5950a.e(map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) C5950a.e(bVar.e()));
            bVar.h(eVar2.f55483c, eVar2.f55484d);
            bVar.i(eVar2.f55485e);
            bVar.k(eVar2.f55482b);
            bVar.n(eVar2.f55486f);
            bVar.q(eVar2.f55489i, eVar2.f55488h);
            bVar.r(eVar2.f55490j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f55460g;
    }

    public boolean m(long j10) {
        long j11 = this.f55457d;
        return (j11 == -9223372036854775807L && this.f55458e == -9223372036854775807L) || (j11 <= j10 && this.f55458e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f55458e) || (j11 <= j10 && j10 < this.f55458e));
    }
}
