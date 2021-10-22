#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_brijwel_securingapikeyswithndk_MainActivity_getAPIKey(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "dsadasdasDSZczxcCZXzxc");
}
