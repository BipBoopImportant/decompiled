package he;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.account.impl.communication.CommunicationPreferencesFragment;
import com.ingka.ikea.account.impl.modalsettings.AccountFragment;
import com.ingka.ikea.account.impl.modalsettings.addresslist.AddressListFragment;
import com.ingka.ikea.account.impl.modalsettings.changepassword.ChangePasswordFragment;
import com.ingka.ikea.account.impl.modalsettings.deleteaccount.DeleteAccountFragment;
import com.ingka.ikea.account.impl.modalsettings.editaddress.CreateAddressFragment;
import com.ingka.ikea.account.impl.modalsettings.editaddress.EditAddressFragment;
import com.ingka.ikea.account.impl.modalsettings.editprofile.DeletedConfirmationFragment;
import com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment;
import com.ingka.ikea.account.impl.upgrade.SignupActivity;
import com.ingka.ikea.account.impl.upgrade.UpgradeActivity;
import com.ingka.ikea.account.impl.upgrade.UpgradeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8937a;
import x4.C8938b;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0007\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0011\u0010\u000f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0011\u0010\u0011\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u0011\u0010\u0012\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0007\u001a\u0011\u0010\u0013\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "g", "(Lx4/y;LnI/l;)V", "w", "(Lx4/y;)V", "u", "r", "m", "f", "l", "k", "o", "p", "j", "y", "v", "x", "account-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: he.g  reason: case insensitive filesystem */
public final class C9781g {
    public static final void f(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/page", P.b(AccountFragment.class));
        cVar.d("ikea://navigation/profile/account/page");
        yVar.k(cVar);
    }

    public static final void g(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "profile/account/page", "profile/account");
        w(yVar2);
        u(yVar2);
        r(yVar2);
        m(yVar2);
        f(yVar2);
        o(yVar2);
        p(yVar2);
        j(yVar2);
        y(yVar2);
        k(yVar2);
        l(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static /* synthetic */ void h(y yVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new C9780f
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:he.f) =  call: he.f.<init>():void type: CONSTRUCTOR in method: he.g.h(x4.y, nI.l, int, java.lang.Object):void, dex: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0009
                he.f r1 = new he.f
                r1.<init>()
            L_0x0009:
                g(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: he.C9781g.h(x4.y, nI.l, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N i(y yVar) {
            C17542s.j(yVar, "<this>");
            return C16807N.f139792a;
        }

        public static final void j(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/address_list", P.b(AddressListFragment.class));
            cVar.d("ikea://navigation/profile/account/address_list");
            yVar.k(cVar);
        }

        public static final void k(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/change_password", P.b(ChangePasswordFragment.class));
            cVar.d("ikea://navigation/profile/account/change_password");
            yVar.k(cVar);
        }

        public static final void l(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/communication_preferences", P.b(CommunicationPreferencesFragment.class));
            cVar.d("ikea://navigation/profile/account/communication_preferences");
            yVar.k(cVar);
        }

        public static final void m(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/create_address?addressType={addressType}", P.b(CreateAddressFragment.class));
            cVar.d("ikea://navigation/profile/account/create_address?addressType={addressType}");
            cVar.a("addressType", new C9776b());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        public static final void o(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/delete", P.b(DeleteAccountFragment.class));
            cVar.d("ikea://navigation/profile/account/delete");
            yVar.k(cVar);
        }

        public static final void p(y yVar) {
            C17542s.j(yVar, "<this>");
            A4.c cVar = new A4.c((b) yVar.l().d(b.class), "profile/account/delete/confirmation?success={success}", P.b(DeletedConfirmationFragment.class));
            cVar.d("ikea://navigation/profile/account/delete/confirmation?success={success}");
            cVar.a("success", new C9779e());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N q(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57439n);
            jVar.b(Boolean.FALSE);
            return C16807N.f139792a;
        }

        public static final void r(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/edit_address?deletable={deletable}&addressId={addressId}", P.b(EditAddressFragment.class));
            cVar.d("ikea://navigation/profile/account/edit_address?deletable={deletable}&addressId={addressId}");
            cVar.a("deletable", new C9777c());
            cVar.a("addressId", new C9778d());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N s(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57439n);
            jVar.b(Boolean.FALSE);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N t(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        public static final void u(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/edit_profile", P.b(EditProfileFragment.class));
            cVar.d("ikea://navigation/profile/account/edit_profile");
            yVar.k(cVar);
        }

        public static final void v(y yVar) {
            C17542s.j(yVar, "<this>");
            C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), "profile/account/signup");
            bVar.k(P.b(SignupActivity.class));
            bVar.d("ikea://navigation/profile/account/signup");
            yVar.k(bVar);
        }

        public static final void w(y yVar) {
            C17542s.j(yVar, "<this>");
            C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), "profile/account/upgrade");
            bVar.k(P.b(UpgradeActivity.class));
            bVar.d("ikea://navigation/profile/account/upgrade");
            yVar.k(bVar);
        }

        public static final void x(y yVar) {
            C17542s.j(yVar, "<this>");
            C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), "profile/account/upgrade");
            bVar.k(P.b(UpgradeActivity.class));
            bVar.d("ikea://navigation/profile/account/upgrade");
            yVar.k(bVar);
        }

        public static final void y(y yVar) {
            C17542s.j(yVar, "<this>");
            yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "profile/account/upgradeForm", P.b(UpgradeFragment.class)));
        }
    }
