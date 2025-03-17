package com.ingka.ikea.core.android.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/f;", "Landroid/os/Parcelable;", "", "title", "messageHeader", "message", "", "finishButtonStringRes", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;", "imageResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "I", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;", "()Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f94892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94893b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94894c;

    /* renamed from: d  reason: collision with root package name */
    private final int f94895d;

    /* renamed from: e  reason: collision with root package name */
    private final FullscreenDialogFragment.b f94896e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        /* renamed from: a */
        public final f createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), FullscreenDialogFragment.b.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, int i10, FullscreenDialogFragment.b bVar) {
        C17542s.j(str3, "message");
        C17542s.j(bVar, "imageResource");
        this.f94892a = str;
        this.f94893b = str2;
        this.f94894c = str3;
        this.f94895d = i10;
        this.f94896e = bVar;
    }

    public final int a() {
        return this.f94895d;
    }

    public final FullscreenDialogFragment.b b() {
        return this.f94896e;
    }

    public final String c() {
        return this.f94894c;
    }

    public final String d() {
        return this.f94893b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f94892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f94892a, fVar.f94892a) && C17542s.e(this.f94893b, fVar.f94893b) && C17542s.e(this.f94894c, fVar.f94894c) && this.f94895d == fVar.f94895d && C17542s.e(this.f94896e, fVar.f94896e);
    }

    public int hashCode() {
        String str = this.f94892a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94893b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((hashCode + i10) * 31) + this.f94894c.hashCode()) * 31) + Integer.hashCode(this.f94895d)) * 31) + this.f94896e.hashCode();
    }

    public String toString() {
        String str = this.f94892a;
        String str2 = this.f94893b;
        String str3 = this.f94894c;
        int i10 = this.f94895d;
        FullscreenDialogFragment.b bVar = this.f94896e;
        return "FullScreenDialogArguments(title=" + str + ", messageHeader=" + str2 + ", message=" + str3 + ", finishButtonStringRes=" + i10 + ", imageResource=" + bVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94892a);
        parcel.writeString(this.f94893b);
        parcel.writeString(this.f94894c);
        parcel.writeInt(this.f94895d);
        this.f94896e.writeToParcel(parcel, i10);
    }
}
