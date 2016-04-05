#include <jni.h>

extern "C" {  
    JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getAddition(JNIEnv* env, jobject thiz,jint first,jint second);  
    JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getSubtraction(JNIEnv* env, jobject thiz,jint first,jint second);  
    JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getMultiplication(JNIEnv* env, jobject thiz,jint first,jint second);  
    JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getDivision(JNIEnv* env, jobject thiz,jint first,jint second);  
}; 


JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getAddition(JNIEnv* env, jobject thiz,jint first,jint second)
{
    jint answer;
    answer = first + second;
    return answer;
}

JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getSubtraction(JNIEnv* env, jobject thiz,jint first,jint second) 
{
    jint answer;
    answer = first - second;
    return answer;
}

JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getMultiplication(JNIEnv* env, jobject thiz,jint first,jint second) 
{
    jint answer;
    answer = first * second;
    return answer;
}
JNIEXPORT jint JNICALL Java_com_example_omi_ndkcalculatordemo_MainActivity_getDivision(JNIEnv* env, jobject thiz,jint first,jint second) 
{
    jint answer;
    answer = (first / second);
    return answer;
}