package com.ingka.ikea.account.impl.modalsettings.editaddress;

import Ae.e;
import Wd.C9346a;
import XH.C16824o;
import XH.C16825p;
import Xd.b;
import YH.C16877v;
import android.view.View;
import cD.C14029a;
import com.ingka.ikea.useraccount.model.Address;
import ee.c;
import ee.d;
import ee.f;
import ee.i;
import java.util.List;
import jp.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.C10015c;
import le.C10016d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0014XD¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016XD¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8TX\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010$R\u001b\u0010+\u001a\u00020 8VX\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010$R\u001b\u00100\u001a\u00020,8VX\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u001a\u00106\u001a\u00020 8\u0016XD¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078TX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<078TX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:¨\u0006?"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/editaddress/CreateAddressFragment;", "Lcom/ingka/ikea/account/impl/dynamicfields/DynamicFieldsDelegateFragment;", "<init>", "()V", "LcD/a;", "P0", "LcD/a;", "h2", "()LcD/a;", "setEditProfileRepository", "(LcD/a;)V", "editProfileRepository", "LAe/e;", "Q0", "LAe/e;", "f2", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LWd/a;", "R0", "LXH/o;", "g2", "()LWd/a;", "analyticsDelegate", "", "S0", "Z", "v1", "()Z", "showSaveInOptionsMenu", "", "T0", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "destId", "U0", "L0", "pageTitle", "V0", "s1", "errorDialogTitle", "Lee/i;", "W0", "i2", "()Lee/i;", "repositoryConnection", "X0", "x1", "validateFieldsOnCreation", "Y0", "p1", "componentValue", "", "", "l1", "()Ljava/util/List;", "additionalFields", "LLg/a;", "k1", "additionalDelegates", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateAddressFragment extends a {

    /* renamed from: P0  reason: collision with root package name */
    public C14029a f69724P0;

    /* renamed from: Q0  reason: collision with root package name */
    public e f69725Q0;

    /* renamed from: R0  reason: collision with root package name */
    private final C16824o f69726R0 = C16825p.b(new c(this));

    /* renamed from: S0  reason: collision with root package name */
    private final boolean f69727S0;

    /* renamed from: T0  reason: collision with root package name */
    private final String f69728T0 = "profile/account/create_address?addressType={addressType}";

    /* renamed from: U0  reason: collision with root package name */
    private final C16824o f69729U0 = C16825p.b(new d(this));

    /* renamed from: V0  reason: collision with root package name */
    private final C16824o f69730V0 = C16825p.b(new ee.e(this));

    /* renamed from: W0  reason: collision with root package name */
    private final C16824o f69731W0 = C16825p.b(new f(this));

    /* renamed from: X0  reason: collision with root package name */
    private final boolean f69732X0;

    /* renamed from: Y0  reason: collision with root package name */
    private final String f69733Y0 = "create_address";

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/ingka/ikea/account/impl/modalsettings/editaddress/CreateAddressFragment$a", "Lle/c;", "LXH/N;", "a", "()V", "onDelete", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C10015c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreateAddressFragment f69734a;

        a(CreateAddressFragment createAddressFragment) {
            this.f69734a = createAddressFragment;
        }

        public void a() {
            View view = this.f69734a.getView();
            if (view != null) {
                g.b(view);
            }
            com.ingka.ikea.account.impl.dynamicfields.d.y0(this.f69734a.y1(), false, 1, (Object) null);
        }

        public void onDelete() {
            throw new IllegalStateException("Nothing to delete in this screen");
        }
    }

    /* access modifiers changed from: private */
    public static final C9346a d2(CreateAddressFragment createAddressFragment) {
        return new C9346a(new Xd.a(createAddressFragment.f2()), b.ADDRESS_CREATE_SUCCESS, b.ADDRESS_CREATE_FAIL, (b) null, (b) null, 24, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final String e2(CreateAddressFragment createAddressFragment) {
        return createAddressFragment.getString(Sd.f.f63361a);
    }

    /* access modifiers changed from: private */
    public static final String j2(CreateAddressFragment createAddressFragment) {
        return createAddressFragment.getString(Sd.f.f63362b);
    }

    /* access modifiers changed from: private */
    public static final i k2(CreateAddressFragment createAddressFragment) {
        String string = createAddressFragment.requireArguments().getString("addressType");
        if (string != null) {
            return new i(createAddressFragment.h2(), Address.Type.valueOf(string));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69729U0.getValue();
    }

    public final e f2() {
        e eVar = this.f69725Q0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    /* renamed from: g2 */
    public C9346a n1() {
        return (C9346a) this.f69726R0.getValue();
    }

    public final C14029a h2() {
        C14029a aVar = this.f69724P0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("editProfileRepository");
        return null;
    }

    /* renamed from: i2 */
    public i u1() {
        return (i) this.f69731W0.getValue();
    }

    /* access modifiers changed from: protected */
    public List<Lg.a<?>> k1() {
        return C16877v.e(new C10016d(new a(this)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((r0 != null ? r0.booleanValue() : false) != false) goto L_0x0034;
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
            com.ingka.ikea.account.impl.dynamicfields.d r0 = r4.y1()
            androidx.lifecycle.F r0 = r0.f0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            le.e r0 = new le.e
            le.e$a r2 = new le.e$a
            r2.<init>(r1)
            r1 = 2
            r3 = 0
            r0.<init>(r2, r3, r1, r3)
            java.util.List r0 = YH.C16877v.e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.editaddress.CreateAddressFragment.l1():java.util.List");
    }

    public String p1() {
        return this.f69733Y0;
    }

    public String r1() {
        return this.f69728T0;
    }

    public String s1() {
        return (String) this.f69730V0.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean v1() {
        return this.f69727S0;
    }

    public boolean x1() {
        return this.f69732X0;
    }
}
