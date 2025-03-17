package Ef;

import HJ.C15854t;
import N1.C4669d;
import N1.D;
import N1.G;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import Y1.k;
import Y1.o;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.g1;
import r1.g;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LEf/a;", "", "<init>", "()V", "", "suggestion", "query", "LtI/j;", "d", "(Ljava/lang/String;Ljava/lang/String;)LtI/j;", "", "e", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "", "b", "(LtI/j;)Z", "c", "LN1/d;", "a", "(Ljava/lang/String;Ljava/lang/String;)LN1/d;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60214a = new a();

    private a() {
    }

    private final boolean b(C17974j jVar) {
        if (jVar != null) {
            int q10 = jVar.q();
            int p10 = jVar.p();
            return p10 >= 0 && p10 <= q10;
        }
    }

    private final C17974j d(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C17542s.i(lowerCase, "toLowerCase(...)");
        String e10 = e(lowerCase);
        String lowerCase2 = str2.toLowerCase(locale);
        C17542s.i(lowerCase2, "toLowerCase(...)");
        int s02 = C15854t.s0(e10, e(lowerCase2), 0, true, 2, (Object) null);
        if (s02 != -1) {
            return new C17974j(s02, (str2.length() + s02) - 1);
        }
        return null;
    }

    private final String e(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            Character ch2 = (Character) b.f60215a.get(Character.valueOf(charAt));
            if (ch2 != null) {
                charAt = ch2.charValue();
            }
            arrayList.add(Character.valueOf(charAt));
        }
        return C16877v.G0(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public final C4669d a(String str, String str2) {
        String str3 = str;
        C17542s.j(str3, "suggestion");
        C17542s.j(str2, "query");
        C17974j c10 = c(str, str2);
        if (c10 == null || !b(c10)) {
            return new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        aVar.j(str3);
        aVar.d(new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null), c10.p(), c10.q() + 1);
        return aVar.q();
    }

    public final C17974j c(String str, String str2) {
        C17542s.j(str, "suggestion");
        C17542s.j(str2, "query");
        C17974j d10 = d(str, str2);
        if (d10 == null) {
            return C15854t.l0(str);
        }
        if (C17542s.e(d10, C15854t.l0(str))) {
            return null;
        }
        return d10.q() == C15854t.m0(str) ? C17978n.w(0, d10.p()) : new C17974j(d10.q() + 1, C15854t.m0(str));
    }
}
