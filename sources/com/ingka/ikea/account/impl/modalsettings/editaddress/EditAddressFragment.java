package com.ingka.ikea.account.impl.modalsettings.editaddress;

import Ae.e;
import Sd.f;
import Wd.C9346a;
import XH.C16824o;
import XH.C16825p;
import Xd.b;
import YH.C16877v;
import android.view.View;
import cD.C14029a;
import com.ingka.ikea.account.impl.dynamicfields.d;
import ee.j;
import ee.k;
import ee.l;
import ee.m;
import ee.n;
import ee.o;
import ee.r;
import java.util.List;
import jp.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import le.C10015c;
import le.C10016d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00148\u0014XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001b\u0010'\u001a\u00020#8VX\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u001b\u0010.\u001a\u00020\u001a8TX\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u001dR\u001b\u00101\u001a\u00020\u001a8VX\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u001dR\u001b\u00106\u001a\u0002028VX\u0002¢\u0006\f\n\u0004\b3\u0010\u0016\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u00020\u00148\u0016XD¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\u0018R\u001a\u0010<\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010\u001dR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8TX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001e\u0010D\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B0=8TX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010@¨\u0006E"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/editaddress/EditAddressFragment;", "Lcom/ingka/ikea/account/impl/dynamicfields/DynamicFieldsDelegateFragment;", "<init>", "()V", "LcD/a;", "P0", "LcD/a;", "n2", "()LcD/a;", "setEditProfileRepository", "(LcD/a;)V", "editProfileRepository", "LAe/e;", "Q0", "LAe/e;", "k2", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "", "R0", "LXH/o;", "m2", "()Z", "deletable", "", "S0", "j2", "()Ljava/lang/String;", "addressId", "T0", "Z", "v1", "showSaveInOptionsMenu", "LWd/a;", "U0", "l2", "()LWd/a;", "analyticsDelegate", "V0", "Ljava/lang/String;", "r1", "destId", "W0", "L0", "pageTitle", "X0", "s1", "errorDialogTitle", "Lee/r;", "Y0", "o2", "()Lee/r;", "repositoryConnection", "Z0", "x1", "validateFieldsOnCreation", "a1", "p1", "componentValue", "", "", "l1", "()Ljava/util/List;", "additionalFields", "LLg/a;", "k1", "additionalDelegates", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditAddressFragment extends b {

    /* renamed from: P0  reason: collision with root package name */
    public C14029a f69735P0;

    /* renamed from: Q0  reason: collision with root package name */
    public e f69736Q0;

    /* renamed from: R0  reason: collision with root package name */
    private final C16824o f69737R0 = C16825p.b(new j(this));

    /* renamed from: S0  reason: collision with root package name */
    private final C16824o f69738S0 = C16825p.b(new k(this));

    /* renamed from: T0  reason: collision with root package name */
    private final boolean f69739T0;

    /* renamed from: U0  reason: collision with root package name */
    private final C16824o f69740U0 = C16825p.b(new l(this));

    /* renamed from: V0  reason: collision with root package name */
    private final String f69741V0 = "profile/account/edit_address?deletable={deletable}&addressId={addressId}";

    /* renamed from: W0  reason: collision with root package name */
    private final C16824o f69742W0 = C16825p.b(new m(this));

    /* renamed from: X0  reason: collision with root package name */
    private final C16824o f69743X0 = C16825p.b(new n(this));

    /* renamed from: Y0  reason: collision with root package name */
    private final C16824o f69744Y0 = C16825p.b(new o(this));

    /* renamed from: Z0  reason: collision with root package name */
    private final boolean f69745Z0 = true;

    /* renamed from: a1  reason: collision with root package name */
    private final String f69746a1 = "edit_address";

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/ingka/ikea/account/impl/modalsettings/editaddress/EditAddressFragment$a", "Lle/c;", "LXH/N;", "a", "()V", "onDelete", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C10015c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditAddressFragment f69747a;

        a(EditAddressFragment editAddressFragment) {
            this.f69747a = editAddressFragment;
        }

        public void a() {
            View view = this.f69747a.getView();
            if (view != null) {
                g.b(view);
            }
            d.y0(this.f69747a.y1(), false, 1, (Object) null);
        }

        public void onDelete() {
            View view = this.f69747a.getView();
            if (view != null) {
                g.b(view);
            }
            this.f69747a.y1().v0();
        }
    }

    /* access modifiers changed from: private */
    public static final String f2(EditAddressFragment editAddressFragment) {
        String string = editAddressFragment.requireArguments().getString("addressId");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C9346a g2(EditAddressFragment editAddressFragment) {
        return new C9346a(new Xd.a(editAddressFragment.k2()), b.ADDRESS_EDIT_SUCCESS, b.ADDRESS_EDIT_FAIL, b.ADDRESS_DELETE_SUCCESS, b.ADDRESS_DELETE_FAIL);
    }

    /* access modifiers changed from: private */
    public static final boolean h2(EditAddressFragment editAddressFragment) {
        return editAddressFragment.requireArguments().getBoolean("deletable");
    }

    /* access modifiers changed from: private */
    public static final String i2(EditAddressFragment editAddressFragment) {
        return editAddressFragment.getString(f.f63373m);
    }

    private final String j2() {
        return (String) this.f69738S0.getValue();
    }

    private final boolean m2() {
        return ((Boolean) this.f69737R0.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final String p2(EditAddressFragment editAddressFragment) {
        return editAddressFragment.getString(f.f63375o);
    }

    /* access modifiers changed from: private */
    public static final r q2(EditAddressFragment editAddressFragment) {
        return new r(editAddressFragment.n2(), editAddressFragment.j2());
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69742W0.getValue();
    }

    /* access modifiers changed from: protected */
    public List<Lg.a<?>> k1() {
        return C16877v.e(new C10016d(new a(this)));
    }

    public final e k2() {
        e eVar = this.f69736Q0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((r3 != null ? r3.booleanValue() : false) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.Object> l1() {
        /*
            r4 = this;
            com.ingka.ikea.account.impl.dynamicfields.d r0 = r4.y1()
            androidx.lifecycle.F r0 = r0.m0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.booleanValue()
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            r2 = 0
            if (r0 == 0) goto L_0x0033
            com.ingka.ikea.account.impl.dynamicfields.d r3 = r4.y1()
            androidx.lifecycle.F r3 = r3.f0()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x002f
            boolean r3 = r3.booleanValue()
            goto L_0x0030
        L_0x002f:
            r3 = r2
        L_0x0030:
            if (r3 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            boolean r2 = r4.m2()
            if (r2 == 0) goto L_0x0040
            le.e$a r2 = new le.e$a
            r2.<init>(r0)
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            le.e r0 = new le.e
            le.e$a r3 = new le.e$a
            r3.<init>(r1)
            r0.<init>(r3, r2)
            java.util.List r0 = YH.C16877v.e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.editaddress.EditAddressFragment.l1():java.util.List");
    }

    /* renamed from: l2 */
    public C9346a n1() {
        return (C9346a) this.f69740U0.getValue();
    }

    public final C14029a n2() {
        C14029a aVar = this.f69735P0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("editProfileRepository");
        return null;
    }

    /* renamed from: o2 */
    public r u1() {
        return (r) this.f69744Y0.getValue();
    }

    public String p1() {
        return this.f69746a1;
    }

    public String r1() {
        return this.f69741V0;
    }

    public String s1() {
        return (String) this.f69743X0.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean v1() {
        return this.f69739T0;
    }

    public boolean x1() {
        return this.f69745Z0;
    }
}
