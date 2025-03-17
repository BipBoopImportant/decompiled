package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kb.C9968w;
import s3.f;
import s3.h;
import t3.C5950a;
import t3.N;

final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f43392a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f43393a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f43394b;

        private b(String str, Map<String, String> map) {
            this.f43393a = str;
            this.f43394b = map;
        }
    }

    private static final class c {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator<c> f43395e = new x();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final Comparator<c> f43396f = new y();

        /* renamed from: a  reason: collision with root package name */
        public final int f43397a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43398b;

        /* renamed from: c  reason: collision with root package name */
        public final String f43399c;

        /* renamed from: d  reason: collision with root package name */
        public final String f43400d;

        /* access modifiers changed from: private */
        public static /* synthetic */ int e(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f43398b, cVar.f43398b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f43399c.compareTo(cVar2.f43399c);
            return compareTo != 0 ? compareTo : cVar.f43400d.compareTo(cVar2.f43400d);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int f(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f43397a, cVar.f43397a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f43399c.compareTo(cVar.f43399c);
            return compareTo != 0 ? compareTo : cVar2.f43400d.compareTo(cVar.f43400d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f43397a = i10;
            this.f43398b = i11;
            this.f43399c = str;
            this.f43400d = str2;
        }
    }

    private static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f43401a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List<c> f43402b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", C9968w.n());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), C9968w.n());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(C6992a.a("bg_" + intValue2), N.G("background-color:%s;", C6992a.b(intValue2)));
        }
        SparseArray<d> c10 = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, keyAt)));
            d dVar = c10.get(keyAt);
            Collections.sort(dVar.f43402b, c.f43396f);
            for (c cVar : dVar.f43402b) {
                sb2.append(cVar.f43400d);
            }
            Collections.sort(dVar.f43401a, c.f43395e);
            for (c cVar2 : dVar.f43401a) {
                sb2.append(cVar2.f43399c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f43392a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e10 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e10 != null) {
                C5950a.e(d10);
                c cVar = new c(spanStart, spanEnd, e10, d10);
                f(sparseArray, spanStart).f43401a.add(cVar);
                f(sparseArray, spanEnd).f43402b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof s3.d) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof h)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof f) {
                return "<rt>" + b(((f) obj).f29087a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return N.G("<span style='color:%s;'>", C6992a.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return N.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof s3.d) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return N.G("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? (float) absoluteSizeSpan.getSize() : ((float) absoluteSizeSpan.getSize()) / f10));
        } else if (obj instanceof RelativeSizeSpan) {
            return N.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return N.G("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof f) {
                int i10 = ((f) obj).f29088b;
                if (i10 == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i10 == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i10 != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof h)) {
                    return null;
                }
                h hVar = (h) obj;
                return N.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(hVar.f29092a, hVar.f29093b), g(hVar.f29094c));
            }
        }
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
