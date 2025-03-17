package com.ingka.ikea.checkout.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lcom/ingka/ikea/checkout/impl/ui/a$a;", "Lcom/ingka/ikea/checkout/impl/ui/a$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/a$a;", "Lcom/ingka/ikea/checkout/impl/ui/a;", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "dialogType", "<init>", "(Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "()Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.checkout.impl.ui.a$a  reason: collision with other inner class name */
    public static final class C2108a extends a {
        public static final Parcelable.Creator<C2108a> CREATOR = new C2109a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f94678b = 8;

        /* renamed from: a  reason: collision with root package name */
        private final FullscreenErrorDialogFragment.b f94679a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.ui.a$a$a  reason: collision with other inner class name */
        public static final class C2109a implements Parcelable.Creator<C2108a> {
            /* renamed from: a */
            public final C2108a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new C2108a(FullscreenErrorDialogFragment.b.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final C2108a[] newArray(int i10) {
                return new C2108a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2108a(FullscreenErrorDialogFragment.b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "dialogType");
            this.f94679a = bVar;
        }

        public final FullscreenErrorDialogFragment.b a() {
            return this.f94679a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2108a) && this.f94679a == ((C2108a) obj).f94679a;
        }

        public int hashCode() {
            return this.f94679a.hashCode();
        }

        public String toString() {
            FullscreenErrorDialogFragment.b bVar = this.f94679a;
            return "ButtonClicked(dialogType=" + bVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94679a.name());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/a$b;", "Lcom/ingka/ikea/checkout/impl/ui/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C2110a();

        /* renamed from: a  reason: collision with root package name */
        public static final b f94680a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f94681b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.ui.a$b$a  reason: collision with other inner class name */
        public static final class C2110a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return b.f94680a;
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
