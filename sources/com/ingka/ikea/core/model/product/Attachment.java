package com.ingka.ikea.core.model.product;

import HJ.C15854t;
import android.os.Parcel;
import android.os.Parcelable;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11690a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00024)B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u001a\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010#R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010#¨\u00065"}, d2 = {"Lcom/ingka/ikea/core/model/product/Attachment;", "Landroid/os/Parcelable;", "", "Lop/a;", "type", "", "name", "articleNo", "url", "<init>", "(Lop/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILop/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "v", "(Lcom/ingka/ikea/core/model/product/Attachment;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "other", "b", "(Lcom/ingka/ikea/core/model/product/Attachment;)I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lop/a;", "n", "()Lop/a;", "Ljava/lang/String;", "m", "c", "j", "d", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Attachment implements Parcelable, Comparable<Attachment> {
    public static final Parcelable.Creator<Attachment> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f94930e = {J.b("com.ingka.ikea.core.model.product.AttachmentType", C11690a.values()), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final C11690a f94931a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94932b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94933c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94934d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Attachment$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Attachment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Attachment> serializer() {
            return Attachment$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Attachment> {
        /* renamed from: a */
        public final Attachment createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Attachment(C11690a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Attachment[] newArray(int i10) {
            return new Attachment[i10];
        }
    }

    public /* synthetic */ Attachment(int i10, C11690a aVar, String str, String str2, String str3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, Attachment$$serializer.INSTANCE.getDescriptor());
        }
        this.f94931a = aVar;
        this.f94932b = str;
        this.f94933c = str2;
        this.f94934d = str3;
    }

    public static final /* synthetic */ void v(Attachment attachment, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f94930e[0], attachment.f94931a);
        dVar.y(serialDescriptor, 1, attachment.f94932b);
        dVar.y(serialDescriptor, 2, attachment.f94933c);
        dVar.y(serialDescriptor, 3, attachment.f94934d);
    }

    /* renamed from: b */
    public int compareTo(Attachment attachment) {
        C17542s.j(attachment, "other");
        try {
            return this.f94933c.compareTo(attachment.f94933c);
        } catch (NumberFormatException e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = Attachment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return 0;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        return this.f94931a == attachment.f94931a && C17542s.e(this.f94932b, attachment.f94932b) && C17542s.e(this.f94933c, attachment.f94933c) && C17542s.e(this.f94934d, attachment.f94934d);
    }

    public final String getUrl() {
        return this.f94934d;
    }

    public int hashCode() {
        return (((((this.f94931a.hashCode() * 31) + this.f94932b.hashCode()) * 31) + this.f94933c.hashCode()) * 31) + this.f94934d.hashCode();
    }

    public final String j() {
        return this.f94933c;
    }

    public final String m() {
        return this.f94932b;
    }

    public final C11690a n() {
        return this.f94931a;
    }

    public String toString() {
        C11690a aVar = this.f94931a;
        String str = this.f94932b;
        String str2 = this.f94933c;
        String str3 = this.f94934d;
        return "Attachment(type=" + aVar + ", name=" + str + ", articleNo=" + str2 + ", url=" + str3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94931a.name());
        parcel.writeString(this.f94932b);
        parcel.writeString(this.f94933c);
        parcel.writeString(this.f94934d);
    }

    public Attachment(C11690a aVar, String str, String str2, String str3) {
        C17542s.j(aVar, "type");
        C17542s.j(str, "name");
        C17542s.j(str2, "articleNo");
        C17542s.j(str3, "url");
        this.f94931a = aVar;
        this.f94932b = str;
        this.f94933c = str2;
        this.f94934d = str3;
    }
}
