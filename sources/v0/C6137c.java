package v0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lv0/c;", "Landroid/os/Parcelable;", "", "index", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: v0.c  reason: case insensitive filesystem */
final class C6137c implements Parcelable {
    public static final Parcelable.Creator<C6137c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f30856b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f30857a;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"v0/c$a", "Landroid/os/Parcelable$Creator;", "Lv0/c;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lv0/c;", "", "size", "", "b", "(I)[Lv0/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.c$a */
    public static final class a implements Parcelable.Creator<C6137c> {
        a() {
        }

        /* renamed from: a */
        public C6137c createFromParcel(Parcel parcel) {
            return new C6137c(parcel.readInt());
        }

        /* renamed from: b */
        public C6137c[] newArray(int i10) {
            return new C6137c[i10];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv0/c$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C6137c(int i10) {
        this.f30857a = i10;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6137c) && this.f30857a == ((C6137c) obj).f30857a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f30857a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f30857a + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30857a);
    }
}
