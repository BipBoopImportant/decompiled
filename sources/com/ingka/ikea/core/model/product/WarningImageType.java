package com.ingka.ikea.core.model.product;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import op.C11704o;

@p
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningImageType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "a", "TRIANGLE", "DOT", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum WarningImageType implements Parcelable {
    TRIANGLE,
    DOT;
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final Parcelable.Creator<WarningImageType> CREATOR = null;
    public static final a Companion = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningImageType$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/WarningImageType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) WarningImageType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WarningImageType> serializer() {
            return a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WarningImageType> {
        /* renamed from: a */
        public final WarningImageType createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return WarningImageType.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final WarningImageType[] newArray(int i10) {
            return new WarningImageType[i10];
        }
    }

    static {
        WarningImageType[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new a((DefaultConstructorMarker) null);
        CREATOR = new b();
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C11704o());
    }

    public static C17220a<WarningImageType> getEntries() {
        return $ENTRIES;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(name());
    }
}
