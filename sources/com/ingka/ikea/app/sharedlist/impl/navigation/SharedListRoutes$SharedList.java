package com.ingka.ikea.app.sharedlist.impl.navigation;

import android.net.Uri;
import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001b\u001eB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001f"}, d2 = {"com/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList", "", "", "seen0", "", "listId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Companion", "$serializer", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedListRoutes$SharedList {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92347a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList$a;", "", "<init>", "()V", "", "listId", "Landroid/net/Uri;", "a", "(Ljava/lang/String;)Landroid/net/Uri;", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "baseDeeplinkPath", "Ljava/lang/String;", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str) {
            C17542s.j(str, "listId");
            Uri build = Uri.parse("ikea://navigation/sharedlist").buildUpon().appendPath(str).build();
            C17542s.i(build, "build(...)");
            return build;
        }

        public final KSerializer<SharedListRoutes$SharedList> serializer() {
            return SharedListRoutes$SharedList$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ SharedListRoutes$SharedList(int i10, String str, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, SharedListRoutes$SharedList$$serializer.INSTANCE.getDescriptor());
        }
        this.f92347a = str;
    }

    public final String a() {
        return this.f92347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedListRoutes$SharedList) && C17542s.e(this.f92347a, ((SharedListRoutes$SharedList) obj).f92347a);
    }

    public int hashCode() {
        return this.f92347a.hashCode();
    }

    public String toString() {
        String str = this.f92347a;
        return "SharedList(listId=" + str + ")";
    }
}
