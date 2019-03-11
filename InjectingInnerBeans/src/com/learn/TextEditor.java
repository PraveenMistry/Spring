package com.learn;

/**
 * Created by Praveen on 11/03/19.
 */

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
