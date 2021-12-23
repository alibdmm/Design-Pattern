package Creational.Builder;

public class LessonDirector {
    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder){
        this.lessonBuilder = lessonBuilder;
    }

    public void Make(){
        this.lessonBuilder.GetLesson();
        this.lessonBuilder.ApplyDiscount();
        this.lessonBuilder.AddLesoneNote();
    }
}
