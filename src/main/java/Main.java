public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ольга";
        post.passport = "1234 № 12345678";
        post.patronymic = "Сергеевна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Минчукова";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 10;
        post.birthday.year = 1986;
    }
}
