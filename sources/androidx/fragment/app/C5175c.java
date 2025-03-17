package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
class C5175c implements Parcelable {
    public static final Parcelable.Creator<C5175c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final List<String> f22037a;

    /* renamed from: b  reason: collision with root package name */
    final List<C5174b> f22038b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator<C5175c> {
        a() {
        }

        /* renamed from: a */
        public C5175c createFromParcel(Parcel parcel) {
            return new C5175c(parcel);
        }

        /* renamed from: b */
        public C5175c[] newArray(int i10) {
            return new C5175c[i10];
        }
    }

    C5175c(List<String> list, List<C5174b> list2) {
        this.f22037a = list;
        this.f22038b = list2;
    }

    /* access modifiers changed from: package-private */
    public List<C5173a> a(FragmentManager fragmentManager, Map<String, C5187o> map) {
        HashMap hashMap = new HashMap(this.f22037a.size());
        for (String next : this.f22037a) {
            C5187o oVar = map.get(next);
            if (oVar != null) {
                hashMap.put(oVar.mWho, oVar);
            } else {
                Bundle B10 = fragmentManager.F0().B(next, (Bundle) null);
                if (B10 != null) {
                    ClassLoader classLoader = fragmentManager.H0().f().getClassLoader();
                    C5187o a10 = ((N) B10.getParcelable("state")).a(fragmentManager.E0(), classLoader);
                    a10.mSavedFragmentState = B10;
                    if (B10.getBundle("savedInstanceState") == null) {
                        a10.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = B10.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a10.setArguments(bundle);
                    hashMap.put(a10.mWho, a10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C5174b c10 : this.f22038b) {
            arrayList.add(c10.c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f22037a);
        parcel.writeTypedList(this.f22038b);
    }

    C5175c(Parcel parcel) {
        this.f22037a = parcel.createStringArrayList();
        this.f22038b = parcel.createTypedArrayList(C5174b.CREATOR);
    }
}
