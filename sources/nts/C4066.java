package nts;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: nts.ᶕ  reason: contains not printable characters */
public abstract class C4066<OUT_T, IN_T> implements Collection<OUT_T> {

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean f3339;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Collection f3340;

    /* renamed from: nts.ᶕ$ഇ  reason: contains not printable characters */
    public class C4067 extends C3849<OUT_T, IN_T> {
        public C4067(Iterator it, boolean z10) {
            super(it, z10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public OUT_T m3197(IN_T in_t) {
            return C4066.this.m3196(in_t);
        }
    }

    public C4066(Collection collection, boolean z10) {
        this.f3340 = collection;
        this.f3339 = z10;
    }

    public boolean add(OUT_T out_t) {
        if (!this.f3339) {
            return this.f3340.add(m3194(out_t));
        }
        throw new UnsupportedOperationException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 0, 40, 35));
    }

    public boolean addAll(Collection<? extends OUT_T> collection) {
        throw new RuntimeException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 40, 30, 66));
    }

    public void clear() {
        if (!this.f3339) {
            this.f3340.clear();
            return;
        }
        throw new UnsupportedOperationException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 70, 40, 43));
    }

    public boolean contains(Object obj) {
        return this.f3340.contains(m3194(obj));
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f3340.isEmpty();
    }

    public Iterator<OUT_T> iterator() {
        return new C4067(this.f3340.iterator(), this.f3339);
    }

    public boolean remove(Object obj) {
        if (!this.f3339) {
            return this.f3340.remove(m3194(obj));
        }
        throw new UnsupportedOperationException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 110, 40, 36));
    }

    public boolean removeAll(Collection collection) {
        if (!this.f3339) {
            boolean z10 = false;
            for (Object remove : collection) {
                if (remove(remove)) {
                    z10 = true;
                }
            }
            return z10;
        }
        throw new UnsupportedOperationException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 150, 40, 34));
    }

    public boolean retainAll(Collection collection) {
        if (!this.f3339) {
            Iterator it = iterator();
            boolean z10 = false;
            while (true) {
                C3849 r22 = (C3849) it;
                if (!r22.f1629.hasNext()) {
                    return z10;
                }
                Object next = r22.next();
                if (!collection.contains(next) && remove(next)) {
                    z10 = true;
                }
            }
        } else {
            throw new UnsupportedOperationException(C3727.m1052("Dzlznzdcm\"qrhnlfrn||%>qu`f1yd6gqJN\u0004GABT\u00025\u0011\u00126\u001c\u001dR\u001a\u000f]\u0010\u0010\fY\u0003\u001e\u0010E\u000f\n\u0010\r\u0007\u000e\t\u0003\u001a\n\fG\n4\"4 4*-#l?<& \"(< 22kp?;.(7*x)?\u0004\u0000J\t\u000f\f\u001aL-\u0013\u0005\u0013\u0007\u0013\r\n\u0004K\u0018\u001b\u0001\u0007\u0005\u000f\u001b\u0007\u0015\u0015LW\u0018\u001c\t\u000fX\u0010\r_\u000e\u0018#'m.(+=kÓíûíùíóôúµæåÿùûñåùëë²©æâ÷ñ¦îó¡ðæÝÙÐÖÕÃ¯ÉÎÕÚÝ¡¥ï¬ª©¿é", 190, 40, 118));
        }
    }

    public int size() {
        return this.f3340.size();
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public final OUT_T m3193(IN_T in_t) {
        if (in_t == null) {
            return null;
        }
        return m3196(in_t);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final IN_T m3194(OUT_T out_t) {
        if (out_t == null) {
            return null;
        }
        return m3195(out_t);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public abstract IN_T m3195(OUT_T out_t);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract OUT_T m3196(IN_T in_t);

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < size()) {
            tArr = new Object[size()];
        }
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            C3849 r22 = (C3849) it;
            if (!r22.f1629.hasNext()) {
                break;
            }
            tArr[i10] = r22.next();
            i10++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
