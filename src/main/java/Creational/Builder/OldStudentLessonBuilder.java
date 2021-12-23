package Creational.Builder;

public class OldStudentLessonBuilder extends LessonBuilder{
    @Override
    public void GetLesson() {
        lesson = new Lesson();
        this.lesson.id = 2;
        this.lesson.name = "Artifical Intelligence";
        this.lesson.pirca = 49.99;
    }

    @Override
    public void ApplyDiscount() {
        this.lesson.discounterPrice = this.lesson.pirca*0.5;
        this.lesson.discountApplied = true;
    }

    @Override
    public void AddLesoneNote() {
        this.lesson.lessonNote =" test note ";
    }

    @Override
    public Lesson GetResult() {
        return this.lesson;
    }
}
