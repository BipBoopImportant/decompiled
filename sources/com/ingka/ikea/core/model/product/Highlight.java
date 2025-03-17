package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11694e;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001d¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/model/product/Highlight;", "Landroid/os/Parcelable;", "Lop/e;", "type", "", "text", "<init>", "(Lop/e;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILop/e;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/product/Highlight;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lop/e;", "getType", "()Lop/e;", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Highlight implements Parcelable {
    public static final Parcelable.Creator<Highlight> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f94980c = {J.b("com.ingka.ikea.core.model.product.HighlightType", C11694e.values()), null};

    /* renamed from: a  reason: collision with root package name */
    private final C11694e f94981a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94982b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Highlight$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Highlight;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Highlight> serializer() {
            return Highlight$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Highlight> {
        /* renamed from: a */
        public final Highlight createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Highlight(C11694e.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final Highlight[] newArray(int i10) {
            return new Highlight[i10];
        }
    }

    public /* synthetic */ Highlight(int i10, C11694e eVar, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, Highlight$$serializer.INSTANCE.getDescriptor());
        }
        this.f94981a = eVar;
        this.f94982b = str;
    }

    public static final /* synthetic */ void b(Highlight highlight, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f94980c[0], highlight.f94981a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, highlight.f94982b);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Highlight)) {
            return false;
        }
        Highlight highlight = (Highlight) obj;
        return this.f94981a == highlight.f94981a && C17542s.e(this.f94982b, highlight.f94982b);
    }

    public int hashCode() {
        int hashCode = this.f94981a.hashCode() * 31;
        String str = this.f94982b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C11694e eVar = this.f94981a;
        String str = this.f94982b;
        return "Highlight(type=" + eVar + ", text=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94981a.name());
        parcel.writeString(this.f94982b);
    }

    public Highlight(C11694e eVar, String str) {
        C17542s.j(eVar, "type");
        this.f94981a = eVar;
        this.f94982b = str;
    }
}
