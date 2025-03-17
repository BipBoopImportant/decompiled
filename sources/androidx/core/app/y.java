package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final String f21134a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f21135b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f21136c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21137d;

    /* renamed from: e  reason: collision with root package name */
    private final int f21138e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f21139f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f21140g;

    static class a {
        public static RemoteInput a(y yVar) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(yVar.i()).setLabel(yVar.h()).setChoices(yVar.e()).setAllowFreeFormInput(yVar.c()).addExtras(yVar.g());
            Set<String> d10 = yVar.d();
            if (d10 != null) {
                for (String a10 : d10) {
                    b.a(addExtras, a10, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(addExtras, yVar.f());
            }
            return addExtras.build();
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput a(y yVar) {
        return a.a(yVar);
    }

    static RemoteInput[] b(y[] yVarArr) {
        if (yVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[yVarArr.length];
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            remoteInputArr[i10] = a(yVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f21137d;
    }

    public Set<String> d() {
        return this.f21140g;
    }

    public CharSequence[] e() {
        return this.f21136c;
    }

    public int f() {
        return this.f21138e;
    }

    public Bundle g() {
        return this.f21139f;
    }

    public CharSequence h() {
        return this.f21135b;
    }

    public String i() {
        return this.f21134a;
    }

    public boolean j() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
