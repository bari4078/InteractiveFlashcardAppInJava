package com.example.flashcard.models;

import java.util.List;

public class FlashcardData {
    private List<Subject> subjects;

    public FlashcardData() {
    }

    public FlashcardData(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}