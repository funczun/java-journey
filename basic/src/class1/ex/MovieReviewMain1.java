package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println(inception.title + ": " + inception.review);
        System.out.println(aboutTime.title + ": " + aboutTime.review);
    }
}
