package me;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10038a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lme/b;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "Lme/b$a;", "Lme/b$b;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lme/b$a;", "Lme/b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C1379a();

        /* renamed from: a  reason: collision with root package name */
        public static final a f75354a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.b$a$a  reason: collision with other inner class name */
        public static final class C1379a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return a.f75354a;
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1072180591;
        }

        public String toString() {
            return "Dismissed";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001e"}, d2 = {"Lme/b$b;", "Lme/b;", "Lme/a$d;", "postalCodeAddress", "", "requestValue", "<init>", "(Lme/a$d;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/a$d;", "()Lme/a$d;", "b", "Ljava/lang/String;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: me.b$b  reason: collision with other inner class name */
    public static final class C1380b extends b {
        public static final Parcelable.Creator<C1380b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final C10038a.d f75355a;

        /* renamed from: b  reason: collision with root package name */
        private final String f75356b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.b$b$a */
        public static final class a implements Parcelable.Creator<C1380b> {
            /* renamed from: a */
            public final C1380b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new C1380b(C10038a.d.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* renamed from: b */
            public final C1380b[] newArray(int i10) {
                return new C1380b[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1380b(C10038a.d dVar, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "postalCodeAddress");
            this.f75355a = dVar;
            this.f75356b = str;
        }

        public final C10038a.d a() {
            return this.f75355a;
        }

        public final String b() {
            return this.f75356b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1380b)) {
                return false;
            }
            C1380b bVar = (C1380b) obj;
            return C17542s.e(this.f75355a, bVar.f75355a) && C17542s.e(this.f75356b, bVar.f75356b);
        }

        public int hashCode() {
            int hashCode = this.f75355a.hashCode() * 31;
            String str = this.f75356b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C10038a.d dVar = this.f75355a;
            String str = this.f75356b;
            return "Value(postalCodeAddress=" + dVar + ", requestValue=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            this.f75355a.writeToParcel(parcel, i10);
            parcel.writeString(this.f75356b);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
