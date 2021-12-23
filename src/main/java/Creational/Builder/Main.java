package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        LessonBuilder lessonBuilder = new NewStudentLessoneBuilder();

        LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
        lessonDirector.Make();

        Lesson lesson = lessonBuilder.GetResult();

        System.out.println(lesson.name);
    }

}
/**
 * buradaki amaç burada oluşturdugumuz nesnenin componentlerini başka bir class da doldurduk
 * yani lesson builder nesnesinin iç componentleri lesondirectory clasında dolduruldu
 * yani builder yapısı da bir create işlemi uyguluyor
 */