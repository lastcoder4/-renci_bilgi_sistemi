public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher courseTeacher;
    public Course(String name,String code, String prefix)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    public void addTeacher(Teacher t)
    {
        if(this.prefix.equals(t.branch))
        {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı ");
        }else
        {
            System.out.println(t.name + "Akademiyeni bu dersi vermez : ");
        }
    }
    public void printTeacher()
    {
        if(courseTeacher != null)
        {
            System.out.println(this.name + "dersin akademisyeni" + courseTeacher.name);
        }else {
            System.out.println(this.name + "dersin akademisyeni atanmamıştır: ");
        }
    }
}
