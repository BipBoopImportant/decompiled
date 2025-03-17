package s3;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import t3.C5950a;
import t3.N;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29080a = N.A0(0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f29081b = N.A0(1);

    /* renamed from: c  reason: collision with root package name */
    private static final String f29082c = N.A0(2);

    /* renamed from: d  reason: collision with root package name */
    private static final String f29083d = N.A0(3);

    /* renamed from: e  reason: collision with root package name */
    private static final String f29084e = N.A0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (d b10 : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, b10, 3, (Bundle) null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f29080a, spanned.getSpanStart(obj));
        bundle2.putInt(f29081b, spanned.getSpanEnd(obj));
        bundle2.putInt(f29082c, spanned.getSpanFlags(obj));
        bundle2.putInt(f29083d, i10);
        if (bundle != null) {
            bundle2.putBundle(f29084e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f29080a);
        int i11 = bundle.getInt(f29081b);
        int i12 = bundle.getInt(f29082c);
        int i13 = bundle.getInt(f29083d, -1);
        Bundle bundle2 = bundle.getBundle(f29084e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) C5950a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) C5950a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new d(), i10, i11, i12);
        } else if (i13 == 4) {
            spannable.setSpan(i.a((Bundle) C5950a.e(bundle2)), i10, i11, i12);
        }
    }
}
