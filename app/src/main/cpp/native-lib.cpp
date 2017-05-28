#include <jni.h>
#include <string>
#include <iostream>
using namespace std;
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_shouchengyen_ndktest_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject,
        jstring s) {
    const char *nativeString = env->GetStringUTFChars(s,JNI_FALSE);
    string text2 = nativeString;
    string finaltext = "記得要到"+text2+"填教學問卷調查哦";

    return env->NewStringUTF(finaltext.c_str());
}
