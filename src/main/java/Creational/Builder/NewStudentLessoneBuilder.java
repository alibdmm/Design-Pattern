package Creational.Builder;

public class NewStudentLessoneBuilder extends LessonBuilder{
    @Override
    public void GetLesson() {
        this.lesson = new Lesson();
        this.lesson.id = 1;
        this.lesson.name = "Java inheritence- java design pattern";
        this.lesson.pirca = 49.99;
    }

    @Override
    public void ApplyDiscount() {
        this.lesson.discounterPrice = this.lesson.pirca*0.5;
        this.lesson.discountApplied = true;
    }

    @Override
    public void AddLesoneNote() {
        this.lesson.lessonNote =" this is important part for programing, you have to hard work this ";
    }

    @Override
    public Lesson GetResult() {
        return this.lesson;
    }
}
