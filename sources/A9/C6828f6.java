package a9;

import YH.C16870n;
import YH.C16877v;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import w8.e;

/* renamed from: a9.f6  reason: case insensitive filesystem */
public final class C6828f6 implements W2 {

    /* renamed from: b  reason: collision with root package name */
    public static final C6854j0 f42564b = new C6854j0(new C6949v0());

    /* renamed from: a  reason: collision with root package name */
    public final String f42565a;

    public C6828f6(View view, e eVar) {
        C17542s.j(view, "containerView");
        C17542s.j(eVar, "view");
        String a10 = f42564b.a(view);
        C17542s.j(eVar, "view");
        ArrayList arrayList = new ArrayList();
        C6788a6.a(eVar, arrayList);
        this.f42565a = C16870n.C0(new String[]{a10, C16877v.G0(arrayList, ">", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)}, ">", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public final String a() {
        return this.f42565a;
    }

    public final String b() {
        return "null";
    }
}
