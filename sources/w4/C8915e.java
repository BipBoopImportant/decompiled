package w4;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import q3.A;
import q3.C5807s;
import t3.C5950a;
import t3.N;

/* renamed from: w4.e  reason: case insensitive filesystem */
public class C8915e implements E {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f57093a;

    public C8915e(Resources resources) {
        this.f57093a = (Resources) C5950a.e(resources);
    }

    private String b(C5807s sVar) {
        int i10 = sVar.f28219D;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f57093a.getString(C8910B.f56983B) : i10 != 8 ? this.f57093a.getString(C8910B.f56982A) : this.f57093a.getString(C8910B.f56984C) : this.f57093a.getString(C8910B.f57012z) : this.f57093a.getString(C8910B.f57003q);
    }

    private String c(C5807s sVar) {
        int i10 = sVar.f28239j;
        return i10 == -1 ? "" : this.f57093a.getString(C8910B.f57002p, new Object[]{Float.valueOf(((float) i10) / 1000000.0f)});
    }

    private String d(C5807s sVar) {
        return TextUtils.isEmpty(sVar.f28231b) ? "" : sVar.f28231b;
    }

    private String e(C5807s sVar) {
        String j10 = j(f(sVar), h(sVar));
        return TextUtils.isEmpty(j10) ? d(sVar) : j10;
    }

    private String f(C5807s sVar) {
        String str = sVar.f28233d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale V10 = N.V();
        String displayName = forLanguageTag.getDisplayName(V10);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(V10) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(C5807s sVar) {
        int i10 = sVar.f28251v;
        int i11 = sVar.f28252w;
        return (i10 == -1 || i11 == -1) ? "" : this.f57093a.getString(C8910B.f57004r, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    private String h(C5807s sVar) {
        String string = (sVar.f28235f & 2) != 0 ? this.f57093a.getString(C8910B.f57005s) : "";
        if ((sVar.f28235f & 4) != 0) {
            string = j(string, this.f57093a.getString(C8910B.f57008v));
        }
        if ((sVar.f28235f & 8) != 0) {
            string = j(string, this.f57093a.getString(C8910B.f57007u));
        }
        return (sVar.f28235f & 1088) != 0 ? j(string, this.f57093a.getString(C8910B.f57006t)) : string;
    }

    private static int i(C5807s sVar) {
        int k10 = A.k(sVar.f28244o);
        if (k10 != -1) {
            return k10;
        }
        if (A.m(sVar.f28240k) != null) {
            return 2;
        }
        if (A.c(sVar.f28240k) != null) {
            return 1;
        }
        if (sVar.f28251v == -1 && sVar.f28252w == -1) {
            return (sVar.f28219D == -1 && sVar.f28220E == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f57093a.getString(C8910B.f57001o, new Object[]{str, str2});
            }
        }
        return str;
    }

    public String a(C5807s sVar) {
        int i10 = i(sVar);
        String j10 = i10 == 2 ? j(h(sVar), g(sVar), c(sVar)) : i10 == 1 ? j(e(sVar), b(sVar), c(sVar)) : e(sVar);
        if (j10.length() != 0) {
            return j10;
        }
        String str = sVar.f28233d;
        return (str == null || str.trim().isEmpty()) ? this.f57093a.getString(C8910B.f56985D) : this.f57093a.getString(C8910B.f56986E, new Object[]{str});
    }
}
