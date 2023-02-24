package io.xk8s.csi.secretsstore.secretproviderclasses.models;

import io.kubernetes.client.util.ModelMapper;

public final class Registration {

    static {
        registerModels();
    }

    public static void registerModels() {
        ModelMapper.addModelMap("secrets-store.csi.x-k8s.io", "v1", "SecretProviderClass", "secretproviderclasses", V1SecretProviderClass.class, V1SecretProviderClassList.class);
        ModelMapper.addModelMap("secrets-store.csi.x-k8s.io", "v1alpha1", "SecretProviderClass", "secretproviderclasses", V1alpha1SecretProviderClass.class, V1alpha1SecretProviderClassList.class);
    }

    private Registration() {
    }
}
