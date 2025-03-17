package KD;

import HJ.C15854t;
import Oo.b;
import XH.C16807N;
import XH.t;
import aA.C13909a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import fI.C17221b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import ow.h;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import v2.C6161f;
import v2.C6164i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LKD/b;", "Low/h;", "LaA/a;", "sessionManager", "Landroid/content/Context;", "context", "<init>", "(LaA/a;Landroid/content/Context;)V", "LKD/b$a;", "shortcut", "Landroid/content/Intent;", "c", "(LKD/b$a;)Landroid/content/Intent;", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LaA/a;", "b", "Landroid/content/Context;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KD.b  reason: case insensitive filesystem */
public final class C13144b implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13909a f111624a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f111625b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LKD/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "FAMILY_CARD", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KD.b$a */
    public enum a {
        FAMILY_CARD("FAMILY_CARD");
        
        private final String value;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KD.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C2720b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111626a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FAMILY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111626a = iArr;
        }
    }

    public C13144b(C13909a aVar, Context context) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(context, "context");
        this.f111624a = aVar;
        this.f111625b = context;
    }

    public Object a(C17164e<? super C16807N> eVar) {
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Setting up shortcuts: loggedIn=" + this.f111624a.isLoggedIn() + " and family=" + this.f111624a.i(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C13144b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar2, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (this.f111624a.isLoggedIn() && this.f111624a.i()) {
            a aVar = a.FAMILY_CARD;
            C6161f a11 = new C6161f.b(this.f111625b, aVar.b()).e(this.f111625b.getString(b.f84326A8)).b(IconCompat.d(this.f111625b, C10027d.f75282m)).c(c(aVar)).a();
            C17542s.i(a11, "build(...)");
            C6164i.f(this.f111625b, a11);
        }
        return C16807N.f139792a;
    }

    public final Intent c(a aVar) {
        C17542s.j(aVar, "shortcut");
        if (C2720b.f111626a[aVar.ordinal()] == 1) {
            return new Intent("android.intent.action.VIEW", Uri.parse("https://www.ikea.com/ikeaapp/profile/familycard"));
        }
        throw new t();
    }
}
