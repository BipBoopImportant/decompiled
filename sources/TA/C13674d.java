package TA;

import Ae.e;
import XH.C16796C;
import XH.t;
import YH.X;
import fI.C17221b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LTA/d;", "LTA/c;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "reason", "LTA/a;", "apiAnalytics", "LXH/N;", "a", "(Ljava/lang/String;LTA/a;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "b", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TA.d  reason: case insensitive filesystem */
public final class C13674d implements C13673c {

    /* renamed from: a  reason: collision with root package name */
    private final e f116649a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LTA/d$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "FETCH_RESPONSE", "FETCH_ITEMS_RESPONSE", "ADD_ITEM_RESPONSE", "UPDATE_ITEM_RESPONSE", "DELETE_ITEM_RESPONSE", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TA.d$a */
    private enum a {
        FETCH_RESPONSE("dev_only_list_fetch_response"),
        FETCH_ITEMS_RESPONSE("dev_only_list_fetch_items_response"),
        ADD_ITEM_RESPONSE("dev_only_list_add_item_response"),
        UPDATE_ITEM_RESPONSE("dev_only_list_update_item_response"),
        DELETE_ITEM_RESPONSE("dev_only_list_delete_item_response");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LTA/d$b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "RESPONSE_CODE", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TA.d$b */
    private enum b {
        RESPONSE_CODE("response_code");
        
        private final String key;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TA.d$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116650a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                TA.a[] r0 = TA.C13671a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                TA.a r1 = TA.C13671a.FETCH_LISTS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                TA.a r1 = TA.C13671a.FETCH_LIST_ITEMS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                TA.a r1 = TA.C13671a.ADD_ITEM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                TA.a r1 = TA.C13671a.UPDATE_ITEM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                TA.a r1 = TA.C13671a.DELETE_ITEM     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f116650a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: TA.C13674d.c.<clinit>():void");
        }
    }

    public C13674d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f116649a = eVar;
    }

    public void a(String str, C13671a aVar) {
        a aVar2;
        C17542s.j(str, "reason");
        C17542s.j(aVar, "apiAnalytics");
        Map f10 = X.f(C16796C.a(b.RESPONSE_CODE.b(), str));
        int i10 = c.f116650a[aVar.ordinal()];
        if (i10 == 1) {
            aVar2 = a.FETCH_RESPONSE;
        } else if (i10 == 2) {
            aVar2 = a.FETCH_ITEMS_RESPONSE;
        } else if (i10 == 3) {
            aVar2 = a.ADD_ITEM_RESPONSE;
        } else if (i10 == 4) {
            aVar2 = a.UPDATE_ITEM_RESPONSE;
        } else if (i10 == 5) {
            aVar2 = a.DELETE_ITEM_RESPONSE;
        } else {
            throw new t();
        }
        String b10 = aVar2.b();
        this.f116649a.track(b10 + "_V2", f10);
    }
}
