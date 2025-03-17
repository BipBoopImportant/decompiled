package com.ingka.ikea.app.shoppinglist.navigation;

import android.net.Uri;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001d#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"com/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails", "", "", "listId", "", "selectInStoreMode", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjK/T0;)V", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Companion", "$serializer", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppingListsRoutes$ListDetails {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92367a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f92368b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails$a;", "", "<init>", "()V", "", "listId", "", "selectInStoreMode", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Z)Landroid/net/Uri;", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "deeplinkBasePath", "Ljava/lang/String;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, boolean z10) {
            C17542s.j(str, "listId");
            Uri build = Uri.parse("ikea://navigation/shoppingLists/details").buildUpon().appendPath(str).appendPath(String.valueOf(z10)).build();
            C17542s.i(build, "build(...)");
            return build;
        }

        public final KSerializer<ShoppingListsRoutes$ListDetails> serializer() {
            return ShoppingListsRoutes$ListDetails$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ ShoppingListsRoutes$ListDetails(int i10, String str, boolean z10, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ShoppingListsRoutes$ListDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.f92367a = str;
        this.f92368b = z10;
    }

    public static final /* synthetic */ void c(ShoppingListsRoutes$ListDetails shoppingListsRoutes$ListDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, shoppingListsRoutes$ListDetails.f92367a);
        dVar.x(serialDescriptor, 1, shoppingListsRoutes$ListDetails.f92368b);
    }

    public final String a() {
        return this.f92367a;
    }

    public final boolean b() {
        return this.f92368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListsRoutes$ListDetails)) {
            return false;
        }
        ShoppingListsRoutes$ListDetails shoppingListsRoutes$ListDetails = (ShoppingListsRoutes$ListDetails) obj;
        return C17542s.e(this.f92367a, shoppingListsRoutes$ListDetails.f92367a) && this.f92368b == shoppingListsRoutes$ListDetails.f92368b;
    }

    public int hashCode() {
        return (this.f92367a.hashCode() * 31) + Boolean.hashCode(this.f92368b);
    }

    public String toString() {
        String str = this.f92367a;
        boolean z10 = this.f92368b;
        return "ListDetails(listId=" + str + ", selectInStoreMode=" + z10 + ")";
    }

    public ShoppingListsRoutes$ListDetails(String str, boolean z10) {
        C17542s.j(str, "listId");
        this.f92367a = str;
        this.f92368b = z10;
    }
}
