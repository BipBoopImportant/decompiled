package Wn;

import D2.d;
import Nn.C10804g;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import android.os.Bundle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fI.C17221b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0010\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LWn/e;", "LWn/d;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "LNn/g;", "items", "", "Landroid/os/Bundle;", "b", "(Ljava/util/List;)[Landroid/os/Bundle;", "", "postalCode", "LXH/N;", "a", "(Ljava/util/List;Ljava/lang/String;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Ae.e f89087a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LWn/e$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SPLIT_PUP_DATA", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        SPLIT_PUP_DATA("split_pup_data");
        
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LWn/e$b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "POSTAL_CODE", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum b {
        POSTAL_CODE(PlaceTypes.POSTAL_CODE);
        
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

    public e(Ae.e eVar) {
        C17542s.j(eVar, "analytics");
        this.f89087a = eVar;
    }

    private final Bundle[] b(List<C10804g> list) {
        Iterable<C10804g> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10804g gVar : iterable) {
            arrayList.add(d.b(C16796C.a("item_id", gVar.b()), C16796C.a("quantity", Integer.valueOf(gVar.c()))));
        }
        return (Bundle[]) arrayList.toArray(new Bundle[0]);
    }

    public void a(List<C10804g> list, String str) {
        C17542s.j(list, "items");
        C17542s.j(str, "postalCode");
        this.f89087a.track(a.SPLIT_PUP_DATA.b(), X.m(C16796C.a(b.POSTAL_CODE.b(), str), C16796C.a("items", b(list))));
    }
}
