package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.ImageDetail;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.model.response.Image;
import com.oppwa.mobile.connect.provider.model.response.ImageType;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ImagesResponseParser extends AbstractResponseParser<ImagesRequest, Map<String, List<Image>>> {
    /* access modifiers changed from: private */
    public boolean b(Map.Entry<String, ImageDetail> entry) {
        return ((Boolean) Optional.ofNullable(entry.getValue()).map(new h0()).map(new i0()).orElse(Boolean.FALSE)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public ImagesRequest a(Map<String, List<Image>> map) {
        return new ImagesRequest((Map<String, ImageDetail>) (Map) ((Map) map.entrySet().stream().collect(Collectors.toMap(new j0(), new k0(this)))).entrySet().stream().filter(new Y(this)).collect(Collectors.toMap(new j0(), new Z())));
    }

    /* access modifiers changed from: private */
    public boolean b(Image image) {
        return ((ImageType) Optional.ofNullable(image).map(new e0()).orElse((Object) null)) == ImageType.PNG;
    }

    /* access modifiers changed from: private */
    public ImageDetail a(Map.Entry<String, List<Image>> entry) {
        ImageDetail imageDetail = new ImageDetail();
        Optional.ofNullable(entry.getValue()).map(new f0(this)).ifPresent(new g0(imageDetail));
        return imageDetail;
    }

    /* access modifiers changed from: private */
    public String a(List<Image> list) {
        return (String) list.stream().filter(new X(this)).max(Comparator.comparing(new c0(this))).map(new d0()).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public int a(Image image) {
        return ((Integer) Optional.ofNullable(image).map(new a0()).map(new b0()).orElse(0)).intValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
