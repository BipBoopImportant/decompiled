package com.sugarcube.app.base.ui;

import OE.C13313e;
import OE.q;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.network.NetworkClient;

public final class a {
    public static void a(BaseFragment baseFragment, VideoAssetRepository videoAssetRepository) {
        baseFragment.f123240F = videoAssetRepository;
    }

    public static void b(BaseFragment baseFragment, C13313e eVar) {
        baseFragment.f123239E = eVar;
    }

    public static void c(BaseFragment baseFragment, NetworkClient networkClient) {
        baseFragment.f123241G = networkClient;
    }

    public static void d(BaseFragment baseFragment, q qVar) {
        baseFragment.f123238D = qVar;
    }
}
