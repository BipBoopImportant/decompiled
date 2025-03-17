package v5;

import YH.C16877v;
import androidx.work.C7055y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import s5.C8716B;
import s5.C8727i;
import s5.C8728j;
import s5.C8733o;
import s5.C8739u;
import s5.z;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ls5/o;", "workNameDao", "Ls5/B;", "workTagDao", "Ls5/j;", "systemIdInfoDao", "", "Ls5/u;", "workSpecs", "", "d", "(Ls5/o;Ls5/B;Ls5/j;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Ls5/u;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v5.a  reason: case insensitive filesystem */
public final class C8890a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f56902a;

    static {
        String i10 = C7055y.i("DiagnosticsWrkr");
        C17542s.i(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f56902a = i10;
    }

    private static final String c(C8739u uVar, String str, Integer num, String str2) {
        return 10 + uVar.f55910a + "\t " + uVar.f55912c + "\t " + num + "\t " + uVar.f55911b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* access modifiers changed from: private */
    public static final String d(C8733o oVar, C8716B b10, C8728j jVar, List<C8739u> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        for (C8739u uVar : list) {
            C8727i a10 = jVar.a(z.a(uVar));
            sb2.append(c(uVar, C16877v.G0(oVar.b(uVar.f55910a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), a10 != null ? Integer.valueOf(a10.f55883c) : null, C16877v.G0(b10.a(uVar.f55910a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)));
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
