package zk;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import jK.C17487x0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@fK.p
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzk/p;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final p INSTANCE = new p();

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ C16824o<KSerializer<Object>> f107473a = C16825p.a(s.PUBLICATION, new o());

    /* renamed from: b  reason: collision with root package name */
    public static final int f107474b = 8;

    private p() {
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17487x0("com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes.ShoppingListsRoot", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer c() {
        return f107473a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof p);
    }

    public int hashCode() {
        return -1146798100;
    }

    public final KSerializer<p> serializer() {
        return c();
    }

    public String toString() {
        return "ShoppingListsRoot";
    }
}
