package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.r;

@SuppressLint({"BanParcelableUsage"})
final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f21900a;

    /* renamed from: b  reason: collision with root package name */
    final String f21901b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f21902c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f21903d;

    /* renamed from: e  reason: collision with root package name */
    final int f21904e;

    /* renamed from: f  reason: collision with root package name */
    final int f21905f;

    /* renamed from: g  reason: collision with root package name */
    final String f21906g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f21907h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f21908i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f21909j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f21910k;

    /* renamed from: l  reason: collision with root package name */
    final int f21911l;

    /* renamed from: m  reason: collision with root package name */
    final String f21912m;

    /* renamed from: n  reason: collision with root package name */
    final int f21913n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f21914o;

    class a implements Parcelable.Creator<N> {
        a() {
        }

        /* renamed from: a */
        public N createFromParcel(Parcel parcel) {
            return new N(parcel);
        }

        /* renamed from: b */
        public N[] newArray(int i10) {
            return new N[i10];
        }
    }

    N(C5187o oVar) {
        this.f21900a = oVar.getClass().getName();
        this.f21901b = oVar.mWho;
        this.f21902c = oVar.mFromLayout;
        this.f21903d = oVar.mInDynamicContainer;
        this.f21904e = oVar.mFragmentId;
        this.f21905f = oVar.mContainerId;
        this.f21906g = oVar.mTag;
        this.f21907h = oVar.mRetainInstance;
        this.f21908i = oVar.mRemoving;
        this.f21909j = oVar.mDetached;
        this.f21910k = oVar.mHidden;
        this.f21911l = oVar.mMaxState.ordinal();
        this.f21912m = oVar.mTargetWho;
        this.f21913n = oVar.mTargetRequestCode;
        this.f21914o = oVar.mUserVisibleHint;
    }

    /* access modifiers changed from: package-private */
    public C5187o a(C5195x xVar, ClassLoader classLoader) {
        C5187o instantiate = xVar.instantiate(classLoader, this.f21900a);
        instantiate.mWho = this.f21901b;
        instantiate.mFromLayout = this.f21902c;
        instantiate.mInDynamicContainer = this.f21903d;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.f21904e;
        instantiate.mContainerId = this.f21905f;
        instantiate.mTag = this.f21906g;
        instantiate.mRetainInstance = this.f21907h;
        instantiate.mRemoving = this.f21908i;
        instantiate.mDetached = this.f21909j;
        instantiate.mHidden = this.f21910k;
        instantiate.mMaxState = r.b.values()[this.f21911l];
        instantiate.mTargetWho = this.f21912m;
        instantiate.mTargetRequestCode = this.f21913n;
        instantiate.mUserVisibleHint = this.f21914o;
        return instantiate;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f21900a);
        sb2.append(" (");
        sb2.append(this.f21901b);
        sb2.append(")}:");
        if (this.f21902c) {
            sb2.append(" fromLayout");
        }
        if (this.f21903d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f21905f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f21905f));
        }
        String str = this.f21906g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f21906g);
        }
        if (this.f21907h) {
            sb2.append(" retainInstance");
        }
        if (this.f21908i) {
            sb2.append(" removing");
        }
        if (this.f21909j) {
            sb2.append(" detached");
        }
        if (this.f21910k) {
            sb2.append(" hidden");
        }
        if (this.f21912m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f21912m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f21913n);
        }
        if (this.f21914o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21900a);
        parcel.writeString(this.f21901b);
        parcel.writeInt(this.f21902c ? 1 : 0);
        parcel.writeInt(this.f21903d ? 1 : 0);
        parcel.writeInt(this.f21904e);
        parcel.writeInt(this.f21905f);
        parcel.writeString(this.f21906g);
        parcel.writeInt(this.f21907h ? 1 : 0);
        parcel.writeInt(this.f21908i ? 1 : 0);
        parcel.writeInt(this.f21909j ? 1 : 0);
        parcel.writeInt(this.f21910k ? 1 : 0);
        parcel.writeInt(this.f21911l);
        parcel.writeString(this.f21912m);
        parcel.writeInt(this.f21913n);
        parcel.writeInt(this.f21914o ? 1 : 0);
    }

    N(Parcel parcel) {
        this.f21900a = parcel.readString();
        this.f21901b = parcel.readString();
        boolean z10 = false;
        this.f21902c = parcel.readInt() != 0;
        this.f21903d = parcel.readInt() != 0;
        this.f21904e = parcel.readInt();
        this.f21905f = parcel.readInt();
        this.f21906g = parcel.readString();
        this.f21907h = parcel.readInt() != 0;
        this.f21908i = parcel.readInt() != 0;
        this.f21909j = parcel.readInt() != 0;
        this.f21910k = parcel.readInt() != 0;
        this.f21911l = parcel.readInt();
        this.f21912m = parcel.readString();
        this.f21913n = parcel.readInt();
        this.f21914o = parcel.readInt() != 0 ? true : z10;
    }
}
