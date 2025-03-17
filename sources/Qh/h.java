package Qh;

import Ae.r;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LQh/h;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "b", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63121b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LQh/h$a;", "", "<init>", "()V", "", "PIP_SCREEN_NAME", "Ljava/lang/String;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final String g(U u10) {
        C17542s.j(u10, "it");
        return "pip";
    }

    /* access modifiers changed from: private */
    public static final String h(U u10) {
        C17542s.j(u10, "it");
        return "WarningMoreInfo";
    }

    /* access modifiers changed from: private */
    public static final String i(U u10) {
        C17542s.j(u10, "it");
        return "GoodToKnow";
    }

    /* access modifiers changed from: private */
    public static final String j(U u10) {
        C17542s.j(u10, "it");
        return "AssemblyAndDocuments";
    }

    /* access modifiers changed from: private */
    public static final String k(U u10) {
        C17542s.j(u10, "it");
        return "MaterialsAndCare";
    }

    public Map<String, C17642l<U, String>> a() {
        return X.m(C16796C.a("pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}", new c()), C16796C.a("pip/moreInfo?warningMoreInfo={warningMoreInfo}", new d()), C16796C.a("pip/goodToKnow?productLarge={productLarge}", new e()), C16796C.a("pip/assemblyAndDocuments?productLarge={productLarge}", new f()), C16796C.a("pip/materialsAndCare?productLarge={productLarge}", new g()));
    }
}
