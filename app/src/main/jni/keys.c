#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_brijwel_securingapikeyswithndk_ApiKeys_getAPIKey(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "dsadasdasDSZczxcCZXzxc");
}

JNIEXPORT jstring JNICALL
Java_com_brijwel_securingapikeyswithndk_ApiKeys_getAPIKeyByType(
        JNIEnv *env,
        jobject instance,
        jint type
) {
    switch (type) {
        case 1 :
            return (*env)->NewStringUTF(env, "authKey:clkzbckb");
        case 2 :
            return (*env)->NewStringUTF(env, "chatKey:clkzbckb");
        default :
            return (*env)->NewStringUTF(env, "baseKey:sdlknflds");
    }

}