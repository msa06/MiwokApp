package com.example.msa.mowakapp;

public class Word {
    String defaultTranslation;
    String miwokTranslation;
    int imamgeResourceId=0;
    int audioResourceId=0;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imamgeResourceId,int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imamgeResourceId = imamgeResourceId;
        this.audioResourceId=audioResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImamgeResourceId() {
        return imamgeResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
