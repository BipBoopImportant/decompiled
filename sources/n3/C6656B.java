package N3;

import b4.e;
import b4.k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q3.z;
import t3.N;

/* renamed from: N3.B  reason: case insensitive filesystem */
public final class C6656B {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f38725c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f38726a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f38727b = -1;

    private boolean b(String str) {
        Matcher matcher = f38725c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) N.i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) N.i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f38726a = parseInt;
            this.f38727b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f38726a == -1 || this.f38727b == -1) ? false : true;
    }

    public boolean c(z zVar) {
        for (int i10 = 0; i10 < zVar.e(); i10++) {
            z.b d10 = zVar.d(i10);
            if (d10 instanceof e) {
                e eVar = (e) d10;
                if ("iTunSMPB".equals(eVar.f45383c) && b(eVar.f45384d)) {
                    return true;
                }
            } else if (d10 instanceof k) {
                k kVar = (k) d10;
                if ("com.apple.iTunes".equals(kVar.f45396b) && "iTunSMPB".equals(kVar.f45397c) && b(kVar.f45398d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
