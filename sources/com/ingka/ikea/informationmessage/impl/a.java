package com.ingka.ikea.informationmessage.impl;

import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.informationmessage.InformationMessageNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import rw.g;
import x4.C8951o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/informationmessage/impl/a;", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "tag", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "content", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;)V", "Lx4/o;", "navController", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$b;", "a", "(Lx4/o;Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$b;)V", "informationmessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements InformationMessageNavigation {
    public void a(C8951o oVar, InformationMessageNavigation.Data.b bVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(bVar, "content");
        Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/informationMessage/dialog?title={title}&message={message}&buttonText={buttonText}")).buildUpon().appendQueryParameter("title", bVar.c()).appendQueryParameter("message", bVar.a());
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = g.a(appendQueryParameter, "buttonText", bVar.b()).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.d().a());
    }

    public void b(FragmentManager fragmentManager, String str, InformationMessageNavigation.Data.a aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(str, "tag");
        C17542s.j(aVar, "content");
        InformationBottomSheetFragment.f96148S.a(aVar).show(fragmentManager, str);
    }
}
