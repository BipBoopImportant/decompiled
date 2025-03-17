package cL;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import dL.C17175a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import mI.C17603a;
import nI.C17631a;
import pL.C17770a;
import qL.C17844a;
import sL.C17952a;
import uI.C18055d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/f0;", "T", "LuI/d;", "vmClass", "Landroidx/lifecycle/j0;", "viewModelStore", "", "key", "Ll3/a;", "extras", "LqL/a;", "qualifier", "LsL/a;", "scope", "Lkotlin/Function0;", "LpL/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "b", "(LuI/d;Landroidx/lifecycle/j0;Ljava/lang/String;Ll3/a;LqL/a;LsL/a;LnI/a;)Landroidx/lifecycle/f0;", "a", "(LqL/a;LsL/a;Ljava/lang/String;)Ljava/lang/String;", "koin-android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cL.a  reason: case insensitive filesystem */
public final class C17079a {
    public static final String a(C17844a aVar, C17952a aVar2, String str) {
        String str2;
        C17542s.j(aVar2, "scope");
        if (aVar == null && str == null && aVar2.f()) {
            return null;
        }
        String str3 = "";
        if (aVar == null || (str2 = aVar.getValue()) == null) {
            str2 = str3;
        }
        if (str == null) {
            str = str3;
        }
        if (!aVar2.f()) {
            str3 = aVar2.c();
        }
        return str2 + str + str3;
    }

    public static final <T extends f0> T b(C18055d<T> dVar, j0 j0Var, String str, a aVar, C17844a aVar2, C17952a aVar3, C17631a<? extends C17770a> aVar4) {
        C17542s.j(dVar, "vmClass");
        C17542s.j(j0Var, "viewModelStore");
        C17542s.j(aVar, "extras");
        C17542s.j(aVar3, "scope");
        Class<T> b10 = C17603a.b(dVar);
        i0 i0Var = new i0(j0Var, new C17175a(dVar, aVar3, aVar2, aVar4), aVar);
        String a10 = a(aVar2, aVar3, str);
        return a10 != null ? i0Var.b(a10, b10) : i0Var.a(b10);
    }
}
