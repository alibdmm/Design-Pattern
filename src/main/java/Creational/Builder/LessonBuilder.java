package Creational.Builder;

public abstract class LessonBuilder {
    public Lesson lesson;

    public abstract void GetLesson();
    public abstract void ApplyDiscount();
    public abstract void AddLesoneNote();
    public abstract Lesson GetResult();
}
