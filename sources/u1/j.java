package u1;

import YH.C16870n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lu1/j;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Lu1/h;", "Lkotlin/collections/ArrayList;", "nodes", "a", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private float[] f29944a = new float[64];

    public static /* synthetic */ ArrayList b(j jVar, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return jVar.a(str, arrayList);
    }

    public final ArrayList<C6010h> a(String str, ArrayList<C6010h> arrayList) {
        int i10;
        char charAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && C17542s.l(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && C17542s.l(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                charAt = str.charAt(i12);
                char c10 = charAt | ' ';
                if ((c10 - 'a') * (c10 - 'z') <= 0 && c10 != 'e') {
                    break;
                } else if (i10 >= length) {
                    charAt = 0;
                    break;
                } else {
                    i12 = i10;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 'z') {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || C17542s.l(str.charAt(i10), 32) > 0) {
                            long a10 = C6004b.a(str, i10, length);
                            i11 = (int) (a10 >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (a10 & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.f29944a;
                                int i14 = i13 + 1;
                                fArr[i13] = intBitsToFloat;
                                if (i14 >= fArr.length) {
                                    float[] fArr2 = new float[(i14 * 2)];
                                    this.f29944a = fArr2;
                                    C16870n.k(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i14;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(intBitsToFloat)) {
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                i.a(charAt, arrayList, this.f29944a, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }
}
