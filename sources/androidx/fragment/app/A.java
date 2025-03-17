package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b3.c;
import c3.b;

class A implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final FragmentManager f21732a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f21733a;

        a(O o10) {
            this.f21733a = o10;
        }

        public void onViewAttachedToWindow(View view) {
            C5187o k10 = this.f21733a.k();
            this.f21733a.m();
            a0.u((ViewGroup) k10.mView.getParent(), A.this.f21732a).q();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    A(FragmentManager fragmentManager) {
        this.f21732a = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        O o10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f21732a);
        }
        C5187o oVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f22954a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.f22955b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.f22956c, -1);
        String string = obtainStyledAttributes.getString(c.f22957d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C5195x.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            oVar = this.f21732a.p0(resourceId);
        }
        if (oVar == null && string != null) {
            oVar = this.f21732a.q0(string);
        }
        if (oVar == null && id2 != -1) {
            oVar = this.f21732a.p0(id2);
        }
        if (oVar == null) {
            oVar = this.f21732a.E0().instantiate(context.getClassLoader(), attributeValue);
            oVar.mFromLayout = true;
            oVar.mFragmentId = resourceId != 0 ? resourceId : id2;
            oVar.mContainerId = id2;
            oVar.mTag = string;
            oVar.mInLayout = true;
            FragmentManager fragmentManager = this.f21732a;
            oVar.mFragmentManager = fragmentManager;
            oVar.mHost = fragmentManager.H0();
            oVar.onInflate(this.f21732a.H0().f(), attributeSet, oVar.mSavedFragmentState);
            o10 = this.f21732a.l(oVar);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Fragment " + oVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!oVar.mInLayout) {
            oVar.mInLayout = true;
            FragmentManager fragmentManager2 = this.f21732a;
            oVar.mFragmentManager = fragmentManager2;
            oVar.mHost = fragmentManager2.H0();
            oVar.onInflate(this.f21732a.H0().f(), attributeSet, oVar.mSavedFragmentState);
            o10 = this.f21732a.C(oVar);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + oVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        b.g(oVar, viewGroup);
        oVar.mContainer = viewGroup;
        o10.m();
        o10.j();
        View view2 = oVar.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (oVar.mView.getTag() == null) {
                oVar.mView.setTag(string);
            }
            oVar.mView.addOnAttachStateChangeListener(new a(o10));
            return oVar.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
