package s4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.optimizely.ab.config.audience.match.MatchRegistry;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.maplibre.android.log.Logger;
import s3.a;
import s3.f;
import s3.g;
import s3.i;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f55829a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f55830b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Integer> f55831c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f55832d;

    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<b> f55833c = new f();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f55834a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f55835b;

        private b(c cVar, int i10) {
            this.f55834a = cVar;
            this.f55835b = i10;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f55836a;

        /* renamed from: b  reason: collision with root package name */
        public final int f55837b;

        /* renamed from: c  reason: collision with root package name */
        public final String f55838c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f55839d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f55837b = i10;
            this.f55836a = str;
            this.f55838c = str2;
            this.f55839d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            C5950a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] h12 = N.h1(trim, "\\.");
            String str3 = h12[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < h12.length; i11++) {
                hashSet.add(h12[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final int f55840a;

        /* renamed from: b  reason: collision with root package name */
        public final c f55841b;

        public d(int i10, c cVar) {
            this.f55840a = i10;
            this.f55841b = cVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f55840a, dVar.f55840a);
        }
    }

    /* renamed from: s4.e$e  reason: collision with other inner class name */
    private static final class C0906e {

        /* renamed from: a  reason: collision with root package name */
        public long f55842a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f55843b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f55844c;

        /* renamed from: d  reason: collision with root package name */
        public int f55845d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f55846e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f55847f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f55848g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f55849h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f55850i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f55851j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f55852k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            int i11 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
            if (i11 == 0 || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return i11 != 0 ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            q.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public d a() {
            return new d(g().a(), this.f55842a, this.f55843b);
        }

        public a.b g() {
            float f10 = this.f55849h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f55845d);
            }
            int i10 = this.f55850i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f55845d);
            }
            a.b r10 = new a.b().p(c(this.f55845d)).h(b(this.f55846e, this.f55847f), this.f55847f).i(this.f55848g).k(f10).l(i10).n(Math.min(this.f55851j, d(i10, f10))).r(this.f55852k);
            CharSequence charSequence = this.f55844c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f55831c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f55832d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String next : set) {
            Map<String, Integer> map = f55831c;
            if (map.containsKey(next)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(next).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f55832d;
                if (map2.containsKey(next)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(next).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(MatchRegistry.GREATER_THAN)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals(MatchRegistry.LESS_THAN)) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                q.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<c> list2) {
        int j10 = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f55833c);
        int i10 = cVar.f55837b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f55834a.f55836a)) {
                b bVar = (b) arrayList.get(i12);
                int h10 = h(j(list2, str, bVar.f55834a), j10, 1);
                int i13 = bVar.f55834a.f55837b - i11;
                int d10 = bVar.f55835b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, d10);
                spannableStringBuilder.delete(i13, d10);
                spannableStringBuilder.setSpan(new f(subSequence.toString(), h10), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<c> list2) {
        int i10 = cVar.f55837b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f55836a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals(DslKt.INDICATOR_BACKGROUND)) {
                    c10 = 1;
                    break;
                }
                break;
            case Logger.NONE /*99*/:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f55839d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 5:
                f(spannableStringBuilder, cVar.f55838c, i10, length);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> i11 = i(list2, str, cVar);
        for (int i12 = 0; i12 < i11.size(); i12++) {
            e(spannableStringBuilder, i11.get(i12).f55841b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, c cVar, int i10, int i11) {
        if (cVar != null) {
            if (cVar.i() != -1) {
                g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
            }
            if (cVar.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (cVar.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (cVar.k()) {
                g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
            }
            if (cVar.j()) {
                g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
            }
            if (cVar.d() != null) {
                g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
            }
            int f10 = cVar.f();
            if (f10 == 1) {
                g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
            } else if (f10 == 2) {
                g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
            } else if (f10 == 3) {
                g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
            }
            if (cVar.b()) {
                spannableStringBuilder.setSpan(new s3.d(), i10, i11, 33);
            }
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new i(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar2 = list.get(i10);
            int h10 = cVar2.h(str, cVar.f55836a, cVar.f55839d, cVar.f55838c);
            if (h10 > 0) {
                arrayList.add(new d(h10, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<c> list, String str, c cVar) {
        List<d> i10 = i(list, str, cVar);
        for (int i11 = 0; i11 < i10.size(); i11++) {
            c cVar2 = i10.get(i11).f55841b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String trim = str.trim();
        C5950a.a(!trim.isEmpty());
        return N.i1(trim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(DslKt.INDICATOR_BACKGROUND)) {
                    c10 = 0;
                    break;
                }
                break;
            case Logger.NONE /*99*/:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static s3.a m(CharSequence charSequence) {
        C0906e eVar = new C0906e();
        eVar.f55844c = charSequence;
        return eVar.g().a();
    }

    private static d n(String str, Matcher matcher, B b10, List<c> list) {
        C0906e eVar = new C0906e();
        try {
            eVar.f55842a = h.c((String) C5950a.e(matcher.group(1)));
            eVar.f55843b = h.c((String) C5950a.e(matcher.group(2)));
            q((String) C5950a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String s10 = b10.s();
            while (!TextUtils.isEmpty(s10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(s10.trim());
                s10 = b10.s();
            }
            eVar.f55844c = r(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            q.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static d o(B b10, List<c> list) {
        String s10 = b10.s();
        if (s10 == null) {
            return null;
        }
        Pattern pattern = f55829a;
        Matcher matcher = pattern.matcher(s10);
        if (matcher.matches()) {
            return n((String) null, matcher, b10, list);
        }
        String s11 = b10.s();
        if (s11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(s11);
        if (matcher2.matches()) {
            return n(s10.trim(), matcher2, b10, list);
        }
        return null;
    }

    static a.b p(String str) {
        C0906e eVar = new C0906e();
        q(str, eVar);
        return eVar.g();
    }

    private static void q(String str, C0906e eVar) {
        Matcher matcher = f55830b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C5950a.e(matcher.group(1));
            String str3 = (String) C5950a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f55845d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f55851j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f55852k = x(str3);
                } else {
                    q.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                q.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    int i12 = 1;
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = g(str2, i11);
                    int i13 = i11 - 2;
                    boolean z11 = str2.charAt(i13) == '/';
                    if (z10) {
                        i12 = 2;
                    }
                    int i14 = i10 + i12;
                    if (!z11) {
                        i13 = i11 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    if (!substring.trim().isEmpty()) {
                        String k10 = k(substring);
                        if (l(k10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f55836a.equals(k10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                q.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0906e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f55848g = s(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f55846e = h.b(str);
            eVar.f55847f = 0;
            return;
        }
        eVar.f55846e = (float) Integer.parseInt(str);
        eVar.f55847f = 1;
    }

    private static int u(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                q.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0906e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f55850i = u(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f55849h = h.b(str);
    }

    private static int w(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                q.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        q.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
