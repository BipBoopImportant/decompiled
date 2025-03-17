package EA;

import Ae.e;
import CA.C12683b;
import HJ.C15854t;
import XH.C16796C;
import XH.t;
import YH.X;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LEA/b;", "LEA/c;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "b", "()V", "a", "LCA/b;", "shareOrigin", "", "quantity", "c", "(LCA/b;I)V", "d", "(LCA/b;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EA.b  reason: case insensitive filesystem */
public final class C12827b implements C12828c {

    /* renamed from: a  reason: collision with root package name */
    private final e f109314a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EA.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f109315a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                CA.b[] r0 = CA.C12683b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                CA.b r1 = CA.C12683b.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                CA.b r1 = CA.C12683b.CART     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                CA.b r1 = CA.C12683b.PIP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f109315a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: EA.C12827b.a.<clinit>():void");
        }
    }

    public C12827b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f109314a = eVar;
    }

    public void a() {
        this.f109314a.track(C12826a.SHARE_ACCEPT.b(), (Map<String, ? extends Object>) null);
    }

    public void b() {
        this.f109314a.track(C12826a.SHARE_VIEW_ERROR.b(), (Map<String, ? extends Object>) null);
    }

    public void c(C12683b bVar, int i10) {
        String str;
        C17542s.j(bVar, "shareOrigin");
        Map f10 = X.f(C16796C.a("quantity", Integer.valueOf(i10)));
        int i11 = a.f109315a[bVar.ordinal()];
        if (i11 == 1) {
            str = C12826a.SHARE_LIST.b();
        } else if (i11 == 2) {
            str = C12826a.SHARE_CART.b();
        } else if (i11 == 3) {
            IllegalStateException illegalStateException = new IllegalStateException("Should not get share list from PIP");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            str = null;
            String str2 = null;
            String str3 = null;
            for (C11819b bVar2 : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C12827b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar2.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
        } else {
            throw new t();
        }
        if (str != null) {
            this.f109314a.track(str, f10);
        }
    }

    public void d(C12683b bVar) {
        C17542s.j(bVar, "shareOrigin");
        int i10 = a.f109315a[bVar.ordinal()];
        if (i10 == 1) {
            this.f109314a.track(C12826a.SHARE_LIST_ITEM.b(), (Map<String, ? extends Object>) null);
        } else if (i10 == 2) {
            this.f109314a.track(C12826a.SHARE_CART_ITEM.b(), (Map<String, ? extends Object>) null);
        } else if (i10 == 3) {
            this.f109314a.track(C12826a.SHARE_PIP.b(), (Map<String, ? extends Object>) null);
        } else {
            throw new t();
        }
    }
}
